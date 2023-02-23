package ai.kudi.agent.home;

import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Event implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Event STOPPED;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Event $r0 = new Event();
        STOPPED = $r0;
    }

    private /* synthetic */ Event() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void itemClicked(Object obj) {
        HomeView $r2 = (HomeView) obj;
        HomePresenter.m39289fetchInsuranceStatus$lambda19$lambda18$lambda13$lambda10($r2);
    }
}
