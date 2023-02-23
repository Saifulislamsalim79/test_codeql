package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.domain.FetchTickets;
import ai.kudi.agent.issues.navigators.IssueTypeHomeNavigator;
import ai.kudi.agent.issues.views.IssueHistoryView;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: IssueHistoryPresenter.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016JB\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00172\b\b\u0002\u0010%\u001a\u00020\u0017J\u0006\u0010&\u001a\u00020\u001dJ\u000e\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/issues/presenters/IssueHistoryPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/issues/views/IssueHistoryView;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchTickets", "Lai/kudi/agent/issues/domain/FetchTickets;", "issueTypeHomeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/issues/domain/FetchTickets;Lai/kudi/agent/issues/navigators/IssueTypeHomeNavigator;Lai/kudi/agent/core/analytics/Analytics;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currentUserDisposable", "Lio/reactivex/disposables/Disposable;", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "shouldLoadNext", "", "getShouldLoadNext", "()Z", "setShouldLoadNext", "(Z)V", "destroy", "", "loadIssueHistory", "from", "to", TransactionField.STATUS, "page", "", "isLoading", "isNextLoading", "logOnIssueHistoryFilterClicked", "toDisputeIssueFragment", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueHistoryPresenter extends C9410b<IssueHistoryView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private FavoritesArrayAdapter currentUserDisposable;
    private final FetchTickets fetchTickets;
    private final IssueTypeHomeNavigator issueTypeHomeNavigator;
    private String phoneNumber;
    private boolean shouldLoadNext;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueHistoryPresenter(FetchCurrentUser fetchCurrentUser, FetchTickets fetchTickets, IssueTypeHomeNavigator issueTypeHomeNavigator, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(fetchTickets, "fetchTickets");
        Log_OC.getArray(issueTypeHomeNavigator, "issueTypeHomeNavigator");
        Log_OC.getArray(analytics, "analytics");
        this.currentUser = fetchCurrentUser;
        this.fetchTickets = fetchTickets;
        this.issueTypeHomeNavigator = issueTypeHomeNavigator;
        this.analytics = analytics;
        this.shouldLoadNext = true;
        this.phoneNumber = "";
        AbstractC11696w $r5 = FetchCurrentUser.execute$default(fetchCurrentUser, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueHistoryPresenter $r1 = IssueHistoryPresenter.this;
                User $r3 = (User) obj;
                IssueHistoryPresenter.m39386_init_$lambda0($r1, $r3);
            }
        };
        Token $r7 = Token.EMPTY;
        FavoritesArrayAdapter $r8 = $r5.s(object, $r7);
        this.currentUserDisposable = $r8;
        C11280b $r9 = new C11280b();
        this.compositeDisposable = $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0 */
    public static final void m39386_init_$lambda0(IssueHistoryPresenter issueHistoryPresenter, User user) {
        Log_OC.getArray(issueHistoryPresenter, "this$0");
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        issueHistoryPresenter.setPhoneNumber($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void loadIssueHistory$default(IssueHistoryPresenter issueHistoryPresenter, String $r1, String $r2, String $r3, int $i0, boolean $z0, boolean $z1, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $r1 = "";
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $r2 = "";
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $r3 = "";
        }
        int $i24 = i & 8;
        if ($i24 != 0) {
            $i0 = 1;
        }
        int $i25 = i & 16;
        if ($i25 != 0) {
            $z0 = false;
        }
        int $i1 = i & 32;
        if ($i1 != 0) {
            $z1 = false;
        }
        issueHistoryPresenter.loadIssueHistory($r1, $r2, $r3, $i0, $z0, $z1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadIssueHistory$lambda-11 */
    public static final void m39388loadIssueHistory$lambda11(IssueHistoryPresenter issueHistoryPresenter, final int i, final Throwable th) {
        Log_OC.getArray(issueHistoryPresenter, "this$0");
        th.printStackTrace();
        issueHistoryPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.AdapterHelper
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onItemRangeChanged(Object obj) {
                Throwable $r1 = th;
                int $i0 = i;
                IssueHistoryView $r3 = (IssueHistoryView) obj;
                IssueHistoryPresenter.m39389loadIssueHistory$lambda11$lambda10($r1, $i0, $r3);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadIssueHistory$lambda-11$lambda-10 */
    public static final void m39389loadIssueHistory$lambda11$lambda10(Throwable th, int i, IssueHistoryView issueHistoryView) {
        Log_OC.getArray(issueHistoryView, "view");
        issueHistoryView.hideLoading();
        issueHistoryView.hideNextLoading();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "err");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        issueHistoryView.showErrorMessage($r4, i);
    }

    /* renamed from: loadIssueHistory$lambda-2 */
    public static final void m39390loadIssueHistory$lambda2(IssueHistoryView issueHistoryView) {
        Log_OC.getArray(issueHistoryView, "it");
        issueHistoryView.showLoading();
    }

    /* renamed from: loadIssueHistory$lambda-3 */
    public static final void m39391loadIssueHistory$lambda3(IssueHistoryView issueHistoryView) {
        Log_OC.getArray(issueHistoryView, "it");
        issueHistoryView.showNextLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadIssueHistory$lambda-5 */
    public static final InterfaceC11692s m39392loadIssueHistory$lambda5(IssueHistoryPresenter issueHistoryPresenter, int i, String str, String str2, String str3, User user) {
        Log_OC.getArray(issueHistoryPresenter, "this$0");
        Log_OC.getArray(str, "$from");
        Log_OC.getArray(str2, "$to");
        Log_OC.getArray(str3, "$status");
        Log_OC.getArray(user, "user");
        FetchTickets $r5 = issueHistoryPresenter.fetchTickets;
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "user.sessionId");
        FetchRequest $r7 = new FetchRequest(null, 1, null);
        String $r8 = String.valueOf(i);
        $r7.setPage($r8);
        $r7.setFrom(str);
        $r7.setTo(str2);
        $r7.setStatus(str3);
        C13666w c13666w = C13666w.f30112a;
        AbstractC11688p $r10 = $r5.execute($r6, $r7);
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadIssueHistory$lambda-9 */
    public static final void m39393loadIssueHistory$lambda9(boolean z, IssueHistoryPresenter issueHistoryPresenter, boolean z2, final int i, final List list) {
        Log_OC.getArray(issueHistoryPresenter, "this$0");
        Log_OC.getArray(list, "issues");
        if (z) {
            Name $r2 = Name.empty;
            issueHistoryPresenter.ifViewAttached($r2);
        }
        if (z2) {
            Compression $r3 = Compression.METADATA;
            issueHistoryPresenter.ifViewAttached($r3);
        }
        boolean $z1 = list.isEmpty();
        if ($z1) {
            issueHistoryPresenter.setShouldLoadNext(false);
        }
        issueHistoryPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                List $r1 = list;
                int $i0 = i;
                IssueHistoryView $r32 = (IssueHistoryView) obj;
                IssueHistoryPresenter.m39396loadIssueHistory$lambda9$lambda8($r1, $i0, $r32);
            }
        });
    }

    /* renamed from: loadIssueHistory$lambda-9$lambda-6 */
    public static final void m39394loadIssueHistory$lambda9$lambda6(IssueHistoryView issueHistoryView) {
        Log_OC.getArray(issueHistoryView, "it");
        issueHistoryView.hideLoading();
    }

    /* renamed from: loadIssueHistory$lambda-9$lambda-7 */
    public static final void m39395loadIssueHistory$lambda9$lambda7(IssueHistoryView issueHistoryView) {
        Log_OC.getArray(issueHistoryView, "it");
        issueHistoryView.hideNextLoading();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadIssueHistory$lambda-9$lambda-8 */
    public static final void m39396loadIssueHistory$lambda9$lambda8(List list, int i, IssueHistoryView issueHistoryView) {
        Log_OC.getArray(list, "$issues");
        Log_OC.getArray(issueHistoryView, "view");
        boolean $z0 = i != 1;
        issueHistoryView.showIssueList(list, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        FavoritesArrayAdapter $r1 = this.currentUserDisposable;
        if ($r1 != null) {
            $r1.backup();
        }
        C11280b $r2 = this.compositeDisposable;
        $r2.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
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
    public final void loadIssueHistory(final String str, final String str2, final String str3, final int i, final boolean z, final boolean z2) {
        Log_OC.getArray(str, "from");
        Log_OC.getArray(str2, "to");
        Log_OC.getArray(str3, TransactionField.STATUS);
        boolean $z2 = this.shouldLoadNext;
        if ($z2 || i == 1) {
            if (z) {
                C0257c $r5 = C0257c.f445d;
                ifViewAttached($r5);
            }
            if (z2) {
                Target $r6 = Target.f435a;
                ifViewAttached($r6);
            }
            FetchCurrentUser $r7 = this.currentUser;
            AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
            AbstractC11688p $r9 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.issues.presenters.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    IssueHistoryPresenter $r1 = IssueHistoryPresenter.this;
                    int $i0 = i;
                    String $r2 = str;
                    String $r3 = str2;
                    String $r4 = str3;
                    User $r72 = (User) obj;
                    InterfaceC11692s $r52 = IssueHistoryPresenter.m39392loadIssueHistory$lambda5($r1, $i0, $r2, $r3, $r4, $r72);
                    return $r52;
                }
            });
            FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.issues.presenters.ClassWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    boolean $z0 = z;
                    IssueHistoryPresenter $r1 = this;
                    boolean $z1 = z2;
                    int $i0 = i;
                    List $r3 = (List) obj;
                    IssueHistoryPresenter.m39393loadIssueHistory$lambda9($z0, $r1, $z1, $i0, $r3);
                }
            }, new Object() { // from class: ai.kudi.agent.issues.presenters.LayoutManager
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    IssueHistoryPresenter $r1 = IssueHistoryPresenter.this;
                    int $i0 = i;
                    Throwable $r3 = (Throwable) obj;
                    IssueHistoryPresenter.m39388loadIssueHistory$lambda11($r1, $i0, $r3);
                }
            });
            Log_OC.loadImage($r12, "currentUser.execute()\n            .flatMapObservable { user: User ->\n                fetchTickets.execute(\n                    user.sessionId,\n                    FetchRequest().apply {\n                        this.page = page.toString()\n                        this.from = from\n                        this.to = to\n                        this.status = status\n                    }\n                )\n            }\n            .subscribe(\n                { issues: List<Issue.Ticket> ->\n                    if (isLoading) {\n                        ifViewAttached {\n                            it.hideLoading()\n                        }\n                    }\n                    if (isNextLoading) {\n                        ifViewAttached {\n                            it.hideNextLoading()\n                        }\n                    }\n                    if (issues.isEmpty()) {\n                        shouldLoadNext = false\n                    }\n                    ifViewAttached { view ->\n                        view.showIssueList(issues, page != 1)\n                    }\n                },\n                { err ->\n                    err.printStackTrace()\n                    ifViewAttached { view ->\n                        view.hideLoading()\n                        view.hideNextLoading()\n                        view.showErrorMessage(\n                            parseHttpError2(\n                                \"Something went wrong\"\n                            )(err),\n                            page\n                        )\n                    }\n                }\n            )");
            C11280b $r13 = this.compositeDisposable;
            RxExtKt.addTo($r12, $r13);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logOnIssueHistoryFilterClicked() {
        Analytics $r1 = this.analytics;
        String $r2 = this.phoneNumber;
        $r1.onIssueHistoryFilterClicked($r2);
    }

    public final void setPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNumber = str;
    }

    public final void setShouldLoadNext(boolean z) {
        this.shouldLoadNext = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toDisputeIssueFragment(Issue.Ticket ticket) {
        Log_OC.getArray(ticket, "ticket");
        Analytics $r3 = this.analytics;
        String $r2 = this.phoneNumber;
        $r3.onIssueHistorySelected($r2);
        IssueTypeHomeNavigator $r4 = this.issueTypeHomeNavigator;
        $r4.toDisputeIssueFragment(ticket);
    }
}
