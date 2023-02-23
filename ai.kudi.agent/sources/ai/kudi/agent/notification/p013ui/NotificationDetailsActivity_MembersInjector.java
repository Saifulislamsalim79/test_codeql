package ai.kudi.agent.notification.p013ui;

import ai.kudi.agent.notification.presenters.NotificationDetailsPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.notification.ui.NotificationDetailsActivity_MembersInjector */
/* loaded from: classes.dex */
public final class NotificationDetailsActivity_MembersInjector implements InterfaceC9463a<NotificationDetailsActivity> {
    private final InterfaceC11700a<NotificationDetailsPresenter> thisPresenterProvider;

    public NotificationDetailsActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        NotificationDetailsActivity_MembersInjector $r1 = new NotificationDetailsActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(NotificationDetailsActivity notificationDetailsActivity, NotificationDetailsPresenter notificationDetailsPresenter) {
        notificationDetailsActivity.thisPresenter = notificationDetailsPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(NotificationDetailsActivity notificationDetailsActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        NotificationDetailsPresenter $r4 = (NotificationDetailsPresenter) $r2;
        injectThisPresenter(notificationDetailsActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        NotificationDetailsActivity $r2 = (NotificationDetailsActivity) obj;
        injectMembers($r2);
    }
}
