package ai.kudi.agent.withdrawal.presenter;

import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OthersWithdrawalPresenter_Factory implements InterfaceC9468d<OthersWithdrawalPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<PerformServiceFeeLookup> feeLookupProvider;

    public OthersWithdrawalPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.feeLookupProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OthersWithdrawalPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        OthersWithdrawalPresenter_Factory $r3 = new OthersWithdrawalPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OthersWithdrawalPresenter newInstance(PerformServiceFeeLookup performServiceFeeLookup, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        OthersWithdrawalPresenter $r3 = new OthersWithdrawalPresenter(performServiceFeeLookup, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OthersWithdrawalPresenter multiply() {
        InterfaceC11700a $r1 = this.feeLookupProvider;
        Object $r2 = $r1.get();
        PerformServiceFeeLookup $r3 = (PerformServiceFeeLookup) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        OthersWithdrawalPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41874multiply() {
        OthersWithdrawalPresenter $r1 = multiply();
        return $r1;
    }
}
