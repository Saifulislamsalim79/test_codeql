package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.adapter.SavingStateAdapter;
import ai.kudi.agent.savings.adapter.SavingsAdapter;
import ai.kudi.agent.savings.data.viewdata.SavingsViewData;
import ai.kudi.agent.savings.databinding.FragmentSavingsBinding;
import ai.kudi.agent.savings.viewmodel.SavingsViewModel;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1565i;
import androidx.recyclerview.widget.C1697g;
import androidx.recyclerview.widget.RecyclerView;
import com.uber.autodispose.C7400d;
import com.uber.autodispose.InterfaceC7404f;
import com.uber.autodispose.InterfaceC7420n;
import com.uber.autodispose.android.lifecycle.C7396b;
import dagger.android.p197e.C7429a;
import kotlin.C13218k;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p259r.C8013r0;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.p450e0.Object;
/* compiled from: SavingsFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010(\u001a\u00020\u0014H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/savings/viewmodel/SavingsViewModel;", "Lai/kudi/agent/savings/data/viewdata/SavingsViewData;", "Lai/kudi/agent/savings/databinding/FragmentSavingsBinding;", "()V", "adapter", "Lai/kudi/agent/savings/adapter/SavingsAdapter;", "getAdapter", "()Lai/kudi/agent/savings/adapter/SavingsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "planId", "", "viewModel", "getViewModel", "()Lai/kudi/agent/savings/viewmodel/SavingsViewModel;", "setViewModel", "(Lai/kudi/agent/savings/viewmodel/SavingsViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "initAdapter", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "populateView", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.SavingsFragment */
/* loaded from: classes.dex */
public final class SavingsFragment extends BaseMVVMViewBindingFragment<SavingsViewModel, SavingsViewData, FragmentSavingsBinding> {
    public static final Companion Companion;
    private static final String PLAN_ID_KEY = "savings_plan";
    private final InterfaceC11824h adapter$delegate;
    private String planId;
    public SavingsViewModel viewModel;

    /* compiled from: SavingsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/savings/ui/SavingsFragment$Companion;", "", "()V", "PLAN_ID_KEY", "", "newInstance", "Lai/kudi/agent/savings/ui/SavingsFragment;", "planId", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.SavingsFragment$Companion */
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
        public static /* synthetic */ SavingsFragment newInstance$default(Companion companion, String $r3, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = null;
            }
            SavingsFragment $r1 = companion.newInstance($r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final SavingsFragment newInstance(String str) {
            SavingsFragment $r1 = new SavingsFragment();
            C13287o $r4 = C13664u.m4227a(SavingsFragment.PLAN_ID_KEY, str);
            C13287o[] $r3 = {$r4};
            Bundle $r5 = C1372b.m36174a($r3);
            $r1.setArguments($r5);
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
    public SavingsFragment() {
        InterfaceC11824h $r1;
        SavingsFragment$adapter$2 $r2 = SavingsFragment$adapter$2.INSTANCE;
        $r1 = C13218k.m5625b($r2);
        this.adapter$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyViewData$lambda-2 */
    public static final void m40544applyViewData$lambda2(SavingsFragment savingsFragment, C8013r0 c8013r0) {
        Log_OC.getArray(savingsFragment, "this$0");
        SavingsAdapter $r2 = savingsFragment.getAdapter();
        AbstractC1565i $r3 = savingsFragment.getLifecycle();
        Log_OC.loadImage($r3, "lifecycle");
        Log_OC.loadImage(c8013r0, "savingItem");
        $r2.submitData($r3, c8013r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SavingsAdapter getAdapter() {
        InterfaceC11824h $r2 = this.adapter$delegate;
        Object $r1 = $r2.getValue();
        SavingsAdapter $r3 = (SavingsAdapter) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initAdapter() {
        SavingsAdapter $r2 = getAdapter();
        SavingsFragment$initAdapter$1 $r3 = new SavingsFragment$initAdapter$1(this);
        $r2.addLoadStateListener($r3);
        InterfaceC8209a $r4 = requireBinding();
        FragmentSavingsBinding $r5 = (FragmentSavingsBinding) $r4;
        RecyclerView $r6 = $r5.rvSavingsTransactionView;
        SavingsAdapter $r22 = getAdapter();
        SavingStateAdapter $r1 = new SavingStateAdapter();
        C1697g $r7 = $r22.withLoadStateFooter($r1);
        $r6.setAdapter($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void populateView() {
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            throw $r6;
        }
        AppCompatActivity $r2 = (AppCompatActivity) $r1;
        AbstractC0925a $r3 = $r2.getSupportActionBar();
        if ($r3 != null) {
            int $i0 = C0456R.string.saving_transaction_title;
            String $r4 = getString($i0);
            $r3.mo37631C($r4);
        }
        SavingsViewModel $r5 = getViewModel();
        $r5.getSavingBalance();
        SavingsViewModel $r52 = getViewModel();
        SavingsViewModel.getSavingsTransaction$default($r52, null, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        SavingsViewData $r2 = (SavingsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(SavingsViewData savingsViewData) {
        Log_OC.getArray(savingsViewData, "viewData");
        boolean $z0 = savingsViewData instanceof SavingsViewData.TotalBalance;
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            TextView $r4 = ((FragmentSavingsBinding) $r2).tvTotalSavingBalance;
            SavingsViewData.TotalBalance $r5 = (SavingsViewData.TotalBalance) savingsViewData;
            int $i0 = $r5.getAmount();
            String $r6 = StringExtKt.getFormatAmount($i0);
            $r4.setText($r6);
            return;
        }
        boolean $z02 = savingsViewData instanceof SavingsViewData.SavingTransactions;
        if ($z02) {
            SavingsViewData.SavingTransactions $r7 = (SavingsViewData.SavingTransactions) savingsViewData;
            AbstractC11293f $r8 = $r7.getData();
            C7396b $r9 = C7396b.g(this);
            InterfaceC7404f $r10 = C7400d.m18802a($r9);
            Object $r11 = $r8.m11183b($r10);
            InterfaceC7420n $r12 = (InterfaceC7420n) $r11;
            $r12.a(new Object() { // from class: ai.kudi.agent.savings.ui.FromMatchesFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    SavingsFragment $r1 = SavingsFragment.this;
                    C8013r0 $r3 = (C8013r0) obj;
                    SavingsFragment.m40544applyViewData$lambda2($r1, $r3);
                }
            });
            return;
        }
        boolean $z03 = savingsViewData instanceof SavingsViewData.ShowProgress;
        if ($z03) {
            InterfaceC8209a $r22 = requireBinding();
            FragmentSavingsBinding $r3 = (FragmentSavingsBinding) $r22;
            SavingsViewData.ShowProgress $r14 = (SavingsViewData.ShowProgress) savingsViewData;
            boolean $z04 = $r14.getVisibility();
            if ($z04) {
                View $r15 = $r3.shimmerLoader;
                Log_OC.loadImage($r15, "shimmerLoader");
                View r17 = $r15;
                ViewExtKt.show(r17);
                return;
            }
            View $r152 = $r3.shimmerLoader;
            Log_OC.loadImage($r152, "shimmerLoader");
            View r172 = $r152;
            ViewExtKt.hide$default(r172, false, 1, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        SavingsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public SavingsViewModel createViewModel() {
        SavingsViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return SavingsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final SavingsViewModel getViewModel() {
        SavingsViewModel $r1 = this.viewModel;
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
        String $r2 = $r1.getString(PLAN_ID_KEY);
        this.planId = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSavingsBinding $r4 = FragmentSavingsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        String $r3 = this.planId;
        C13666w $r4 = null;
        if ($r3 != null) {
            InterfaceC8209a $r5 = requireBinding();
            FragmentSavingsBinding $r6 = (FragmentSavingsBinding) $r5;
            TextView $r7 = $r6.tvTotalSavingBalance;
            Log_OC.loadImage($r7, "requireBinding().tvTotalSavingBalance");
            ViewExtKt.hide$default($r7, false, 1, null);
            InterfaceC8209a $r52 = requireBinding();
            FragmentSavingsBinding $r62 = (FragmentSavingsBinding) $r52;
            TextView $r72 = $r62.tvTotalSavedHeader;
            Log_OC.loadImage($r72, "requireBinding().tvTotalSavedHeader");
            ViewExtKt.hide$default($r72, false, 1, null);
            SavingsViewModel $r8 = getViewModel();
            $r8.getSavingsTransaction($r3);
            $r4 = C13666w.f30112a;
        }
        if ($r4 == null) {
            populateView();
        }
        initAdapter();
    }

    public final void setViewModel(SavingsViewModel savingsViewModel) {
        Log_OC.getArray(savingsViewModel, "<set-?>");
        this.viewModel = savingsViewModel;
    }
}
