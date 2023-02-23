package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.transactions.domain.usecases.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0608f implements InterfaceC11291f {

    /* renamed from: o */
    public static final /* synthetic */ C0608f f1643o;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0608f $r0 = new C0608f();
        f1643o = $r0;
    }

    private /* synthetic */ C0608f() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        Customer $r1 = CreateCustomerRequest.m41098createCustomer$lambda3$lambda2($r3);
        return $r1;
    }
}
