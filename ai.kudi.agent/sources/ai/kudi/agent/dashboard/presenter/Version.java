package ai.kudi.agent.dashboard.presenter;

import ai.kudi.agent.dashboard.view.TransactionBreakdownView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Version implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Version VERSION;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Version $r0 = new Version();
        VERSION = $r0;
    }

    private /* synthetic */ Version() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void visitLdcInsn(Object obj) {
        TransactionBreakdownView $r2 = (TransactionBreakdownView) obj;
        TransactionBreakDownPresenter.m39229showProgress$lambda2($r2);
    }
}
