package ai.kudi.agent.transactionhistory.data.source;

import ai.kudi.agent.core.network.AddNoteCommand;
import ai.kudi.agent.core.network.NetworkService;
import ai.kudi.agent.core.network.OutletMgtApi;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.dashboard.domain.fht.DashboardSummaryDto;
import ai.kudi.agent.outlet_mgt.data.OutletTransactionBreakdown;
import ai.kudi.agent.outlet_mgt.data.Summary;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletTransactionSummaryRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetTransactionSummaryRequest;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.mapper.IncompleteTransactionApiToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.SearchWalletActivityResponseToTransactionDataMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionApiToDataMapper;
import ai.kudi.agent.transactionhistory.mapper.WalletActivityApiToTransactionDataMapper;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.domain.dto.AllWallets;
import ai.kudi.agent.transactions.domain.dto.Method;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.package_1.Wallet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: TransactionsRemoteDataSource.kt */
@Metadata(m10422d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ4\u0010\r\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u000e2\u0006\u0010\u0011\u001a\u00020\u001eH\u0016J4\u0010\u001f\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000e2\u0006\u0010\u0011\u001a\u00020 H\u0002J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u000e2\u0006\u0010\u0011\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000e2\u0006\u0010\u0011\u001a\u00020 H\u0016J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u000e2\u0006\u0010\u0011\u001a\u00020\"H\u0016J4\u0010%\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001b0\u001b \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u000e0\u000e2\u0006\u0010\u0011\u001a\u00020 H\u0002J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u000e2\u0006\u0010\u0011\u001a\u00020\u001eH\u0016J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u000e2\u0006\u0010\u0011\u001a\u00020\u001eH\u0016J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u000e2\u0006\u0010\u0011\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/source/TransactionsRemoteDataSource;", "Lai/kudi/agent/transactionhistory/data/source/TransactionsRemoteSource;", "networkService", "Lai/kudi/agent/core/network/NetworkService;", "incompleteTransactionApiToTransactionDataMapper", "Lai/kudi/agent/transactionhistory/mapper/IncompleteTransactionApiToTransactionDataMapper;", "walletActivityApiToTransactionDataMapper", "Lai/kudi/agent/transactionhistory/mapper/WalletActivityApiToTransactionDataMapper;", "searchWalletActivityResponseToTransactionDataMapper", "Lai/kudi/agent/transactionhistory/mapper/SearchWalletActivityResponseToTransactionDataMapper;", "transactionApiToDataMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionApiToDataMapper;", "(Lai/kudi/agent/core/network/NetworkService;Lai/kudi/agent/transactionhistory/mapper/IncompleteTransactionApiToTransactionDataMapper;Lai/kudi/agent/transactionhistory/mapper/WalletActivityApiToTransactionDataMapper;Lai/kudi/agent/transactionhistory/mapper/SearchWalletActivityResponseToTransactionDataMapper;Lai/kudi/agent/transactionhistory/mapper/TransactionApiToDataMapper;)V", "dashboardSummary", "Lio/reactivex/Observable;", "Lai/kudi/agent/dashboard/domain/dto/DashboardSummaryDto;", "kotlin.jvm.PlatformType", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transactionhistory/data/source/request/GetTransactionSummaryRequest;", "generateTransactionSummary", "", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "totalAmount", "", "totalCount", "", Method.WALLET, "Lai/kudi/agent/transactions/domain/dto/AllWallets;", "incompleteTransactions", "Lai/kudi/agent/transactionhistory/data/model/TransactionDataModel;", "Lai/kudi/agent/transactionhistory/data/source/request/GetWalletActivitiesRequest;", "outletDashboardSummary", "Lai/kudi/agent/transactionhistory/data/source/request/GetOutletTransactionSummaryRequest;", "outletTransactions", "Lai/kudi/agent/transactionhistory/data/source/request/GetOutletWalletActivitiesRequest;", "outletTransactionsSummary", "outletWalletActivities", "outletWallets", "searchTransactions", "transactions", "transactionsSummary", "walletActivities", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionsRemoteDataSource implements TransactionsRemoteSource {
    private final IncompleteTransactionApiToTransactionDataMapper incompleteTransactionApiToTransactionDataMapper;
    private final NetworkService networkService;
    private final SearchWalletActivityResponseToTransactionDataMapper searchWalletActivityResponseToTransactionDataMapper;
    private final TransactionApiToDataMapper transactionApiToDataMapper;
    private final WalletActivityApiToTransactionDataMapper walletActivityApiToTransactionDataMapper;

    public TransactionsRemoteDataSource(NetworkService networkService, IncompleteTransactionApiToTransactionDataMapper incompleteTransactionApiToTransactionDataMapper, WalletActivityApiToTransactionDataMapper walletActivityApiToTransactionDataMapper, SearchWalletActivityResponseToTransactionDataMapper searchWalletActivityResponseToTransactionDataMapper, TransactionApiToDataMapper transactionApiToDataMapper) {
        Log_OC.getArray(networkService, "networkService");
        Log_OC.getArray(incompleteTransactionApiToTransactionDataMapper, "incompleteTransactionApiToTransactionDataMapper");
        Log_OC.getArray(walletActivityApiToTransactionDataMapper, "walletActivityApiToTransactionDataMapper");
        Log_OC.getArray(searchWalletActivityResponseToTransactionDataMapper, "searchWalletActivityResponseToTransactionDataMapper");
        Log_OC.getArray(transactionApiToDataMapper, "transactionApiToDataMapper");
        this.networkService = networkService;
        this.incompleteTransactionApiToTransactionDataMapper = incompleteTransactionApiToTransactionDataMapper;
        this.walletActivityApiToTransactionDataMapper = walletActivityApiToTransactionDataMapper;
        this.searchWalletActivityResponseToTransactionDataMapper = searchWalletActivityResponseToTransactionDataMapper;
        this.transactionApiToDataMapper = transactionApiToDataMapper;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p dashboardSummary(GetTransactionSummaryRequest getTransactionSummaryRequest) {
        HashMap $r8;
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        String $r4 = getTransactionSummaryRequest.getSessionId();
        String $r6 = getTransactionSummaryRequest.getFromDate();
        C13287o $r7 = C13664u.m4227a("from", $r6);
        String $r62 = getTransactionSummaryRequest.getToDate();
        C13287o $r72 = C13664u.m4227a("to", $r62);
        C13287o[] $r5 = {$r7, $r72};
        $r8 = C13727r0.m3879m($r5);
        AbstractC11688p $r9 = $r3.fetchDashboardSummary($r4, $r8);
        ClassWriter $r10 = ClassWriter.f1565b;
        return $r9.m10531O($r10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: dashboardSummary$lambda-17  reason: not valid java name */
    public static final DashboardSummaryDto m41000dashboardSummary$lambda17(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        DashboardSummaryDto $r2 = (DashboardSummaryDto) $r1;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0039 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List generateTransactionSummary(double r30, int r32, ai.kudi.agent.transactions.domain.dto.AllWallets r33) {
        /*
            r29 = this;
            java.util.Locale r3 = java.util.Locale.US
            java.text.NumberFormat r4 = java.text.NumberFormat.getNumberInstance(r3)
            r0 = r32
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = r4.format(r5)
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem r7 = new ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem
            r0 = r33
            ai.kudi.agent.users.domain.package_1.Wallet r8 = r0.getPrimaryWallet()
            double r9 = r8.getAmount()
            java.lang.Double r11 = java.lang.Double.valueOf(r9)
            java.lang.String r12 = ai.kudi.agent.core.util.StringExtKt.formatDecimalAmount(r11)
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType r13 = ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType.WALLET_BALANCE
            r7.<init>(r12, r13)
            r0 = r33
            java.util.List r14 = r0.getCommissionWallets()
            r9 = 0
            java.util.Iterator r15 = r14.iterator()
        L35:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L4f
            java.lang.Object r17 = r15.next()
            r19 = r17
            ai.kudi.agent.transactions.domain.dto.CommissionWallet r19 = (ai.kudi.agent.transactions.domain.dto.CommissionWallet) r19
            r18 = r19
            r0 = r18
            double r20 = r0.getAmount()
            r0 = r20
            double r9 = r9 + r0
            goto L35
        L4f:
            java.lang.Double r11 = java.lang.Double.valueOf(r9)
            java.lang.String r12 = ai.kudi.agent.core.util.StringExtKt.formatDecimalAmount(r11)
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType r13 = ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType.COMMISSION_WALLET
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem r22 = new ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem
            r0 = r22
            r0.<init>(r12, r13)
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem r23 = new ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem
            java.lang.String r24 = "value"
            r0 = r24
            kotlin.p483e0.p485d.Log_OC.loadImage(r6, r0)
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType r13 = ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType.TOTAL_COUNT
            r0 = r23
            r0.<init>(r6, r13)
            r0 = r30
            java.lang.Double r11 = java.lang.Double.valueOf(r0)
            java.lang.String r6 = ai.kudi.agent.core.util.StringExtKt.formatDecimalAmount(r11)
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem r25 = new ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType r13 = ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType.TOTAL_VALUE
            r0 = r25
            r0.<init>(r6, r13)
            r27 = 3
            r0 = r27
            ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem[] r0 = new ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem[r0]
            r26 = r0
            r27 = 0
            r26[r27] = r7
            r27 = 1
            r26[r27] = r23
            r27 = 2
            r26[r27] = r25
            r0 = r26
            java.util.List r14 = kotlin.p557z.C13722p.m3929k(r0)
            r0 = r33
            java.util.List r28 = r0.getCommissionWallets()
            r0 = r28
            boolean r16 = r0.isEmpty()
            r27 = 1
            r0 = r16
            r1 = r27
            r0 = r0 ^ r1
            r16 = r0
            if (r16 == 0) goto Lbd
            r27 = 1
            r0 = r27
            r1 = r22
            r14.add(r0, r1)
        Lbd:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource.generateTransactionSummary(double, int, ai.kudi.agent.transactions.domain.dto.AllWallets):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0033 */
    /* renamed from: incompleteTransactions$lambda-1  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41001incompleteTransactions$lambda1(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource r15, ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest r16, ai.kudi.agent.core.network.response.APIResponse r17) {
        /*
            java.lang.String r1 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r1)
            java.lang.String r1 = "$request"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "it"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            Data r2 = r0.data
            java.lang.String r1 = "it.data"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r1)
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r6 = kotlin.p557z.C13722p.m3921o(r3, r7)
            r5.<init>(r6)
            java.util.Iterator r8 = r3.iterator()
        L2f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4d
            java.lang.Object r2 = r8.next()
            r11 = r2
            ai.kudi.agent.transactionhistory.data.model.IncompleteTransaction r11 = (ai.kudi.agent.transactionhistory.data.model.IncompleteTransaction) r11
            r10 = r11
            ai.kudi.agent.transactionhistory.mapper.IncompleteTransactionApiToTransactionDataMapper r12 = r15.incompleteTransactionApiToTransactionDataMapper
            r0 = r16
            ai.kudi.agent.users.domain.package_1.User r13 = r0.getUser()
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r14 = r12.getShares(r10, r13)
            r5.add(r14)
            goto L2f
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource.m41001incompleteTransactions$lambda1(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource, ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest, ai.kudi.agent.core.network.response.APIResponse):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p outletDashboardSummary(GetOutletTransactionSummaryRequest getOutletTransactionSummaryRequest) {
        NetworkService $r2 = this.networkService;
        OutletMgtApi $r3 = $r2.getOutletApi();
        String $r4 = getOutletTransactionSummaryRequest.getSessionId();
        String $r5 = getOutletTransactionSummaryRequest.getOutletId();
        AbstractC11688p $r6 = $r3.fetchTransactionSummaryForOutlet($r4, $r5);
        C0583c $r7 = C0583c.f1576d;
        return $r6.m10531O($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: outletDashboardSummary$lambda-15  reason: not valid java name */
    public static final DashboardSummaryDto m41002outletDashboardSummary$lambda15(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        OutletTransactionBreakdown $r2 = (OutletTransactionBreakdown) $r1;
        Summary $r3 = $r2.getSummary();
        int $i0 = $r3.getTotalTransactionCount();
        Object $r12 = aPIResponse.data;
        OutletTransactionBreakdown $r22 = (OutletTransactionBreakdown) $r12;
        Summary $r32 = $r22.getSummary();
        int $i1 = $r32.getTotalPayoutsCount();
        Object $r13 = aPIResponse.data;
        OutletTransactionBreakdown $r23 = (OutletTransactionBreakdown) $r13;
        Summary $r33 = $r23.getSummary();
        double $d0 = $r33.getTotalTransactionsValue();
        DashboardSummaryDto $r4 = new DashboardSummaryDto(true, $i0, $d0, false, $i1);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0033 */
    /* renamed from: outletTransactions$lambda-11  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41003outletTransactions$lambda11(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource r15, ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest r16, ai.kudi.agent.core.network.response.APIResponse r17) {
        /*
            java.lang.String r1 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r1)
            java.lang.String r1 = "$request"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "it"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            Data r2 = r0.data
            java.lang.String r1 = "it.data"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r1)
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r6 = kotlin.p557z.C13722p.m3921o(r3, r7)
            r5.<init>(r6)
            java.util.Iterator r8 = r3.iterator()
        L2f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4d
            java.lang.Object r2 = r8.next()
            r11 = r2
            java.util.HashMap r11 = (java.util.HashMap) r11
            r10 = r11
            ai.kudi.agent.transactionhistory.mapper.TransactionApiToDataMapper r12 = r15.transactionApiToDataMapper
            r0 = r16
            ai.kudi.agent.users.domain.package_1.User r13 = r0.getUser()
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r14 = r12.parse(r10, r13)
            r5.add(r14)
            goto L2f
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource.m41003outletTransactions$lambda11(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource, ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest, ai.kudi.agent.core.network.response.APIResponse):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: outletTransactionsSummary$lambda-12  reason: not valid java name */
    public static final List m41004outletTransactionsSummary$lambda12(TransactionsRemoteDataSource transactionsRemoteDataSource, DashboardSummaryDto dashboardSummaryDto, AllWallets allWallets) {
        Log_OC.getArray(transactionsRemoteDataSource, "this$0");
        Log_OC.getArray(dashboardSummaryDto, "summary");
        Log_OC.getArray(allWallets, "wallets");
        double $d0 = dashboardSummaryDto.getTotalTransactionsValue();
        int $i0 = dashboardSummaryDto.getTotalTransactionCount();
        List $r3 = transactionsRemoteDataSource.generateTransactionSummary($d0, $i0, allWallets);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0033 */
    /* renamed from: outletWalletActivities$lambda-9  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41005outletWalletActivities$lambda9(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource r15, ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest r16, ai.kudi.agent.core.network.response.APIResponse r17) {
        /*
            java.lang.String r1 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r1)
            java.lang.String r1 = "$request"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "it"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            Data r2 = r0.data
            java.lang.String r1 = "it.data"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r1)
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r6 = kotlin.p557z.C13722p.m3921o(r3, r7)
            r5.<init>(r6)
            java.util.Iterator r8 = r3.iterator()
        L2f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4d
            java.lang.Object r2 = r8.next()
            r11 = r2
            ai.kudi.agent.users.data.model.WalletActivityModel r11 = (ai.kudi.agent.users.data.model.WalletActivityModel) r11
            r10 = r11
            ai.kudi.agent.transactionhistory.mapper.WalletActivityApiToTransactionDataMapper r12 = r15.walletActivityApiToTransactionDataMapper
            r0 = r16
            ai.kudi.agent.users.domain.package_1.User r13 = r0.getUser()
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r14 = r12.getGroupName(r10, r13)
            r5.add(r14)
            goto L2f
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource.m41005outletWalletActivities$lambda9(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource, ai.kudi.agent.transactionhistory.data.source.request.GetOutletWalletActivitiesRequest, ai.kudi.agent.core.network.response.APIResponse):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final AbstractC11688p outletWallets(GetOutletTransactionSummaryRequest getOutletTransactionSummaryRequest) {
        NetworkService $r2 = this.networkService;
        OutletMgtApi $r3 = $r2.getOutletApi();
        String $r4 = getOutletTransactionSummaryRequest.getSessionId();
        String $r5 = getOutletTransactionSummaryRequest.getOutletId();
        AbstractC11688p $r6 = $r3.getOutletWallets($r4, $r5);
        ServiceLocator $r7 = ServiceLocator.instance;
        return $r6.m10531O($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: outletWallets$lambda-16  reason: not valid java name */
    public static final AllWallets m41006outletWallets$lambda16(APIResponse aPIResponse) {
        List $r0;
        Log_OC.getArray(aPIResponse, "it");
        Object $r3 = aPIResponse.data;
        Log_OC.loadImage($r3, "it.data");
        Wallet $r4 = (Wallet) $r3;
        $r0 = C13726r.m3891e();
        AllWallets $r2 = new AllWallets($r4, $r0);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0033 */
    /* renamed from: searchTransactions$lambda-5  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41007searchTransactions$lambda5(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource r15, ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest r16, ai.kudi.agent.core.network.response.APIResponse r17) {
        /*
            java.lang.String r1 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r1)
            java.lang.String r1 = "$request"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "it"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            Data r2 = r0.data
            java.lang.String r1 = "it.data"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r1)
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r6 = kotlin.p557z.C13722p.m3921o(r3, r7)
            r5.<init>(r6)
            java.util.Iterator r8 = r3.iterator()
        L2f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4d
            java.lang.Object r2 = r8.next()
            r11 = r2
            ai.kudi.agent.users.data.model.SearchWalletActivityModel r11 = (ai.kudi.agent.users.data.model.SearchWalletActivityModel) r11
            r10 = r11
            ai.kudi.agent.transactionhistory.mapper.SearchWalletActivityResponseToTransactionDataMapper r12 = r15.searchWalletActivityResponseToTransactionDataMapper
            r0 = r16
            ai.kudi.agent.users.domain.package_1.User r13 = r0.getUser()
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r14 = r12.parseName(r10, r13)
            r5.add(r14)
            goto L2f
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource.m41007searchTransactions$lambda5(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource, ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest, ai.kudi.agent.core.network.response.APIResponse):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0033 */
    /* renamed from: transactions$lambda-7  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41008transactions$lambda7(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource r15, ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest r16, ai.kudi.agent.core.network.response.APIResponse r17) {
        /*
            java.lang.String r1 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r1)
            java.lang.String r1 = "$request"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "it"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            Data r2 = r0.data
            java.lang.String r1 = "it.data"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r1)
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r6 = kotlin.p557z.C13722p.m3921o(r3, r7)
            r5.<init>(r6)
            java.util.Iterator r8 = r3.iterator()
        L2f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4d
            java.lang.Object r2 = r8.next()
            r11 = r2
            java.util.HashMap r11 = (java.util.HashMap) r11
            r10 = r11
            ai.kudi.agent.transactionhistory.mapper.TransactionApiToDataMapper r12 = r15.transactionApiToDataMapper
            r0 = r16
            ai.kudi.agent.users.domain.package_1.User r13 = r0.getUser()
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r14 = r12.parse(r10, r13)
            r5.add(r14)
            goto L2f
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource.m41008transactions$lambda7(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource, ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest, ai.kudi.agent.core.network.response.APIResponse):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: transactionsSummary$lambda-13  reason: not valid java name */
    public static final AllWallets m41009transactionsSummary$lambda13(APIResponse aPIResponse) {
        Log_OC.getArray(aPIResponse, "it");
        Object $r1 = aPIResponse.data;
        AllWallets $r2 = (AllWallets) $r1;
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: transactionsSummary$lambda-14  reason: not valid java name */
    public static final List m41010transactionsSummary$lambda14(TransactionsRemoteDataSource transactionsRemoteDataSource, DashboardSummaryDto dashboardSummaryDto, AllWallets allWallets) {
        Log_OC.getArray(transactionsRemoteDataSource, "this$0");
        Log_OC.getArray(dashboardSummaryDto, "summary");
        Log_OC.getArray(allWallets, "wallets");
        double $d0 = dashboardSummaryDto.getTotalTransactionsValue();
        int $i0 = dashboardSummaryDto.getTotalTransactionCount();
        List $r3 = transactionsRemoteDataSource.generateTransactionSummary($d0, $i0, allWallets);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0033 */
    /* renamed from: walletActivities$lambda-3  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m41011walletActivities$lambda3(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource r15, ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest r16, ai.kudi.agent.core.network.response.APIResponse r17) {
        /*
            java.lang.String r1 = "this$0"
            kotlin.p483e0.p485d.Log_OC.getArray(r15, r1)
            java.lang.String r1 = "$request"
            r0 = r16
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            java.lang.String r1 = "it"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            Data r2 = r0.data
            java.lang.String r1 = "it.data"
            kotlin.p483e0.p485d.Log_OC.loadImage(r2, r1)
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r3 = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r6 = kotlin.p557z.C13722p.m3921o(r3, r7)
            r5.<init>(r6)
            java.util.Iterator r8 = r3.iterator()
        L2f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4d
            java.lang.Object r2 = r8.next()
            r11 = r2
            ai.kudi.agent.users.data.model.WalletActivityModel r11 = (ai.kudi.agent.users.data.model.WalletActivityModel) r11
            r10 = r11
            ai.kudi.agent.transactionhistory.mapper.WalletActivityApiToTransactionDataMapper r12 = r15.walletActivityApiToTransactionDataMapper
            r0 = r16
            ai.kudi.agent.users.domain.package_1.User r13 = r0.getUser()
            ai.kudi.agent.transactionhistory.data.model.TransactionDataModel r14 = r12.getGroupName(r10, r13)
            r5.add(r14)
            goto L2f
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource.m41011walletActivities$lambda3(ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteDataSource, ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest, ai.kudi.agent.core.network.response.APIResponse):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource
    public AbstractC11688p incompleteTransactions(final GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        User $r4 = getWalletActivitiesRequest.getUser();
        String $r5 = $r4 == null ? null : $r4.getSessionId();
        if ($r5 == null) {
            $r5 = "";
        }
        FetchRequest $r6 = getWalletActivitiesRequest.getFetchRequest();
        Map $r7 = $r6.getParams();
        AbstractC11688p $r8 = $r3.getUserIncompleteTransactions($r5, $r7).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.source.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsRemoteDataSource $r1 = TransactionsRemoteDataSource.this;
                GetWalletActivitiesRequest $r22 = getWalletActivitiesRequest;
                APIResponse $r52 = (APIResponse) obj;
                List $r32 = TransactionsRemoteDataSource.m41001incompleteTransactions$lambda1($r1, $r22, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r8, "networkService.api.getUserIncompleteTransactions(\n            request.user?.sessionId.orEmpty(),\n            request.fetchRequest.params\n        )\n            .map {\n                it.data.map { incompleteTransaction ->\n                    incompleteTransactionApiToTransactionDataMapper.map(incompleteTransaction, request.user)\n                }\n            }");
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource
    public AbstractC11688p outletTransactions(final GetOutletWalletActivitiesRequest getOutletWalletActivitiesRequest) {
        Log_OC.getArray(getOutletWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        NetworkService $r2 = this.networkService;
        OutletMgtApi $r3 = $r2.getOutletApi();
        User $r4 = getOutletWalletActivitiesRequest.getUser();
        String $r5 = $r4 == null ? null : $r4.getSessionId();
        if ($r5 == null) {
            $r5 = "";
        }
        String $r7 = getOutletWalletActivitiesRequest.getOutletId();
        String $r6 = $r7 != null ? $r7 : "";
        FetchRequest $r8 = getOutletWalletActivitiesRequest.getFetchRequest();
        Map $r9 = $r8.getParams();
        AbstractC11688p $r10 = $r3.fetchTransactionHistoryForOutlet($r5, $r6, $r9).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.source.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsRemoteDataSource $r1 = TransactionsRemoteDataSource.this;
                GetOutletWalletActivitiesRequest $r22 = getOutletWalletActivitiesRequest;
                APIResponse $r52 = (APIResponse) obj;
                List $r32 = TransactionsRemoteDataSource.m41003outletTransactions$lambda11($r1, $r22, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r10, "networkService.outletApi.fetchTransactionHistoryForOutlet(\n            request.user?.sessionId.orEmpty(),\n            request.outletId.orEmpty(),\n            request.fetchRequest.params\n        ).map {\n            it.data.map { transaction -> transactionApiToDataMapper.map(transaction, request.user) }\n        }");
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource
    public AbstractC11688p outletTransactionsSummary(GetOutletTransactionSummaryRequest getOutletTransactionSummaryRequest) {
        Log_OC.getArray(getOutletTransactionSummaryRequest, TransactionRequest.TYPE_REQUEST);
        AbstractC11688p $r3 = outletDashboardSummary(getOutletTransactionSummaryRequest);
        AbstractC11688p $r4 = outletWallets(getOutletTransactionSummaryRequest);
        AbstractC11688p $r32 = AbstractC11688p.m10491r0($r3, $r4, new InterfaceC11288b() { // from class: ai.kudi.agent.transactionhistory.data.source.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11288b
            /* renamed from: a */
            public final Object mo11200a(Object obj, Object obj2) {
                TransactionsRemoteDataSource $r1 = TransactionsRemoteDataSource.this;
                DashboardSummaryDto $r5 = (DashboardSummaryDto) obj;
                AllWallets $r6 = (AllWallets) obj2;
                List $r2 = TransactionsRemoteDataSource.m41004outletTransactionsSummary$lambda12($r1, $r5, $r6);
                return $r2;
            }
        });
        Log_OC.loadImage($r32, "zip(\n            outletDashboardSummary(request),\n            outletWallets(request),\n            { summary, wallets ->\n                generateTransactionSummary(\n                    summary.totalTransactionsValue,\n                    summary.totalTransactionCount,\n                    wallets\n                )\n            }\n        )");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource
    public AbstractC11688p outletWalletActivities(final GetOutletWalletActivitiesRequest getOutletWalletActivitiesRequest) {
        Log_OC.getArray(getOutletWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        NetworkService $r2 = this.networkService;
        OutletMgtApi $r3 = $r2.getOutletApi();
        User $r4 = getOutletWalletActivitiesRequest.getUser();
        String $r5 = $r4 == null ? null : $r4.getSessionId();
        if ($r5 == null) {
            $r5 = "";
        }
        String $r7 = getOutletWalletActivitiesRequest.getOutletId();
        String $r6 = $r7 != null ? $r7 : "";
        FetchRequest $r8 = getOutletWalletActivitiesRequest.getFetchRequest();
        Map $r9 = $r8.getParams();
        AbstractC11688p $r10 = $r3.fetchWalletHistoryForOutlet($r5, $r6, $r9).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.source.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsRemoteDataSource $r1 = TransactionsRemoteDataSource.this;
                GetOutletWalletActivitiesRequest $r22 = getOutletWalletActivitiesRequest;
                APIResponse $r52 = (APIResponse) obj;
                List $r32 = TransactionsRemoteDataSource.m41005outletWalletActivities$lambda9($r1, $r22, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r10, "networkService.outletApi.fetchWalletHistoryForOutlet(\n            request.user?.sessionId.orEmpty(),\n            request.outletId.orEmpty(),\n            request.fetchRequest.params\n        ).map {\n            it.data.map { walletActivity -> walletActivityApiToTransactionDataMapper.map(walletActivity, request.user) }\n        }");
        return $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource
    public AbstractC11688p searchTransactions(final GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        User $r4 = getWalletActivitiesRequest.getUser();
        String $r5 = $r4 == null ? null : $r4.getSessionId();
        if ($r5 == null) {
            $r5 = "";
        }
        FetchRequest $r6 = getWalletActivitiesRequest.getFetchRequest();
        Map $r7 = $r6.getParams();
        AbstractC11688p $r8 = $r3.searchWalletActivities($r5, $r7).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.source.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsRemoteDataSource $r1 = TransactionsRemoteDataSource.this;
                GetWalletActivitiesRequest $r22 = getWalletActivitiesRequest;
                APIResponse $r52 = (APIResponse) obj;
                List $r32 = TransactionsRemoteDataSource.m41007searchTransactions$lambda5($r1, $r22, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r8, "networkService.api.searchWalletActivities(\n            request.user?.sessionId.orEmpty(),\n            request.fetchRequest.params\n        )\n            .map {\n                it.data.map { transactions -> searchWalletActivityResponseToTransactionDataMapper.map(transactions, request.user) }\n            }");
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource
    public AbstractC11688p transactions(final GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        User $r4 = getWalletActivitiesRequest.getUser();
        String $r5 = $r4 == null ? null : $r4.getSessionId();
        if ($r5 == null) {
            $r5 = "";
        }
        FetchRequest $r6 = getWalletActivitiesRequest.getFetchRequest();
        Map $r7 = $r6.getParams();
        AbstractC11688p $r8 = $r3.getUserTransactions($r5, $r7).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.source.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsRemoteDataSource $r1 = TransactionsRemoteDataSource.this;
                GetWalletActivitiesRequest $r22 = getWalletActivitiesRequest;
                APIResponse $r52 = (APIResponse) obj;
                List $r32 = TransactionsRemoteDataSource.m41008transactions$lambda7($r1, $r22, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r8, "networkService.api.getUserTransactions(\n            request.user?.sessionId.orEmpty(),\n            request.fetchRequest.params\n        )\n            .map {\n                it.data.map { transactions -> transactionApiToDataMapper.map(transactions, request.user) }\n            }");
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource
    public AbstractC11688p transactionsSummary(GetTransactionSummaryRequest getTransactionSummaryRequest) {
        Log_OC.getArray(getTransactionSummaryRequest, TransactionRequest.TYPE_REQUEST);
        AbstractC11688p $r2 = dashboardSummary(getTransactionSummaryRequest);
        NetworkService $r3 = this.networkService;
        AddNoteCommand $r4 = $r3.getApi();
        String $r5 = getTransactionSummaryRequest.getSessionId();
        AbstractC11688p $r6 = $r4.getAllWallets($r5);
        Direction $r7 = Direction.f1566E;
        AbstractC11688p $r22 = AbstractC11688p.m10491r0($r2, $r6.m10531O($r7), new InterfaceC11288b() { // from class: ai.kudi.agent.transactionhistory.data.source.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11288b
            /* renamed from: a */
            public final Object mo11200a(Object obj, Object obj2) {
                TransactionsRemoteDataSource $r1 = TransactionsRemoteDataSource.this;
                DashboardSummaryDto $r52 = (DashboardSummaryDto) obj;
                AllWallets $r62 = (AllWallets) obj2;
                List $r23 = TransactionsRemoteDataSource.m41010transactionsSummary$lambda14($r1, $r52, $r62);
                return $r23;
            }
        });
        Log_OC.loadImage($r22, "zip(\n            dashboardSummary(request),\n            networkService.api.getAllWallets(request.sessionId).map { it.data },\n            { summary, wallets ->\n                generateTransactionSummary(\n                    summary.totalTransactionsValue,\n                    summary.totalTransactionCount,\n                    wallets\n                )\n            }\n        )");
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.data.source.TransactionsRemoteSource
    public AbstractC11688p walletActivities(final GetWalletActivitiesRequest getWalletActivitiesRequest) {
        Log_OC.getArray(getWalletActivitiesRequest, TransactionRequest.TYPE_REQUEST);
        NetworkService $r2 = this.networkService;
        AddNoteCommand $r3 = $r2.getApi();
        User $r4 = getWalletActivitiesRequest.getUser();
        String $r5 = $r4 == null ? null : $r4.getSessionId();
        if ($r5 == null) {
            $r5 = "";
        }
        FetchRequest $r6 = getWalletActivitiesRequest.getFetchRequest();
        Map $r7 = $r6.getParams();
        AbstractC11688p $r8 = $r3.getWalletActivities($r5, $r7).m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactionhistory.data.source.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionsRemoteDataSource $r1 = TransactionsRemoteDataSource.this;
                GetWalletActivitiesRequest $r22 = getWalletActivitiesRequest;
                APIResponse $r52 = (APIResponse) obj;
                List $r32 = TransactionsRemoteDataSource.m41011walletActivities$lambda3($r1, $r22, $r52);
                return $r32;
            }
        });
        Log_OC.loadImage($r8, "networkService.api.getWalletActivities(\n            request.user?.sessionId.orEmpty(),\n            request.fetchRequest.params\n        )\n            .map {\n                it.data.map { walletActivityModel -> walletActivityApiToTransactionDataMapper.map(walletActivityModel, request.user) }\n            }");
        return $r8;
    }
}
