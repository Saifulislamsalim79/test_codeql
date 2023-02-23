package ai.kudi.agent.bills.presenters;

import ai.kudi.agent.bills.domain.usecases.PerformBillerLookup;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import com.google.firebase.database.C5615f;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ProductPresenter_Factory implements InterfaceC9468d<ProductPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<PerformBillerLookup> billerLookupProvider;
    private final InterfaceC11700a<PerformServiceFeeLookup> feesLookupProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchUserProvider;
    private final InterfaceC11700a<C5615f> firebaseDBProvider;

    public ProductPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.fetchUserProvider = interfaceC11700a;
        this.billerLookupProvider = interfaceC11700a2;
        this.feesLookupProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
        this.firebaseDBProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        ProductPresenter_Factory $r5 = new ProductPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ProductPresenter newInstance(FetchCurrentUser fetchCurrentUser, PerformBillerLookup performBillerLookup, PerformServiceFeeLookup performServiceFeeLookup, Analytics analytics, C5615f c5615f) {
        ProductPresenter $r5 = new ProductPresenter(fetchCurrentUser, performBillerLookup, performServiceFeeLookup, analytics, c5615f);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ProductPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.billerLookupProvider;
        Object $r22 = $r12.get();
        PerformBillerLookup $r4 = (PerformBillerLookup) $r22;
        InterfaceC11700a $r13 = this.feesLookupProvider;
        Object $r23 = $r13.get();
        PerformServiceFeeLookup $r5 = (PerformServiceFeeLookup) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        InterfaceC11700a $r15 = this.firebaseDBProvider;
        Object $r25 = $r15.get();
        C5615f $r7 = (C5615f) $r25;
        ProductPresenter $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39088multiply() {
        ProductPresenter $r1 = multiply();
        return $r1;
    }
}
