package ai.kudi.agent.bills.data.source;

import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ServiceLocator implements InterfaceC11291f {
    public static final /* synthetic */ ServiceLocator instance;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ServiceLocator $r0 = new ServiceLocator();
        instance = $r0;
    }

    private /* synthetic */ ServiceLocator() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        List $r1 = (List) obj;
        return LocalAnnouncementsDataSource.m39021observeAnnouncements$lambda1($r1);
    }
}
