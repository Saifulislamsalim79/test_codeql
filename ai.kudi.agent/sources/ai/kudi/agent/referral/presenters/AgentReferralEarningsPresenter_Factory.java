package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.referral.domain.usecase.FetchAgentEarningsSummary;
import ai.kudi.agent.referral.domain.usecase.WithdrawFunds;
import ai.kudi.agent.referral.navigators.ReferralNavigator;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class AgentReferralEarningsPresenter_Factory implements InterfaceC9468d<AgentReferralEarningsPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<FetchAgentEarningsSummary> fetchEarningsProvider;
    private final InterfaceC11700a<ReferralNavigator> referralNavigatorProvider;
    private final InterfaceC11700a<WithdrawFunds> withdrawFundsProvider;

    public AgentReferralEarningsPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        this.referralNavigatorProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.fetchEarningsProvider = interfaceC11700a3;
        this.withdrawFundsProvider = interfaceC11700a4;
        this.analyticsProvider = interfaceC11700a5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralEarningsPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4, InterfaceC11700a interfaceC11700a5) {
        AgentReferralEarningsPresenter_Factory $r5 = new AgentReferralEarningsPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4, interfaceC11700a5);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static AgentReferralEarningsPresenter newInstance(ReferralNavigator referralNavigator, FetchCurrentUser fetchCurrentUser, FetchAgentEarningsSummary fetchAgentEarningsSummary, WithdrawFunds withdrawFunds, Analytics analytics) {
        AgentReferralEarningsPresenter $r5 = new AgentReferralEarningsPresenter(referralNavigator, fetchCurrentUser, fetchAgentEarningsSummary, withdrawFunds, analytics);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AgentReferralEarningsPresenter multiply() {
        InterfaceC11700a $r1 = this.referralNavigatorProvider;
        Object $r2 = $r1.get();
        ReferralNavigator $r3 = (ReferralNavigator) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.fetchEarningsProvider;
        Object $r23 = $r13.get();
        FetchAgentEarningsSummary $r5 = (FetchAgentEarningsSummary) $r23;
        InterfaceC11700a $r14 = this.withdrawFundsProvider;
        Object $r24 = $r14.get();
        WithdrawFunds $r6 = (WithdrawFunds) $r24;
        InterfaceC11700a $r15 = this.analyticsProvider;
        Object $r25 = $r15.get();
        Analytics $r7 = (Analytics) $r25;
        AgentReferralEarningsPresenter $r8 = newInstance($r3, $r4, $r5, $r6, $r7);
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40263multiply() {
        AgentReferralEarningsPresenter $r1 = multiply();
        return $r1;
    }
}
