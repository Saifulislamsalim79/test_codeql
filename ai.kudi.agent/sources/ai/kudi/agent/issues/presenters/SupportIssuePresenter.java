package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.views.SupportIssueView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: SupportIssuePresenter.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/issues/presenters/SupportIssuePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/issues/views/SupportIssueView;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/issues/navigators/IssueTypeNavigator;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "logEventOnHelpfulIssueButtonClicked", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "logEventOnUnHelpfulIssueButtonClicked", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SupportIssuePresenter extends C9410b<SupportIssueView> {
    private final Analytics analytics;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private final IssueTypeNavigator issueTypeNavigator;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SupportIssuePresenter(IssueTypeNavigator issueTypeNavigator, Analytics analytics, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigator");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        this.issueTypeNavigator = issueTypeNavigator;
        this.analytics = analytics;
        this.currentUser = fetchCurrentUser;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logEventOnHelpfulIssueButtonClicked$lambda-0  reason: not valid java name */
    public static final void m39434logEventOnHelpfulIssueButtonClicked$lambda0(SupportIssuePresenter supportIssuePresenter, IssueTypeModel issueTypeModel, User user) {
        Log_OC.getArray(supportIssuePresenter, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        Analytics $r2 = supportIssuePresenter.analytics;
        String $r4 = issueTypeModel.getTransactionType();
        if ($r4 == null) {
            $r4 = "";
        }
        String $r5 = issueTypeModel.getAmount();
        if ($r5 == null) {
            $r5 = "";
        }
        Analytics.DefaultImpls.onHelpYesButtonClickedEvent$default($r2, $r4, null, $r5, user, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logEventOnUnHelpfulIssueButtonClicked$lambda-2  reason: not valid java name */
    public static final void m39436logEventOnUnHelpfulIssueButtonClicked$lambda2(SupportIssuePresenter supportIssuePresenter, IssueTypeModel issueTypeModel, User user) {
        Log_OC.getArray(supportIssuePresenter, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        Analytics $r2 = supportIssuePresenter.analytics;
        String $r4 = issueTypeModel.getTransactionType();
        if ($r4 == null) {
            $r4 = "";
        }
        String $r5 = issueTypeModel.getAmount();
        if ($r5 == null) {
            $r5 = "";
        }
        Analytics.DefaultImpls.onHelpNosButtonClickedEvent$default($r2, $r4, null, $r5, user, 2, null);
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
    public final void logEventOnHelpfulIssueButtonClicked(final IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        FetchCurrentUser $r2 = this.currentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.DynamicTableModel$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SupportIssuePresenter $r1 = SupportIssuePresenter.this;
                IssueTypeModel $r22 = issueTypeModel;
                User $r43 = (User) obj;
                SupportIssuePresenter.m39434logEventOnHelpfulIssueButtonClicked$lambda0($r1, $r22, $r43);
            }
        };
        Node $r6 = Node._Parent;
        FavoritesArrayAdapter $r7 = $r33.s(object, $r6);
        Log_OC.loadImage($r7, "currentUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onHelpYesButtonClickedEvent(\n                        type = issueTypeModel.transactionType ?: \"\",\n                        amount = issueTypeModel.amount ?: \"\",\n                        user = it\n                    )\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logEventOnUnHelpfulIssueButtonClicked(final IssueTypeModel issueTypeModel) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        FetchCurrentUser $r2 = this.currentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        p425j.p444e.Item $r4 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        p425j.p444e.Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.NameFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SupportIssuePresenter $r1 = SupportIssuePresenter.this;
                IssueTypeModel $r22 = issueTypeModel;
                User $r43 = (User) obj;
                SupportIssuePresenter.m39436logEventOnUnHelpfulIssueButtonClicked$lambda2($r1, $r22, $r43);
            }
        };
        Message$RecipientType $r6 = Message$RecipientType.f415TO;
        FavoritesArrayAdapter $r7 = $r33.s(object, $r6);
        Log_OC.loadImage($r7, "currentUser.execute()\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onHelpNosButtonClickedEvent(\n                        type = issueTypeModel.transactionType ?: \"\",\n                        amount = issueTypeModel.amount ?: \"\",\n                        user = it\n                    )\n                },\n                {\n                    it.printStackTrace()\n                }\n            )");
        C11280b $r8 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r8);
    }
}
