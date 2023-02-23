package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.kshock.data.domain.fht.TransactionResponse;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.data.model.LoanHistoryResponse;
import ai.kudi.agent.kshock.data.model.LoanStatusType;
import ai.kudi.agent.kshock.data.model.P2pData;
import ai.kudi.agent.kshock.data.model.Wallet;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData;
import ai.kudi.agent.kshock.usecases.FetchLoanHistory;
import ai.kudi.agent.kshock.usecases.FetchOverdueLoanHistory;
import ai.kudi.agent.kshock.usecases.GetWalletUseCase;
import ai.kudi.agent.kshock.usecases.PaybackLoan;
import ai.kudi.agent.kshock.usecases.PaybackOverdueLoan;
import ai.kudi.agent.kshock.usecases.SubmitTransactionRequest;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.domain.dto.Method;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: KshockPendingLoansListViewModel.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u001dJ\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0019J\b\u0010$\u001a\u00020\u0002H\u0016J\u000e\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0019J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015J\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0015J\u0010\u0010,\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/KshockPendingLoansListViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/KshockPendingLoansListViewData;", "fetchLoanHistory", "Lai/kudi/agent/kshock/usecases/FetchLoanHistory;", "fetchOverdueLoanHistory", "Lai/kudi/agent/kshock/usecases/FetchOverdueLoanHistory;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "kShockNavigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "paybackLoan", "Lai/kudi/agent/kshock/usecases/PaybackLoan;", "getWallet", "Lai/kudi/agent/kshock/usecases/GetWalletUseCase;", "paybackOverdueLoan", "Lai/kudi/agent/kshock/usecases/PaybackOverdueLoan;", "submitRequest", "Lai/kudi/agent/kshock/usecases/SubmitTransactionRequest;", "(Lai/kudi/agent/kshock/usecases/FetchLoanHistory;Lai/kudi/agent/kshock/usecases/FetchOverdueLoanHistory;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/kshock/navigator/KShockNavigator;Lai/kudi/agent/kshock/usecases/PaybackLoan;Lai/kudi/agent/kshock/usecases/GetWalletUseCase;Lai/kudi/agent/kshock/usecases/PaybackOverdueLoan;Lai/kudi/agent/kshock/usecases/SubmitTransactionRequest;)V", "calculateAccruedOverdueInterest", "", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "calculatePendingAmount", "", "(Lai/kudi/agent/kshock/data/model/Loan;)Ljava/lang/Double;", "calculateTotalLoanDue", "checkWalletBalance", "", "fireP2pTransaction", "p2pData", "Lai/kudi/agent/kshock/data/model/P2pData;", "getOverdueLoans", "getPendingLoans", "maxLoanAmt", "initialData", "navigateToExistingLoaner", "navigateToOverdueLoanDetails", "navigateToOverduePaymentResult", TransactionField.STATUS, MetricTracker.Object.MESSAGE, "payBackManually", "loanId", "paybackOverdue", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KshockPendingLoansListViewModel extends BaseViewModel<KshockPendingLoansListViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchLoanHistory fetchLoanHistory;
    private final FetchOverdueLoanHistory fetchOverdueLoanHistory;
    private final GetWalletUseCase getWallet;
    private final KShockNavigator kShockNavigator;
    private final PaybackLoan paybackLoan;
    private final PaybackOverdueLoan paybackOverdueLoan;
    private final SubmitTransactionRequest submitRequest;

    public KshockPendingLoansListViewModel(FetchLoanHistory fetchLoanHistory, FetchOverdueLoanHistory fetchOverdueLoanHistory, FetchCurrentUser fetchCurrentUser, KShockNavigator kShockNavigator, PaybackLoan paybackLoan, GetWalletUseCase getWalletUseCase, PaybackOverdueLoan paybackOverdueLoan, SubmitTransactionRequest submitTransactionRequest) {
        Log_OC.getArray(fetchLoanHistory, "fetchLoanHistory");
        Log_OC.getArray(fetchOverdueLoanHistory, "fetchOverdueLoanHistory");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(kShockNavigator, "kShockNavigator");
        Log_OC.getArray(paybackLoan, "paybackLoan");
        Log_OC.getArray(getWalletUseCase, "getWallet");
        Log_OC.getArray(paybackOverdueLoan, "paybackOverdueLoan");
        Log_OC.getArray(submitTransactionRequest, "submitRequest");
        this.fetchLoanHistory = fetchLoanHistory;
        this.fetchOverdueLoanHistory = fetchOverdueLoanHistory;
        this.fetchCurrentUser = fetchCurrentUser;
        this.kShockNavigator = kShockNavigator;
        this.paybackLoan = paybackLoan;
        this.getWallet = getWalletUseCase;
        this.paybackOverdueLoan = paybackOverdueLoan;
        this.submitRequest = submitTransactionRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkWalletBalance$lambda-16  reason: not valid java name */
    public static final InterfaceC11692s m39595checkWalletBalance$lambda16(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Loan loan, User user) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        Log_OC.getArray(user, "it");
        GetWalletUseCase $r3 = kshockPendingLoansListViewModel.getWallet;
        String $r4 = loan == null ? null : loan.getPhoneNumber();
        if ($r4 == null) {
            $r4 = "";
        }
        AbstractC11688p $r5 = $r3.execute($r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkWalletBalance$lambda-17  reason: not valid java name */
    public static final void m39596checkWalletBalance$lambda17(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Loan loan, Wallet wallet) {
        Double $r5;
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.WalletBalanceHideLoading $r3 = KshockPendingLoansListViewData.WalletBalanceHideLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r3);
        double $d0 = 0.0d;
        double $d1 = wallet == null ? 0.0d : wallet.getAmount();
        if (loan != null && ($r5 = loan.getAmountOwed()) != null) {
            $d0 = $r5.doubleValue();
        }
        boolean $z0 = $d1 >= $d0;
        KshockPendingLoansListViewData.WalletBalance $r4 = new KshockPendingLoansListViewData.WalletBalance($z0);
        kshockPendingLoansListViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkWalletBalance$lambda-18  reason: not valid java name */
    public static final void m39597checkWalletBalance$lambda18(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Throwable th) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.WalletBalanceHideLoading $r2 = KshockPendingLoansListViewData.WalletBalanceHideLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "throwable");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        KshockPendingLoansListViewData.WalletBalanceError $r3 = new KshockPendingLoansListViewData.WalletBalanceError($r6);
        kshockPendingLoansListViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fireP2pTransaction$lambda-14  reason: not valid java name */
    public static final void m39598fireP2pTransaction$lambda14(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, TransactionResponse transactionResponse) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.P2PHideLoading $r2 = KshockPendingLoansListViewData.P2PHideLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r2);
        KshockPendingLoansListViewData.P2PSuccess $r3 = new KshockPendingLoansListViewData.P2PSuccess("Account funded successfully");
        kshockPendingLoansListViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fireP2pTransaction$lambda-15  reason: not valid java name */
    public static final void m39599fireP2pTransaction$lambda15(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Throwable th) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.P2PHideLoading $r2 = KshockPendingLoansListViewData.P2PHideLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        KshockPendingLoansListViewData.P2PError $r3 = new KshockPendingLoansListViewData.P2PError($r6);
        kshockPendingLoansListViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getOverdueLoans$lambda-10  reason: not valid java name */
    public static final InterfaceC11692s m39600getOverdueLoans$lambda10(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, User user) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        Log_OC.getArray(user, "it");
        FetchOverdueLoanHistory $r2 = kshockPendingLoansListViewModel.fetchOverdueLoanHistory;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        String $r4 = user.keywords;
        Log_OC.loadImage($r4, "it.bvn");
        AbstractC11688p $r5 = $r2.execute($r3, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x0021 */
    /* renamed from: getOverdueLoans$lambda-12  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m39601getOverdueLoans$lambda12(ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel r11, ai.kudi.agent.kshock.data.model.LoanHistoryResponse r12) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData$OverdueHideLoading r1 = ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData.OverdueHideLoading.INSTANCE
            r11.publish(r1)
            java.util.List r2 = r12.getData()
            if (r2 == 0) goto L43
            java.util.List r2 = r12.getData()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
        L1d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3b
            java.lang.Object r6 = r4.next()
            r8 = r6
            ai.kudi.agent.kshock.data.model.Loan r8 = (ai.kudi.agent.kshock.data.model.Loan) r8
            r7 = r8
            java.lang.String r9 = r7.getStatus()
            java.lang.String r0 = "OVERDUE"
            boolean r5 = kotlin.p483e0.p485d.Log_OC.append(r9, r0)
            if (r5 == 0) goto L1d
            r3.add(r6)
            goto L1d
        L3b:
            ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData$OverdueLoans r10 = new ai.kudi.agent.kshock.presentation.viewdata.KshockPendingLoansListViewData$OverdueLoans
            r10.<init>(r3)
            r11.publish(r10)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel.m39601getOverdueLoans$lambda12(ai.kudi.agent.kshock.presentation.KshockPendingLoansListViewModel, ai.kudi.agent.kshock.data.model.LoanHistoryResponse):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getOverdueLoans$lambda-13  reason: not valid java name */
    public static final void m39602getOverdueLoans$lambda13(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Throwable th) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.OverdueHideLoading $r2 = KshockPendingLoansListViewData.OverdueHideLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        KshockPendingLoansListViewData.OverdueError $r3 = new KshockPendingLoansListViewData.OverdueError($r6);
        kshockPendingLoansListViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPendingLoans$lambda-7  reason: not valid java name */
    public static final InterfaceC11692s m39603getPendingLoans$lambda7(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, User user) {
        Map $r5;
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        Log_OC.getArray(user, "it");
        FetchLoanHistory $r2 = kshockPendingLoansListViewModel.fetchLoanHistory;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "it.sessionId");
        C13287o $r4 = C13664u.m4227a("statuses", LoanStatusType.PENDING_PAYBACK);
        $r5 = C13725q0.m3897g($r4);
        AbstractC11688p $r6 = $r2.execute($r3, $r5);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPendingLoans$lambda-8  reason: not valid java name */
    public static final void m39604getPendingLoans$lambda8(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, LoanHistoryResponse loanHistoryResponse) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.HideLoading $r2 = KshockPendingLoansListViewData.HideLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r2);
        List $r4 = loanHistoryResponse == null ? null : loanHistoryResponse.getData();
        if ($r4 == null) {
            $r4 = C13726r.m3891e();
        }
        KshockPendingLoansListViewData.PendingLoans $r3 = new KshockPendingLoansListViewData.PendingLoans($r4);
        kshockPendingLoansListViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getPendingLoans$lambda-9  reason: not valid java name */
    public static final void m39605getPendingLoans$lambda9(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Throwable th) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.HideLoading $r2 = KshockPendingLoansListViewData.HideLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r2);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        KshockPendingLoansListViewData.Error $r3 = new KshockPendingLoansListViewData.Error($r6);
        kshockPendingLoansListViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: payBackManually$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39606payBackManually$lambda0(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, String str, User user) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        Log_OC.getArray(str, "$loanId");
        Log_OC.getArray(user, "it");
        PaybackLoan $r3 = kshockPendingLoansListViewModel.paybackLoan;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute(str, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: payBackManually$lambda-1  reason: not valid java name */
    public static final void m39607payBackManually$lambda1(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, String str, Loan loan) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        Log_OC.getArray(str, "$loanId");
        KshockPendingLoansListViewData.HidePaybackManuallyLoading $r3 = KshockPendingLoansListViewData.HidePaybackManuallyLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r3);
        KshockPendingLoansListViewData.PaybackManually $r4 = new KshockPendingLoansListViewData.PaybackManually(str);
        kshockPendingLoansListViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: payBackManually$lambda-2  reason: not valid java name */
    public static final void m39608payBackManually$lambda2(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Throwable th) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        KshockPendingLoansListViewData.Error $r2 = new KshockPendingLoansListViewData.Error($r5);
        kshockPendingLoansListViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: paybackOverdue$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m39609paybackOverdue$lambda3(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Loan loan, User user) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        Log_OC.getArray(user, "it");
        PaybackOverdueLoan $r3 = kshockPendingLoansListViewModel.paybackOverdueLoan;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute(loan, $r4);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: paybackOverdue$lambda-5  reason: not valid java name */
    public static final void m39610paybackOverdue$lambda5(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Loan loan, Loan loan2) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.HideOverduePaybackLoading $r3 = KshockPendingLoansListViewData.HideOverduePaybackLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r3);
        if (loan == null) {
            return;
        }
        KshockPendingLoansListViewData.OverduePayback $r4 = new KshockPendingLoansListViewData.OverduePayback("Your loan payment is in progress.");
        kshockPendingLoansListViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: paybackOverdue$lambda-6  reason: not valid java name */
    public static final void m39611paybackOverdue$lambda6(KshockPendingLoansListViewModel kshockPendingLoansListViewModel, Throwable th) {
        Log_OC.getArray(kshockPendingLoansListViewModel, "this$0");
        KshockPendingLoansListViewData.HideOverduePaybackLoading $r2 = KshockPendingLoansListViewData.HideOverduePaybackLoading.INSTANCE;
        kshockPendingLoansListViewModel.publish($r2);
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        boolean $z0 = Log_OC.append($r4, "Loan has a pending repayment from core");
        if ($z0) {
            KshockPendingLoansListViewData.OverduePayback $r5 = new KshockPendingLoansListViewData.OverduePayback("Your loan payment is in progress.");
            kshockPendingLoansListViewModel.publish($r5);
            return;
        }
        InterfaceC11767l $r32 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Object $r42 = $r32.invoke(th);
        String $r7 = (String) $r42;
        KshockPendingLoansListViewData.OverdueError $r6 = new KshockPendingLoansListViewData.OverdueError($r7);
        kshockPendingLoansListViewModel.publish($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String calculateAccruedOverdueInterest(Loan loan) {
        Double $r9;
        String $r4;
        Calendar $r2 = Calendar.getInstance();
        long $l1 = $r2.getTimeInMillis();
        String $r3 = "";
        if (loan != null && ($r4 = loan.getDueDate()) != null) {
            $r3 = $r4;
        }
        Date $r5 = StringExtKt.formatKudiDateAlt4($r3);
        long $l2 = $r5 == null ? 0L : $r5.getTime();
        TimeUnit $r6 = TimeUnit.DAYS;
        TimeUnit $r7 = TimeUnit.MILLISECONDS;
        long $l12 = $r6.convert($l1 - $l2, $r7);
        StringBuilder $r8 = new StringBuilder();
        $r8.append($l12);
        $r8.append($l12 > 1 ? " Days" : " Day");
        $r8.append(" - ");
        String $r32 = null;
        if (loan != null && ($r9 = loan.getAccruedOverdueInterest()) != null) {
            $r32 = StringExtKt.formatAmount($r9);
        }
        $r8.append((Object) $r32);
        return $r8.toString();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Double calculatePendingAmount(Loan loan) {
        Double $r2;
        Double $r22 = calculateTotalLoanDue(loan);
        if ($r22 == null) {
            return null;
        }
        double $d0 = $r22.doubleValue();
        double $d1 = 0.0d;
        if (loan != null && ($r2 = loan.getAmountPaidBack()) != null) {
            $d1 = $r2.doubleValue();
        }
        return Double.valueOf($d0 - $d1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Double calculateTotalLoanDue(Loan loan) {
        Double $r2;
        if (loan == null || ($r2 = loan.getAmountDisbursed()) == null) {
            return null;
        }
        double $d0 = $r2.doubleValue();
        Double $r22 = loan.getInitialInterest();
        double $d2 = $r22 == null ? 0.0d : $r22.doubleValue();
        double $d02 = $d0 + $d2;
        Double $r23 = loan.getAccruedOverdueInterest();
        double $d22 = $r23 == null ? 0.0d : $r23.doubleValue();
        double $d03 = $d02 + $d22;
        Double $r24 = loan.getAmountPaidBack();
        double $d1 = $r24 != null ? $r24.doubleValue() : 0.0d;
        return Double.valueOf($d03 - $d1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkWalletBalance(final Loan loan) {
        KshockPendingLoansListViewData.WalletBalanceLoading $r2 = KshockPendingLoansListViewData.WalletBalanceLoading.INSTANCE;
        publish($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                Loan $r22 = loan;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = KshockPendingLoansListViewModel.m39595checkWalletBalance$lambda16($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.IQTypeFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                Loan $r22 = loan;
                Wallet $r42 = (Wallet) obj;
                KshockPendingLoansListViewModel.m39596checkWalletBalance$lambda17($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KshockPendingLoansListViewModel.m39597checkWalletBalance$lambda18($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fireP2pTransaction(P2pData p2pData) {
        Log_OC.getArray(p2pData, "p2pData");
        KshockPendingLoansListViewData.P2PLoading $r2 = KshockPendingLoansListViewData.P2PLoading.INSTANCE;
        publish($r2);
        SubmitTransactionRequest $r3 = this.submitRequest;
        String $r4 = p2pData.getPhoneNumber();
        Log_OC.append($r4);
        String $r5 = p2pData.getRemark();
        Integer $r6 = p2pData.getAmount();
        Log_OC.append($r6);
        int $i0 = $r6.intValue();
        String $r7 = p2pData.getPin();
        Log_OC.append($r7);
        Method.Companion $r8 = Method.Companion;
        Method $r9 = $r8.wallet();
        TransactionRequest $r10 = new TransactionRequest($r4, $r5, $i0, $r7, TransactionRequest.TYPE_PAYMENT, $r9, 0, 64, null);
        AbstractC11688p $r11 = $r3.execute($r10);
        FavoritesArrayAdapter $r14 = $r11.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.Comment
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                TransactionResponse $r32 = (TransactionResponse) obj;
                KshockPendingLoansListViewModel.m39598fireP2pTransaction$lambda14($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KshockPendingLoansListViewModel.m39599fireP2pTransaction$lambda15($r1, $r32);
            }
        });
        Log_OC.loadImage($r14, "submitRequest.execute(\n            TransactionRequest(\n                target = p2pData.phoneNumber!!,\n                description = p2pData.remark,\n                amount = p2pData.amount!!,\n                type = TransactionRequest.TYPE_PAYMENT,\n                pin = p2pData.pin!!,\n                paymentMethod = Method.wallet()\n            )\n        ).subscribe(\n            {\n                publish(KshockPendingLoansListViewData.P2PHideLoading)\n                publish(KshockPendingLoansListViewData.P2PSuccess(\"Account funded successfully\"))\n            },\n            {\n                publish(KshockPendingLoansListViewData.P2PHideLoading)\n                publish(KshockPendingLoansListViewData.P2PError(parseHttpError2()(it)))\n            }\n        )");
        C11280b $r15 = getCompositeDisposable();
        RxExtKt.addTo($r14, $r15);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getOverdueLoans() {
        KshockPendingLoansListViewData.OverdueLoading $r1 = KshockPendingLoansListViewData.OverdueLoading.INSTANCE;
        publish($r1);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.FixedTableModel$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KshockPendingLoansListViewModel $r12 = KshockPendingLoansListViewModel.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = KshockPendingLoansListViewModel.m39600getOverdueLoans$lambda10($r12, $r4);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r12 = KshockPendingLoansListViewModel.this;
                LoanHistoryResponse $r32 = (LoanHistoryResponse) obj;
                KshockPendingLoansListViewModel.m39601getOverdueLoans$lambda12($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.Namespace
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r12 = KshockPendingLoansListViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KshockPendingLoansListViewModel.m39602getOverdueLoans$lambda13($r12, $r32);
            }
        });
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getPendingLoans(double d) {
        KshockPendingLoansListViewData.Loading $r1 = KshockPendingLoansListViewData.Loading.INSTANCE;
        publish($r1);
        FetchCurrentUser $r2 = this.fetchCurrentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        AbstractC11688p $r5 = $r3.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KshockPendingLoansListViewModel $r12 = KshockPendingLoansListViewModel.this;
                User $r4 = (User) obj;
                InterfaceC11692s $r22 = KshockPendingLoansListViewModel.m39603getPendingLoans$lambda7($r12, $r4);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.MultiUserChat$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r12 = KshockPendingLoansListViewModel.this;
                LoanHistoryResponse $r32 = (LoanHistoryResponse) obj;
                KshockPendingLoansListViewModel.m39604getPendingLoans$lambda8($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.AndFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r12 = KshockPendingLoansListViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KshockPendingLoansListViewModel.m39605getPendingLoans$lambda9($r12, $r32);
            }
        });
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        KshockPendingLoansListViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public KshockPendingLoansListViewData initialData() {
        KshockPendingLoansListViewData.Loading r1 = KshockPendingLoansListViewData.Loading.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToExistingLoaner(double d) {
        KShockNavigator $r1 = this.kShockNavigator;
        $r1.toExistingLoanerFragment(d, false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToOverdueLoanDetails(Loan loan) {
        Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
        KShockNavigator $r2 = this.kShockNavigator;
        $r2.toOverdueLoanDetailsFragment(loan);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToOverduePaymentResult(String str, String str2) {
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, MetricTracker.Object.MESSAGE);
        KShockNavigator $r3 = this.kShockNavigator;
        $r3.navigateToOverduePaymentResult(str, str2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void payBackManually(final String str) {
        Log_OC.getArray(str, "loanId");
        KshockPendingLoansListViewData.PaybackManuallyLoading $r2 = KshockPendingLoansListViewData.PaybackManuallyLoading.INSTANCE;
        publish($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                String $r22 = str;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = KshockPendingLoansListViewModel.m39606payBackManually$lambda0($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.ScalarSynchronousObservable$ScalarSynchronousAction
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                String $r22 = str;
                Loan $r42 = (Loan) obj;
                KshockPendingLoansListViewModel.m39607payBackManually$lambda1($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KshockPendingLoansListViewModel.m39608payBackManually$lambda2($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void paybackOverdue(final Loan loan) {
        KshockPendingLoansListViewData.OverduePaybackLoading $r2 = KshockPendingLoansListViewData.OverduePaybackLoading.INSTANCE;
        publish($r2);
        FetchCurrentUser $r3 = this.fetchCurrentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                Loan $r22 = loan;
                User $r5 = (User) obj;
                InterfaceC11692s $r32 = KshockPendingLoansListViewModel.m39609paybackOverdue$lambda3($r1, $r22, $r5);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.AccessibilityNodeInfoUtils$NodeActionFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                Loan $r22 = loan;
                Loan $r42 = (Loan) obj;
                KshockPendingLoansListViewModel.m39610paybackOverdue$lambda5($r1, $r22, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.MessageTypeFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                KshockPendingLoansListViewModel $r1 = KshockPendingLoansListViewModel.this;
                Throwable $r32 = (Throwable) obj;
                KshockPendingLoansListViewModel.m39611paybackOverdue$lambda6($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }
}
