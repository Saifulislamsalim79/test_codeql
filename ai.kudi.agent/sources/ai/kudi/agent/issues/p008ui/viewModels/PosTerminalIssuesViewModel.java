package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalyticsKt;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.domain.CreateTicket;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.p008ui.viewModels.data.PosTerminalIssuesViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: PosTerminalIssuesViewModel.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/PosTerminalIssuesViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/PosTerminalIssuesViewData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "createTicket", "Lai/kudi/agent/issues/domain/CreateTicket;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/issues/domain/CreateTicket;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/issues/navigators/IssueTypeNavigator;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "getCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getIssueTypeNavigator", "()Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "phoneNo", "", "checkStatus", "", "ticket", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "getTitle", "description", "initialData", "logEventOnSubmitIssueButtonClicked", TransactionField.STATUS, "submitIssue", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "comment", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.PosTerminalIssuesViewModel */
/* loaded from: classes.dex */
public final class PosTerminalIssuesViewModel extends BaseViewModel<PosTerminalIssuesViewData> {
    private final Analytics analytics;
    private final CreateTicket createTicket;
    private final FetchCurrentUser currentUser;
    private final IssueTypeNavigator issueTypeNavigator;
    private String phoneNo;

    public PosTerminalIssuesViewModel(FetchCurrentUser fetchCurrentUser, CreateTicket createTicket, Analytics analytics, IssueTypeNavigator issueTypeNavigator) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(createTicket, "createTicket");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigator");
        this.currentUser = fetchCurrentUser;
        this.createTicket = createTicket;
        this.analytics = analytics;
        this.issueTypeNavigator = issueTypeNavigator;
        this.phoneNo = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEventOnSubmitIssueButtonClicked(String str, String str2) {
        Analytics $r3 = this.analytics;
        $r3.onSubmitIssueClicked(str2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39544submitIssue$lambda0(PosTerminalIssuesViewModel posTerminalIssuesViewModel, IssueTypeModel issueTypeModel, User user) {
        Log_OC.getArray(posTerminalIssuesViewModel, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        Log_OC.getArray(user, "user");
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "user.phoneNumber");
        posTerminalIssuesViewModel.phoneNo = $r3;
        issueTypeModel.setTerminalId(user.getTerminalId());
        CreateTicket $r4 = posTerminalIssuesViewModel.createTicket;
        String $r32 = user.getSessionId();
        Log_OC.loadImage($r32, "user.sessionId");
        AbstractC11688p $r5 = $r4.execute(issueTypeModel, $r32);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-1  reason: not valid java name */
    public static final void m39545submitIssue$lambda1(PosTerminalIssuesViewModel posTerminalIssuesViewModel, Issue issue) {
        Log_OC.getArray(posTerminalIssuesViewModel, "this$0");
        ViewData $r2 = posTerminalIssuesViewModel.getState();
        PosTerminalIssuesViewData $r3 = (PosTerminalIssuesViewData) $r2;
        posTerminalIssuesViewModel.publish(PosTerminalIssuesViewData.copy$default($r3, false, false, issue, null, 10, null));
        String $r4 = posTerminalIssuesViewModel.phoneNo;
        posTerminalIssuesViewModel.logEventOnSubmitIssueButtonClicked($r4, IssueResolutionAnalyticsKt.STATUS_SUCCESS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-2  reason: not valid java name */
    public static final void m39546submitIssue$lambda2(PosTerminalIssuesViewModel posTerminalIssuesViewModel, Throwable th) {
        Log_OC.getArray(posTerminalIssuesViewModel, "this$0");
        String $r3 = posTerminalIssuesViewModel.phoneNo;
        posTerminalIssuesViewModel.logEventOnSubmitIssueButtonClicked($r3, IssueResolutionAnalyticsKt.STATUS_FAILURE);
        th.printStackTrace();
        ViewData $r4 = posTerminalIssuesViewModel.getState();
        PosTerminalIssuesViewData $r5 = (PosTerminalIssuesViewData) $r4;
        PosTerminalIssuesViewData.Error $r1 = new PosTerminalIssuesViewData.Error("Something went wrong. Please try again");
        posTerminalIssuesViewModel.publish(PosTerminalIssuesViewData.copy$default($r5, false, false, null, $r1, 6, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkStatus(Issue.Ticket ticket) {
        IssueTypeNavigator $r2 = this.issueTypeNavigator;
        $r2.toDisputeView(ticket);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
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
    public final IssueTypeNavigator getIssueTypeNavigator() {
        IssueTypeNavigator r1 = this.issueTypeNavigator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTitle(String str) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        Log_OC.getArray(str, "description");
        $z0 = C13277t.m5421J(str, "Routing Error", false, 2, null);
        if ($z0) {
            return "Routing Error";
        }
        $z02 = C13277t.m5421J(str, "PED tampered", false, 2, null);
        if ($z02) {
            return "PED tampered";
        }
        $z03 = C13277t.m5421J(str, "MENU LOCK", false, 2, null);
        if ($z03) {
            return "MENU LOCK";
        }
        $z04 = C13277t.m5421J(str, "TMK BUFFER", false, 2, null);
        if ($z04) {
            return "TMK BUFFER";
        }
        $z05 = C13277t.m5421J(str, "Unpacking Response", false, 2, null);
        return $z05 ? "Unpacking Response" : str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        PosTerminalIssuesViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public PosTerminalIssuesViewData initialData() {
        PosTerminalIssuesViewData $r1 = new PosTerminalIssuesViewData(false, false, null, null, 15, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitIssue(final IssueTypeModel issueTypeModel, String str) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        Log_OC.getArray(str, "comment");
        ViewData $r3 = getState();
        PosTerminalIssuesViewData $r4 = (PosTerminalIssuesViewData) $r3;
        publish(PosTerminalIssuesViewData.copy$default($r4, true, false, null, null, 14, null));
        FetchCurrentUser $r5 = this.currentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        AbstractC11688p $r8 = $r6.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.issues.ui.viewModels.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                PosTerminalIssuesViewModel $r1 = PosTerminalIssuesViewModel.this;
                IssueTypeModel $r2 = issueTypeModel;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = PosTerminalIssuesViewModel.m39544submitIssue$lambda0($r1, $r2, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosTerminalIssuesViewModel $r1 = PosTerminalIssuesViewModel.this;
                Issue $r32 = (Issue) obj;
                PosTerminalIssuesViewModel.m39545submitIssue$lambda1($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PosTerminalIssuesViewModel $r1 = PosTerminalIssuesViewModel.this;
                Throwable $r32 = (Throwable) obj;
                PosTerminalIssuesViewModel.m39546submitIssue$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r11, "currentUser.execute()\n            .flatMapObservable { user: User ->\n                phoneNo = user.phoneNumber\n                issueTypeModel.terminalId = user.terminalId\n                createTicket.execute(\n                    issueTypeModel,\n                    user.sessionId\n                )\n            }.subscribe(\n                {\n                    publish(state.copy(isSubmitting = false, issue = it))\n                    logEventOnSubmitIssueButtonClicked(\n                        phoneNo = phoneNo,\n                        status = STATUS_SUCCESS\n                    )\n                },\n                {\n                    logEventOnSubmitIssueButtonClicked(\n                        phoneNo = phoneNo,\n                        status = STATUS_FAILURE\n                    )\n                    it.printStackTrace()\n                    publish(\n                        state.copy(\n                            isSubmitting = false,\n                            error = PosTerminalIssuesViewData.Error(\"Something went wrong. Please try again\")\n                        )\n                    )\n                }\n            )");
        C11280b $r12 = getCompositeDisposable();
        RxExtKt.addTo($r11, $r12);
    }
}
