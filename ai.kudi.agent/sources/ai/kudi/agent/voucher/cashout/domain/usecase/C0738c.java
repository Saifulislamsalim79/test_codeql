package ai.kudi.agent.voucher.cashout.domain.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.voucher.cashout.domain.usecase.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0738c implements InterfaceC11291f {

    /* renamed from: c */
    public static final /* synthetic */ C0738c f2023c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0738c $r0 = new C0738c();
        f2023c = $r0;
    }

    private /* synthetic */ C0738c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        Boolean $r1 = RedeemVoucher.m41716execute$lambda0($r3);
        return $r1;
    }
}
