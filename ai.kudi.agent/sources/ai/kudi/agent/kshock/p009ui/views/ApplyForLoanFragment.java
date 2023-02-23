package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.feature_kshock.databinding.FragmentApplyForLoanBinding;
import ai.kudi.agent.feature_kshock.databinding.KshockToolBarBinding;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.presentation.ApplyForLoanViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.ApplyForLoanViewData;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiNairaInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import dagger.android.p197e.C7429a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13275r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ApplyForLoanFragment.kt */
@Metadata(m10422d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0014J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u001e\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/ApplyForLoanFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/ApplyForLoanViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/ApplyForLoanViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentApplyForLoanBinding;", "()V", "maxLoanAmount", "", "Ljava/lang/Double;", "viewModel", "getViewModel", "()Lai/kudi/agent/kshock/presentation/ApplyForLoanViewModel;", "setViewModel", "(Lai/kudi/agent/kshock/presentation/ApplyForLoanViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.ApplyForLoanFragment */
/* loaded from: classes.dex */
public final class ApplyForLoanFragment extends BaseMVVMViewBindingFragment<ApplyForLoanViewModel, ApplyForLoanViewData, FragmentApplyForLoanBinding> {
    public static final Companion Companion;
    public static final String MAX_LOAN_AMT = "MAX_LOAN_AMOUNT";
    public static final String PAGE_KEY = "ApplyForLoanFragment";
    private Double maxLoanAmount;
    public ApplyForLoanViewModel viewModel;

    /* compiled from: ApplyForLoanFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/ApplyForLoanFragment$Companion;", "", "()V", "MAX_LOAN_AMT", "", "TAG", "newInstance", "Lai/kudi/agent/kshock/ui/views/ApplyForLoanFragment;", "maxLoanAmount", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.ApplyForLoanFragment$Companion */
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
        public final ApplyForLoanFragment newInstance(double d) {
            ApplyForLoanFragment $r1 = new ApplyForLoanFragment();
            Bundle $r2 = new Bundle();
            $r2.putDouble(ApplyForLoanFragment.MAX_LOAN_AMT, d);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
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
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m39637onViewCreated$lambda1(ApplyForLoanFragment applyForLoanFragment, View view) {
        Integer $r6;
        Double $r8;
        Log_OC.getArray(applyForLoanFragment, "this$0");
        InterfaceC8209a $r2 = applyForLoanFragment.requireBinding();
        FragmentApplyForLoanBinding $r3 = (FragmentApplyForLoanBinding) $r2;
        KudiNairaInputField $r4 = $r3.amountField;
        String $r5 = $r4.getText();
        $r6 = C13275r.m5455k(StringExtKt.getRemoveAllLetters($r5));
        ContextExtKt.hideKeyboard(applyForLoanFragment);
        ApplyForLoanViewModel $r7 = applyForLoanFragment.getViewModel();
        if ($r6 == null) {
            $r8 = null;
        } else {
            int $i0 = $r6.intValue();
            double $d0 = $i0;
            $r8 = Double.valueOf($d0);
        }
        Double $r9 = applyForLoanFragment.maxLoanAmount;
        $r7.onNext($r8, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m39638onViewCreated$lambda2(ApplyForLoanFragment applyForLoanFragment, View view) {
        Log_OC.getArray(applyForLoanFragment, "this$0");
        FragmentActivity $r0 = applyForLoanFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ApplyForLoanViewData $r2 = (ApplyForLoanViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ApplyForLoanViewData applyForLoanViewData) {
        Log_OC.getArray(applyForLoanViewData, "viewData");
        boolean $z0 = applyForLoanViewData.isLoading();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentApplyForLoanBinding $r3 = (FragmentApplyForLoanBinding) $r2;
            KudiButton $r4 = $r3.submitButton;
            $r4.m38032f();
        } else {
            InterfaceC8209a $r22 = requireBinding();
            FragmentApplyForLoanBinding $r32 = (FragmentApplyForLoanBinding) $r22;
            KudiButton $r42 = $r32.submitButton;
            $r42.m38033e();
        }
        ApplyForLoanViewData.Error $r5 = applyForLoanViewData.getError();
        if ($r5 == null) {
            return;
        }
        String $r6 = $r5.getMessage();
        if ($r6 != null) {
            FragmentActivity $r7 = requireActivity();
            Log_OC.loadImage($r7, "requireActivity()");
            ContextExtKt.toast$default($r7, $r6, 0, 2, (Object) null);
        }
        String $r62 = $r5.getAmount();
        if ($r62 == null) {
            return;
        }
        InterfaceC8209a $r23 = requireBinding();
        FragmentApplyForLoanBinding $r33 = (FragmentApplyForLoanBinding) $r23;
        KudiNairaInputField $r8 = $r33.amountField;
        $r8.setError($r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ApplyForLoanViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ApplyForLoanViewModel createViewModel() {
        ApplyForLoanViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ApplyForLoanViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final ApplyForLoanViewModel getViewModel() {
        ApplyForLoanViewModel $r1 = this.viewModel;
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
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        double $d0 = $r1.getDouble(MAX_LOAN_AMT);
        Double $r2 = Double.valueOf($d0);
        this.maxLoanAmount = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentApplyForLoanBinding $r4 = FragmentApplyForLoanBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater, container, false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
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
        InterfaceC8209a $r6 = requireBinding();
        FragmentApplyForLoanBinding $r7 = (FragmentApplyForLoanBinding) $r6;
        TextView $r8 = $r7.maximumAmount;
        Double $r9 = this.maxLoanAmount;
        String $r4 = $r9 != null ? StringExtKt.formatAmount($r9) : null;
        $r8.setText($r4);
        InterfaceC8209a $r62 = requireBinding();
        FragmentApplyForLoanBinding $r72 = (FragmentApplyForLoanBinding) $r62;
        ViewGroup $r10 = $r72.submitButton;
        ViewGroup r17 = $r10;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ApplyForLoanFragment $r2 = ApplyForLoanFragment.this;
                ApplyForLoanFragment.m39637onViewCreated$lambda1($r2, view2);
            }
        });
        InterfaceC8209a $r63 = requireBinding();
        FragmentApplyForLoanBinding $r73 = (FragmentApplyForLoanBinding) $r63;
        KshockToolBarBinding $r12 = $r73.kshockToolBar;
        ImageView $r13 = $r12.backButton;
        ImageView r18 = $r13;
        r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ApplyForLoanFragment $r2 = ApplyForLoanFragment.this;
                ApplyForLoanFragment.m39638onViewCreated$lambda2($r2, view2);
            }
        });
    }

    public final void setViewModel(ApplyForLoanViewModel applyForLoanViewModel) {
        Log_OC.getArray(applyForLoanViewModel, "<set-?>");
        this.viewModel = applyForLoanViewModel;
    }
}
