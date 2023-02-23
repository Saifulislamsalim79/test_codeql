package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.LoanResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Type implements InterfaceC11291f {
    public static final /* synthetic */ Type RSTRING;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Type $r0 = new Type();
        RSTRING = $r0;
    }

    private /* synthetic */ Type() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        LoanResponse $r3 = (LoanResponse) obj;
        Loan $r1 = PerformLoanRequest.m39701execute$lambda0($r3);
        return $r1;
    }
}
