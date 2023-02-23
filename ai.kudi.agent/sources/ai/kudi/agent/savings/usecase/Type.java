package ai.kudi.agent.savings.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.savings.data.model.CreateSavingsPinResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Type implements InterfaceC11291f {
    public static final /* synthetic */ Type INTERFACEEND;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Type $r0 = new Type();
        INTERFACEEND = $r0;
    }

    private /* synthetic */ Type() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        CreateSavingsPinResponse $r1 = CreateSavingPin.m40565createPin$lambda1($r3);
        return $r1;
    }
}
