package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AgentReferralInfoPresenter_Factory implements InterfaceC9468d<AgentReferralInfoPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<ReferralNavigator> referralNavigatorProvider;

    public AgentReferralInfoPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.referralNavigatorProvider = interfaceC11700a;
        this.currentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralInfoPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        AgentReferralInfoPresenter_Factory $r3 = new AgentReferralInfoPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralInfoPresenter newInstance(ReferralNavigator referralNavigator, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        AgentReferralInfoPresenter $r3 = new AgentReferralInfoPresenter(referralNavigator, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralInfoPresenter multiply() {
        InterfaceC11700a $r1 = this.referralNavigatorProvider;
        Object $r2 = $r1.get();
        ReferralNavigator $r3 = (ReferralNavigator) $r2;
        InterfaceC11700a $r12 = this.currentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        AgentReferralInfoPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40267multiply() {
        AgentReferralInfoPresenter $r1 = multiply();
        return $r1;
    }
}
