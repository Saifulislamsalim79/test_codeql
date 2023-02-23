package ai.kudi.agent.transactionhistory.p031ui.view;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.Logger */
/* loaded from: classes.dex */
public final /* synthetic */ class Logger implements Object {
    public static final /* synthetic */ Logger log;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Logger $r0 = new Logger();
        log = $r0;
    }

    private /* synthetic */ Logger() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        TransactionsFragment.m41083onViewCreated$lambda2($r2);
    }
}
