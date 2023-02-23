package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.savings.usecase.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0488c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0488c f1272d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0488c $r0 = new C0488c();
        f1272d = $r0;
    }

    private /* synthetic */ C0488c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = SavingsPlan.m40580fetchAllSavings$lambda1($r3);
        return $r1;
    }
}
