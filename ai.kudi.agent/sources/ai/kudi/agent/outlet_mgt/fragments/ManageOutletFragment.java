package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentViewpagerContainerBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.data.OutletAccountInfo;
import ai.kudi.agent.outlet_mgt.data.OutletDetails;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtAcctFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtPersonalFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtSecurityFragment;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.ManageOutletViewModel;
import ai.kudi.agent.settings.p029ui.adapters.TabAdapter;
import ai.kudi.dip.library.SafeViewPager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ManageOutletFragment.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.H\u0002R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u00060"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/ManageOutletFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel$ManageOutletViewData;", "Lai/kudi/agent/databinding/FragmentViewpagerContainerBinding;", "()V", "manageOutletViewModel", "getManageOutletViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;", "setManageOutletViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;)V", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "getOutletMgtActivity", "()Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "setOutletMgtActivity", "(Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;)V", "shimmerLoaderList", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "kotlin.jvm.PlatformType", "getShimmerLoaderList", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setupViewPager", "outletDetails", "Lai/kudi/agent/outlet_mgt/data/OutletDetails;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ManageOutletFragment extends BaseMVVMViewBindingFragment<ManageOutletViewModel, ManageOutletViewModel.ManageOutletViewData, FragmentViewpagerContainerBinding> {
    public static final Companion Companion;
    public ManageOutletViewModel manageOutletViewModel;
    private Outlet outlet;
    public OutletMgtActivity outletMgtActivity;

    /* compiled from: ManageOutletFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/ManageOutletFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/ManageOutletFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/outlet_mgt/data/Outlet;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final ManageOutletFragment newInstance(Outlet outlet) {
            Log_OC.getArray(outlet, TransactionBreakDownItemType.DATA);
            ManageOutletFragment $r3 = new ManageOutletFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(ConstKt.OUTLET_DATA, outlet);
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
    private final ShimmerFrameLayout getShimmerLoaderList() {
        View $r1 = requireView();
        ShimmerFrameLayout $r2 = (ShimmerFrameLayout) $r1.findViewById(C0001R.C0003id.shimmerLoaderList);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final ManageOutletFragment newInstance(Outlet outlet) {
        Companion $r0 = Companion;
        ManageOutletFragment $r1 = $r0.newInstance(outlet);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupViewPager(OutletDetails outletDetails) {
        List $r12;
        List $r19;
        OutletMgtPersonalFragment.Companion $r3 = OutletMgtPersonalFragment.Companion;
        Outlet $r4 = this.outlet;
        Log_OC.append($r4);
        Outlet $r5 = outletDetails.getPersonal();
        OutletMgtPersonalFragment $r6 = $r3.newInstance($r4, $r5);
        OutletMgtAcctFragment.Companion $r7 = OutletMgtAcctFragment.Companion;
        Outlet $r42 = this.outlet;
        Log_OC.append($r42);
        OutletAccountInfo $r8 = outletDetails.getAccount();
        boolean $z0 = outletDetails.isOutletInsured();
        OutletMgtAcctFragment $r9 = $r7.newInstance($r42, $r8, $z0);
        OutletMgtSecurityFragment.Companion $r10 = OutletMgtSecurityFragment.Companion;
        Outlet $r43 = this.outlet;
        Log_OC.append($r43);
        OutletMgtSecurityFragment $r11 = $r10.newInstance($r43);
        BaseMVVMViewBindingFragment[] $r2 = {$r6, $r9, $r11};
        $r12 = C13726r.m3888h($r2);
        InterfaceC8209a $r13 = requireBinding();
        FragmentViewpagerContainerBinding $r14 = (FragmentViewpagerContainerBinding) $r13;
        SafeViewPager $r15 = $r14.viewPager;
        FragmentManager $r17 = getChildFragmentManager();
        Log_OC.loadImage($r17, "childFragmentManager");
        String[] $r18 = {"Personal", "Account", "Security"};
        $r19 = C13726r.m3885k($r18);
        TabAdapter $r16 = new TabAdapter($r17, 1, $r19);
        $r16.setPages($r12);
        $r15.setAdapter($r16);
        $r15.addOnPageChangeListener(new ViewPager.InterfaceC1898j() { // from class: ai.kudi.agent.outlet_mgt.fragments.ManageOutletFragment$setupViewPager$1$1
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageScrolled(int i, float f, int i2) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageSelected(int i) {
                if (i == 2) {
                    ManageOutletFragment $r22 = ManageOutletFragment.this;
                    ManageOutletViewModel $r1 = $r22.getManageOutletViewModel();
                    $r1.onSecuritySectionClicked();
                }
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ManageOutletViewModel.ManageOutletViewData $r2 = (ManageOutletViewModel.ManageOutletViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ManageOutletViewModel.ManageOutletViewData manageOutletViewData) {
        Log_OC.getArray(manageOutletViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentViewpagerContainerBinding $r3 = (FragmentViewpagerContainerBinding) $r2;
        boolean $z0 = manageOutletViewData.isLoading();
        if ($z0) {
            ListLoaderViewBinding $r4 = $r3.loadingState;
            FrameLayout $r5 = $r4.getRoot();
            Log_OC.loadImage($r5, "loadingState.root");
            ViewExtKt.show($r5);
            ShimmerFrameLayout $r6 = getShimmerLoaderList();
            $r6.m32965c();
            View $r7 = $r3.viewPager;
            Log_OC.loadImage($r7, "viewPager");
            View r12 = $r7;
            ViewExtKt.hide$default(r12, false, 1, null);
            View $r8 = $r3.tabLayout;
            Log_OC.loadImage($r8, "tabLayout");
            View r122 = $r8;
            ViewExtKt.hide$default(r122, false, 1, null);
        } else {
            ShimmerFrameLayout $r62 = getShimmerLoaderList();
            $r62.m32964d();
            ListLoaderViewBinding $r42 = $r3.loadingState;
            FrameLayout $r52 = $r42.getRoot();
            Log_OC.loadImage($r52, "loadingState.root");
            ViewExtKt.hide$default($r52, false, 1, null);
            View $r72 = $r3.viewPager;
            Log_OC.loadImage($r72, "viewPager");
            View r123 = $r72;
            ViewExtKt.show(r123);
            View $r82 = $r3.tabLayout;
            Log_OC.loadImage($r82, "tabLayout");
            View r124 = $r82;
            ViewExtKt.show(r124);
        }
        OutletDetails $r9 = manageOutletViewData.getOutletDetails();
        if ($r9 != null) {
            setupViewPager($r9);
            $r3.tabLayout.setupWithViewPager($r3.viewPager);
        }
        String $r10 = manageOutletViewData.getOutletDetailsError();
        if ($r10 == null) {
            return;
        }
        FragmentActivity $r11 = requireActivity();
        Log_OC.loadImage($r11, "requireActivity()");
        ContextExtKt.toast$default($r11, $r10, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ManageOutletViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ManageOutletViewModel createViewModel() {
        ManageOutletViewModel $r1 = getManageOutletViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ManageOutletViewModel getManageOutletViewModel() {
        ManageOutletViewModel $r1 = this.manageOutletViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("manageOutletViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletMgtActivity getOutletMgtActivity() {
        OutletMgtActivity $r1 = this.outletMgtActivity;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMgtActivity");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ManageOutletViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof OutletMgtActivity;
        if ($z0) {
            OutletMgtActivity $r2 = (OutletMgtActivity) context;
            setOutletMgtActivity($r2);
            OutletMgtActivity $r22 = getOutletMgtActivity();
            OutletMgtSubComponent $r3 = $r22.getOutletMgtSubComponent();
            $r3.inject(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentViewpagerContainerBinding $r4 = FragmentViewpagerContainerBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Outlet $r3;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = getArguments();
        if ($r2 == null) {
            $r3 = null;
        } else {
            Parcelable $r4 = $r2.getParcelable(ConstKt.OUTLET_DATA);
            $r3 = (Outlet) $r4;
        }
        this.outlet = $r3;
        OutletMgtActivity $r5 = getOutletMgtActivity();
        $r5.setTitle("Manage Outlet");
        ManageOutletViewModel $r6 = getManageOutletViewModel();
        Outlet $r32 = this.outlet;
        Log_OC.append($r32);
        String $r7 = $r32.getOutletId();
        $r6.start($r7);
    }

    public final void setManageOutletViewModel(ManageOutletViewModel manageOutletViewModel) {
        Log_OC.getArray(manageOutletViewModel, "<set-?>");
        this.manageOutletViewModel = manageOutletViewModel;
    }

    public final void setOutletMgtActivity(OutletMgtActivity outletMgtActivity) {
        Log_OC.getArray(outletMgtActivity, "<set-?>");
        this.outletMgtActivity = outletMgtActivity;
    }
}
