package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.savings.usecase.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0487b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0487b f1271e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0487b $r0 = new C0487b();
        f1271e = $r0;
    }

    private /* synthetic */ C0487b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = SavingsPlan.m40582fetchSavingByDate$lambda3($r3);
        return $r1;
    }
}
