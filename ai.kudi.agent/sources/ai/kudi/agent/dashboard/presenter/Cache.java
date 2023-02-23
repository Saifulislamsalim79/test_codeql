package ai.kudi.agent.dashboard.presenter;

import ai.kudi.agent.dashboard.view.DashboardView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Cache implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Cache cache;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Cache $r0 = new Cache();
        cache = $r0;
    }

    private /* synthetic */ Cache() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invalidate(Object obj) {
        DashboardView $r2 = (DashboardView) obj;
        DashboardPresenter.m39219showProgressBar$lambda6($r2);
    }
}
