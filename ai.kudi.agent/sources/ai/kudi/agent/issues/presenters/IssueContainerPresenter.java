package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.issues.views.IssueContainerView;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.domain.UpdateNotificationReadStatus;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: IssueContainerPresenter.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ1\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\r0\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/issues/presenters/IssueContainerPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/issues/views/IssueContainerView;", "updateNotificationReadStatus", "Lai/kudi/agent/notification/domain/UpdateNotificationReadStatus;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/notification/domain/UpdateNotificationReadStatus;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "onIssueHistoryClicked", "updateNotificationStatus", "notificationId", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "readStatus", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueContainerPresenter extends C9410b<IssueContainerView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final UpdateNotificationReadStatus updateNotificationReadStatus;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueContainerPresenter(UpdateNotificationReadStatus updateNotificationReadStatus, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(updateNotificationReadStatus, "updateNotificationReadStatus");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.updateNotificationReadStatus = updateNotificationReadStatus;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onIssueHistoryClicked$lambda-2  reason: not valid java name */
    public static final void m39381onIssueHistoryClicked$lambda2(IssueContainerPresenter issueContainerPresenter, User user) {
        Log_OC.getArray(issueContainerPresenter, "this$0");
        Analytics $r3 = issueContainerPresenter.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onIssueHistoryClicked($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateNotificationStatus$lambda-0  reason: not valid java name */
    public static final void m39383updateNotificationStatus$lambda0(InterfaceC11767l interfaceC11767l, NotificationModel notificationModel) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        boolean $z0 = notificationModel.getRead();
        if (!$z0) {
            Boolean $r2 = Boolean.FALSE;
            interfaceC11767l.invoke($r2);
            return;
        }
        boolean $z02 = notificationModel.getRead();
        Boolean $r22 = Boolean.valueOf($z02);
        interfaceC11767l.invoke($r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateNotificationStatus$lambda-1  reason: not valid java name */
    public static final void m39384updateNotificationStatus$lambda1(InterfaceC11767l interfaceC11767l, Throwable th) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        th.printStackTrace();
        Boolean $r2 = Boolean.FALSE;
        interfaceC11767l.invoke($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onIssueHistoryClicked() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueContainerPresenter $r12 = IssueContainerPresenter.this;
                User $r3 = (User) obj;
                IssueContainerPresenter.m39381onIssueHistoryClicked$lambda2($r12, $r3);
            }
        };
        Quaternion $r4 = Quaternion.f425J;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.onIssueHistoryClicked(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateNotificationStatus(String str, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "notificationId");
        Log_OC.getArray(interfaceC11767l, "callback");
        UpdateNotificationReadStatus $r4 = this.updateNotificationReadStatus;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.issues.presenters.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                NotificationModel $r3 = (NotificationModel) obj;
                IssueContainerPresenter.m39383updateNotificationStatus$lambda0($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.presenters.ReplaySubject$BoundedState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Throwable $r3 = (Throwable) obj;
                IssueContainerPresenter.m39384updateNotificationStatus$lambda1($r1, $r3);
            }
        });
        Log_OC.loadImage($r7, "updateNotificationReadStatus.execute(notificationId)\n            .subscribe(\n                { notificationModel ->\n                    if (notificationModel.read) {\n                        callback(notificationModel.read)\n                    } else {\n                        callback(false)\n                    }\n                },\n                { err ->\n                    err.printStackTrace()\n                    callback(false)\n                }\n            )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }
}
