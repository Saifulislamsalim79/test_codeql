package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.domain.room_entities.BankAccount;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transfer.domain.models.TransactionLookUpParam;
import ai.kudi.agent.transfer.domain.models.TransactionLookUpResponse;
import ai.kudi.agent.transfer.domain.usecases.TransactionLookUpUsecase;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.views.TransferToBankView;
import ai.kudi.agent.users.domain.package_1.AccountLookupRequest;
import ai.kudi.agent.users.domain.package_1.AccountLookupResponse;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: TransferToBankPresenter.kt */
@Metadata(m10422d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010 \u001a\u00020!J \u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001f2\b\b\u0002\u0010&\u001a\u00020\u001fJ\b\u0010'\u001a\u00020!H\u0016J\u0006\u0010(\u001a\u00020!J\u0010\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010\u0018J\u0006\u0010+\u001a\u00020!J.\u0010,\u001a\u0012\u0012\u0004\u0012\u00020.0-j\b\u0012\u0004\u0012\u00020.`/2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020.03H\u0002J\u001c\u00104\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u00010\u00182\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u001a\u00108\u001a\u00020!2\b\u00105\u001a\u0004\u0018\u00010\u00182\b\u00106\u001a\u0004\u0018\u000107J\u0006\u00109\u001a\u00020!R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m10421d2 = {"Lai/kudi/agent/transfer/presenter/TransferToBankPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transfer/views/TransferToBankView;", "pref", "Lai/kudi/agent/core/util/Pref;", "accountRepository", "Lai/kudi/agent/settings/domain/repositories/AccountRepository;", "accountLookup", "Lai/kudi/agent/users/domain/usecases/AccountLookup;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "mainTransferView", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "lookUpUsecase", "Lai/kudi/agent/transfer/domain/usecases/TransactionLookUpUsecase;", "(Lai/kudi/agent/core/util/Pref;Lai/kudi/agent/settings/domain/repositories/AccountRepository;Lai/kudi/agent/users/domain/usecases/AccountLookup;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/voucher/cashin/view/MainTransferView;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/transfer/domain/usecases/TransactionLookUpUsecase;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "fetchRecentTransfersDisposable", "Lio/reactivex/disposables/Disposable;", "lookupDisposable", "oldSearchTerm", "", "phoneNumber", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "returnsEmptyList", "", "checkCachedLastTransferLookUpResult", "", "continueToNextPage", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "isFromSummaryPage", "isCashOutFlow", "destroy", "disposeLookupProcess", "fetchRecentTransfers", "searchTerm", "getAccountDetail", "getUniqueTransferRecipient", "Ljava/util/ArrayList;", "Lai/kudi/agent/transfer/domain/models/TransactionRecipient;", "Lkotlin/collections/ArrayList;", "size", "", "transactions", "", "isAccountNumberValid", "accountNo", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "performLookup", "sendToMultiple", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransferToBankPresenter extends C9410b<TransferToBankView> {
    public static final String BLANK_ACCOUNT_NUMBER = "Please provide an Account Number.";
    public static final Companion Companion;
    public static final String INVALID_ACCOUNT_NUMBER = "Please provide a valid Account Number.";
    private final AccountLookup accountLookup;
    private final AccountRepository accountRepository;
    private final Analytics analytics;
    private C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;
    private FavoritesArrayAdapter fetchRecentTransfersDisposable;
    private final TransactionLookUpUsecase lookUpUsecase;
    private FavoritesArrayAdapter lookupDisposable;
    private final MainTransferView mainTransferView;
    private String oldSearchTerm;
    private String phoneNumber;
    private final Pref pref;
    private boolean returnsEmptyList;

    /* compiled from: TransferToBankPresenter.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transfer/presenter/TransferToBankPresenter$Companion;", "", "()V", "BLANK_ACCOUNT_NUMBER", "", "INVALID_ACCOUNT_NUMBER", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
    public TransferToBankPresenter(Pref pref, AccountRepository accountRepository, AccountLookup accountLookup, FetchCurrentUser fetchCurrentUser, MainTransferView mainTransferView, Analytics analytics, TransactionLookUpUsecase transactionLookUpUsecase) {
        Log_OC.getArray(pref, "pref");
        Log_OC.getArray(accountRepository, "accountRepository");
        Log_OC.getArray(accountLookup, "accountLookup");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(mainTransferView, "mainTransferView");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(transactionLookUpUsecase, "lookUpUsecase");
        this.pref = pref;
        this.accountRepository = accountRepository;
        this.accountLookup = accountLookup;
        this.currentUser = fetchCurrentUser;
        this.mainTransferView = mainTransferView;
        this.analytics = analytics;
        this.lookUpUsecase = transactionLookUpUsecase;
        C11280b $r8 = new C11280b();
        this.compositeDisposable = $r8;
        this.phoneNumber = "";
        FetchCurrentUser $r7 = this.currentUser;
        AbstractC11696w $r9 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transfer.presenter.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankPresenter $r1 = TransferToBankPresenter.this;
                User $r3 = (User) obj;
                TransferToBankPresenter.m41354_init_$lambda0($r1, $r3);
            }
        };
        Message$RecipientType $r11 = Message$RecipientType.f1806TO;
        FavoritesArrayAdapter $r12 = $r9.s(object, $r11);
        $r8.b($r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m41354_init_$lambda0(TransferToBankPresenter transferToBankPresenter, User user) {
        Log_OC.getArray(transferToBankPresenter, "this$0");
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "user.phoneNumber");
        transferToBankPresenter.setPhoneNumber($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-1  reason: not valid java name */
    public static final void m41355_init_$lambda1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkCachedLastTransferLookUpResult$lambda-2  reason: not valid java name */
    public static final void m41356checkCachedLastTransferLookUpResult$lambda2(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "view");
        TransferToBankView.DefaultImpls.showTransferItemSection$default(transferToBankView, false, 1, null);
        TransferToBankView.DefaultImpls.toggleRecentTrfTxnLoader$default(transferToBankView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkCachedLastTransferLookUpResult$lambda-3  reason: not valid java name */
    public static final void m41357checkCachedLastTransferLookUpResult$lambda3(List list, TransferToBankView transferToBankView) {
        Log_OC.getArray(list, "$cachedRecentTransferTxn");
        Log_OC.getArray(transferToBankView, "view");
        ArrayList $r2 = (ArrayList) list;
        TransferToBankView.DefaultImpls.showTransferLookUpResult$default(transferToBankView, $r2, false, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void continueToNextPage$default(TransferToBankPresenter transferToBankPresenter, TransferToBankPayload transferToBankPayload, boolean z, boolean $z1, int i, Object obj) {
        int $i0 = i & 4;
        if ($i0 != 0) {
            $z1 = false;
        }
        transferToBankPresenter.continueToNextPage(transferToBankPayload, z, $z1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueToNextPage$lambda-20  reason: not valid java name */
    public static final void m41358continueToNextPage$lambda20(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "it");
        transferToBankView.showInvalidAccountNoError(BLANK_ACCOUNT_NUMBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: continueToNextPage$lambda-21  reason: not valid java name */
    public static final void m41359continueToNextPage$lambda21(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "it");
        transferToBankView.showInvalidAccountNoError(INVALID_ACCOUNT_NUMBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: disposeLookupProcess$lambda-13  reason: not valid java name */
    public static final void m41360disposeLookupProcess$lambda13(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "it");
        transferToBankView.hideAccountNameLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchRecentTransfers$lambda-19  reason: not valid java name */
    public static final void m41361fetchRecentTransfers$lambda19(final String str, final TransferToBankPresenter transferToBankPresenter, final TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankPresenter, "this$0");
        Log_OC.getArray(transferToBankView, "view");
        if (str != null) {
            transferToBankView.showTransferItemSection(true);
            transferToBankView.toggleRecentTrfTxnLoader(true);
        }
        FetchCurrentUser $r3 = transferToBankPresenter.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transfer.presenter.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransferToBankPresenter $r1 = TransferToBankPresenter.this;
                String $r2 = str;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = TransferToBankPresenter.m41362fetchRecentTransfers$lambda19$lambda16($r1, $r2, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.transfer.presenter.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankPresenter $r1 = TransferToBankPresenter.this;
                TransferToBankView $r2 = transferToBankView;
                TransactionLookUpResponse $r42 = (TransactionLookUpResponse) obj;
                TransferToBankPresenter.m41363fetchRecentTransfers$lambda19$lambda17($r1, $r2, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transfer.presenter.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankView $r1 = TransferToBankView.this;
                Throwable $r32 = (Throwable) obj;
                TransferToBankPresenter.m41364fetchRecentTransfers$lambda19$lambda18($r1, $r32);
            }
        });
        transferToBankPresenter.fetchRecentTransfersDisposable = $r9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchRecentTransfers$lambda-19$lambda-16  reason: not valid java name */
    public static final InterfaceC11692s m41362fetchRecentTransfers$lambda19$lambda16(TransferToBankPresenter transferToBankPresenter, String $r2, User user) {
        Log_OC.getArray(transferToBankPresenter, "this$0");
        Log_OC.getArray(user, "it");
        TransactionLookUpUsecase $r4 = transferToBankPresenter.lookUpUsecase;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        if ($r2 == null) {
            $r2 = "";
        }
        TransactionLookUpParam $r0 = new TransactionLookUpParam($r5, $r2, null, 4, null);
        AbstractC11688p $r6 = $r4.execute($r0);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchRecentTransfers$lambda-19$lambda-17  reason: not valid java name */
    public static final void m41363fetchRecentTransfers$lambda19$lambda17(TransferToBankPresenter transferToBankPresenter, TransferToBankView transferToBankView, TransactionLookUpResponse transactionLookUpResponse) {
        Log_OC.getArray(transferToBankPresenter, "this$0");
        Log_OC.getArray(transferToBankView, "$view");
        List $r3 = transactionLookUpResponse.getData();
        boolean $z0 = $r3.isEmpty();
        transferToBankPresenter.returnsEmptyList = $z0;
        List $r32 = transactionLookUpResponse.getData();
        boolean $z02 = $r32.isEmpty();
        if (!$z02) {
            List $r33 = transactionLookUpResponse.getData();
            ArrayList $r4 = transferToBankPresenter.getUniqueTransferRecipient(10, $r33);
            Pref $r5 = transferToBankPresenter.pref;
            $r5.saveTransferLookUpResult($r4);
            transferToBankView.showTransferLookUpResult($r4, true);
        } else {
            TransferToBankView.DefaultImpls.showTransferItemSection$default(transferToBankView, false, 1, null);
            transferToBankView.clearTransferSuggestion();
        }
        TransferToBankView.DefaultImpls.toggleRecentTrfTxnLoader$default(transferToBankView, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchRecentTransfers$lambda-19$lambda-18  reason: not valid java name */
    public static final void m41364fetchRecentTransfers$lambda19$lambda18(TransferToBankView transferToBankView, Throwable th) {
        Log_OC.getArray(transferToBankView, "$view");
        TransferToBankView.DefaultImpls.toggleRecentTrfTxnLoader$default(transferToBankView, false, 1, null);
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAccountDetail$lambda-24  reason: not valid java name */
    public static final void m41365getAccountDetail$lambda24(TransferToBankPresenter transferToBankPresenter, final BankAccount bankAccount) {
        Log_OC.getArray(transferToBankPresenter, "this$0");
        transferToBankPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transfer.presenter.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                BankAccount $r1 = BankAccount.this;
                TransferToBankView $r3 = (TransferToBankView) obj;
                TransferToBankPresenter.m41366getAccountDetail$lambda24$lambda23($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAccountDetail$lambda-24$lambda-23  reason: not valid java name */
    public static final void m41366getAccountDetail$lambda24$lambda23(BankAccount bankAccount, TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "view");
        Log_OC.loadImage(bankAccount, "it");
        transferToBankView.setAccountDetailViews(bankAccount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAccountDetail$lambda-26  reason: not valid java name */
    public static final void m41367getAccountDetail$lambda26(TransferToBankPresenter transferToBankPresenter, Throwable th) {
        Log_OC.getArray(transferToBankPresenter, "this$0");
        FlurryAdSize $r2 = FlurryAdSize.BANNER_TOP;
        transferToBankPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAccountDetail$lambda-26$lambda-25  reason: not valid java name */
    public static final void m41368getAccountDetail$lambda26$lambda25(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "view");
        transferToBankView.onBankAccountUnavailable("Add bank account details");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList getUniqueTransferRecipient(int r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r9.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.transfer.domain.models.TransactionRecipient r5 = (ai.kudi.agent.transfer.domain.models.TransactionRecipient) r5
            r4 = r5
            boolean r2 = r0.contains(r4)
            if (r2 != 0) goto L20
            r0.add(r4)
        L20:
            int r6 = r0.size()
            if (r6 != r8) goto L9
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.presenter.TransferToBankPresenter.getUniqueTransferRecipient(int, java.util.List):java.util.ArrayList");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isAccountNumberValid(java.lang.String r6, ai.kudi.agent.core.domain.room_entities.Bank r7) {
        /*
            r5 = this;
            if (r6 == 0) goto Lb
            boolean r0 = kotlin.p549l0.C13265j.m5470u(r6)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 == 0) goto L15
            ai.kudi.agent.transfer.presenter.Log r1 = ai.kudi.agent.transfer.presenter.Log.LOG
            r5.ifViewAttached(r1)
        L13:
            r2 = 0
            return r2
        L15:
            boolean r0 = ai.kudi.agent.core.util.StringExtKt.isAccountNumber(r6)
            if (r0 != 0) goto L21
            ai.kudi.agent.transfer.presenter.Format r3 = ai.kudi.agent.transfer.presenter.Format.TAG
            r5.ifViewAttached(r3)
            goto L13
        L21:
            if (r7 != 0) goto L25
            r6 = 0
            goto L29
        L25:
            java.lang.String r6 = r7.getBankCode()
        L29:
            kotlin.p483e0.p485d.Log_OC.append(r6)
            boolean r0 = kotlin.p549l0.C13265j.m5470u(r6)
            if (r0 == 0) goto L38
            ai.kudi.agent.transfer.presenter.Button r4 = ai.kudi.agent.transfer.presenter.Button.background
            r5.ifViewAttached(r4)
            goto L13
        L38:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.presenter.TransferToBankPresenter.isAccountNumberValid(java.lang.String, ai.kudi.agent.core.domain.room_entities.Bank):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isAccountNumberValid$lambda-10  reason: not valid java name */
    public static final void m41369isAccountNumberValid$lambda10(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "it");
        transferToBankView.showInvalidAccountNoError(BLANK_ACCOUNT_NUMBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isAccountNumberValid$lambda-11  reason: not valid java name */
    public static final void m41370isAccountNumberValid$lambda11(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "it");
        transferToBankView.showInvalidAccountNoError(INVALID_ACCOUNT_NUMBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isAccountNumberValid$lambda-12  reason: not valid java name */
    public static final void m41371isAccountNumberValid$lambda12(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "it");
        transferToBankView.showInvalidBankError("Please choose a bank");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookup$lambda-5  reason: not valid java name */
    public static final void m41372performLookup$lambda5(TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "view");
        transferToBankView.showAccountNameLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-7  reason: not valid java name */
    public static final void m41373performLookup$lambda7(TransferToBankPresenter transferToBankPresenter, Bank bank, final AccountLookupResponse accountLookupResponse) {
        Log_OC.getArray(transferToBankPresenter, "this$0");
        transferToBankPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transfer.presenter.ByteArrayReader
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void getByte(Object obj) {
                AccountLookupResponse $r1 = AccountLookupResponse.this;
                TransferToBankView $r3 = (TransferToBankView) obj;
                TransferToBankPresenter.m41374performLookup$lambda7$lambda6($r1, $r3);
            }
        });
        Analytics $r3 = transferToBankPresenter.analytics;
        String $r5 = transferToBankPresenter.getPhoneNumber();
        String $r6 = bank.getName();
        TransferToBankAnalytics.DefaultImpls.onPerformAccountNameLookup$default($r3, $r5, $r6, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-7$lambda-6  reason: not valid java name */
    public static final void m41374performLookup$lambda7$lambda6(AccountLookupResponse accountLookupResponse, TransferToBankView transferToBankView) {
        Log_OC.getArray(transferToBankView, "view");
        transferToBankView.hideAccountNameLoading();
        String $r1 = accountLookupResponse.getAccountName();
        transferToBankView.showAccountName($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-9  reason: not valid java name */
    public static final void m41375performLookup$lambda9(TransferToBankPresenter transferToBankPresenter, Bank bank, Throwable th) {
        Log_OC.getArray(transferToBankPresenter, "this$0");
        th.printStackTrace();
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2("This account number does not exist on selected bank", "This account number does not exist on selected bank");
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        final String $r5 = (String) $r4;
        transferToBankPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transfer.presenter.Attribute
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                String $r1 = $r5;
                TransferToBankView $r32 = (TransferToBankView) obj;
                TransferToBankPresenter.m41376performLookup$lambda9$lambda8($r1, $r32);
            }
        });
        Analytics $r7 = transferToBankPresenter.analytics;
        String $r8 = transferToBankPresenter.getPhoneNumber();
        String $r9 = bank.getName();
        $r7.onPerformAccountNameLookup($r8, $r9, false, $r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performLookup$lambda-9$lambda-8  reason: not valid java name */
    public static final void m41376performLookup$lambda9$lambda8(String str, TransferToBankView transferToBankView) {
        Log_OC.getArray(str, "$error");
        Log_OC.getArray(transferToBankView, "view");
        transferToBankView.hideAccountNameLoading();
        transferToBankView.showAccountNameError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkCachedLastTransferLookUpResult() {
        Pref $r1 = this.pref;
        final List $r2 = $r1.fetchLastTransferLookUpResult();
        boolean $z0 = $r2.isEmpty();
        if (!$z0) {
            ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transfer.presenter.ViewTarget
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                public final void getSize(Object obj) {
                    List $r12 = $r2;
                    TransferToBankView $r3 = (TransferToBankView) obj;
                    TransferToBankPresenter.m41357checkCachedLastTransferLookUpResult$lambda3($r12, $r3);
                }
            });
            return;
        }
        Difficulty $r3 = Difficulty.HARD;
        ifViewAttached($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void continueToNextPage(TransferToBankPayload transferToBankPayload, boolean z, boolean z2) {
        boolean $z2;
        Log_OC.getArray(transferToBankPayload, TransactionRequest.TYPE_REQUEST);
        String $r2 = transferToBankPayload.getAccountNumber();
        Log_OC.append($r2);
        $z2 = C13276s.m5440u($r2);
        if ($z2) {
            Token $r3 = Token.PERCENT;
            ifViewAttached($r3);
            return;
        }
        boolean $z22 = StringExtKt.isAccountNumber(transferToBankPayload.getAccountNumber());
        if (!$z22) {
            Setting $r4 = Setting.VOLUME;
            ifViewAttached($r4);
            return;
        }
        Analytics $r5 = this.analytics;
        TransferToBankAnalytics.DefaultImpls.onSubmitAccountDetails$default($r5, this.phoneNumber, true, null, 4, null);
        if (z) {
            MainTransferView $r6 = this.mainTransferView;
            MainTransferView.DefaultImpls.navigateToBankTransferSummaryPage$default($r6, transferToBankPayload, false, 2, null);
            return;
        }
        MainTransferView $r62 = this.mainTransferView;
        MainTransferView.DefaultImpls.navigateToBankTransferAmountPage$default($r62, transferToBankPayload, false, z2, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
        disposeLookupProcess();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void disposeLookupProcess() {
        FavoritesArrayAdapter $r1 = this.lookupDisposable;
        if ($r1 != null) {
            $r1.backup();
        }
        FavoritesArrayAdapter $r12 = this.fetchRecentTransfersDisposable;
        if ($r12 != null) {
            $r12.backup();
        }
        Utils$1 $r2 = Utils$1.myResult;
        ifViewAttached($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fetchRecentTransfers(final java.lang.String r10) {
        /*
            r9 = this;
            j.e.c0.FavoritesArrayAdapter r0 = r9.fetchRecentTransfersDisposable
            if (r0 != 0) goto L5
            goto L8
        L5:
            r0.backup()
        L8:
            r1 = 1
            if (r10 == 0) goto L14
            int r2 = r10.length()
            if (r2 != 0) goto L12
            goto L14
        L12:
            r3 = 0
            goto L15
        L14:
            r3 = 1
        L15:
            if (r3 != 0) goto L3a
            java.lang.String r4 = r9.oldSearchTerm
            if (r4 == 0) goto L23
            int r2 = r4.length()
            if (r2 != 0) goto L22
            goto L23
        L22:
            r1 = 0
        L23:
            if (r1 != 0) goto L3a
            java.lang.String r4 = r9.oldSearchTerm
            kotlin.p483e0.p485d.Log_OC.append(r4)
            r5 = 0
            r6 = 2
            r7 = 0
            boolean r1 = kotlin.p549l0.C13265j.m5507E(r10, r4, r5, r6, r7)
            if (r1 == 0) goto L3a
            boolean r1 = r9.returnsEmptyList
            if (r1 == 0) goto L3a
            r9.oldSearchTerm = r10
            return
        L3a:
            r9.oldSearchTerm = r10
            ai.kudi.agent.transfer.presenter.ByteVector r8 = new ai.kudi.agent.transfer.presenter.ByteVector
            r8.<init>()
            r9.ifViewAttached(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.presenter.TransferToBankPresenter.fetchRecentTransfers(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getAccountDetail() {
        AccountRepository $r2 = this.accountRepository;
        AbstractC11696w $r3 = $r2.getCashOutAccountDetails();
        FavoritesArrayAdapter $r5 = $r3.s(new Object() { // from class: ai.kudi.agent.transfer.presenter.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankPresenter $r1 = TransferToBankPresenter.this;
                BankAccount $r32 = (BankAccount) obj;
                TransferToBankPresenter.m41365getAccountDetail$lambda24($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transfer.presenter.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransferToBankPresenter $r1 = TransferToBankPresenter.this;
                Throwable $r32 = (Throwable) obj;
                TransferToBankPresenter.m41367getAccountDetail$lambda26($r1, $r32);
            }
        });
        Log_OC.loadImage($r5, "accountRepository.getCashOutAccountDetails()\n            .subscribe(\n                {\n                    ifViewAttached { view ->\n                        view.setAccountDetailViews(it)\n                    }\n                },\n                {\n                    ifViewAttached { view ->\n                        view.onBankAccountUnavailable(\"Add bank account details\")\n                    }\n                }\n            )");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
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
    public final void performLookup(String str, final Bank bank) {
        FavoritesArrayAdapter $r3 = this.lookupDisposable;
        if ($r3 != null) {
            $r3.backup();
        }
        boolean $z0 = isAccountNumberValid(str, bank);
        if ($z0) {
            ClassWriter $r4 = ClassWriter.attrs;
            ifViewAttached($r4);
            AccountLookup $r5 = this.accountLookup;
            Log_OC.append(bank);
            String $r7 = bank.getBankCode();
            Log_OC.append(str);
            AccountLookupRequest $r6 = new AccountLookupRequest($r7, str);
            AbstractC11688p $r8 = $r5.execute($r6);
            this.lookupDisposable = $r8.e0(new Object() { // from class: ai.kudi.agent.transfer.presenter.AccessibilityNodeInfoUtils$NodeActionFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    TransferToBankPresenter $r1 = TransferToBankPresenter.this;
                    Bank $r2 = bank;
                    AccountLookupResponse $r42 = (AccountLookupResponse) obj;
                    TransferToBankPresenter.m41373performLookup$lambda7($r1, $r2, $r42);
                }
            }, new Object() { // from class: ai.kudi.agent.transfer.presenter.Cubic
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    TransferToBankPresenter $r1 = TransferToBankPresenter.this;
                    Bank $r2 = bank;
                    Throwable $r42 = (Throwable) obj;
                    TransferToBankPresenter.m41375performLookup$lambda9($r1, $r2, $r42);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendToMultiple() {
        Analytics $r1 = this.analytics;
        String $r2 = this.phoneNumber;
        $r1.onMultipleTransferClicked($r2);
        MainTransferView $r3 = this.mainTransferView;
        MainTransferView.DefaultImpls.navigateToMultipleBankTransferPage$default($r3, null, 1, null);
    }

    public final void setPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.phoneNumber = str;
    }
}
