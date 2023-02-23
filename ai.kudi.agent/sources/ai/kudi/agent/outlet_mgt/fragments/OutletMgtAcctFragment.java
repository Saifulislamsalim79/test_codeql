package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentOutletAccountsBinding;
import ai.kudi.agent.databinding.PosAccountEmptyStateBinding;
import ai.kudi.agent.databinding.ViewAccountsInsuranceBinding;
import ai.kudi.agent.databinding.ViewCashInsuranceOutletMgtBinding;
import ai.kudi.agent.databinding.ViewPosInfoBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.data.OutletAccountInfo;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.ManageOutletViewModel;
import ai.kudi.agent.settings.data.models.TwoColumnItem;
import ai.kudi.agent.settings.p029ui.adapters.TwoColumnTableAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletMgtAcctFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtAcctFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel$ManageOutletViewData;", "Lai/kudi/agent/databinding/FragmentOutletAccountsBinding;", "()V", "manageOutletVieModel", "getManageOutletVieModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;", "setManageOutletVieModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/ManageOutletViewModel;)V", "outletAccountInfo", "Lai/kudi/agent/outlet_mgt/data/OutletAccountInfo;", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "twoColumnAdapter", "Lai/kudi/agent/settings/ui/adapters/TwoColumnTableAdapter;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtAcctFragment extends BaseMVVMViewBindingFragment<ManageOutletViewModel, ManageOutletViewModel.ManageOutletViewData, FragmentOutletAccountsBinding> {
    public static final Companion Companion;
    public ManageOutletViewModel manageOutletVieModel;
    private OutletAccountInfo outletAccountInfo;
    private OutletMgtActivity outletMgtActivity;
    private TwoColumnTableAdapter twoColumnAdapter;

    /* compiled from: OutletMgtAcctFragment.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtAcctFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtAcctFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/outlet_mgt/data/Outlet;", "account", "Lai/kudi/agent/outlet_mgt/data/OutletAccountInfo;", "isOutletInsured", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final OutletMgtAcctFragment newInstance(Outlet outlet, OutletAccountInfo outletAccountInfo, boolean z) {
            Log_OC.getArray(outlet, TransactionBreakDownItemType.DATA);
            Log_OC.getArray(outletAccountInfo, "account");
            OutletMgtAcctFragment $r4 = new OutletMgtAcctFragment();
            Bundle $r2 = new Bundle();
            $r2.putParcelable(ConstKt.OUTLET_DATA, outlet);
            $r2.putParcelable(ConstKt.OUTLET_ACCT, outletAccountInfo);
            $r2.putBoolean(ConstKt.IS_OUTLET_INSURED, z);
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
    public static final OutletMgtAcctFragment newInstance(Outlet outlet, OutletAccountInfo outletAccountInfo, boolean z) {
        Companion $r1 = Companion;
        OutletMgtAcctFragment $r2 = $r1.newInstance(outlet, outletAccountInfo, z);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ManageOutletViewModel.ManageOutletViewData $r2 = (ManageOutletViewModel.ManageOutletViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(ManageOutletViewModel.ManageOutletViewData manageOutletViewData) {
        Log_OC.getArray(manageOutletViewData, "viewData");
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
        ManageOutletViewModel $r1 = getManageOutletVieModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ManageOutletViewModel getManageOutletVieModel() {
        ManageOutletViewModel $r1 = this.manageOutletVieModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("manageOutletVieModel");
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
            OutletMgtActivity $r3 = (OutletMgtActivity) context;
            this.outletMgtActivity = $r3;
            Log_OC.append($r3);
            OutletMgtSubComponent $r1 = $r3.getOutletMgtSubComponent();
            $r1.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOutletAccountsBinding $r4 = FragmentOutletAccountsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        OutletAccountInfo $r4;
        Outlet $r6;
        Boolean $r24;
        List $r29;
        List $r292;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r3 = getArguments();
        if ($r3 == null) {
            $r4 = null;
        } else {
            Parcelable $r5 = $r3.getParcelable(ConstKt.OUTLET_ACCT);
            $r4 = (OutletAccountInfo) $r5;
        }
        this.outletAccountInfo = $r4;
        Bundle $r32 = getArguments();
        if ($r32 == null) {
            $r6 = null;
        } else {
            Parcelable $r52 = $r32.getParcelable(ConstKt.OUTLET_DATA);
            $r6 = (Outlet) $r52;
        }
        boolean $z0 = $r6 instanceof Outlet;
        if (!$z0) {
            $r6 = null;
        }
        if (bundle == null && $r6 != null) {
            ManageOutletViewModel $r7 = getManageOutletVieModel();
            String $r8 = $r6.getPhoneNumber();
            $r7.onViewAccount($r8);
        }
        InterfaceC8209a $r9 = requireBinding();
        ViewCashInsuranceOutletMgtBinding $r11 = ((FragmentOutletAccountsBinding) $r9).insuranceOutletMgtContainer;
        Log_OC.loadImage($r11, "requireBinding().insuranceOutletMgtContainer");
        View $r12 = $r11.getRoot();
        Log_OC.loadImage($r12, "insuranceOutletMgtContainer.root");
        View $r1 = $r12;
        ViewExtKt.show($r1);
        InterfaceC8209a $r92 = requireBinding();
        FragmentOutletAccountsBinding $r10 = (FragmentOutletAccountsBinding) $r92;
        View $r122 = $r10.posContainer;
        Log_OC.loadImage($r122, "requireBinding().posContainer");
        View $r13 = $r122;
        ViewExtKt.show($r13);
        InterfaceC8209a $r93 = requireBinding();
        FragmentOutletAccountsBinding $r102 = (FragmentOutletAccountsBinding) $r93;
        TextView $r132 = $r102.posStatusDesc;
        Log_OC.loadImage($r132, "requireBinding().posStatusDesc");
        ViewExtKt.hide$default($r132, false, 1, null);
        InterfaceC8209a $r94 = requireBinding();
        FragmentOutletAccountsBinding $r103 = (FragmentOutletAccountsBinding) $r94;
        ViewPosInfoBinding $r14 = $r103.posInfo;
        LinearLayout $r15 = $r14.getRoot();
        Log_OC.loadImage($r15, "requireBinding().posInfo.root");
        ViewExtKt.show($r15);
        InterfaceC8209a $r95 = requireBinding();
        FragmentOutletAccountsBinding $r104 = (FragmentOutletAccountsBinding) $r95;
        View $r123 = $r104.accountNumbersContainer;
        Log_OC.loadImage($r123, "requireBinding().accountNumbersContainer");
        View $r16 = $r123;
        ViewExtKt.hide$default($r16, false, 1, null);
        TwoColumnTableAdapter r31 = new TwoColumnTableAdapter();
        this.twoColumnAdapter = r31;
        InterfaceC8209a $r96 = requireBinding();
        FragmentOutletAccountsBinding $r105 = (FragmentOutletAccountsBinding) $r96;
        ViewPosInfoBinding $r142 = $r105.posInfo;
        RecyclerView $r17 = $r142.posInfoRecyclerView;
        RecyclerView r35 = $r17;
        Context $r19 = r35.getContext();
        LinearLayoutManager r32 = new LinearLayoutManager($r19);
        $r17.setLayoutManager(r32);
        RecyclerView r352 = $r17;
        Context $r192 = r352.getContext();
        int $i0 = r32.m35389v2();
        C1723k r33 = new C1723k($r192, $i0);
        Context $r193 = requireContext();
        Log_OC.loadImage($r193, "requireContext()");
        Drawable $r21 = ContextExtKt.getKudiDrawable($r193, C0001R.C0002drawable.transactions_divider);
        if ($r21 != null) {
            r33.m34703f($r21);
            $r17.m35294h(r33);
        }
        $r17.setAdapter(this.twoColumnAdapter);
        InterfaceC8209a $r97 = requireBinding();
        FragmentOutletAccountsBinding $r106 = (FragmentOutletAccountsBinding) $r97;
        ViewAccountsInsuranceBinding $r22 = $r106.insuranceContainer;
        View $r23 = $r22.getRoot();
        Log_OC.loadImage($r23, "requireBinding().insuranceContainer.root");
        View $r18 = $r23;
        ViewExtKt.show($r18);
        Bundle $r2 = getArguments();
        if ($r2 == null) {
            $r24 = null;
        } else {
            boolean $z02 = $r2.getBoolean(ConstKt.IS_OUTLET_INSURED);
            $r24 = Boolean.valueOf($z02);
        }
        Log_OC.append($r24);
        boolean $z03 = $r24.booleanValue();
        if ($z03) {
            View $r124 = $r11.signUpContainer;
            Log_OC.loadImage($r124, "insuranceOutletMgtContainer.signUpContainer");
            View $r110 = $r124;
            ViewExtKt.hide$default($r110, false, 1, null);
            View $r125 = $r11.activePlanContainer;
            Log_OC.loadImage($r125, "insuranceOutletMgtContainer.activePlanContainer");
            View $r111 = $r125;
            ViewExtKt.show($r111);
        } else {
            View $r126 = $r11.signUpContainer;
            Log_OC.loadImage($r126, "insuranceOutletMgtContainer.signUpContainer");
            View $r112 = $r126;
            ViewExtKt.show($r112);
            View $r25 = $r11.insuranceSignUp;
            Log_OC.loadImage($r25, "insuranceOutletMgtContainer.insuranceSignUp");
            View $r113 = $r25;
            ViewExtKt.hide$default($r113, false, 1, null);
            ImageView $r26 = $r11.insuranceEmptyStateImage;
            $r26.setImageResource(C0001R.C0002drawable.ic_insurance_empty);
            TextView $r133 = $r11.insuranceBodyText;
            String $r82 = getString(C0001R.string.insurance_empty_text);
            $r133.setText($r82);
            View $r127 = $r11.activePlanContainer;
            Log_OC.loadImage($r127, "insuranceOutletMgtContainer.activePlanContainer");
            View $r114 = $r127;
            ViewExtKt.hide$default($r114, false, 1, null);
        }
        OutletAccountInfo $r42 = this.outletAccountInfo;
        if ($r42 == null) {
            return;
        }
        String $r83 = $r42.getStatus();
        boolean $z04 = Log_OC.append($r83, "ASSIGNED");
        if (!$z04) {
            InterfaceC8209a $r98 = requireBinding();
            FragmentOutletAccountsBinding $r107 = (FragmentOutletAccountsBinding) $r98;
            ViewPosInfoBinding $r143 = $r107.posInfo;
            LinearLayout $r152 = $r143.getRoot();
            Log_OC.loadImage($r152, "requireBinding().posInfo.root");
            ViewExtKt.hide$default($r152, false, 1, null);
            InterfaceC8209a $r99 = requireBinding();
            FragmentOutletAccountsBinding $r108 = (FragmentOutletAccountsBinding) $r99;
            PosAccountEmptyStateBinding $r30 = $r108.emptyPosView;
            View $r128 = $r30.getRoot();
            Log_OC.loadImage($r128, "requireBinding().emptyPosView.root");
            View $r115 = $r128;
            ViewExtKt.show($r115);
            return;
        }
        String $r84 = $r42.getPtsp();
        TwoColumnItem.SimpleItem r34 = new TwoColumnItem.SimpleItem("Device Name", $r84);
        String $r85 = $r42.getSerialNumber();
        TwoColumnItem.SimpleItem r342 = new TwoColumnItem.SimpleItem("Serial Number", $r85);
        String $r86 = $r42.getTerminalId();
        TwoColumnItem.SimpleItem r343 = new TwoColumnItem.SimpleItem("Terminal Id", $r86);
        String $r87 = $r42.getAcquiringBank();
        TwoColumnItem.SimpleItem r344 = new TwoColumnItem.SimpleItem("Bank Vendor", $r87);
        TwoColumnItem.SimpleItem[] $r27 = {r34, r342, r343, r344};
        $r29 = C13726r.m3888h($r27);
        TwoColumnTableAdapter $r162 = this.twoColumnAdapter;
        Log_OC.append($r162);
        $r292 = C13742z.m3823D0($r29);
        $r162.setData($r292);
    }

    public final void setManageOutletVieModel(ManageOutletViewModel manageOutletViewModel) {
        Log_OC.getArray(manageOutletViewModel, "<set-?>");
        this.manageOutletVieModel = manageOutletViewModel;
    }
}
