package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.transactions.domain.usecases.VerifyPendingTransactionRequest;
import ai.kudi.agent.transactions.p032ui.VerificationNavigator;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PendingVerificationImageCapturePresenter_Factory implements InterfaceC9468d<PendingVerificationImageCapturePresenter> {
    private final InterfaceC11700a<Pref> prefProvider;
    private final InterfaceC11700a<VerificationNavigator> verificationNavigatorProvider;
    private final InterfaceC11700a<VerifyPendingTransactionRequest> verifyTransactionProvider;

    public PendingVerificationImageCapturePresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.verificationNavigatorProvider = interfaceC11700a;
        this.verifyTransactionProvider = interfaceC11700a2;
        this.prefProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingVerificationImageCapturePresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        PendingVerificationImageCapturePresenter_Factory $r3 = new PendingVerificationImageCapturePresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingVerificationImageCapturePresenter newInstance(VerificationNavigator verificationNavigator, VerifyPendingTransactionRequest verifyPendingTransactionRequest, Pref pref) {
        PendingVerificationImageCapturePresenter $r3 = new PendingVerificationImageCapturePresenter(verificationNavigator, verifyPendingTransactionRequest, pref);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingVerificationImageCapturePresenter multiply() {
        InterfaceC11700a $r1 = this.verificationNavigatorProvider;
        Object $r2 = $r1.get();
        VerificationNavigator $r3 = (VerificationNavigator) $r2;
        InterfaceC11700a $r12 = this.verifyTransactionProvider;
        Object $r22 = $r12.get();
        VerifyPendingTransactionRequest $r4 = (VerifyPendingTransactionRequest) $r22;
        InterfaceC11700a $r13 = this.prefProvider;
        Object $r23 = $r13.get();
        Pref $r5 = (Pref) $r23;
        PendingVerificationImageCapturePresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41162multiply() {
        PendingVerificationImageCapturePresenter $r1 = multiply();
        return $r1;
    }
}
