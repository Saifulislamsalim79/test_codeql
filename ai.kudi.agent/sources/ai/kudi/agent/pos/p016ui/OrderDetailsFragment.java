package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentOrderDetailsBinding;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.data.PosRequestTypesKt;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.p016ui.data.OrderDetailsViewData;
import ai.kudi.agent.pos.p016ui.utils.PosActivityExtKt;
import ai.kudi.agent.pos.p016ui.viewModels.OrderDetailsViewModel;
import ai.kudi.agent.pos.usecases.GetIsSuperAgentOrAggregator;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import com.google.android.material.snackbar.Snackbar;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OrderDetailsFragment.kt */
@Metadata(m10422d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 62\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0003J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0014J\b\u0010 \u001a\u00020\u0002H\u0014J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u00101\u001a\u00020\u0011H\u0002J\b\u00102\u001a\u00020\u0013H\u0002J\b\u00103\u001a\u00020\u001aH\u0002J\u001a\u00104\u001a\u00020\u001a2\u0006\u00100\u001a\u00020*2\b\u00105\u001a\u0004\u0018\u00010\u0011H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00067"}, m10421d2 = {"Lai/kudi/agent/pos/ui/OrderDetailsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/pos/ui/viewModels/OrderDetailsViewModel;", "Lai/kudi/agent/pos/ui/data/OrderDetailsViewData;", "Lai/kudi/agent/databinding/FragmentOrderDetailsBinding;", "()V", "getIsSuperAgentOrAggregator", "Lai/kudi/agent/pos/usecases/GetIsSuperAgentOrAggregator;", "getGetIsSuperAgentOrAggregator", "()Lai/kudi/agent/pos/usecases/GetIsSuperAgentOrAggregator;", "setGetIsSuperAgentOrAggregator", "(Lai/kudi/agent/pos/usecases/GetIsSuperAgentOrAggregator;)V", "posPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "price", "", "priceListingId", "", "shouldAllowMultiplePos", "", "vm", "getVm", "()Lai/kudi/agent/pos/ui/viewModels/OrderDetailsViewModel;", "setVm", "(Lai/kudi/agent/pos/ui/viewModels/OrderDetailsViewModel;)V", "applyError", "", "viewData", "applyLoading", "applyPrice", "applyPurchaseInfo", "applyViewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setAmtText", "shouldAllowMultiplePosPurchase", "showPinPopUp", "showSnackBar", MetricTracker.Object.MESSAGE, "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.OrderDetailsFragment */
/* loaded from: classes.dex */
public final class OrderDetailsFragment extends BaseMVVMViewBindingFragment<OrderDetailsViewModel, OrderDetailsViewData, FragmentOrderDetailsBinding> {
    public static final String ARG_POS_PURCHASE_INFO = "pos_purchase_info";
    public static final Companion Companion;
    public GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator;
    private PosPurchaseInfo posPurchaseInfo;
    private double price;
    private String priceListingId = "";
    private boolean shouldAllowMultiplePos;
    public OrderDetailsViewModel srv;

    /* compiled from: OrderDetailsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/pos/ui/OrderDetailsFragment$Companion;", "", "()V", "ARG_POS_PURCHASE_INFO", "", "newInstance", "Lai/kudi/agent/pos/ui/OrderDetailsFragment;", "posPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.OrderDetailsFragment$Companion */
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
        public final OrderDetailsFragment newInstance(PosPurchaseInfo posPurchaseInfo) {
            Log_OC.getArray(posPurchaseInfo, "posPurchaseInfo");
            OrderDetailsFragment $r3 = new OrderDetailsFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(OrderDetailsFragment.ARG_POS_PURCHASE_INFO, posPurchaseInfo);
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
    private final void applyError(OrderDetailsViewData orderDetailsViewData) {
        OrderDetailsViewData.Error $r2 = orderDetailsViewData.getError();
        if ($r2 == null) {
            return;
        }
        InterfaceC8209a $r3 = requireBinding();
        FragmentOrderDetailsBinding $r4 = (FragmentOrderDetailsBinding) $r3;
        View $r5 = $r4.payForPos;
        Log_OC.loadImage($r5, "requireBinding().payForPos");
        View $r7 = $r5;
        ViewExtKt.hide($r7, true);
        String $r6 = $r2.getGenericError();
        if ($r6 != null) {
            View $r72 = requireView();
            Log_OC.loadImage($r72, "requireView()");
            showSnackBar($r72, $r6);
        }
        String $r62 = $r2.getPaymentError();
        if ($r62 == null) {
            return;
        }
        InterfaceC8209a $r32 = requireBinding();
        FragmentOrderDetailsBinding $r42 = (FragmentOrderDetailsBinding) $r32;
        View $r52 = $r42.payForPos;
        Log_OC.loadImage($r52, "requireBinding().payForPos");
        View $r73 = $r52;
        ViewExtKt.show($r73);
        FragmentActivity $r8 = getActivity();
        if ($r8 == null) {
            return;
        }
        ContextExtKt.toast$default($r8, $r62, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyLoading(OrderDetailsViewData orderDetailsViewData) {
        boolean $z0 = orderDetailsViewData.isWalletLoading();
        if ($z0) {
            FragmentActivity $r2 = getActivity();
            if ($r2 == null) {
                NullPointerException r9 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.pos.ui.PosActivity");
                throw r9;
            }
            PosActivity $r3 = (PosActivity) $r2;
            $r3.showLoader();
            InterfaceC8209a $r4 = requireBinding();
            FragmentOrderDetailsBinding $r5 = (FragmentOrderDetailsBinding) $r4;
            View $r6 = $r5.payForPos;
            Log_OC.loadImage($r6, "requireBinding().payForPos");
            View r10 = $r6;
            ViewExtKt.hide(r10, true);
        } else {
            FragmentActivity $r22 = getActivity();
            if ($r22 == null) {
                NullPointerException r92 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.pos.ui.PosActivity");
                throw r92;
            }
            PosActivity $r32 = (PosActivity) $r22;
            $r32.hideLoader();
            InterfaceC8209a $r42 = requireBinding();
            FragmentOrderDetailsBinding $r52 = (FragmentOrderDetailsBinding) $r42;
            View $r62 = $r52.payForPos;
            Log_OC.loadImage($r62, "requireBinding().payForPos");
            View r102 = $r62;
            ViewExtKt.show(r102);
        }
        boolean $z02 = orderDetailsViewData.isMakingPayment();
        if ($z02) {
            InterfaceC8209a $r43 = requireBinding();
            FragmentOrderDetailsBinding $r53 = (FragmentOrderDetailsBinding) $r43;
            TextView $r8 = $r53.changeDeliveryAddressView;
            Log_OC.loadImage($r8, "requireBinding().changeDeliveryAddressView");
            ViewExtKt.hide$default($r8, false, 1, null);
            InterfaceC8209a $r44 = requireBinding();
            FragmentOrderDetailsBinding $r54 = (FragmentOrderDetailsBinding) $r44;
            $r54.payForPos.m38032f();
            return;
        }
        InterfaceC8209a $r45 = requireBinding();
        FragmentOrderDetailsBinding $r55 = (FragmentOrderDetailsBinding) $r45;
        TextView $r82 = $r55.changeDeliveryAddressView;
        Log_OC.loadImage($r82, "requireBinding().changeDeliveryAddressView");
        ViewExtKt.show($r82);
        InterfaceC8209a $r46 = requireBinding();
        FragmentOrderDetailsBinding $r56 = (FragmentOrderDetailsBinding) $r46;
        $r56.payForPos.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyPrice(OrderDetailsViewData orderDetailsViewData) {
        OrderDetailsViewData.UserAcctStatus $r2 = orderDetailsViewData.getUserAcctStatus();
        if ($r2 == null) {
            return;
        }
        InterfaceC8209a $r3 = requireBinding();
        FragmentOrderDetailsBinding $r4 = (FragmentOrderDetailsBinding) $r3;
        EditText $r5 = $r4.numberTextView;
        Editable $r6 = $r5.getText();
        String $r7 = $r6.toString();
        int $i0 = Integer.parseInt($r7);
        if ($i0 == 1) {
            InterfaceC8209a $r32 = requireBinding();
            FragmentOrderDetailsBinding $r42 = (FragmentOrderDetailsBinding) $r32;
            TextView $r8 = $r42.amtPayableValue;
            double $d0 = this.price;
            Double $r9 = Double.valueOf($d0);
            String $r72 = StringExtKt.formatDecimalAmount($r9);
            $r8.setText($r72);
            InterfaceC8209a $r33 = requireBinding();
            FragmentOrderDetailsBinding $r43 = (FragmentOrderDetailsBinding) $r33;
            KudiButton $r10 = $r43.payForPos;
            double $d02 = this.price;
            Double $r92 = Double.valueOf($d02);
            String $r73 = StringExtKt.formatAmount($r92);
            Object[] $r11 = {$r73};
            String $r74 = getString(C0001R.string.pay_for_pos_with_price, $r11);
            Log_OC.loadImage($r74, "getString(\n                        R.string.pay_for_pos_with_price,\n                        price.formatAmount()\n                    )");
            $r10.setText($r74);
        }
        PosPurchaseInfo $r12 = this.posPurchaseInfo;
        PosTypeData $r13 = $r12 == null ? null : $r12.getPosTypeData();
        Log_OC.append($r13);
        String $r75 = $r13.getId();
        this.priceListingId = $r75;
        Boolean $r14 = $r2.getDoesUserHaveMoney();
        Log_OC.append($r14);
        boolean $z0 = $r14.booleanValue();
        if ($z0) {
            InterfaceC8209a $r34 = requireBinding();
            FragmentOrderDetailsBinding $r44 = (FragmentOrderDetailsBinding) $r34;
            TextView $r82 = $r44.walletBalanceErrorMessageView;
            Log_OC.loadImage($r82, "requireBinding().walletBalanceErrorMessageView");
            ViewExtKt.hide$default($r82, false, 1, null);
            InterfaceC8209a $r35 = requireBinding();
            FragmentOrderDetailsBinding $r45 = (FragmentOrderDetailsBinding) $r35;
            ViewGroup $r102 = $r45.payForPos;
            ViewGroup r19 = $r102;
            r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.Stats$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OrderDetailsFragment $r22 = OrderDetailsFragment.this;
                    OrderDetailsFragment.m40045applyPrice$lambda14$lambda13($r22, view);
                }
            });
            return;
        }
        InterfaceC8209a $r36 = requireBinding();
        FragmentOrderDetailsBinding $r46 = (FragmentOrderDetailsBinding) $r36;
        TextView $r83 = $r46.walletBalanceErrorMessageView;
        Log_OC.loadImage($r83, "requireBinding().walletBalanceErrorMessageView");
        ViewExtKt.show($r83);
        InterfaceC8209a $r37 = requireBinding();
        FragmentOrderDetailsBinding $r47 = (FragmentOrderDetailsBinding) $r37;
        TextView $r84 = $r47.walletBalanceErrorMessageView;
        double $d03 = this.price;
        Double $r93 = Double.valueOf($d03);
        Object[] $r112 = {$r93};
        String $r76 = getString(C0001R.string.wallet_balance_pos_error, $r112);
        $r84.setText($r76);
        InterfaceC8209a $r38 = requireBinding();
        FragmentOrderDetailsBinding $r48 = (FragmentOrderDetailsBinding) $r38;
        ViewGroup $r103 = $r48.payForPos;
        ViewGroup r192 = $r103;
        r192.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrderDetailsFragment $r22 = OrderDetailsFragment.this;
                OrderDetailsFragment.m40044applyPrice$lambda14$lambda12($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyPrice$lambda-14$lambda-12  reason: not valid java name */
    public static final void m40044applyPrice$lambda14$lambda12(OrderDetailsFragment orderDetailsFragment, View view) {
        Log_OC.getArray(orderDetailsFragment, "this$0");
        double $d0 = orderDetailsFragment.price;
        OrderDetailsFragment$applyPrice$1$1$1 r7 = new OrderDetailsFragment$applyPrice$1$1$1(orderDetailsFragment);
        FundWalletBottomSheet r8 = new FundWalletBottomSheet($d0, r7);
        FragmentManager $r4 = orderDetailsFragment.getChildFragmentManager();
        String $r6 = FundWalletBottomSheet.class.getCanonicalName();
        Chapter r9 = (Chapter) r8;
        r9.show($r4, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: applyPrice$lambda-14$lambda-13  reason: not valid java name */
    public static final void m40045applyPrice$lambda14$lambda13(OrderDetailsFragment orderDetailsFragment, View view) {
        Log_OC.getArray(orderDetailsFragment, "this$0");
        orderDetailsFragment.showPinPopUp();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyPurchaseInfo(ai.kudi.agent.pos.p016ui.data.OrderDetailsViewData r13) {
        /*
            r12 = this;
            ai.kudi.agent.pos.data.PosPurchaseInfo r0 = r13.getNewPosPurchaseInfo()
            if (r0 != 0) goto L7
            return
        L7:
            r12.posPurchaseInfo = r0
            java.lang.String r1 = r0.getArea()
            if (r1 == 0) goto L18
            boolean r2 = kotlin.p549l0.C13265j.m5470u(r1)
            if (r2 == 0) goto L16
            goto L18
        L16:
            r2 = 0
            goto L19
        L18:
            r2 = 1
        L19:
            java.lang.String r1 = ""
            if (r2 == 0) goto L53
            g.x.a r3 = r12.requireBinding()
            r5 = r3
            ai.kudi.agent.databinding.FragmentOrderDetailsBinding r5 = (ai.kudi.agent.databinding.FragmentOrderDetailsBinding) r5
            r4 = r5
            android.widget.TextView r6 = r4.deliveryAddressView
            r8 = 3
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r9 = r0.getAddress()
            r10 = r9
            if (r9 != 0) goto L33
            java.lang.String r10 = ""
        L33:
            r8 = 0
            r7[r8] = r10
            java.lang.String r9 = r0.getState()
            if (r9 != 0) goto L3d
            goto L3e
        L3d:
            r1 = r9
        L3e:
            r8 = 1
            r7[r8] = r1
            java.lang.String r1 = r0.getLga()
            r8 = 2
            r7[r8] = r1
            r8 = 2131886452(0x7f120174, float:1.9407483E38)
            java.lang.String r1 = r12.getString(r8, r7)
            r6.setText(r1)
            return
        L53:
            g.x.a r3 = r12.requireBinding()
            r11 = r3
            ai.kudi.agent.databinding.FragmentOrderDetailsBinding r11 = (ai.kudi.agent.databinding.FragmentOrderDetailsBinding) r11
            r4 = r11
            android.widget.TextView r6 = r4.deliveryAddressView
            r8 = 4
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r9 = r0.getAddress()
            r10 = r9
            if (r9 != 0) goto L69
            java.lang.String r10 = ""
        L69:
            r8 = 0
            r7[r8] = r10
            java.lang.String r9 = r0.getArea()
            r10 = r9
            if (r9 != 0) goto L75
            java.lang.String r10 = ""
        L75:
            r8 = 1
            r7[r8] = r10
            java.lang.String r9 = r0.getState()
            if (r9 != 0) goto L7f
            goto L80
        L7f:
            r1 = r9
        L80:
            r8 = 2
            r7[r8] = r1
            java.lang.String r1 = r0.getLga()
            r8 = 3
            r7[r8] = r1
            r8 = 2131886451(0x7f120173, float:1.9407481E38)
            java.lang.String r1 = r12.getString(r8, r7)
            r6.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.OrderDetailsFragment.applyPurchaseInfo(ai.kudi.agent.pos.ui.data.OrderDetailsViewData):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40046onViewCreated$lambda1(OrderDetailsFragment orderDetailsFragment, View view) {
        Log_OC.getArray(orderDetailsFragment, "this$0");
        InterfaceC8209a $r2 = orderDetailsFragment.requireBinding();
        FragmentOrderDetailsBinding $r3 = (FragmentOrderDetailsBinding) $r2;
        EditText $r4 = $r3.numberTextView;
        Editable $r5 = $r4.getText();
        String $r6 = $r5.toString();
        InterfaceC8209a $r22 = orderDetailsFragment.requireBinding();
        FragmentOrderDetailsBinding $r32 = (FragmentOrderDetailsBinding) $r22;
        EditText $r42 = $r32.numberTextView;
        Editable $r52 = $r42.getText();
        String $r7 = $r52.toString();
        boolean $z0 = $r7.length() == 0;
        if ($z0) {
            InterfaceC8209a $r23 = orderDetailsFragment.requireBinding();
            FragmentOrderDetailsBinding $r33 = (FragmentOrderDetailsBinding) $r23;
            EditText $r43 = $r33.numberTextView;
            $r43.setText("1");
        } else {
            int $i0 = Integer.parseInt($r6);
            if ($i0 == 100) {
                return;
            }
            InterfaceC8209a $r24 = orderDetailsFragment.requireBinding();
            FragmentOrderDetailsBinding $r34 = (FragmentOrderDetailsBinding) $r24;
            EditText $r44 = $r34.numberTextView;
            String $r62 = String.valueOf($i0 + 1);
            $r44.setText($r62);
        }
        String $r63 = orderDetailsFragment.setAmtText();
        InterfaceC8209a $r25 = orderDetailsFragment.requireBinding();
        FragmentOrderDetailsBinding $r35 = (FragmentOrderDetailsBinding) $r25;
        KudiButton $r8 = $r35.payForPos;
        $r8.setText($r63);
        PosPurchaseInfo $r9 = orderDetailsFragment.posPurchaseInfo;
        PosTypeData $r10 = $r9 == null ? null : $r9.getPosTypeData();
        if ($r10 != null) {
            OrderDetailsViewModel $r11 = orderDetailsFragment.getVm();
            double $d0 = orderDetailsFragment.price;
            InterfaceC8209a $r26 = orderDetailsFragment.requireBinding();
            FragmentOrderDetailsBinding $r36 = (FragmentOrderDetailsBinding) $r26;
            EditText $r45 = $r36.numberTextView;
            Editable $r53 = $r45.getText();
            String $r64 = $r53.toString();
            $r11.userHasMoney($d0, Integer.parseInt($r64));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m40047onViewCreated$lambda3(OrderDetailsFragment orderDetailsFragment, View view) {
        PosTypeData $r9;
        Log_OC.getArray(orderDetailsFragment, "this$0");
        InterfaceC8209a $r2 = orderDetailsFragment.requireBinding();
        FragmentOrderDetailsBinding $r3 = (FragmentOrderDetailsBinding) $r2;
        EditText $r4 = $r3.numberTextView;
        Editable $r5 = $r4.getText();
        String $r6 = $r5.toString();
        boolean $z0 = $r6.length() == 0;
        if ($z0) {
            InterfaceC8209a $r22 = orderDetailsFragment.requireBinding();
            FragmentOrderDetailsBinding $r32 = (FragmentOrderDetailsBinding) $r22;
            EditText $r42 = $r32.numberTextView;
            $r42.setText("1");
            return;
        }
        int $i0 = Integer.parseInt($r6);
        if ($i0 == 1) {
            return;
        }
        InterfaceC8209a $r23 = orderDetailsFragment.requireBinding();
        FragmentOrderDetailsBinding $r33 = (FragmentOrderDetailsBinding) $r23;
        EditText $r43 = $r33.numberTextView;
        $r43.setText(String.valueOf($i0 - 1));
        String $r62 = orderDetailsFragment.setAmtText();
        InterfaceC8209a $r24 = orderDetailsFragment.requireBinding();
        FragmentOrderDetailsBinding $r34 = (FragmentOrderDetailsBinding) $r24;
        KudiButton $r7 = $r34.payForPos;
        $r7.setText($r62);
        PosPurchaseInfo $r8 = orderDetailsFragment.posPurchaseInfo;
        if ($r8 == null || ($r9 = $r8.getPosTypeData()) == null) {
            return;
        }
        OrderDetailsViewModel $r10 = orderDetailsFragment.getVm();
        double $d0 = $r9.getPrice();
        InterfaceC8209a $r25 = orderDetailsFragment.requireBinding();
        FragmentOrderDetailsBinding $r35 = (FragmentOrderDetailsBinding) $r25;
        EditText $r44 = $r35.numberTextView;
        Editable $r52 = $r44.getText();
        $r10.userHasMoney($d0, Integer.parseInt($r52.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4  reason: not valid java name */
    public static final void m40048onViewCreated$lambda4(OrderDetailsFragment orderDetailsFragment, View view) {
        Log_OC.getArray(orderDetailsFragment, "this$0");
        OrderDetailsViewModel $r0 = orderDetailsFragment.getVm();
        PosPurchaseInfo $r3 = orderDetailsFragment.posPurchaseInfo;
        $r0.navigateToPosDeliveryAddressFragment($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String setAmtText() {
        String $r8;
        PosPurchaseInfo $r1 = this.posPurchaseInfo;
        PosTypeData $r2 = $r1 == null ? null : $r1.getPosTypeData();
        if ($r2 != null) {
            double $d0 = this.price;
            InterfaceC8209a $r4 = requireBinding();
            FragmentOrderDetailsBinding $r5 = (FragmentOrderDetailsBinding) $r4;
            EditText $r6 = $r5.numberTextView;
            Editable $r7 = $r6.getText();
            String $r82 = $r7.toString();
            int $i0 = Integer.parseInt($r82);
            double $d1 = $i0;
            Double.isNaN($d1);
            Double $r9 = Double.valueOf($d0 * $d1);
            String $r83 = StringExtKt.formatAmount($r9);
            Object[] $r3 = {$r83};
            $r8 = getString(C0001R.string.amount_text_pos, $r3);
        } else {
            $r8 = "0.0";
        }
        Log_OC.loadImage($r8, "if (posPurchaseInfo?.posTypeData != null) {\n            getString(\n                R.string.amount_text_pos,\n                (price).times(\n                    requireBinding().numberTextView.text.toString().toInt()\n                ).formatAmount()\n            )\n        } else \"0.0\"");
        InterfaceC8209a $r42 = requireBinding();
        FragmentOrderDetailsBinding $r52 = (FragmentOrderDetailsBinding) $r42;
        TextView $r10 = $r52.amtPayableValue;
        $r10.setText($r8);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean shouldAllowMultiplePosPurchase() {
        PosTypeData $r4;
        GetIsSuperAgentOrAggregator $r1 = getGetIsSuperAgentOrAggregator();
        boolean $z0 = $r1.execute();
        if ($z0) {
            return true;
        }
        PosPurchaseInfo $r2 = this.posPurchaseInfo;
        String $r3 = null;
        if ($r2 != null && ($r4 = $r2.getPosTypeData()) != null) {
            $r3 = $r4.getPosRequestType();
        }
        boolean $z02 = Log_OC.append($r3, PosRequestTypesKt.POS_REQUEST_TYPE_REPLACEMENT);
        return !$z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showPinPopUp() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentOrderDetailsBinding $r2 = (FragmentOrderDetailsBinding) $r1;
        EditText $r3 = $r2.numberTextView;
        Editable $r4 = $r3.getText();
        String $r5 = $r4.toString();
        final int $i0 = Integer.parseInt($r5);
        boolean $z0 = this.shouldAllowMultiplePos;
        if ($z0 && $i0 > 100) {
            FragmentActivity $r6 = getActivity();
            if ($r6 == null) {
                return;
            }
            ContextExtKt.toast$default($r6, "You cannot order more than 100 POS terminals at a time", 0, 2, (Object) null);
            return;
        }
        FragmentManager $r7 = getChildFragmentManager();
        PreferenceActivity $r8 = getViewLifecycleOwner();
        $r7.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r8, new InterfaceC1523w() { // from class: ai.kudi.agent.pos.ui.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38652c(String str, Bundle bundle) {
                OrderDetailsFragment $r32 = OrderDetailsFragment.this;
                int $i02 = $i0;
                OrderDetailsFragment.m40049showPinPopUp$lambda5($r32, $i02, str, bundle);
            }
        });
        KudiPin.Companion $r10 = KudiPin.Companion;
        KudiPin $r11 = KudiPin.Companion.newInstance$default($r10, null, null, false, 7, null);
        FragmentManager $r72 = getChildFragmentManager();
        Chapter r13 = (Chapter) $r11;
        r13.show($r72, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showPinPopUp$lambda-5  reason: not valid java name */
    public static final void m40049showPinPopUp$lambda5(OrderDetailsFragment orderDetailsFragment, int $i0, String str, Bundle bundle) {
        Log_OC.getArray(orderDetailsFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        OrderDetailsViewModel $r0 = orderDetailsFragment.getVm();
        PosPurchaseInfo $r4 = orderDetailsFragment.posPurchaseInfo;
        String $r2 = orderDetailsFragment.priceListingId;
        boolean $z0 = orderDetailsFragment.shouldAllowMultiplePos;
        if (!$z0) {
            $i0 = 1;
        }
        $r0.buyPosAndPayForPos($r4, $r2, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showSnackBar(View view, String $r2) {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            Spanned $r4 = Html.fromHtml("<font color=\"#ffffff\">" + ((Object) $r2) + "</font>", 0);
            Snackbar $r5 = Snackbar.m26606Y(view, $r4, -2);
            $r5.m26603b0("Retry", new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    OrderDetailsFragment $r22 = OrderDetailsFragment.this;
                    OrderDetailsFragment.m40050showSnackBar$lambda10($r22, view2);
                }
            });
            $r5.mo26610N();
            return;
        }
        Spanned $r42 = Html.fromHtml("<font color=\"#ffffff\">" + ((Object) $r2) + "</font>");
        Snackbar $r52 = Snackbar.m26606Y(view, $r42, -2);
        $r52.m26603b0("Retry", new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OrderDetailsFragment $r22 = OrderDetailsFragment.this;
                OrderDetailsFragment.m40051showSnackBar$lambda11($r22, view2);
            }
        });
        $r52.mo26610N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showSnackBar$lambda-10  reason: not valid java name */
    public static final void m40050showSnackBar$lambda10(OrderDetailsFragment orderDetailsFragment, View view) {
        Log_OC.getArray(orderDetailsFragment, "this$0");
        OrderDetailsViewModel $r1 = orderDetailsFragment.getVm();
        double $d0 = orderDetailsFragment.price;
        $r1.priceLookup($d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showSnackBar$lambda-11  reason: not valid java name */
    public static final void m40051showSnackBar$lambda11(OrderDetailsFragment orderDetailsFragment, View view) {
        Log_OC.getArray(orderDetailsFragment, "this$0");
        OrderDetailsViewModel $r1 = orderDetailsFragment.getVm();
        double $d0 = orderDetailsFragment.price;
        $r1.priceLookup($d0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OrderDetailsViewData $r2 = (OrderDetailsViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(OrderDetailsViewData orderDetailsViewData) {
        Log_OC.getArray(orderDetailsViewData, "viewData");
        applyLoading(orderDetailsViewData);
        applyPrice(orderDetailsViewData);
        applyError(orderDetailsViewData);
        applyPurchaseInfo(orderDetailsViewData);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OrderDetailsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OrderDetailsViewModel createViewModel() {
        OrderDetailsViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final GetIsSuperAgentOrAggregator getGetIsSuperAgentOrAggregator() {
        GetIsSuperAgentOrAggregator $r1 = this.getIsSuperAgentOrAggregator;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("getIsSuperAgentOrAggregator");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OrderDetailsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OrderDetailsViewModel getVm() {
        OrderDetailsViewModel $r1 = this.srv;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.pos.ui.PosActivity");
            throw $r5;
        }
        PosActivity $r3 = (PosActivity) $r2;
        PosSubComponent $r4 = $r3.getPos2SubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r6 == true) goto L10;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            android.os.Bundle r12 = r11.getArguments()
            if (r12 != 0) goto La
            return
        La:
            java.lang.String r1 = "pos_purchase_info"
            android.os.Parcelable r0 = r12.getParcelable(r1)
            if (r0 == 0) goto L53
            r3 = r0
            ai.kudi.agent.pos.data.PosPurchaseInfo r3 = (ai.kudi.agent.pos.data.PosPurchaseInfo) r3
            r2 = r3
            r11.posPurchaseInfo = r2
            r4 = 1
            if (r2 != 0) goto L1d
        L1b:
            r4 = 0
            goto L2b
        L1d:
            ai.kudi.agent.pos.data.PosTypeData r5 = r2.getPosTypeData()
            if (r5 != 0) goto L24
            goto L1b
        L24:
            boolean r6 = r5.getContainsDiscount()
            r7 = 1
            if (r6 != r7) goto L1b
        L2b:
            r8 = 0
            if (r4 == 0) goto L40
            ai.kudi.agent.pos.data.PosPurchaseInfo r2 = r11.posPurchaseInfo
            if (r2 != 0) goto L34
            goto L50
        L34:
            ai.kudi.agent.pos.data.PosTypeData r5 = r2.getPosTypeData()
            if (r5 != 0) goto L3b
            goto L50
        L3b:
            double r8 = r5.getPriceAfterDiscount()
            goto L50
        L40:
            ai.kudi.agent.pos.data.PosPurchaseInfo r2 = r11.posPurchaseInfo
            if (r2 != 0) goto L45
            goto L50
        L45:
            ai.kudi.agent.pos.data.PosTypeData r5 = r2.getPosTypeData()
            if (r5 != 0) goto L4c
            goto L50
        L4c:
            double r8 = r5.getPrice()
        L50:
            r11.price = r8
            return
        L53:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type ai.kudi.agent.pos.data.PosPurchaseInfo"
            r10.<init>(r1)
            goto L5b
        L5b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.pos.p016ui.OrderDetailsFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        LayoutInflater $r1 = getLayoutInflater();
        FragmentOrderDetailsBinding $r4 = FragmentOrderDetailsBinding.inflate($r1, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(layoutInflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PosTypeData $r13;
        PosTypeData $r132;
        PosTypeData $r133;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        boolean $z0 = shouldAllowMultiplePosPurchase();
        this.shouldAllowMultiplePos = $z0;
        Double $r4 = null;
        if ($z0) {
            InterfaceC8209a $r5 = requireBinding();
            FragmentOrderDetailsBinding $r6 = (FragmentOrderDetailsBinding) $r5;
            ImageView $r7 = $r6.plusImageView;
            Log_OC.loadImage($r7, "requireBinding().plusImageView");
            ViewExtKt.show($r7);
            InterfaceC8209a $r52 = requireBinding();
            FragmentOrderDetailsBinding $r62 = (FragmentOrderDetailsBinding) $r52;
            ImageView $r72 = $r62.minusImageView;
            Log_OC.loadImage($r72, "requireBinding().minusImageView");
            ViewExtKt.show($r72);
            InterfaceC8209a $r53 = requireBinding();
            FragmentOrderDetailsBinding $r63 = (FragmentOrderDetailsBinding) $r53;
            EditText $r8 = $r63.numberTextView;
            Log_OC.loadImage($r8, "requireBinding().numberTextView");
            ViewExtKt.show($r8);
            InterfaceC8209a $r54 = requireBinding();
            FragmentOrderDetailsBinding $r64 = (FragmentOrderDetailsBinding) $r54;
            TextView $r9 = $r64.quantityValue;
            Log_OC.loadImage($r9, "requireBinding().quantityValue");
            ViewExtKt.hide$default($r9, false, 1, null);
        } else {
            InterfaceC8209a $r55 = requireBinding();
            FragmentOrderDetailsBinding $r65 = (FragmentOrderDetailsBinding) $r55;
            TextView $r92 = $r65.quantityValue;
            Log_OC.loadImage($r92, "requireBinding().quantityValue");
            ViewExtKt.show($r92);
        }
        OrderDetailsViewModel $r10 = getVm();
        $r10.fetchDefaultDeliveryAddress(this.posPurchaseInfo);
        OrderDetailsViewModel $r102 = getVm();
        double $d0 = this.price;
        $r102.priceLookup($d0);
        PosPurchaseInfo $r11 = this.posPurchaseInfo;
        String $r12 = ($r11 == null || ($r13 = $r11.getPosTypeData()) == null) ? null : $r13.getPosRequestType();
        if (Log_OC.append($r12, PosRequestTypesKt.POS_REQUEST_TYPE_REPLACEMENT) || Log_OC.append($r12, PosRequestTypesKt.POS_REQUEST_REPAIR_REPLACEMENT)) {
            FragmentActivity $r14 = requireActivity();
            Log_OC.loadImage($r14, "requireActivity()");
            String $r122 = getString(C0001R.string.replace_pos);
            Log_OC.loadImage($r122, "getString(R.string.replace_pos)");
            PosActivityExtKt.setPosActivityTitle($r14, $r122);
        }
        PosPurchaseInfo $r112 = this.posPurchaseInfo;
        if (($r112 == null || ($r132 = $r112.getPosTypeData()) == null || !$r132.getContainsDiscount()) ? false : true) {
            InterfaceC8209a $r56 = requireBinding();
            FragmentOrderDetailsBinding $r66 = (FragmentOrderDetailsBinding) $r56;
            TextView $r93 = $r66.titleText;
            Object[] $r15 = new Object[2];
            StringBuilder $r1 = new StringBuilder();
            PosPurchaseInfo $r113 = this.posPurchaseInfo;
            if ($r113 != null && ($r133 = $r113.getPosTypeData()) != null) {
                $r4 = $r133.getPosDiscountPercantage();
            }
            $r1.append($r4);
            $r1.append('%');
            $r15[0] = $r1.toString();
            double $d02 = this.price;
            $r15[1] = StringExtKt.formatDecimalAmount(Double.valueOf($d02));
            $r93.setText(getString(C0001R.string.pos_discount_title_text, $r15));
        }
        InterfaceC8209a $r57 = requireBinding();
        FragmentOrderDetailsBinding $r67 = (FragmentOrderDetailsBinding) $r57;
        ImageView $r73 = $r67.plusImageView;
        $r73.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OrderDetailsFragment $r2 = OrderDetailsFragment.this;
                OrderDetailsFragment.m40046onViewCreated$lambda1($r2, view2);
            }
        });
        InterfaceC8209a $r58 = requireBinding();
        FragmentOrderDetailsBinding $r68 = (FragmentOrderDetailsBinding) $r58;
        ImageView $r74 = $r68.minusImageView;
        $r74.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OrderDetailsFragment $r2 = OrderDetailsFragment.this;
                OrderDetailsFragment.m40047onViewCreated$lambda3($r2, view2);
            }
        });
        InterfaceC8209a $r59 = requireBinding();
        FragmentOrderDetailsBinding $r69 = (FragmentOrderDetailsBinding) $r59;
        $r69.changeDeliveryAddressView.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OrderDetailsFragment $r2 = OrderDetailsFragment.this;
                OrderDetailsFragment.m40048onViewCreated$lambda4($r2, view2);
            }
        });
    }

    public final void setGetIsSuperAgentOrAggregator(GetIsSuperAgentOrAggregator getIsSuperAgentOrAggregator) {
        Log_OC.getArray(getIsSuperAgentOrAggregator, "<set-?>");
        this.getIsSuperAgentOrAggregator = getIsSuperAgentOrAggregator;
    }

    public final void setVm(OrderDetailsViewModel orderDetailsViewModel) {
        Log_OC.getArray(orderDetailsViewModel, "<set-?>");
        this.srv = orderDetailsViewModel;
    }
}
