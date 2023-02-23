package ai.kudi.agent.notification.domain;

import ai.kudi.agent.core.data.remote.CoreApiService;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class UpdateNotificationReadStatus_Factory implements InterfaceC9468d<UpdateNotificationReadStatus> {
    private final InterfaceC11700a<CoreApiService> networkServiceProvider;

    public UpdateNotificationReadStatus_Factory(InterfaceC11700a interfaceC11700a) {
        this.networkServiceProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpdateNotificationReadStatus_Factory create(InterfaceC11700a interfaceC11700a) {
        UpdateNotificationReadStatus_Factory $r1 = new UpdateNotificationReadStatus_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static UpdateNotificationReadStatus newInstance(CoreApiService coreApiService) {
        UpdateNotificationReadStatus $r1 = new UpdateNotificationReadStatus(coreApiService);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public UpdateNotificationReadStatus multiply() {
        InterfaceC11700a $r1 = this.networkServiceProvider;
        Object $r2 = $r1.get();
        CoreApiService $r3 = (CoreApiService) $r2;
        UpdateNotificationReadStatus $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39844multiply() {
        UpdateNotificationReadStatus $r1 = multiply();
        return $r1;
    }
}
