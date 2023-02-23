package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.FragmentLoanApplicationSubmittedBinding;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.presentation.KShockViewModel;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1564h0;
import androidx.lifecycle.Extension;
import dagger.android.p197e.C7429a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: LoanApplicationSubmittedFragment.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0001J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0019H\u0016J\u001a\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\t\u0010#\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/LoanApplicationSubmittedFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_kshock/databinding/FragmentLoanApplicationSubmittedBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/feature_kshock/databinding/FragmentLoanApplicationSubmittedBinding;", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "viewModel", "Lai/kudi/agent/kshock/presentation/KShockViewModel;", "getViewModel", "()Lai/kudi/agent/kshock/presentation/KShockViewModel;", "setViewModel", "(Lai/kudi/agent/kshock/presentation/KShockViewModel;)V", "initBinding", "Landroid/view/View;", "fragment", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onSaveInstanceState", "outState", "onViewCreated", "view", "requireBinding", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanApplicationSubmittedFragment */
/* loaded from: classes.dex */
public final class LoanApplicationSubmittedFragment extends Fragment implements BaseViewBinder<FragmentLoanApplicationSubmittedBinding> {
    public static final Companion Companion;
    public static final String LOAN = "LOAN";
    public static final String PAGE_KEY = "LoanApplicationSubmittedFragment";
    private final /* synthetic */ BaseViewBinderImpl<FragmentLoanApplicationSubmittedBinding> $$delegate_0;
    private Loan loan;
    public KShockViewModel viewModel;

    /* compiled from: LoanApplicationSubmittedFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/LoanApplicationSubmittedFragment$Companion;", "", "()V", "LOAN", "", "TAG", "newInstance", "Lai/kudi/agent/kshock/ui/views/LoanApplicationSubmittedFragment;", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.LoanApplicationSubmittedFragment$Companion */
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
        public final LoanApplicationSubmittedFragment newInstance(Loan loan) {
            Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
            LoanApplicationSubmittedFragment $r3 = new LoanApplicationSubmittedFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable("LOAN", loan);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoanApplicationSubmittedFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-2  reason: not valid java name */
    public static final void m39654onViewCreated$lambda5$lambda2(LoanApplicationSubmittedFragment loanApplicationSubmittedFragment, View view) {
        Log_OC.getArray(loanApplicationSubmittedFragment, "this$0");
        FragmentActivity $r0 = loanApplicationSubmittedFragment.requireActivity();
        $r0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m39655onViewCreated$lambda5$lambda3(LoanApplicationSubmittedFragment loanApplicationSubmittedFragment, View view) {
        Log_OC.getArray(loanApplicationSubmittedFragment, "this$0");
        FragmentActivity $r0 = loanApplicationSubmittedFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentLoanApplicationSubmittedBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentLoanApplicationSubmittedBinding $r3 = (FragmentLoanApplicationSubmittedBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentLoanApplicationSubmittedBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
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
    public View initBinding(FragmentLoanApplicationSubmittedBinding fragmentLoanApplicationSubmittedBinding, Fragment fragment) {
        Log_OC.getArray(fragmentLoanApplicationSubmittedBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentLoanApplicationSubmittedBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentLoanApplicationSubmittedBinding $r4 = (FragmentLoanApplicationSubmittedBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
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
            Parcelable $r3 = $r2.getParcelable("LOAN");
            Loan $r4 = (Loan) $r3;
            this.loan = $r4;
        }
        if (bundle == null) {
            return;
        }
        Parcelable $r32 = bundle.getParcelable("LOAN");
        Loan $r42 = (Loan) $r32;
        this.loan = $r42;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentLoanApplicationSubmittedBinding $r4 = FragmentLoanApplicationSubmittedBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Log_OC.getArray(bundle, "outState");
        Loan $r2 = this.loan;
        bundle.putParcelable("LOAN", $r2);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Double $r17;
        String $r18;
        C13666w $r16;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r5 = getActivity();
        boolean $z0 = $r5 instanceof KShockActivity;
        KShockActivity $r6 = $z0 ? (KShockActivity) $r5 : null;
        if ($r6 != null) {
            $r6.hideActionBar();
        }
        C1556g0 $r7 = C1564h0.b(requireActivity());
        Extension $r8 = $r7.m35533a((Class<Extension>) KShockViewModel.class);
        Log_OC.loadImage($r8, "ViewModelProviders.of(requireActivity())[KShockViewModel::class.java]");
        KShockViewModel $r9 = (KShockViewModel) $r8;
        setViewModel($r9);
        FragmentLoanApplicationSubmittedBinding $r10 = requireBinding();
        ViewGroup $r11 = $r10.checkStatusButton;
        ViewGroup r21 = $r11;
        r21.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.FilenameDialog$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoanApplicationSubmittedFragment $r2 = LoanApplicationSubmittedFragment.this;
                LoanApplicationSubmittedFragment.m39654onViewCreated$lambda5$lambda2($r2, view2);
            }
        });
        ImageButton $r13 = $r10.closeButton;
        ImageButton r22 = $r13;
        r22.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.views.SubscribeActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LoanApplicationSubmittedFragment $r2 = LoanApplicationSubmittedFragment.this;
                LoanApplicationSubmittedFragment.m39655onViewCreated$lambda5$lambda3($r2, view2);
            }
        });
        Loan $r15 = this.loan;
        if ($r15 == null || ($r17 = $r15.getAmountDisbursed()) == null || ($r18 = StringExtKt.formatAmount($r17)) == null) {
            $r16 = null;
        } else {
            TextView $r1 = $r10.titleMsg;
            int $i0 = C0220R.string.loan_successfully_credited;
            Object[] $r2 = {$r18};
            $r1.setText(getString($i0, $r2));
            $r16 = C13666w.f30112a;
        }
        if ($r16 == null) {
            TextView $r12 = $r10.titleMsg;
            Log_OC.loadImage($r12, "titleMsg");
            ViewExtKt.hide$default($r12, false, 1, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentLoanApplicationSubmittedBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentLoanApplicationSubmittedBinding $r3 = (FragmentLoanApplicationSubmittedBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentLoanApplicationSubmittedBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setViewModel(KShockViewModel kShockViewModel) {
        Log_OC.getArray(kShockViewModel, "<set-?>");
        this.viewModel = kShockViewModel;
    }
}
