package ai.kudi.agent.wallettopup.presenters;

import ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.navigators.ProcessTopupNavigator;
import ai.kudi.agent.users.navigators.TopupKCashNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class WalletTopupPresenter_Factory implements InterfaceC9468d<WalletTopupPresenter> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<TopupKCashNavigator> kcashNavigatorProvider;
    private final InterfaceC11700a<SubmitTransactionRequest> submitRequestProvider;
    private final InterfaceC11700a<ProcessTopupNavigator> topupNavigatorProvider;

    public WalletTopupPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.currentUserProvider = interfaceC11700a;
        this.topupNavigatorProvider = interfaceC11700a2;
        this.kcashNavigatorProvider = interfaceC11700a3;
        this.submitRequestProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WalletTopupPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        WalletTopupPresenter_Factory $r4 = new WalletTopupPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static WalletTopupPresenter newInstance(FetchCurrentUser fetchCurrentUser, ProcessTopupNavigator processTopupNavigator, TopupKCashNavigator topupKCashNavigator, SubmitTransactionRequest submitTransactionRequest) {
        WalletTopupPresenter $r4 = new WalletTopupPresenter(fetchCurrentUser, processTopupNavigator, topupKCashNavigator, submitTransactionRequest);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public WalletTopupPresenter multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.topupNavigatorProvider;
        Object $r22 = $r12.get();
        ProcessTopupNavigator $r4 = (ProcessTopupNavigator) $r22;
        InterfaceC11700a $r13 = this.kcashNavigatorProvider;
        Object $r23 = $r13.get();
        TopupKCashNavigator $r5 = (TopupKCashNavigator) $r23;
        InterfaceC11700a $r14 = this.submitRequestProvider;
        Object $r24 = $r14.get();
        SubmitTransactionRequest $r6 = (SubmitTransactionRequest) $r24;
        WalletTopupPresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41771multiply() {
        WalletTopupPresenter $r1 = multiply();
        return $r1;
    }
}
