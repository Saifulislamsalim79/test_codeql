package ai.kudi.agent.p2p.viewmodels;

import ai.kudi.agent.transactions.domain.usecases.SubmitTransactionRequest;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class P2pSummaryViewModel_Factory implements InterfaceC9468d<P2pSummaryViewModel> {
    private final InterfaceC11700a<SubmitTransactionRequest> submitRequestProvider;

    public P2pSummaryViewModel_Factory(InterfaceC11700a interfaceC11700a) {
        this.submitRequestProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static P2pSummaryViewModel_Factory create(InterfaceC11700a interfaceC11700a) {
        P2pSummaryViewModel_Factory $r1 = new P2pSummaryViewModel_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static P2pSummaryViewModel newInstance(SubmitTransactionRequest submitTransactionRequest) {
        P2pSummaryViewModel $r1 = new P2pSummaryViewModel(submitTransactionRequest);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public P2pSummaryViewModel multiply() {
        InterfaceC11700a $r1 = this.submitRequestProvider;
        Object $r2 = $r1.get();
        SubmitTransactionRequest $r3 = (SubmitTransactionRequest) $r2;
        P2pSummaryViewModel $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40002multiply() {
        P2pSummaryViewModel $r1 = multiply();
        return $r1;
    }
}
