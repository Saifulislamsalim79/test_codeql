package ai.kudi.agent.home;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.bills.p002ui.HomeFragment;
import ai.kudi.agent.constants.ConstantsKt;
import ai.kudi.agent.core.domain.room_entities.IssueCategory;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.RandomUtilKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.dashboard.mods.DashboardFragment;
import ai.kudi.agent.databinding.AppBarHomeBinding;
import ai.kudi.agent.databinding.ContentHomeBinding;
import ai.kudi.agent.databinding.FragmentTodoListBinding;
import ai.kudi.agent.databinding.NavHeaderHomeBinding;
import ai.kudi.agent.databinding.NavigationViewBottomBinding;
import ai.kudi.agent.databinding.ViewDashboardHomeBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.home.BvnHomeUpdateFragment;
import ai.kudi.agent.home.adapter.NavigationListViewAdapter;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.navigators.HomeToIssueScreenNavigationType;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.issues.p008ui.IssueResolutionHostFragment;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.data.model.NotificationModelKt;
import ai.kudi.agent.notification.viewmodels.NotificationType;
import ai.kudi.agent.postRegistrationSetUp.adapter.TodoListAdapter;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModelKt;
import ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import ai.kudi.agent.wallettopup.data.MiniMonnifyDetails;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0929b;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1583u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import dagger.android.C7427a;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import dagger.android.d;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import p201g.p270x.InterfaceC8209a;
import p272h.p286c.p287a.p323c.p329n.C9289a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: HomeActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 «\u00012\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u00032\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002«\u0001B\u0005¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100XH\u0016J\u0014\u0010Y\u001a\u00020Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\H\u0002J\u0012\u0010]\u001a\u00020Z2\b\u0010^\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010_\u001a\u00020\u0004H\u0016J\u0010\u0010`\u001a\u00020Z2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020Z2\u0006\u0010d\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020ZH\u0002J\b\u0010g\u001a\u00020ZH\u0016J\b\u0010h\u001a\u00020)H\u0002J\b\u0010i\u001a\u00020ZH\u0016J\u0010\u0010j\u001a\u00020Z2\u0006\u0010k\u001a\u00020bH\u0002J\u0006\u0010l\u001a\u00020ZJ\b\u0010m\u001a\u00020ZH\u0002J\b\u0010,\u001a\u00020)H\u0002J\b\u0010n\u001a\u00020ZH\u0016J\u0012\u0010o\u001a\u00020Z2\b\u0010p\u001a\u0004\u0018\u00010qH\u0014J\u0012\u0010r\u001a\u00020)2\b\u0010s\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010t\u001a\u00020Z2\u0006\u0010u\u001a\u00020vH\u0016J\u0010\u0010w\u001a\u00020)2\u0006\u0010x\u001a\u00020yH\u0016J\u0012\u0010z\u001a\u00020Z2\b\u0010{\u001a\u0004\u0018\u00010\\H\u0014J\b\u0010|\u001a\u00020ZH\u0016J\u0010\u0010}\u001a\u00020)2\u0006\u0010x\u001a\u00020yH\u0016J\b\u0010~\u001a\u00020ZH\u0016J\u0011\u0010\u007f\u001a\u00020Z2\u0007\u0010\u0080\u0001\u001a\u00020)H\u0016J\t\u0010\u0081\u0001\u001a\u00020ZH\u0016J\u0012\u0010\u0082\u0001\u001a\u00020Z2\u0007\u0010\u0083\u0001\u001a\u00020\u001fH\u0016J\t\u0010\u0084\u0001\u001a\u00020ZH\u0002J\u0011\u0010\u0085\u0001\u001a\u00020Z2\u0006\u0010\u001b\u001a\u00020\u001dH\u0016J\u0010\u0010\u0086\u0001\u001a\u00020Z2\u0007\u0010\u0087\u0001\u001a\u00020\u001fJ\t\u0010\u0088\u0001\u001a\u00020ZH\u0002J\u001a\u0010\u0089\u0001\u001a\u00020Z2\u0006\u0010k\u001a\u00020b2\u0007\u0010\u008a\u0001\u001a\u00020bH\u0002J\u0012\u0010\u008b\u0001\u001a\u00020Z2\u0007\u0010\u008c\u0001\u001a\u00020\u001fH\u0016J\u0007\u0010\u008d\u0001\u001a\u00020ZJ\u001a\u0010\u008e\u0001\u001a\u00020Z2\u000f\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0090\u0001H\u0016J\u001a\u0010\u0092\u0001\u001a\u00020Z2\u000f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0090\u0001H\u0016J\u0012\u0010\u0095\u0001\u001a\u00020Z2\u0007\u0010\u0096\u0001\u001a\u00020)H\u0016J#\u0010\u0097\u0001\u001a\u00020Z2\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u000e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020Z0\u009b\u0001H\u0016J\u0011\u0010\u009c\u0001\u001a\u00020Z2\u0006\u0010d\u001a\u00020eH\u0002J\u0012\u0010\u009d\u0001\u001a\u00020Z2\u0007\u0010\u009e\u0001\u001a\u00020)H\u0002J\u0013\u0010\u009f\u0001\u001a\u00020Z2\b\u0010 \u0001\u001a\u00030¡\u0001H\u0016J\t\u0010¢\u0001\u001a\u00020ZH\u0016J\u0013\u0010£\u0001\u001a\u00020Z2\b\u0010 \u0001\u001a\u00030¤\u0001H\u0016J\u0013\u0010¥\u0001\u001a\u00020Z2\b\u0010 \u0001\u001a\u00030¤\u0001H\u0016J\u0012\u0010¦\u0001\u001a\u00020Z2\t\b\u0002\u0010\u0080\u0001\u001a\u00020)J\u0012\u0010§\u0001\u001a\u00020Z2\u0007\u0010¨\u0001\u001a\u00020)H\u0016J\u0012\u0010©\u0001\u001a\u00020Z2\t\b\u0002\u0010ª\u0001\u001a\u00020)R\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082.¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000203X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010F\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\bG\u0010\n\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER\u001e\u0010J\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0010\u0010P\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0010\u0010V\u001a\u0004\u0018\u00010WX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006¬\u0001"}, m10421d2 = {"Lai/kudi/agent/home/HomeActivity;", "Ldagger/android/HasAndroidInjector;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/home/HomeView;", "Lai/kudi/agent/home/HomePresenter;", "Lai/kudi/agent/databinding/ViewDashboardHomeBinding;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "Lai/kudi/agent/bills/ui/HomeFragment$OnFragmentInteractionListener;", "Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;", "Lai/kudi/agent/transactionhistory/navigator/IncompleteTransactionsNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ViewDashboardHomeBinding;", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "balanceTextView", "Landroid/widget/TextView;", "billsFragment", "Lai/kudi/agent/bills/ui/HomeFragment;", "bvnUpdateFragment", "Lai/kudi/agent/home/BvnHomeUpdateFragment;", "cashInsuranceState", "Landroidx/lifecycle/MutableLiveData;", "Lai/kudi/agent/home/CashInsuranceState;", "customerType", "", "dashboard", "Lai/kudi/agent/dashboard/ui/DashboardFragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "isHq", "", "isKCashEnabled", "isNewUser", "isOutlet", "mOnNavigationItemSelectedListener", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "navigationListAdapter", "Lai/kudi/agent/home/adapter/NavigationListViewAdapter;", "notificationTextViewCount", "outletMenuItem", "Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem;", "getOutletMenuItem", "()Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem;", "setOutletMenuItem", "(Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem;)V", "overFlowMenu", "Landroid/view/Menu;", "pref", "Lai/kudi/agent/core/util/Pref;", "getPref", "()Lai/kudi/agent/core/util/Pref;", "setPref", "(Lai/kudi/agent/core/util/Pref;)V", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "sharedPreferences", "getSharedPreferences$annotations", "getSharedPreferences", "setSharedPreferences", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "terminalID", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/home/HomePresenter;", "setThisPresenter", "(Lai/kudi/agent/home/HomePresenter;)V", "todoListAdapter", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoListAdapter;", "Ldagger/android/AndroidInjector;", "checkNotificationIntent", "", "i", "Landroid/content/Intent;", "checkTerminalID", "terminalId", "createPresenter", "displayNotificationCount", "count", "", "displayWalletBalance", "balance", "", LoginParams.SHOULD_FORCE_KYC_UPGRADE, "fundWalletView", "getIsNewUser", "goToIssueResolution", "hideBadge", "menuItemId", "hideLoader", "initTodoListAdapter", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "onIncompleteTransactionDetails", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onNewIntent", "intent", "onNotificationClicked", "onOptionsItemSelected", "onResume", "onShowActivityToolbar", "show", "onToggleDrawerLayout", "openPageByType", "type", "removeOutletManagerItemIfChildOutlet", "setCashInsuranceState", "setToolbarTitle", AttributeType.TEXT, "setupFragmentsNavigation", "showBadge", "incompleteTransactionCount", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showLoader", "showMonnifyDetails", "miniMonnifyDetails", "", "Lai/kudi/agent/wallettopup/data/MiniMonnifyDetails;", "showTodoList", "todoList", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoItem;", "showTodoLoading", "isLoading", "showVerifyPrompt", "result", "Lai/kudi/agent/home/VerifyStateResult;", "buttonClickListener", "Lkotlin/Function0;", "showWalletBalance", "switchLayout", "isDashboard", "toDisputeIssueFragment", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "toIssueContactUsFragment", "toIssueDetailFragment", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "toIssueTypeFragment", "toggleBottomNav", "toggleKCashFeature", "isVisible", "toggleOverflowMenu", SeenState.HIDE, "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class HomeActivity extends MvpActivity<HomeView, HomePresenter, ViewDashboardHomeBinding> implements d, HomeView, NavigationView.InterfaceC4704c, HomeFragment.OnFragmentInteractionListener, IssueTypeHomeNavigator, IncompleteTransactionsNavigator {
    public static final String AGENT = "AGENT";
    public static final String CUSTOMER_TYPE = "CUSTOMER_TYPE";
    public static final Companion Companion;
    public static final int KSHOCK_REQUEST_CODE = 23;
    public static final String MERCHANT = "MERCHANT";
    public static final String USER = "USER";
    public DispatchingAndroidInjector<Object> androidInjector;
    private TextView balanceTextView;
    private HomeFragment billsFragment;
    private BvnHomeUpdateFragment bvnUpdateFragment;
    private C1583u<CashInsuranceState> cashInsuranceState;
    private String customerType;
    private DashboardFragment dashboard;
    public FragmentManager fragmentManager;
    private boolean isHq;
    private boolean isKCashEnabled;
    private boolean isNewUser;
    private boolean isOutlet;
    private final BottomNavigationView.InterfaceC4527d mOnNavigationItemSelectedListener;
    private NavigationListViewAdapter navigationListAdapter;
    private TextView notificationTextViewCount;
    public NavigationListViewAdapter.MenuItem outletMenuItem;
    private Menu overFlowMenu;
    public Pref pref;
    public SharedPreferences sharedPref;
    public SharedPreferences sharedPreferences;
    public SmartLookAnalytics smartLookAnalytics;
    private String terminalID;
    public HomePresenter thisPresenter;
    private TodoListAdapter todoListAdapter;

    /* compiled from: HomeActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/home/HomeActivity$Companion;", "", "()V", "AGENT", "", HomeActivity.CUSTOMER_TYPE, "KSHOCK_REQUEST_CODE", "", HomeActivity.MERCHANT, "USER", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: HomeActivity.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            VerifyStateResult[] $r0 = VerifyStateResult.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            VerifyStateResult $r2 = VerifyStateResult.UNVERIFIED;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            VerifyStateResult $r22 = VerifyStateResult.SUCCESS;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            VerifyStateResult $r23 = VerifyStateResult.FAILURE;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public HomeActivity() {
        Error $r1 = Error.INSTANCE;
        C1583u $r2 = new C1583u($r1);
        this.cashInsuranceState = $r2;
        this.mOnNavigationItemSelectedListener = new BottomNavigationView.InterfaceC4527d() { // from class: ai.kudi.agent.home.HomeActivity.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.InterfaceC4527d
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                HomeActivity $r12 = HomeActivity.this;
                boolean $z0 = HomeActivity.m39274mOnNavigationItemSelectedListener$lambda2($r12, menuItem);
                return $z0;
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void checkNotificationIntent(Intent $r1) {
        if ($r1 == null) {
            Activity r7 = (Activity) this;
            $r1 = r7.getIntent();
        }
        Serializable $r2 = $r1.getSerializableExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
        boolean $z0 = $r2 instanceof NotificationModel;
        NotificationModel $r3 = $z0 ? (NotificationModel) $r2 : null;
        if ($r3 != null) {
            String $r4 = $r3.getReferenceType();
            NotificationType $r5 = NotificationType.KYC_UPGRADE_SUCCESSFUL;
            String $r6 = $r5.name();
            boolean $z02 = Log_OC.append($r4, $r6);
            if ($z02) {
                openPageByType("settings");
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void checkNotificationIntent$default(HomeActivity homeActivity, Intent $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        homeActivity.checkNotificationIntent($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void forceKycUpgrade() {
        SharedPreferences $r1 = getSharedPref();
        boolean $z0 = $r1.getBoolean(LoginParams.SHOULD_FORCE_KYC_UPGRADE, false);
        if ($z0) {
            Context r9 = (Context) this;
            Intent r7 = new Intent(r9, BvnExistingAgentActivity.class);
            HomePresenter $r3 = getThisPresenter();
            String $r4 = $r3.returnPhoneNumber();
            r7.putExtra("phoneNo", $r4);
            r7.putExtra(Constants.IS_NEW_USER, false);
            r7.putExtra(LoginParams.SHOULD_FORCE_KYC_UPGRADE, true);
            VerifyStateResult $r5 = VerifyStateResult.UNVERIFIED;
            HomeActivity$forceKycUpgrade$1 r8 = new HomeActivity$forceKycUpgrade$1(this, r7);
            showVerifyPrompt($r5, r8);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean getIsNewUser() {
        SharedPreferences $r1 = getSharedPreferences();
        boolean $z0 = $r1.getBoolean(LoginParams.EXTRA_IS_NEW_USER, false);
        return $z0;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideBadge(int i) {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
        ContentHomeBinding $r4 = $r3.defaultView;
        BottomNavigationView $r5 = $r4.bottomNavigationView;
        C9289a $r6 = $r5.m27522f(i);
        if ($r6 != null) {
            $r6.m15206A(false);
            $r6.m15198c();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initTodoListAdapter() {
        HomeActivity$initTodoListAdapter$1 $r3 = new HomeActivity$initTodoListAdapter$1(this);
        TodoListAdapter $r2 = new TodoListAdapter($r3);
        this.todoListAdapter = $r2;
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r4 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r5 = $r4.appBarHomeBinding;
        FragmentTodoListBinding $r6 = $r5.todoListView;
        RecyclerView $r7 = $r6.todoListRv;
        TodoListAdapter $r22 = this.todoListAdapter;
        $r7.setAdapter($r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isOutlet() {
        SharedPreferences $r1 = getSharedPreferences();
        boolean $z0 = $r1.getBoolean(LoginParams.EXTRA_IS_OUTLET, false);
        return $z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: mOnNavigationItemSelectedListener$lambda-2  reason: not valid java name */
    public static final boolean m39274mOnNavigationItemSelectedListener$lambda2(HomeActivity homeActivity, MenuItem menuItem) {
        Log_OC.getArray(homeActivity, "this$0");
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        switch ($i0) {
            case C0001R.C0003id.navigation_pay_bills /* 2131363142 */:
                Activity r3 = (Activity) homeActivity;
                String $r2 = r3.getString(C0001R.string.bills);
                Log_OC.loadImage($r2, "getString(R.string.bills)");
                homeActivity.openPageByType($r2);
                return true;
            case C0001R.C0003id.navigation_support /* 2131363143 */:
                homeActivity.openPageByType("help");
                return true;
            case C0001R.C0003id.navigation_transactions /* 2131363144 */:
                Activity r32 = (Activity) homeActivity;
                String $r22 = r32.getString(C0001R.string.transaction);
                Log_OC.loadImage($r22, "getString(R.string.transaction)");
                homeActivity.openPageByType($r22);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39275onCreate$lambda0(HomeActivity homeActivity, View view) {
        Log_OC.getArray(homeActivity, "this$0");
        MvpActivity.Companion $r2 = MvpActivity.Companion;
        Activity r3 = (Activity) homeActivity;
        $r2.logout(r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateOptionsMenu$lambda-3  reason: not valid java name */
    public static final void m39276onCreateOptionsMenu$lambda3(HomeActivity homeActivity, MenuItem menuItem, View view) {
        Log_OC.getArray(homeActivity, "this$0");
        Log_OC.getArray(menuItem, "$menuItem");
        homeActivity.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onResume$lambda-4  reason: not valid java name */
    public static final void m39277onResume$lambda4(HomeActivity homeActivity) {
        Log_OC.getArray(homeActivity, "this$0");
        FragmentActivity r7 = (FragmentActivity) homeActivity;
        FragmentManager $r1 = r7.getSupportFragmentManager();
        BvnHomeUpdateFragment.Companion $r2 = BvnHomeUpdateFragment.Companion;
        String $r3 = $r2.getTAG();
        Fragment $r4 = $r1.m35938g0($r3);
        if ($r4 == null) {
            InterfaceC9413d $r5 = homeActivity.presenter;
            HomePresenter $r6 = (HomePresenter) $r5;
            $r6.checkBvnIsVerified();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void removeOutletManagerItemIfChildOutlet() {
        boolean $z0 = isOutlet();
        if ($z0) {
            NavigationListViewAdapter $r1 = this.navigationListAdapter;
            if ($r1 != null) {
                NavigationListViewAdapter.MenuItem $r2 = getOutletMenuItem();
                $r1.removeMenuItem($r2);
                return;
            }
            Log_OC.LogError("navigationListAdapter");
            NullPointerException r3 = new NullPointerException("Null throw statement replaced by Soot");
            throw r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupFragmentsNavigation() {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
        ContentHomeBinding $r4 = $r3.defaultView;
        BottomNavigationView $r5 = $r4.bottomNavigationView;
        BottomNavigationView.InterfaceC4527d $r6 = this.mOnNavigationItemSelectedListener;
        $r5.setOnNavigationItemSelectedListener($r6);
        FragmentActivity r14 = (FragmentActivity) this;
        FragmentManager $r7 = r14.getSupportFragmentManager();
        Log_OC.loadImage($r7, "supportFragmentManager");
        setFragmentManager($r7);
        HomeFragment r11 = new HomeFragment();
        this.billsFragment = r11;
        BvnHomeUpdateFragment r12 = new BvnHomeUpdateFragment();
        this.bvnUpdateFragment = r12;
        DashboardFragment r13 = new DashboardFragment();
        this.dashboard = r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showBadge(int i, int i2) {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
        ContentHomeBinding $r4 = $r3.defaultView;
        BottomNavigationView $r5 = $r4.bottomNavigationView;
        C9289a $r6 = $r5.m27521g(i);
        $r6.m15206A(true);
        Log_OC.loadImage($r6, MetricTracker.Object.BADGE);
        C9289a r7 = $r6;
        Context r8 = (Context) this;
        ContextExtKt.setKudiColorFilter(r7, r8, C0001R.color.orange);
        $r6.m15178w(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showMonnifyDetails$lambda-7  reason: not valid java name */
    public static final void m39278showMonnifyDetails$lambda7(HomeActivity homeActivity, View view) {
        Log_OC.getArray(homeActivity, "this$0");
        HomeActivity$showMonnifyDetails$1$1 $r1 = HomeActivity$showMonnifyDetails$1$1.INSTANCE;
        Context r3 = (Context) homeActivity;
        ContextExtKt.launchActivity$default(r3, false, WalletTopUpActivity.class, (InterfaceC11767l) $r1, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showMonnifyDetails$lambda-9  reason: not valid java name */
    public static final void m39279showMonnifyDetails$lambda9(MiniMonnifyDetails miniMonnifyDetails, HomeActivity homeActivity, View view) {
        String $r2;
        Log_OC.getArray(homeActivity, "this$0");
        if (miniMonnifyDetails == null || ($r2 = miniMonnifyDetails.getAccountNumber()) == null) {
            return;
        }
        Context r4 = (Context) homeActivity;
        RandomUtilKt.copyToClipboard$default(r4, $r2, null, null, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showWalletBalance(double d) {
        TextView $r1 = this.balanceTextView;
        if ($r1 == null) {
            return;
        }
        Locale $r2 = Locale.US;
        NumberFormat $r3 = NumberFormat.getNumberInstance($r2);
        String $r4 = $r3.format(d);
        $r1.setText(StringExtKt.getLoadHtml(Log_OC.m10359a("₦ ", (Object) $r4)));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void switchLayout(boolean z) {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
        FragmentTodoListBinding $r4 = $r3.todoListView;
        View $r5 = $r4.getRoot();
        Log_OC.loadImage($r5, "binding.appBarHomeBinding.todoListView.root");
        InterfaceC8209a $r12 = getBinding();
        ViewDashboardHomeBinding $r22 = (ViewDashboardHomeBinding) $r12;
        AppBarHomeBinding $r32 = $r22.appBarHomeBinding;
        ContentHomeBinding $r6 = $r32.defaultView;
        LinearLayout $r7 = $r6.getRoot();
        Log_OC.loadImage($r7, "binding.appBarHomeBinding.defaultView.root");
        View r9 = $r5;
        ViewExtKt.hide$default(r9, false, 1, null);
        ViewExtKt.show($r7);
        InterfaceC8209a $r13 = getBinding();
        ViewDashboardHomeBinding $r23 = (ViewDashboardHomeBinding) $r13;
        AppBarHomeBinding $r33 = $r23.appBarHomeBinding;
        ContentHomeBinding $r62 = $r33.defaultView;
        View $r8 = $r62.bottomNavigationView;
        Log_OC.loadImage($r8, "binding.appBarHomeBinding.defaultView.bottomNavigationView");
        View r92 = $r8;
        ViewExtKt.show(r92);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleBottomNav$default(HomeActivity homeActivity, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = true;
        }
        homeActivity.toggleBottomNav($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleOverflowMenu$default(HomeActivity homeActivity, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        homeActivity.toggleOverflowMenu($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Registry androidInjector() {
        DispatchingAndroidInjector $r1 = getAndroidInjector();
        return $r1;
    }

    @Override // ai.kudi.agent.home.HomeView
    public void checkTerminalID(String str) {
        this.terminalID = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public HomePresenter createPresenter() {
        HomePresenter $r1 = getThisPresenter();
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
    @Override // ai.kudi.agent.home.HomeView
    public void displayNotificationCount(int i) {
        HomeFragment $r2 = this.billsFragment;
        if ($r2 == null) {
            Log_OC.LogError("billsFragment");
            NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
            throw r4;
        }
        $r2.setNotificationCount(i);
        TextView $r3 = this.notificationTextViewCount;
        if ($r3 != null) {
            if (i <= 0) {
                if ($r3 == null) {
                    return;
                }
                ViewExtKt.hide$default($r3, false, 1, null);
                return;
            }
            if ($r3 != null) {
                ViewExtKt.show($r3);
            }
            TextView $r32 = this.notificationTextViewCount;
            if ($r32 == null) {
                return;
            }
            String $r1 = String.valueOf(i);
            $r32.setText($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void displayWalletBalance(double d) {
        SharedPreferences $r1 = getSharedPreferences();
        SharedPreferences.Editor $r2 = $r1.edit();
        String $r3 = String.valueOf(d);
        $r2.putString(ConstantsKt.EXTRA_WALLET_BALANCE, $r3).apply();
        showWalletBalance(d);
        SmartLookAnalytics $r4 = getSmartLookAnalytics();
        $r4.logDashboard();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void fundWalletView() {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
        Toolbar $r4 = $r3.toolbar;
        CharSequence $r5 = $r4.getTitle();
        Activity r8 = (Activity) this;
        String $r6 = r8.getString(C0001R.string.title_activity_home);
        boolean $z0 = Log_OC.append($r5, $r6);
        switchLayout($z0);
        TodoListAdapter $r7 = this.todoListAdapter;
        if ($r7 == null) {
            initTodoListAdapter();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ViewDashboardHomeBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ViewDashboardHomeBinding $r2 = ViewDashboardHomeBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ViewDashboardHomeBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DispatchingAndroidInjector getAndroidInjector() {
        DispatchingAndroidInjector $r1 = this.androidInjector;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("androidInjector");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FragmentManager getFragmentManager() {
        FragmentManager $r1 = this.fragmentManager;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("fragmentManager");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NavigationListViewAdapter.MenuItem getOutletMenuItem() {
        NavigationListViewAdapter.MenuItem $r1 = this.outletMenuItem;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMenuItem");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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
    public final SharedPreferences getSharedPref() {
        SharedPreferences $r1 = this.sharedPref;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPref");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final HomePresenter getThisPresenter() {
        HomePresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.bills.p002ui.HomeFragment.OnFragmentInteractionListener
    public void goToIssueResolution() {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
        ContentHomeBinding $r4 = $r3.defaultView;
        BottomNavigationView $r5 = $r4.bottomNavigationView;
        Menu $r6 = $r5.getMenu();
        MenuItem $r7 = $r6.findItem(C0001R.C0003id.navigation_support);
        $r7.setChecked(true);
        InterfaceC8209a $r12 = getBinding();
        ViewDashboardHomeBinding $r22 = (ViewDashboardHomeBinding) $r12;
        AppBarHomeBinding $r32 = $r22.appBarHomeBinding;
        Toolbar $r8 = $r32.toolbar;
        Activity r15 = (Activity) this;
        String $r9 = r15.getString(C0001R.string.what_is_your_issue);
        $r8.setTitle($r9);
        FragmentManager $r10 = getFragmentManager();
        AbstractC1449b0 $r11 = $r10.m35924l();
        IssueResolutionHostFragment r14 = new IssueResolutionHostFragment();
        $r11.m35821r(C0001R.C0003id.contentFrameLayout, r14);
        $r11.mo35805i();
        InterfaceC8209a $r13 = getBinding();
        ViewDashboardHomeBinding $r23 = (ViewDashboardHomeBinding) $r13;
        AppBarHomeBinding $r33 = $r23.appBarHomeBinding;
        ViewGroup $r82 = $r33.toolbar;
        Context r16 = (Context) this;
        int $i0 = ContextExtKt.getKudiColor(r16, C0001R.color.colorPrimary);
        ViewGroup r17 = $r82;
        r17.setBackgroundColor($i0);
        InterfaceC8209a $r14 = getBinding();
        ViewDashboardHomeBinding $r24 = (ViewDashboardHomeBinding) $r14;
        DrawerLayout $r132 = $r24.drawerLayout;
        $r132.m36050d(8388611);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoader() {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
        ViewLoaderBinding $r4 = $r3.loaderView;
        View $r5 = $r4.getRoot();
        Log_OC.loadImage($r5, "binding.appBarHomeBinding.loaderView.root");
        View r6 = $r5;
        ViewExtKt.hide$default(r6, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        DrawerLayout $r3 = $r2.drawerLayout;
        boolean $z0 = $r3.m36074C(8388611);
        if (!$z0) {
            ComponentActivity r4 = (ComponentActivity) this;
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ViewDashboardHomeBinding $r22 = (ViewDashboardHomeBinding) $r12;
        DrawerLayout $r32 = $r22.drawerLayout;
        $r32.m36050d(8388611);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r35 = (Activity) this;
        C7427a.m18756a(r35);
        super.onCreate(bundle);
        forceKycUpgrade();
        setupFragmentsNavigation();
        if (bundle == null) {
            FragmentManager $r3 = getFragmentManager();
            AbstractC1449b0 $r4 = $r3.m35924l();
            Log_OC.loadImage($r4, "fragmentManager.beginTransaction()");
            boolean $z0 = $r4.mo35799p();
            if ($z0) {
                HomeFragment $r5 = this.billsFragment;
                if ($r5 == null) {
                    Log_OC.LogError("billsFragment");
                    NullPointerException r27 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r27;
                }
                $r4.m35829b(C0001R.C0003id.contentFrameLayout, $r5);
                $r4.mo35805i();
            } else {
                HomeFragment $r52 = this.billsFragment;
                if ($r52 == null) {
                    Log_OC.LogError("billsFragment");
                    NullPointerException r272 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r272;
                }
                $r4.m35821r(C0001R.C0003id.contentFrameLayout, $r52);
                $r4.mo35805i();
            }
            InterfaceC8209a $r6 = getBinding();
            ViewDashboardHomeBinding $r7 = (ViewDashboardHomeBinding) $r6;
            AppBarHomeBinding $r8 = $r7.appBarHomeBinding;
            Toolbar $r9 = $r8.toolbar;
            Activity r352 = (Activity) this;
            $r9.setTitle(r352.getString(C0001R.string.title_activity_home));
            InterfaceC8209a $r62 = getBinding();
            ViewDashboardHomeBinding $r72 = (ViewDashboardHomeBinding) $r62;
            AppBarHomeBinding $r82 = $r72.appBarHomeBinding;
            Toolbar $r92 = $r82.toolbar;
            AppCompatActivity r37 = (AppCompatActivity) this;
            r37.setSupportActionBar($r92);
        }
        boolean $z02 = getIsNewUser();
        this.isNewUser = $z02;
        SharedPreferences $r11 = getSharedPreferences();
        boolean $z03 = $r11.getBoolean(LoginParams.EXTRA_IS_KCASH_ENABLED, false);
        this.isKCashEnabled = $z03;
        boolean $z04 = isOutlet();
        this.isOutlet = $z04;
        SharedPreferences $r112 = getSharedPreferences();
        boolean $z05 = $r112.getBoolean(LoginParams.EXTRA_IS_HQ, false);
        this.isHq = $z05;
        SharedPreferences $r113 = getSharedPreferences();
        String $r12 = $r113.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "AGENT");
        this.customerType = $r12 != null ? $r12 : "AGENT";
        InterfaceC8209a $r63 = getBinding();
        ViewDashboardHomeBinding $r73 = (ViewDashboardHomeBinding) $r63;
        DrawerLayout $r14 = $r73.drawerLayout;
        InterfaceC8209a $r64 = getBinding();
        ViewDashboardHomeBinding $r74 = (ViewDashboardHomeBinding) $r64;
        AppBarHomeBinding $r83 = $r74.appBarHomeBinding;
        Toolbar $r93 = $r83.toolbar;
        Activity r353 = (Activity) this;
        C0929b r28 = new C0929b(r353, $r14, $r93, C0001R.string.navigation_drawer_open, C0001R.string.navigation_drawer_close);
        InterfaceC8209a $r65 = getBinding();
        ViewDashboardHomeBinding $r75 = (ViewDashboardHomeBinding) $r65;
        DrawerLayout $r142 = $r75.drawerLayout;
        C0929b r38 = r28;
        $r142.m36053a(r38);
        r28.m37791e();
        InterfaceC8209a $r66 = getBinding();
        ViewDashboardHomeBinding $r76 = (ViewDashboardHomeBinding) $r66;
        NavigationView $r15 = $r76.navView;
        $r15.setNavigationItemSelectedListener(this);
        String $r10 = this.customerType;
        if ($r10 == null) {
            Log_OC.LogError("customerType");
            NullPointerException r273 = new NullPointerException("Null throw statement replaced by Soot");
            throw r273;
        }
        SharedPreferences $r114 = getSharedPref();
        Context r39 = (Context) this;
        NavigationListViewAdapter r29 = new NavigationListViewAdapter(r39, $r10, $r114);
        this.navigationListAdapter = r29;
        Activity r354 = (Activity) this;
        String $r102 = r354.getString(C0001R.string.title_outlets);
        Log_OC.loadImage($r102, "getString(R.string.title_outlets)");
        SharedPreferences $r115 = getSharedPref();
        boolean $z06 = $r115.getBoolean("IS_NEW_FEATURE", true);
        NavigationListViewAdapter.MenuItem.UserType $r1 = NavigationListViewAdapter.MenuItem.UserType.AGENT;
        NavigationListViewAdapter.MenuItem r30 = new NavigationListViewAdapter.MenuItem($r102, C0001R.C0002drawable.ic_outlet_mgt, "outlet_mgt", $z06, false, $r1, null, 80, null);
        setOutletMenuItem(r30);
        boolean $z07 = this.isHq;
        if ($z07) {
            NavigationListViewAdapter $r16 = this.navigationListAdapter;
            if ($r16 == null) {
                Log_OC.LogError("navigationListAdapter");
                NullPointerException r274 = new NullPointerException("Null throw statement replaced by Soot");
                throw r274;
            }
            List $r18 = $r16.getArrayOfMenuItem();
            int $i0 = $r18.size();
            if ($i0 > 4) {
                NavigationListViewAdapter $r162 = this.navigationListAdapter;
                if ($r162 == null) {
                    Log_OC.LogError("navigationListAdapter");
                    NullPointerException r275 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r275;
                }
                NavigationListViewAdapter.MenuItem $r17 = getOutletMenuItem();
                $r162.updateMenuListAtPosition($r17, 4);
            } else {
                NavigationListViewAdapter $r163 = this.navigationListAdapter;
                if ($r163 == null) {
                    Log_OC.LogError("navigationListAdapter");
                    NullPointerException r276 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r276;
                }
                NavigationListViewAdapter.MenuItem $r172 = getOutletMenuItem();
                $r163.addMenuItem($r172);
            }
        }
        NavigationListViewAdapter $r164 = this.navigationListAdapter;
        if ($r164 == null) {
            Log_OC.LogError("navigationListAdapter");
            NullPointerException r277 = new NullPointerException("Null throw statement replaced by Soot");
            throw r277;
        }
        HomeActivity$onCreate$1 r31 = new HomeActivity$onCreate$1(this);
        $r164.setListener(r31);
        boolean $z08 = this.isKCashEnabled;
        toggleKCashFeature($z08);
        InterfaceC8209a $r67 = getBinding();
        ViewDashboardHomeBinding $r77 = (ViewDashboardHomeBinding) $r67;
        RecyclerView $r20 = $r77.menuItem;
        Log_OC.loadImage($r20, "binding.menuItem");
        Context r392 = (Context) this;
        LinearLayoutManager r32 = new LinearLayoutManager(r392);
        $r20.setLayoutManager(r32);
        $r20.setHasFixedSize(true);
        NavigationListViewAdapter $r165 = this.navigationListAdapter;
        if ($r165 == null) {
            Log_OC.LogError("navigationListAdapter");
            NullPointerException r278 = new NullPointerException("Null throw statement replaced by Soot");
            throw r278;
        }
        $r20.setAdapter($r165);
        NavigationListViewAdapter $r166 = this.navigationListAdapter;
        if ($r166 == null) {
            Log_OC.LogError("navigationListAdapter");
            NullPointerException r279 = new NullPointerException("Null throw statement replaced by Soot");
            throw r279;
        } else if ($r166 == null) {
            Log_OC.LogError("navigationListAdapter");
            NullPointerException r2710 = new NullPointerException("Null throw statement replaced by Soot");
            throw r2710;
        } else {
            List $r182 = $r166.getArrayOfMenuItem();
            $r166.submitList($r182);
            InterfaceC8209a $r68 = getBinding();
            ViewDashboardHomeBinding $r78 = (ViewDashboardHomeBinding) $r68;
            NavigationViewBottomBinding $r22 = $r78.navBottom;
            Log_OC.loadImage($r22, "binding.navBottom");
            ViewGroup $r23 = $r22.exitLinearLayout;
            ViewGroup r40 = $r23;
            r40.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.home.SubscribeActivity$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeActivity $r2 = HomeActivity.this;
                    HomeActivity.m39275onCreate$lambda0($r2, view);
                }
            });
            InterfaceC8209a $r69 = getBinding();
            ViewDashboardHomeBinding $r79 = (ViewDashboardHomeBinding) $r69;
            DrawerLayout $r143 = $r79.drawerLayout;
            $r143.m36053a(new DrawerLayout.InterfaceC1409d() { // from class: ai.kudi.agent.home.HomeActivity$onCreate$3
                @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1409d
                public void onDrawerClosed(View view) {
                    Log_OC.getArray(view, "drawerView");
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1409d
                public void onDrawerOpened(View view) {
                    Log_OC.getArray(view, "drawerView");
                    HomeActivity $r32 = HomeActivity.this;
                    HomePresenter $r13 = $r32.getThisPresenter();
                    $r13.getWalletBalance();
                    HomeActivity $r33 = HomeActivity.this;
                    $r33.removeOutletManagerItemIfChildOutlet();
                }

                @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1409d
                public void onDrawerSlide(View view, float f) {
                    Log_OC.getArray(view, "drawerView");
                }

                @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC1409d
                public void onDrawerStateChanged(int i) {
                }
            });
            checkNotificationIntent$default(this, null, 1, null);
            Pref $r26 = getPref();
            int $i02 = $r26.getIncompleteTransactionCount();
            if ($i02 <= 0) {
                hideBadge(C0001R.C0003id.navigation_transactions);
                return;
            }
            Pref $r262 = getPref();
            int $i03 = $r262.getIncompleteTransactionCount();
            showBadge(C0001R.C0003id.navigation_transactions, $i03);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        AppCompatActivity r10 = (AppCompatActivity) this;
        MenuInflater $r2 = r10.getMenuInflater();
        $r2.inflate(C0001R.C0005menu.home, menu);
        Log_OC.append(menu);
        final MenuItem $r3 = menu.findItem(C0001R.C0003id.action_notification);
        Log_OC.loadImage($r3, "menu!!.findItem(R.id.action_notification)");
        View $r4 = $r3.getActionView();
        Log_OC.loadImage($r4, "menuItem.actionView");
        View $r5 = $r4.findViewById(C0001R.C0003id.badgeCount);
        TextView $r6 = (TextView) $r5;
        this.notificationTextViewCount = $r6;
        this.overFlowMenu = menu;
        HomePresenter $r7 = getThisPresenter();
        $r7.getNotificationCount();
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.home.MainActivity$16
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity $r22 = HomeActivity.this;
                MenuItem $r32 = $r3;
                HomeActivity.m39276onCreateOptionsMenu$lambda3($r22, $r32, view);
            }
        });
        Activity r11 = (Activity) this;
        boolean $z0 = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator
    public void onIncompleteTransactionDetails(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "transaction");
        Context r3 = (Context) this;
        Intent $r1 = TransactionItemUiModelKt.detailsScreenIntent(transaction, r3);
        Activity r4 = (Activity) this;
        r4.startActivity($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.material.navigation.NavigationView.InterfaceC4704c
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r3 = (ViewDashboardHomeBinding) $r1;
        DrawerLayout $r4 = $r3.drawerLayout;
        $r4.m36050d(8388611);
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void onNewIntent(Intent intent) {
        FragmentActivity r2 = (FragmentActivity) this;
        super/*androidx.fragment.app.FragmentActivity*/.onNewIntent(intent);
        checkNotificationIntent(intent);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.p002ui.HomeFragment.OnFragmentInteractionListener
    public void onNotificationClicked() {
        HomePresenter $r1 = getThisPresenter();
        HomePresenter.logUnReadNotificationCountEvent$default($r1, false, 1, null);
        MvpActivity.Companion $r2 = MvpActivity.Companion;
        Activity r3 = (Activity) this;
        $r2.navigateToNotification(r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 != C0001R.C0003id.action_notification) {
            boolean $z0 = super.onOptionsItemSelected(menuItem);
            return $z0;
        }
        TextView $r2 = this.notificationTextViewCount;
        if ($r2 != null) {
            ViewExtKt.hide$default($r2, false, 1, null);
        }
        onNotificationClicked();
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onResume() {
        super.onResume();
        HomePresenter $r2 = getThisPresenter();
        $r2.fetchInsuranceStatus();
        HomePresenter $r22 = getThisPresenter();
        $r22.getWalletBalance();
        HomePresenter $r23 = getThisPresenter();
        $r23.getMonnifyDetails();
        FragmentActivity r5 = (FragmentActivity) this;
        FragmentManager $r3 = r5.getSupportFragmentManager();
        $r3.m35939g(new FragmentManager.InterfaceC1443m() { // from class: ai.kudi.agent.home.AboutFragment$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onClick() {
                HomeActivity $r1 = HomeActivity.this;
                HomeActivity.m39277onResume$lambda4($r1);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.p002ui.HomeFragment.OnFragmentInteractionListener
    public void onShowActivityToolbar(boolean z) {
        if (z) {
            AppCompatActivity r2 = (AppCompatActivity) this;
            AbstractC0925a $r1 = r2.getSupportActionBar();
            if ($r1 == null) {
                return;
            }
            $r1.mo37629E();
            return;
        }
        AppCompatActivity r22 = (AppCompatActivity) this;
        AbstractC0925a $r12 = r22.getSupportActionBar();
        if ($r12 == null) {
            return;
        }
        $r12.mo37607l();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.bills.p002ui.HomeFragment.OnFragmentInteractionListener
    public void onToggleDrawerLayout() {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        DrawerLayout $r3 = $r2.drawerLayout;
        int $i0 = $r3.m36037q(8388611);
        InterfaceC8209a $r12 = getBinding();
        ViewDashboardHomeBinding $r22 = (ViewDashboardHomeBinding) $r12;
        DrawerLayout $r32 = $r22.drawerLayout;
        boolean $z0 = $r32.m36071F(8388611);
        if ($z0 && $i0 != 2) {
            InterfaceC8209a $r13 = getBinding();
            ViewDashboardHomeBinding $r23 = (ViewDashboardHomeBinding) $r13;
            DrawerLayout $r33 = $r23.drawerLayout;
            $r33.m36050d(8388611);
        } else if ($i0 != 1) {
            InterfaceC8209a $r14 = getBinding();
            ViewDashboardHomeBinding $r24 = (ViewDashboardHomeBinding) $r14;
            DrawerLayout $r34 = $r24.drawerLayout;
            $r34.m36066K(8388611);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -122
        	at java.util.BitSet.get(BitSet.java:623)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void openPageByType(java.lang.String r136) {
        /*
            Method dump skipped, instructions count: 2093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.home.HomeActivity.openPageByType(java.lang.String):void");
    }

    public final void setAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.kudi.agent.home.HomeView
    public void setCashInsuranceState(CashInsuranceState cashInsuranceState) {
        NavigationListViewAdapter.MenuItem menuItem;
        NavigationListViewAdapter.MenuItem.State $r12;
        NavigationListViewAdapter.MenuItem $r8;
        Log_OC.getArray(cashInsuranceState, "cashInsuranceState");
        C1583u $r2 = this.cashInsuranceState;
        $r2.setValue(cashInsuranceState);
        NavigationListViewAdapter $r3 = this.navigationListAdapter;
        if ($r3 == null) {
            Log_OC.LogError("navigationListAdapter");
            NullPointerException r16 = new NullPointerException("Null throw statement replaced by Soot");
            throw r16;
        }
        ArrayList $r4 = $r3.getMenuItems();
        Iterator $r5 = $r4.iterator();
        while (true) {
            boolean $z0 = $r5.hasNext();
            if (!$z0) {
                menuItem = null;
                break;
            }
            Object $r6 = $r5.next();
            menuItem = $r6;
            String $r9 = ((NavigationListViewAdapter.MenuItem) $r6).getKey();
            String $r10 = ((Activity) this).getString(C0001R.string.cash_insurance_key);
            boolean $z02 = Log_OC.append($r9, $r10);
            if ($z02) {
                break;
            }
        }
        NavigationListViewAdapter.MenuItem $r82 = menuItem;
        if ($r82 == null) {
            $r8 = null;
        } else {
            Active $r11 = Active.INSTANCE;
            boolean $z03 = Log_OC.append(cashInsuranceState, $r11);
            if ($z03) {
                $r12 = NavigationListViewAdapter.MenuItem.State.LOADED;
            } else {
                NotActive $r13 = NotActive.INSTANCE;
                boolean $z04 = Log_OC.append(cashInsuranceState, $r13);
                if ($z04) {
                    $r12 = NavigationListViewAdapter.MenuItem.State.LOADED;
                } else {
                    Error $r14 = Error.INSTANCE;
                    boolean $z05 = Log_OC.append(cashInsuranceState, $r14);
                    if (!$z05) {
                        Throwable r17 = new NoWhenBranchMatchedException();
                        Throwable r19 = r17;
                        throw r19;
                    }
                    $r12 = NavigationListViewAdapter.MenuItem.State.LOADING;
                }
            }
            $r8 = NavigationListViewAdapter.MenuItem.copy$default($r82, null, 0, null, false, false, null, $r12, 63, null);
        }
        if ($r8 == null) {
            return;
        }
        NavigationListViewAdapter $r32 = this.navigationListAdapter;
        if ($r32 != null) {
            $r32.updateMenuList($r8);
            return;
        }
        Log_OC.LogError("navigationListAdapter");
        NullPointerException r162 = new NullPointerException("Null throw statement replaced by Soot");
        throw r162;
    }

    public final void setFragmentManager(FragmentManager fragmentManager) {
        Log_OC.getArray(fragmentManager, "<set-?>");
        this.fragmentManager = fragmentManager;
    }

    public final void setOutletMenuItem(NavigationListViewAdapter.MenuItem menuItem) {
        Log_OC.getArray(menuItem, "<set-?>");
        this.outletMenuItem = menuItem;
    }

    public final void setPref(Pref pref) {
        Log_OC.getArray(pref, "<set-?>");
        this.pref = pref;
    }

    public final void setSharedPref(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPref = sharedPreferences;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setThisPresenter(HomePresenter homePresenter) {
        Log_OC.getArray(homePresenter, "<set-?>");
        this.thisPresenter = homePresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setToolbarTitle(String str) {
        Log_OC.getArray(str, AttributeType.TEXT);
        InterfaceC8209a $r2 = getBinding();
        ViewDashboardHomeBinding $r3 = (ViewDashboardHomeBinding) $r2;
        AppBarHomeBinding $r4 = $r3.appBarHomeBinding;
        Toolbar $r5 = $r4.toolbar;
        $r5.setTitle(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void showError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        Context r2 = (Context) this;
        ContextExtKt.toast$default(r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoader() {
        InterfaceC8209a $r1 = getBinding();
        ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
        AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
        ViewLoaderBinding $r4 = $r3.loaderView;
        View $r5 = $r4.getRoot();
        Log_OC.loadImage($r5, "binding.appBarHomeBinding.loaderView.root");
        View r6 = $r5;
        ViewExtKt.show(r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void showMonnifyDetails(List list) {
        Log_OC.getArray(list, "miniMonnifyDetails");
        boolean $z0 = list.isEmpty();
        if (!$z0) {
            InterfaceC8209a $r2 = getBinding();
            ViewDashboardHomeBinding $r3 = (ViewDashboardHomeBinding) $r2;
            NavHeaderHomeBinding $r4 = $r3.navHeader;
            TextView $r5 = $r4.viewAllButton;
            Log_OC.loadImage($r5, "binding.navHeader.viewAllButton");
            ViewExtKt.show($r5);
            Object $r6 = C13722p.m3952T(list);
            final MiniMonnifyDetails $r7 = (MiniMonnifyDetails) $r6;
            InterfaceC8209a $r22 = getBinding();
            ViewDashboardHomeBinding $r32 = (ViewDashboardHomeBinding) $r22;
            NavHeaderHomeBinding $r42 = $r32.navHeader;
            TextView $r52 = $r42.accountNumberTextView;
            String $r9 = $r7 == null ? null : $r7.getAccountNumber();
            $r52.setText($r9);
            InterfaceC8209a $r23 = getBinding();
            ViewDashboardHomeBinding $r33 = (ViewDashboardHomeBinding) $r23;
            NavHeaderHomeBinding $r43 = $r33.navHeader;
            TextView $r53 = $r43.bankNameTextView;
            String $r8 = $r7 != null ? $r7.getBankName() : null;
            $r53.setText($r8);
            InterfaceC8209a $r24 = getBinding();
            ViewDashboardHomeBinding $r34 = (ViewDashboardHomeBinding) $r24;
            NavHeaderHomeBinding $r44 = $r34.navHeader;
            $r44.viewAllButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.home.NoteEditor$4
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeActivity $r25 = HomeActivity.this;
                    HomeActivity.m39278showMonnifyDetails$lambda7($r25, view);
                }
            });
            InterfaceC8209a $r25 = getBinding();
            ViewDashboardHomeBinding $r35 = (ViewDashboardHomeBinding) $r25;
            NavHeaderHomeBinding $r45 = $r35.navHeader;
            $r45.copyKtaButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.home.MainActivity$5
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MiniMonnifyDetails $r26 = MiniMonnifyDetails.this;
                    HomeActivity $r36 = this;
                    HomeActivity.m39279showMonnifyDetails$lambda9($r26, $r36, view);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void showTodoList(List list) {
        Log_OC.getArray(list, "todoList");
        TodoListAdapter $r2 = this.todoListAdapter;
        if ($r2 == null) {
            return;
        }
        $r2.setData(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void showTodoLoading(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
            AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
            ProgressBar $r4 = $r3.todoProgressBar;
            Log_OC.loadImage($r4, "binding.appBarHomeBinding.todoProgressBar");
            ViewExtKt.show($r4);
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ViewDashboardHomeBinding $r22 = (ViewDashboardHomeBinding) $r12;
        AppBarHomeBinding $r32 = $r22.appBarHomeBinding;
        ProgressBar $r42 = $r32.todoProgressBar;
        Log_OC.loadImage($r42, "binding.appBarHomeBinding.todoProgressBar");
        ViewExtKt.hide$default($r42, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void showVerifyPrompt(VerifyStateResult verifyStateResult, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(verifyStateResult, "result");
        Log_OC.getArray(interfaceC11756a, "buttonClickListener");
        int[] $r3 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r3[verifyStateResult.ordinal()];
        if ($i0 != 1) {
            if ($i0 != 2) {
                return;
            }
            CustomDialog.Companion $r4 = CustomDialog.Companion;
            Context r11 = (Context) this;
            Drawable $r5 = C1335a.m36322f(r11, C0001R.C0002drawable.ic_follow);
            String $r6 = ((Activity) this).getString(C0001R.string.verified_message);
            Log_OC.loadImage($r6, "getString(R.string.verified_message)");
            String $r7 = ((Activity) this).getString(C0001R.string.homepage);
            Log_OC.loadImage($r7, "getString(R.string.homepage)");
            Context r112 = (Context) this;
            $r4.show($r5, null, $r6, $r7, r112, null);
            return;
        }
        CustomDialog.Companion $r42 = CustomDialog.Companion;
        Context r113 = (Context) this;
        Drawable $r52 = C1335a.m36322f(r113, C0001R.C0002drawable.ic_unfollow);
        Activity r12 = (Activity) this;
        String $r62 = r12.getString(C0001R.string.verify_title);
        Activity r122 = (Activity) this;
        String $r72 = r122.getString(C0001R.string.verify_message);
        Log_OC.loadImage($r72, "getString(R.string.verify_message)");
        Activity r123 = (Activity) this;
        String $r8 = r123.getString(C0001R.string.verify_acct);
        Log_OC.loadImage($r8, "getString(R.string.verify_acct)");
        Context r114 = (Context) this;
        $r42.show($r52, $r62, $r72, $r8, r114, new CustomDialog.ClickListeners() { // from class: ai.kudi.agent.home.HomeActivity$showVerifyPrompt$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.util.CustomDialog.ClickListeners
            public void onActionButtonClick() {
                InterfaceC11756a $r1 = InterfaceC11756a.this;
                $r1.invoke();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.core.util.CustomDialog.ClickListeners
            public void onBackButtonClick() {
                HomeActivity $r1 = this;
                Activity r2 = (Activity) $r1;
                r2.finishAffinity();
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator
    public void toDisputeIssueFragment(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, TransactionBreakDownItemType.DATA);
        HomeActivity$toDisputeIssueFragment$1 r3 = new HomeActivity$toDisputeIssueFragment$1(ticket);
        Context r4 = (Context) this;
        ContextExtKt.launchActivity$default(r4, false, IssueActivity.class, (InterfaceC11767l) r3, 1, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator
    public void toIssueContactUsFragment() {
        Context r4 = (Context) this;
        Intent r3 = new Intent(r4, IssueActivity.class);
        HomeToIssueScreenNavigationType $r2 = HomeToIssueScreenNavigationType.CONTACT_US;
        r3.putExtra(IssueActivity.BUNDLE_KEY_HOME_NAV_TYPE, $r2);
        Activity r5 = (Activity) this;
        r5.startActivity(r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator
    public void toIssueDetailFragment(IssueCategory issueCategory) {
        Log_OC.getArray(issueCategory, TransactionBreakDownItemType.DATA);
        Context r5 = (Context) this;
        Intent r4 = new Intent(r5, IssueActivity.class);
        HomeToIssueScreenNavigationType $r3 = HomeToIssueScreenNavigationType.ISSUE_DETAIL;
        r4.putExtra(IssueActivity.BUNDLE_KEY_HOME_NAV_TYPE, $r3);
        r4.putExtra(IssueActivity.BUNDLE_KEY_ISSUE_CATEGORY, issueCategory);
        Activity r6 = (Activity) this;
        r6.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator
    public void toIssueTypeFragment(IssueCategory issueCategory) {
        Log_OC.getArray(issueCategory, TransactionBreakDownItemType.DATA);
        Context r5 = (Context) this;
        Intent r4 = new Intent(r5, IssueActivity.class);
        HomeToIssueScreenNavigationType $r3 = HomeToIssueScreenNavigationType.ISSUE_TYPE;
        r4.putExtra(IssueActivity.BUNDLE_KEY_HOME_NAV_TYPE, $r3);
        r4.putExtra(IssueActivity.BUNDLE_KEY_ISSUE_CATEGORY, issueCategory);
        Activity r6 = (Activity) this;
        r6.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleBottomNav(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ViewDashboardHomeBinding $r2 = (ViewDashboardHomeBinding) $r1;
            AppBarHomeBinding $r3 = $r2.appBarHomeBinding;
            ContentHomeBinding $r4 = $r3.defaultView;
            View $r5 = $r4.bottomNavigationView;
            Log_OC.loadImage($r5, "binding.appBarHomeBinding.defaultView.bottomNavigationView");
            View r6 = $r5;
            ViewExtKt.show(r6);
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ViewDashboardHomeBinding $r22 = (ViewDashboardHomeBinding) $r12;
        AppBarHomeBinding $r32 = $r22.appBarHomeBinding;
        ContentHomeBinding $r42 = $r32.defaultView;
        View $r52 = $r42.bottomNavigationView;
        Log_OC.loadImage($r52, "binding.appBarHomeBinding.defaultView.bottomNavigationView");
        View r62 = $r52;
        ViewExtKt.hide$default(r62, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.home.HomeView
    public void toggleKCashFeature(boolean z) {
        if (z) {
            NavigationListViewAdapter $r3 = this.navigationListAdapter;
            if ($r3 == null) {
                Log_OC.LogError("navigationListAdapter");
                NullPointerException r4 = new NullPointerException("Null throw statement replaced by Soot");
                throw r4;
            }
            NavigationListViewAdapter.MenuItem.UserType $r1 = NavigationListViewAdapter.MenuItem.UserType.AGENT;
            NavigationListViewAdapter.MenuItem $r2 = new NavigationListViewAdapter.MenuItem("K-Cash", C0001R.C0002drawable.ic_menu_kcash, "kCash", false, false, $r1, null, 88, null);
            $r3.addMenuItem($r2);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleOverflowMenu(boolean z) {
        Menu $r1 = this.overFlowMenu;
        if ($r1 != null) {
            if (z) {
                Log_OC.append($r1);
                $r1.clear();
            } else {
                Log_OC.append($r1);
                $r1.clear();
            }
            onCreateOptionsMenu(this.overFlowMenu);
        }
    }
}
