package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Language implements InterfaceC11291f {
    public static final /* synthetic */ Language KOREAN;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Language $r0 = new Language();
        KOREAN = $r0;
    }

    private /* synthetic */ Language() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        String $r1 = PosOrderRequest.m40128execute$lambda1$lambda0($r3);
        return $r1;
    }
}
