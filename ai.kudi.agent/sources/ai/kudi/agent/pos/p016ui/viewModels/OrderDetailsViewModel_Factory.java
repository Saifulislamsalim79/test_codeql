package ai.kudi.agent.pos.p016ui.viewModels;

import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.usecases.PosOrderRequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.FetchWallet;
import android.content.SharedPreferences;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.pos.ui.viewModels.OrderDetailsViewModel_Factory */
/* loaded from: classes.dex */
public final class OrderDetailsViewModel_Factory implements InterfaceC9468d<OrderDetailsViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchWallet> fetchWalletProvider;
    private final InterfaceC11700a<PosOrderRequest> orderRequestProvider;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<TerminalRequestNavigator> terminalRequestNavigatorProvider;

    public OrderDetailsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.fetchWalletProvider = interfaceC11700a2;
        this.orderRequestProvider = interfaceC11700a3;
        this.sharedPreferencesProvider = interfaceC11700a4;
        this.terminalRequestNavigatorProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OrderDetailsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        OrderDetailsViewModel_Factory $r5 = new OrderDetailsViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OrderDetailsViewModel newInstance(FetchCurrentUser fetchCurrentUser, FetchWallet fetchWallet, PosOrderRequest posOrderRequest, SharedPreferences sharedPreferences, TerminalRequestNavigator terminalRequestNavigator) {
        OrderDetailsViewModel $r5 = new OrderDetailsViewModel(fetchCurrentUser, fetchWallet, posOrderRequest, sharedPreferences, terminalRequestNavigator);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OrderDetailsViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchWalletProvider;
        Object $r22 = $r12.get();
        FetchWallet $r4 = (FetchWallet) $r22;
        InterfaceC11700a $r13 = this.orderRequestProvider;
        Object $r23 = $r13.get();
        PosOrderRequest $r5 = (PosOrderRequest) $r23;
        InterfaceC11700a $r14 = this.sharedPreferencesProvider;
        Object $r24 = $r14.get();
        SharedPreferences $r6 = (SharedPreferences) $r24;
        InterfaceC11700a $r15 = this.terminalRequestNavigatorProvider;
        Object $r25 = $r15.get();
        TerminalRequestNavigator $r7 = (TerminalRequestNavigator) $r25;
        OrderDetailsViewModel $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40089multiply() {
        OrderDetailsViewModel $r1 = multiply();
        return $r1;
    }
}
