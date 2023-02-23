package ai.kudi.agent.outlet_mgt.useCases;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class FlurryAdSize implements InterfaceC11291f {
    public static final /* synthetic */ FlurryAdSize FULLSCREEN;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        FlurryAdSize $r0 = new FlurryAdSize();
        FULLSCREEN = $r0;
    }

    private /* synthetic */ FlurryAdSize() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = FetchOutletForHq.m39901execute$lambda0($r3);
        return $r1;
    }
}
