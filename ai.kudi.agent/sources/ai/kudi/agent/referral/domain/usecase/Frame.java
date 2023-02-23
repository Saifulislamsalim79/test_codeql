package ai.kudi.agent.referral.domain.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Frame implements InterfaceC11291f {

    /* renamed from: h */
    public static final /* synthetic */ Frame f957h;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Frame $r0 = new Frame();
        f957h = $r0;
    }

    private /* synthetic */ Frame() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = FetchReferrals.m40247execute$lambda0($r3);
        return $r1;
    }
}
