package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.feature_kshock.databinding.FragmentApplyForLoanReviewBinding;
import ai.kudi.agent.feature_kshock.databinding.KshockToolBarBinding;
import ai.kudi.agent.kshock.data.model.Interest;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.presentation.ApplyForLoanReviewViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.ApplyForLoanReviewViewData;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import dagger.android.p197e.C7429a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ApplyForLoanReviewFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u001a\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010%\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/ApplyForLoanReviewFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/ApplyForLoanReviewViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/ApplyForLoanReviewViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentApplyForLoanReviewBinding;", "()V", "charge", "", "interest", "Lai/kudi/agent/kshock/data/model/Interest;", "viewModel", "getViewModel", "()Lai/kudi/agent/kshock/presentation/ApplyForLoanReviewViewModel;", "setViewModel", "(Lai/kudi/agent/kshock/presentation/ApplyForLoanReviewViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "verifyPin", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.ApplyForLoanReviewFragment */
/* loaded from: classes.dex */
public final class ApplyForLoanReviewFragment extends BaseMVVMViewBindingFragment<ApplyForLoanReviewViewModel, ApplyForLoanReviewViewData, FragmentApplyForLoanReviewBinding> {
    public static final String BUNDLE_KEY_INTEREST = "BUNDLE_KEY_CHARGE";
    public static final Companion Companion;
    public static final String PAGE_KEY = "ApplyForLoanFragment";
    private double charge;
    private Interest interest;
    public ApplyForLoanReviewViewModel viewModel;

    /* compiled from: ApplyForLoanReviewFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/ApplyForLoanReviewFragment$Companion;", "", "()V", "BUNDLE_KEY_INTEREST", "", "TAG", "newInstance", "Lai/kudi/agent/kshock/ui/views/ApplyForLoanReviewFragment;", "interest", "Lai/kudi/agent/kshock/data/model/Interest;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.ApplyForLoanReviewFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final ApplyForLoanReviewFragment newInstance(Interest interest) {
            Log_OC.getArray(interest, "interest");
            Bundle $r2 = new Bundle();
            $r2.putParcelable(ApplyForLoanReviewFragment.BUNDLE_KEY_INTEREST, interest);
            ApplyForLoanReviewFragment $r3 = new ApplyForLoanReviewFragment();
            $r3.setArguments($r2);
            return $r3;
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
    /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
    public static final void m39639onViewCreated$lambda4(ApplyForLoanReviewFragment applyForLoanReviewFragment, View view) {
        Log_OC.getArray(applyForLoanReviewFragment, "this$0");
        FragmentActivity $r0 = applyForLoanReviewFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
    public static final void m39640onViewCreated$lambda5(ApplyForLoanReviewFragment applyForLoanReviewFragment, View view) {
        Log_OC.getArray(applyForLoanReviewFragment, "this$0");
        applyForLoanReviewFragment.verifyPin();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void verifyPin() {
        FragmentManager $r2 = getChildFragmentManager();
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r2.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r3, new InterfaceC1523w() { // from class: ai.kudi.agent.kshock.ui.views.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38773c(String str, Bundle bundle) {
                ApplyForLoanReviewFragment $r32 = ApplyForLoanReviewFragment.this;
                ApplyForLoanReviewFragment.m39641verifyPin$lambda7($r32, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r5 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        FragmentManager $r22 = getChildFragmentManager();
        ((Chapter) $r5).show($r22, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: verifyPin$lambda-7  reason: not valid java name */
    public static final void m39641verifyPin$lambda7(ApplyForLoanReviewFragment applyForLoanReviewFragment, String str, Bundle bundle) {
        Log_OC.getArray(applyForLoanReviewFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        ApplyForLoanReviewViewModel $r3 = applyForLoanReviewFragment.getViewModel();
        $r3.onPinEntered();
        Interest $r4 = applyForLoanReviewFragment.interest;
        if ($r4 == null) {
            return;
        }
        ApplyForLoanReviewViewModel $r32 = applyForLoanReviewFragment.getViewModel();
        $r32.isOtpRequired($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ApplyForLoanReviewViewData $r2 = (ApplyForLoanReviewViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ApplyForLoanReviewViewData applyForLoanReviewViewData) {
        Log_OC.getArray(applyForLoanReviewViewData, "viewData");
        boolean $z0 = applyForLoanReviewViewData.isLoading();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentApplyForLoanReviewBinding $r3 = (FragmentApplyForLoanReviewBinding) $r2;
            KudiButton $r4 = $r3.submitButton;
            $r4.m38032f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentApplyForLoanReviewBinding $r32 = (FragmentApplyForLoanReviewBinding) $r22;
            KudiButton $r42 = $r32.submitButton;
            $r42.m38033e();
        }
        String $r5 = applyForLoanReviewViewData.getError();
        if ($r5 == null) {
            return;
        }
        FragmentActivity $r6 = requireActivity();
        Log_OC.loadImage($r6, "requireActivity()");
        ContextExtKt.toast$default($r6, $r5, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ApplyForLoanReviewViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ApplyForLoanReviewViewModel createViewModel() {
        ApplyForLoanReviewViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ApplyForLoanReviewViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final ApplyForLoanReviewViewModel getViewModel() {
        ApplyForLoanReviewViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r2 = getArguments();
        if ($r2 != null) {
            Parcelable $r3 = $r2.getParcelable(BUNDLE_KEY_INTEREST);
            Interest $r4 = (Interest) $r3;
            this.interest = $r4;
        }
        if (bundle == null) {
            return;
        }
        Parcelable $r32 = bundle.getParcelable(BUNDLE_KEY_INTEREST);
        Interest $r42 = (Interest) $r32;
        this.interest = $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentApplyForLoanReviewBinding $r4 = FragmentApplyForLoanReviewBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Log_OC.getArray(bundle, "outState");
        Interest $r2 = this.interest;
        bundle.putParcelable(BUNDLE_KEY_INTEREST, $r2);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = getActivity();
        boolean $z0 = $r3 instanceof KShockActivity;
        KShockActivity $r5 = $z0 ? (KShockActivity) $r3 : null;
        if ($r5 != null) {
            $r5.hideActionBar();
        }
        ApplyForLoanReviewViewModel $r6 = getViewModel();
        $r6.loanSummaryAnalytics();
        Interest $r7 = this.interest;
        if ($r7 != null) {
            InterfaceC8209a $r8 = requireBinding();
            FragmentApplyForLoanReviewBinding $r9 = (FragmentApplyForLoanReviewBinding) $r8;
            TextView $r10 = $r9.amountText;
            double $d0 = $r7.getAmount();
            Double $r11 = Double.valueOf($d0);
            String $r12 = StringExtKt.formatAmount($r11);
            $r10.setText($r12);
            TextView $r102 = $r9.chargeText;
            double $d02 = $r7.getCharge();
            Double $r112 = Double.valueOf($d02);
            String $r122 = StringExtKt.formatAmount($r112);
            $r102.setText($r122);
            TextView $r103 = $r9.dueDateText;
            String $r123 = $r7.getDueDate();
            String $r4 = $r123 != null ? StringExtKt.formatDateWithTime($r123, "T") : null;
            $r103.setText($r4);
            TextView $r104 = $r9.interestText;
            Double $r113 = $r7.getInterestRate();
            String $r42 = StringExtKt.formatInterest($r113);
            $r104.setText($r42);
        }
        InterfaceC8209a $r82 = requireBinding();
        FragmentApplyForLoanReviewBinding $r92 = (FragmentApplyForLoanReviewBinding) $r82;
        KshockToolBarBinding $r13 = $r92.kshockToolBar;
        ImageView $r14 = $r13.backButton;
        ImageView r20 = $r14;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ApplyForLoanReviewFragment $r2 = ApplyForLoanReviewFragment.this;
                ApplyForLoanReviewFragment.m39639onViewCreated$lambda4($r2, view2);
            }
        });
        InterfaceC8209a $r83 = requireBinding();
        FragmentApplyForLoanReviewBinding $r93 = (FragmentApplyForLoanReviewBinding) $r83;
        ViewGroup $r16 = $r93.submitButton;
        ViewGroup r21 = $r16;
        r21.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ApplyForLoanReviewFragment $r2 = ApplyForLoanReviewFragment.this;
                ApplyForLoanReviewFragment.m39640onViewCreated$lambda5($r2, view2);
            }
        });
    }

    public final void setViewModel(ApplyForLoanReviewViewModel applyForLoanReviewViewModel) {
        Log_OC.getArray(applyForLoanReviewViewModel, "<set-?>");
        this.viewModel = applyForLoanReviewViewModel;
    }
}
