package ai.kudi.agent.notification.domain;

import ai.kudi.agent.core.network.NetworkService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class FetchNotificationActivities_Factory implements InterfaceC9468d<FetchNotificationActivities> {
    private final InterfaceC11700a<NetworkService> networkServiceProvider;

    public FetchNotificationActivities_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchNotificationActivities_Factory create(InterfaceC11700a interfaceC11700a) {
        FetchNotificationActivities_Factory $r1 = new FetchNotificationActivities_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FetchNotificationActivities newInstance(NetworkService networkService) {
        FetchNotificationActivities $r1 = new FetchNotificationActivities(networkService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FetchNotificationActivities multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        NetworkService $r3 = (NetworkService) $r2;
        FetchNotificationActivities $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39840multiply() {
        FetchNotificationActivities $r1 = multiply();
        return $r1;
    }
}
