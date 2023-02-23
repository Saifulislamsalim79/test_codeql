package ai.kudi.agent.outlet_mgt.viewmodels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.outlet_mgt.useCases.FetchOutletForHq;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class OutletsListingViewModel_Factory implements InterfaceC9468d<OutletsListingViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchOutletForHq> fetchOutletForHqProvider;

    public OutletsListingViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.fetchOutletForHqProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletsListingViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        OutletsListingViewModel_Factory $r3 = new OutletsListingViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static OutletsListingViewModel newInstance(FetchOutletForHq fetchOutletForHq, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        OutletsListingViewModel $r3 = new OutletsListingViewModel(fetchOutletForHq, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OutletsListingViewModel multiply() {
        InterfaceC11700a $r1 = this.fetchOutletForHqProvider;
        Object $r2 = $r1.get();
        FetchOutletForHq $r3 = (FetchOutletForHq) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        OutletsListingViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39977multiply() {
        OutletsListingViewModel $r1 = multiply();
        return $r1;
    }
}
