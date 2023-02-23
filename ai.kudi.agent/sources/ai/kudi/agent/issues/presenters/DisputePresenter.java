package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.domain.FetchTicket;
import ai.kudi.agent.issues.views.Disputeview;
import ai.kudi.agent.transactions.domain.usecases.FetchTransaction;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.content.res.Resources;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11780a0;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: DisputePresenter.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/issues/presenters/DisputePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/issues/views/Disputeview;", "fetchTransaction", "Lai/kudi/agent/transactions/domain/usecases/FetchTransaction;", "fetchTicket", "Lai/kudi/agent/issues/domain/FetchTicket;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/transactions/domain/usecases/FetchTransaction;Lai/kudi/agent/issues/domain/FetchTicket;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "destroy", "", "getTicketDetails", "ticketId", "", "logIssueCheckStatusReached", "notifyUserAboutTicketUpdate", "res", "Landroid/content/res/Resources;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DisputePresenter extends C9410b<Disputeview> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private final FetchTicket fetchTicket;
    private final FetchTransaction fetchTransaction;
    private Issue.Ticket ticket;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DisputePresenter(FetchTransaction fetchTransaction, FetchTicket fetchTicket, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(fetchTransaction, "fetchTransaction");
        Log_OC.getArray(fetchTicket, "fetchTicket");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        this.fetchTransaction = fetchTransaction;
        this.fetchTicket = fetchTicket;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
        C11280b $r5 = new C11280b();
        this.compositeDisposable = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getTicketDetails$lambda-0  reason: not valid java name */
    public static final void m39370getTicketDetails$lambda0(Disputeview disputeview) {
        Log_OC.getArray(disputeview, "view");
        disputeview.showLoading();
        disputeview.showErrorMsg(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getTicketDetails$lambda-2  reason: not valid java name */
    public static final void m39371getTicketDetails$lambda2(final DisputePresenter disputePresenter, Issue issue) {
        Log_OC.getArray(disputePresenter, "this$0");
        Log_OC.getArray(issue, "response");
        Issue.Ticket $r1 = issue.getBoxOfficeResponse();
        disputePresenter.ticket = $r1;
        disputePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void read(Object obj) {
                DisputePresenter $r12 = DisputePresenter.this;
                Disputeview $r3 = (Disputeview) obj;
                DisputePresenter.m39372getTicketDetails$lambda2$lambda1($r12, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getTicketDetails$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39372getTicketDetails$lambda2$lambda1(DisputePresenter disputePresenter, Disputeview disputeview) {
        Log_OC.getArray(disputePresenter, "this$0");
        Log_OC.getArray(disputeview, "it");
        disputeview.hideLoading();
        disputeview.showErrorMsg(null);
        Issue.Ticket $r2 = disputePresenter.ticket;
        Log_OC.append($r2);
        disputeview.showTicket($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getTicketDetails$lambda-4  reason: not valid java name */
    public static final void m39373getTicketDetails$lambda4(DisputePresenter disputePresenter, Throwable th) {
        Log_OC.getArray(disputePresenter, "this$0");
        th.printStackTrace();
        Operator $r2 = Operator.f416or;
        disputePresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getTicketDetails$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39374getTicketDetails$lambda4$lambda3(Disputeview disputeview) {
        Log_OC.getArray(disputeview, "view");
        disputeview.hideLoading();
        disputeview.showErrorMsg("Something went wrong. Please try again");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logIssueCheckStatusReached$lambda-8  reason: not valid java name */
    public static final void m39375logIssueCheckStatusReached$lambda8(DisputePresenter disputePresenter, User user) {
        Log_OC.getArray(disputePresenter, "this$0");
        Analytics $r3 = disputePresenter.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onIssueStatusCheckClicked($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: notifyUserAboutTicketUpdate$lambda-6  reason: not valid java name */
    public static final void m39377notifyUserAboutTicketUpdate$lambda6(DisputePresenter disputePresenter, final Resources resources, final User user) {
        Log_OC.getArray(disputePresenter, "this$0");
        Log_OC.getArray(resources, "$res");
        Log_OC.getArray(user, "user");
        disputePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Resources $r1 = resources;
                User $r2 = user;
                Disputeview $r4 = (Disputeview) obj;
                DisputePresenter.m39378notifyUserAboutTicketUpdate$lambda6$lambda5($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: notifyUserAboutTicketUpdate$lambda-6$lambda-5  reason: not valid java name */
    public static final void m39378notifyUserAboutTicketUpdate$lambda6$lambda5(Resources resources, User user, Disputeview disputeview) {
        Log_OC.getArray(resources, "$res");
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(disputeview, "view");
        C11780a0 c11780a0 = C11780a0.f26475a;
        int $i0 = C0214R.string.ticket_update_notification;
        String $r5 = resources.getString($i0);
        Log_OC.loadImage($r5, "res.getString(R.string.ticket_update_notification)");
        StringBuilder $r6 = new StringBuilder();
        String $r7 = user.getFirstName();
        $r6.append((Object) $r7);
        $r6.append(' ');
        String $r72 = user.getLastName();
        $r6.append((Object) $r72);
        String $r73 = $r6.toString();
        Object[] $r1 = {$r73};
        String $r52 = String.format($r5, Arrays.copyOf($r1, 1));
        Log_OC.loadImage($r52, "java.lang.String.format(format, *args)");
        String $r74 = Log_OC.m10359a("Message o ", (Object) $r52);
        Timber.m1627e($r74, new Object[0]);
        disputeview.notifyUserAboutPendingTicket($r52);
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
    public final void getTicketDetails(String str) {
        Log_OC.getArray(str, "ticketId");
        Type $r3 = Type.ROW;
        ifViewAttached($r3);
        FetchTicket $r4 = this.fetchTicket;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.issues.presenters.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                DisputePresenter $r1 = DisputePresenter.this;
                Issue $r32 = (Issue) obj;
                DisputePresenter.m39371getTicketDetails$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.presenters.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                DisputePresenter $r1 = DisputePresenter.this;
                Throwable $r32 = (Throwable) obj;
                DisputePresenter.m39373getTicketDetails$lambda4($r1, $r32);
            }
        });
        Log_OC.loadImage($r7, "fetchTicket.execute(ticketId)\n            .subscribe(\n                { response: Issue ->\n                    ticket = response.boxOfficeResponse\n                    ifViewAttached {\n                        it.hideLoading()\n                        it.showErrorMsg(null)\n                        it.showTicket(ticket = ticket!!)\n                    }\n                },\n                { err ->\n                    err.printStackTrace()\n                    ifViewAttached { view ->\n                        view.hideLoading()\n                        view.showErrorMsg(\n                            error = \"Something went wrong. Please try again\"\n                        )\n                    }\n                }\n            )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logIssueCheckStatusReached() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                DisputePresenter $r12 = DisputePresenter.this;
                User $r3 = (User) obj;
                DisputePresenter.m39375logIssueCheckStatusReached$lambda8($r12, $r3);
            }
        };
        ObjectId $r4 = ObjectId.ZEROID;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                analytics.onIssueStatusCheckClicked(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void notifyUserAboutTicketUpdate(final Resources resources) {
        Log_OC.getArray(resources, "res");
        FetchCurrentUser $r2 = this.currentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                DisputePresenter $r1 = DisputePresenter.this;
                Resources $r22 = resources;
                User $r4 = (User) obj;
                DisputePresenter.m39377notifyUserAboutTicketUpdate$lambda6($r1, $r22, $r4);
            }
        };
        Country $r5 = Country.f398TO;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "currentUser.execute()\n            .subscribe(\n                { user: User ->\n\n                    ifViewAttached { view ->\n                        val message = String.format(\n                            res.getString(R.string.ticket_update_notification),\n                            \"${user.firstName} ${user.lastName}\"\n                        )\n                        Timber.e(\"Message o $message\")\n                        view.notifyUserAboutPendingTicket(message)\n                    }\n                },\n                { err ->\n                    err.printStackTrace()\n                }\n            )");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }
}
