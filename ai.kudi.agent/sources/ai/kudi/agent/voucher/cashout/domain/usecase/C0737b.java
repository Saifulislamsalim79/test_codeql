package ai.kudi.agent.voucher.cashout.domain.usecase;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherVerification;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.voucher.cashout.domain.usecase.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0737b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0737b f2022e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0737b $r0 = new C0737b();
        f2022e = $r0;
    }

    private /* synthetic */ C0737b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        VoucherVerification $r1 = CashOutVoucherVerification.m41714execute$lambda1($r3);
        return $r1;
    }
}
