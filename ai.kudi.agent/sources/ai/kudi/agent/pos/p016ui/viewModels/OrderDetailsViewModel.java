package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.data.PosRequestV2;
import ai.kudi.agent.pos.data.PosResponse;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.p016ui.data.OrderDetailsViewData;
import ai.kudi.agent.pos.usecases.PosOrderRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.package_1.Wallet;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.FetchWallet;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: OrderDetailsViewModel.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ \u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\b\u0010\"\u001a\u00020\u0002H\u0016J\u0006\u0010#\u001a\u00020\u001bJ\u0010\u0010$\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0015J\u0016\u0010'\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006("}, m10421d2 = {"Lai/kudi/agent/pos/ui/viewModels/OrderDetailsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/pos/ui/data/OrderDetailsViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchWallet", "Lai/kudi/agent/users/domain/usecases/FetchWallet;", "orderRequest", "Lai/kudi/agent/pos/usecases/PosOrderRequest;", "sharedPreferences", "Landroid/content/SharedPreferences;", "terminalRequestNavigator", "Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/domain/usecases/FetchWallet;Lai/kudi/agent/pos/usecases/PosOrderRequest;Landroid/content/SharedPreferences;Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;)V", "sessionId", "", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "walletBalance", "", "getWalletBalance", "()D", "setWalletBalance", "(D)V", "buyPosAndPayForPos", "", "posPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "priceId", "qty", "", "fetchDefaultDeliveryAddress", "initialData", "navigateToFundWallet", "navigateToPosDeliveryAddressFragment", "priceLookup", "price", "userHasMoney", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.viewModels.OrderDetailsViewModel */
/* loaded from: classes.dex */
public final class OrderDetailsViewModel extends BaseViewModel<OrderDetailsViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchWallet fetchWallet;
    private final PosOrderRequest orderRequest;
    private String sessionId;
    private final SharedPreferences sharedPreferences;
    private final TerminalRequestNavigator terminalRequestNavigator;
    private double walletBalance;

    public OrderDetailsViewModel(FetchCurrentUser fetchCurrentUser, FetchWallet fetchWallet, PosOrderRequest posOrderRequest, SharedPreferences sharedPreferences, TerminalRequestNavigator terminalRequestNavigator) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(fetchWallet, "fetchWallet");
        Log_OC.getArray(posOrderRequest, "orderRequest");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        Log_OC.getArray(terminalRequestNavigator, "terminalRequestNavigator");
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchWallet = fetchWallet;
        this.orderRequest = posOrderRequest;
        this.sharedPreferences = sharedPreferences;
        this.terminalRequestNavigator = terminalRequestNavigator;
        this.sessionId = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: buyPosAndPayForPos$lambda-6  reason: not valid java name */
    public static final void m40082buyPosAndPayForPos$lambda6(OrderDetailsViewModel orderDetailsViewModel, PosPurchaseInfo posPurchaseInfo, PosResponse posResponse) {
        Log_OC.getArray(orderDetailsViewModel, "this$0");
        ViewData $r3 = orderDetailsViewModel.getState();
        OrderDetailsViewData $r4 = (OrderDetailsViewData) $r3;
        orderDetailsViewModel.publish(OrderDetailsViewData.copy$default($r4, null, false, false, false, null, null, posResponse, null, 183, null));
        SharedPreferences $r5 = orderDetailsViewModel.sharedPreferences;
        SharedPreferences.Editor $r6 = $r5.edit();
        $r6.putBoolean(LoginParams.POS_PURCHASED, true).apply();
        TerminalRequestNavigator $r7 = orderDetailsViewModel.terminalRequestNavigator;
        Log_OC.append(posPurchaseInfo);
        PosTypeData $r8 = posPurchaseInfo.getPosTypeData();
        Log_OC.append($r8);
        String $r9 = $r8.getPosRequestType();
        $r7.navigateToCongrats($r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: buyPosAndPayForPos$lambda-7  reason: not valid java name */
    public static final void m40083buyPosAndPayForPos$lambda7(OrderDetailsViewModel orderDetailsViewModel, Throwable th) {
        Log_OC.getArray(orderDetailsViewModel, "this$0");
        th.printStackTrace();
        ViewData $r3 = orderDetailsViewModel.getState();
        OrderDetailsViewData $r4 = (OrderDetailsViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        OrderDetailsViewData.Error $r1 = new OrderDetailsViewData.Error(null, (String) $r6, 1, null);
        orderDetailsViewModel.publish(OrderDetailsViewData.copy$default($r4, null, false, false, false, $r1, null, null, null, 231, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchDefaultDeliveryAddress$lambda-0  reason: not valid java name */
    public static final void m40084fetchDefaultDeliveryAddress$lambda0(PosPurchaseInfo posPurchaseInfo, OrderDetailsViewModel orderDetailsViewModel, User user) {
        Log_OC.getArray(orderDetailsViewModel, "this$0");
        String $r4 = posPurchaseInfo == null ? null : posPurchaseInfo.getAddress();
        if ($r4 == null && posPurchaseInfo != null) {
            String $r42 = user.businessAddress;
            posPurchaseInfo.setAddress($r42);
        }
        String $r43 = posPurchaseInfo == null ? null : posPurchaseInfo.getLga();
        if ($r43 == null && posPurchaseInfo != null) {
            String $r44 = user.country;
            posPurchaseInfo.setLga($r44);
        }
        String $r45 = posPurchaseInfo == null ? null : posPurchaseInfo.getState();
        if ($r45 == null && posPurchaseInfo != null) {
            String $r46 = user.state;
            posPurchaseInfo.setState($r46);
        }
        String $r3 = posPurchaseInfo != null ? posPurchaseInfo.getArea() : null;
        if ($r3 == null && posPurchaseInfo != null) {
            String $r32 = user.area;
            posPurchaseInfo.setArea($r32);
        }
        ViewData $r5 = orderDetailsViewModel.getState();
        OrderDetailsViewData $r6 = OrderDetailsViewData.copy$default((OrderDetailsViewData) $r5, null, false, false, false, null, null, null, posPurchaseInfo, 127, null);
        orderDetailsViewModel.publish($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: priceLookup$lambda-2  reason: not valid java name */
    public static final InterfaceC11692s m40086priceLookup$lambda2(OrderDetailsViewModel orderDetailsViewModel, User user) {
        Log_OC.getArray(orderDetailsViewModel, "this$0");
        Log_OC.getArray(user, "it");
        String $r2 = user.getSessionId();
        Log_OC.loadImage($r2, "it.sessionId");
        orderDetailsViewModel.setSessionId($r2);
        FetchWallet $r3 = orderDetailsViewModel.fetchWallet;
        String $r22 = user.getSessionId();
        Log_OC.loadImage($r22, "it.sessionId");
        AbstractC11688p $r4 = $r3.execute($r22);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: priceLookup$lambda-3  reason: not valid java name */
    public static final void m40087priceLookup$lambda3(OrderDetailsViewModel orderDetailsViewModel, double d, Wallet wallet) {
        Log_OC.getArray(orderDetailsViewModel, "this$0");
        double $d1 = wallet.getAmount();
        orderDetailsViewModel.setWalletBalance($d1);
        ViewData $r3 = orderDetailsViewModel.getState();
        OrderDetailsViewData orderDetailsViewData = (OrderDetailsViewData) $r3;
        double $d12 = wallet.getAmount();
        Boolean $r5 = Boolean.valueOf($d12 >= d);
        double $d0 = wallet.getAmount();
        Double $r6 = Double.valueOf($d0);
        OrderDetailsViewData.UserAcctStatus $r2 = new OrderDetailsViewData.UserAcctStatus($r5, $r6);
        OrderDetailsViewData $r4 = OrderDetailsViewData.copy$default(orderDetailsViewData, null, false, false, false, null, $r2, null, null, 221, null);
        orderDetailsViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: priceLookup$lambda-4  reason: not valid java name */
    public static final void m40088priceLookup$lambda4(OrderDetailsViewModel orderDetailsViewModel, Throwable th) {
        Log_OC.getArray(orderDetailsViewModel, "this$0");
        th.printStackTrace();
        ViewData $r3 = orderDetailsViewModel.getState();
        OrderDetailsViewData $r4 = (OrderDetailsViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        OrderDetailsViewData.Error $r1 = new OrderDetailsViewData.Error((String) $r6, null, 2, null);
        orderDetailsViewModel.publish(OrderDetailsViewData.copy$default($r4, null, false, false, false, $r1, null, null, null, 237, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void buyPosAndPayForPos(final PosPurchaseInfo posPurchaseInfo, String str, int i) {
        String $r6;
        String $r7;
        String $r8;
        String $r9;
        String $r10;
        Log_OC.getArray(str, "priceId");
        ViewData $r3 = getState();
        OrderDetailsViewData $r4 = (OrderDetailsViewData) $r3;
        publish(OrderDetailsViewData.copy$default($r4, null, false, false, true, null, null, null, null, 247, null));
        PosOrderRequest $r5 = this.orderRequest;
        if (posPurchaseInfo == null || ($r6 = posPurchaseInfo.getAddress()) == null) {
            $r6 = "";
        }
        if (posPurchaseInfo == null || ($r7 = posPurchaseInfo.getState()) == null) {
            $r7 = "";
        }
        if (posPurchaseInfo == null || ($r8 = posPurchaseInfo.getLga()) == null) {
            $r8 = "";
        }
        if (posPurchaseInfo == null || ($r9 = posPurchaseInfo.getArea()) == null) {
            $r9 = "";
        }
        if (posPurchaseInfo == null || ($r10 = posPurchaseInfo.getArea()) == null) {
            $r10 = "";
        }
        PosRequestV2 $r11 = new PosRequestV2($r6, $r8, str, $r7, $r9, $r10, i, false);
        String $r2 = this.sessionId;
        AbstractC11688p $r12 = $r5.requestPaidPos($r11, $r2);
        FavoritesArrayAdapter $r15 = $r12.e0(new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OrderDetailsViewModel $r1 = OrderDetailsViewModel.this;
                PosPurchaseInfo $r22 = posPurchaseInfo;
                PosResponse $r42 = (PosResponse) obj;
                OrderDetailsViewModel.m40082buyPosAndPayForPos$lambda6($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OrderDetailsViewModel $r1 = OrderDetailsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                OrderDetailsViewModel.m40083buyPosAndPayForPos$lambda7($r1, $r32);
            }
        });
        C11280b $r16 = getCompositeDisposable();
        $r16.b($r15);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchDefaultDeliveryAddress(final PosPurchaseInfo posPurchaseInfo) {
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosPurchaseInfo $r1 = PosPurchaseInfo.this;
                OrderDetailsViewModel $r22 = this;
                User $r4 = (User) obj;
                OrderDetailsViewModel.m40084fetchDefaultDeliveryAddress$lambda0($r1, $r22, $r4);
            }
        };
        Token $r5 = Token.FUNCTION;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "fetchCurrentUser.execute().subscribe(\n            {\n                if (posPurchaseInfo?.address == null)\n                    posPurchaseInfo?.address = it.businessAddress\n                if (posPurchaseInfo?.lga == null) {\n                    posPurchaseInfo?.lga = it.lga\n                }\n                if (posPurchaseInfo?.state == null) {\n                    posPurchaseInfo?.state = it.state\n                }\n                if (posPurchaseInfo?.area == null) {\n                    posPurchaseInfo?.area = it.area\n                }\n                publish(state.copy(newPosPurchaseInfo = posPurchaseInfo))\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r7 = getCompositeDisposable();
        $r7.b($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSessionId() {
        String r1 = this.sessionId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double getWalletBalance() {
        double d0 = this.walletBalance;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        OrderDetailsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public OrderDetailsViewData initialData() {
        OrderDetailsViewData $r1 = new OrderDetailsViewData(null, false, false, false, null, null, null, null, 255, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToFundWallet() {
        TerminalRequestNavigator $r1 = this.terminalRequestNavigator;
        $r1.navigateToFundWalletView();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToPosDeliveryAddressFragment(PosPurchaseInfo posPurchaseInfo) {
        if (posPurchaseInfo == null) {
            return;
        }
        TerminalRequestNavigator $r2 = this.terminalRequestNavigator;
        $r2.goToPosDeliveryAddressFragment(posPurchaseInfo);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void priceLookup(final double d) {
        ViewData $r1 = getState();
        OrderDetailsViewData $r2 = (OrderDetailsViewData) $r1;
        publish(OrderDetailsViewData.copy$default($r2, null, true, false, false, null, null, null, null, 237, null));
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.pos.ui.viewModels.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                OrderDetailsViewModel $r12 = OrderDetailsViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = OrderDetailsViewModel.m40086priceLookup$lambda2($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OrderDetailsViewModel $r12 = OrderDetailsViewModel.this;
                double $d0 = d;
                Wallet $r32 = (Wallet) obj;
                OrderDetailsViewModel.m40087priceLookup$lambda3($r12, $d0, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.pos.ui.viewModels.AndFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OrderDetailsViewModel $r12 = OrderDetailsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                OrderDetailsViewModel.m40088priceLookup$lambda4($r12, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    public final void setSessionId(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setWalletBalance(double d) {
        this.walletBalance = d;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void userHasMoney(double $d0, int i) {
        double $d1 = i;
        Double.isNaN($d1);
        double $d02 = $d0 * $d1;
        ViewData $r2 = getState();
        OrderDetailsViewData $r3 = (OrderDetailsViewData) $r2;
        Boolean $r4 = Boolean.valueOf(this.walletBalance >= $d02);
        double $d03 = this.walletBalance;
        Double $r5 = Double.valueOf($d03);
        OrderDetailsViewData.UserAcctStatus $r1 = new OrderDetailsViewData.UserAcctStatus($r4, $r5);
        publish(OrderDetailsViewData.copy$default($r3, null, false, false, false, null, $r1, null, null, 223, null));
    }
}
