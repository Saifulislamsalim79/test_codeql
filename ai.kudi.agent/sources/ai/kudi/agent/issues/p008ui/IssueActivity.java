package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.domain.room_entities.IssueCategory;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.custom.views.CircuilarRevealKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.ActivityIssueBinding;
import ai.kudi.agent.inbox.navigators.InboxNavigator;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.navigators.HomeToIssueScreenNavigationType;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.p008ui.CustomerDetailsIssueFragment;
import ai.kudi.agent.issues.p008ui.DelayedKTAtopUpFragment;
import ai.kudi.agent.issues.p008ui.DisputeIssueFragment;
import ai.kudi.agent.issues.p008ui.IssueDetailFragment;
import ai.kudi.agent.issues.p008ui.IssueResolutionFragment;
import ai.kudi.agent.issues.p008ui.IssueSummaryFragment;
import ai.kudi.agent.issues.p008ui.IssueTypeFragmentNew;
import ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment;
import ai.kudi.agent.issues.p008ui.KYCformIssueFragment;
import ai.kudi.agent.issues.p008ui.PosTerminalIssuesFragment;
import ai.kudi.agent.issues.p008ui.SubmitWithdrawalIssueFragment;
import ai.kudi.agent.issues.p008ui.TransactionListFragment;
import ai.kudi.agent.issues.p008ui.viewModels.IssueDetailsViewModel;
import ai.kudi.agent.issues.presenters.IssueContainerPresenter;
import ai.kudi.agent.issues.viewmodels.model.IssueLabels;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.views.IssueContainerView;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.data.model.NotificationModelKt;
import ai.kudi.agent.pin.KudiPin;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import dagger.android.C7427a;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import dagger.android.d;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p590o.p591a.Timber;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: IssueActivity.kt */
@Metadata(m10422d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 z2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001zB\u0005¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001005H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000208H\u0002J\b\u0010:\u001a\u00020;H\u0002J\u000e\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020>J\u0010\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020>H\u0016J\u0010\u0010A\u001a\u00020;2\u0006\u0010B\u001a\u00020>H\u0016J\b\u0010C\u001a\u00020;H\u0016J\b\u0010D\u001a\u00020;H\u0016J\u0012\u0010E\u001a\u00020;2\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\u0012\u0010H\u001a\u00020I2\b\u0010!\u001a\u0004\u0018\u00010%H\u0016J\b\u0010J\u001a\u00020;H\u0002J\u0010\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020\u001cH\u0016J\u0010\u0010M\u001a\u00020;2\u0006\u0010N\u001a\u00020GH\u0014J\b\u0010O\u001a\u00020;H\u0016J\b\u0010P\u001a\u00020;H\u0016J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020RH\u0002J\u000e\u0010T\u001a\u00020;2\u0006\u0010U\u001a\u00020IJ\b\u0010V\u001a\u00020;H\u0002J\u0010\u0010W\u001a\u00020;2\u0006\u0010X\u001a\u00020>H\u0016J\u001c\u0010Y\u001a\u00020;2\b\b\u0001\u0010S\u001a\u00020R2\b\b\u0001\u0010Z\u001a\u00020RH\u0016J8\u0010[\u001a\u00020;2\u0006\u0010\\\u001a\u00020>2\u0006\u0010]\u001a\u00020>2\u0006\u0010^\u001a\u00020>2\u0006\u0010_\u001a\u00020I2\u000e\u0010`\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010aH\u0016J\u0018\u0010b\u001a\u00020;2\u0006\u0010c\u001a\u00020\u00162\u0006\u0010d\u001a\u00020IH\u0016J\u0010\u0010e\u001a\u00020;2\u0006\u0010f\u001a\u00020\u0016H\u0016J\u0010\u0010g\u001a\u00020;2\u0006\u0010h\u001a\u00020iH\u0016J\u0010\u0010j\u001a\u00020;2\u0006\u0010k\u001a\u00020iH\u0016J\u0012\u0010l\u001a\u00020;2\b\u0010k\u001a\u0004\u0018\u00010iH\u0016J\b\u0010m\u001a\u00020;H\u0016J\b\u0010n\u001a\u00020;H\u0016J\u0010\u0010o\u001a\u00020;2\u0006\u0010h\u001a\u00020pH\u0016J\u0010\u0010q\u001a\u00020;2\u0006\u0010c\u001a\u00020\u0016H\u0016J\u0010\u0010r\u001a\u00020;2\u0006\u0010c\u001a\u00020\u0016H\u0016J\u0010\u0010s\u001a\u00020;2\u0006\u0010h\u001a\u00020pH\u0016J\u0018\u0010t\u001a\u00020;2\u0006\u0010u\u001a\u00020>2\u0006\u0010v\u001a\u00020>H\u0016J\u0010\u0010w\u001a\u00020;2\u0006\u0010c\u001a\u00020\u0016H\u0016J\u0010\u0010x\u001a\u00020;2\u0006\u0010c\u001a\u00020\u0016H\u0016J\u0010\u0010y\u001a\u00020;2\u0006\u0010f\u001a\u00020\u0016H\u0016R\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006{"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueActivity;", "Ldagger/android/HasAndroidInjector;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/issues/views/IssueContainerView;", "Lai/kudi/agent/issues/presenters/IssueContainerPresenter;", "Lai/kudi/agent/feature_issue_resolution/databinding/ActivityIssueBinding;", "Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "Lai/kudi/agent/inbox/navigators/InboxNavigator;", "Lai/kudi/agent/issues/ui/IssuesTermsAndConditionsFragment$OnFragmentCallBack;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/ActivityIssueBinding;", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "issueModule", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "getIssueModule", "()Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "setIssueModule", "(Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;)V", "itemSearch", "Landroid/view/MenuItem;", "getItemSearch", "()Landroid/view/MenuItem;", "setItemSearch", "(Landroid/view/MenuItem;)V", "menu", "getMenu", "setMenu", "searchMenu", "Landroid/view/Menu;", "getSearchMenu", "()Landroid/view/Menu;", "setSearchMenu", "(Landroid/view/Menu;)V", "searchView", "Landroidx/appcompat/widget/SearchView;", "getSearchView", "()Landroidx/appcompat/widget/SearchView;", "setSearchView", "(Landroidx/appcompat/widget/SearchView;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/issues/presenters/IssueContainerPresenter;", "setThisPresenter", "(Lai/kudi/agent/issues/presenters/IssueContainerPresenter;)V", "Ldagger/android/AndroidInjector;", "createPresenter", "getContactUsFragment", "Landroidx/fragment/app/Fragment;", "getIssueTypeFragment", "initSearchView", "", "launchWebsite", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "", "makeACall", "phoneNumber", "navigateToEnquiryLink", "enquiryLink", "navigateToTermsAndConditionsFragment", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "onNavigationFromHome", "onOptionsItemSelected", "item", "onSaveInstanceState", "outState", "pop", "sendEmail", "setColor", "", "toolBarColor", "setIconVisibility", AttributeType.BOOLEAN, "setSearchtoolbar", "setTitle", KudiPin.KUDI_PIN_TITLE, "setToolBarColor", "textColor", "showTicketResponse", "titleText", "msgText", "actionBtnText", "shouldDismissImmediately", "action", "Lkotlin/Function0;", "toCustomerDetailsFragment", "issueData", "isFromChargeBackDialog", "toDelayedKtaTopUp", "issueTypeModel", "toDisputeIssueFragment", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "toDisputeIssueView", "ticket", "toDisputeView", "toInboxView", "toIssueContactUsFragment", "toIssueDetailFragment", "Lai/kudi/agent/core/domain/room_entities/IssueCategory;", "toIssueResolutionFragment", "toIssueSummaryFragment", "toIssueTypeFragment", "toKycFormIssue", "issueType", "issueDetail", "toPosTerminalIssue", "toTransactionListView", "toWithdrawalIssue", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueActivity */
/* loaded from: classes.dex */
public final class IssueActivity extends MvpActivity<IssueContainerView, IssueContainerPresenter, ActivityIssueBinding> implements d, IssueTypeHomeNavigator, IssueTypeNavigator, InboxNavigator, IssuesTermsAndConditionsFragment.OnFragmentCallBack {
    public static final String BUNDLE_KEY_HOME_NAV_TYPE = "BUNDLE_KEY_HOME_NAV_TYPE";
    public static final String BUNDLE_KEY_ISSUE_CATEGORY = "BUNDLE_KEY_ISSUE_CATEGORY";
    public static final String BUNDLE_KEY_ISSUE_TICKET = "BUNDLE_KEY_ISSUE_TICKET";
    public static final Companion Companion;
    public static final String ISSUE_MODEL = "ISSUE_MODEL";
    public DispatchingAndroidInjector<Object> androidInjector;
    public IssueTypeModel issueModule;
    private MenuItem itemSearch;
    private MenuItem menu;
    private Menu searchMenu;
    private SearchView searchView;
    public IssueContainerPresenter thisPresenter;

    /* compiled from: IssueActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueActivity$Companion;", "", "()V", IssueActivity.BUNDLE_KEY_HOME_NAV_TYPE, "", IssueActivity.BUNDLE_KEY_ISSUE_CATEGORY, IssueActivity.BUNDLE_KEY_ISSUE_TICKET, IssueActivity.ISSUE_MODEL, "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: IssueActivity.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.IssueActivity$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            HomeToIssueScreenNavigationType[] $r0 = HomeToIssueScreenNavigationType.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            HomeToIssueScreenNavigationType $r2 = HomeToIssueScreenNavigationType.CONTACT_US;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            HomeToIssueScreenNavigationType $r22 = HomeToIssueScreenNavigationType.ISSUE_DETAIL;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            HomeToIssueScreenNavigationType $r23 = HomeToIssueScreenNavigationType.ISSUE_TYPE;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            HomeToIssueScreenNavigationType $r24 = HomeToIssueScreenNavigationType.ISSUE_STATUS;
            int $i05 = $r24.ordinal();
            $r1[$i05] = 4;
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
    private final Fragment getContactUsFragment() {
        FragmentActivity r7 = (FragmentActivity) this;
        FragmentManager $r1 = r7.getSupportFragmentManager();
        String $r3 = ContactUsFragment.class.getCanonicalName();
        Fragment $r4 = $r1.m35938g0($r3);
        if ($r4 == null) {
            ContactUsFragment r6 = new ContactUsFragment();
            return r6;
        }
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Fragment getIssueTypeFragment() {
        FragmentActivity r7 = (FragmentActivity) this;
        FragmentManager $r1 = r7.getSupportFragmentManager();
        String $r3 = IssueTypeFragmentNew.class.getCanonicalName();
        Fragment $r4 = $r1.m35938g0($r3);
        if ($r4 == null) {
            IssueTypeFragmentNew r6 = new IssueTypeFragmentNew();
            return r6;
        }
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initSearchView() {
        Menu $r1 = this.searchMenu;
        View $r2 = null;
        if ($r1 != null) {
            int $i0 = C0214R.C0216id.action_filter_search;
            MenuItem $r3 = $r1.findItem($i0);
            if ($r3 != null) {
                $r2 = $r3.getActionView();
            }
        }
        if ($r2 == null) {
            NullPointerException r15 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
            throw r15;
        }
        SearchView $r4 = (SearchView) $r2;
        this.searchView = $r4;
        Log_OC.append($r4);
        $r4.setSubmitButtonEnabled(false);
        ViewGroup $r42 = this.searchView;
        Log_OC.append($r42);
        int $i02 = C0214R.C0216id.search_close_btn;
        ViewGroup r16 = $r42;
        View $r22 = r16.findViewById($i02);
        if ($r22 == null) {
            NullPointerException r152 = new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            throw r152;
        }
        ImageView $r5 = (ImageView) $r22;
        int $i03 = C0214R.C0215drawable.ic_close;
        Context r17 = (Context) this;
        Drawable $r6 = C1335a.m36322f(r17, $i03);
        Log_OC.append($r6);
        Drawable $r7 = $r6.mutate();
        int $i04 = C0214R.color.blackDatePickerTextColor;
        C1365a.m36188n($r7, setColor($i04));
        $r5.setImageDrawable($r6);
        ViewGroup $r43 = this.searchView;
        Log_OC.append($r43);
        int $i05 = C0214R.C0216id.search_src_text;
        ViewGroup r162 = $r43;
        View $r23 = r162.findViewById($i05);
        if ($r23 == null) {
            NullPointerException r153 = new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
            throw r153;
        }
        EditText $r8 = (EditText) $r23;
        $r8.setHint("Search..");
        $r8.setHintTextColor(-12303292);
        int $i06 = C0214R.color.secondaryTextColor;
        Context r172 = (Context) this;
        $r8.setTextColor(C1335a.m36324d(r172, $i06));
        ViewGroup $r44 = this.searchView;
        Log_OC.append($r44);
        int $i07 = C0214R.C0216id.search_src_text;
        ViewGroup r163 = $r44;
        View $r24 = r163.findViewById($i07);
        if ($r24 == null) {
            NullPointerException r154 = new NullPointerException("null cannot be cast to non-null type android.widget.AutoCompleteTextView");
            throw r154;
        }
        AutoCompleteTextView $r9 = (AutoCompleteTextView) $r24;
        try {
            Field $r11 = TextView.class.getDeclaredField("mCursorDrawableRes");
            $r11.setAccessible(true);
            int $i08 = C0214R.C0215drawable.search_cursor;
            Integer $r12 = Integer.valueOf($i08);
            $r11.set($r9, $r12);
        } catch (Exception $r13) {
            $r13.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39481onCreate$lambda0(IssueActivity issueActivity, View view) {
        Log_OC.getArray(issueActivity, "this$0");
        issueActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onNavigationFromHome() {
        Activity r13 = (Activity) this;
        Intent $r2 = r13.getIntent();
        Parcelable $r3 = $r2.getParcelableExtra(BUNDLE_KEY_ISSUE_CATEGORY);
        boolean $z0 = $r3 instanceof IssueCategory;
        Issue.Ticket $r4 = null;
        IssueCategory $r5 = $z0 ? (IssueCategory) $r3 : null;
        Activity r132 = (Activity) this;
        Intent $r22 = r132.getIntent();
        boolean $z02 = $r22.hasExtra(BUNDLE_KEY_ISSUE_TICKET);
        if ($z02) {
            Activity r133 = (Activity) this;
            Intent $r23 = r133.getIntent();
            Serializable $r6 = $r23.getSerializableExtra(BUNDLE_KEY_ISSUE_TICKET);
            boolean $z03 = $r6 instanceof Issue.Ticket;
            if ($z03) {
                $r4 = (Issue.Ticket) $r6;
            }
        }
        Activity r134 = (Activity) this;
        Intent $r24 = r134.getIntent();
        Serializable $r62 = $r24.getSerializableExtra(BUNDLE_KEY_HOME_NAV_TYPE);
        if ($r62 == null) {
            NullPointerException r12 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.navigators.HomeToIssueScreenNavigationType");
            throw r12;
        }
        HomeToIssueScreenNavigationType $r7 = (HomeToIssueScreenNavigationType) $r62;
        int[] $r8 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r8[$r7.ordinal()];
        if ($i0 == 1) {
            toIssueContactUsFragment();
        } else if ($i0 == 2) {
            if ($r5 != null) {
                toIssueDetailFragment($r5);
                return;
            }
            String $r1 = "Required value was null.".toString();
            IllegalArgumentException r11 = new IllegalArgumentException($r1);
            throw r11;
        } else if ($i0 == 3) {
            if ($r5 != null) {
                toIssueTypeFragment($r5);
                return;
            }
            String $r12 = "Required value was null.".toString();
            IllegalArgumentException r112 = new IllegalArgumentException($r12);
            throw r112;
        } else if ($i0 != 4) {
        } else {
            if ($r4 != null) {
                toDisputeIssueFragment($r4);
                return;
            }
            String $r13 = "Required value was null.".toString();
            IllegalArgumentException r113 = new IllegalArgumentException($r13);
            throw r113;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int setColor(int i) {
        Context r1 = (Context) this;
        int $i0 = C1335a.m36324d(r1, i);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setSearchtoolbar() {
        MenuItem $r6;
        InterfaceC8209a $r1 = getBinding();
        ActivityIssueBinding $r2 = (ActivityIssueBinding) $r1;
        Toolbar $r3 = $r2.searchToolbar;
        if ($r3 == null) {
            Log.d("toolbar", "toolbar: NULL");
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityIssueBinding $r22 = (ActivityIssueBinding) $r12;
        Toolbar $r32 = $r22.searchToolbar;
        int $i0 = C0214R.C0218menu.search_menu;
        $r32.inflateMenu($i0);
        InterfaceC8209a $r13 = getBinding();
        ActivityIssueBinding $r23 = (ActivityIssueBinding) $r13;
        Toolbar $r33 = $r23.searchToolbar;
        this.searchMenu = $r33.getMenu();
        InterfaceC8209a $r14 = getBinding();
        ActivityIssueBinding $r24 = (ActivityIssueBinding) $r14;
        Toolbar $r34 = $r24.searchToolbar;
        $r34.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.SearchResultsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueActivity $r25 = IssueActivity.this;
                IssueActivity.m39482setSearchtoolbar$lambda1($r25, view);
            }
        });
        Menu $r4 = this.searchMenu;
        if ($r4 == null) {
            $r6 = null;
        } else {
            int $i02 = C0214R.C0216id.action_filter_search;
            $r6 = $r4.findItem($i02);
        }
        this.itemSearch = $r6;
        if ($r6 != null) {
            $r6.setOnActionExpandListener(new MenuItem.OnActionExpandListener() { // from class: ai.kudi.agent.issues.ui.IssueActivity$setSearchtoolbar$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.MenuItem.OnActionExpandListener
                public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                    int $i03 = Build.VERSION.SDK_INT;
                    if ($i03 < 21) {
                        IssueActivity $r25 = IssueActivity.this;
                        InterfaceC8209a $r35 = $r25.getBinding();
                        ActivityIssueBinding $r42 = (ActivityIssueBinding) $r35;
                        View $r5 = $r42.searchToolbar;
                        Log_OC.loadImage($r5, "binding.searchToolbar");
                        View r6 = $r5;
                        ViewExtKt.hide$default(r6, false, 1, null);
                        return true;
                    }
                    IssueActivity $r26 = IssueActivity.this;
                    InterfaceC8209a $r36 = $r26.getBinding();
                    ActivityIssueBinding $r43 = (ActivityIssueBinding) $r36;
                    View $r52 = $r43.searchToolbar;
                    Log_OC.loadImage($r52, "binding.searchToolbar");
                    IssueActivity $r27 = IssueActivity.this;
                    View r62 = $r52;
                    Context r7 = (Context) $r27;
                    CircuilarRevealKt.circleReveal(r62, 1, true, false, r7);
                    return true;
                }

                @Override // android.view.MenuItem.OnActionExpandListener
                public boolean onMenuItemActionExpand(MenuItem menuItem) {
                    return true;
                }
            });
        }
        initSearchView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setSearchtoolbar$lambda-1  reason: not valid java name */
    public static final void m39482setSearchtoolbar$lambda1(IssueActivity issueActivity, View view) {
        Log_OC.getArray(issueActivity, "this$0");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 21) {
            InterfaceC8209a $r2 = issueActivity.getBinding();
            ActivityIssueBinding $r3 = (ActivityIssueBinding) $r2;
            ViewGroup r6 = $r3.toolbar;
            r6.setVisibility(8);
            return;
        }
        InterfaceC8209a $r22 = issueActivity.getBinding();
        ActivityIssueBinding $r32 = (ActivityIssueBinding) $r22;
        Toolbar $r4 = $r32.searchToolbar;
        Log_OC.loadImage($r4, "binding.searchToolbar");
        Context r5 = (Context) issueActivity;
        CircuilarRevealKt.circleReveal($r4, 1, true, false, r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Registry androidInjector() {
        DispatchingAndroidInjector $r1 = getAndroidInjector();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public IssueContainerPresenter createPresenter() {
        IssueContainerPresenter $r1 = getThisPresenter();
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
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void doFetch() {
        IssueActivity$pop$1 $r1 = IssueActivity$pop$1.INSTANCE;
        AppCompatActivity r2 = (AppCompatActivity) this;
        AppCompatActivityExtKt.add(r2, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityIssueBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityIssueBinding $r2 = ActivityIssueBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityIssueBinding $r1 = getActivityBinding();
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
    public final IssueTypeModel getIssueModule() {
        IssueTypeModel $r1 = this.issueModule;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("issueModule");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MenuItem getItemSearch() {
        MenuItem r1 = this.itemSearch;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MenuItem getMenu() {
        MenuItem r1 = this.menu;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Menu getSearchMenu() {
        Menu r1 = this.searchMenu;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SearchView getSearchView() {
        SearchView r1 = this.searchView;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IssueContainerPresenter getThisPresenter() {
        IssueContainerPresenter $r1 = this.thisPresenter;
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
    public final void launchWebsite(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        try {
            Uri $r1 = Uri.parse(str);
            Intent r5 = new Intent("android.intent.action.VIEW", $r1);
            Activity r6 = (Activity) this;
            r6.startActivity(r5);
        } catch (ActivityNotFoundException e) {
            Context r7 = (Context) this;
            ContextExtKt.toast$default(r7, "Couldn't find app to open url on this device", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void makeACall(String str) {
        Log_OC.getArray(str, "phoneNumber");
        Intent r4 = new Intent("android.intent.action.DIAL");
        String $r1 = Log_OC.m10359a("tel:", (Object) str);
        Uri $r3 = Uri.parse($r1);
        r4.setData($r3);
        Activity r5 = (Activity) this;
        r5.startActivity(r4);
    }

    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void navigateToEnquiryLink(String str) {
        Log_OC.getArray(str, "enquiryLink");
        launchWebsite(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void navigateToTermsAndConditionsFragment() {
        IssuesTermsAndConditionsFragment r2 = new IssuesTermsAndConditionsFragment();
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r3 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r3, r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        FragmentActivity r2 = (FragmentActivity) this;
        FragmentManager $r1 = r2.getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            Activity r3 = (Activity) this;
            r3.finish();
            return;
        }
        ComponentActivity r4 = (ComponentActivity) this;
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    protected void onCreate(Bundle bundle) {
        String $r7;
        Activity r38 = (Activity) this;
        C7427a.m18756a(r38);
        super.onCreate(bundle);
        AppCompatActivity r39 = (AppCompatActivity) this;
        r39.invalidateOptionsMenu();
        InterfaceC8209a $r2 = getBinding();
        Toolbar $r4 = ((ActivityIssueBinding) $r2).toolbar;
        AppCompatActivity r392 = (AppCompatActivity) this;
        r392.setSupportActionBar($r4);
        InterfaceC8209a $r22 = getBinding();
        Toolbar $r42 = ((ActivityIssueBinding) $r22).toolbar;
        $r42.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.issues.ui.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IssueActivity $r23 = IssueActivity.this;
                IssueActivity.m39481onCreate$lambda0($r23, view);
            }
        });
        AppCompatActivity r393 = (AppCompatActivity) this;
        AbstractC0925a $r6 = r393.getSupportActionBar();
        if ($r6 != null) {
            int $i0 = C0214R.C0215drawable.ic_arrow_backward;
            $r6.mo37597z($i0);
        }
        int $i02 = C0214R.string.what_is_your_issue;
        Activity r382 = (Activity) this;
        String $r72 = r382.getString($i02);
        Log_OC.loadImage($r72, "getString(R.string.what_is_your_issue)");
        setTitle($r72);
        setSearchtoolbar();
        if (bundle == null) {
            Activity r383 = (Activity) this;
            Intent $r8 = r383.getIntent();
            boolean $z0 = $r8.hasExtra(BUNDLE_KEY_HOME_NAV_TYPE);
            if ($z0) {
                onNavigationFromHome();
                return;
            }
            Activity r384 = (Activity) this;
            Intent $r82 = r384.getIntent();
            boolean $z02 = $r82.hasExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
            if ($z02) {
                Activity r385 = (Activity) this;
                Intent $r83 = r385.getIntent();
                Serializable $r10 = $r83.getSerializableExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
                boolean $z03 = $r10 instanceof NotificationModel;
                $r9 = $z03 ? (NotificationModel) $r10 : null;
                if ($r9 != null) {
                    NotificationModel r40 = (NotificationModel) $r9;
                    boolean $z04 = r40.getMirrorStatus();
                    if (!$z04) {
                        IssueContainerPresenter $r11 = getThisPresenter();
                        NotificationModel r402 = (NotificationModel) $r9;
                        String $r73 = r402.getId();
                        IssueActivity$onCreate$2 $r12 = IssueActivity$onCreate$2.INSTANCE;
                        $r11.updateNotificationStatus($r73, $r12);
                    }
                    NotificationModel r403 = (NotificationModel) $r9;
                    String $r74 = r403.getReference();
                    HashMap r35 = new HashMap();
                    Issue.Ticket r36 = new Issue.Ticket($r74, null, null, null, null, null, null, r35, null, 382, null);
                    toDisputeView(r36);
                    return;
                }
                return;
            }
            Activity r386 = (Activity) this;
            Intent $r84 = r386.getIntent();
            boolean $z05 = $r84.hasExtra(ISSUE_MODEL);
            if ($z05) {
                Activity r387 = (Activity) this;
                Intent $r85 = r387.getIntent();
                Parcelable $r15 = $r85.getParcelableExtra(ISSUE_MODEL);
                if ($r15 == null) {
                    NullPointerException r37 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.issues.viewmodels.model.IssueTypeModel");
                    throw r37;
                } else {
                    IssueTypeModel $r16 = (IssueTypeModel) $r15;
                    setIssueModule($r16);
                }
            }
            IssueTypeModel $r162 = getIssueModule();
            Object[] $r18 = new Object[0];
            Timber.m1627e(Log_OC.m10359a("Issue Module ", $r162), $r18);
            IssueTypeModel $r163 = getIssueModule();
            String $r75 = $r163.getTransactionType();
            if ($r75 == null) {
                $r7 = null;
            } else {
                Locale $r19 = Locale.getDefault();
                Log_OC.loadImage($r19, "getDefault()");
                String $r20 = $r75.toLowerCase($r19);
                $r7 = $r20;
                Log_OC.loadImage($r20, "(this as java.lang.String).toLowerCase(locale)");
            }
            boolean $z06 = Log_OC.append($r7, "pos");
            if ($z06) {
                IssueTypeModel $r164 = getIssueModule();
                boolean $z07 = $r164.getShouldSkipInfo();
                if ($z07) {
                    IssueResolutionFragment.Companion $r21 = IssueResolutionFragment.Companion;
                    IssueTypeModel $r165 = getIssueModule();
                    IssueTypeModel $r222 = getIssueModule();
                    String $r76 = $r222.getLabel();
                    IssueTypeModel $r223 = getIssueModule();
                    Fragment $r23 = $r21.newInstance($r165, $r76, $r223.getTitle());
                    int $i03 = C0214R.C0216id.issueContainerFrameLayout;
                    AppCompatActivity r394 = (AppCompatActivity) this;
                    Fragment r41 = $r23;
                    AppCompatActivityExtKt.startFragment$default(r394, r41, $i03, false, false, false, 12, null);
                    return;
                }
            }
            IssueTypeModel $r166 = getIssueModule();
            String $r77 = $r166.getTransactionType();
            if ($r77 != null) {
                Locale $r192 = Locale.getDefault();
                Log_OC.loadImage($r192, "getDefault()");
                Serializable $r78 = $r77.toLowerCase($r192);
                $r9 = $r78;
                Log_OC.loadImage($r78, "(this as java.lang.String).toLowerCase(locale)");
            }
            boolean $z08 = Log_OC.append($r9, "pos");
            if (!$z08) {
                IssueTypeModel $r167 = getIssueModule();
                boolean $z09 = $r167.getShouldSkipInfo();
                if ($z09) {
                    IssueSummaryFragment.Companion $r24 = IssueSummaryFragment.Companion;
                    IssueTypeModel $r168 = getIssueModule();
                    Fragment $r25 = $r24.newInstance($r168);
                    int $i04 = C0214R.C0216id.issueContainerFrameLayout;
                    AppCompatActivity r395 = (AppCompatActivity) this;
                    Fragment r412 = $r25;
                    AppCompatActivityExtKt.startFragment$default(r395, r412, $i04, false, false, false, 12, null);
                    return;
                }
            }
            IssueTypeModel $r169 = getIssueModule();
            boolean $z010 = $r169.isFromTransactionPage();
            if ($z010) {
                IssueTypeModel $r1610 = getIssueModule();
                if ($r1610.getTicketResolved() != null) {
                    IssueTypeModel $r1611 = getIssueModule();
                    boolean $z011 = Log_OC.append($r1611.getTicketResolved(), "false");
                    if ($z011) {
                        DisputeIssueFragment.Companion $r26 = DisputeIssueFragment.Companion;
                        IssueTypeModel $r1612 = getIssueModule();
                        String $r79 = $r1612.getTicketId();
                        Log_OC.append($r79);
                        HashMap r352 = new HashMap();
                        Issue.Ticket r362 = new Issue.Ticket($r79, null, null, null, null, null, null, r352, null, 382, null);
                        Fragment $r27 = DisputeIssueFragment.Companion.newInstance$default($r26, r362, false, false, 6, null);
                        int $i05 = C0214R.C0216id.issueContainerFrameLayout;
                        AppCompatActivity r396 = (AppCompatActivity) this;
                        Fragment r413 = $r27;
                        AppCompatActivityExtKt.startFragment$default(r396, r413, $i05, false, false, false, 12, null);
                        return;
                    }
                }
                IssueDetailsViewModel.Companion $r28 = IssueDetailsViewModel.Companion;
                Map $r29 = $r28.getIssueTypeMap();
                IssueTypeModel $r1613 = getIssueModule();
                Object $r30 = $r29.get($r1613.getType());
                if ($r30 == null) {
                    IssueResolutionFragment.Companion $r212 = IssueResolutionFragment.Companion;
                    IssueTypeModel $r1614 = getIssueModule();
                    IssueTypeModel $r224 = getIssueModule();
                    String $r710 = $r224.getLabel();
                    IssueTypeModel $r225 = getIssueModule();
                    Fragment $r232 = $r212.newInstance($r1614, $r710, $r225.getTitle());
                    int $i06 = C0214R.C0216id.issueContainerFrameLayout;
                    AppCompatActivity r397 = (AppCompatActivity) this;
                    Fragment r414 = $r232;
                    AppCompatActivityExtKt.startFragment$default(r397, r414, $i06, false, false, false, 12, null);
                    return;
                }
                IssueTypeModel $r1615 = getIssueModule();
                String $r711 = $r1615.getLabel();
                IssueLabels $r31 = IssueLabels.CHARGE_BACK;
                boolean $z012 = Log_OC.append($r711, $r31.getLabel());
                if ($z012) {
                    IssueTypeModel $r1616 = getIssueModule();
                    toIssueResolutionFragment($r1616);
                    return;
                }
                IssueDetailFragment.Companion $r32 = IssueDetailFragment.Companion;
                IssueTypeModel $r1617 = getIssueModule();
                IssueDetailFragment $r33 = $r32.newInstance($r1617);
                int $i07 = C0214R.C0216id.issueContainerFrameLayout;
                AppCompatActivity r398 = (AppCompatActivity) this;
                AppCompatActivityExtKt.startFragment$default(r398, $r33, $i07, false, false, false, 12, null);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        AppCompatActivity r6 = (AppCompatActivity) this;
        MenuInflater $r3 = r6.getMenuInflater();
        $r3.inflate(C0214R.C0218menu.issue_resolution_menu, menu);
        Log_OC.append(menu);
        int $i1 = menu.size();
        if ($i1 > 0) {
            int $i2 = 0;
            while (true) {
                int $i0 = $i2 + 1;
                MenuItem $r4 = menu.getItem($i2);
                Drawable $r5 = $r4.getIcon();
                MenuItem $r42 = menu.getItem($i2);
                this.menu = $r42;
                if ($r5 != null) {
                    $r5.mutate();
                    int $i22 = C0214R.color.white;
                    int $i23 = setColor($i22);
                    PorterDuff.Mode $r1 = PorterDuff.Mode.SRC_ATOP;
                    $r5.setColorFilter($i23, $r1);
                }
                if ($i0 >= $i1) {
                    break;
                }
                $i2 = $i0;
            }
        }
        Activity r7 = (Activity) this;
        boolean $z0 = super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        int $i1 = C0214R.C0216id.search_menu;
        if ($i0 == $i1) {
            int $i02 = Build.VERSION.SDK_INT;
            if ($i02 >= 21) {
                InterfaceC8209a $r2 = getBinding();
                ActivityIssueBinding $r3 = (ActivityIssueBinding) $r2;
                View $r4 = $r3.searchToolbar;
                Log_OC.loadImage($r4, "binding.searchToolbar");
                View r6 = $r4;
                Context r7 = (Context) this;
                CircuilarRevealKt.circleReveal(r6, 1, true, true, r7);
            } else {
                InterfaceC8209a $r22 = getBinding();
                ActivityIssueBinding $r32 = (ActivityIssueBinding) $r22;
                View $r42 = $r32.searchToolbar;
                Log_OC.loadImage($r42, "binding.searchToolbar");
                View r62 = $r42;
                ViewExtKt.show(r62);
            }
            MenuItem $r5 = this.itemSearch;
            if ($r5 != null) {
                $r5.expandActionView();
            }
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a
    protected void onSaveInstanceState(Bundle bundle) {
        Log_OC.getArray(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Object[] $r2 = new Object[0];
        Timber.m1627e("onSaveInstanceState This was called now", $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void sendEmail() {
        String[] $r2 = {"support@nomba.com"};
        Intent r5 = new Intent("android.intent.action.SEND");
        Uri $r4 = Uri.parse("mailto:");
        r5.setData($r4);
        r5.setType("text/plain");
        r5.putExtra("android.intent.extra.EMAIL", $r2);
        try {
            Intent $r3 = Intent.createChooser(r5, "Send mail...");
            Activity r6 = (Activity) this;
            r6.startActivity($r3);
            Activity r62 = (Activity) this;
            r62.finish();
        } catch (ActivityNotFoundException e) {
            Context r7 = (Context) this;
            ContextExtKt.toast$default(r7, "There is no email client installed.", 0, 2, (Object) null);
        }
    }

    public final void setAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setIconVisibility(boolean z) {
        MenuItem $r1 = this.itemSearch;
        Log_OC.append($r1);
        $r1.setVisible(z);
    }

    public final void setIssueModule(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "<set-?>");
        this.issueModule = issueTypeModel;
    }

    public final void setItemSearch(MenuItem menuItem) {
        this.itemSearch = menuItem;
    }

    public final void setMenu(MenuItem menuItem) {
        this.menu = menuItem;
    }

    public final void setSearchMenu(Menu menu) {
        this.searchMenu = menu;
    }

    public final void setSearchView(SearchView searchView) {
        this.searchView = searchView;
    }

    public final void setThisPresenter(IssueContainerPresenter issueContainerPresenter) {
        Log_OC.getArray(issueContainerPresenter, "<set-?>");
        this.thisPresenter = issueContainerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment.OnFragmentCallBack
    public void setTitle(String str) {
        Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
        AppCompatActivity r3 = (AppCompatActivity) this;
        AbstractC0925a $r2 = r3.getSupportActionBar();
        if ($r2 == null) {
            return;
        }
        $r2.mo37631C(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.p008ui.IssuesTermsAndConditionsFragment.OnFragmentCallBack
    public void setToolBarColor(int i, int i2) {
        InterfaceC8209a $r1 = getBinding();
        ActivityIssueBinding $r2 = (ActivityIssueBinding) $r1;
        ViewGroup $r3 = $r2.toolbar;
        int $i0 = setColor(i);
        ViewGroup r5 = $r3;
        r5.setBackgroundColor($i0);
        InterfaceC8209a $r12 = getBinding();
        ActivityIssueBinding $r22 = (ActivityIssueBinding) $r12;
        Toolbar $r32 = $r22.toolbar;
        int $i02 = setColor(i2);
        $r32.setTitleTextColor($i02);
        int $i03 = C0214R.C0215drawable.ic_arrow_backward;
        Context r6 = (Context) this;
        Drawable $r4 = C1335a.m36322f(r6, $i03);
        Log_OC.append($r4);
        Drawable $r42 = $r4.mutate();
        Log_OC.loadImage($r42, "getDrawable(\n            this,\n            R.drawable.ic_arrow_backward\n        )!!.mutate()");
        int $i04 = setColor(i2);
        C1365a.m36188n($r42, $i04);
        InterfaceC8209a $r13 = getBinding();
        ActivityIssueBinding $r23 = (ActivityIssueBinding) $r13;
        Toolbar $r33 = $r23.toolbar;
        $r33.setNavigationIcon($r42);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void showTicketResponse(String str, String str2, String str3, boolean z, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, "titleText");
        Log_OC.getArray(str2, "msgText");
        Log_OC.getArray(str3, "actionBtnText");
        SuccessScreenDialogFragment.Companion $r5 = SuccessScreenDialogFragment.Companion;
        int $i0 = C0214R.C0215drawable.ic_send_plane;
        SuccessScreenCustomOption r9 = new SuccessScreenCustomOption(str, str2, str3, z, false, false, 0, 0, 0, 0, $i0, 0, false, 7152, null);
        SuccessScreenDialogFragment $r7 = $r5.newInstance(r9, interfaceC11756a);
        FragmentActivity r10 = (FragmentActivity) this;
        FragmentManager $r8 = r10.getSupportFragmentManager();
        $r7.show($r8, "Success Fragment");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toCustomerDetailsFragment(IssueTypeModel issueTypeModel, boolean z) {
        Log_OC.getArray(issueTypeModel, "issueData");
        CustomerDetailsIssueFragment.Companion $r3 = CustomerDetailsIssueFragment.Companion;
        CustomerDetailsIssueFragment $r2 = $r3.newInstance(issueTypeModel, z);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toDelayedKtaTopUp(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        setTitle("Delayed KTA top-up");
        DelayedKTAtopUpFragment.Companion $r3 = DelayedKTAtopUpFragment.Companion;
        DelayedKTAtopUpFragment $r2 = $r3.newInstance(issueTypeModel);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r2, $i0, false, false, false, 28, null);
    }

    @Override // ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator
    public void toDisputeIssueFragment(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, TransactionBreakDownItemType.DATA);
        toDisputeView(ticket);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.inbox.navigators.InboxNavigator
    public void toDisputeIssueView(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, "ticket");
        String $r2 = ticket.getId();
        setTitle(Log_OC.m10359a("Ticket #", (Object) $r2));
        DisputeIssueFragment.Companion $r3 = DisputeIssueFragment.Companion;
        DisputeIssueFragment $r4 = DisputeIssueFragment.Companion.newInstance$default($r3, ticket, false, false, 6, null);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) this, $r4, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toDisputeView(Issue.Ticket ticket) {
        String $r2 = ticket == null ? null : ticket.getId();
        setTitle(Log_OC.m10359a("Ticket #", (Object) $r2));
        AppCompatActivity r5 = (AppCompatActivity) this;
        AppCompatActivityExtKt.popBackStackImm(r5);
        DisputeIssueFragment.Companion $r3 = DisputeIssueFragment.Companion;
        DisputeIssueFragment $r4 = DisputeIssueFragment.Companion.newInstance$default($r3, ticket, false, false, 6, null);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r52 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r52, $r4, $i0, false, false, false, 28, null);
    }

    @Override // ai.kudi.agent.inbox.navigators.InboxNavigator
    public void toInboxView() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator
    public void toIssueContactUsFragment() {
        ContactUsFragment r2 = new ContactUsFragment();
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r3 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r3, r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator
    public void toIssueDetailFragment(IssueCategory issueCategory) {
        Log_OC.getArray(issueCategory, TransactionBreakDownItemType.DATA);
        IssueDetailFragment.Companion $r3 = IssueDetailFragment.Companion;
        IssueDetailFragment $r2 = $r3.newInstance(issueCategory);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toIssueResolutionFragment(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueData");
        IssueResolutionFragment.Companion $r2 = IssueResolutionFragment.Companion;
        String $r3 = issueTypeModel.getLabel();
        String $r4 = issueTypeModel.getTitle();
        IssueResolutionFragment $r5 = $r2.newInstance(issueTypeModel, $r3, $r4);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r6 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r6, $r5, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toIssueSummaryFragment(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueData");
        IssueSummaryFragment.Companion $r3 = IssueSummaryFragment.Companion;
        Fragment $r2 = $r3.newInstance(issueTypeModel);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator
    public void toIssueTypeFragment(IssueCategory issueCategory) {
        Log_OC.getArray(issueCategory, TransactionBreakDownItemType.DATA);
        IssueTypeFragmentNew.Companion $r3 = IssueTypeFragmentNew.Companion;
        IssueTypeFragmentNew $r2 = $r3.newInstance(issueCategory);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toKycFormIssue(String str, String str2) {
        Log_OC.getArray(str, "issueType");
        Log_OC.getArray(str2, "issueDetail");
        KYCformIssueFragment.Companion $r4 = KYCformIssueFragment.Companion;
        KYCformIssueFragment $r3 = $r4.newInstance(str, str2);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r5 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r5, $r3, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toPosTerminalIssue(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueData");
        PosTerminalIssuesFragment.Companion $r3 = PosTerminalIssuesFragment.Companion;
        PosTerminalIssuesFragment $r2 = $r3.newInstance(issueTypeModel);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toTransactionListView(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueData");
        TransactionListFragment.Companion $r3 = TransactionListFragment.Companion;
        Fragment $r2 = $r3.newInstance(issueTypeModel);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.issues.navigators.IssueTypeNavigator
    public void toWithdrawalIssue(IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        SubmitWithdrawalIssueFragment.Companion $r3 = SubmitWithdrawalIssueFragment.Companion;
        SubmitWithdrawalIssueFragment $r2 = $r3.newInstance(issueTypeModel);
        int $i0 = C0214R.C0216id.issueContainerFrameLayout;
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r2, $i0, false, false, false, 28, null);
    }
}
