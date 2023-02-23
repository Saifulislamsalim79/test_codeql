package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.issues.views.TransactionListView;
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
    public final void writeFile(Object obj) {
        TransactionListView $r2 = (TransactionListView) obj;
        TransactionListPresenter.m39441hideLoading$lambda4($r2);
    }
}
