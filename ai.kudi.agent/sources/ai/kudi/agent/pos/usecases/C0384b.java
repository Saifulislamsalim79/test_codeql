package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.pos.usecases.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0384b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0384b f890e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0384b $r0 = new C0384b();
        f890e = $r0;
    }

    private /* synthetic */ C0384b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = GetPosDiscount.m40117execute$lambda0($r3);
        return $r1;
    }
}
