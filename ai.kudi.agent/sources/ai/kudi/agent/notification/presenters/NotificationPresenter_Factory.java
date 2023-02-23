package ai.kudi.agent.notification.presenters;

import ai.kudi.agent.notification.domain.FetchNotificationActivities;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class NotificationPresenter_Factory implements InterfaceC9468d<NotificationPresenter> {
    private final InterfaceC11700a<FetchCurrentUser> currentUserProvider;
    private final InterfaceC11700a<FetchNotificationActivities> fetchNotificationActivitiesProvider;

    public NotificationPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.currentUserProvider = interfaceC11700a;
        this.fetchNotificationActivitiesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NotificationPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        NotificationPresenter_Factory $r2 = new NotificationPresenter_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NotificationPresenter newInstance(FetchCurrentUser fetchCurrentUser, FetchNotificationActivities fetchNotificationActivities) {
        NotificationPresenter $r2 = new NotificationPresenter(fetchCurrentUser, fetchNotificationActivities);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NotificationPresenter multiply() {
        InterfaceC11700a $r1 = this.currentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.fetchNotificationActivitiesProvider;
        Object $r22 = $r12.get();
        FetchNotificationActivities $r4 = (FetchNotificationActivities) $r22;
        NotificationPresenter $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39854multiply() {
        NotificationPresenter $r1 = multiply();
        return $r1;
    }
}
