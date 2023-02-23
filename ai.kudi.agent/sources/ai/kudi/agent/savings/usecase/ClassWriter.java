package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.savings.data.model.SavingResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ClassWriter implements InterfaceC11291f {

    /* renamed from: J */
    public static final /* synthetic */ ClassWriter f1263J;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f1263J = $r0;
    }

    private /* synthetic */ ClassWriter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        SavingResponse $r1 = CreateSavings.m40568createSavingGoal$lambda1($r3);
        return $r1;
    }
}
