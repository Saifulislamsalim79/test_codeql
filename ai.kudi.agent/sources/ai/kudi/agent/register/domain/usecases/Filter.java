package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Filter implements InterfaceC11291f {
    public static final /* synthetic */ Filter next;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Filter $r0 = new Filter();
        next = $r0;
    }

    private /* synthetic */ Filter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        Boolean $r1 = CheckIfBvnExists.m40333execute$lambda0($r3);
        return $r1;
    }
}
