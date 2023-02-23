package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_kshock.databinding.FragmentOverdueLoansListBinding;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.p009ui.adapter.OverdueLoansAdapter;
import ai.kudi.agent.kshock.p009ui.views.PaybackLoanConfirmationDialog;
import ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.android.p197e.C7429a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KshockOverdueLoansListFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0014J\b\u0010\u0017\u001a\u00020\u0002H\u0014J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u000e\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0013R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockOverdueLoansListFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KshockPendingLoansListViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentOverdueLoansListBinding;", "()V", "kshockPendingLoansListViewModel", "getKshockPendingLoansListViewModel", "()Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "setKshockPendingLoansListViewModel", "(Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;)V", "overdueLoanAdapter", "Lai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter;", "getOverdueLoanAdapter", "()Lai/kudi/agent/kshock/ui/adapter/OverdueLoansAdapter;", "overdueLoanAdapter$delegate", "Lkotlin/Lazy;", "overdueLoanList", "", "Lai/kudi/agent/kshock/data/model/Loan;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "paybackLoan", KshockOverdueLoansDetailFragment.KEY_LOAN, "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockOverdueLoansListFragment */
/* loaded from: classes.dex */
public final class KshockOverdueLoansListFragment extends BaseMVVMViewBindingFragment<KshockPendingLoansListViewModel, KshockPendingLoansListViewData, FragmentOverdueLoansListBinding> {
    public static final Companion Companion;
    public static final String OVERDUE = "OVERDUE";
    public KshockPendingLoansListViewModel kshockPendingLoansListViewModel;
    private final InterfaceC11824h overdueLoanAdapter$delegate;
    private final List<Loan> overdueLoanList;

    /* compiled from: KshockOverdueLoansListFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockOverdueLoansListFragment$Companion;", "", "()V", "OVERDUE", "", "newInstance", "Lai/kudi/agent/kshock/ui/views/KshockOverdueLoansListFragment;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.KshockOverdueLoansListFragment$Companion */
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
        public final KshockOverdueLoansListFragment newInstance() {
            KshockOverdueLoansListFragment $r1 = new KshockOverdueLoansListFragment();
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
    public KshockOverdueLoansListFragment() {
        InterfaceC11824h $r1;
        ArrayList $r2 = new ArrayList();
        this.overdueLoanList = $r2;
        KshockOverdueLoansListFragment$overdueLoanAdapter$2 $r3 = KshockOverdueLoansListFragment$overdueLoanAdapter$2.INSTANCE;
        $r1 = C13218k.m5625b($r3);
        this.overdueLoanAdapter$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final OverdueLoansAdapter getOverdueLoanAdapter() {
        InterfaceC11824h $r2 = this.overdueLoanAdapter$delegate;
        Object $r1 = $r2.getValue();
        OverdueLoansAdapter $r3 = (OverdueLoansAdapter) $r1;
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
    protected void applyViewData(KshockPendingLoansListViewData kshockPendingLoansListViewData) {
        Log_OC.getArray(kshockPendingLoansListViewData, "viewData");
        boolean $z0 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.Error;
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            ProgressBar $r4 = ((FragmentOverdueLoansListBinding) $r2).progressBar;
            Log_OC.loadImage($r4, "progressBar");
            ViewExtKt.hide$default($r4, false, 1, null);
            Context $r5 = requireContext();
            Log_OC.loadImage($r5, "requireContext()");
            KshockPendingLoansListViewData.Error $r6 = (KshockPendingLoansListViewData.Error) kshockPendingLoansListViewData;
            String $r7 = $r6.getError();
            ContextExtKt.toast$default($r5, $r7, 0, 2, (Object) null);
            return;
        }
        boolean $z02 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.OverdueError;
        if ($z02) {
            InterfaceC8209a $r22 = requireBinding();
            TextView $r8 = ((FragmentOverdueLoansListBinding) $r22).subHeaderText;
            Log_OC.loadImage($r8, "subHeaderText");
            ViewExtKt.hide$default($r8, false, 1, null);
            return;
        }
        boolean $z03 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.HideLoading;
        if ($z03) {
            InterfaceC8209a $r23 = requireBinding();
            ProgressBar $r42 = ((FragmentOverdueLoansListBinding) $r23).progressBar;
            Log_OC.loadImage($r42, "requireBinding().progressBar");
            ViewExtKt.hide$default($r42, false, 1, null);
            return;
        }
        boolean $z04 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.OverdueHideLoading;
        if ($z04) {
            InterfaceC8209a $r24 = requireBinding();
            FragmentOverdueLoansListBinding $r3 = (FragmentOverdueLoansListBinding) $r24;
            ProgressBar $r43 = $r3.progressBar;
            Log_OC.loadImage($r43, "progressBar");
            ViewExtKt.hide$default($r43, false, 1, null);
            TextView $r82 = $r3.subHeaderText;
            Log_OC.loadImage($r82, "subHeaderText");
            ViewExtKt.show($r82);
            return;
        }
        boolean $z05 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.Loading;
        if ($z05) {
            InterfaceC8209a $r25 = requireBinding();
            ProgressBar $r44 = ((FragmentOverdueLoansListBinding) $r25).progressBar;
            Log_OC.loadImage($r44, "progressBar");
            ViewExtKt.show($r44);
            return;
        }
        boolean $z06 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.OverdueLoading;
        if ($z06) {
            InterfaceC8209a $r26 = requireBinding();
            TextView $r83 = ((FragmentOverdueLoansListBinding) $r26).subHeaderText;
            Log_OC.loadImage($r83, "subHeaderText");
            ViewExtKt.hide$default($r83, false, 1, null);
            return;
        }
        boolean $z07 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.PendingLoans;
        if ($z07) {
            return;
        }
        boolean $z08 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.OverdueLoans;
        if (!$z08) {
            boolean $z09 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.PaybackManually;
            if ($z09) {
                return;
            }
            boolean $z010 = kshockPendingLoansListViewData instanceof KshockPendingLoansListViewData.PaybackManuallyLoading;
            if ($z010) {
            }
            return;
        }
        KshockPendingLoansListViewData.OverdueLoans $r9 = (KshockPendingLoansListViewData.OverdueLoans) kshockPendingLoansListViewData;
        List $r10 = $r9.getList();
        boolean $z011 = $r10.isEmpty();
        if ($z011) {
            InterfaceC8209a $r27 = requireBinding();
            FragmentOverdueLoansListBinding $r32 = (FragmentOverdueLoansListBinding) $r27;
            LinearLayout $r11 = $r32.emptyView;
            Log_OC.loadImage($r11, "emptyView");
            ViewExtKt.show($r11);
            TextView $r84 = $r32.subHeaderText;
            Log_OC.loadImage($r84, "subHeaderText");
            ViewExtKt.hide$default($r84, false, 1, null);
            View $r12 = $r32.overdueLoansListRv;
            Log_OC.loadImage($r12, "overdueLoansListRv");
            View r17 = $r12;
            ViewExtKt.hide$default(r17, false, 1, null);
            return;
        }
        List $r102 = this.overdueLoanList;
        $r102.clear();
        List $r103 = this.overdueLoanList;
        List $r13 = $r9.getList();
        $r103.addAll($r13);
        InterfaceC8209a $r28 = requireBinding();
        RecyclerView $r122 = ((FragmentOverdueLoansListBinding) $r28).overdueLoansListRv;
        OverdueLoansAdapter $r14 = getOverdueLoanAdapter();
        $r122.setAdapter($r14);
        OverdueLoansAdapter $r142 = getOverdueLoanAdapter();
        List $r104 = this.overdueLoanList;
        $r142.submitList($r104);
        OverdueLoansAdapter $r143 = getOverdueLoanAdapter();
        KshockOverdueLoansListFragment$applyViewData$7 r16 = new KshockOverdueLoansListFragment$applyViewData$7(this);
        $r143.setOnActionButtonClickListener(r16);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        KshockPendingLoansListViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOverdueLoansListBinding $r4 = FragmentOverdueLoansListBinding.inflate(layoutInflater, viewGroup, false);
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
        $r5.getOverdueLoans();
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
        KshockOverdueLoansListFragment$paybackLoan$1 $r6 = new KshockOverdueLoansListFragment$paybackLoan$1(this, loan);
        PaybackLoanConfirmationDialog $r7 = $r2.newInstance($r4, $r6);
        FragmentManager $r8 = getChildFragmentManager();
        $r7.show($r8, PaybackLoanConfirmationDialog.class.getCanonicalName());
    }

    public final void setKshockPendingLoansListViewModel(KshockPendingLoansListViewModel kshockPendingLoansListViewModel) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "<set-?>");
        this.kshockPendingLoansListViewModel = kshockPendingLoansListViewModel;
    }
}
