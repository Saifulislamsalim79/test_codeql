package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.kshock.data.model.KshockEligibility;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Position implements InterfaceC11291f {
    public static final /* synthetic */ Position TOP;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Position $r0 = new Position();
        TOP = $r0;
    }

    private /* synthetic */ Position() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        KshockEligibility $r1 = FetchKshockAvailabilty.m39680execute$lambda0($r3);
        return $r1;
    }
}
