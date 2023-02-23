package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.PaybackLoanResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Money implements InterfaceC11291f {
    public static final /* synthetic */ Money ZERO;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Money $r0 = new Money();
        ZERO = $r0;
    }

    private /* synthetic */ Money() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        PaybackLoanResponse $r3 = (PaybackLoanResponse) obj;
        Loan $r1 = PaybackOverdueLoan.m39699execute$lambda0($r3);
        return $r1;
    }
}
