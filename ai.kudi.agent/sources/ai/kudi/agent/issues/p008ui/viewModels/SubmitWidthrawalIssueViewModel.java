package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.bills.data.BillerKt;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.domain.CreateTicket;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.p008ui.viewModels.data.SubmitWithdrawalIssueViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: SubmitWidthrawalIssueViewModel.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J.\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJR\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/SubmitWidthrawalIssueViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/SubmitWithdrawalIssueViewData;", "submitTicket", "Lai/kudi/agent/issues/domain/CreateTicket;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "(Lai/kudi/agent/issues/domain/CreateTicket;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/issues/navigators/IssueTypeNavigator;)V", "initialData", "isAmountNotValid", "", TransactionField.AMOUNT, "", "isInputValid", "transactionDate", "firstSixCard", "lastFourCard", "rrn", "submitIssue", "", KudiPin.KUDI_PIN_TITLE, "label", "issueId", "transactionTime", "Companion", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.SubmitWidthrawalIssueViewModel */
/* loaded from: classes.dex */
public final class SubmitWidthrawalIssueViewModel extends BaseViewModel<SubmitWithdrawalIssueViewData> {
    public static final Companion Companion;
    private static final int MAX_INTEGER = Integer.MAX_VALUE;
    private static final long MAX_LONG = Long.MAX_VALUE;
    private final FetchCurrentUser currentUser;
    private final IssueTypeNavigator issueTypeNavigator;
    private final CreateTicket submitTicket;

    /* compiled from: SubmitWidthrawalIssueViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/SubmitWidthrawalIssueViewModel$Companion;", "", "()V", "MAX_INTEGER", "", "MAX_LONG", "", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.viewModels.SubmitWidthrawalIssueViewModel$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public SubmitWidthrawalIssueViewModel(CreateTicket createTicket, FetchCurrentUser fetchCurrentUser, IssueTypeNavigator issueTypeNavigator) {
        Log_OC.getArray(createTicket, "submitTicket");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigator");
        this.submitTicket = createTicket;
        this.currentUser = fetchCurrentUser;
        this.issueTypeNavigator = issueTypeNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isAmountNotValid(String str) {
        try {
            boolean $z0 = StringExtKt.isDigit(str);
            if ($z0) {
                int $i0 = Integer.parseInt(str);
                return $i0 > MAX_INTEGER;
            }
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void submitIssue$default(SubmitWidthrawalIssueViewModel submitWidthrawalIssueViewModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String $r9, int i, Object obj) {
        int $i0 = i & 256;
        if ($i0 != 0) {
            $r9 = null;
        }
        submitWidthrawalIssueViewModel.submitIssue(str, str2, str3, str4, str5, str6, str7, str8, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39553submitIssue$lambda0(IssueTypeModel issueTypeModel, SubmitWidthrawalIssueViewModel submitWidthrawalIssueViewModel, User user) {
        Log_OC.getArray(issueTypeModel, "$input");
        Log_OC.getArray(submitWidthrawalIssueViewModel, "this$0");
        Log_OC.getArray(user, "user");
        issueTypeModel.setTerminalId(user.getTerminalId());
        CreateTicket $r4 = submitWidthrawalIssueViewModel.submitTicket;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "user.sessionId");
        AbstractC11688p $r5 = $r4.execute(issueTypeModel, $r3);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-1  reason: not valid java name */
    public static final void m39554submitIssue$lambda1(SubmitWidthrawalIssueViewModel submitWidthrawalIssueViewModel, Issue issue) {
        Log_OC.getArray(submitWidthrawalIssueViewModel, "this$0");
        ViewData $r2 = submitWidthrawalIssueViewModel.getState();
        SubmitWithdrawalIssueViewData $r3 = (SubmitWithdrawalIssueViewData) $r2;
        Issue.Ticket $r4 = issue.getBoxOfficeResponse();
        submitWidthrawalIssueViewModel.publish(SubmitWithdrawalIssueViewData.copy$default($r3, false, $r4, null, 4, null));
        IssueTypeNavigator $r5 = submitWidthrawalIssueViewModel.issueTypeNavigator;
        SubmitWidthrawalIssueViewModel$submitIssue$2$1 $r6 = new SubmitWidthrawalIssueViewModel$submitIssue$2$1(submitWidthrawalIssueViewModel, issue);
        $r5.showTicketResponse("Issue Submitted", "We will get back to you", "Check Status", true, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-2  reason: not valid java name */
    public static final void m39555submitIssue$lambda2(SubmitWidthrawalIssueViewModel submitWidthrawalIssueViewModel, Throwable th) {
        Log_OC.getArray(submitWidthrawalIssueViewModel, "this$0");
        ViewData $r2 = submitWidthrawalIssueViewModel.getState();
        SubmitWithdrawalIssueViewData $r3 = (SubmitWithdrawalIssueViewData) $r2;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Something went wrong, please retry", null, 2, null);
        Log_OC.loadImage(th, "err");
        Object $r6 = $r5.invoke(th);
        SubmitWithdrawalIssueViewData.Error $r4 = new SubmitWithdrawalIssueViewData.Error((String) $r6, null, null, null, null, null, 62, null);
        submitWidthrawalIssueViewModel.publish(SubmitWithdrawalIssueViewData.copy$default($r3, false, null, $r4, 2, null));
        th.printStackTrace();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        SubmitWithdrawalIssueViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public SubmitWithdrawalIssueViewData initialData() {
        SubmitWithdrawalIssueViewData $r1 = new SubmitWithdrawalIssueViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isInputValid(String str, String str2, String str3, String str4, String str5) throws NumberFormatException {
        Log_OC.getArray(str, TransactionField.AMOUNT);
        Log_OC.getArray(str2, "transactionDate");
        Log_OC.getArray(str3, "firstSixCard");
        Log_OC.getArray(str4, "lastFourCard");
        Log_OC.getArray(str5, "rrn");
        int $i0 = str.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            ViewData $r6 = getState();
            SubmitWithdrawalIssueViewData $r7 = (SubmitWithdrawalIssueViewData) $r6;
            SubmitWithdrawalIssueViewData.Error $r8 = new SubmitWithdrawalIssueViewData.Error(null, "Amount cannot be empty", null, null, null, null, 61, null);
            publish(SubmitWithdrawalIssueViewData.copy$default($r7, false, null, $r8, 3, null));
            return false;
        }
        boolean $z02 = isAmountNotValid(str);
        if ($z02) {
            ViewData $r62 = getState();
            SubmitWithdrawalIssueViewData $r72 = (SubmitWithdrawalIssueViewData) $r62;
            SubmitWithdrawalIssueViewData.Error $r82 = new SubmitWithdrawalIssueViewData.Error(null, "Enter a valid transaction Amount", null, null, null, null, 61, null);
            publish(SubmitWithdrawalIssueViewData.copy$default($r72, false, null, $r82, 3, null));
            return false;
        }
        int $i02 = str2.length();
        boolean $z03 = $i02 == 0;
        if ($z03) {
            ViewData $r63 = getState();
            SubmitWithdrawalIssueViewData $r73 = (SubmitWithdrawalIssueViewData) $r63;
            SubmitWithdrawalIssueViewData.Error $r83 = new SubmitWithdrawalIssueViewData.Error(null, null, "Date cannot be empty", null, null, null, 59, null);
            publish(SubmitWithdrawalIssueViewData.copy$default($r73, false, null, $r83, 3, null));
            return false;
        }
        int $i03 = str3.length();
        boolean $z04 = $i03 == 0;
        if ($z04) {
            ViewData $r64 = getState();
            SubmitWithdrawalIssueViewData $r74 = (SubmitWithdrawalIssueViewData) $r64;
            SubmitWithdrawalIssueViewData.Error $r84 = new SubmitWithdrawalIssueViewData.Error(null, null, null, null, "First six digits of card cannot be empty", null, 47, null);
            publish(SubmitWithdrawalIssueViewData.copy$default($r74, false, null, $r84, 3, null));
            return false;
        }
        int $i04 = str3.length();
        if ($i04 != 6) {
            ViewData $r65 = getState();
            SubmitWithdrawalIssueViewData $r75 = (SubmitWithdrawalIssueViewData) $r65;
            SubmitWithdrawalIssueViewData.Error $r85 = new SubmitWithdrawalIssueViewData.Error(null, null, null, null, "Has to be 6 digits", null, 47, null);
            publish(SubmitWithdrawalIssueViewData.copy$default($r75, false, null, $r85, 3, null));
            return false;
        }
        int $i05 = str4.length();
        boolean $z05 = $i05 == 0;
        if ($z05) {
            ViewData $r66 = getState();
            SubmitWithdrawalIssueViewData $r76 = (SubmitWithdrawalIssueViewData) $r66;
            SubmitWithdrawalIssueViewData.Error $r86 = new SubmitWithdrawalIssueViewData.Error(null, null, null, null, null, "Amount cannot be empty", 31, null);
            publish(SubmitWithdrawalIssueViewData.copy$default($r76, false, null, $r86, 3, null));
            return false;
        }
        int $i06 = str4.length();
        if ($i06 != 4) {
            ViewData $r67 = getState();
            SubmitWithdrawalIssueViewData $r77 = (SubmitWithdrawalIssueViewData) $r67;
            SubmitWithdrawalIssueViewData.Error $r87 = new SubmitWithdrawalIssueViewData.Error(null, null, null, null, null, "Legth has to be 4 digits", 31, null);
            publish(SubmitWithdrawalIssueViewData.copy$default($r77, false, null, $r87, 3, null));
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void submitIssue(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Log_OC.getArray(str, TransactionField.AMOUNT);
        Log_OC.getArray(str2, "transactionDate");
        Log_OC.getArray(str3, "firstSixCard");
        Log_OC.getArray(str4, "lastFourCard");
        Log_OC.getArray(str5, "rrn");
        Log_OC.getArray(str6, KudiPin.KUDI_PIN_TITLE);
        Log_OC.getArray(str7, "label");
        Log_OC.getArray(str8, "issueId");
        boolean $z0 = isInputValid(str, str2, str3, str4, str5);
        if ($z0) {
            ViewData $r10 = getState();
            SubmitWithdrawalIssueViewData $r11 = SubmitWithdrawalIssueViewData.copy$default((SubmitWithdrawalIssueViewData) $r10, true, null, null, 2, null);
            publish($r11);
            final IssueTypeModel $r12 = new IssueTypeModel(str6, BillerKt.NAMEPROMPT_NA, BillerKt.NAMEPROMPT_NA, str, str7, str8, str2, null, str5, str3, str4, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1920, 31, null);
            FetchCurrentUser $r13 = this.currentUser;
            AbstractC11696w $r14 = FetchCurrentUser.execute$default($r13, null, null, 3, null);
            AbstractC11688p $r16 = $r14.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.issues.ui.viewModels.Attribute
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    IssueTypeModel $r1 = IssueTypeModel.this;
                    SubmitWidthrawalIssueViewModel $r2 = this;
                    User $r5 = (User) obj;
                    InterfaceC11692s $r3 = SubmitWidthrawalIssueViewModel.m39553submitIssue$lambda0($r1, $r2, $r5);
                    return $r3;
                }
            });
            FavoritesArrayAdapter $r19 = $r16.e0(new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.Composer
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    SubmitWidthrawalIssueViewModel $r1 = SubmitWidthrawalIssueViewModel.this;
                    Issue $r3 = (Issue) obj;
                    SubmitWidthrawalIssueViewModel.m39554submitIssue$lambda1($r1, $r3);
                }
            }, new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.ToContainsFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    SubmitWidthrawalIssueViewModel $r1 = SubmitWidthrawalIssueViewModel.this;
                    Throwable $r3 = (Throwable) obj;
                    SubmitWidthrawalIssueViewModel.m39555submitIssue$lambda2($r1, $r3);
                }
            });
            Log_OC.loadImage($r19, "currentUser.execute()\n                .flatMapObservable { user ->\n                    input.terminalId = user.terminalId\n                    submitTicket.execute(input, user.sessionId)\n                }\n                .subscribe(\n                    { issue ->\n                        publish(\n                            state.copy(\n                                isSubmittingIssue = false,\n                                issueSubmitted = issue.boxOfficeResponse\n                            )\n                        )\n                        issueTypeNavigator.showTicketResponse(\n                            titleText = \"Issue Submitted\", msgText = \"We will get back to you\",\n                            actionBtnText = \"Check Status\",\n                            shouldDismissImmediately = true\n                        ) {\n                            issueTypeNavigator.toDisputeView(issue.boxOfficeResponse)\n                        }\n                    },\n                    { err ->\n                        publish(\n                            state.copy(\n                                isSubmittingIssue = false, error =\n                                SubmitWithdrawalIssueViewData.Error(\n                                    parseHttpError2(\n                                        \"Something went wrong, please retry\"\n                                    )(err)\n                                )\n                            )\n                        )\n                        err.printStackTrace()\n                    }\n                )");
            C11280b $r20 = getCompositeDisposable();
            RxExtKt.addTo($r19, $r20);
        }
    }
}
