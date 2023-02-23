package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.register.domain.usecases.aa */
/* loaded from: classes.dex */
public final /* synthetic */ class C0424aa implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ C0424aa f1022b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0424aa $r0 = new C0424aa();
        f1022b = $r0;
    }

    private /* synthetic */ C0424aa() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = FetchBusinessCategories.m40335execute$lambda0($r3);
        return $r1;
    }
}
