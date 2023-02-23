package ai.kudi.agent.transactionstatus.summary.presenter;

import ai.kudi.agent.transactionstatus.summary.view.WithdrawalView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Settings implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Settings settings;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Settings $r0 = new Settings();
        settings = $r0;
    }

    private /* synthetic */ Settings() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void set(Object obj) {
        WithdrawalView $r2 = (WithdrawalView) obj;
        WithdrawalSummaryPresenter.m41295hideLoading$lambda1($r2);
    }
}
