package ai.kudi.agent.transactioncommissions.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.filter.domain.FilteredDate;
import ai.kudi.agent.transactioncommissions.domain.GetCommissionCashoutSummaryUseCase;
import ai.kudi.agent.transactioncommissions.navigator.TransactionCommissionsNavigator;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.data.source.request.GetWalletActivitiesRequest;
import ai.kudi.agent.transactionhistory.domain.usecases.FetchWalletActivities;
import ai.kudi.agent.transactionhistory.mapper.ServerTimeToTransactionDayMapper;
import ai.kudi.agent.transactionhistory.mapper.TransactionDataToUiMapper;
import ai.kudi.agent.transactionhistory.presentation.BaseTransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItem;
import ai.kudi.agent.transactionhistory.presentation.model.TransactionSummaryItemType;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.domain.dto.AllWallets;
import ai.kudi.agent.transactions.domain.dto.CommissionWallet;
import ai.kudi.agent.transactions.domain.dto.Method;
import ai.kudi.agent.transactions.domain.dto.WalletSummary;
import ai.kudi.agent.transactions.domain.usecases.GetAllWalletsUseCase;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: TransactionCommissionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002JD\u0010#\u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020\u001d2\b\b\u0002\u0010'\u001a\u00020\u001d2\b\b\u0002\u0010(\u001a\u00020\u001d2\b\b\u0002\u0010)\u001a\u00020\u001d2\b\b\u0002\u0010*\u001a\u00020\u001d2\b\b\u0002\u0010+\u001a\u00020,H\u0002J\u000e\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/J\u001e\u00100\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u001dJ\u0006\u00104\u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/BaseTransactionsViewModel;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "transactionsNavigator", "Lai/kudi/agent/transactioncommissions/navigator/TransactionCommissionsNavigator;", "fetchWalletActivities", "Lai/kudi/agent/transactionhistory/domain/usecases/FetchWalletActivities;", "resourceDelegate", "Lai/kudi/agent/core/util/ResourceDelegate;", "getAllWalletsUseCase", "Lai/kudi/agent/transactions/domain/usecases/GetAllWalletsUseCase;", "getCommissionCashoutSummaryUseCase", "Lai/kudi/agent/transactioncommissions/domain/GetCommissionCashoutSummaryUseCase;", "serverTimeToTransactionDayMapper", "Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;", "transactionDataToUiMapper", "Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/transactioncommissions/navigator/TransactionCommissionsNavigator;Lai/kudi/agent/transactionhistory/domain/usecases/FetchWalletActivities;Lai/kudi/agent/core/util/ResourceDelegate;Lai/kudi/agent/transactions/domain/usecases/GetAllWalletsUseCase;Lai/kudi/agent/transactioncommissions/domain/GetCommissionCashoutSummaryUseCase;Lai/kudi/agent/transactionhistory/mapper/ServerTimeToTransactionDayMapper;Lai/kudi/agent/transactionhistory/mapper/TransactionDataToUiMapper;)V", "generateTransactionSummary", "", "Lai/kudi/agent/transactionhistory/presentation/model/TransactionSummaryItem;", "totalPayoutsCount", "", Method.WALLET, "Lai/kudi/agent/transactions/domain/dto/AllWallets;", "currentWalletId", "", "initialData", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "loadSummary", "", "walletId", "loadTransactions", "newRequest", "Lai/kudi/agent/transactions/data/repositories/dto/FetchRequest;", "transactionType", "searchKeyword", "commissionWalletId", "fromDate", "toDate", "forceRefresh", "", "onCommissionItemClicked", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "onLoadData", "filteredDate", "Lai/kudi/agent/filter/domain/FilteredDate;", "appVersionCode", "onLoadMore", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionCommissionsViewModel extends BaseTransactionsViewModel {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchWalletActivities fetchWalletActivities;
    private final GetAllWalletsUseCase getAllWalletsUseCase;
    private final GetCommissionCashoutSummaryUseCase getCommissionCashoutSummaryUseCase;
    private final ResourceDelegate resourceDelegate;
    private final TransactionCommissionsNavigator transactionsNavigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionCommissionsViewModel(FetchCurrentUser fetchCurrentUser, Analytics analytics, TransactionCommissionsNavigator transactionCommissionsNavigator, FetchWalletActivities fetchWalletActivities, ResourceDelegate resourceDelegate, GetAllWalletsUseCase getAllWalletsUseCase, GetCommissionCashoutSummaryUseCase getCommissionCashoutSummaryUseCase, ServerTimeToTransactionDayMapper serverTimeToTransactionDayMapper, TransactionDataToUiMapper transactionDataToUiMapper) {
        super(serverTimeToTransactionDayMapper, transactionDataToUiMapper);
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(transactionCommissionsNavigator, "transactionsNavigator");
        Log_OC.getArray(fetchWalletActivities, "fetchWalletActivities");
        Log_OC.getArray(resourceDelegate, "resourceDelegate");
        Log_OC.getArray(getAllWalletsUseCase, "getAllWalletsUseCase");
        Log_OC.getArray(getCommissionCashoutSummaryUseCase, "getCommissionCashoutSummaryUseCase");
        Log_OC.getArray(serverTimeToTransactionDayMapper, "serverTimeToTransactionDayMapper");
        Log_OC.getArray(transactionDataToUiMapper, "transactionDataToUiMapper");
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.transactionsNavigator = transactionCommissionsNavigator;
        this.fetchWalletActivities = fetchWalletActivities;
        this.resourceDelegate = resourceDelegate;
        this.getAllWalletsUseCase = getAllWalletsUseCase;
        this.getCommissionCashoutSummaryUseCase = getCommissionCashoutSummaryUseCase;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    private final List generateTransactionSummary(int i, AllWallets allWallets, String str) {
        Number $r11;
        CommissionWallet commissionWallet;
        List $r9;
        Locale $r4 = Locale.US;
        NumberFormat $r5 = NumberFormat.getNumberInstance($r4);
        Integer $r6 = Integer.valueOf(i);
        String $r7 = $r5.format($r6);
        Log_OC.loadImage($r7, "getNumberInstance(Locale.US).format(totalPayoutsCount)");
        TransactionSummaryItemType $r8 = TransactionSummaryItemType.PAYOUT_TOTAL_COUNT;
        TransactionSummaryItem $r1 = new TransactionSummaryItem($r7, $r8);
        List $r92 = allWallets.getCommissionWallets();
        Iterator $r10 = $r92.iterator();
        while (true) {
            boolean $z0 = $r10.hasNext();
            $r11 = null;
            if (!$z0) {
                commissionWallet = null;
                break;
            }
            Object $r12 = $r10.next();
            commissionWallet = $r12;
            boolean $z02 = Log_OC.append(((CommissionWallet) $r12).getId(), str);
            if ($z02) {
                break;
            }
        }
        CommissionWallet $r14 = commissionWallet;
        if ($r14 != null) {
            double $d0 = $r14.getAmount();
            $r11 = Double.valueOf($d0);
        }
        if ($r11 == null) {
            $r11 = 0;
        }
        String $r3 = StringExtKt.formatDecimalAmount($r11);
        TransactionSummaryItemType $r82 = TransactionSummaryItemType.COMMISSION_TOTAL_VALUE;
        TransactionSummaryItem $r16 = new TransactionSummaryItem($r3, $r82);
        TransactionSummaryItem[] $r17 = {$r16, $r1};
        $r9 = C13726r.m3888h($r17);
        return $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadSummary(final String str) {
        ViewData $r2 = getState();
        TransactionsViewState $r3 = (TransactionsViewState) $r2;
        publish(TransactionsViewState.copy$default($r3, true, false, false, false, false, null, null, 0, null, null, 1022, null));
        GetCommissionCashoutSummaryUseCase $r4 = this.getCommissionCashoutSummaryUseCase;
        AbstractC11688p $r5 = $r4.execute(str);
        GetAllWalletsUseCase $r6 = this.getAllWalletsUseCase;
        AbstractC11688p $r7 = $r6.execute();
        FavoritesArrayAdapter $r11 = AbstractC11688p.m10491r0($r5, $r7, new InterfaceC11288b() { // from class: ai.kudi.agent.transactioncommissions.presentation.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11288b
            /* renamed from: a */
            public final Object mo11200a(Object obj, Object obj2) {
                TransactionCommissionsViewModel $r1 = TransactionCommissionsViewModel.this;
                String $r22 = str;
                WalletSummary $r62 = (WalletSummary) obj;
                AllWallets $r72 = (AllWallets) obj2;
                List $r32 = TransactionCommissionsViewModel.m40969loadSummary$lambda2($r1, $r22, $r62, $r72);
                return $r32;
            }
        }).e0(new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsViewModel $r1 = TransactionCommissionsViewModel.this;
                List $r32 = (List) obj;
                TransactionCommissionsViewModel.m40970loadSummary$lambda3($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsViewModel $r1 = TransactionCommissionsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                TransactionCommissionsViewModel.m40971loadSummary$lambda4($r1, $r32);
            }
        });
        C11280b $r12 = getCompositeDisposable();
        $r12.b($r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSummary$lambda-2  reason: not valid java name */
    public static final List m40969loadSummary$lambda2(TransactionCommissionsViewModel transactionCommissionsViewModel, String str, WalletSummary walletSummary, AllWallets allWallets) {
        Log_OC.getArray(transactionCommissionsViewModel, "this$0");
        Log_OC.getArray(str, "$walletId");
        Log_OC.getArray(walletSummary, "summary");
        Log_OC.getArray(allWallets, "wallets");
        int $i0 = walletSummary.getCount();
        List $r4 = transactionCommissionsViewModel.generateTransactionSummary($i0, allWallets, str);
        return $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSummary$lambda-3  reason: not valid java name */
    public static final void m40970loadSummary$lambda3(TransactionCommissionsViewModel transactionCommissionsViewModel, List list) {
        Log_OC.getArray(transactionCommissionsViewModel, "this$0");
        ViewData $r2 = transactionCommissionsViewModel.getState();
        Log_OC.loadImage(list, "summary");
        TransactionsViewState $r3 = TransactionsViewState.copy$default((TransactionsViewState) $r2, false, false, false, false, false, null, list, 0, null, null, 942, null);
        transactionCommissionsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadSummary$lambda-4  reason: not valid java name */
    public static final void m40971loadSummary$lambda4(TransactionCommissionsViewModel transactionCommissionsViewModel, Throwable th) {
        Log_OC.getArray(transactionCommissionsViewModel, "this$0");
        ViewData $r2 = transactionCommissionsViewModel.getState();
        TransactionsViewState $r3 = TransactionsViewState.copy$default((TransactionsViewState) $r2, false, false, false, false, true, null, null, 0, null, null, 1006, null);
        transactionCommissionsViewModel.publish($r3);
        Timber.reorder(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadTransactions(final FetchRequest fetchRequest) {
        ViewData $r2 = getState();
        TransactionsViewState $r3 = (TransactionsViewState) $r2;
        boolean $z0 = $r3.isLoadingTransactions();
        if ($z0) {
            return;
        }
        ViewData $r22 = getState();
        TransactionsViewState $r32 = (TransactionsViewState) $r22;
        boolean $z02 = $r32.isLoadingMore();
        if ($z02) {
            return;
        }
        boolean $z03 = isAllPagesExhausted();
        if ($z03) {
            return;
        }
        int $i0 = getCurrentPage();
        boolean $z04 = $i0 > 0;
        int $i02 = getCurrentPage();
        boolean z = $i02 == 0;
        ViewData $r23 = getState();
        TransactionsViewState $r33 = (TransactionsViewState) $r23;
        publish(TransactionsViewState.copy$default($r33, false, z, $z04, false, false, null, null, 0, null, null, 1009, null));
        FetchWalletActivities $r4 = this.fetchWalletActivities;
        User $r6 = getUser();
        GetWalletActivitiesRequest $r5 = new GetWalletActivitiesRequest($r6, fetchRequest, null, false, 12, null);
        AbstractC11688p $r7 = $r4.execute($r5);
        FavoritesArrayAdapter $r11 = $r7.m10531O(new InterfaceC11291f() { // from class: ai.kudi.agent.transactioncommissions.presentation.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionCommissionsViewModel $r1 = TransactionCommissionsViewModel.this;
                List $r24 = (List) obj;
                return TransactionCommissionsViewModel.m40972loadTransactions$lambda7($r1, $r24);
            }
        }).e0(new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsViewModel $r1 = TransactionCommissionsViewModel.this;
                FetchRequest $r24 = fetchRequest;
                List $r42 = (List) obj;
                TransactionCommissionsViewModel.m40973loadTransactions$lambda8($r1, $r24, $r42);
            }
        }, new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsViewModel $r1 = TransactionCommissionsViewModel.this;
                Throwable $r34 = (Throwable) obj;
                TransactionCommissionsViewModel.m40974loadTransactions$lambda9($r1, $r34);
            }
        });
        C11280b $r12 = getCompositeDisposable();
        $r12.b($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void loadTransactions(String str, String str2, String str3, String str4, String str5, boolean z) {
        FetchRequest $r5 = new FetchRequest(null, 1, null);
        int $i0 = getCurrentPage();
        String $r7 = String.valueOf($i0);
        $r5.setPage($r7);
        $r5.setProduct_type(str);
        $r5.setTo(str5);
        $r5.setFrom(str4);
        $r5.setValue(str2);
        $r5.setWalletId(str3);
        FetchRequest $r8 = getRequest();
        boolean $z1 = Log_OC.append($r8, $r5);
        if (!$z1 || z) {
            loadTransactions($r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void loadTransactions$default(TransactionCommissionsViewModel transactionCommissionsViewModel, String $r1, String $r2, String $r3, String $r4, String $r5, boolean $z0, int i, Object obj) {
        int $i1 = i & 1;
        if ($i1 != 0) {
            $r1 = "";
        }
        int $i12 = i & 2;
        if ($i12 != 0) {
            $r2 = "";
        }
        int $i13 = i & 4;
        if ($i13 != 0) {
            $r3 = "";
        }
        int $i14 = i & 8;
        if ($i14 != 0) {
            $r4 = "";
        }
        int $i15 = i & 16;
        if ($i15 != 0) {
            $r5 = "";
        }
        int $i0 = i & 32;
        if ($i0 != 0) {
            $z0 = false;
        }
        transactionCommissionsViewModel.loadTransactions($r1, $r2, $r3, $r4, $r5, $z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-7  reason: not valid java name */
    public static final List m40972loadTransactions$lambda7(TransactionCommissionsViewModel transactionCommissionsViewModel, List list) {
        Log_OC.getArray(transactionCommissionsViewModel, "this$0");
        Log_OC.getArray(list, "it");
        boolean $z0 = list.isEmpty();
        transactionCommissionsViewModel.setAllPagesExhausted($z0);
        List $r0 = transactionCommissionsViewModel.mapTransactionsData(list);
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-8  reason: not valid java name */
    public static final void m40973loadTransactions$lambda8(TransactionCommissionsViewModel transactionCommissionsViewModel, FetchRequest fetchRequest, List list) {
        Log_OC.getArray(transactionCommissionsViewModel, "this$0");
        Log_OC.getArray(fetchRequest, "$newRequest");
        transactionCommissionsViewModel.setRequest(fetchRequest);
        boolean $z0 = list.isEmpty();
        ViewData $r3 = transactionCommissionsViewModel.getState();
        Log_OC.loadImage(list, "transactions");
        TransactionsViewState $r4 = TransactionsViewState.copy$default((TransactionsViewState) $r3, false, false, false, $z0, false, list, null, 0, null, null, 977, null);
        transactionCommissionsViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadTransactions$lambda-9  reason: not valid java name */
    public static final void m40974loadTransactions$lambda9(TransactionCommissionsViewModel transactionCommissionsViewModel, Throwable th) {
        List $r5;
        Log_OC.getArray(transactionCommissionsViewModel, "this$0");
        C11680b $r2 = transactionCommissionsViewModel.getToastMessage();
        ResourceDelegate $r3 = transactionCommissionsViewModel.resourceDelegate;
        String $r4 = $r3.getString(C0001R.string.error_loading_transactions);
        $r2.mo331f($r4);
        Timber.reorder(th);
        int $i0 = transactionCommissionsViewModel.getCurrentPage();
        if ($i0 == 0) {
            $r5 = C13726r.m3891e();
        } else {
            ViewData $r6 = transactionCommissionsViewModel.getState();
            $r5 = ((TransactionsViewState) $r6).getTransactions();
        }
        ViewData $r62 = transactionCommissionsViewModel.getState();
        TransactionsViewState $r7 = TransactionsViewState.copy$default((TransactionsViewState) $r62, false, false, false, false, false, $r5, null, 0, null, null, 985, null);
        transactionCommissionsViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onLoadData$lambda-0  reason: not valid java name */
    public static final void m40975onLoadData$lambda0(TransactionCommissionsViewModel transactionCommissionsViewModel, FilteredDate filteredDate, String str, User user) {
        Log_OC.getArray(transactionCommissionsViewModel, "this$0");
        Log_OC.getArray(filteredDate, "$filteredDate");
        Log_OC.getArray(str, "$walletId");
        transactionCommissionsViewModel.setUser(user);
        Date $r4 = filteredDate.getFrom();
        String $r5 = DateExtKt.convertDateToGivenFormat($r4, "yyyy-MM-dd HH:mm:ss");
        Date $r42 = filteredDate.getTo();
        String $r6 = DateExtKt.convertDateToGivenFormat($r42, "yyyy-MM-dd HH:mm:ss");
        loadTransactions$default(transactionCommissionsViewModel, null, null, str, $r5, $r6, true, 3, null);
        transactionCommissionsViewModel.loadSummary(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.presentation.BaseTransactionsViewModel, ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        TransactionsViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.presentation.BaseTransactionsViewModel, ai.kudi.agent.core.mvvm.BaseViewModel
    public TransactionsViewState initialData() {
        TransactionsViewState $r1 = new TransactionsViewState(false, false, false, false, false, null, null, 0, null, null, 1023, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCommissionItemClicked(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "transaction");
        TransactionCommissionsNavigator $r2 = this.transactionsNavigator;
        $r2.onTransactionCommissionDetails(transaction);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadData(final String str, final FilteredDate filteredDate, String str2) {
        Log_OC.getArray(str, "walletId");
        Log_OC.getArray(filteredDate, "filteredDate");
        Log_OC.getArray(str2, "appVersionCode");
        setFilteredDate(filteredDate);
        setCurrentPage(0);
        setAllPagesExhausted(false);
        Set $r4 = getExistingDays();
        $r4.clear();
        C11280b $r5 = getCompositeDisposable();
        FetchCurrentUser $r6 = this.fetchCurrentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsViewModel $r1 = TransactionCommissionsViewModel.this;
                FilteredDate $r2 = filteredDate;
                String $r3 = str;
                User $r52 = (User) obj;
                TransactionCommissionsViewModel.m40975onLoadData$lambda0($r1, $r2, $r3, $r52);
            }
        };
        Chunk $r9 = Chunk.NEWLINE;
        FavoritesArrayAdapter $r10 = $r7.s(object, $r9);
        $r5.b($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onLoadMore() {
        User $r1 = getUser();
        if ($r1 == null) {
            return;
        }
        int $i0 = getCurrentPage();
        setCurrentPage($i0 + 1);
        FetchRequest $r2 = getRequest();
        int $i02 = getCurrentPage();
        String $r3 = String.valueOf($i02);
        $r2.setPage($r3);
        FetchRequest $r22 = getRequest();
        loadTransactions($r22);
    }
}
