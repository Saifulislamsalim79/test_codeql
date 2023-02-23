package ai.kudi.agent.login.setup.domain;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.register.domain.wiki.UpdateBvnModel;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.login.setup.domain.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0310b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0310b f631e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0310b $r0 = new C0310b();
        f631e = $r0;
    }

    private /* synthetic */ C0310b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        UpdateBvnModel $r1 = UpdateBvnUseCase.m39739execute$lambda0($r3);
        return $r1;
    }
}
