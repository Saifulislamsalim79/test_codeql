package ai.kudi.agent.issues.presenters;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalyticsKt;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.usecases.MultiPartFileHandling;
import ai.kudi.agent.issues.data.model.Issue;
import ai.kudi.agent.issues.domain.AttachImage;
import ai.kudi.agent.issues.domain.CreateTicket;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.views.SubmitIssueView;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: SubmitIssuePresenter.kt */
@Metadata(m10422d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0017J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u0002J0\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110 0$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0 H\u0002J,\u0010(\u001a\b\u0012\u0004\u0012\u00020)0$2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J,\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110 2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0 J8\u00100\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110 2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020'0 2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m10421d2 = {"Lai/kudi/agent/issues/presenters/SubmitIssuePresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/issues/views/SubmitIssueView;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "createTicket", "Lai/kudi/agent/issues/domain/CreateTicket;", "attachImage", "Lai/kudi/agent/issues/domain/AttachImage;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fileHandling", "Lai/kudi/agent/core/usecases/MultiPartFileHandling;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/issues/navigators/IssueTypeNavigator;Lai/kudi/agent/issues/domain/CreateTicket;Lai/kudi/agent/issues/domain/AttachImage;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/usecases/MultiPartFileHandling;Lai/kudi/agent/core/analytics/Analytics;)V", "TICKET_FILE_PART", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "ticketResponse", "Lai/kudi/agent/issues/data/model/Issue$Ticket;", "checkStatus", "", "ticket", "destroy", "logEventOnSubmitIssueButtonClicked", TransactionField.STATUS, "user", "Lai/kudi/agent/users/domain/dto/User;", "logOnIssueSummaryReached", "prepareParts", "", "Lokhttp3/MultipartBody$Part;", "filePathList", "scaleDownImages", "Lio/reactivex/Observable;", "pathList", "defaultCreatedFileList", "Ljava/io/File;", "submitImage", "Lai/kudi/agent/issues/data/model/Issue;", "ticketId", "sessionId", "fileParts", "submitIssue", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "submitTicketAndImage", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SubmitIssuePresenter extends C9410b<SubmitIssueView> {
    private final String TICKET_FILE_PART;
    private final Analytics analytics;
    private final AttachImage attachImage;
    private final C11280b compositeDisposable;
    private final CreateTicket createTicket;
    private final FetchCurrentUser currentUser;
    private final MultiPartFileHandling fileHandling;
    private final IssueTypeNavigator issueTypeNavigator;
    private Issue.Ticket ticketResponse;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SubmitIssuePresenter(IssueTypeNavigator issueTypeNavigator, CreateTicket createTicket, AttachImage attachImage, FetchCurrentUser fetchCurrentUser, MultiPartFileHandling multiPartFileHandling, Analytics analytics) {
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigator");
        Log_OC.getArray(createTicket, "createTicket");
        Log_OC.getArray(attachImage, "attachImage");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(multiPartFileHandling, "fileHandling");
        Log_OC.getArray(analytics, "analytics");
        this.issueTypeNavigator = issueTypeNavigator;
        this.createTicket = createTicket;
        this.attachImage = attachImage;
        this.currentUser = fetchCurrentUser;
        this.fileHandling = multiPartFileHandling;
        this.analytics = analytics;
        this.TICKET_FILE_PART = "files";
        C11280b $r7 = new C11280b();
        this.compositeDisposable = $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEventOnSubmitIssueButtonClicked(String str, User user) {
        Analytics $r2 = this.analytics;
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "user.phoneNumber");
        $r2.onSubmitIssueClicked($r3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logOnIssueSummaryReached$lambda-0  reason: not valid java name */
    public static final void m39414logOnIssueSummaryReached$lambda0(SubmitIssuePresenter submitIssuePresenter, User user) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Analytics $r3 = submitIssuePresenter.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onIssueSummaryPageReached($r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List prepareParts(java.util.List r10) {
        /*
            r9 = this;
            java.util.List r0 = kotlin.p557z.C13722p.m3941e()
            java.util.Iterator r1 = r10.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r4 = r5
            ai.kudi.agent.core.usecases.MultiPartFileHandling r6 = r9.fileHandling
            java.lang.String r7 = r9.TICKET_FILE_PART
            l.w$b r8 = r6.prepareFilePart(r4, r7)
            java.util.List r0 = kotlin.p557z.C13722p.m3920o0(r0, r8)
            goto L8
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.presenters.SubmitIssuePresenter.prepareParts(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x003f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final p425j.p444e.AbstractC11688p scaleDownImages(java.util.List r26, java.util.List r27) {
        /*
            r25 = this;
            r0 = r26
            int r3 = r0.size()
            r0 = r27
            int r4 = r0.size()
            int r3 = java.lang.Math.min(r3, r4)
            int r3 = r3 + (-1)
            r0 = r26
            boolean r5 = r0.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L88
            kotlin.i0.e r7 = new kotlin.i0.e
            r8 = r7
            r6 = 0
            r7.<init>(r6, r3)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = r9
            r12 = r8
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            r11 = r12
            r6 = 10
            int r3 = kotlin.p557z.C13722p.m3921o(r11, r6)
            r9.<init>(r3)
            r13 = r8
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r11 = r13
            java.util.Iterator r14 = r11.iterator()
        L3b:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L7a
            r16 = r14
            kotlin.z.l0 r16 = (kotlin.p557z.AbstractC13711l0) r16
            r15 = r16
            int r3 = r15.mo4069b()
            ai.kudi.agent.core.util.image.ImageScale$Companion r17 = ai.kudi.agent.core.util.image.ImageScale.Companion
            r0 = r26
            java.lang.Object r18 = r0.get(r3)
            r20 = r18
            java.lang.String r20 = (java.lang.String) r20
            r19 = r20
            r0 = r27
            java.lang.Object r18 = r0.get(r3)
            r22 = r18
            java.io.File r22 = (java.io.File) r22
            r21 = r22
            r0 = r17
            r1 = r19
            r2 = r21
            java.lang.String r19 = r0.scaleDownFile(r1, r2)
            r0 = r19
            kotlin.p483e0.p485d.Log_OC.append(r0)
            r0 = r19
            r10.add(r0)
            goto L3b
        L7a:
            j.e.p r23 = p425j.p444e.AbstractC11688p.m10532N(r10)
            java.lang.String r24 = "just(\n                (0..lastFileIndex).map { index ->\n                    ImageScale.scaleDownFile(pathList[index], defaultCreatedFileList[index])!!\n                }\n            )"
            r0 = r23
            r1 = r24
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r1)
            return r23
        L88:
            java.util.List r26 = kotlin.p557z.C13722p.m3941e()
            r0 = r26
            j.e.p r23 = p425j.p444e.AbstractC11688p.m10532N(r0)
            java.lang.String r24 = "just(emptyList())"
            r0 = r23
            r1 = r24
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r1)
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.presenters.SubmitIssuePresenter.scaleDownImages(java.util.List, java.util.List):j.e.p");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p submitImage(String str, String str2, List list) {
        AttachImage $r3 = this.attachImage;
        AbstractC11688p $r4 = $r3.execute(str2, str, list);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void submitIssue$default(SubmitIssuePresenter submitIssuePresenter, IssueTypeModel issueTypeModel, List $r4, List list, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r4 = C13726r.m3891e();
        }
        submitIssuePresenter.submitIssue(issueTypeModel, $r4, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-4  reason: not valid java name */
    public static final void m39416submitIssue$lambda4(final SubmitIssuePresenter submitIssuePresenter, final IssueTypeModel issueTypeModel, final List list, final List list2, final SubmitIssueView submitIssueView) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        Log_OC.getArray(list, "$filePathList");
        Log_OC.getArray(list2, "$defaultCreatedFileList");
        Log_OC.getArray(submitIssueView, "view");
        submitIssueView.showLoading();
        FetchCurrentUser $r5 = submitIssuePresenter.currentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        FavoritesArrayAdapter $r9 = $r6.s(new Object() { // from class: ai.kudi.agent.issues.presenters.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                IssueTypeModel $r1 = IssueTypeModel.this;
                SubmitIssuePresenter $r2 = submitIssuePresenter;
                List $r3 = list;
                List $r4 = list2;
                User $r62 = (User) obj;
                SubmitIssuePresenter.m39417submitIssue$lambda4$lambda2($r1, $r2, $r3, $r4, $r62);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.presenters.Call
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SubmitIssueView $r1 = SubmitIssueView.this;
                Throwable $r3 = (Throwable) obj;
                SubmitIssuePresenter.m39418submitIssue$lambda4$lambda3($r1, $r3);
            }
        });
        Log_OC.loadImage($r9, "currentUser.execute()\n                .subscribe(\n                    { user: User ->\n                        issueTypeModel.terminalId = user.terminalId\n                        submitTicketAndImage(\n                            user,\n                            filePathList,\n                            defaultCreatedFileList,\n                            issueTypeModel\n                        )\n                    },\n                    {\n                        it.printStackTrace()\n                        view.showErrorMsg(\n                            error = parseHttpError2(\"Something went wrong. Please try again\")(it)\n                        )\n                    }\n                )");
        C11280b $r10 = submitIssuePresenter.compositeDisposable;
        RxExtKt.addTo($r9, $r10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-4$lambda-2  reason: not valid java name */
    public static final void m39417submitIssue$lambda4$lambda2(IssueTypeModel issueTypeModel, SubmitIssuePresenter submitIssuePresenter, List list, List list2, User user) {
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(list, "$filePathList");
        Log_OC.getArray(list2, "$defaultCreatedFileList");
        Log_OC.getArray(user, "user");
        String $r5 = user.getTerminalId();
        issueTypeModel.setTerminalId($r5);
        submitIssuePresenter.submitTicketAndImage(user, list, list2, issueTypeModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitIssue$lambda-4$lambda-3  reason: not valid java name */
    public static final void m39418submitIssue$lambda4$lambda3(SubmitIssueView submitIssueView, Throwable th) {
        Log_OC.getArray(submitIssueView, "$view");
        th.printStackTrace();
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        submitIssueView.showErrorMsg($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void submitTicketAndImage(final User user, List list, List list2, final IssueTypeModel issueTypeModel) {
        boolean $z0 = list.isEmpty();
        if (!$z0) {
            AbstractC11688p $r7 = scaleDownImages(list, list2);
            FavoritesArrayAdapter $r10 = $r7.d0(new Object() { // from class: ai.kudi.agent.issues.presenters.Property
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    SubmitIssuePresenter $r1 = SubmitIssuePresenter.this;
                    User $r2 = user;
                    IssueTypeModel $r3 = issueTypeModel;
                    List $r5 = (List) obj;
                    SubmitIssuePresenter.m39419submitTicketAndImage$lambda18($r1, $r2, $r3, $r5);
                }
            });
            Log_OC.loadImage($r10, "scaleDownImages(filePathList, defaultCreatedFileList)\n                .subscribe { scaledList ->\n                    val files = prepareParts(filePathList = scaledList)\n                    if (ticketResponse != null) {\n                        submitImage(\n                            ticketId = ticketResponse!!.id,\n                            sessionId = user.sessionId,\n                            fileParts = files\n                        )\n                            .subscribe(\n                                { response: Issue ->\n                                    // update with most update response\n                                    ticketResponse = response.boxOfficeResponse\n                                    ifViewAttached { view ->\n                                        view.hideLoading()\n                                        view.showTicketResponse(\n                                            ticket = response.boxOfficeResponse\n                                        )\n                                    }\n                                    logEventOnSubmitIssueButtonClicked(\n                                        user = user,\n                                        status = STATUS_SUCCESS\n                                    )\n                                },\n                                {\n                                    ifViewAttached { view ->\n                                        view.hideLoading()\n                                        view.showErrorMsg(\n                                            error = \"Issue not submitted. Please try again...\"\n                                        )\n                                    }\n                                    logEventOnSubmitIssueButtonClicked(\n                                        user = user,\n                                        status = STATUS_FAILURE\n                                    )\n                                }\n                            ).addTo(compositeDisposable)\n                    } else {\n                        createTicket.execute(\n                            issueTypeModel,\n                            user.sessionId\n                        )\n                            .flatMap { response: Issue ->\n                                ticketResponse = response.boxOfficeResponse\n                                submitImage(\n                                    ticketId = response.boxOfficeResponse.id,\n                                    sessionId = user.sessionId,\n                                    fileParts = files\n                                )\n                            }\n                            .subscribe(\n                                { response: Issue ->\n                                    ifViewAttached { view ->\n                                        view.hideLoading()\n                                        view.showTicketResponse(\n                                            ticket = response.boxOfficeResponse\n                                        )\n                                    }\n                                    logEventOnSubmitIssueButtonClicked(\n                                        user = user,\n                                        status = STATUS_SUCCESS\n                                    )\n                                },\n                                {\n                                    ifViewAttached { view ->\n                                        view.hideLoading()\n                                        view.showErrorMsg(\n                                            error = \"Issue not submitted. Please try again...\"\n                                        )\n                                    }\n                                    logEventOnSubmitIssueButtonClicked(\n                                        user = user,\n                                        status = STATUS_FAILURE\n                                    )\n                                }\n                            ).addTo(compositeDisposable)\n                    }\n                }");
            C11280b $r11 = this.compositeDisposable;
            RxExtKt.addTo($r10, $r11);
            return;
        }
        CreateTicket $r5 = this.createTicket;
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "user.sessionId");
        AbstractC11688p $r72 = $r5.execute(issueTypeModel, $r6);
        FavoritesArrayAdapter $r102 = $r72.e0(new Object() { // from class: ai.kudi.agent.issues.presenters.Widget
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SubmitIssuePresenter $r1 = SubmitIssuePresenter.this;
                User $r2 = user;
                Issue $r4 = (Issue) obj;
                SubmitIssuePresenter.m39429submitTicketAndImage$lambda6($r1, $r2, $r4);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.presenters.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SubmitIssuePresenter $r1 = SubmitIssuePresenter.this;
                User $r2 = user;
                Throwable $r4 = (Throwable) obj;
                SubmitIssuePresenter.m39431submitTicketAndImage$lambda8($r1, $r2, $r4);
            }
        });
        Log_OC.loadImage($r102, "createTicket.execute(\n                issueTypeModel,\n                user.sessionId\n            ).subscribe(\n                { response: Issue ->\n                    ifViewAttached {\n                        it.hideLoading()\n                        it.showTicketResponse(ticket = response.boxOfficeResponse)\n                        logEventOnSubmitIssueButtonClicked(\n                            user = user,\n                            status = STATUS_SUCCESS\n                        )\n                    }\n                },\n                {\n                    Timber.i(\"Issue Error $it\")\n                    ifViewAttached { view ->\n                        view.hideLoading()\n                        view.showErrorMsg(\n                            error = \"Issue not submitted. Please try again...\"\n                        )\n                    }\n                    logEventOnSubmitIssueButtonClicked(\n                        user = user,\n                        status = STATUS_FAILURE\n                    )\n                }\n            )");
        C11280b $r112 = this.compositeDisposable;
        RxExtKt.addTo($r102, $r112);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void submitTicketAndImage$default(SubmitIssuePresenter submitIssuePresenter, User user, List $r3, List $r4, IssueTypeModel issueTypeModel, int i, Object obj) {
        int $i1 = i & 2;
        if ($i1 != 0) {
            $r3 = C13726r.m3891e();
        }
        int $i0 = i & 4;
        if ($i0 != 0) {
            $r4 = C13726r.m3891e();
        }
        submitIssuePresenter.submitTicketAndImage(user, $r3, $r4, issueTypeModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-18  reason: not valid java name */
    public static final void m39419submitTicketAndImage$lambda18(final SubmitIssuePresenter submitIssuePresenter, final User user, IssueTypeModel issueTypeModel, List list) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(issueTypeModel, "$issueTypeModel");
        Log_OC.loadImage(list, "scaledList");
        final List $r3 = submitIssuePresenter.prepareParts(list);
        Issue.Ticket $r4 = submitIssuePresenter.ticketResponse;
        if ($r4 == null) {
            CreateTicket $r12 = submitIssuePresenter.createTicket;
            String $r5 = user.getSessionId();
            Log_OC.loadImage($r5, "user.sessionId");
            AbstractC11688p $r7 = $r12.execute(issueTypeModel, $r5);
            FavoritesArrayAdapter $r10 = $r7.m10545A(new InterfaceC11291f() { // from class: ai.kudi.agent.issues.presenters.g
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.InterfaceC11291f
                /* renamed from: a */
                public final Object mo10663a(Object obj) {
                    SubmitIssuePresenter $r1 = SubmitIssuePresenter.this;
                    User $r2 = user;
                    List $r32 = $r3;
                    Issue $r6 = (Issue) obj;
                    InterfaceC11692s $r42 = SubmitIssuePresenter.m39424submitTicketAndImage$lambda18$lambda13($r1, $r2, $r32, $r6);
                    return $r42;
                }
            }).e0(new Object() { // from class: ai.kudi.agent.issues.presenters.SimpleXYSeries
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    SubmitIssuePresenter $r1 = SubmitIssuePresenter.this;
                    User $r2 = user;
                    Issue $r42 = (Issue) obj;
                    SubmitIssuePresenter.m39425submitTicketAndImage$lambda18$lambda15($r1, $r2, $r42);
                }
            }, new Object() { // from class: ai.kudi.agent.issues.presenters.AndFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    SubmitIssuePresenter $r1 = SubmitIssuePresenter.this;
                    User $r2 = user;
                    Throwable $r42 = (Throwable) obj;
                    SubmitIssuePresenter.m39427submitTicketAndImage$lambda18$lambda17($r1, $r2, $r42);
                }
            });
            Log_OC.loadImage($r10, "createTicket.execute(\n                            issueTypeModel,\n                            user.sessionId\n                        )\n                            .flatMap { response: Issue ->\n                                ticketResponse = response.boxOfficeResponse\n                                submitImage(\n                                    ticketId = response.boxOfficeResponse.id,\n                                    sessionId = user.sessionId,\n                                    fileParts = files\n                                )\n                            }\n                            .subscribe(\n                                { response: Issue ->\n                                    ifViewAttached { view ->\n                                        view.hideLoading()\n                                        view.showTicketResponse(\n                                            ticket = response.boxOfficeResponse\n                                        )\n                                    }\n                                    logEventOnSubmitIssueButtonClicked(\n                                        user = user,\n                                        status = STATUS_SUCCESS\n                                    )\n                                },\n                                {\n                                    ifViewAttached { view ->\n                                        view.hideLoading()\n                                        view.showErrorMsg(\n                                            error = \"Issue not submitted. Please try again...\"\n                                        )\n                                    }\n                                    logEventOnSubmitIssueButtonClicked(\n                                        user = user,\n                                        status = STATUS_FAILURE\n                                    )\n                                }\n                            )");
            C11280b $r11 = submitIssuePresenter.compositeDisposable;
            RxExtKt.addTo($r10, $r11);
            return;
        }
        Log_OC.append($r4);
        String $r52 = $r4.getId();
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "user.sessionId");
        AbstractC11688p $r72 = submitIssuePresenter.submitImage($r52, $r6, $r3);
        FavoritesArrayAdapter $r102 = $r72.e0(new Object() { // from class: ai.kudi.agent.issues.presenters.FromContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SubmitIssuePresenter $r1 = SubmitIssuePresenter.this;
                User $r2 = user;
                Issue $r42 = (Issue) obj;
                SubmitIssuePresenter.m39420submitTicketAndImage$lambda18$lambda10($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.issues.presenters.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SubmitIssuePresenter $r1 = SubmitIssuePresenter.this;
                User $r2 = user;
                Throwable $r42 = (Throwable) obj;
                SubmitIssuePresenter.m39422submitTicketAndImage$lambda18$lambda12($r1, $r2, $r42);
            }
        });
        Log_OC.loadImage($r102, "submitImage(\n                            ticketId = ticketResponse!!.id,\n                            sessionId = user.sessionId,\n                            fileParts = files\n                        )\n                            .subscribe(\n                                { response: Issue ->\n                                    // update with most update response\n                                    ticketResponse = response.boxOfficeResponse\n                                    ifViewAttached { view ->\n                                        view.hideLoading()\n                                        view.showTicketResponse(\n                                            ticket = response.boxOfficeResponse\n                                        )\n                                    }\n                                    logEventOnSubmitIssueButtonClicked(\n                                        user = user,\n                                        status = STATUS_SUCCESS\n                                    )\n                                },\n                                {\n                                    ifViewAttached { view ->\n                                        view.hideLoading()\n                                        view.showErrorMsg(\n                                            error = \"Issue not submitted. Please try again...\"\n                                        )\n                                    }\n                                    logEventOnSubmitIssueButtonClicked(\n                                        user = user,\n                                        status = STATUS_FAILURE\n                                    )\n                                }\n                            )");
        C11280b $r112 = submitIssuePresenter.compositeDisposable;
        RxExtKt.addTo($r102, $r112);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-10  reason: not valid java name */
    public static final void m39420submitTicketAndImage$lambda18$lambda10(SubmitIssuePresenter submitIssuePresenter, User user, final Issue issue) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(issue, "response");
        Issue.Ticket $r2 = issue.getBoxOfficeResponse();
        submitIssuePresenter.ticketResponse = $r2;
        submitIssuePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.BetterListFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onCreate(Object obj) {
                Issue $r1 = Issue.this;
                SubmitIssueView $r3 = (SubmitIssueView) obj;
                SubmitIssuePresenter.m39421submitTicketAndImage$lambda18$lambda10$lambda9($r1, $r3);
            }
        });
        submitIssuePresenter.logEventOnSubmitIssueButtonClicked(IssueResolutionAnalyticsKt.STATUS_SUCCESS, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-10$lambda-9  reason: not valid java name */
    public static final void m39421submitTicketAndImage$lambda18$lambda10$lambda9(Issue issue, SubmitIssueView submitIssueView) {
        Log_OC.getArray(issue, "$response");
        Log_OC.getArray(submitIssueView, "view");
        submitIssueView.hideLoading();
        Issue.Ticket $r1 = issue.getBoxOfficeResponse();
        submitIssueView.showTicketResponse($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-12  reason: not valid java name */
    public static final void m39422submitTicketAndImage$lambda18$lambda12(SubmitIssuePresenter submitIssuePresenter, User user, Throwable th) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        Position $r3 = Position.BOTTOM;
        submitIssuePresenter.ifViewAttached($r3);
        submitIssuePresenter.logEventOnSubmitIssueButtonClicked(IssueResolutionAnalyticsKt.STATUS_FAILURE, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-12$lambda-11  reason: not valid java name */
    public static final void m39423submitTicketAndImage$lambda18$lambda12$lambda11(SubmitIssueView submitIssueView) {
        Log_OC.getArray(submitIssueView, "view");
        submitIssueView.hideLoading();
        submitIssueView.showErrorMsg("Issue not submitted. Please try again...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-13  reason: not valid java name */
    public static final InterfaceC11692s m39424submitTicketAndImage$lambda18$lambda13(SubmitIssuePresenter submitIssuePresenter, User user, List list, Issue issue) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(list, "$files");
        Log_OC.getArray(issue, "response");
        Issue.Ticket $r4 = issue.getBoxOfficeResponse();
        submitIssuePresenter.ticketResponse = $r4;
        Issue.Ticket $r42 = issue.getBoxOfficeResponse();
        String $r5 = $r42.getId();
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "user.sessionId");
        AbstractC11688p $r7 = submitIssuePresenter.submitImage($r5, $r6, list);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-15  reason: not valid java name */
    public static final void m39425submitTicketAndImage$lambda18$lambda15(SubmitIssuePresenter submitIssuePresenter, User user, final Issue issue) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(issue, "response");
        submitIssuePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.News
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getIssue(Object obj) {
                Issue $r1 = Issue.this;
                SubmitIssueView $r3 = (SubmitIssueView) obj;
                SubmitIssuePresenter.m39426submitTicketAndImage$lambda18$lambda15$lambda14($r1, $r3);
            }
        });
        submitIssuePresenter.logEventOnSubmitIssueButtonClicked(IssueResolutionAnalyticsKt.STATUS_SUCCESS, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-15$lambda-14  reason: not valid java name */
    public static final void m39426submitTicketAndImage$lambda18$lambda15$lambda14(Issue issue, SubmitIssueView submitIssueView) {
        Log_OC.getArray(issue, "$response");
        Log_OC.getArray(submitIssueView, "view");
        submitIssueView.hideLoading();
        Issue.Ticket $r1 = issue.getBoxOfficeResponse();
        submitIssueView.showTicketResponse($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-17  reason: not valid java name */
    public static final void m39427submitTicketAndImage$lambda18$lambda17(SubmitIssuePresenter submitIssuePresenter, User user, Throwable th) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        Macro $r3 = Macro.IMAGE;
        submitIssuePresenter.ifViewAttached($r3);
        submitIssuePresenter.logEventOnSubmitIssueButtonClicked(IssueResolutionAnalyticsKt.STATUS_FAILURE, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitTicketAndImage$lambda-18$lambda-17$lambda-16  reason: not valid java name */
    public static final void m39428submitTicketAndImage$lambda18$lambda17$lambda16(SubmitIssueView submitIssueView) {
        Log_OC.getArray(submitIssueView, "view");
        submitIssueView.hideLoading();
        submitIssueView.showErrorMsg("Issue not submitted. Please try again...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-6  reason: not valid java name */
    public static final void m39429submitTicketAndImage$lambda6(final SubmitIssuePresenter submitIssuePresenter, final User user, final Issue issue) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(issue, "response");
        submitIssuePresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.issues.presenters.ISAACEngine
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void reset(Object obj) {
                Issue $r1 = Issue.this;
                SubmitIssuePresenter $r2 = submitIssuePresenter;
                User $r3 = user;
                SubmitIssueView $r5 = (SubmitIssueView) obj;
                SubmitIssuePresenter.m39430submitTicketAndImage$lambda6$lambda5($r1, $r2, $r3, $r5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-6$lambda-5  reason: not valid java name */
    public static final void m39430submitTicketAndImage$lambda6$lambda5(Issue issue, SubmitIssuePresenter submitIssuePresenter, User user, SubmitIssueView submitIssueView) {
        Log_OC.getArray(issue, "$response");
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        Log_OC.getArray(submitIssueView, "it");
        submitIssueView.hideLoading();
        Issue.Ticket $r3 = issue.getBoxOfficeResponse();
        submitIssueView.showTicketResponse($r3);
        submitIssuePresenter.logEventOnSubmitIssueButtonClicked(IssueResolutionAnalyticsKt.STATUS_SUCCESS, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: submitTicketAndImage$lambda-8  reason: not valid java name */
    public static final void m39431submitTicketAndImage$lambda8(SubmitIssuePresenter submitIssuePresenter, User user, Throwable th) {
        Log_OC.getArray(submitIssuePresenter, "this$0");
        Log_OC.getArray(user, "$user");
        String $r2 = Log_OC.m10359a("Issue Error ", th);
        Object[] $r4 = new Object[0];
        Timber.tag($r2, $r4);
        Crypt $r5 = Crypt.f399a;
        submitIssuePresenter.ifViewAttached($r5);
        submitIssuePresenter.logEventOnSubmitIssueButtonClicked(IssueResolutionAnalyticsKt.STATUS_FAILURE, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitTicketAndImage$lambda-8$lambda-7  reason: not valid java name */
    public static final void m39432submitTicketAndImage$lambda8$lambda7(SubmitIssueView submitIssueView) {
        Log_OC.getArray(submitIssueView, "view");
        submitIssueView.hideLoading();
        submitIssueView.showErrorMsg("Issue not submitted. Please try again...");
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
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logOnIssueSummaryReached() {
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.presenters.Comment
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SubmitIssuePresenter $r12 = SubmitIssuePresenter.this;
                User $r3 = (User) obj;
                SubmitIssuePresenter.m39414logOnIssueSummaryReached$lambda0($r12, $r3);
            }
        };
        Ticker $r4 = Ticker.worker;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "currentUser.execute().subscribe(\n            {\n                analytics.onIssueSummaryPageReached(it.phoneNumber)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void submitIssue(final ai.kudi.agent.issues.viewmodels.model.IssueTypeModel r6, final java.util.List r7, final java.util.List r8) {
        /*
            r5 = this;
            java.lang.String r0 = "issueTypeModel"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            java.lang.String r0 = "filePathList"
            kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
            java.lang.String r0 = "defaultCreatedFileList"
            kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
            java.lang.String r1 = r6.getAmount()
            if (r1 == 0) goto L1e
            int r2 = r1.length()
            if (r2 != 0) goto L1c
            goto L1e
        L1c:
            r3 = 0
            goto L1f
        L1e:
            r3 = 1
        L1f:
            if (r3 == 0) goto L28
            java.lang.String r1 = r6.getTransactionValue()
            r6.setAmount(r1)
        L28:
            ai.kudi.agent.issues.presenters.AnnotationWriter r4 = new ai.kudi.agent.issues.presenters.AnnotationWriter
            r4.<init>()
            r5.ifViewAttached(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.presenters.SubmitIssuePresenter.submitIssue(ai.kudi.agent.issues.viewmodels.model.IssueTypeModel, java.util.List, java.util.List):void");
    }
}
