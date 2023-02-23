package ai.kudi.agent.bills.presenters;

import ai.kudi.agent.bills.views.HomeView;
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
        HomeView $r2 = (HomeView) obj;
        HomePresenter.m39048fetchFrequentlyUsedBillers$lambda11$lambda10($r2);
    }
}
