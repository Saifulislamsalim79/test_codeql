package ai.kudi.agent.transactions.viewmodels;

import ai.kudi.agent.transactions.data.PendingVerificationCustomerDetailInputData;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Token implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Token BOOL;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        BOOL = $r0;
    }

    private /* synthetic */ Token() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setFlags(Object obj) {
        PendingVerificationCustomerDetailInputData $r2 = (PendingVerificationCustomerDetailInputData) obj;
        PendingVerificationCustomerDetailInputPresenter.m41262validateInputFields$lambda10($r2);
    }
}
