package ai.kudi.agent.notification.domain;

import ai.kudi.agent.notification.viewmodels.NotificationCount;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.notification.domain.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0331b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0331b f686e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0331b $r0 = new C0331b();
        f686e = $r0;
    }

    private /* synthetic */ C0331b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        NotificationCount $r1 = FetchNotificationCount.m39841execute$lambda0($r3);
        return $r1;
    }
}
