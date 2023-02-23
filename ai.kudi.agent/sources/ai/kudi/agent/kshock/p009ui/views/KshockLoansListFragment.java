package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.feature_kshock.databinding.FragmentLoansListFragmentBinding;
import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansListFragment;
import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment;
import ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel;
import ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.tabs.TabLayout;
import dagger.android.p197e.C7429a;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: KshockLoansListFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010#\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockLoansListFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KshockPendingLoansListViewData;", "Lai/kudi/agent/feature_kshock/databinding/FragmentLoansListFragmentBinding;", "()V", "isEligible", "", "kshockPendingLoansListViewModel", "getKshockPendingLoansListViewModel", "()Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "setKshockPendingLoansListViewModel", "(Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;)V", "maxLoanAmt", "", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setUpFragmentTabs", "Companion", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.KshockLoansListFragment */
/* loaded from: classes.dex */
public final class KshockLoansListFragment extends BaseMVVMViewBindingFragment<KshockPendingLoansListViewModel, KshockPendingLoansListViewData, FragmentLoansListFragmentBinding> {
    private static final int ACTIVE = 0;
    public static final Companion Companion;
    public static final String ELIGIBLE = "eligible";
    private static final int OVERDUE = 1;
    private boolean isEligible = true;
    public KshockPendingLoansListViewModel kshockPendingLoansListViewModel;
    private double maxLoanAmt;

    /* compiled from: KshockLoansListFragment.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/views/KshockLoansListFragment$Companion;", "", "()V", "ACTIVE", "", "ELIGIBLE", "", "OVERDUE", "newInstance", "Lai/kudi/agent/kshock/ui/views/KshockLoansListFragment;", "maxLoanAmt", "", "eligible", "", "(Ljava/lang/Double;Z)Lai/kudi/agent/kshock/ui/views/KshockLoansListFragment;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.views.KshockLoansListFragment$Companion */
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
        public static /* synthetic */ KshockLoansListFragment newInstance$default(Companion companion, Double $r1, boolean $z0, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = Double.valueOf(200000.0d);
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = true;
            }
            KshockLoansListFragment $r3 = companion.newInstance($r1, $z0);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final KshockLoansListFragment newInstance(Double d, boolean z) {
            KshockLoansListFragment $r1 = new KshockLoansListFragment();
            C13287o $r4 = C13664u.m4227a(KshockPendingLoansListFragment.KEY_MAX_LOAN_AMT, d);
            Boolean $r5 = Boolean.valueOf(z);
            C13287o $r42 = C13664u.m4227a("eligible", $r5);
            C13287o[] $r3 = {$r4, $r42};
            Bundle $r6 = C1372b.m36174a($r3);
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
    private final void setUpFragmentTabs() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentLoansListFragmentBinding $r2 = (FragmentLoansListFragmentBinding) $r1;
        TabLayout $r3 = $r2.tabLayout;
        Log_OC.loadImage($r3, "requireBinding().tabLayout");
        TabLayout.C4745g $r4 = $r3.m26536z();
        int $i0 = C0220R.string.active;
        String $r5 = getString($i0);
        $r4.m26505u($r5);
        C13666w c13666w = C13666w.f30112a;
        $r3.m26557e($r4);
        TabLayout.C4745g $r42 = $r3.m26536z();
        int $i02 = C0220R.string.overdue;
        String $r52 = getString($i02);
        $r42.m26505u($r52);
        C13666w $r6 = C13666w.f30112a;
        $r3.m26557e($r42);
        $r3.m26558d(new TabLayout.InterfaceC4740d() { // from class: ai.kudi.agent.kshock.ui.views.KshockLoansListFragment$setUpFragmentTabs$3
            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabReselected(TabLayout.C4745g c4745g) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabSelected(TabLayout.C4745g c4745g) {
                KShockActivity $r22;
                CharSequence $r32 = c4745g == null ? null : c4745g.m26515k();
                KshockLoansListFragment $r43 = KshockLoansListFragment.this;
                int $i03 = C0220R.string.active;
                String $r53 = $r43.getString($i03);
                boolean $z0 = Log_OC.append($r32, $r53);
                if ($z0) {
                    KshockLoansListFragment $r44 = KshockLoansListFragment.this;
                    FragmentActivity $r62 = $r44.getActivity();
                    boolean $z02 = $r62 instanceof KShockActivity;
                    $r22 = $z02 ? (KShockActivity) $r62 : null;
                    if ($r22 == null) {
                        return;
                    }
                    KshockPendingLoansListFragment.Companion $r7 = KshockPendingLoansListFragment.Companion;
                    KshockLoansListFragment $r45 = KshockLoansListFragment.this;
                    double $d0 = $r45.maxLoanAmt;
                    KshockLoansListFragment $r46 = KshockLoansListFragment.this;
                    boolean $z03 = $r46.isEligible;
                    KshockPendingLoansListFragment $r8 = $r7.newInstance($d0, $z03);
                    int $i04 = C0220R.C0222id.container;
                    AppCompatActivityExtKt.startFragment$default($r22, $r8, $i04, false, false, false, 8, null);
                    return;
                }
                KshockLoansListFragment $r47 = KshockLoansListFragment.this;
                int $i05 = C0220R.string.overdue;
                String $r54 = $r47.getString($i05);
                boolean $z04 = Log_OC.append($r32, $r54);
                if ($z04) {
                    KshockLoansListFragment $r48 = KshockLoansListFragment.this;
                    FragmentActivity $r63 = $r48.getActivity();
                    boolean $z05 = $r63 instanceof KShockActivity;
                    $r22 = $z05 ? (KShockActivity) $r63 : null;
                    if ($r22 == null) {
                        return;
                    }
                    KshockOverdueLoansListFragment.Companion $r9 = KshockOverdueLoansListFragment.Companion;
                    KshockOverdueLoansListFragment $r10 = $r9.newInstance();
                    int $i06 = C0220R.C0222id.container;
                    AppCompatActivityExtKt.startFragment$default($r22, $r10, $i06, false, false, false, 8, null);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabUnselected(TabLayout.C4745g c4745g) {
            }
        });
        FragmentActivity $r8 = getActivity();
        boolean $z0 = $r8 instanceof KShockActivity;
        KShockActivity kShockActivity = $z0 ? (KShockActivity) $r8 : null;
        if (kShockActivity == null) {
            return;
        }
        KshockPendingLoansListFragment.Companion $r10 = KshockPendingLoansListFragment.Companion;
        double $d0 = this.maxLoanAmt;
        boolean $z02 = this.isEligible;
        KshockPendingLoansListFragment $r11 = $r10.newInstance($d0, $z02);
        int $i03 = C0220R.C0222id.container;
        AppCompatActivityExtKt.startFragment$default(kShockActivity, $r11, $i03, false, false, false, 8, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        KshockPendingLoansListViewData $r2 = (KshockPendingLoansListViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(KshockPendingLoansListViewData kshockPendingLoansListViewData) {
        Log_OC.getArray(kshockPendingLoansListViewData, "viewData");
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
        double $d0 = $r1.getDouble(KshockPendingLoansListFragment.KEY_MAX_LOAN_AMT);
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
        FragmentLoansListFragmentBinding $r4 = FragmentLoansListFragmentBinding.inflate(layoutInflater, viewGroup, false);
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
        FragmentActivity $r1 = getActivity();
        boolean $z0 = $r1 instanceof KShockActivity;
        KShockActivity $r4 = $z0 ? (KShockActivity) $r1 : null;
        if ($r4 != null) {
            $r4.showSupportActionBar();
        }
        setUpFragmentTabs();
    }

    public final void setKshockPendingLoansListViewModel(KshockPendingLoansListViewModel kshockPendingLoansListViewModel) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "<set-?>");
        this.kshockPendingLoansListViewModel = kshockPendingLoansListViewModel;
    }
}
