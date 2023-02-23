package ai.kudi.agent.notification.presenters;

import ai.kudi.agent.notification.domain.UpdateNotificationReadStatus;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class NotificationDetailsPresenter_Factory implements InterfaceC9468d<NotificationDetailsPresenter> {
    private final InterfaceC11700a<UpdateNotificationReadStatus> updateNotificationReadStatusProvider;

    public NotificationDetailsPresenter_Factory(InterfaceC11700a interfaceC11700a) {
        this.updateNotificationReadStatusProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NotificationDetailsPresenter_Factory create(InterfaceC11700a interfaceC11700a) {
        NotificationDetailsPresenter_Factory $r1 = new NotificationDetailsPresenter_Factory(interfaceC11700a);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NotificationDetailsPresenter newInstance(UpdateNotificationReadStatus updateNotificationReadStatus) {
        NotificationDetailsPresenter $r1 = new NotificationDetailsPresenter(updateNotificationReadStatus);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NotificationDetailsPresenter multiply() {
        InterfaceC11700a $r1 = this.updateNotificationReadStatusProvider;
        Object $r2 = $r1.get();
        UpdateNotificationReadStatus $r3 = (UpdateNotificationReadStatus) $r2;
        NotificationDetailsPresenter $r4 = newInstance($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39847multiply() {
        NotificationDetailsPresenter $r1 = multiply();
        return $r1;
    }
}
