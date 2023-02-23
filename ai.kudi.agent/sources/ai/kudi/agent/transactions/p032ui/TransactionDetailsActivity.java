package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.banks.useCases.FetchBanks;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.domain.room_entities.CategoryData;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.util.printer.Printer;
import ai.kudi.agent.databinding.ActivityTransactionDetailsBinding;
import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.issues.p008ui.IssueTypeFragment;
import ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModelKt;
import ai.kudi.agent.issues.viewmodels.model.IssueLabels;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.data.model.NotificationModelKt;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import ai.kudi.agent.transactionhistory.mapper.TransactionTypeMapper;
import ai.kudi.agent.transactions.domain.dto.TerminalConnectionResponse;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.bottomsheet.TransactionDetailOptionsBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.p032ui.widget.TransactionPdfReceiptView;
import ai.kudi.agent.transactions.presenters.TransactionDetailsPresenter;
import ai.kudi.agent.transactions.views.TransactionDetailsView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.print.PrintAttributes;
import android.print.pdf.PrintedPdfDocument;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.DialogC0964i;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.Priority;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.remoteconfig.Frame;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p491i0.C11841h;
import kotlin.p549l0.C13276s;
import p201g.p227h.p238l.C7759x;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: TransactionDetailsActivity.kt */
@Metadata(m10422d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ¯\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002:\u0002¯\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010g\u001a\u00020h2\u0006\u0010X\u001a\u00020iH\u0002J\u0018\u0010j\u001a\u00020\n2\u0006\u0010k\u001a\u00020i2\u0006\u0010l\u001a\u00020iH\u0002J\b\u0010m\u001a\u00020\u0003H\u0016J\u0010\u0010n\u001a\u00020h2\u0006\u0010o\u001a\u00020pH\u0016J\b\u0010q\u001a\u00020hH\u0002J \u0010r\u001a\u00020h2\u0016\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0Zj\u0002`[H\u0002J\b\u0010s\u001a\u00020hH\u0016J\b\u0010t\u001a\u00020hH\u0016J2\u0010u\u001a\u00020h2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020x0w2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0w2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020x0wH\u0002J\b\u0010{\u001a\u00020hH\u0002J\b\u0010|\u001a\u00020hH\u0002J\u0010\u0010}\u001a\u00020h2\u0006\u0010~\u001a\u00020\u007fH\u0016J\u0015\u0010\u0080\u0001\u001a\u00020h2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0014J\u0013\u0010\u0083\u0001\u001a\u00020I2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\t\u0010\u0084\u0001\u001a\u00020hH\u0014J\u0013\u0010\u0085\u0001\u001a\u00020I2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0016J)\u0010\u0088\u0001\u001a\u00020h2\u0016\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0Zj\u0002`[2\u0006\u0010\\\u001a\u00020\nH\u0002J4\u0010\u0089\u0001\u001a\u00020h2\u0007\u0010\u008a\u0001\u001a\u00020i2\u0010\u0010\u008b\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\n0\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016¢\u0006\u0003\u0010\u008f\u0001J\t\u0010\u0090\u0001\u001a\u00020hH\u0016J+\u0010\u0091\u0001\u001a\u00020h2\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0016\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0Zj\u0002`[H\u0016J\t\u0010\u0094\u0001\u001a\u00020hH\u0002J\t\u0010\u0095\u0001\u001a\u00020hH\u0002J&\u0010\u0096\u0001\u001a\u00020h2\u0007\u0010\u0097\u0001\u001a\u00020\n2\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0002J!\u0010\u009b\u0001\u001a\u00020h2\u0016\u0010\u009c\u0001\u001a\u0011\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u009d\u0001H\u0002J!\u0010\u009e\u0001\u001a\u00020h2\u0016\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0Zj\u0002`[H\u0002J\t\u0010\u009f\u0001\u001a\u00020hH\u0002J\u0013\u0010 \u0001\u001a\u00020h2\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0002J\t\u0010£\u0001\u001a\u00020hH\u0016J\u0012\u0010¤\u0001\u001a\u00020h2\u0007\u0010¥\u0001\u001a\u00020\nH\u0016J\t\u0010¦\u0001\u001a\u00020hH\u0016J\t\u0010§\u0001\u001a\u00020hH\u0016J\t\u0010¨\u0001\u001a\u00020hH\u0002J\t\u0010©\u0001\u001a\u00020hH\u0002J\t\u0010ª\u0001\u001a\u00020hH\u0016J\u0012\u0010«\u0001\u001a\u00020h2\u0007\u0010¬\u0001\u001a\u00020IH\u0016J)\u0010\u00ad\u0001\u001a\u00020h2\u0016\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0Zj\u0002`[2\u0006\u0010o\u001a\u00020pH\u0016J\u0012\u0010®\u0001\u001a\u00020h2\u0007\u0010¬\u0001\u001a\u00020IH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020'X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0010\u0010D\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020'X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\u000e\u0010H\u001a\u00020IX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u00020KX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0010\u0010V\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010W\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010Zj\u0004\u0018\u0001`[X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\\\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010]\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\f\"\u0004\b_\u0010\u000eR\u0010\u0010`\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010a\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006°\u0001"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/TransactionDetailsActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/transactions/views/TransactionDetailsView;", "Lai/kudi/agent/transactions/presenters/TransactionDetailsPresenter;", "Lai/kudi/agent/databinding/ActivityTransactionDetailsBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityTransactionDetailsBinding;", "agentAddress", "", "getAgentAddress", "()Ljava/lang/String;", "setAgentAddress", "(Ljava/lang/String;)V", "agentName", "getAgentName", "setAgentName", "agentPhoneNumber", "getAgentPhoneNumber", "setAgentPhoneNumber", TransactionField.AMOUNT, "bankReference", "getBankReference", "setBankReference", "bottomSheet", "Lai/kudi/agent/transactions/ui/bottomsheet/TransactionDetailOptionsBottomSheet;", "businessName", "getBusinessName", "setBusinessName", "disposable", "Lio/reactivex/disposables/Disposable;", "fetchBanks", "Lai/kudi/agent/banks/useCases/FetchBanks;", "getFetchBanks", "()Lai/kudi/agent/banks/useCases/FetchBanks;", "setFetchBanks", "(Lai/kudi/agent/banks/useCases/FetchBanks;)V", "firstContainerAdapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "getFirstContainerAdapter", "()Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "setFirstContainerAdapter", "(Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;)V", "issueContainerAdapter", "maxedPan", "menu", "Landroid/view/Menu;", "getMenu", "()Landroid/view/Menu;", "setMenu", "(Landroid/view/Menu;)V", "outputStream", "Ljava/io/OutputStream;", "pref", "Lai/kudi/agent/core/util/Pref;", "getPref", "()Lai/kudi/agent/core/util/Pref;", "setPref", "(Lai/kudi/agent/core/util/Pref;)V", "printer", "Lai/kudi/agent/core/util/printer/Printer;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "rrn", "secondContainerAdapter", "getSecondContainerAdapter", "setSecondContainerAdapter", "shouldSharePdf", "", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "terminalId", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/presenters/TransactionDetailsPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/presenters/TransactionDetailsPresenter;)V", "ticketId", "ticketResolved", TransactionField.TIME, "transaction", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "transactionDate", "transactionReference", "getTransactionReference", "setTransactionReference", "transactionType", "transactionTypeMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;", "getTransactionTypeMapper", "()Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;", "setTransactionTypeMapper", "(Lai/kudi/agent/transactionhistory/mapper/TransactionTypeMapper;)V", "breakLine", "", "", "calculateSectionSpace", "key", "value", "createPresenter", "currentUserFetched", "user", "Lai/kudi/agent/users/domain/dto/User;", "generatePdfReceipt", "goToPendingFraudCheckForm", "hideAddCustomerButton", "hideLoading", "initAdapter", "data1", "", "Lai/kudi/agent/settings/data/models/TwoColumnItem;", "data2", "data3", "line", "loadTransactionIfReferenceExists", "onChargeBackCategoryFetched", "categoryData", "Lai/kudi/agent/core/domain/room_entities/CategoryData;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrinterClick", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onTerminalConnectionComplete", "response", "Lai/kudi/agent/transactions/domain/dto/TerminalConnectionResponse;", "openSupportScreen", "preparePdfGenerate", "print", AttributeType.TEXT, "size", "", "alignment", "section", "map", "", "setOnClickListeners", "setUpRecyclerView", "shareFile", "file", "Ljava/io/File;", "showAddCustomerButton", "showError", MetricTracker.Object.MESSAGE, "showLoading", "showLogin", "showOptionDialog", "showRefreshMenu", "showTerminalConnectionError", "showTerminalConnectionLoading", "isLoading", "showTransaction", "toggleRaiseChargeBackLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.TransactionDetailsActivity */
/* loaded from: classes.dex */
public final class TransactionDetailsActivity extends MvpActivity<TransactionDetailsView, TransactionDetailsPresenter, ActivityTransactionDetailsBinding> implements TransactionDetailsView {
    public static final Companion Companion;
    public static final int REQUEST_CODE_STORAGE_PERMISSION = 40;
    private String agentAddress;
    private String agentName;
    private String agentPhoneNumber;
    private String amount;
    public String bankReference;
    private TransactionDetailOptionsBottomSheet bottomSheet;
    private String businessName;
    private String conditions;
    private FavoritesArrayAdapter disposable;
    public FetchBanks fetchBanks;
    public TwoColumnTableAdapter firstContainerAdapter;
    private TwoColumnTableAdapter issueContainerAdapter;
    private String maxedPan;
    private Menu menu;
    private OutputStream outputStream;
    public Pref pref;
    private Printer printer;
    public Frame remoteConfig;
    public TwoColumnTableAdapter secondContainerAdapter;
    private boolean shouldSharePdf;
    public TabLayout tabLayout;
    private String terminalId = "";
    public TransactionDetailsPresenter thisPresenter;
    private String ticketId;
    private String ticketResolved;
    private String time;
    private HashMap<String, String> transaction;
    private String transactionDate;
    public String transactionReference;
    private String transactionType;
    public TransactionTypeMapper transactionTypeMapper;

    /* compiled from: TransactionDetailsActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/TransactionDetailsActivity$Companion;", "", "()V", "REQUEST_CODE_STORAGE_PERMISSION", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.TransactionDetailsActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void breakLine(int i) {
        OutputStream $r1 = this.outputStream;
        if ($r1 == null) {
            return;
        }
        for (int $i1 = 0; $i1 < i; $i1++) {
            Printer.Companion $r2 = Printer.Companion;
            $r2.printNewLine($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String calculateSectionSpace(int i, int i2) {
        if (i > 12 || i2 > 18) {
            Printer.Companion $r1 = Printer.Companion;
            String $r2 = $r1.addSpace(3);
            return $r2;
        }
        Printer.Companion $r12 = Printer.Companion;
        int $i0 = 18 - i;
        String $r22 = $r12.addSpace($i0);
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void generatePdfReceipt() {
        float $f3;
        if (this.transaction == null) {
            return;
        }
        InterfaceC8209a $r3 = getBinding();
        ActivityTransactionDetailsBinding $r4 = (ActivityTransactionDetailsBinding) $r3;
        TransactionPdfReceiptView $r5 = $r4.pdfPrintView;
        HashMap $r2 = this.transaction;
        Log_OC.append($r2);
        $r5.bindData($r2);
        PrintAttributes.Builder r17 = new PrintAttributes.Builder();
        PrintAttributes.MediaSize $r7 = PrintAttributes.MediaSize.ISO_A4;
        PrintAttributes.Builder $r6 = r17.setMediaSize($r7);
        Resources $r9 = ((AppCompatActivity) this).getResources();
        float $f0 = $r9.getDimension(C0001R.dimen.pdf_receipt_width);
        int $i0 = (int) $f0;
        AppCompatActivity r24 = (AppCompatActivity) this;
        Resources $r92 = r24.getResources();
        float $f02 = $r92.getDimension(C0001R.dimen.pdf_receipt_height);
        int $i1 = (int) $f02;
        PrintAttributes.Resolution r18 = new PrintAttributes.Resolution("res1", "Resolution", $i0, $i1);
        PrintAttributes.Builder $r62 = $r6.setResolution(r18);
        PrintAttributes.Margins r19 = new PrintAttributes.Margins(5, 5, 5, 5);
        PrintAttributes $r11 = $r62.setMinMargins(r19).build();
        Log_OC.loadImage($r11, "Builder()\n            .setMediaSize(PrintAttributes.MediaSize.ISO_A4)\n            .setResolution(\n                PrintAttributes.Resolution(\n                    \"res1\",\n                    \"Resolution\",\n                    resources.getDimension(R.dimen.pdf_receipt_width).toInt(),\n                    resources.getDimension(R.dimen.pdf_receipt_height).toInt()\n                )\n            ).setMinMargins(PrintAttributes.Margins(5, 5, 5, 5))\n            .build()");
        Context r25 = (Context) this;
        final PrintedPdfDocument r20 = new PrintedPdfDocument(r25, $r11);
        final PdfDocument.Page $r12 = r20.startPage(0);
        Log_OC.loadImage($r12, "document.startPage(0)");
        InterfaceC8209a $r32 = getBinding();
        ActivityTransactionDetailsBinding $r42 = (ActivityTransactionDetailsBinding) $r32;
        TransactionPdfReceiptView $r52 = $r42.pdfPrintView;
        int $i02 = $r52.getWidth();
        InterfaceC8209a $r33 = getBinding();
        ActivityTransactionDetailsBinding $r43 = (ActivityTransactionDetailsBinding) $r33;
        TransactionPdfReceiptView $r53 = $r43.pdfPrintView;
        int $i12 = $r53.getHeight();
        final Rect r21 = new Rect(0, 0, $i02, $i12);
        final Canvas $r14 = $r12.getCanvas();
        Log_OC.loadImage($r14, "page.canvas");
        int $i03 = $r14.getWidth();
        float $f1 = $i03;
        int $i04 = $r14.getHeight();
        float $f2 = $i04;
        int $i05 = r21.width();
        float $f03 = $i05;
        int $i06 = r21.height();
        $f3 = C11841h.m10269c($f1 / $f03, $f2 / $i06);
        float $f4 = $f1 / 2.0f;
        int $i07 = r21.width();
        float $f12 = $f4 - (($i07 * $f3) / 2.0f);
        float $f22 = $f2 / 2.0f;
        int $i08 = r21.height();
        float $f5 = $i08;
        float $f52 = $f22 - (($f5 * $f3) / 2.0f);
        int $i09 = r21.width();
        float $f6 = $i09;
        int $i010 = r21.height();
        float $f04 = ($i010 * $f3) / 2.0f;
        final RectF r22 = new RectF($f12, $f52, $f4 + (($f6 * $f3) / 2.0f), $f22 + $f04);
        InterfaceC8209a $r34 = getBinding();
        ActivityTransactionDetailsBinding $r44 = (ActivityTransactionDetailsBinding) $r34;
        TransactionPdfReceiptView $r54 = $r44.pdfPrintView;
        $r54.post(new Runnable() { // from class: ai.kudi.agent.transactions.ui.SelectorManager$SelectSet$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                TransactionDetailsActivity $r1 = TransactionDetailsActivity.this;
                Canvas $r22 = $r14;
                Rect $r35 = r21;
                RectF $r45 = r22;
                PrintedPdfDocument $r55 = r20;
                PdfDocument.Page $r63 = $r12;
                TransactionDetailsActivity.m41242generatePdfReceipt$lambda19($r1, $r22, $r35, $r45, $r55, $r63);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: generatePdfReceipt$lambda-19  reason: not valid java name */
    public static final void m41242generatePdfReceipt$lambda19(TransactionDetailsActivity transactionDetailsActivity, Canvas canvas, Rect rect, RectF rectF, PrintedPdfDocument printedPdfDocument, PdfDocument.Page page) {
        String $r12;
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        Log_OC.getArray(canvas, "$pageCanvas");
        Log_OC.getArray(rect, "$src");
        Log_OC.getArray(rectF, "$dst");
        Log_OC.getArray(printedPdfDocument, "$document");
        Log_OC.getArray(page, "$page");
        InterfaceC8209a $r6 = transactionDetailsActivity.getBinding();
        ActivityTransactionDetailsBinding $r7 = (ActivityTransactionDetailsBinding) $r6;
        TransactionPdfReceiptView $r8 = $r7.pdfPrintView;
        int $i0 = $r8.getWidth();
        InterfaceC8209a $r62 = transactionDetailsActivity.getBinding();
        ActivityTransactionDetailsBinding $r72 = (ActivityTransactionDetailsBinding) $r62;
        TransactionPdfReceiptView $r82 = $r72.pdfPrintView;
        int $i1 = $r82.getHeight();
        Bitmap.Config $r9 = Bitmap.Config.ARGB_8888;
        Bitmap $r10 = Bitmap.createBitmap($i0, $i1, $r9);
        Canvas r22 = new Canvas($r10);
        InterfaceC8209a $r63 = transactionDetailsActivity.getBinding();
        ActivityTransactionDetailsBinding $r73 = (ActivityTransactionDetailsBinding) $r63;
        TransactionPdfReceiptView $r83 = $r73.pdfPrintView;
        int $i02 = $r83.getScrollX();
        float $f0 = $i02;
        float $f02 = -$f0;
        InterfaceC8209a $r64 = transactionDetailsActivity.getBinding();
        ActivityTransactionDetailsBinding $r74 = (ActivityTransactionDetailsBinding) $r64;
        TransactionPdfReceiptView $r84 = $r74.pdfPrintView;
        int $i03 = $r84.getScrollY();
        float $f1 = $i03;
        r22.translate($f02, -$f1);
        InterfaceC8209a $r65 = transactionDetailsActivity.getBinding();
        ActivityTransactionDetailsBinding $r75 = (ActivityTransactionDetailsBinding) $r65;
        TransactionPdfReceiptView $r85 = $r75.pdfPrintView;
        $r85.draw(r22);
        canvas.drawBitmap($r10, rect, rectF, (Paint) null);
        printedPdfDocument.finishPage(page);
        String $r122 = Environment.DIRECTORY_DOCUMENTS;
        File $r13 = Environment.getExternalStoragePublicDirectory($r122);
        String $r123 = $r13.getAbsolutePath();
        File $r17 = new File($r123);
        boolean $z0 = $r17.exists();
        if (!$z0) {
            $r17.mkdirs();
        }
        boolean $z02 = transactionDetailsActivity.shouldSharePdf;
        if ($z02) {
            $r12 = "NombaReceipt.pdf";
        } else {
            Date r23 = new Date();
            TimeZone $r15 = TimeZone.getDefault();
            Log_OC.loadImage($r15, "getDefault()");
            String $r124 = DateExtKt.formatWithStyle(r23, "yyyy_MM_dd-hh_mm", $r15);
            $r12 = "NombaReceipt_" + $r124 + ".pdf";
        }
        File r25 = new File($r17, $r12);
        try {
            try {
                FileOutputStream r26 = new FileOutputStream(r25);
                printedPdfDocument.writeTo(r26);
                r26.flush();
                r26.close();
                boolean $z03 = transactionDetailsActivity.shouldSharePdf;
                if ($z03) {
                    transactionDetailsActivity.shareFile(r25);
                    transactionDetailsActivity.shouldSharePdf = false;
                } else {
                    Context r27 = (Context) transactionDetailsActivity;
                    ContextExtKt.toast(r27, (int) C0001R.string.receipt_saved_in_documents, 0);
                }
            } catch (Exception $r20) {
                $r20.printStackTrace();
            }
            printedPdfDocument.close();
            DialogC0964i $r21 = transactionDetailsActivity.bottomSheet;
            if ($r21 == null) {
                return;
            }
            DialogC0964i r28 = $r21;
            r28.dismiss();
        } catch (Throwable $r19) {
            printedPdfDocument.close();
            throw $r19;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void goToPendingFraudCheckForm(HashMap hashMap) {
        Object $r3 = hashMap.get("reference");
        String $r4 = (String) $r3;
        Object $r32 = hashMap.get(TransactionField.CUSTOMER_NAME);
        String $r5 = (String) $r32;
        if ($r5 == null) {
            Object $r33 = hashMap.get(TransactionField.CUSTOMER_NAME);
            $r5 = (String) $r33;
        }
        Object $r34 = hashMap.get(TransactionField.CUSTOMER_PHONE_NUMBER);
        String $r6 = (String) $r34;
        if ($r6 == null) {
            Object $r35 = hashMap.get(TransactionField.CUSTOMER_PHONE_NUMBER);
            $r6 = (String) $r35;
        }
        Object $r36 = hashMap.get(TransactionField.CUSTOMER_PICTURE_ID);
        String $r7 = (String) $r36;
        if ($r7 == null) {
            Object $r37 = hashMap.get(TransactionField.CUSTOMER_PICTURE_ID);
            $r7 = (String) $r37;
        }
        Object $r38 = hashMap.get(TransactionField.AMOUNT);
        String $r8 = (String) $r38;
        Object $r39 = hashMap.get("type");
        String $r9 = (String) $r39;
        Context r11 = (Context) this;
        Intent r10 = new Intent(r11, PendingVerificationActivity.class);
        r10.putExtra(PendingVerificationActivity.EXTRA_TRANS_REF, $r4);
        r10.putExtra("extra_customer_name", $r5);
        r10.putExtra(PendingVerificationActivity.EXTRA_CUSTOMER_PHONE_NUMBER, $r6);
        r10.putExtra(PendingVerificationActivity.EXTRA_CUSTOMER_PICTURE_ID, $r7);
        r10.putExtra("transaction", $r8);
        r10.putExtra("type", $r9);
        Activity r12 = (Activity) this;
        r12.startActivity(r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initAdapter(List list, List list2, List list3) {
        InterfaceC8209a $r4 = getBinding();
        ActivityTransactionDetailsBinding $r5 = (ActivityTransactionDetailsBinding) $r4;
        RecyclerView $r6 = $r5.rvContainer1;
        Log_OC.loadImage($r6, "binding.rvContainer1");
        InterfaceC8209a $r42 = getBinding();
        ActivityTransactionDetailsBinding $r52 = (ActivityTransactionDetailsBinding) $r42;
        RecyclerView $r7 = $r52.rvContainer2;
        Log_OC.loadImage($r7, "binding.rvContainer2");
        InterfaceC8209a $r43 = getBinding();
        ActivityTransactionDetailsBinding $r53 = (ActivityTransactionDetailsBinding) $r43;
        RecyclerView $r8 = $r53.rvContainer3;
        Log_OC.loadImage($r8, "binding.rvContainer3");
        TwoColumnTableAdapter $r9 = getFirstContainerAdapter();
        $r6.setAdapter($r9);
        TwoColumnTableAdapter $r92 = getSecondContainerAdapter();
        $r7.setAdapter($r92);
        TwoColumnTableAdapter $r93 = this.issueContainerAdapter;
        if ($r93 == null) {
            Log_OC.LogError("issueContainerAdapter");
            NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
            throw r10;
        }
        $r8.setAdapter($r93);
        RecyclerView r11 = $r6;
        C7759x.m17564B0(r11, false);
        RecyclerView r112 = $r7;
        C7759x.m17564B0(r112, false);
        RecyclerView r113 = $r8;
        C7759x.m17564B0(r113, false);
        TwoColumnTableAdapter $r94 = getFirstContainerAdapter();
        $r94.setData(list);
        TwoColumnTableAdapter $r95 = getSecondContainerAdapter();
        $r95.setData(list2);
        TwoColumnTableAdapter $r96 = this.issueContainerAdapter;
        if ($r96 != null) {
            $r96.setData(list3);
            return;
        }
        Log_OC.LogError("issueContainerAdapter");
        NullPointerException r102 = new NullPointerException("Null throw statement replaced by Soot");
        throw r102;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void line() {
        print("..........................................", 0, 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadTransactionIfReferenceExists() {
        Activity r12 = (Activity) this;
        Intent $r1 = r12.getIntent();
        boolean $z0 = $r1.hasExtra("transaction_details_extra_reference");
        if ($z0) {
            Activity r122 = (Activity) this;
            Intent $r12 = r122.getIntent();
            String $r2 = $r12.getStringExtra("transaction_details_extra_reference");
            String $r3 = $r2;
            if ($r2 == null) {
                $r3 = "";
            }
            setTransactionReference($r3);
            P presenter = getPresenter();
            Log_OC.loadImage(presenter, "getPresenter()");
            TransactionDetailsPresenter $r5 = (TransactionDetailsPresenter) presenter;
            String $r22 = getTransactionReference();
            TransactionDetailsPresenter.loadTransaction$default($r5, $r22, false, 2, null);
            return;
        }
        Activity r123 = (Activity) this;
        Intent $r13 = r123.getIntent();
        boolean $z02 = $r13.hasExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
        if (!$z02) {
            Activity r124 = (Activity) this;
            r124.finish();
            return;
        }
        Activity r125 = (Activity) this;
        Intent $r14 = r125.getIntent();
        Serializable $r6 = $r14.getSerializableExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
        if ($r6 == null) {
            NullPointerException r11 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.notification.data.model.NotificationModel");
            throw r11;
        }
        NotificationModel $r7 = (NotificationModel) $r6;
        String $r23 = $r7.getReference();
        setTransactionReference($r23);
        P presenter2 = getPresenter();
        Log_OC.loadImage(presenter2, "getPresenter()");
        TransactionDetailsPresenter $r52 = (TransactionDetailsPresenter) presenter2;
        String $r24 = getTransactionReference();
        TransactionDetailsPresenter.loadTransaction$default($r52, $r24, false, 2, null);
        boolean $z03 = $r7.getMirrorStatus();
        if (!$z03) {
            TransactionDetailsPresenter $r53 = getThisPresenter();
            String $r25 = $r7.getId();
            TransactionDetailsActivity$loadTransactionIfReferenceExists$1 $r8 = TransactionDetailsActivity$loadTransactionIfReferenceExists$1.INSTANCE;
            $r53.updateNotificationStatus($r25, $r8);
        }
        Pref $r9 = getPref();
        int $i0 = $r9.getIncompleteTransactionCount();
        $r9.setIncompleteTransactionCount($i0 - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1$lambda-0  reason: not valid java name */
    public static final void m41243onCreate$lambda1$lambda0(TransactionDetailsActivity transactionDetailsActivity, SwipeRefreshLayout swipeRefreshLayout) {
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        Log_OC.getArray(swipeRefreshLayout, "$this_apply");
        transactionDetailsActivity.loadTransactionIfReferenceExists();
        swipeRefreshLayout.setRefreshing(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onPrinterClick(HashMap hashMap, String str) {
        TransactionDetailsPresenter $r3 = getThisPresenter();
        $r3.logPrinterTransactionEvent(hashMap);
        Object $r4 = hashMap.get(TransactionField.AMOUNT);
        Log_OC.append($r4);
        Log_OC.loadImage($r4, "transaction[\"amount\"]!!");
        String $r5 = (String) $r4;
        double $d0 = Double.parseDouble($r5);
        Locale $r6 = Locale.US;
        NumberFormat $r7 = NumberFormat.getNumberInstance($r6);
        String $r52 = $r7.format($d0);
        TransactionDetailsActivity$onPrinterClick$1 r10 = new TransactionDetailsActivity$onPrinterClick$1(this, Log_OC.m10359a("N ", (Object) $r52), hashMap, str);
        AppCompatActivity r12 = (AppCompatActivity) this;
        Printer r11 = new Printer(r12, r10);
        this.printer = r11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void openSupportScreen() {
        String $r1 = this.amount;
        if ($r1 == null) {
            return;
        }
        Intent r11 = new Intent((Context) this, IssueActivity.class);
        String $r4 = this.transactionType;
        String $r5 = this.time;
        String $r2 = getTransactionReference();
        String $r6 = this.conditions;
        if ($r6 == null) {
            $r6 = "";
        }
        String $r7 = this.ticketResolved;
        if ($r7 == null) {
            $r7 = "true";
        }
        String $r8 = this.ticketId;
        String $r9 = this.maxedPan;
        IssueTypeModel r12 = new IssueTypeModel(IssueDetailsViewModelKt.OTHER_ISSUES_LABEL, IssueDetailsViewModelKt.OTHER_ISSUES_LABEL, $r2, $r1, $r4, "", $r5, $r1, $r6, null, null, null, null, null, null, null, null, $r4, false, null, null, null, null, null, null, null, null, null, null, null, $r9, "", $r7, $r8, null, null, true, 1073610240, 12, null);
        r11.putExtra(IssueActivity.ISSUE_MODEL, r12);
        Activity r14 = (Activity) this;
        r14.startActivity(r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void preparePdfGenerate() {
        Context r2 = (Context) this;
        int $i0 = C1335a.m36327a(r2, "android.permission.WRITE_EXTERNAL_STORAGE");
        if ($i0 == 0) {
            generatePdfReceipt();
            return;
        }
        String[] $r1 = {"android.permission.WRITE_EXTERNAL_STORAGE"};
        Activity r3 = (Activity) this;
        C1291a.m36466q(r3, $r1, 40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void print(String str, Number number, Number number2) {
        OutputStream $r4 = this.outputStream;
        if ($r4 == null) {
            return;
        }
        Printer.Companion $r5 = Printer.Companion;
        $r5.printCustom(str, number, number2, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void section(java.util.Map r20) {
        /*
            r19 = this;
            r0 = r20
            java.util.Set r3 = r0.entrySet()
            java.util.Iterator r4 = r3.iterator()
        La:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r6 = r4.next()
            r8 = r6
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r7 = r8
            java.lang.Object r6 = r7.getKey()
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            r9 = r10
            java.lang.Object r6 = r7.getValue()
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r11 = r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r14 = 58
            r13.append(r14)
            int r15 = r9.length()
            if (r11 != 0) goto L3e
            r16 = 0
            goto L42
        L3e:
            int r16 = r11.length()
        L42:
            r0 = r19
            r1 = r16
            java.lang.String r9 = r0.calculateSectionSpace(r15, r1)
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            r14 = 0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)
            r14 = 0
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
            r0 = r19
            r1 = r17
            r2 = r18
            r0.print(r9, r1, r2)
            if (r11 == 0) goto L67
            goto L69
        L67:
            java.lang.String r11 = ""
        L69:
            r14 = 0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)
            r14 = 2
            java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
            r0 = r19
            r1 = r17
            r2 = r18
            r0.print(r11, r1, r2)
            r14 = 1
            r0 = r19
            r0.breakLine(r14)
            goto La
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity.section(java.util.Map):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setOnClickListeners(final HashMap hashMap) {
        boolean $z0;
        InterfaceC8209a $r2 = getBinding();
        ActivityTransactionDetailsBinding $r3 = (ActivityTransactionDetailsBinding) $r2;
        ImageButton $r4 = $r3.btnAddCustomer;
        ImageButton r16 = $r4;
        r16.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.FilenameDialog$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionDetailsActivity $r22 = TransactionDetailsActivity.this;
                HashMap $r32 = hashMap;
                TransactionDetailsActivity.m41244setOnClickListeners$lambda3($r22, $r32, view);
            }
        });
        InterfaceC8209a $r22 = getBinding();
        ActivityTransactionDetailsBinding $r32 = (ActivityTransactionDetailsBinding) $r22;
        ImageButton $r42 = $r32.btnSupport;
        ImageButton r162 = $r42;
        r162.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.AudioPlayer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransactionDetailsActivity $r23 = TransactionDetailsActivity.this;
                TransactionDetailsActivity.m41245setOnClickListeners$lambda4($r23, view);
            }
        });
        String $r7 = this.transactionType;
        boolean $z02 = Log_OC.append($r7, "Cash Withdrawal");
        if ($z02) {
            InterfaceC8209a $r23 = getBinding();
            ActivityTransactionDetailsBinding $r33 = (ActivityTransactionDetailsBinding) $r23;
            TextView $r8 = $r33.raiseChargeBackButton;
            Log_OC.loadImage($r8, "binding.raiseChargeBackButton");
            ViewExtKt.show($r8);
            InterfaceC8209a $r24 = getBinding();
            ActivityTransactionDetailsBinding $r34 = (ActivityTransactionDetailsBinding) $r24;
            $r34.raiseChargeBackButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.EulaActivity$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransactionDetailsActivity $r25 = TransactionDetailsActivity.this;
                    TransactionDetailsActivity.m41246setOnClickListeners$lambda5($r25, view);
                }
            });
        }
        String $r72 = this.terminalId;
        $z0 = C13276s.m5440u($r72);
        if (!$z0) {
            InterfaceC8209a $r25 = getBinding();
            ActivityTransactionDetailsBinding $r35 = (ActivityTransactionDetailsBinding) $r25;
            ViewGroup $r10 = $r35.sendToTerminalButton;
            Log_OC.loadImage($r10, "");
            ViewGroup r17 = $r10;
            ViewExtKt.show(r17);
            ViewGroup r18 = $r10;
            r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.SettingsActivity
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransactionDetailsActivity $r26 = TransactionDetailsActivity.this;
                    HashMap $r36 = hashMap;
                    TransactionDetailsActivity.m41247setOnClickListeners$lambda7$lambda6($r26, $r36, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setOnClickListeners$lambda-3  reason: not valid java name */
    public static final void m41244setOnClickListeners$lambda3(TransactionDetailsActivity transactionDetailsActivity, HashMap hashMap, View view) {
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        Log_OC.getArray(hashMap, "$transaction");
        Context r6 = (Context) transactionDetailsActivity;
        Intent r5 = new Intent(r6, TransactionDetailsActionActivity.class);
        r5.putExtra(TransactionDetailsActionActivity.EXTRA_ACTION_MODE, TransactionDetailsActionActivity.ACTION_MODE_CUSTOMER);
        r5.putExtra(TransactionDetailsActionActivity.EXTRA_TRANSACTION, hashMap);
        C13666w c13666w = C13666w.f30112a;
        Activity r7 = (Activity) transactionDetailsActivity;
        r7.startActivity(r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setOnClickListeners$lambda-4  reason: not valid java name */
    public static final void m41245setOnClickListeners$lambda4(TransactionDetailsActivity transactionDetailsActivity, View view) {
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        transactionDetailsActivity.openSupportScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setOnClickListeners$lambda-5  reason: not valid java name */
    public static final void m41246setOnClickListeners$lambda5(TransactionDetailsActivity transactionDetailsActivity, View view) {
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        InterfaceC9413d $r3 = transactionDetailsActivity.presenter;
        TransactionDetailsPresenter $r4 = (TransactionDetailsPresenter) $r3;
        IssueLabels $r5 = IssueLabels.CHARGE_BACK;
        String $r0 = $r5.getLabel();
        $r4.fetchIssueCategoryByLabel($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setOnClickListeners$lambda-7$lambda-6  reason: not valid java name */
    public static final void m41247setOnClickListeners$lambda7$lambda6(TransactionDetailsActivity transactionDetailsActivity, HashMap hashMap, View view) {
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        Log_OC.getArray(hashMap, "$transaction");
        TransactionDetailsPresenter $r4 = (TransactionDetailsPresenter) transactionDetailsActivity.getPresenter();
        $r4.sendReceiptToTerminal(hashMap);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpRecyclerView() {
        TwoColumnTableAdapter r8 = new TwoColumnTableAdapter();
        setFirstContainerAdapter(r8);
        TwoColumnTableAdapter r82 = new TwoColumnTableAdapter();
        setSecondContainerAdapter(r82);
        TwoColumnTableAdapter r83 = new TwoColumnTableAdapter();
        this.issueContainerAdapter = r83;
        Context r11 = (Context) this;
        C1723k r9 = new C1723k(r11, 1);
        Context r112 = (Context) this;
        Drawable $r3 = C1335a.m36322f(r112, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r3);
        r9.m34703f($r3);
        InterfaceC8209a $r4 = getBinding();
        ActivityTransactionDetailsBinding $r5 = (ActivityTransactionDetailsBinding) $r4;
        RecyclerView $r6 = $r5.rvContainer1;
        Log_OC.loadImage($r6, "binding.rvContainer1");
        $r6.m35294h(r9);
        Context r113 = (Context) this;
        LinearLayoutManager r10 = new LinearLayoutManager(r113);
        $r6.setLayoutManager(r10);
        RecyclerView r12 = $r6;
        r12.setFocusable(false);
        InterfaceC8209a $r42 = getBinding();
        ActivityTransactionDetailsBinding $r52 = (ActivityTransactionDetailsBinding) $r42;
        RecyclerView $r62 = $r52.rvContainer2;
        Log_OC.loadImage($r62, "binding.rvContainer2");
        $r62.m35294h(r9);
        Context r114 = (Context) this;
        LinearLayoutManager r102 = new LinearLayoutManager(r114);
        $r62.setLayoutManager(r102);
        RecyclerView r122 = $r62;
        r122.setFocusable(false);
        InterfaceC8209a $r43 = getBinding();
        ActivityTransactionDetailsBinding $r53 = (ActivityTransactionDetailsBinding) $r43;
        RecyclerView $r63 = $r53.rvContainer3;
        Log_OC.loadImage($r63, "binding.rvContainer3");
        $r63.m35294h(r9);
        Context r115 = (Context) this;
        LinearLayoutManager r103 = new LinearLayoutManager(r115);
        $r63.setLayoutManager(r103);
        RecyclerView r123 = $r63;
        r123.setFocusable(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void shareFile(File file) {
        Intent r5 = new Intent("android.intent.action.SEND");
        r5.setType("application/pdf");
        Context r6 = (Context) this;
        Uri $r3 = FileProvider.getUriForFile(r6, "ai.kudi.agent.android.fileprovider", file);
        r5.putExtra("android.intent.extra.STREAM", $r3);
        Activity r7 = (Activity) this;
        String $r4 = r7.getString(C0001R.string.share);
        Intent $r1 = Intent.createChooser(r5, $r4);
        Activity r72 = (Activity) this;
        r72.startActivity($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showOptionDialog() {
        Context r5 = (Context) this;
        TransactionDetailOptionsBottomSheet r4 = new TransactionDetailOptionsBottomSheet(r5, new TransactionDetailOptionsBottomSheet.OnShareActionListener() { // from class: ai.kudi.agent.transactions.ui.TransactionDetailsActivity$showOptionDialog$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactions.p032ui.bottomsheet.TransactionDetailOptionsBottomSheet.OnShareActionListener
            public void onDownloadPdf() {
                TransactionDetailsActivity $r1 = TransactionDetailsActivity.this;
                $r1.preparePdfGenerate();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactions.p032ui.bottomsheet.TransactionDetailOptionsBottomSheet.OnShareActionListener
            public void onRaiseComplaints() {
                TransactionDetailsActivity $r2 = TransactionDetailsActivity.this;
                $r2.openSupportScreen();
                TransactionDetailsActivity $r22 = TransactionDetailsActivity.this;
                DialogC0964i $r1 = $r22.bottomSheet;
                if ($r1 == null) {
                    return;
                }
                DialogC0964i r3 = $r1;
                r3.dismiss();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactions.p032ui.bottomsheet.TransactionDetailOptionsBottomSheet.OnShareActionListener
            public void onRefresh() {
                TransactionDetailsActivity $r1 = TransactionDetailsActivity.this;
                TransactionDetailsPresenter $r3 = (TransactionDetailsPresenter) $r1.getPresenter();
                TransactionDetailsActivity $r12 = TransactionDetailsActivity.this;
                String $r4 = $r12.getTransactionReference();
                $r3.loadTransaction($r4, true);
                TransactionDetailsActivity $r13 = TransactionDetailsActivity.this;
                DialogC0964i $r5 = $r13.bottomSheet;
                if ($r5 == null) {
                    return;
                }
                DialogC0964i r6 = $r5;
                r6.dismiss();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactions.p032ui.bottomsheet.TransactionDetailOptionsBottomSheet.OnShareActionListener
            public void onShare() {
                TransactionDetailsActivity $r1 = TransactionDetailsActivity.this;
                $r1.shouldSharePdf = true;
                TransactionDetailsActivity $r12 = TransactionDetailsActivity.this;
                $r12.preparePdfGenerate();
            }
        });
        this.bottomSheet = r4;
        if (r4 == null) {
            return;
        }
        TransactionDetailOptionsBottomSheet r6 = r4;
        r6.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showRefreshMenu() {
        Menu $r2 = this.menu;
        MenuItem $r1 = $r2 == null ? null : $r2.getItem(0);
        if ($r1 == null) {
            return;
        }
        $r1.setVisible(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTransaction$lambda-11  reason: not valid java name */
    public static final void m41248showTransaction$lambda11(TransactionDetailsActivity transactionDetailsActivity, View view) {
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        transactionDetailsActivity.openSupportScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showTransaction$lambda-12  reason: not valid java name */
    public static final void m41249showTransaction$lambda12(List list, TransactionDetailsActivity transactionDetailsActivity, Bank bank) {
        Log_OC.getArray(list, "$data2");
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        String $r4 = bank.getName();
        TwoColumnItem.SimpleItem $r3 = new TwoColumnItem.SimpleItem("Sender's Bank", $r4);
        list.add($r3);
        TwoColumnTableAdapter $r5 = transactionDetailsActivity.getSecondContainerAdapter();
        $r5.setData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showTransaction$lambda-16  reason: not valid java name */
    public static final void m41251showTransaction$lambda16(TransactionDetailsActivity transactionDetailsActivity, HashMap hashMap, View view) {
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        Log_OC.getArray(hashMap, "$transaction");
        String $r3 = transactionDetailsActivity.transactionDate;
        if ($r3 == null) {
            return;
        }
        transactionDetailsActivity.onPrinterClick(hashMap, $r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showTransaction$lambda-17  reason: not valid java name */
    public static final void m41252showTransaction$lambda17(TransactionDetailsActivity transactionDetailsActivity, HashMap hashMap, View view) {
        Log_OC.getArray(transactionDetailsActivity, "this$0");
        Log_OC.getArray(hashMap, "$transaction");
        transactionDetailsActivity.goToPendingFraudCheckForm(hashMap);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public TransactionDetailsPresenter createPresenter() {
        TransactionDetailsPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void currentUserFetched(User user) {
        Log_OC.getArray(user, "user");
        StringBuilder $r2 = new StringBuilder();
        String $r3 = user.getFirstName();
        $r2.append((Object) $r3);
        $r2.append(' ');
        String $r32 = user.getLastName();
        $r2.append((Object) $r32);
        String $r33 = $r2.toString();
        this.agentName = $r33;
        String $r4 = user.getHomeAddress();
        String $r5 = $r4;
        if ($r4 == null) {
            $r5 = "";
        }
        this.agentAddress = $r5;
        String $r42 = user.getPhoneNumber();
        String $r52 = $r42;
        if ($r42 == null) {
            $r52 = "";
        }
        this.agentPhoneNumber = $r52;
        String $r43 = user.getBusinessName();
        String $r53 = $r43;
        if ($r43 == null) {
            $r53 = "";
        }
        this.businessName = $r53;
        String $r44 = user.getTerminalId();
        String $r34 = $r44 != null ? $r44 : "";
        this.terminalId = $r34;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityTransactionDetailsBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityTransactionDetailsBinding $r2 = ActivityTransactionDetailsBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityTransactionDetailsBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentAddress() {
        String r1 = this.agentAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentName() {
        String r1 = this.agentName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentPhoneNumber() {
        String r1 = this.agentPhoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBankReference() {
        String $r1 = this.bankReference;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("bankReference");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBusinessName() {
        String r1 = this.businessName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchBanks getFetchBanks() {
        FetchBanks $r1 = this.fetchBanks;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("fetchBanks");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TwoColumnTableAdapter getFirstContainerAdapter() {
        TwoColumnTableAdapter $r1 = this.firstContainerAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("firstContainerAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Menu getMenu() {
        Menu r1 = this.menu;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Pref getPref() {
        Pref $r1 = this.pref;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("pref");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame getRemoteConfig() {
        Frame $r1 = this.remoteConfig;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("remoteConfig");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TwoColumnTableAdapter getSecondContainerAdapter() {
        TwoColumnTableAdapter $r1 = this.secondContainerAdapter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("secondContainerAdapter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TabLayout getTabLayout() {
        TabLayout $r1 = this.tabLayout;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("tabLayout");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionDetailsPresenter getThisPresenter() {
        TransactionDetailsPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTransactionReference() {
        String $r1 = this.transactionReference;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("transactionReference");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionTypeMapper getTransactionTypeMapper() {
        TransactionTypeMapper $r1 = this.transactionTypeMapper;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("transactionTypeMapper");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void hideAddCustomerButton() {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionDetailsBinding $r2 = (ActivityTransactionDetailsBinding) $r1;
        FloatingActionButton $r3 = $r2.btnAddCustomer;
        $r3.m26969l();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void hideLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionDetailsBinding $r2 = (ActivityTransactionDetailsBinding) $r1;
        FrameLayout $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void onChargeBackCategoryFetched(CategoryData categoryData) {
        Log_OC.getArray(categoryData, "categoryData");
        TransactionDetailsActivity$onChargeBackCategoryFetched$1 r3 = new TransactionDetailsActivity$onChargeBackCategoryFetched$1(categoryData, this);
        Context r4 = (Context) this;
        ContextExtKt.launchActivity$default(r4, false, IssueActivity.class, (InterfaceC11767l) r3, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r15 = (Activity) this;
        Application $r2 = r15.getApplication();
        if ($r2 == null) {
            NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r14;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        setTitle("Transaction Details");
        AppCompatActivity r16 = (AppCompatActivity) this;
        AbstractC0925a $r5 = r16.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37602u(true);
        }
        ((TransactionDetailsPresenter) getPresenter()).getCurrentUser();
        InterfaceC8209a $r8 = getBinding();
        ActivityTransactionDetailsBinding $r9 = (ActivityTransactionDetailsBinding) $r8;
        final SwipeRefreshLayout $r10 = $r9.refreshView;
        $r10.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC1879j() { // from class: ai.kudi.agent.transactions.ui.MainActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1879j
            public final void onRefresh() {
                TransactionDetailsActivity $r1 = TransactionDetailsActivity.this;
                SwipeRefreshLayout $r22 = $r10;
                TransactionDetailsActivity.m41243onCreate$lambda1$lambda0($r1, $r22);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        AppCompatActivity r3 = (AppCompatActivity) this;
        MenuInflater $r2 = r3.getMenuInflater();
        $r2.inflate(C0001R.C0005menu.transaction_details, menu);
        this.menu = menu;
        Activity r4 = (Activity) this;
        boolean $z0 = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        return $z0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a
    public void onDestroy() {
        super.onDestroy();
        Activity r4 = (Activity) this;
        SharedPreferences $r1 = r4.getSharedPreferences(IssueTypeFragment.TEMP_TICKET_PREFERENCE, 0);
        SharedPreferences.Editor $r2 = $r1.edit();
        $r2.remove(IssueTypeFragment.TEMP_TICKET_ID);
        $r2.apply();
        FavoritesArrayAdapter $r3 = this.disposable;
        if ($r3 == null) {
            return;
        }
        $r3.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == C0001R.C0003id.transaction_details_options) {
            showOptionDialog();
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        FragmentActivity r3 = (FragmentActivity) this;
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 40) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    generatePdfReceipt();
                }
            }
        }
    }

    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onResume() {
        loadTransactionIfReferenceExists();
        super.onResume();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void onTerminalConnectionComplete(TerminalConnectionResponse terminalConnectionResponse, HashMap hashMap) {
        Log_OC.getArray(terminalConnectionResponse, "response");
        Log_OC.getArray(hashMap, "transaction");
        SendReceiptToTerminalConfirmationBottomSheet.Companion $r1 = SendReceiptToTerminalConfirmationBottomSheet.Companion;
        SendReceiptToTerminalConfirmationBottomSheet $r4 = SendReceiptToTerminalConfirmationBottomSheet.Companion.newInstance$default($r1, terminalConnectionResponse, hashMap, null, 4, null);
        FragmentActivity r8 = (FragmentActivity) this;
        FragmentManager $r5 = r8.getSupportFragmentManager();
        String $r7 = SendReceiptToTerminalConfirmationBottomSheet.class.getCanonicalName();
        ((Chapter) $r4).show($r5, $r7);
    }

    public final void setAgentAddress(String str) {
        this.agentAddress = str;
    }

    public final void setAgentName(String str) {
        this.agentName = str;
    }

    public final void setAgentPhoneNumber(String str) {
        this.agentPhoneNumber = str;
    }

    public final void setBankReference(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.bankReference = str;
    }

    public final void setBusinessName(String str) {
        this.businessName = str;
    }

    public final void setFetchBanks(FetchBanks fetchBanks) {
        Log_OC.getArray(fetchBanks, "<set-?>");
        this.fetchBanks = fetchBanks;
    }

    public final void setFirstContainerAdapter(TwoColumnTableAdapter twoColumnTableAdapter) {
        Log_OC.getArray(twoColumnTableAdapter, "<set-?>");
        this.firstContainerAdapter = twoColumnTableAdapter;
    }

    public final void setMenu(Menu menu) {
        this.menu = menu;
    }

    public final void setPref(Pref pref) {
        Log_OC.getArray(pref, "<set-?>");
        this.pref = pref;
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }

    public final void setSecondContainerAdapter(TwoColumnTableAdapter twoColumnTableAdapter) {
        Log_OC.getArray(twoColumnTableAdapter, "<set-?>");
        this.secondContainerAdapter = twoColumnTableAdapter;
    }

    public final void setTabLayout(TabLayout tabLayout) {
        Log_OC.getArray(tabLayout, "<set-?>");
        this.tabLayout = tabLayout;
    }

    public final void setThisPresenter(TransactionDetailsPresenter transactionDetailsPresenter) {
        Log_OC.getArray(transactionDetailsPresenter, "<set-?>");
        this.thisPresenter = transactionDetailsPresenter;
    }

    public final void setTransactionReference(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.transactionReference = str;
    }

    public final void setTransactionTypeMapper(TransactionTypeMapper transactionTypeMapper) {
        Log_OC.getArray(transactionTypeMapper, "<set-?>");
        this.transactionTypeMapper = transactionTypeMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void showAddCustomerButton() {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionDetailsBinding $r2 = (ActivityTransactionDetailsBinding) $r1;
        FloatingActionButton $r3 = $r2.btnAddCustomer;
        $r3.m26961t();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void showError(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        hideLoading();
        InterfaceC8209a $r2 = getBinding();
        ActivityTransactionDetailsBinding $r3 = (ActivityTransactionDetailsBinding) $r2;
        ViewGroup $r4 = $r3.rootLayout;
        ViewGroup r7 = $r4;
        View $r5 = r7.getRootView();
        Log_OC.loadImage($r5, "binding.rootLayout.rootView");
        boolean $z0 = ViewExtKt.isVisible($r5);
        Activity r8 = (Activity) this;
        boolean $z1 = r8.isFinishing();
        if ($z0 && (!$z1)) {
            Context r9 = (Context) this;
            ContextExtKt.toast$default(r9, str, 0, 2, (Object) null);
            return;
        }
        InterfaceC8209a $r22 = getBinding();
        ActivityTransactionDetailsBinding $r32 = (ActivityTransactionDetailsBinding) $r22;
        TextView $r6 = $r32.errorTextView;
        Log_OC.loadImage($r6, "binding.errorTextView");
        ViewExtKt.show($r6);
        InterfaceC8209a $r23 = getBinding();
        ActivityTransactionDetailsBinding $r33 = (ActivityTransactionDetailsBinding) $r23;
        $r33.errorTextView.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void showLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionDetailsBinding $r2 = (ActivityTransactionDetailsBinding) $r1;
        FrameLayout $r3 = $r2.progressBar;
        Log_OC.loadImage($r3, "binding.progressBar");
        ViewExtKt.show($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void showLogin() {
        MvpActivity.Companion $r1 = MvpActivity.Companion;
        Activity r2 = (Activity) this;
        $r1.logout(r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void showTerminalConnectionError() {
        ComponentActivity r10 = (ComponentActivity) this;
        AbstractC1565i $r2 = r10.getLifecycle();
        Priority $r3 = $r2.mo35505b();
        Priority $r4 = Priority.f4719G;
        boolean $z0 = $r3.m35575c($r4);
        if ($z0) {
            SendReceiptToTerminalConfirmationBottomSheet.Companion $r5 = SendReceiptToTerminalConfirmationBottomSheet.Companion;
            HashMap $r1 = this.transaction;
            SendReceiptToTerminalConfirmationBottomSheet $r6 = SendReceiptToTerminalConfirmationBottomSheet.Companion.newInstance$default($r5, null, $r1, SendReceiptToTerminalConfirmationBottomSheet.FAILED_CONNECTION_STATE, 1, null);
            FragmentManager $r7 = ((FragmentActivity) this).getSupportFragmentManager();
            String $r9 = SendReceiptToTerminalConfirmationBottomSheet.class.getCanonicalName();
            Chapter r12 = (Chapter) $r6;
            r12.show($r7, $r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void showTerminalConnectionLoading(boolean z) {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionDetailsBinding $r2 = (ActivityTransactionDetailsBinding) $r1;
        if (z) {
            KudiButton $r3 = $r2.sendToTerminalButton;
            $r3.m38032f();
            FloatingActionButton $r4 = $r2.btnSupport;
            $r4.m26969l();
            return;
        }
        KudiButton $r32 = $r2.sendToTerminalButton;
        $r32.m38033e();
        FloatingActionButton $r42 = $r2.btnSupport;
        $r42.m26961t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:93:0x0596 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0598  */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showTransaction(final java.util.HashMap r137, ai.kudi.agent.users.domain.package_1.User r138) {
        /*
            Method dump skipped, instructions count: 2608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity.showTransaction(java.util.HashMap, ai.kudi.agent.users.domain.package_1.User):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.views.TransactionDetailsView
    public void toggleRaiseChargeBackLoading(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ActivityTransactionDetailsBinding $r2 = (ActivityTransactionDetailsBinding) $r1;
            TextView $r3 = $r2.raiseChargeBackButton;
            Log_OC.loadImage($r3, "binding.raiseChargeBackButton");
            ViewExtKt.hide$default($r3, false, 1, null);
            InterfaceC8209a $r12 = getBinding();
            ActivityTransactionDetailsBinding $r22 = (ActivityTransactionDetailsBinding) $r12;
            ProgressBar $r4 = $r22.raiseChargeBackProgressBar;
            Log_OC.loadImage($r4, "binding.raiseChargeBackProgressBar");
            ViewExtKt.show($r4);
            return;
        }
        InterfaceC8209a $r13 = getBinding();
        ActivityTransactionDetailsBinding $r23 = (ActivityTransactionDetailsBinding) $r13;
        TextView $r32 = $r23.raiseChargeBackButton;
        Log_OC.loadImage($r32, "binding.raiseChargeBackButton");
        ViewExtKt.show($r32);
        InterfaceC8209a $r14 = getBinding();
        ActivityTransactionDetailsBinding $r24 = (ActivityTransactionDetailsBinding) $r14;
        ProgressBar $r42 = $r24.raiseChargeBackProgressBar;
        Log_OC.loadImage($r42, "binding.raiseChargeBackProgressBar");
        ViewExtKt.hide$default($r42, false, 1, null);
    }
}
