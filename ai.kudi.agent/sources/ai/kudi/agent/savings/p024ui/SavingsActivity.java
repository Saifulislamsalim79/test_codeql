package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.data.model.CreateSavingsModel;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.data.model.UpdateSavingPlanRequest;
import ai.kudi.agent.savings.data.model.WithdrawRequest;
import ai.kudi.agent.savings.data.viewdata.SavingsViewData;
import ai.kudi.agent.savings.databinding.ActivitySavingsBinding;
import ai.kudi.agent.savings.databinding.ErrorLayoutBinding;
import ai.kudi.agent.savings.navigator.SavingsNavigator;
import ai.kudi.agent.savings.p024ui.ConfirmOtpFragment;
import ai.kudi.agent.savings.p024ui.CreateSavingPinFragment;
import ai.kudi.agent.savings.p024ui.CreateSavingsFragment;
import ai.kudi.agent.savings.p024ui.DetailAndTransactionFragment;
import ai.kudi.agent.savings.p024ui.GetStartedFragment;
import ai.kudi.agent.savings.p024ui.SavingHistoryFragment;
import ai.kudi.agent.savings.p024ui.SavingsFragment;
import ai.kudi.agent.savings.p024ui.SavingsPlanFragment;
import ai.kudi.agent.savings.p024ui.SavingsReviewFragment;
import ai.kudi.agent.savings.p024ui.SavingsTermsAndConditionFragment;
import ai.kudi.agent.savings.p024ui.WithdrawSavingsFragment;
import ai.kudi.agent.savings.viewmodel.SavingsViewModel;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AbstractC0925a;
import androidx.fragment.app.FragmentManager;
import dagger.android.C7427a;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import dagger.android.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SavingsActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 J2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001JB\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0014J\b\u0010!\u001a\u00020\u0002H\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0014J \u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,H\u0016J \u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J \u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010-\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u001fH\u0016J\u0010\u00101\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020.H\u0016J\u0010\u00101\u001a\u00020\u001f2\u0006\u00103\u001a\u00020/H\u0016J\b\u00104\u001a\u00020\u001fH\u0016J\u0010\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u000207H\u0016J\u0016\u00108\u001a\u00020\u001f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020709H\u0016J\b\u0010:\u001a\u00020\u001fH\u0016J\u0010\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020,H\u0016J\b\u0010=\u001a\u00020\u001fH\u0016J\b\u0010>\u001a\u00020\u001fH\u0016J \u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020)2\u0006\u00106\u001a\u000207H\u0016J\b\u0010C\u001a\u00020\u001fH\u0016J\u0012\u0010D\u001a\u00020\u001f2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\u0010\u0010G\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010H\u001a\u00020\u001fH\u0016J\b\u0010I\u001a\u00020\u001fH\u0016R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006K"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/savings/viewmodel/SavingsViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", "Lai/kudi/agent/savings/databinding/ActivitySavingsBinding;", "Ldagger/android/HasAndroidInjector;", "Lai/kudi/agent/savings/navigator/SavingsNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/savings/databinding/ActivitySavingsBinding;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "setAnalytics", "(Lai/kudi/agent/core/analytics/Analytics;)V", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/SavingsViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/SavingsViewModel;)V", "Ldagger/android/AndroidInjector;", "applyViewData", "", "viewData", "createViewModel", "displayProgressBar", "visibility", "", "getVMType", "Ljava/lang/Class;", "navigateToConfirmOtpFragment", "mobile", "", "pin", "model", "Lai/kudi/agent/savings/data/model/CreateSavingsModel;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/savings/data/model/UpdateSavingPlanRequest;", "Lai/kudi/agent/savings/data/model/WithdrawRequest;", "navigateToCreateSaving", "navigateToCreateSavingsPinFragment", "deactivatePlanRequest", "withdrawRequest", "navigateToSavings", "navigateToSavingsDetail", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", "navigateToSavingsHistory", "", "navigateToSavingsPlan", "navigateToSavingsReview", "savingsModel", "navigateToSavingsSuccess", "navigateToTermsAndCondition", "navigateToWithdraw", "balance", "", "id", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showOrHideLoader", "showSavingsDeactivatedDialog", "showWithdrawSuccessDialog", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsActivity */
/* loaded from: classes.dex */
public final class SavingsActivity extends BaseMVVMActivity<SavingsViewModel, SavingsViewData, ActivitySavingsBinding> implements d, SavingsNavigator {
    public static final Companion Companion;
    public static final String HAS_SAVINGS_PLAN = "HAS_SAVINGS_PLAN";
    public static final String IS_NEW_SAVINGS_FEATURE = "savings_feature";
    public Analytics analytics;
    public DispatchingAndroidInjector<Object> androidInjector;
    public SavingsViewModel viewModel;

    /* compiled from: SavingsActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsActivity$Companion;", "", "()V", SavingsActivity.HAS_SAVINGS_PLAN, "", "IS_NEW_SAVINGS_FEATURE", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingsActivity$Companion */
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
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m40538onCreate$lambda0(SavingsActivity savingsActivity, View view) {
        Log_OC.getArray(savingsActivity, "this$0");
        SavingsViewModel $r0 = savingsActivity.getViewModel();
        $r0.retrieveSavings();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showOrHideLoader(boolean z) {
        if (!z) {
            InterfaceC8209a $r1 = getBinding();
            ActivitySavingsBinding $r2 = (ActivitySavingsBinding) $r1;
            ProgressBar $r3 = $r2.loader;
            Log_OC.loadImage($r3, "binding.loader");
            ViewExtKt.hide$default($r3, false, 1, null);
            InterfaceC8209a $r12 = getBinding();
            ActivitySavingsBinding $r22 = (ActivitySavingsBinding) $r12;
            FrameLayout $r4 = $r22.flSavingsContainer;
            Log_OC.loadImage($r4, "binding.flSavingsContainer");
            ViewExtKt.show($r4);
            return;
        }
        InterfaceC8209a $r13 = getBinding();
        ActivitySavingsBinding $r23 = (ActivitySavingsBinding) $r13;
        ProgressBar $r32 = $r23.loader;
        Log_OC.loadImage($r32, "binding.loader");
        ViewExtKt.show($r32);
        InterfaceC8209a $r14 = getBinding();
        ActivitySavingsBinding $r24 = (ActivitySavingsBinding) $r14;
        FrameLayout $r42 = $r24.flSavingsContainer;
        Log_OC.loadImage($r42, "binding.flSavingsContainer");
        ViewExtKt.hide$default($r42, false, 1, null);
        InterfaceC8209a $r15 = getBinding();
        ActivitySavingsBinding $r25 = (ActivitySavingsBinding) $r15;
        ErrorLayoutBinding $r5 = $r25.errorLayout;
        View $r6 = $r5.getRoot();
        Log_OC.loadImage($r6, "binding.errorLayout.root");
        View r7 = $r6;
        ViewExtKt.hide$default(r7, false, 1, null);
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
        SavingsViewData $r2 = (SavingsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SavingsViewData savingsViewData) {
        Log_OC.getArray(savingsViewData, "viewData");
        boolean $z0 = savingsViewData instanceof SavingsViewData.Success;
        if ($z0) {
            SavingsViewData.Success $r2 = (SavingsViewData.Success) savingsViewData;
            boolean $z02 = $r2.getHasSavingsPlan();
            if ($z02) {
                SavingsPlanFragment.Companion $r3 = SavingsPlanFragment.Companion;
                SavingsPlanFragment $r4 = $r3.newInstance();
                int $i0 = C0456R.C0458id.flSavingsContainer;
                AppCompatActivityExtKt.startFragment$default(this, $r4, $i0, false, false, false, 28, null);
                return;
            }
            GetStartedFragment.Companion $r5 = GetStartedFragment.Companion;
            GetStartedFragment $r6 = $r5.newInstance();
            int $i02 = C0456R.C0458id.flSavingsContainer;
            AppCompatActivityExtKt.startFragment$default(this, $r6, $i02, false, false, false, 28, null);
            return;
        }
        boolean $z03 = savingsViewData instanceof SavingsViewData.ShowProgress;
        if ($z03) {
            SavingsViewData.ShowProgress $r7 = (SavingsViewData.ShowProgress) savingsViewData;
            boolean $z04 = $r7.getVisibility();
            showOrHideLoader($z04);
            return;
        }
        boolean $z05 = savingsViewData instanceof SavingsViewData.Error;
        if ($z05) {
            InterfaceC8209a $r8 = getBinding();
            ActivitySavingsBinding $r9 = (ActivitySavingsBinding) $r8;
            ErrorLayoutBinding $r10 = $r9.errorLayout;
            View $r11 = $r10.getRoot();
            Log_OC.loadImage($r11, "binding.errorLayout.root");
            View r12 = $r11;
            ViewExtKt.show(r12);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SavingsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected SavingsViewModel createViewModel() {
        SavingsViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void displayProgressBar(boolean z) {
        showOrHideLoader(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivitySavingsBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivitySavingsBinding $r2 = ActivitySavingsBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivitySavingsBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics $r1 = this.analytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("analytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return SavingsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public final SavingsViewModel getViewModel() {
        SavingsViewModel $r1 = this.viewModel;
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
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToConfirmOtpFragment(String str, String str2, CreateSavingsModel createSavingsModel) {
        Log_OC.getArray(str, "mobile");
        Log_OC.getArray(str2, "pin");
        Log_OC.getArray(createSavingsModel, "model");
        ConfirmOtpFragment.Companion $r5 = ConfirmOtpFragment.Companion;
        ConfirmOtpFragment $r4 = $r5.newInstance(str, str2, createSavingsModel);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r4, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToConfirmOtpFragment(String str, String str2, UpdateSavingPlanRequest updateSavingPlanRequest) {
        Log_OC.getArray(str, "mobile");
        Log_OC.getArray(str2, "pin");
        Log_OC.getArray(updateSavingPlanRequest, TransactionRequest.TYPE_REQUEST);
        ConfirmOtpFragment.Companion $r5 = ConfirmOtpFragment.Companion;
        ConfirmOtpFragment $r4 = $r5.newInstance(str, str2, updateSavingPlanRequest);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r4, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToConfirmOtpFragment(String str, String str2, WithdrawRequest withdrawRequest) {
        Log_OC.getArray(str, "mobile");
        Log_OC.getArray(str2, "pin");
        Log_OC.getArray(withdrawRequest, TransactionRequest.TYPE_REQUEST);
        ConfirmOtpFragment.Companion $r5 = ConfirmOtpFragment.Companion;
        ConfirmOtpFragment $r4 = $r5.newInstance(str, str2, withdrawRequest);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r4, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToCreateSaving() {
        CreateSavingsFragment.Companion $r1 = CreateSavingsFragment.Companion;
        CreateSavingsFragment $r2 = $r1.newInstance();
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToCreateSavingsPinFragment(CreateSavingsModel createSavingsModel) {
        Log_OC.getArray(createSavingsModel, "model");
        CreateSavingPinFragment.Companion $r3 = CreateSavingPinFragment.Companion;
        CreateSavingPinFragment $r2 = $r3.newInstance(createSavingsModel);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToCreateSavingsPinFragment(UpdateSavingPlanRequest updateSavingPlanRequest) {
        Log_OC.getArray(updateSavingPlanRequest, "deactivatePlanRequest");
        CreateSavingPinFragment.Companion $r3 = CreateSavingPinFragment.Companion;
        CreateSavingPinFragment $r2 = $r3.newInstance(updateSavingPlanRequest);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToCreateSavingsPinFragment(WithdrawRequest withdrawRequest) {
        Log_OC.getArray(withdrawRequest, "withdrawRequest");
        CreateSavingPinFragment.Companion $r3 = CreateSavingPinFragment.Companion;
        CreateSavingPinFragment $r2 = $r3.newInstance(withdrawRequest);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToSavings() {
        SavingsFragment.Companion $r1 = SavingsFragment.Companion;
        SavingsFragment $r2 = SavingsFragment.Companion.newInstance$default($r1, null, 1, null);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToSavingsDetail(SavingResponse savingResponse) {
        Log_OC.getArray(savingResponse, "savingResponse");
        DetailAndTransactionFragment.Companion $r3 = DetailAndTransactionFragment.Companion;
        DetailAndTransactionFragment $r2 = $r3.newInstance(savingResponse);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToSavingsHistory(List list) {
        Log_OC.getArray(list, "savingResponse");
        SavingHistoryFragment.Companion $r3 = SavingHistoryFragment.Companion;
        SavingHistoryFragment $r2 = $r3.newInstance(list);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToSavingsPlan() {
        SavingsPlanFragment.Companion $r1 = SavingsPlanFragment.Companion;
        SavingsPlanFragment $r2 = $r1.newInstance();
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToSavingsReview(CreateSavingsModel createSavingsModel) {
        Log_OC.getArray(createSavingsModel, "savingsModel");
        SavingsReviewFragment.Companion $r3 = SavingsReviewFragment.Companion;
        SavingsReviewFragment $r2 = $r3.newInstance(createSavingsModel);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToSavingsSuccess() {
        SuccessScreenDialogFragment.Companion $r1 = SuccessScreenDialogFragment.Companion;
        int $i0 = C0456R.string.success;
        String $r2 = getString($i0);
        int $i02 = C0456R.string.savings_successfully_created;
        String $r3 = getString($i02);
        int $i03 = C0456R.string.close;
        String $r4 = getString($i03);
        int $i04 = C0456R.C0457drawable.ic_savings_success;
        Log_OC.loadImage($r2, "getString(R.string.success)");
        Log_OC.loadImage($r3, "getString(R.string.savings_successfully_created)");
        Log_OC.loadImage($r4, "getString(R.string.close)");
        SuccessScreenCustomOption $r5 = new SuccessScreenCustomOption($r2, $r3, $r4, true, false, false, 0, 0, 0, 0, $i04, 0, true, 3056, null);
        SavingsActivity$navigateToSavingsSuccess$1 $r6 = new SavingsActivity$navigateToSavingsSuccess$1(this);
        SuccessScreenDialogFragment $r7 = $r1.newInstance($r5, $r6);
        FragmentManager $r8 = getSupportFragmentManager();
        int $i05 = C0456R.string.success;
        $r7.show($r8, getString($i05));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToTermsAndCondition() {
        SavingsTermsAndConditionFragment.Companion $r1 = SavingsTermsAndConditionFragment.Companion;
        SavingsTermsAndConditionFragment $r2 = $r1.newInstance();
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void navigateToWithdraw(int i, String str, SavingResponse savingResponse) {
        Log_OC.getArray(str, "id");
        Log_OC.getArray(savingResponse, "savingResponse");
        WithdrawSavingsFragment.Companion $r4 = WithdrawSavingsFragment.Companion;
        WithdrawSavingsFragment $r3 = $r4.newInstance(i, str, savingResponse);
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r3, $i0, false, false, false, 28, null);
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
        AbstractC0925a $r2 = getSupportActionBar();
        if ($r2 != null) {
            $r2.mo37602u(true);
        }
        AbstractC0925a $r22 = getSupportActionBar();
        if ($r22 != null) {
            int $i0 = C0456R.C0457drawable.ic_arrow_backward;
            $r22.mo37597z($i0);
        }
        InterfaceC8209a $r3 = getBinding();
        ActivitySavingsBinding $r4 = (ActivitySavingsBinding) $r3;
        ErrorLayoutBinding $r5 = $r4.errorLayout;
        ViewGroup $r6 = $r5.startButton;
        ViewGroup r9 = $r6;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.savings.ui.ErrorActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SavingsActivity $r23 = SavingsActivity.this;
                SavingsActivity.m40538onCreate$lambda0($r23, view);
            }
        });
    }

    public final void setAnalytics(Analytics analytics) {
        Log_OC.getArray(analytics, "<set-?>");
        this.analytics = analytics;
    }

    public final void setAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }

    public final void setViewModel(SavingsViewModel savingsViewModel) {
        Log_OC.getArray(savingsViewModel, "<set-?>");
        this.viewModel = savingsViewModel;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void showSavingsDeactivatedDialog() {
        AppCompatActivityExtKt.popBackStackImm(this);
        SavingsPlanFragment.Companion $r1 = SavingsPlanFragment.Companion;
        SavingsPlanFragment $r2 = $r1.newInstance();
        int $i0 = C0456R.C0458id.flSavingsContainer;
        AppCompatActivityExtKt.startFragment$default(this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.savings.navigator.SavingsNavigator
    public void showWithdrawSuccessDialog() {
        Analytics $r1 = getAnalytics();
        $r1.launchWithdrawScreen();
        SuccessScreenDialogFragment.Companion $r2 = SuccessScreenDialogFragment.Companion;
        int $i0 = C0456R.string.withdraw_successful;
        String $r3 = getString($i0);
        int $i02 = C0456R.string.close;
        String $r4 = getString($i02);
        int $i03 = C0456R.C0457drawable.ic_wallet_reloaded;
        Log_OC.loadImage($r3, "getString(R.string.withdraw_successful)");
        Log_OC.loadImage($r4, "getString(R.string.close)");
        SuccessScreenCustomOption $r5 = new SuccessScreenCustomOption($r3, "", $r4, true, false, false, 0, 0, 0, 0, $i03, 0, true, 3056, null);
        SavingsActivity$showWithdrawSuccessDialog$1 $r6 = new SavingsActivity$showWithdrawSuccessDialog$1(this);
        SuccessScreenDialogFragment $r7 = $r2.newInstance($r5, $r6);
        FragmentManager $r8 = getSupportFragmentManager();
        int $i04 = C0456R.string.withdraw;
        $r7.show($r8, getString($i04));
    }
}
