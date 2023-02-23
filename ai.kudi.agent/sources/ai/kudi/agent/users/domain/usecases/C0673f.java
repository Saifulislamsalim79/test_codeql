package ai.kudi.agent.users.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.users.domain.usecases.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0673f implements InterfaceC11291f {

    /* renamed from: o */
    public static final /* synthetic */ C0673f f1874o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0673f $r0 = new C0673f();
        f1874o = $r0;
    }

    private /* synthetic */ C0673f() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = FetchPendingTransactions.m41434execute$lambda1$lambda0($r3);
        return $r1;
    }
}
