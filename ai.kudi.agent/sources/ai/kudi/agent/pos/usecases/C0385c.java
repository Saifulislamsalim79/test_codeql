package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.pos.data.PosOrder;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.pos.usecases.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0385c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0385c f891d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0385c $r0 = new C0385c();
        f891d = $r0;
    }

    private /* synthetic */ C0385c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        PosOrder $r1 = GetPosRequestsDetailUseCase.m40120execute$lambda1$lambda0($r3);
        return $r1;
    }
}
