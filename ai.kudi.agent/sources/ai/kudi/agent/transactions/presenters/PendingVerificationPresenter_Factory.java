package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class PendingVerificationPresenter_Factory implements InterfaceC9468d<PendingVerificationPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public PendingVerificationPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingVerificationPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        PendingVerificationPresenter_Factory $r2 = new PendingVerificationPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static PendingVerificationPresenter newInstance(FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        PendingVerificationPresenter $r2 = new PendingVerificationPresenter(fetchCurrentUser, analytics);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingVerificationPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        PendingVerificationPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41165multiply() {
        PendingVerificationPresenter $r1 = multiply();
        return $r1;
    }
}
