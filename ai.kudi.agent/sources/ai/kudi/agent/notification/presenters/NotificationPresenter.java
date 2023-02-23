package ai.kudi.agent.notification.presenters;

import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.domain.FetchNotificationActivities;
import ai.kudi.agent.notification.views.NotificationView;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
import p272h.p364d.p365a.p366c.C9410b;
import p272h.p364d.p365a.p366c.LoginListener;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: NotificationPresenter.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010#\u001a\u00020\"J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J$\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010)\u001a\u00020\u0019H\u0002J\u0010\u0010*\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010+\u001a\u00020\"R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/notification/presenters/NotificationPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/notification/views/NotificationView;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchNotificationActivities", "Lai/kudi/agent/notification/domain/FetchNotificationActivities;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/notification/domain/FetchNotificationActivities;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "isLoading", "", "()Z", "setLoading", "(Z)V", "notificationActivities", "", "Lai/kudi/agent/notification/data/model/NotificationModel;", "getNotificationActivities", "()Ljava/util/List;", "setNotificationActivities", "(Ljava/util/List;)V", "page", "", "getPage", "()I", "setPage", "(I)V", "shouldLoadNext", "getShouldLoadNext", "setShouldLoadNext", "hideLoading", "", "loadNext", "makeDateMap", "createdAt", "", "preProcessNotifications", "notifications", "lastIdx", "showLoading", OpsMetricTracker.START, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationPresenter extends C9410b<NotificationView> {
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private final FetchNotificationActivities fetchNotificationActivities;
    private boolean isLoading;
    private List<NotificationModel> notificationActivities;
    private int page;
    private boolean shouldLoadNext;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NotificationPresenter(FetchCurrentUser fetchCurrentUser, FetchNotificationActivities fetchNotificationActivities) {
        List $r2;
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(fetchNotificationActivities, "fetchNotificationActivities");
        this.currentUser = fetchCurrentUser;
        this.fetchNotificationActivities = fetchNotificationActivities;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
        this.shouldLoadNext = true;
        $r2 = C13726r.m3891e();
        this.notificationActivities = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideLoading(int i) {
        this.isLoading = false;
        if (i == 1) {
            LoginListener $r1 = getView();
            NotificationView $r2 = (NotificationView) $r1;
            $r2.hideLoading();
            return;
        }
        LoginListener $r12 = getView();
        NotificationView $r22 = (NotificationView) $r12;
        $r22.hideNextLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m39848loadNext$lambda1(NotificationPresenter notificationPresenter, User user) {
        Log_OC.getArray(notificationPresenter, "this$0");
        Log_OC.getArray(user, "it");
        int $i0 = notificationPresenter.getPage();
        int $i1 = $i0 + 1;
        notificationPresenter.setPage($i1);
        FetchNotificationActivities $r2 = notificationPresenter.fetchNotificationActivities;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        FetchRequest $r4 = new FetchRequest(null, 1, null);
        String $r5 = String.valueOf($i0);
        $r4.setPage($r5);
        C13666w c13666w = C13666w.f30112a;
        AbstractC11688p $r7 = $r2.execute($r3, $r4);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-3  reason: not valid java name */
    public static final void m39849loadNext$lambda3(final NotificationPresenter notificationPresenter, final List list) {
        Log_OC.getArray(notificationPresenter, "this$0");
        int $i0 = notificationPresenter.getPage();
        notificationPresenter.hideLoading($i0);
        boolean $z0 = list.isEmpty();
        if ($z0) {
            notificationPresenter.setShouldLoadNext(false);
        }
        notificationPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.notification.presenters.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                NotificationPresenter $r1 = NotificationPresenter.this;
                List $r2 = list;
                NotificationView $r4 = (NotificationView) obj;
                NotificationPresenter.m39850loadNext$lambda3$lambda2($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39850loadNext$lambda3$lambda2(NotificationPresenter notificationPresenter, List list, NotificationView notificationView) {
        List $r2;
        Log_OC.getArray(notificationPresenter, "this$0");
        Log_OC.getArray(notificationView, "view");
        List $r3 = notificationPresenter.getNotificationActivities();
        int $i0 = $r3.size();
        List $r32 = notificationPresenter.getNotificationActivities();
        Log_OC.loadImage(list, "it");
        $r2 = C13742z.m3784n0($r32, list);
        notificationPresenter.setNotificationActivities(notificationPresenter.preProcessNotifications($r2, $i0));
        List $r22 = notificationPresenter.getNotificationActivities();
        boolean $z0 = $r22.isEmpty();
        if ($z0) {
            notificationView.showEmptyActivities();
            return;
        }
        List $r23 = notificationPresenter.getNotificationActivities();
        notificationView.showNotificationActivities($r23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-5  reason: not valid java name */
    public static final void m39851loadNext$lambda5(NotificationPresenter notificationPresenter, Throwable th) {
        Log_OC.getArray(notificationPresenter, "this$0");
        th.printStackTrace();
        Compression $r2 = Compression.METADATA;
        notificationPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadNext$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39852loadNext$lambda5$lambda4(NotificationView notificationView) {
        Log_OC.getArray(notificationView, "view");
        notificationView.hideLoading();
        notificationView.showErrorMessage();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final NotificationModel makeDateMap(String str) {
        HashMap $r1;
        HashMap $r12 = new HashMap();
        NotificationModel $r2 = new NotificationModel(null, null, null, null, null, null, false, false, $r12, 255, null);
        C13287o $r5 = C13664u.m4227a("createdAt", str);
        C13287o $r52 = C13664u.m4227a("isDateView", "true");
        C13287o[] $r4 = {$r5, $r52};
        $r1 = C13727r0.m3879m($r4);
        $r2.setDateView($r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final List preProcessNotifications(List list, int i) {
        int $i1;
        boolean $z0 = list.isEmpty();
        if ($z0) {
            return list;
        }
        ArrayList $r2 = new ArrayList();
        List $r3 = list.subList(0, Math.max(0, i));
        $r2.addAll($r3);
        $i1 = C13726r.m3889g(list);
        if (i > $i1) {
            return $r2;
        }
        while (true) {
            int $i2 = i + 1;
            if (i == 0) {
                Object $r4 = list.get(i);
                NotificationModel $r5 = (NotificationModel) $r4;
                String $r6 = $r5.getCreatedAt();
                NotificationModel $r52 = makeDateMap($r6);
                $r2.add($r52);
            } else {
                int $i3 = i - 1;
                Object $r42 = list.get($i3);
                NotificationModel $r53 = (NotificationModel) $r42;
                String $r62 = $r53.getCreatedAt();
                Date $r7 = StringExtKt.formatKudiDateAlt2($r62);
                Object $r43 = list.get(i);
                NotificationModel $r54 = (NotificationModel) $r43;
                String $r63 = $r54.getCreatedAt();
                Date $r8 = StringExtKt.formatKudiDateAlt2($r63);
                boolean $z02 = DateExtKt.areDifferentDays2($r7, $r8);
                if ($z02) {
                    Object $r44 = list.get(i);
                    NotificationModel $r55 = (NotificationModel) $r44;
                    String $r64 = $r55.getCreatedAt();
                    NotificationModel $r56 = makeDateMap($r64);
                    $r2.add($r56);
                }
            }
            Object $r45 = list.get(i);
            $r2.add($r45);
            if (i == $i1) {
                return $r2;
            }
            i = $i2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showLoading(final int i) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.notification.presenters.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                NotificationPresenter $r1 = NotificationPresenter.this;
                int $i0 = i;
                NotificationView $r3 = (NotificationView) obj;
                NotificationPresenter.m39853showLoading$lambda7($r1, $i0, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoading$lambda-7  reason: not valid java name */
    public static final void m39853showLoading$lambda7(NotificationPresenter notificationPresenter, int i, NotificationView notificationView) {
        Log_OC.getArray(notificationPresenter, "this$0");
        Log_OC.getArray(notificationView, "view");
        notificationPresenter.setLoading(true);
        if (i == 0) {
            notificationView.showLoading();
        } else {
            notificationView.showNextLoading();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getCurrentUser() {
        FetchCurrentUser r1 = this.currentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getNotificationActivities() {
        List r1 = this.notificationActivities;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getPage() {
        int i0 = this.page;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShouldLoadNext() {
        boolean z0 = this.shouldLoadNext;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isLoading() {
        boolean z0 = this.isLoading;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadNext() {
        boolean $z0 = this.shouldLoadNext;
        if ($z0) {
            boolean $z02 = this.isLoading;
            if ($z02) {
                return;
            }
            int $i0 = this.page;
            showLoading($i0);
            FetchCurrentUser $r1 = this.currentUser;
            AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
            AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.notification.presenters.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    NotificationPresenter $r12 = NotificationPresenter.this;
                    User $r42 = (User) obj;
                    InterfaceC11692s $r22 = NotificationPresenter.m39848loadNext$lambda1($r12, $r42);
                    return $r22;
                }
            });
            FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.notification.presenters.Label
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    NotificationPresenter $r12 = NotificationPresenter.this;
                    List $r3 = (List) obj;
                    NotificationPresenter.m39849loadNext$lambda3($r12, $r3);
                }
            }, new Object() { // from class: ai.kudi.agent.notification.presenters.Property
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    NotificationPresenter $r12 = NotificationPresenter.this;
                    Throwable $r3 = (Throwable) obj;
                    NotificationPresenter.m39851loadNext$lambda5($r12, $r3);
                }
            });
            Log_OC.loadImage($r7, "currentUser.execute()\n            .flatMapObservable {\n                val pageNumber = page++\n                fetchNotificationActivities.execute(\n                    it.sessionId,\n                    FetchRequest().apply { page = pageNumber.toString() }\n                )\n\n            }\n            .subscribe(\n                {\n                    hideLoading(page)\n                    if (it.isEmpty()) {\n                        shouldLoadNext = false\n                    }\n                    ifViewAttached { view ->\n                        val lastIdx = notificationActivities.size\n                        notificationActivities = preProcessNotifications(\n                            notificationActivities.plus(it), lastIdx\n                        )\n                        if (notificationActivities.isEmpty()) {\n                            view.showEmptyActivities()\n                        } else {\n                            view.showNotificationActivities(notificationActivities)\n                        }\n                    }\n                },\n                { err ->\n                    err.printStackTrace()\n                    ifViewAttached { view ->\n                        view.hideLoading()\n                        view.showErrorMessage()\n                    }\n                }\n            )");
            C11280b $r8 = this.compositeDisposable;
            RxExtKt.addTo($r7, $r8);
        }
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setNotificationActivities(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.notificationActivities = list;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setShouldLoadNext(boolean z) {
        this.shouldLoadNext = z;
    }

    public final void start() {
        loadNext();
    }
}
