package ai.kudi.agent.notification.presenters;

import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.domain.UpdateNotificationReadStatus;
import ai.kudi.agent.notification.views.NotificationDetailsView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: NotificationDetailsPresenter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J1\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/notification/presenters/NotificationDetailsPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/notification/views/NotificationDetailsView;", "updateNotificationReadStatus", "Lai/kudi/agent/notification/domain/UpdateNotificationReadStatus;", "(Lai/kudi/agent/notification/domain/UpdateNotificationReadStatus;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "updateNotificationStatus", "notificationId", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "readStatus", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationDetailsPresenter extends C9410b<NotificationDetailsView> {
    private final C11280b compositeDisposable;
    private final UpdateNotificationReadStatus updateNotificationReadStatus;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NotificationDetailsPresenter(UpdateNotificationReadStatus updateNotificationReadStatus) {
        Log_OC.getArray(updateNotificationReadStatus, "updateNotificationReadStatus");
        this.updateNotificationReadStatus = updateNotificationReadStatus;
        C11280b $r2 = new C11280b();
        this.compositeDisposable = $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateNotificationStatus$lambda-0  reason: not valid java name */
    public static final void m39845updateNotificationStatus$lambda0(InterfaceC11767l interfaceC11767l, NotificationModel notificationModel) {
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
    public final void updateNotificationStatus(String str, final InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(str, "notificationId");
        Log_OC.getArray(interfaceC11767l, "callback");
        UpdateNotificationReadStatus $r3 = this.updateNotificationReadStatus;
        AbstractC11688p $r4 = $r3.execute(str);
        Object object = new Object() { // from class: ai.kudi.agent.notification.presenters.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                NotificationModel $r32 = (NotificationModel) obj;
                NotificationDetailsPresenter.m39845updateNotificationStatus$lambda0($r1, $r32);
            }
        };
        Token $r6 = Token.BOOL;
        FavoritesArrayAdapter $r7 = $r4.e0(object, $r6);
        Log_OC.loadImage($r7, "updateNotificationReadStatus.execute(notificationId)\n            .subscribe(\n                { notificationModel ->\n                    if (notificationModel.read) {\n                        callback(notificationModel.read)\n                    } else {\n                        callback(false)\n                    }\n                },\n                { err ->\n                    err.printStackTrace()\n                }\n            )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }
}
