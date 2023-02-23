package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.views.CreateCustomerView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class State implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ State completed;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        State $r0 = new State();
        completed = $r0;
    }

    private /* synthetic */ State() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void apply(Object obj) {
        CreateCustomerView $r2 = (CreateCustomerView) obj;
        CreateCustomerPresenter.m41126assignCustomerToTransaction$lambda15($r2);
    }
}
