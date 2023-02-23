package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.issues.views.TransactionListView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Device implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Device settings;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Device $r0 = new Device();
        settings = $r0;
    }

    private /* synthetic */ Device() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void disconnect(Object obj) {
        TransactionListView $r2 = (TransactionListView) obj;
        TransactionListPresenter.m39440hideLoading$lambda3($r2);
    }
}
