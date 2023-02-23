package ai.kudi.agent.core.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.Map;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.core.usecases.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0195b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0195b f207e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0195b $r0 = new C0195b();
        f207e = $r0;
    }

    private /* synthetic */ C0195b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        Map $r1 = LogUserEventUseCase.m39170execute$lambda0($r3);
        return $r1;
    }
}
