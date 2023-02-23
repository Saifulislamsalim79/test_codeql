package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.FragmentPendingLoansListFragmentBinding;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.p009ui.adapter.PendingLoansAdapter;
import ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog;
import ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import dagger.android.p197e.C7429a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: KshockPendingLoansListFragment.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006/"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockPendingLoansListFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KshockPendingLoansListViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentPendingLoansListFragmentBinding;", "()V", "isEligible", "", "kshockPendingLoansListViewModel", "getKshockPendingLoansListViewModel", "()Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "setKshockPendingLoansListViewModel", "(Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;)V", "loanList", "", "Lai/kudi/agent/kshock/data/model/Loan;", "maxLoanAmt", "", "pendingLoanAdapter", "Lai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter;", "getPendingLoanAdapter", "()Lai/kudi/agent/kshock/ui/adapter/PendingLoansAdapter;", "pendingLoanAdapter$delegate", "Lkotlin/Lazy;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "paybackLoan", KshockOverdueLoansDetailFragment.KEY_LOAN, "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockPendingLoansListFragment */
/* loaded from: classes.dex */
public final class KshockPendingLoansListFragment extends BaseMVVMViewBindingFragment<KshockPendingLoansListViewModel, KshockPendingLoansListViewData, FragmentPendingLoansListFragmentBinding> {
    public static final Companion Companion;
    public static final String ELIGIBLE = "eligible";
    public static final String KEY_MAX_LOAN_AMT = "amt";
    private boolean isEligible = true;
    public KshockPendingLoansListViewModel kshockPendingLoansListViewModel;
    private final List<Loan> loanList;
    private double maxLoanAmt;
    private final InterfaceC11824h pendingLoanAdapter$delegate;

    /* compiled from: KshockPendingLoansListFragment.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockPendingLoansListFragment$Companion;", "", "()V", "ELIGIBLE", "", "KEY_MAX_LOAN_AMT", "newInstance", "Lai/kudi/agent/kshock/ui/views/KshockPendingLoansListFragment;", "maxLoanAmt", "", "eligible", "", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.KshockPendingLoansListFragment$Companion */
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
        public static /* synthetic */ KshockPendingLoansListFragment newInstance$default(Companion companion, double d, boolean $z0, int i, Object obj) {
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = true;
            }
            KshockPendingLoansListFragment $r1 = companion.newInstance(d, $z0);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final KshockPendingLoansListFragment newInstance(double d, boolean z) {
            KshockPendingLoansListFragment $r1 = new KshockPendingLoansListFragment();
            Double $r3 = Double.valueOf(d);
            C13287o $r4 = C13664u.m4227a(KshockPendingLoansListFragment.KEY_MAX_LOAN_AMT, $r3);
            Boolean $r5 = Boolean.valueOf(z);
            C13287o $r42 = C13664u.m4227a("eligible", $r5);
            C13287o[] $r2 = {$r4, $r42};
            Bundle $r6 = C1372b.m36174a($r2);
            $r1.setArguments($r6);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KshockPendingLoansListFragment() {
        InterfaceC11824h $r1;
        ArrayList $r2 = new ArrayList();
        this.loanList = $r2;
        KshockPendingLoansListFragment$pendingLoanAdapter$2 $r3 = KshockPendingLoansListFragment$pendingLoanAdapter$2.INSTANCE;
        $r1 = C13218k.m5625b($r3);
        this.pendingLoanAdapter$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyViewData$lambda-8$lambda-6 */
    public static final void m39651applyViewData$lambda8$lambda6(KshockPendingLoansListFragment kshockPendingLoansListFragment, View view) {
        Log_OC.getArray(kshockPendingLoansListFragment, "this$0");
        FragmentActivity $r2 = kshockPendingLoansListFragment.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        int $i0 = C0220R.string.loan_restrict_reason_overdue_text;
        String $r3 = kshockPendingLoansListFragment.getString($i0);
        ContextExtKt.toast$default($r2, $r3, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyViewData$lambda-8$lambda-7 */
    public static final void m39652applyViewData$lambda8$lambda7(KshockPendingLoansListFragment kshockPendingLoansListFragment, View view) {
        Log_OC.getArray(kshockPendingLoansListFragment, "this$0");
        KshockPendingLoansListViewModel $r1 = kshockPendingLoansListFragment.getKshockPendingLoansListViewModel();
        double $d0 = kshockPendingLoansListFragment.maxLoanAmt;
        $r1.navigateToExistingLoaner($d0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final PendingLoansAdapter getPendingLoanAdapter() {
        InterfaceC11824h $r2 = this.pendingLoanAdapter$delegate;
        Object $r1 = $r2.getValue();
        PendingLoansAdapter $r3 = (PendingLoansAdapter) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KshockPendingLoansListViewData $r2 = (KshockPendingLoansListViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:111:0x0266 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData r63) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment.applyViewData(ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KshockPendingLoansListViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public KshockPendingLoansListViewModel createViewModel() {
        KshockPendingLoansListViewModel $r1 = getKshockPendingLoansListViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final KshockPendingLoansListViewModel getKshockPendingLoansListViewModel() {
        KshockPendingLoansListViewModel $r1 = this.kshockPendingLoansListViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("kshockPendingLoansListViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return KshockPendingLoansListViewModel.class;
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
        double $d0 = $r1.getDouble(KEY_MAX_LOAN_AMT);
        this.maxLoanAmt = $d0;
        boolean $z0 = $r1.getBoolean("eligible");
        this.isEligible = $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPendingLoansListFragmentBinding $r4 = FragmentPendingLoansListFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        FragmentActivity $r3 = getActivity();
        boolean $z0 = $r3 instanceof KShockActivity;
        KShockActivity $r4 = $z0 ? (KShockActivity) $r3 : null;
        if ($r4 != null) {
            $r4.showSupportActionBar();
        }
        KshockPendingLoansListViewModel $r5 = getKshockPendingLoansListViewModel();
        double $d0 = this.maxLoanAmt;
        $r5.getPendingLoans($d0);
        KshockPendingLoansListViewModel $r52 = getKshockPendingLoansListViewModel();
        $r52.getOverdueLoans();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void paybackLoan(Loan loan) {
        String $r5;
        Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
        PaybackLoanConfirmationDialog.Companion $r2 = PaybackLoanConfirmationDialog.Companion;
        Double $r3 = loan.getAmountOwed();
        String $r4 = "";
        if ($r3 != null && ($r5 = StringExtKt.formatAmount($r3)) != null) {
            $r4 = $r5;
        }
        KshockPendingLoansListFragment$paybackLoan$1 $r6 = new KshockPendingLoansListFragment$paybackLoan$1(this, loan);
        PaybackLoanConfirmationDialog $r7 = $r2.newInstance($r4, $r6);
        FragmentManager $r8 = getChildFragmentManager();
        $r7.show($r8, PaybackLoanConfirmationDialog.class.getCanonicalName());
    }

    public final void setKshockPendingLoansListViewModel(KshockPendingLoansListViewModel kshockPendingLoansListViewModel) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "<set-?>");
        this.kshockPendingLoansListViewModel = kshockPendingLoansListViewModel;
    }
}
