package ai.kudi.agent.referral.presenters;

import ai.kudi.agent.referral.views.ReferralEarningsView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Target implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Target NONE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Target $r0 = new Target();
        NONE = $r0;
    }

    private /* synthetic */ Target() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setDescription(Object obj) {
        ReferralEarningsView $r2 = (ReferralEarningsView) obj;
        AgentReferralEarningsPresenter.m40252fetchEarningsBreakdown$lambda0($r2);
    }
}
