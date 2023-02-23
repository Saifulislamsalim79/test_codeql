package ai.kudi.agent.transactioncommissions.domain;

import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.transactions.domain.dto.WalletSummary;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ClassWriter implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ ClassWriter f1526b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f1526b = $r0;
    }

    private /* synthetic */ ClassWriter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        APIResponse $r3 = (APIResponse) obj;
        WalletSummary $r1 = GetCommissionCashoutSummaryUseCase.m40947execute$lambda1$lambda0($r3);
        return $r1;
    }
}
