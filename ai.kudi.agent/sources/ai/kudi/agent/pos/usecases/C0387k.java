package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.pos.data.PosResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.pos.usecases.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0387k implements InterfaceC11291f {

    /* renamed from: a */
    public static final /* synthetic */ C0387k f894a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0387k $r0 = new C0387k();
        f894a = $r0;
    }

    private /* synthetic */ C0387k() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        PosResponse $r1 = PosOrderRequest.m40129requestPaidPos$lambda2($r3);
        return $r1;
    }
}
