package ai.kudi.agent.transactioncommissions.domain;

import ai.kudi.agent.kshock.data.model.LoanProviderResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Token implements InterfaceC11291f {
    public static final /* synthetic */ Token UNION;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        UNION = $r0;
    }

    private /* synthetic */ Token() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        LoanProviderResponse $r3 = (LoanProviderResponse) obj;
        Boolean $r1 = LoanProviderUseCase.m40949execute$lambda0($r3);
        return $r1;
    }
}
