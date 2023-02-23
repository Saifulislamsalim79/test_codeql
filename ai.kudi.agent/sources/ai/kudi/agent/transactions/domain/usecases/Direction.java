package ai.kudi.agent.transactions.domain.usecases;

import ai.kudi.agent.core.network.response.APIResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Direction implements InterfaceC11291f {

    /* renamed from: NW */
    public static final /* synthetic */ Direction f1627NW;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Direction $r0 = new Direction();
        f1627NW = $r0;
    }

    private /* synthetic */ Direction() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        String $r1 = CreateCustomerRequest.m41096assignCustomerToTrx$lambda5$lambda4($r3);
        return $r1;
    }
}
