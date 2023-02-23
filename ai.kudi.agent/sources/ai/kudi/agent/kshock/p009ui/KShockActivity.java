package ai.kudi.agent.kshock.p009ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.ActivityKShockBinding;
import ai.kudi.agent.kshock.data.model.Interest;
import ai.kudi.agent.kshock.data.model.KShockAvailability;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanFragment;
import ai.kudi.agent.kshock.p009ui.views.ApplyForLoanReviewFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockAvailableFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockEligibilityCriteriaFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockNotAvailableFragment;
import ai.kudi.agent.kshock.p009ui.views.KShockNotAvailableInLocationFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockExistingLoanerFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanApplicationSubmittedFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanHistoryFragment;
import ai.kudi.agent.kshock.p009ui.views.LoanStatusFragment;
import ai.kudi.agent.kshock.p009ui.views.OtpVerificationFragment;
import ai.kudi.agent.kshock.presentation.KShockViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.KShockViewData;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import dagger.android.C7427a;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import dagger.android.d;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: KShockActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 P2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001PB\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0014J\b\u0010!\u001a\u00020\u0002H\u0014J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0014J\u001a\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020\u001fJ\u0018\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020\u001fH\u0003J\b\u0010/\u001a\u00020\u001fH\u0016J\u0012\u00100\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020?H\u0002J\u0006\u0010@\u001a\u00020\u001fJ\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010B\u001a\u00020\u001fH\u0016J\u0018\u0010C\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0006\u0010D\u001a\u000204H\u0016J\u0010\u0010E\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020\u001fH\u0016J\u0010\u0010J\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<H\u0016J \u0010K\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020,2\u0006\u0010M\u001a\u00020,2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010N\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010O\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006Q"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/KShockActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/kshock/presentation/KShockViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KShockViewData;", "Lai/kudi/agent/feature_kshock/databinding/ActivityKShockBinding;", "Ldagger/android/HasAndroidInjector;", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/feature_kshock/databinding/ActivityKShockBinding;", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/kshock/presentation/KShockViewModel;", "setViewModel", "(Lai/kudi/agent/kshock/presentation/KShockViewModel;)V", "Ldagger/android/AndroidInjector;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "handleAvailable", "maxLoanAmount", "", "interestRate", "", "hideActionBar", "navigateToOverduePaymentResult", TransactionField.STATUS, "", MetricTracker.Object.MESSAGE, "observeViewModel", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "openApplicationStatusFragment", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "openAvailabilityStatusFragment", "availability", "Lai/kudi/agent/kshock/data/model/KShockAvailability;", "showSupportActionBar", "toApplicationSubmittedFragment", "toCompleteProfileInfo", "toExistingLoanerFragment", "shouldPop", "toLoanApplicationFragment", "toLoanApplicationReviewFragment", "interest", "Lai/kudi/agent/kshock/data/model/Interest;", "toLoanEligibilityFragment", "toLoanStatusFragment", "toOtpVerification", "mobile", "email", "toOverdueLoanDetailsFragment", "toPendingLoansListFragment", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.KShockActivity */
/* loaded from: classes.dex */
public final class KShockActivity extends BaseMVVMActivity<KShockViewModel, KShockViewData, ActivityKShockBinding> implements d, KShockNavigator {
    public static final String COMPLETE_PROFILE = "VerifyBvnOrCompleteKyc";
    public static final Companion Companion;
    public static final String FROM = "FROM_FRAGMENT";
    public static final String KSHOCK_ADVERT_ELIGIBLE = "K_SHOCK_ADVERT_ELIGIBLE";
    public static final String KSHOCK_ADVERT_INELIGIBLE = "K_SHOCK_ADVERT_INELIGIBLE";
    public static final String MAX_LOAN_AMT = "MAX_LOAN_AMT";
    public static final String PAYBACK_ERROR = "ERROR";
    public static final String PAYBACK_PENDING = "PENDING";
    public static final String SETTINGS_CLASS = "ai.kudi.agent.settings.ui.SettingsActivity";
    public static final String SETTINGS_PARAM = "PARAM_SETTINGS";
    public DispatchingAndroidInjector<Object> androidInjector;
    public SmartLookAnalytics smartLookAnalytics;
    public KShockViewModel viewModel;

    /* compiled from: KShockActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/KShockActivity$Companion;", "", "()V", "COMPLETE_PROFILE", "", "FROM", "KSHOCK_ADVERT_ELIGIBLE", "KSHOCK_ADVERT_INELIGIBLE", "MAX_LOAN_AMT", "PAYBACK_ERROR", "PAYBACK_PENDING", "SETTINGS_CLASS", "SETTINGS_PARAM", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.KShockActivity$Companion */
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleAvailable(double d, float f) {
        BaseMVVMViewBindingFragment $r4;
        KShockViewModel $r1 = getViewModel();
        boolean $z0 = $r1.isNewKshockUser();
        if ($z0) {
            KShockAvailableFragment.Companion $r2 = KShockAvailableFragment.Companion;
            $r4 = $r2.newInstance(d, f);
        } else {
            KshockLoansListFragment.Companion $r5 = KshockLoansListFragment.Companion;
            Double $r6 = Double.valueOf(d);
            $r4 = KshockLoansListFragment.Companion.newInstance$default($r5, $r6, false, 2, null);
        }
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r4, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void handleAvailable$default(KShockActivity kShockActivity, double d, float $f0, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $f0 = 0.4f;
        }
        kShockActivity.handleAvailable(d, $f0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeViewModel() {
        KShockViewModel $r1 = getViewModel();
        C11680b $r2 = $r1.getOnOpenAvailabilityScreen();
        AbstractC11688p $r3 = C7390a.a($r2, this);
        Object object = new Object() { // from class: ai.kudi.agent.kshock.ui.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockActivity $r12 = KShockActivity.this;
                KShockAvailability $r32 = (KShockAvailability) obj;
                KShockActivity.m39628observeViewModel$lambda0($r12, $r32);
            }
        };
        Token $r5 = Token.GREATER_THAN;
        $r3.e0(object, $r5);
        KShockViewModel $r12 = getViewModel();
        C11680b $r22 = $r12.getOpenStatusScreen();
        AbstractC11688p $r32 = C7390a.a($r22, this);
        Object object2 = new Object() { // from class: ai.kudi.agent.kshock.ui.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KShockActivity $r13 = KShockActivity.this;
                Loan $r33 = (Loan) obj;
                KShockActivity.m39630observeViewModel$lambda2($r13, $r33);
            }
        };
        Function $r7 = Function.LEN;
        $r32.e0(object2, $r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-0  reason: not valid java name */
    public static final void m39628observeViewModel$lambda0(KShockActivity kShockActivity, KShockAvailability kShockAvailability) {
        Log_OC.getArray(kShockActivity, "this$0");
        Log_OC.loadImage(kShockAvailability, "it");
        kShockActivity.openAvailabilityStatusFragment(kShockAvailability);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-1  reason: not valid java name */
    public static final void m39629observeViewModel$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-2  reason: not valid java name */
    public static final void m39630observeViewModel$lambda2(KShockActivity kShockActivity, Loan loan) {
        Log_OC.getArray(kShockActivity, "this$0");
        Log_OC.loadImage(loan, "it");
        kShockActivity.openApplicationStatusFragment(loan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-3  reason: not valid java name */
    public static final void m39631observeViewModel$lambda3(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openApplicationStatusFragment(Loan loan) {
        InterfaceC8209a $r2 = getBinding();
        ActivityKShockBinding $r3 = (ActivityKShockBinding) $r2;
        EmptyHistoryBinding $r4 = $r3.emptyView;
        View $r5 = $r4.getRoot();
        Log_OC.loadImage($r5, "binding.emptyView.root");
        View r9 = $r5;
        ViewExtKt.hide$default(r9, false, 1, null);
        AbstractC0925a $r6 = getSupportActionBar();
        if ($r6 != null) {
            $r6.mo37629E();
        }
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        LoanStatusFragment.Companion $r7 = LoanStatusFragment.Companion;
        LoanStatusFragment $r8 = $r7.newInstance(loan);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r8, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openAvailabilityStatusFragment(KShockAvailability kShockAvailability) {
        AbstractC0925a $r2 = getSupportActionBar();
        if ($r2 != null) {
            $r2.mo37629E();
        }
        InterfaceC8209a $r3 = getBinding();
        ActivityKShockBinding $r4 = (ActivityKShockBinding) $r3;
        FrameLayout $r5 = $r4.screenContent;
        Log_OC.loadImage($r5, "binding.screenContent");
        InterfaceC8209a $r32 = getBinding();
        ActivityKShockBinding $r42 = (ActivityKShockBinding) $r32;
        EmptyHistoryBinding $r6 = $r42.emptyView;
        View $r7 = $r6.getRoot();
        Log_OC.loadImage($r7, "binding.emptyView.root");
        InterfaceC8209a $r33 = getBinding();
        ActivityKShockBinding $r43 = (ActivityKShockBinding) $r33;
        ProgressBar $r8 = $r43.kshockProgressBar;
        Log_OC.loadImage($r8, "binding.kshockProgressBar");
        boolean $z0 = kShockAvailability instanceof KShockAvailability.Loading;
        if ($z0) {
            ViewExtKt.hide$default($r7, false, 1, null);
            ViewExtKt.hide$default($r5, false, 1, null);
            ViewExtKt.show($r8);
            return;
        }
        boolean $z02 = kShockAvailability instanceof KShockAvailability.Available;
        if ($z02) {
            View r24 = $r7;
            ViewExtKt.hide$default(r24, false, 1, null);
            ViewExtKt.show($r5);
            ViewExtKt.hide$default($r8, false, 1, null);
            KShockAvailability.Available $r9 = (KShockAvailability.Available) kShockAvailability;
            double $d0 = $r9.getMaximumLoanAmt();
            float $f0 = $r9.getInterestRate();
            handleAvailable($d0, $f0);
            return;
        }
        boolean $z03 = kShockAvailability instanceof KShockAvailability.NotAvailable;
        if ($z03) {
            View r242 = $r7;
            ViewExtKt.hide$default(r242, false, 1, null);
            ViewExtKt.show($r5);
            ViewExtKt.hide$default($r8, false, 1, null);
            KShockNotAvailableFragment.Companion $r10 = KShockNotAvailableFragment.Companion;
            KShockAvailability.NotAvailable $r11 = (KShockAvailability.NotAvailable) kShockAvailability;
            double $d02 = $r11.getMaxLoanAmount();
            String $r12 = $r11.getReason();
            KShockNotAvailableFragment $r13 = $r10.newInstance($d02, $r12);
            int $i0 = C0220R.C0222id.screen_content;
            AppCompatActivityExtKt.startFragment$default(this, $r13, $i0, false, false, false, 28, null);
            return;
        }
        boolean $z04 = kShockAvailability instanceof KShockAvailability.NotAvailableInLocation;
        if ($z04) {
            View r243 = $r7;
            ViewExtKt.hide$default(r243, false, 1, null);
            ViewExtKt.show($r5);
            ViewExtKt.hide$default($r8, false, 1, null);
            KShockNotAvailableInLocationFragment.Companion $r14 = KShockNotAvailableInLocationFragment.Companion;
            KShockAvailability.NotAvailableInLocation $r15 = (KShockAvailability.NotAvailableInLocation) kShockAvailability;
            double $d03 = $r15.getMaxLoanAmount();
            KShockNotAvailableInLocationFragment $r16 = $r14.newInstance($d03);
            int $i02 = C0220R.C0222id.screen_content;
            AppCompatActivityExtKt.startFragment$default(this, $r16, $i02, false, false, false, 28, null);
            return;
        }
        boolean $z05 = kShockAvailability instanceof KShockAvailability.NotAvailablePendingLoan;
        if ($z05) {
            View r244 = $r7;
            ViewExtKt.hide$default(r244, false, 1, null);
            ViewExtKt.hide$default($r8, false, 1, null);
            KShockAvailability.NotAvailablePendingLoan $r17 = (KShockAvailability.NotAvailablePendingLoan) kShockAvailability;
            Loan $r18 = $r17.getPendingLoan();
            toLoanStatusFragment($r18);
            return;
        }
        boolean $z06 = kShockAvailability instanceof KShockAvailability.LoanProviderDisabled;
        if ($z06) {
            View r245 = $r7;
            ViewExtKt.hide$default(r245, false, 1, null);
            ViewExtKt.hide$default($r8, false, 1, null);
            KShockNotAvailableFragment.Companion $r102 = KShockNotAvailableFragment.Companion;
            KShockNotAvailableFragment $r132 = $r102.newInstance(true);
            int $i03 = C0220R.C0222id.screen_content;
            AppCompatActivityExtKt.startFragment$default(this, $r132, $i03, false, false, false, 28, null);
            return;
        }
        boolean $z07 = kShockAvailability instanceof KShockAvailability.Error;
        if (!$z07) {
            KShockAvailability.HasCreditLimitIssues $r21 = KShockAvailability.HasCreditLimitIssues.INSTANCE;
            boolean $z08 = Log_OC.append(kShockAvailability, $r21);
            if ($z08) {
                KshockLoansListFragment.Companion $r22 = KshockLoansListFragment.Companion;
                KshockLoansListFragment $r23 = KshockLoansListFragment.Companion.newInstance$default($r22, null, false, 1, null);
                int $i04 = C0220R.C0222id.screen_content;
                AppCompatActivityExtKt.startFragment$default(this, $r23, $i04, false, false, false, 28, null);
                return;
            }
            return;
        }
        ViewExtKt.show($r5);
        ViewExtKt.hide$default($r8, false, 1, null);
        View r246 = $r7;
        ViewExtKt.show(r246);
        InterfaceC8209a $r34 = getBinding();
        ActivityKShockBinding $r44 = (ActivityKShockBinding) $r34;
        EmptyHistoryBinding $r62 = $r44.emptyView;
        TextView $r19 = $r62.emptyHistoryTextView;
        KShockAvailability.Error $r20 = (KShockAvailability.Error) kShockAvailability;
        CharSequence $r122 = $r20.getMessage();
        TextView r25 = $r19;
        r25.setText($r122);
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
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KShockViewData $r2 = (KShockViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(KShockViewData kShockViewData) {
        Log_OC.getArray(kShockViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KShockViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected KShockViewModel createViewModel() {
        KShockViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityKShockBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityKShockBinding $r2 = ActivityKShockBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityKShockBinding $r1 = getActivityBinding();
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
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return KShockViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public final KShockViewModel getViewModel() {
        KShockViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideActionBar() {
        AbstractC0925a $r1 = getSupportActionBar();
        if ($r1 == null) {
            return;
        }
        $r1.mo37607l();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void navigateToOverduePaymentResult(String $r1, String str) {
        Log_OC.getArray($r1, TransactionField.STATUS);
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        hideActionBar();
        boolean $z0 = Log_OC.append($r1, PAYBACK_PENDING);
        if ($z0) {
            SuccessScreenDialogFragment.Companion $r3 = SuccessScreenDialogFragment.Companion;
            int $i0 = C0220R.color.blackDatePickerTextColor;
            int $i1 = C0220R.string.overdue_loan_payback_success_title;
            String $r12 = getString($i1);
            int $i12 = C0220R.string.close;
            String $r4 = getString($i12);
            int $i13 = C0220R.C0221drawable.ic_successful_transaction_status;
            Log_OC.loadImage($r12, "getString(R.string.overdue_loan_payback_success_title)");
            Log_OC.loadImage($r4, "getString(R.string.close)");
            SuccessScreenCustomOption $r5 = new SuccessScreenCustomOption($r12, str, $r4, true, false, false, $i0, 0, 0, 0, $i13, 0, false, 7088, null);
            KShockActivity$navigateToOverduePaymentResult$1 $r6 = new KShockActivity$navigateToOverduePaymentResult$1(this);
            SuccessScreenDialogFragment $r7 = $r3.newInstance($r5, $r6);
            int $i02 = C0220R.C0222id.screen_content;
            AppCompatActivityExtKt.startFragment$default(this, $r7, $i02, false, false, false, 28, null);
            return;
        }
        boolean $z02 = Log_OC.append($r1, "ERROR");
        if ($z02) {
            SuccessScreenDialogFragment.Companion $r32 = SuccessScreenDialogFragment.Companion;
            int $i03 = C0220R.color.kudiBadgeDarkRed;
            int $i14 = C0220R.string.overdue_loan_payback_error_title;
            String $r13 = getString($i14);
            int $i15 = C0220R.string.close;
            String $r42 = getString($i15);
            int $i16 = C0220R.C0221drawable.ic_failed_transaction_status;
            Log_OC.loadImage($r13, "getString(R.string.overdue_loan_payback_error_title)");
            Log_OC.loadImage($r42, "getString(R.string.close)");
            SuccessScreenCustomOption $r52 = new SuccessScreenCustomOption($r13, str, $r42, true, false, false, $i03, 0, 0, 0, $i16, 0, false, 7088, null);
            KShockActivity$navigateToOverduePaymentResult$2 $r8 = new KShockActivity$navigateToOverduePaymentResult$2(this);
            SuccessScreenDialogFragment $r72 = $r32.newInstance($r52, $r8);
            int $i04 = C0220R.C0222id.screen_content;
            AppCompatActivityExtKt.startFragment$default(this, $r72, $i04, false, false, false, 28, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        FragmentManager $r1 = getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected void onCreate(Bundle bundle) {
        C7427a.m18756a(this);
        super.onCreate(bundle);
        int $i0 = C0220R.string.k_shock;
        setTitle($i0);
        AbstractC0925a $r2 = getSupportActionBar();
        if ($r2 != null) {
            $r2.mo37602u(true);
        }
        AbstractC0925a $r22 = getSupportActionBar();
        if ($r22 != null) {
            int $i02 = C0220R.C0221drawable.ic_arrow_backward;
            $r22.mo37597z($i02);
        }
        Intent $r3 = getIntent();
        boolean $z0 = $r3.hasExtra(FROM);
        if ($z0) {
            Intent $r32 = getIntent();
            String $r4 = $r32.getStringExtra(FROM);
            boolean $z02 = Log_OC.append($r4, KSHOCK_ADVERT_INELIGIBLE);
            if ($z02) {
                KShockEligibilityCriteriaFragment.Companion $r5 = KShockEligibilityCriteriaFragment.Companion;
                KShockEligibilityCriteriaFragment $r6 = $r5.newInstance();
                int $i03 = C0220R.C0222id.screen_content;
                AppCompatActivityExtKt.startFragment$default(this, $r6, $i03, false, false, false, 28, null);
            } else {
                Intent $r33 = getIntent();
                String $r42 = $r33.getStringExtra(FROM);
                boolean $z03 = Log_OC.append($r42, KSHOCK_ADVERT_ELIGIBLE);
                if ($z03) {
                    Intent $r34 = getIntent();
                    boolean $z04 = $r34.hasExtra("MAX_LOAN_AMT");
                    if ($z04) {
                        Intent $r35 = getIntent();
                        double $d0 = $r35.getDoubleExtra("MAX_LOAN_AMT", 200000.0d);
                        handleAvailable$default(this, $d0, 0.0f, 2, null);
                    }
                }
            }
        } else {
            KShockViewModel $r7 = getViewModel();
            $r7.loadKShockData();
        }
        observeViewModel();
        SmartLookAnalytics $r8 = getSmartLookAnalytics();
        $r8.logKShock();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater $r2 = getMenuInflater();
        int $i0 = C0220R.C0224menu.menu_kshock;
        $r2.inflate($i0, menu);
        boolean $z0 = super.onCreateOptionsMenu(menu);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        int $i1 = C0220R.C0222id.action_loan_history;
        if ($i0 == $i1) {
            InterfaceC8209a $r2 = getBinding();
            ActivityKShockBinding $r3 = (ActivityKShockBinding) $r2;
            EmptyHistoryBinding $r4 = $r3.emptyView;
            ConstraintLayout $r5 = $r4.getRoot();
            Log_OC.loadImage($r5, "binding.emptyView.root");
            ViewExtKt.hide$default($r5, false, 1, null);
            LoanHistoryFragment.Companion $r6 = LoanHistoryFragment.Companion;
            LoanHistoryFragment $r7 = $r6.newInstance();
            int $i02 = C0220R.C0222id.screen_content;
            AppCompatActivityExtKt.startFragment$default(this, $r7, $i02, false, false, false, 28, null);
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    public final void setAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setViewModel(KShockViewModel kShockViewModel) {
        Log_OC.getArray(kShockViewModel, "<set-?>");
        this.viewModel = kShockViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showSupportActionBar() {
        AbstractC0925a $r1 = getSupportActionBar();
        if ($r1 == null) {
            return;
        }
        $r1.mo37629E();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toApplicationSubmittedFragment(Loan loan) {
        Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
        AppCompatActivityExtKt.popAllFragmentsInActivity$default(this, null, 1, null);
        LoanApplicationSubmittedFragment.Companion $r3 = LoanApplicationSubmittedFragment.Companion;
        LoanApplicationSubmittedFragment $r2 = $r3.newInstance(loan);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.replaceFragmentInActivity$default(this, $r2, $i0, null, 4, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toCompleteProfileInfo() {
        Class $r2 = Class.forName(SETTINGS_CLASS);
        Log_OC.loadImage($r2, "forName(SETTINGS_CLASS)");
        KShockActivity$toCompleteProfileInfo$1 $r1 = KShockActivity$toCompleteProfileInfo$1.INSTANCE;
        ContextExtKt.launchActivity$default((Context) this, false, $r2, (InterfaceC11767l) $r1, 1, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toExistingLoanerFragment(double d, boolean z) {
        if (z) {
            AppCompatActivityExtKt.pop$default(this, null, 1, null);
        }
        KshockExistingLoanerFragment.Companion $r2 = KshockExistingLoanerFragment.Companion;
        KshockExistingLoanerFragment $r1 = $r2.newInstance(d);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r1, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toLoanApplicationFragment(double d) {
        ApplyForLoanFragment.Companion $r1 = ApplyForLoanFragment.Companion;
        ApplyForLoanFragment $r2 = $r1.newInstance(d);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toLoanApplicationReviewFragment(Interest interest) {
        Log_OC.getArray(interest, "interest");
        ApplyForLoanReviewFragment.Companion $r3 = ApplyForLoanReviewFragment.Companion;
        ApplyForLoanReviewFragment $r2 = $r3.newInstance(interest);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toLoanEligibilityFragment() {
        KShockEligibilityCriteriaFragment.Companion $r1 = KShockEligibilityCriteriaFragment.Companion;
        KShockEligibilityCriteriaFragment $r2 = $r1.newInstance();
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toLoanStatusFragment(Loan loan) {
        Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
        LoanStatusFragment.Companion $r3 = LoanStatusFragment.Companion;
        LoanStatusFragment $r2 = $r3.newInstance(loan);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toOtpVerification(String str, String str2, Interest interest) {
        Log_OC.getArray(str, "mobile");
        Log_OC.getArray(str2, "email");
        Log_OC.getArray(interest, "interest");
        OtpVerificationFragment.Companion $r5 = OtpVerificationFragment.Companion;
        OtpVerificationFragment $r4 = $r5.newInstance(str, str2, interest);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r4, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toOverdueLoanDetailsFragment(Loan loan) {
        Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
        KshockOverdueLoansDetailFragment.Companion $r3 = KshockOverdueLoansDetailFragment.Companion;
        KshockOverdueLoansDetailFragment $r2 = $r3.newInstance(loan);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.kshock.navigator.KShockNavigator
    public void toPendingLoansListFragment(double d) {
        KshockPendingLoansListFragment.Companion $r1 = KshockPendingLoansListFragment.Companion;
        KshockPendingLoansListFragment $r2 = KshockPendingLoansListFragment.Companion.newInstance$default($r1, d, false, 2, null);
        int $i0 = C0220R.C0222id.screen_content;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }
}
