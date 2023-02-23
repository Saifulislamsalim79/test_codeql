package ai.kudi.agent.transactions.viewmodels;

import ai.kudi.agent.transactions.p032ui.VerificationNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PendingVerificationCustomerDetailInputPresenter_Factory implements InterfaceC9468d<PendingVerificationCustomerDetailInputPresenter> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<VerificationNavigator> verificationNavigatorProvider;

    public PendingVerificationCustomerDetailInputPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.currentUserProvider = interfaceC11700a;
        this.verificationNavigatorProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingVerificationCustomerDetailInputPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        PendingVerificationCustomerDetailInputPresenter_Factory $r2 = new PendingVerificationCustomerDetailInputPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingVerificationCustomerDetailInputPresenter newInstance(FetchCurrentUser fetchCurrentUser, VerificationNavigator verificationNavigator) {
        PendingVerificationCustomerDetailInputPresenter $r2 = new PendingVerificationCustomerDetailInputPresenter(fetchCurrentUser, verificationNavigator);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingVerificationCustomerDetailInputPresenter multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.verificationNavigatorProvider;
        Object $r22 = $r12.get();
        VerificationNavigator $r4 = (VerificationNavigator) $r22;
        PendingVerificationCustomerDetailInputPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41271multiply() {
        PendingVerificationCustomerDetailInputPresenter $r1 = multiply();
        return $r1;
    }
}
