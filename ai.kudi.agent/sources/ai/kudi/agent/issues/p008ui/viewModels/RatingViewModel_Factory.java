package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.issues.domain.RateIssue;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.issues.ui.viewModels.RatingViewModel_Factory */
/* loaded from: classes.dex */
public final class RatingViewModel_Factory implements InterfaceC9468d<RatingViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<RateIssue> rateIssueProvider;

    public RatingViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.rateIssueProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RatingViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        RatingViewModel_Factory $r3 = new RatingViewModel_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static RatingViewModel newInstance(RateIssue rateIssue, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        RatingViewModel $r3 = new RatingViewModel(rateIssue, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RatingViewModel multiply() {
        InterfaceC11700a $r1 = this.rateIssueProvider;
        Object $r2 = $r1.get();
        RateIssue $r3 = (RateIssue) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        RatingViewModel $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39552multiply() {
        RatingViewModel $r1 = multiply();
        return $r1;
    }
}
