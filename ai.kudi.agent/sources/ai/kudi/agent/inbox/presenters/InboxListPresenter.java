package ai.kudi.agent.inbox.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.inbox.navigators.InboxNavigator;
import ai.kudi.agent.inbox.views.InboxListView;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.domain.FetchTickets;
import ai.kudi.agent.network.util.KudiErrorParserKt;
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
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13742z;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: InboxListPresenter.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010&\u001a\u00020$J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)H\u0002J$\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010,\u001a\u00020\u001bH\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010.\u001a\u00020$J\u000e\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012¨\u00061"}, m10421d2 = {"Lai/kudi/agent/inbox/presenters/InboxListPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/inbox/views/InboxListView;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchTickets", "Lai/kudi/agent/issues/domain/FetchTickets;", "inboxNavigator", "Lai/kudi/agent/inbox/navigators/InboxNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/issues/domain/FetchTickets;Lai/kudi/agent/inbox/navigators/InboxNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isLoading", "", "()Z", "setLoading", "(Z)V", "issueList", "", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "getIssueList", "()Ljava/util/List;", "setIssueList", "(Ljava/util/List;)V", "page", "", "getPage", "()I", "setPage", "(I)V", "shouldLoadNext", "getShouldLoadNext", "setShouldLoadNext", "destroy", "", "hideLoading", "loadNext", "makeDateMap", "createdAt", "", "preProcessIssues", "issues", "lastIndx", "showLoading", OpsMetricTracker.START, "toDisputeView", "tickek", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class InboxListPresenter extends C9410b<InboxListView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private final FetchTickets fetchTickets;
    private final InboxNavigator inboxNavigator;
    private boolean isLoading;
    private List<Issue.Ticket> issueList;
    private int page;
    private boolean shouldLoadNext;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InboxListPresenter(FetchCurrentUser fetchCurrentUser, FetchTickets fetchTickets, InboxNavigator inboxNavigator, Analytics analytics) {
        List $r4;
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(fetchTickets, "fetchTickets");
        Log_OC.getArray(inboxNavigator, "inboxNavigator");
        Log_OC.getArray(analytics, "analytics");
        this.currentUser = fetchCurrentUser;
        this.fetchTickets = fetchTickets;
        this.inboxNavigator = inboxNavigator;
        this.analytics = analytics;
        this.shouldLoadNext = true;
        this.page = 1;
        $r4 = C13726r.m3891e();
        this.issueList = $r4;
        C11280b $r6 = new C11280b();
        this.compositeDisposable = $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void hideLoading(final int i) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.inbox.presenters.Logger
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void debug(Object obj) {
                InboxListPresenter $r1 = InboxListPresenter.this;
                int $i0 = i;
                InboxListView $r3 = (InboxListView) obj;
                InboxListPresenter.m39330hideLoading$lambda9($r1, $i0, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hideLoading$lambda-9  reason: not valid java name */
    public static final void m39330hideLoading$lambda9(InboxListPresenter inboxListPresenter, int i, InboxListView inboxListView) {
        Log_OC.getArray(inboxListPresenter, "this$0");
        Log_OC.getArray(inboxListView, "view");
        inboxListPresenter.setLoading(false);
        if (i == 2) {
            inboxListView.hideLoading();
        } else {
            inboxListView.hideNextLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m39331loadNext$lambda1(InboxListPresenter inboxListPresenter, User user) {
        Log_OC.getArray(inboxListPresenter, "this$0");
        Log_OC.getArray(user, "user");
        int $i0 = inboxListPresenter.getPage();
        int $i1 = $i0 + 1;
        inboxListPresenter.setPage($i1);
        FetchTickets $r2 = inboxListPresenter.fetchTickets;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "user.sessionId");
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
    public static final void m39332loadNext$lambda3(final InboxListPresenter inboxListPresenter, final List list) {
        Log_OC.getArray(inboxListPresenter, "this$0");
        Log_OC.getArray(list, "issues");
        int $i0 = inboxListPresenter.getPage();
        inboxListPresenter.hideLoading($i0);
        boolean $z0 = list.isEmpty();
        if ($z0) {
            inboxListPresenter.setShouldLoadNext(false);
        }
        inboxListPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.inbox.presenters.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: e */
            public final void m38876e(Object obj) {
                InboxListPresenter $r1 = InboxListPresenter.this;
                List $r2 = list;
                InboxListView $r4 = (InboxListView) obj;
                InboxListPresenter.m39333loadNext$lambda3$lambda2($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39333loadNext$lambda3$lambda2(InboxListPresenter inboxListPresenter, List list, InboxListView inboxListView) {
        List $r2;
        Log_OC.getArray(inboxListPresenter, "this$0");
        Log_OC.getArray(list, "$issues");
        Log_OC.getArray(inboxListView, "view");
        List $r3 = inboxListPresenter.getIssueList();
        int $i0 = $r3.size();
        List $r32 = inboxListPresenter.getIssueList();
        $r2 = C13742z.m3784n0($r32, list);
        inboxListPresenter.setIssueList(inboxListPresenter.preProcessIssues($r2, $i0));
        List $r22 = inboxListPresenter.getIssueList();
        boolean $z0 = $r22.isEmpty();
        if ($z0) {
            inboxListView.showEmptyActivities();
            return;
        }
        List $r23 = inboxListPresenter.getIssueList();
        InboxListView.DefaultImpls.showIssueList$default(inboxListView, $r23, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-5  reason: not valid java name */
    public static final void m39334loadNext$lambda5(InboxListPresenter inboxListPresenter, final Throwable th) {
        Log_OC.getArray(inboxListPresenter, "this$0");
        th.printStackTrace();
        inboxListPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.inbox.presenters.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Throwable $r1 = th;
                InboxListView $r3 = (InboxListView) obj;
                InboxListPresenter.m39335loadNext$lambda5$lambda4($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadNext$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39335loadNext$lambda5$lambda4(Throwable th, InboxListView inboxListView) {
        Log_OC.getArray(inboxListView, "view");
        inboxListView.hideLoading();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "err");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        InboxListView.DefaultImpls.showErrorMessage$default(inboxListView, $r4, 0, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Issue.Ticket makeDateMap(String str) {
        HashMap $r1;
        HashMap $r12 = new HashMap();
        Issue.Ticket $r2 = new Issue.Ticket(null, null, null, null, null, null, null, $r12, null, 383, null);
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
    private final List preProcessIssues(List list, int i) {
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
                Issue.Ticket $r5 = (Issue.Ticket) $r4;
                String $r6 = $r5.getTimeCreated();
                Issue.Ticket $r52 = makeDateMap($r6);
                $r2.add($r52);
            } else {
                int $i3 = i - 1;
                Object $r42 = list.get($i3);
                Issue.Ticket $r53 = (Issue.Ticket) $r42;
                String $r62 = $r53.getTimeCreated();
                Date $r7 = StringExtKt.formatKudiDateAlt3($r62);
                Object $r43 = list.get(i);
                Issue.Ticket $r54 = (Issue.Ticket) $r43;
                String $r63 = $r54.getTimeCreated();
                Date $r8 = StringExtKt.formatKudiDateAlt3($r63);
                boolean $z02 = DateExtKt.areDifferentDays($r7, $r8);
                if ($z02) {
                    Object $r44 = list.get(i);
                    Issue.Ticket $r55 = (Issue.Ticket) $r44;
                    String $r64 = $r55.getTimeCreated();
                    Issue.Ticket $r56 = makeDateMap($r64);
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
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.inbox.presenters.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                InboxListPresenter $r1 = InboxListPresenter.this;
                int $i0 = i;
                InboxListView $r3 = (InboxListView) obj;
                InboxListPresenter.m39336showLoading$lambda10($r1, $i0, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLoading$lambda-10  reason: not valid java name */
    public static final void m39336showLoading$lambda10(InboxListPresenter inboxListPresenter, int i, InboxListView inboxListView) {
        Log_OC.getArray(inboxListPresenter, "this$0");
        Log_OC.getArray(inboxListView, "view");
        inboxListPresenter.setLoading(true);
        if (i == 1) {
            inboxListView.showLoading();
        } else {
            inboxListView.showNextLoading();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: toDisputeView$lambda-6  reason: not valid java name */
    public static final void m39337toDisputeView$lambda6(InboxListPresenter inboxListPresenter, Issue.Ticket ticket, User user) {
        Log_OC.getArray(inboxListPresenter, "this$0");
        Log_OC.getArray(ticket, "$tickek");
        Analytics $r4 = inboxListPresenter.analytics;
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        $r4.onIssueHistorySelected($r1);
        InboxNavigator $r5 = inboxListPresenter.inboxNavigator;
        $r5.toDisputeIssueView(ticket);
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
    public final List getIssueList() {
        List r1 = this.issueList;
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
            AbstractC11688p $r4 = $r2.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.inbox.presenters.Type
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    InboxListPresenter $r12 = InboxListPresenter.this;
                    User $r42 = (User) obj;
                    InterfaceC11692s $r22 = InboxListPresenter.m39331loadNext$lambda1($r12, $r42);
                    return $r22;
                }
            });
            FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.inbox.presenters.Label
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    InboxListPresenter $r12 = InboxListPresenter.this;
                    List $r3 = (List) obj;
                    InboxListPresenter.m39332loadNext$lambda3($r12, $r3);
                }
            }, new Object() { // from class: ai.kudi.agent.inbox.presenters.Chunk
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    InboxListPresenter $r12 = InboxListPresenter.this;
                    Throwable $r3 = (Throwable) obj;
                    InboxListPresenter.m39334loadNext$lambda5($r12, $r3);
                }
            });
            Log_OC.loadImage($r7, "currentUser.execute()\n            .flatMapObservable { user: User ->\n                val pageNumber = page++\n                fetchTickets.execute(\n                    user.sessionId,\n                    FetchRequest().apply {\n                        page = pageNumber.toString()\n                    }\n                )\n            }\n            .subscribe(\n                { issues: List<Issue.Ticket> ->\n                    hideLoading(page)\n                    if (issues.isEmpty()) {\n                        shouldLoadNext = false\n                    }\n                    ifViewAttached { view ->\n                        val lastIndx = issueList.size\n                        issueList = preProcessIssues(issueList.plus(issues), lastIndx)\n                        if (issueList.isEmpty()) {\n                            view.showEmptyActivities()\n                        } else {\n                            view.showIssueList(issueList)\n                        }\n                    }\n                },\n                { err ->\n                    err.printStackTrace()\n                    ifViewAttached { view ->\n                        view.hideLoading()\n                        view.showErrorMessage(parseHttpError2(\"Something went wrong\")(err))\n                    }\n                }\n            )");
            C11280b $r8 = this.compositeDisposable;
            RxExtKt.addTo($r7, $r8);
        }
    }

    public final void setIssueList(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.issueList = list;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setShouldLoadNext(boolean z) {
        this.shouldLoadNext = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start() {
        List $r1;
        this.page = 1;
        $r1 = C13726r.m3891e();
        this.issueList = $r1;
        loadNext();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toDisputeView(final Issue.Ticket ticket) {
        Log_OC.getArray(ticket, "tickek");
        FetchCurrentUser $r2 = this.currentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.inbox.presenters.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                InboxListPresenter $r1 = InboxListPresenter.this;
                Issue.Ticket $r22 = ticket;
                User $r4 = (User) obj;
                InboxListPresenter.m39337toDisputeView$lambda6($r1, $r22, $r4);
            }
        };
        Token $r5 = Token.BOOL;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        Log_OC.loadImage($r6, "currentUser.execute().subscribe(\n            {\n                analytics.onIssueHistorySelected(it.phoneNumber)\n                inboxNavigator.toDisputeIssueView(tickek)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r7 = this.compositeDisposable;
        RxExtKt.addTo($r6, $r7);
    }
}
