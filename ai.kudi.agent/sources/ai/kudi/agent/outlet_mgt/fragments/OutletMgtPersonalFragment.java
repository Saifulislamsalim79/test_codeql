package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentOutletMgtPersonalBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.data.OutletDetails;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.ManageOutletViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.STATUS;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13252b;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletMgtPersonalFragment.kt */
@Metadata(m10422d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0014J\b\u0010\u001e\u001a\u00020\u0002H\u0014J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0014J\"\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0016J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtPersonalFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel$ManageOutletViewData;", "Lai/kudi/agent/databinding/FragmentOutletMgtPersonalBinding;", "()V", "manageOutletViewModel", "getManageOutletViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;", "setManageOutletViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;)V", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "getOutletMgtActivity", "()Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "setOutletMgtActivity", "(Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;)V", "outletPersonalInfo", "shimmerLoaderList", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "kotlin.jvm.PlatformType", "getShimmerLoaderList", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "twoColumnAdapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtPersonalFragment extends BaseMVVMViewBindingFragment<ManageOutletViewModel, ManageOutletViewModel.ManageOutletViewData, FragmentOutletMgtPersonalBinding> {
    public static final Companion Companion;
    public ManageOutletViewModel manageOutletViewModel;
    private Outlet outlet;
    public OutletMgtActivity outletMgtActivity;
    private Outlet outletPersonalInfo;
    private TwoColumnTableAdapter twoColumnAdapter;

    /* compiled from: OutletMgtPersonalFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtPersonalFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtPersonalFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/outlet_mgt/data/Outlet;", "personal", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final OutletMgtPersonalFragment newInstance(Outlet outlet, Outlet outlet2) {
            Log_OC.getArray(outlet, TransactionBreakDownItemType.DATA);
            Log_OC.getArray(outlet2, "personal");
            OutletMgtPersonalFragment $r4 = new OutletMgtPersonalFragment();
            Bundle $r2 = new Bundle();
            $r2.putParcelable(ConstKt.OUTLET_DATA, outlet);
            $r2.putParcelable(ConstKt.OUTLET_PERSONAL, outlet2);
            C13666w c13666w = C13666w.f30112a;
            $r4.setArguments($r2);
            return $r4;
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
    public static final OutletMgtPersonalFragment newInstance(Outlet outlet, Outlet outlet2) {
        Companion $r1 = Companion;
        OutletMgtPersonalFragment $r2 = $r1.newInstance(outlet, outlet2);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m39881onViewCreated$lambda2(OutletMgtPersonalFragment outletMgtPersonalFragment, View view) {
        Log_OC.getArray(outletMgtPersonalFragment, "this$0");
        OutletMgtActivity $r1 = outletMgtPersonalFragment.getOutletMgtActivity();
        Context r7 = (Context) $r1;
        Intent r6 = new Intent(r7, ChildOutletInformationActivity.class);
        Outlet $r4 = outletMgtPersonalFragment.outlet;
        r6.putExtra(ChildOutletInformationActivity.EXTRA_KEY_OUTLET_DETAIL, $r4);
        C13666w c13666w = C13666w.f30112a;
        outletMgtPersonalFragment.startActivityForResult(r6, 1);
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
        FragmentActivity $r15;
        List $r13;
        List $r132;
        Log_OC.getArray(manageOutletViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentOutletMgtPersonalBinding $r3 = (FragmentOutletMgtPersonalBinding) $r2;
        boolean $z0 = manageOutletViewData.isLoading();
        if ($z0) {
            ListLoaderViewBinding $r4 = $r3.loaderView;
            FrameLayout $r5 = $r4.getRoot();
            Log_OC.loadImage($r5, "loaderView.root");
            ViewExtKt.show($r5);
            ShimmerFrameLayout $r6 = getShimmerLoaderList();
            $r6.m32965c();
            View $r7 = $r3.filledState;
            Log_OC.loadImage($r7, "filledState");
            View r17 = $r7;
            ViewExtKt.hide$default(r17, false, 1, null);
        } else {
            View $r72 = $r3.filledState;
            Log_OC.loadImage($r72, "filledState");
            View r172 = $r72;
            ViewExtKt.show(r172);
            ShimmerFrameLayout $r62 = getShimmerLoaderList();
            $r62.m32964d();
            ListLoaderViewBinding $r42 = $r3.loaderView;
            FrameLayout $r52 = $r42.getRoot();
            Log_OC.loadImage($r52, "loaderView.root");
            ViewExtKt.hide$default($r52, false, 1, null);
        }
        OutletDetails $r8 = manageOutletViewData.getOutletDetails();
        if ($r8 != null) {
            Outlet $r11 = $r8.getPersonal();
            TwoColumnItem.SimpleItem r16 = new TwoColumnItem.SimpleItem("Phone Number", $r11.getPhoneNumber());
            Outlet $r112 = $r8.getPersonal();
            TwoColumnItem.SimpleItem r162 = new TwoColumnItem.SimpleItem("Outlet Name", $r112.getName());
            Outlet $r113 = $r8.getPersonal();
            TwoColumnItem.SimpleItem r163 = new TwoColumnItem.SimpleItem("Address", $r113.getOutletAddress());
            Outlet $r114 = $r8.getPersonal();
            TwoColumnItem.SimpleItem r164 = new TwoColumnItem.SimpleItem("State", $r114.getState());
            Outlet $r115 = $r8.getPersonal();
            TwoColumnItem.SimpleItem r165 = new TwoColumnItem.SimpleItem("Lga", $r115.getLga());
            TwoColumnItem.SimpleItem[] $r9 = {r16, r162, r163, r164, r165};
            $r13 = C13726r.m3888h($r9);
            TwoColumnTableAdapter $r14 = this.twoColumnAdapter;
            Log_OC.append($r14);
            $r132 = C13742z.m3823D0($r13);
            $r14.setData($r132);
        }
        String $r12 = manageOutletViewData.getOutletDetailsError();
        if ($r12 == null || ($r15 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r15, $r12, 0, 2, (Object) null);
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
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            ManageOutletViewModel $r2 = getManageOutletViewModel();
            Outlet $r3 = this.outlet;
            Log_OC.append($r3);
            String $r4 = $r3.getOutletId();
            $r2.start($r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity");
            throw $r5;
        }
        OutletMgtActivity $r3 = (OutletMgtActivity) $r2;
        setOutletMgtActivity($r3);
        OutletMgtActivity $r32 = getOutletMgtActivity();
        OutletMgtSubComponent $r4 = $r32.getOutletMgtSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOutletMgtPersonalBinding $r4 = FragmentOutletMgtPersonalBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Outlet $r5;
        List $r27;
        List $r272;
        String $r21;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r3 = getArguments();
        Outlet $r4 = null;
        if ($r3 == null) {
            $r5 = null;
        } else {
            Parcelable $r6 = $r3.getParcelable(ConstKt.OUTLET_PERSONAL);
            $r5 = (Outlet) $r6;
        }
        this.outletPersonalInfo = $r5;
        Bundle $r32 = getArguments();
        if ($r32 != null) {
            Parcelable $r62 = $r32.getParcelable(ConstKt.OUTLET_DATA);
            $r4 = (Outlet) $r62;
        }
        this.outlet = $r4;
        if (bundle == null && $r4 != null) {
            ManageOutletViewModel $r7 = getManageOutletViewModel();
            Outlet $r42 = this.outlet;
            Log_OC.append($r42);
            $r7.onViewProfile($r42.getPhoneNumber());
        }
        InterfaceC8209a $r9 = requireBinding();
        FragmentOutletMgtPersonalBinding $r10 = (FragmentOutletMgtPersonalBinding) $r9;
        RecyclerView $r11 = $r10.outletMgtProfileRv;
        RecyclerView r35 = $r11;
        Context $r13 = r35.getContext();
        LinearLayoutManager r28 = new LinearLayoutManager($r13);
        $r11.setLayoutManager(r28);
        $r11.setHasFixedSize(true);
        TwoColumnTableAdapter r29 = new TwoColumnTableAdapter();
        this.twoColumnAdapter = r29;
        RecyclerView r352 = $r11;
        Context $r132 = r352.getContext();
        int $i0 = r28.m35389v2();
        C1723k r30 = new C1723k($r132, $i0);
        FragmentActivity $r16 = requireActivity();
        Context $r133 = $r16.getApplicationContext();
        Drawable $r17 = C1335a.m36322f($r133, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r17);
        r30.m34703f($r17);
        $r11.m35294h(r30);
        $r11.setAdapter(this.twoColumnAdapter);
        InterfaceC8209a $r92 = requireBinding();
        FragmentOutletMgtPersonalBinding $r102 = (FragmentOutletMgtPersonalBinding) $r92;
        TextView $r18 = $r102.editProfileView;
        $r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletMgtPersonalFragment $r2 = OutletMgtPersonalFragment.this;
                OutletMgtPersonalFragment.m39881onViewCreated$lambda2($r2, view2);
            }
        });
        Outlet $r43 = this.outletPersonalInfo;
        if ($r43 == null) {
            return;
        }
        InterfaceC8209a $r93 = requireBinding();
        FragmentOutletMgtPersonalBinding $r103 = (FragmentOutletMgtPersonalBinding) $r93;
        TextView $r182 = $r103.statusView;
        String $r8 = $r43.getOutletApprovalStatus();
        Locale $r20 = Locale.getDefault();
        Log_OC.loadImage($r20, "getDefault()");
        if ($r8 == null) {
            NullPointerException r33 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
            throw r33;
        }
        String $r82 = $r8.toLowerCase($r20);
        String $r212 = $r82;
        Log_OC.loadImage($r82, "(this as java.lang.String).toLowerCase(locale)");
        int $i02 = $r82.length();
        if ($i02 > 0) {
            StringBuilder r32 = new StringBuilder();
            char $c1 = $r82.charAt(0);
            boolean $z0 = Character.isLowerCase($c1);
            if ($z0) {
                Locale $r202 = Locale.getDefault();
                Log_OC.loadImage($r202, "getDefault()");
                $r21 = C13252b.m5546d($c1, $r202);
            } else {
                $r21 = String.valueOf($c1);
            }
            r32.append($r21.toString());
            if ($r82 == null) {
                NullPointerException r332 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw r332;
            }
            String $r83 = $r82.substring(1);
            Log_OC.loadImage($r83, "(this as java.lang.String).substring(startIndex)");
            r32.append($r83);
            $r212 = r32.toString();
        }
        $r182.setText($r212);
        String $r84 = $r43.getOutletApprovalStatus();
        STATUS $r24 = STATUS.APPROVED;
        String $r213 = $r24.name();
        boolean $z02 = Log_OC.append($r84, $r213);
        if ($z02) {
            InterfaceC8209a $r94 = requireBinding();
            FragmentOutletMgtPersonalBinding $r104 = (FragmentOutletMgtPersonalBinding) $r94;
            TextView $r183 = $r104.statusView;
            Context $r134 = requireContext();
            int $i03 = C1335a.m36324d($r134, C0001R.color.kudiBadgeDarkGreen);
            $r183.setTextColor($i03);
            InterfaceC8209a $r95 = requireBinding();
            FragmentOutletMgtPersonalBinding $r105 = (FragmentOutletMgtPersonalBinding) $r95;
            TextView $r184 = $r105.statusView;
            Context $r135 = requireContext();
            int $i04 = C1335a.m36324d($r135, C0001R.color.kudiBadgeLightGreen);
            $r184.setBackgroundColor($i04);
        } else {
            InterfaceC8209a $r96 = requireBinding();
            FragmentOutletMgtPersonalBinding $r106 = (FragmentOutletMgtPersonalBinding) $r96;
            TextView $r185 = $r106.statusView;
            Context $r136 = requireContext();
            int $i05 = C1335a.m36324d($r136, C0001R.color.kudiBadgeDarkRed);
            $r185.setTextColor($i05);
            InterfaceC8209a $r97 = requireBinding();
            FragmentOutletMgtPersonalBinding $r107 = (FragmentOutletMgtPersonalBinding) $r97;
            TextView $r186 = $r107.statusView;
            Context $r137 = requireContext();
            int $i06 = C1335a.m36324d($r137, C0001R.color.kudiBadgeLightRed);
            $r186.setBackgroundColor($i06);
        }
        TwoColumnItem.SimpleItem r34 = new TwoColumnItem.SimpleItem("Phone Number", $r43.getPhoneNumber());
        TwoColumnItem.SimpleItem r342 = new TwoColumnItem.SimpleItem("Outlet Name", $r43.getName());
        TwoColumnItem.SimpleItem r343 = new TwoColumnItem.SimpleItem("Address", $r43.getOutletAddress());
        TwoColumnItem.SimpleItem r344 = new TwoColumnItem.SimpleItem("State", $r43.getState());
        TwoColumnItem.SimpleItem r345 = new TwoColumnItem.SimpleItem("Lga", $r43.getLga());
        TwoColumnItem.SimpleItem[] $r25 = {r34, r342, r343, r344, r345};
        $r27 = C13726r.m3888h($r25);
        TwoColumnTableAdapter $r14 = this.twoColumnAdapter;
        Log_OC.append($r14);
        $r272 = C13742z.m3823D0($r27);
        $r14.setData($r272);
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
