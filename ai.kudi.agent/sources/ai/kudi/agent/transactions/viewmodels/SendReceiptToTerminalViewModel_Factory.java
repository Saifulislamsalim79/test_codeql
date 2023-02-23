package ai.kudi.agent.transactions.viewmodels;

import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.transactions.domain.usecases.SendReceiptToTerminal;
import ai.kudi.agent.transactions.domain.usecases.VerifyTerminalConnection;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class SendReceiptToTerminalViewModel_Factory implements InterfaceC9468d<SendReceiptToTerminalViewModel> {
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<ResourceDelegate> resourceDelegateProvider;
    private final InterfaceC11700a<SendReceiptToTerminal> sendReceiptToTerminalProvider;
    private final InterfaceC11700a<VerifyTerminalConnection> verifyTerminalConnectionProvider;

    public SendReceiptToTerminalViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.sendReceiptToTerminalProvider = interfaceC11700a;
        this.verifyTerminalConnectionProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
        this.resourceDelegateProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SendReceiptToTerminalViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        SendReceiptToTerminalViewModel_Factory $r4 = new SendReceiptToTerminalViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SendReceiptToTerminalViewModel newInstance(SendReceiptToTerminal sendReceiptToTerminal, VerifyTerminalConnection verifyTerminalConnection, FetchCurrentUser fetchCurrentUser, ResourceDelegate resourceDelegate) {
        SendReceiptToTerminalViewModel $r4 = new SendReceiptToTerminalViewModel(sendReceiptToTerminal, verifyTerminalConnection, fetchCurrentUser, resourceDelegate);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SendReceiptToTerminalViewModel multiply() {
        InterfaceC11700a $r1 = this.sendReceiptToTerminalProvider;
        Object $r2 = $r1.get();
        SendReceiptToTerminal $r3 = (SendReceiptToTerminal) $r2;
        InterfaceC11700a $r12 = this.verifyTerminalConnectionProvider;
        Object $r22 = $r12.get();
        VerifyTerminalConnection $r4 = (VerifyTerminalConnection) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        InterfaceC11700a $r14 = this.resourceDelegateProvider;
        Object $r24 = $r14.get();
        ResourceDelegate $r6 = (ResourceDelegate) $r24;
        SendReceiptToTerminalViewModel $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41278multiply() {
        SendReceiptToTerminalViewModel $r1 = multiply();
        return $r1;
    }
}
