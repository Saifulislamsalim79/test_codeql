package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.views.RequestStatementView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Engine implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Engine instance;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Engine $r0 = new Engine();
        instance = $r0;
    }

    private /* synthetic */ Engine() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showProgress(Object obj) {
        RequestStatementView $r2 = (RequestStatementView) obj;
        RequestStatementPresenter.m41166isRequestStatementInputParamsValid$lambda6($r2);
    }
}
