package ai.kudi.agent.transfer.viewmodel;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.domain.usecases.SubmitMultipleTransferRequest;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.AccountLookupRequest;
import ai.kudi.agent.users.domain.package_1.AccountLookupResponse;
import ai.kudi.agent.users.domain.package_1.TransferResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.app.Application;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: TransferToMultipleViewModel.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJA\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u00182\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\u00112\u0006\u0010-\u001a\u00020\u0018¢\u0006\u0002\u0010.J\u0015\u0010/\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0002\u00100J\u000e\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\u0011J\b\u00103\u001a\u00020\u0002H\u0016J\u0006\u00104\u001a\u00020%J\u0018\u00105\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00182\b\u00106\u001a\u0004\u0018\u00010*J\u0006\u00107\u001a\u00020%R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m10421d2 = {"Lai/kudi/agent/transfer/viewmodel/TransferToMultipleViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/transfer/viewmodel/TransferToMultipleViewState;", "app", "Landroid/app/Application;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "accountLookup", "Lai/kudi/agent/users/domain/usecases/AccountLookup;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "transfer", "Lai/kudi/agent/bills/domain/usecases/SubmitMultipleTransferRequest;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/app/Application;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/users/domain/usecases/AccountLookup;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/bills/domain/usecases/SubmitMultipleTransferRequest;Landroid/content/SharedPreferences;)V", "currentEditingIndex", "", "lookupDisposable", "Lio/reactivex/disposables/Disposable;", "onPaymentComplete", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "", "", "getOnPaymentComplete", "()Lio/reactivex/subjects/PublishSubject;", "onRecipientAdded", "getOnRecipientAdded", "onRequestTransferPin", "getOnRequestTransferPin", "onShowConfirmDialog", "getOnShowConfirmDialog", "toastMessage", "getToastMessage", "userPhone", "addRecipient", "", "walletBalance", "", BanksWithMethods.ACCOUNT_NUMBER, "bank", "Lai/kudi/agent/core/domain/room_entities/Bank;", BanksWithMethods.ACCOUNT_NAME, TransactionField.AMOUNT, "transferReason", "(Ljava/lang/Double;Ljava/lang/String;Lai/kudi/agent/core/domain/room_entities/Bank;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "confirmPayment", "(Ljava/lang/Double;)V", "editIndex", "pos", "initialData", "onTransferConfirmed", "performLookup", "selectedBank", "performMultipleTransfer", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferToMultipleViewModel extends BaseViewModel<TransferToMultipleViewState> {
    public static final String AGENT = "AGENT";
    public static final Companion Companion;
    public static final String USER = "USER";
    private final AccountLookup accountLookup;
    private final Analytics analytics;
    private int currentEditingIndex;
    private final FetchCurrentUser currentUser;
    private FavoritesArrayAdapter lookupDisposable;
    private final C11680b<C13287o<Boolean, String>> onPaymentComplete;
    private final C11680b<Boolean> onRecipientAdded;
    private final C11680b<Boolean> onRequestTransferPin;
    private final C11680b<String> onShowConfirmDialog;
    private final SharedPreferences sharedPreferences;
    private final Application suggestions;
    private final C11680b<String> toastMessage;
    private final SubmitMultipleTransferRequest transfer;
    private String userPhone;

    /* compiled from: TransferToMultipleViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transfer/viewmodel/TransferToMultipleViewModel$Companion;", "", "()V", "AGENT", "", "USER", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransferToMultipleViewModel(Application application, FetchCurrentUser fetchCurrentUser, AccountLookup accountLookup, Analytics analytics, SubmitMultipleTransferRequest submitMultipleTransferRequest, SharedPreferences sharedPreferences) {
        Log_OC.getArray(application, "app");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(accountLookup, "accountLookup");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(submitMultipleTransferRequest, "transfer");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.suggestions = application;
        this.currentUser = fetchCurrentUser;
        this.accountLookup = accountLookup;
        this.analytics = analytics;
        this.transfer = submitMultipleTransferRequest;
        this.sharedPreferences = sharedPreferences;
        C11680b $r7 = C11680b.m10564v0();
        Log_OC.loadImage($r7, "create()");
        this.onRecipientAdded = $r7;
        C11680b $r72 = C11680b.m10564v0();
        Log_OC.loadImage($r72, "create()");
        this.onRequestTransferPin = $r72;
        C11680b $r73 = C11680b.m10564v0();
        Log_OC.loadImage($r73, "create()");
        this.onShowConfirmDialog = $r73;
        C11680b $r74 = C11680b.m10564v0();
        Log_OC.loadImage($r74, "create()");
        this.toastMessage = $r74;
        C11680b $r75 = C11680b.m10564v0();
        Log_OC.loadImage($r75, "create()");
        this.onPaymentComplete = $r75;
        this.currentEditingIndex = -1;
        this.userPhone = "";
        C11280b $r8 = getCompositeDisposable();
        FetchCurrentUser $r4 = this.currentUser;
        AbstractC11696w $r9 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transfer.viewmodel.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToMultipleViewModel $r1 = TransferToMultipleViewModel.this;
                User $r3 = (User) obj;
                TransferToMultipleViewModel.m41409_init_$lambda0($r1, $r3);
            }
        };
        Chunk $r11 = Chunk.NEXTPAGE;
        FavoritesArrayAdapter $r12 = $r9.s(object, $r11);
        $r8.b($r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m41409_init_$lambda0(TransferToMultipleViewModel transferToMultipleViewModel, User user) {
        Log_OC.getArray(transferToMultipleViewModel, "this$0");
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "user.phoneNumber");
        transferToMultipleViewModel.userPhone = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final void m41410_init_$lambda1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState] */
    /* renamed from: performLookup$lambda-2  reason: not valid java name */
    public static final void m41411performLookup$lambda2(C11812w c11812w, TransferToMultipleViewModel transferToMultipleViewModel, Bank bank, AccountLookupResponse accountLookupResponse) {
        Log_OC.getArray(c11812w, "$newState");
        Log_OC.getArray(transferToMultipleViewModel, "this$0");
        ViewData $r4 = transferToMultipleViewModel.getState();
        TransferToMultipleViewState $r5 = (TransferToMultipleViewState) $r4;
        String $r6 = accountLookupResponse.getAccountName();
        ?? copy$default = TransferToMultipleViewState.copy$default($r5, null, false, null, null, $r6, null, null, false, false, 365, null);
        c11812w.f26499c = copy$default;
        ViewData $r42 = (ViewData) copy$default;
        transferToMultipleViewModel.publish($r42);
        Analytics $r7 = transferToMultipleViewModel.analytics;
        String $r62 = transferToMultipleViewModel.userPhone;
        String $r8 = bank.getName();
        TransferToBankAnalytics.DefaultImpls.onPerformAccountNameLookup$default($r7, $r62, $r8, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-3  reason: not valid java name */
    public static final void m41412performLookup$lambda3(TransferToMultipleViewModel transferToMultipleViewModel, Bank bank, Throwable th) {
        Log_OC.getArray(transferToMultipleViewModel, "this$0");
        Application $r3 = transferToMultipleViewModel.suggestions;
        String $r4 = $r3.getString(C0001R.string.bank_account_details_error);
        Log_OC.loadImage($r4, "app.getString(R.string.bank_account_details_error)");
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2($r4, $r4);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        String str = (String) $r6;
        ViewData $r8 = transferToMultipleViewModel.getState();
        List $r10 = ((TransferToMultipleViewState) $r8).getRecipients();
        int $i0 = $r10.size();
        boolean z = $i0 > 1;
        ViewData $r82 = transferToMultipleViewModel.getState();
        TransferToMultipleViewState $r9 = (TransferToMultipleViewState) $r82;
        transferToMultipleViewModel.publish(TransferToMultipleViewState.copy$default($r9, null, false, $r4, null, null, null, null, z, false, 377, null));
        Analytics $r11 = transferToMultipleViewModel.analytics;
        String $r42 = transferToMultipleViewModel.userPhone;
        String $r12 = bank.getName();
        $r11.onPerformAccountNameLookup($r42, $r12, false, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performMultipleTransfer$lambda-8  reason: not valid java name */
    public static final void m41413performMultipleTransfer$lambda8(TransferToMultipleViewModel transferToMultipleViewModel, TransferResponse transferResponse) {
        Log_OC.getArray(transferToMultipleViewModel, "this$0");
        ViewData $r2 = transferToMultipleViewModel.getState();
        TransferToMultipleViewState $r3 = (TransferToMultipleViewState) $r2;
        transferToMultipleViewModel.publish(TransferToMultipleViewState.copy$default($r3, null, false, null, null, null, null, null, false, false, 255, null));
        C11680b $r4 = transferToMultipleViewModel.getOnPaymentComplete();
        Boolean $r5 = Boolean.TRUE;
        String $r6 = transferResponse.getMessage();
        C13287o $r7 = C13664u.m4227a($r5, $r6);
        $r4.mo331f($r7);
        Analytics $r8 = transferToMultipleViewModel.analytics;
        String $r62 = transferToMultipleViewModel.userPhone;
        TransferToMultipleBanksAnalytics.Actions.DefaultImpls.onMultipleTransferStatus$default($r8, $r62, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performMultipleTransfer$lambda-9  reason: not valid java name */
    public static final void m41414performMultipleTransfer$lambda9(TransferToMultipleViewModel transferToMultipleViewModel, Throwable th) {
        Log_OC.getArray(transferToMultipleViewModel, "this$0");
        ViewData $r2 = transferToMultipleViewModel.getState();
        TransferToMultipleViewState $r3 = (TransferToMultipleViewState) $r2;
        transferToMultipleViewModel.publish(TransferToMultipleViewState.copy$default($r3, null, false, null, null, null, null, null, false, false, 255, null));
        Application $r4 = transferToMultipleViewModel.suggestions;
        String $r5 = $r4.getString(C0001R.string.unable_to_process_payments_message);
        Log_OC.loadImage($r5, "app.getString(R.string.unable_to_process_payments_message)");
        InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default($r5, null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r7 = $r6.invoke(th);
        String $r52 = (String) $r7;
        C11680b $r8 = transferToMultipleViewModel.getOnPaymentComplete();
        Boolean $r9 = Boolean.FALSE;
        C13287o $r10 = C13664u.m4227a($r9, $r52);
        $r8.mo331f($r10);
        Analytics $r11 = transferToMultipleViewModel.analytics;
        String $r12 = transferToMultipleViewModel.userPhone;
        $r11.onMultipleTransferStatus($r12, false, $r52);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0187, code lost:
        if (r27 >= 500) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a1, code lost:
        if (r27 < 100) goto L67;
     */
    /* JADX WARN: Incorrect condition in loop: B:47:0x0233 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addRecipient(java.lang.Double r72, java.lang.String r73, ai.kudi.agent.core.domain.room_entities.Bank r74, java.lang.String r75, java.lang.Integer r76, java.lang.String r77) {
        /*
            Method dump skipped, instructions count: 1239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewModel.addRecipient(java.lang.Double, java.lang.String, ai.kudi.agent.core.domain.room_entities.Bank, java.lang.String, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void confirmPayment(java.lang.Double r30) {
        /*
            r29 = this;
            r0 = r29
            ai.kudi.agent.core.mvvm.ViewData r3 = r0.getState()
            r5 = r3
            ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState r5 = (ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState) r5
            r4 = r5
            java.util.List r6 = r4.getRecipients()
            java.util.Iterator r7 = r6.iterator()
            r8 = 0
        L13:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L2e
            java.lang.Object r10 = r7.next()
            r12 = r10
            ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload r12 = (ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload) r12
            r11 = r12
            java.lang.Integer r13 = r11.getAmount()
            kotlin.p483e0.p485d.Log_OC.append(r13)
            int r14 = r13.intValue()
            int r8 = r8 + r14
            goto L13
        L2e:
            double r0 = (double) r8
            r15 = r0
            if (r30 != 0) goto L36
            r17 = 0
            goto L3c
        L36:
            r0 = r30
            double r17 = r0.doubleValue()
        L3c:
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 <= 0) goto L5f
            r0 = r29
            j.e.k0.b<java.lang.String> r0 = r0.toastMessage
            r20 = r0
            r0 = r29
            android.app.Application r0 = r0.suggestions
            r21 = r0
            r23 = 2131886691(0x7f120263, float:1.9407968E38)
            r0 = r21
            r1 = r23
            java.lang.String r22 = r0.getString(r1)
            r0 = r20
            r1 = r22
            r0.mo331f(r1)
            return
        L5f:
            r0 = r29
            android.app.Application r0 = r0.suggestions
            r21 = r0
            r23 = 1
            r0 = r23
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r24 = r0
            r0 = r29
            ai.kudi.agent.core.mvvm.ViewData r3 = r0.getState()
            r25 = r3
            ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState r25 = (ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState) r25
            r4 = r25
            java.util.List r6 = r4.getRecipients()
            int r8 = r6.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r23 = 0
            r24[r23] = r13
            r23 = 2131886367(0x7f12011f, float:1.940731E38)
            r0 = r21
            r1 = r23
            r2 = r24
            java.lang.String r22 = r0.getString(r1, r2)
            java.lang.String r26 = "app.getString(R.string.confirm_multiple_transfer_message, state.recipients.size)"
            r0 = r22
            r1 = r26
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r1)
            r0 = r29
            j.e.k0.b<java.lang.String> r0 = r0.onShowConfirmDialog
            r20 = r0
            r1 = r22
            r0.mo331f(r1)
            r0 = r29
            ai.kudi.agent.core.analytics.Analytics r0 = r0.analytics
            r27 = r0
            r0 = r29
            java.lang.String r0 = r0.userPhone
            r22 = r0
            r0 = r29
            ai.kudi.agent.core.mvvm.ViewData r3 = r0.getState()
            r28 = r3
            ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState r28 = (ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState) r28
            r4 = r28
            java.util.List r6 = r4.getRecipients()
            int r8 = r6.size()
            r0 = r27
            r1 = r22
            r0.onContinueMultipleTransfer(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewModel.confirmPayment(java.lang.Double):void");
    }

    public final void editIndex(int i) {
        this.currentEditingIndex = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnPaymentComplete() {
        C11680b r1 = this.onPaymentComplete;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnRecipientAdded() {
        C11680b r1 = this.onRecipientAdded;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnRequestTransferPin() {
        C11680b r1 = this.onRequestTransferPin;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnShowConfirmDialog() {
        C11680b r1 = this.onShowConfirmDialog;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getToastMessage() {
        C11680b r1 = this.toastMessage;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        TransferToMultipleViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public TransferToMultipleViewState initialData() {
        TransferToMultipleViewState $r1 = new TransferToMultipleViewState(null, false, null, null, null, null, null, false, false, 511, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onTransferConfirmed() {
        Analytics $r1 = this.analytics;
        String $r2 = this.userPhone;
        $r1.onConfirmMultipleTransfers($r2);
        C11680b $r3 = this.onRequestTransferPin;
        Boolean $r4 = Boolean.TRUE;
        $r3.mo331f($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r17v3, types: [T, ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewState] */
    public final void performLookup(String str, final Bank bank) {
        boolean $z0;
        Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NUMBER);
        FavoritesArrayAdapter $r3 = this.lookupDisposable;
        if ($r3 != null) {
            $r3.backup();
        }
        if (bank == null) {
            return;
        }
        $z0 = C13276s.m5440u(str);
        if (!$z0) {
            boolean $z02 = StringExtKt.isAccountNumber(str);
            if ($z02) {
                final C11812w $r4 = new C11812w();
                ViewData $r5 = getState();
                ?? copy$default = TransferToMultipleViewState.copy$default((TransferToMultipleViewState) $r5, null, true, null, null, null, null, null, false, false, 489, null);
                $r4.f26499c = copy$default;
                ViewData $r52 = (ViewData) copy$default;
                publish($r52);
                AccountLookup $r7 = this.accountLookup;
                String $r9 = bank.getBankCode();
                AccountLookupRequest $r8 = new AccountLookupRequest($r9, str);
                AbstractC11688p $r10 = $r7.execute($r8);
                this.lookupDisposable = $r10.e0(new Object() { // from class: ai.kudi.agent.transfer.viewmodel.ClassWriter
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.Object
                    public final void accept(Object obj) {
                        C11812w $r1 = C11812w.this;
                        TransferToMultipleViewModel $r2 = this;
                        Bank $r32 = bank;
                        AccountLookupResponse $r53 = (AccountLookupResponse) obj;
                        TransferToMultipleViewModel.m41411performLookup$lambda2($r1, $r2, $r32, $r53);
                    }
                }, new Object() { // from class: ai.kudi.agent.transfer.viewmodel.Label
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // p425j.p444e.p450e0.Object
                    public final void accept(Object obj) {
                        TransferToMultipleViewModel $r1 = TransferToMultipleViewModel.this;
                        Bank $r2 = bank;
                        Throwable $r42 = (Throwable) obj;
                        TransferToMultipleViewModel.m41412performLookup$lambda3($r1, $r2, $r42);
                    }
                });
                C11280b $r13 = getCompositeDisposable();
                FavoritesArrayAdapter $r32 = this.lookupDisposable;
                Log_OC.append($r32);
                $r13.b($r32);
                return;
            }
        }
        ViewData $r53 = getState();
        TransferToMultipleViewState $r6 = (TransferToMultipleViewState) $r53;
        Application $r14 = this.suggestions;
        String $r1 = $r14.getString(C0001R.string.invalid_account_number_message);
        publish(TransferToMultipleViewState.copy$default($r6, null, false, $r1, null, null, null, null, false, false, 491, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0042 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performMultipleTransfer() {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.viewmodel.TransferToMultipleViewModel.performMultipleTransfer():void");
    }
}
