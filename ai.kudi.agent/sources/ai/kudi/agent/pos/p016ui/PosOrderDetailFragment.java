package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.databinding.ListLoaderViewBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentPosOrderDetailBinding;
import ai.kudi.agent.pos.data.PosOrder;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.p016ui.utils.PosActivityExtKt;
import ai.kudi.agent.pos.presentation.PosOrderDetailViewModel;
import ai.kudi.agent.pos.presentation.viewstate.PosOrderDetailViewState;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.PreferenceActivity;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import java.util.Date;
import java.util.TimeZone;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: PosOrderDetailFragment.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'H\u0002R#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006)"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosOrderDetailFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/pos/presentation/PosOrderDetailViewModel;", "Lai/kudi/agent/pos/presentation/viewstate/PosOrderDetailViewState;", "Lai/kudi/agent/databinding/FragmentPosOrderDetailBinding;", "()V", "orderId", "", "kotlin.jvm.PlatformType", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lai/kudi/agent/pos/presentation/PosOrderDetailViewModel;", "setViewModel", "(Lai/kudi/agent/pos/presentation/PosOrderDetailViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "renderData", "order", "Lai/kudi/agent/pos/data/PosOrder;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.PosOrderDetailFragment */
/* loaded from: classes.dex */
public final class PosOrderDetailFragment extends BaseMVVMViewBindingFragment<PosOrderDetailViewModel, PosOrderDetailViewState, FragmentPosOrderDetailBinding> {
    private static final String BUNDLE_KEY_POS_ORDER_ID = "BUNDLE_KEY_POS_ORDER_ID";
    public static final Companion Companion;
    private final InterfaceC11824h orderId$delegate;
    public PosOrderDetailViewModel viewModel;

    /* compiled from: PosOrderDetailFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosOrderDetailFragment$Companion;", "", "()V", PosOrderDetailFragment.BUNDLE_KEY_POS_ORDER_ID, "", "newInstance", "Lai/kudi/agent/pos/ui/PosOrderDetailFragment;", "orderId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.PosOrderDetailFragment$Companion */
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
        public final PosOrderDetailFragment newInstance(String str) {
            Log_OC.getArray(str, "orderId");
            Bundle $r2 = new Bundle();
            $r2.putString(PosOrderDetailFragment.BUNDLE_KEY_POS_ORDER_ID, str);
            PosOrderDetailFragment $r3 = new PosOrderDetailFragment();
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PosOrderDetailFragment() {
        InterfaceC11824h $r1;
        PosOrderDetailFragment$orderId$2 $r2 = new PosOrderDetailFragment$orderId$2(this);
        $r1 = C13218k.m5625b($r2);
        this.orderId$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getOrderId() {
        InterfaceC11824h $r2 = this.orderId$delegate;
        Object $r1 = $r2.getValue();
        String $r3 = (String) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40067onViewCreated$lambda0(PosOrderDetailFragment posOrderDetailFragment, String str) {
        Log_OC.getArray(posOrderDetailFragment, "this$0");
        FragmentActivity $r1 = posOrderDetailFragment.requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        ContextExtKt.toast$default($r1, str, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40068onViewCreated$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void renderData(PosOrder posOrder) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentPosOrderDetailBinding $r3 = (FragmentPosOrderDetailBinding) $r2;
        View $r4 = $r3.orderDetailsCard;
        Log_OC.loadImage($r4, "orderDetailsCard");
        View r13 = $r4;
        ViewExtKt.show(r13);
        ListLoaderViewBinding $r5 = $r3.listLoaderView;
        FrameLayout $r6 = $r5.getRoot();
        Log_OC.loadImage($r6, "listLoaderView.root");
        ViewExtKt.hide$default($r6, false, 1, null);
        TextView $r7 = $r3.orderReference;
        String $r8 = posOrder.getTransactionId();
        $r7.setText($r8);
        TextView $r72 = $r3.orderWalletNumber;
        String $r82 = posOrder.getPhone();
        $r72.setText($r82);
        TextView $r73 = $r3.orderQuantity;
        $r73.setText("1");
        boolean $z0 = posOrder.getUsed();
        if ($z0) {
            View $r9 = $r3.assignedStatusViews;
            Log_OC.loadImage($r9, "assignedStatusViews");
            View r132 = $r9;
            ViewExtKt.show(r132);
        } else {
            View $r92 = $r3.assignedStatusViews;
            Log_OC.loadImage($r92, "assignedStatusViews");
            View r133 = $r92;
            ViewExtKt.hide$default(r133, false, 1, null);
        }
        TextView $r74 = $r3.orderStatus;
        boolean $z02 = posOrder.getUsed();
        int $i0 = $z02 ? C0001R.string.yes : C0001R.string.bvn;
        String $r83 = getString($i0);
        $r74.setText($r83);
        String $r84 = posOrder.getTimeCreated();
        Date $r10 = StringExtKt.formatKudiDateAlt5($r84);
        String $r85 = posOrder.getDateAssigned();
        Date $r11 = $r85 == null ? null : StringExtKt.formatKudiDateAlt5($r85);
        TextView $r75 = $r3.orderDate;
        TimeZone $r12 = TimeZone.getDefault();
        Log_OC.loadImage($r12, "getDefault()");
        String $r86 = DateExtKt.formatWithStyle($r10, "MMM dd yyyy | hh.mma", $r12);
        $r75.setText($r86);
        if ($r11 != null) {
            TextView $r76 = $r3.orderAssignedDate;
            String $r87 = DateExtKt.formatWithStyle$default($r11, "MMM dd, yyyy", null, 2, null);
            $r76.setText($r87);
        }
        TextView $r77 = $r3.orderTerminalId;
        String $r88 = posOrder.getTerminalId();
        $r77.setText($r88);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PosOrderDetailViewState $r2 = (PosOrderDetailViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(PosOrderDetailViewState posOrderDetailViewState) {
        Log_OC.getArray(posOrderDetailViewState, "viewData");
        PosOrderDetailViewState.Loading $r2 = PosOrderDetailViewState.Loading.INSTANCE;
        boolean $z0 = Log_OC.append(posOrderDetailViewState, $r2);
        if ($z0) {
            InterfaceC8209a $r3 = requireBinding();
            FragmentPosOrderDetailBinding $r4 = (FragmentPosOrderDetailBinding) $r3;
            View $r5 = $r4.orderDetailsCard;
            Log_OC.loadImage($r5, "requireBinding().orderDetailsCard");
            View r11 = $r5;
            ViewExtKt.hide$default(r11, false, 1, null);
            InterfaceC8209a $r32 = requireBinding();
            FragmentPosOrderDetailBinding $r42 = (FragmentPosOrderDetailBinding) $r32;
            ListLoaderViewBinding $r6 = $r42.listLoaderView;
            FrameLayout $r7 = $r6.getRoot();
            Log_OC.loadImage($r7, "requireBinding().listLoaderView.root");
            ViewExtKt.show($r7);
            return;
        }
        PosOrderDetailViewState.Error $r8 = PosOrderDetailViewState.Error.INSTANCE;
        boolean $z02 = Log_OC.append(posOrderDetailViewState, $r8);
        if (!$z02) {
            boolean $z03 = posOrderDetailViewState instanceof PosOrderDetailViewState.Data;
            if ($z03) {
                PosOrderDetailViewState.Data $r9 = (PosOrderDetailViewState.Data) posOrderDetailViewState;
                PosOrder $r10 = $r9.getOrder();
                renderData($r10);
                return;
            }
            return;
        }
        InterfaceC8209a $r33 = requireBinding();
        FragmentPosOrderDetailBinding $r43 = (FragmentPosOrderDetailBinding) $r33;
        View $r52 = $r43.orderDetailsCard;
        Log_OC.loadImage($r52, "requireBinding().orderDetailsCard");
        View r112 = $r52;
        ViewExtKt.hide$default(r112, false, 1, null);
        InterfaceC8209a $r34 = requireBinding();
        FragmentPosOrderDetailBinding $r44 = (FragmentPosOrderDetailBinding) $r34;
        ListLoaderViewBinding $r62 = $r44.listLoaderView;
        FrameLayout $r72 = $r62.getRoot();
        Log_OC.loadImage($r72, "requireBinding().listLoaderView.root");
        ViewExtKt.hide$default($r72, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PosOrderDetailViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PosOrderDetailViewModel createViewModel() {
        PosOrderDetailViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PosOrderDetailViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final PosOrderDetailViewModel getViewModel() {
        PosOrderDetailViewModel $r1 = this.viewModel;
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
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        PosSubComponent $r1;
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof PosActivity;
        PosActivity $r3 = $z0 ? (PosActivity) context : null;
        if ($r3 == null || ($r1 = $r3.getPos2SubComponent()) == null) {
            return;
        }
        $r1.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPosOrderDetailBinding $r4 = FragmentPosOrderDetailBinding.inflate(layoutInflater, viewGroup, false);
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
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        String $r4 = getString(C0001R.string.payment_details);
        Log_OC.loadImage($r4, "getString(R.string.payment_details)");
        PosActivityExtKt.setPosActivityTitle($r3, $r4);
        PosOrderDetailViewModel $r5 = getViewModel();
        String $r42 = getOrderId();
        Log_OC.loadImage($r42, "orderId");
        $r5.onViewCreated($r42);
        PosOrderDetailViewModel $r52 = getViewModel();
        C11680b $r6 = $r52.getToastMessage();
        PreferenceActivity $r7 = getViewLifecycleOwner();
        Log_OC.loadImage($r7, "viewLifecycleOwner");
        AbstractC11688p $r8 = C7390a.a($r6, $r7);
        Object object = new Object() { // from class: ai.kudi.agent.pos.ui.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosOrderDetailFragment $r1 = PosOrderDetailFragment.this;
                String $r32 = (String) obj;
                PosOrderDetailFragment.m40067onViewCreated$lambda0($r1, $r32);
            }
        };
        Node $r10 = Node.previous;
        $r8.e0(object, $r10);
    }

    public final void setViewModel(PosOrderDetailViewModel posOrderDetailViewModel) {
        Log_OC.getArray(posOrderDetailViewModel, "<set-?>");
        this.viewModel = posOrderDetailViewModel;
    }
}
