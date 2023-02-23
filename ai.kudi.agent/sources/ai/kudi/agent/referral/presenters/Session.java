package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.referral.views.AgentReferralInviteView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Session implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Session current;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Session $r0 = new Session();
        current = $r0;
    }

    private /* synthetic */ Session() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invalidate(Object obj) {
        AgentReferralInviteView $r2 = (AgentReferralInviteView) obj;
        AgentReferralInvitePresenter.m40269createAgentReferral$lambda1($r2);
    }
}
