package ai.kudi.agent.transactions.viewmodels;

import ai.kudi.agent.transactions.data.PendingVerificationCustomerDetailInputData;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Line implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Line next;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Line $r0 = new Line();
        next = $r0;
    }

    private /* synthetic */ Line() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setTitle(Object obj) {
        PendingVerificationCustomerDetailInputData $r2 = (PendingVerificationCustomerDetailInputData) obj;
        PendingVerificationCustomerDetailInputPresenter.m41265validateInputFields$lambda4($r2);
    }
}
