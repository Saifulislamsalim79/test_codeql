package ai.kudi.agent.notification.p013ui;

import ai.kudi.agent.notification.presenters.NotificationPresenter;
import android.content.SharedPreferences;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.notification.ui.NotificationActivity_MembersInjector */
/* loaded from: classes.dex */
public final class NotificationActivity_MembersInjector implements InterfaceC9463a<NotificationActivity> {
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;
    private final InterfaceC11700a<NotificationPresenter> thisPresenterProvider;

    public NotificationActivity_MembersInjector(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.thisPresenterProvider = interfaceC11700a;
        this.sharedPreferencesProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        NotificationActivity_MembersInjector $r2 = new NotificationActivity_MembersInjector(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    public static void injectSharedPreferences(NotificationActivity notificationActivity, SharedPreferences sharedPreferences) {
        notificationActivity.sharedPreferences = sharedPreferences;
    }

    public static void injectThisPresenter(NotificationActivity notificationActivity, NotificationPresenter notificationPresenter) {
        notificationActivity.thisPresenter = notificationPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(NotificationActivity notificationActivity) {
        InterfaceC11700a $r2 = this.thisPresenterProvider;
        Object $r3 = $r2.get();
        NotificationPresenter $r4 = (NotificationPresenter) $r3;
        injectThisPresenter(notificationActivity, $r4);
        InterfaceC11700a $r22 = this.sharedPreferencesProvider;
        Object $r32 = $r22.get();
        SharedPreferences $r5 = (SharedPreferences) $r32;
        injectSharedPreferences(notificationActivity, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        NotificationActivity $r2 = (NotificationActivity) obj;
        injectMembers($r2);
    }
}
