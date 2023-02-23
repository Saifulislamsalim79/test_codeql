package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.kshock.usecases.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0306c implements InterfaceC11291f {

    /* renamed from: c */
    public static final /* synthetic */ C0306c f605c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0306c $r0 = new C0306c();
        f605c = $r0;
    }

    private /* synthetic */ C0306c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        List $r1 = FetchNewKshockEligibility.m39685execute$lambda0($r3);
        return $r1;
    }
}
