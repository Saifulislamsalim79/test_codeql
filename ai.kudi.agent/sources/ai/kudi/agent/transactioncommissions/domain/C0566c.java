package ai.kudi.agent.transactioncommissions.domain;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.transactioncommissions.data.CommissionCashoutResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.transactioncommissions.domain.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0566c implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0566c f1529d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0566c $r0 = new C0566c();
        f1529d = $r0;
    }

    private /* synthetic */ C0566c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        CommissionCashoutResponse $r1 = RequestCommissionsCashoutUseCase.m40952execute$lambda1$lambda0($r3);
        return $r1;
    }
}
