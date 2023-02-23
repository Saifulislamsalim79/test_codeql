package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.referral.views.AgentReferralInviteView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Preferences implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Preferences prefs;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Preferences $r0 = new Preferences();
        prefs = $r0;
    }

    private /* synthetic */ Preferences() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onPreferenceChange(Object obj) {
        AgentReferralInviteView $r2 = (AgentReferralInviteView) obj;
        AgentReferralInvitePresenter.m40270createAgentReferral$lambda2($r2);
    }
}
