package ai.kudi.agent.transactionstatus.summary.presenter;

import ai.kudi.agent.transactionstatus.summary.view.WithdrawalView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Token implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Token GREATER_THAN;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        GREATER_THAN = $r0;
    }

    private /* synthetic */ Token() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void tag(Object obj) {
        WithdrawalView $r2 = (WithdrawalView) obj;
        WithdrawalSummaryPresenter.m41300showAuthDialog$lambda4($r2);
    }
}
