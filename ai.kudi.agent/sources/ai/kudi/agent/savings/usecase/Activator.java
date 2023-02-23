package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.savings.data.model.SavingResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Activator implements InterfaceC11291f {
    public static final /* synthetic */ Activator activated;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Activator $r0 = new Activator();
        activated = $r0;
    }

    private /* synthetic */ Activator() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        SavingResponse $r1 = DeactivateSaving.m40571deactivate$lambda1($r3);
        return $r1;
    }
}
