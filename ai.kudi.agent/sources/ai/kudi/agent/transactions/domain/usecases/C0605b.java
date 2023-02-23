package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.transactions.domain.dto.VerifyTerminalConnectionResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.transactions.domain.usecases.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0605b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0605b f1639e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0605b $r0 = new C0605b();
        f1639e = $r0;
    }

    private /* synthetic */ C0605b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        VerifyTerminalConnectionResponse $r1 = VerifyTerminalConnection.m41124execute$lambda0($r3);
        return $r1;
    }
}
