package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.transactions.domain.usecases.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0606c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0606c f1640d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0606c $r0 = new C0606c();
        f1640d = $r0;
    }

    private /* synthetic */ C0606c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        Customer $r1 = CreateCustomerRequest.m41100lookupCustomer$lambda1$lambda0($r3);
        return $r1;
    }
}
