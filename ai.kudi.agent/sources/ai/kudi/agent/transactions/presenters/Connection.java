package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.views.TransactionDetailsView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Connection implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Connection sInstance;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Connection $r0 = new Connection();
        sInstance = $r0;
    }

    private /* synthetic */ Connection() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCancelled(Object obj) {
        TransactionDetailsView $r2 = (TransactionDetailsView) obj;
        C0611xbfe79eba.m41202onCancelled$lambda0($r2);
    }
}
