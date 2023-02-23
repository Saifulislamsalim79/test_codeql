package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.notification.domain.UpdateNotificationReadStatus;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class IssueContainerPresenter_Factory implements InterfaceC9468d<IssueContainerPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<UpdateNotificationReadStatus> updateNotificationReadStatusProvider;

    public IssueContainerPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.updateNotificationReadStatusProvider = interfaceC11700a;
        this.analyticsProvider = interfaceC11700a2;
        this.fetchCurrentUserProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueContainerPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        IssueContainerPresenter_Factory $r3 = new IssueContainerPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static IssueContainerPresenter newInstance(UpdateNotificationReadStatus updateNotificationReadStatus, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        IssueContainerPresenter $r3 = new IssueContainerPresenter(updateNotificationReadStatus, analytics, fetchCurrentUser);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueContainerPresenter multiply() {
        InterfaceC11700a $r1 = this.updateNotificationReadStatusProvider;
        Object $r2 = $r1.get();
        UpdateNotificationReadStatus $r3 = (UpdateNotificationReadStatus) $r2;
        InterfaceC11700a $r12 = this.analyticsProvider;
        Object $r22 = $r12.get();
        Analytics $r4 = (Analytics) $r22;
        InterfaceC11700a $r13 = this.fetchCurrentUserProvider;
        Object $r23 = $r13.get();
        FetchCurrentUser $r5 = (FetchCurrentUser) $r23;
        IssueContainerPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39385multiply() {
        IssueContainerPresenter $r1 = multiply();
        return $r1;
    }
}
