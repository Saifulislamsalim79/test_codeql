package ai.kudi.agent.transactioncommissions.presentation;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactioncommissions.data.CommissionCashoutRequest;
import ai.kudi.agent.transactioncommissions.data.CommissionCashoutResponse;
import ai.kudi.agent.transactioncommissions.domain.LoanProviderUseCase;
import ai.kudi.agent.transactioncommissions.domain.RequestCommissionsCashoutUseCase;
import ai.kudi.agent.transactions.domain.dto.AllWallets;
import ai.kudi.agent.transactions.domain.dto.CommissionWallet;
import ai.kudi.agent.transactions.domain.usecases.GetAllWalletsUseCase;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11782b0;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13742z;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
import p590o.p591a.Timber;
/* compiled from: TransactionCommissionsActivityViewModel.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0002H\u0016J\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001bJ\u0006\u0010'\u001a\u00020#J\u0006\u0010(\u001a\u00020#J\u0006\u0010)\u001a\u00020#J\u0006\u0010*\u001a\u00020#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsActivityViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsActivityViewState;", "resource", "Lai/kudi/agent/core/util/ResourceDelegate;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "requestCommissionsCashoutUseCase", "Lai/kudi/agent/transactioncommissions/domain/RequestCommissionsCashoutUseCase;", "getAllWalletsUseCase", "Lai/kudi/agent/transactions/domain/usecases/GetAllWalletsUseCase;", "loanProviderUseCase", "Lai/kudi/agent/transactioncommissions/domain/LoanProviderUseCase;", "(Lai/kudi/agent/core/util/ResourceDelegate;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/transactioncommissions/domain/RequestCommissionsCashoutUseCase;Lai/kudi/agent/transactions/domain/usecases/GetAllWalletsUseCase;Lai/kudi/agent/transactioncommissions/domain/LoanProviderUseCase;)V", "commissionWallets", "Lio/reactivex/subjects/PublishSubject;", "", "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "getCommissionWallets", "()Lio/reactivex/subjects/PublishSubject;", "isLoanProvider", "", "onCashOutComplete", "getOnCashOutComplete", "toastMessage", "", "getToastMessage", "userPhone", "getUserPhone", "()Ljava/lang/String;", "setUserPhone", "(Ljava/lang/String;)V", "fetchWallets", "", "initialData", "onCashOutConfirmed", "walletId", "onCashoutAction", "onCashoutCancelled", "onMoreOptionsAction", "onViewCreate", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionCommissionsActivityViewModel extends BaseViewModel<TransactionCommissionsActivityViewState> {
    private final Analytics analytics;
    private final C11680b<List<CommissionWallet>> commissionWallets;
    private final FetchCurrentUser currentUser;
    private final GetAllWalletsUseCase getAllWalletsUseCase;
    private final C11680b<Boolean> isLoanProvider;
    private final LoanProviderUseCase loanProviderUseCase;
    private final C11680b<Boolean> onCashOutComplete;
    private final RequestCommissionsCashoutUseCase requestCommissionsCashoutUseCase;
    private final ResourceDelegate resource;
    private final C11680b<String> toastMessage;
    private String userPhone;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionCommissionsActivityViewModel(ResourceDelegate resourceDelegate, Analytics analytics, FetchCurrentUser fetchCurrentUser, RequestCommissionsCashoutUseCase requestCommissionsCashoutUseCase, GetAllWalletsUseCase getAllWalletsUseCase, LoanProviderUseCase loanProviderUseCase) {
        Log_OC.getArray(resourceDelegate, "resource");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(requestCommissionsCashoutUseCase, "requestCommissionsCashoutUseCase");
        Log_OC.getArray(getAllWalletsUseCase, "getAllWalletsUseCase");
        Log_OC.getArray(loanProviderUseCase, "loanProviderUseCase");
        this.resource = resourceDelegate;
        this.analytics = analytics;
        this.currentUser = fetchCurrentUser;
        this.requestCommissionsCashoutUseCase = requestCommissionsCashoutUseCase;
        this.getAllWalletsUseCase = getAllWalletsUseCase;
        this.loanProviderUseCase = loanProviderUseCase;
        C11680b $r7 = C11680b.m10564v0();
        Log_OC.loadImage($r7, "create()");
        this.toastMessage = $r7;
        C11680b $r72 = C11680b.m10564v0();
        Log_OC.loadImage($r72, "create()");
        this.commissionWallets = $r72;
        C11680b $r73 = C11680b.m10564v0();
        Log_OC.loadImage($r73, "create()");
        this.onCashOutComplete = $r73;
        C11680b $r74 = C11680b.m10564v0();
        Log_OC.loadImage($r74, "create()");
        this.isLoanProvider = $r74;
        this.userPhone = "";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchWallets() {
        ViewData $r1 = getState();
        TransactionCommissionsActivityViewState $r2 = (TransactionCommissionsActivityViewState) $r1;
        publish($r2.copy(true));
        FetchCurrentUser $r3 = this.currentUser;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default($r3, null, null, 3, null);
        AbstractC11688p $r6 = $r4.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactioncommissions.presentation.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                TransactionCommissionsActivityViewModel $r12 = TransactionCommissionsActivityViewModel.this;
                User $r42 = (User) obj;
                InterfaceC11692s $r22 = TransactionCommissionsActivityViewModel.m40960fetchWallets$lambda4($r12, $r42);
                return $r22;
            }
        });
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsActivityViewModel $r12 = TransactionCommissionsActivityViewModel.this;
                List $r32 = (List) obj;
                TransactionCommissionsActivityViewModel.m40962fetchWallets$lambda5($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsActivityViewModel $r12 = TransactionCommissionsActivityViewModel.this;
                Throwable $r32 = (Throwable) obj;
                TransactionCommissionsActivityViewModel.m40963fetchWallets$lambda6($r12, $r32);
            }
        });
        Log_OC.loadImage($r9, "currentUser.execute().flatMapObservable {\n            Observable.zip(\n                getAllWalletsUseCase.execute(), loanProviderUseCase.execute(it.sessionId)\n            ) { walletList, isLoanProvider ->\n                val commissionWalletList = walletList.commissionWallets.toMutableList()\n                if (!isLoanProvider) {\n                    val wallet = commissionWalletList.find { wallet ->\n                        wallet.label?.equals(resource.getString(R.string.loan_provider_commission)) ?: false\n                    }\n                    commissionWalletList.remove(wallet)\n                }\n                commissionWalletList\n            }\n        }.subscribe(\n            {\n                publish(state.copy(isLoading = false))\n                commissionWallets.onNext(it)\n            },\n            {\n                val message = parseHttpError2(resource.getString(R.string.error_loading_wallet_information))(it)\n                toastMessage.onNext(message)\n                publish(state.copy(isLoading = false))\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchWallets$lambda-4  reason: not valid java name */
    public static final InterfaceC11692s m40960fetchWallets$lambda4(final TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel, User user) {
        Log_OC.getArray(transactionCommissionsActivityViewModel, "this$0");
        Log_OC.getArray(user, "it");
        GetAllWalletsUseCase $r2 = transactionCommissionsActivityViewModel.getAllWalletsUseCase;
        AbstractC11688p $r3 = $r2.execute();
        LoanProviderUseCase $r4 = transactionCommissionsActivityViewModel.loanProviderUseCase;
        String $r5 = user.getSessionId();
        Log_OC.loadImage($r5, "it.sessionId");
        AbstractC11688p $r6 = $r4.execute($r5);
        return AbstractC11688p.m10491r0($r3, $r6, new InterfaceC11288b() { // from class: ai.kudi.agent.transactioncommissions.presentation.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11288b
            /* renamed from: a */
            public final Object mo11200a(Object obj, Object obj2) {
                TransactionCommissionsActivityViewModel $r1 = TransactionCommissionsActivityViewModel.this;
                AllWallets $r52 = (AllWallets) obj;
                Boolean $r62 = (Boolean) obj2;
                List $r22 = TransactionCommissionsActivityViewModel.m40961fetchWallets$lambda4$lambda3($r1, $r52, $r62);
                return $r22;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: fetchWallets$lambda-4$lambda-3  reason: not valid java name */
    public static final List m40961fetchWallets$lambda4$lambda3(TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel, AllWallets allWallets, Boolean bool) {
        List $r3;
        CommissionWallet commissionWallet;
        boolean $z0;
        Log_OC.getArray(transactionCommissionsActivityViewModel, "this$0");
        Log_OC.getArray(allWallets, "walletList");
        Log_OC.getArray(bool, "isLoanProvider");
        $r3 = C13742z.m3823D0(allWallets.getCommissionWallets());
        boolean $z02 = bool.booleanValue();
        if ($z02) {
            return $r3;
        }
        Iterator $r4 = $r3.iterator();
        while (true) {
            boolean $z03 = $r4.hasNext();
            if (!$z03) {
                commissionWallet = null;
                break;
            }
            Object $r5 = $r4.next();
            commissionWallet = $r5;
            CommissionWallet $r7 = (CommissionWallet) $r5;
            String $r8 = $r7.getLabel();
            if ($r8 == null) {
                $z0 = false;
                continue;
            } else {
                ResourceDelegate $r9 = transactionCommissionsActivityViewModel.resource;
                String $r10 = $r9.getString(C0001R.string.loan_provider_commission);
                $z0 = $r8.equals($r10);
                continue;
            }
            if ($z0) {
                break;
            }
        }
        CommissionWallet $r72 = commissionWallet;
        if ($r3 == null) {
            NullPointerException $r12 = new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            throw $r12;
        }
        Collection $r11 = C11782b0.m10350a($r3);
        $r11.remove($r72);
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchWallets$lambda-5  reason: not valid java name */
    public static final void m40962fetchWallets$lambda5(TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel, List list) {
        Log_OC.getArray(transactionCommissionsActivityViewModel, "this$0");
        ViewData $r2 = transactionCommissionsActivityViewModel.getState();
        TransactionCommissionsActivityViewState $r3 = (TransactionCommissionsActivityViewState) $r2;
        transactionCommissionsActivityViewModel.publish($r3.copy(false));
        C11680b $r4 = transactionCommissionsActivityViewModel.getCommissionWallets();
        $r4.mo331f(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchWallets$lambda-6  reason: not valid java name */
    public static final void m40963fetchWallets$lambda6(TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel, Throwable th) {
        Log_OC.getArray(transactionCommissionsActivityViewModel, "this$0");
        ResourceDelegate $r2 = transactionCommissionsActivityViewModel.resource;
        String $r3 = $r2.getString(C0001R.string.error_loading_wallet_information);
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default($r3, null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r32 = (String) $r5;
        C11680b $r6 = transactionCommissionsActivityViewModel.getToastMessage();
        $r6.mo331f($r32);
        ViewData $r7 = transactionCommissionsActivityViewModel.getState();
        TransactionCommissionsActivityViewState $r8 = (TransactionCommissionsActivityViewState) $r7;
        transactionCommissionsActivityViewModel.publish($r8.copy(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCashOutConfirmed$lambda-7  reason: not valid java name */
    public static final void m40964onCashOutConfirmed$lambda7(TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel, CommissionCashoutResponse commissionCashoutResponse) {
        Log_OC.getArray(transactionCommissionsActivityViewModel, "this$0");
        ViewData $r2 = transactionCommissionsActivityViewModel.getState();
        TransactionCommissionsActivityViewState $r3 = (TransactionCommissionsActivityViewState) $r2;
        transactionCommissionsActivityViewModel.publish($r3.copy(false));
        C11680b $r4 = transactionCommissionsActivityViewModel.getOnCashOutComplete();
        Boolean $r5 = Boolean.TRUE;
        $r4.mo331f($r5);
        Analytics $r6 = transactionCommissionsActivityViewModel.analytics;
        String $r7 = transactionCommissionsActivityViewModel.getUserPhone();
        $r6.onConfirmCommissionsCashout($r7, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCashOutConfirmed$lambda-8  reason: not valid java name */
    public static final void m40965onCashOutConfirmed$lambda8(TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel, Throwable th) {
        Log_OC.getArray(transactionCommissionsActivityViewModel, "this$0");
        Timber.reorder(th);
        ViewData $r2 = transactionCommissionsActivityViewModel.getState();
        TransactionCommissionsActivityViewState $r3 = (TransactionCommissionsActivityViewState) $r2;
        transactionCommissionsActivityViewModel.publish($r3.copy(false));
        ResourceDelegate $r4 = transactionCommissionsActivityViewModel.resource;
        String $r5 = $r4.getString(C0001R.string.unable_to_process_payments_message);
        InterfaceC11767l $r6 = KudiErrorParserKt.parseHttpError2$default($r5, null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r7 = $r6.invoke(th);
        String $r52 = (String) $r7;
        C11680b $r8 = transactionCommissionsActivityViewModel.getToastMessage();
        $r8.mo331f($r52);
        Analytics $r9 = transactionCommissionsActivityViewModel.analytics;
        String $r53 = transactionCommissionsActivityViewModel.getUserPhone();
        $r9.onConfirmCommissionsCashout($r53, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreate$lambda-0  reason: not valid java name */
    public static final void m40966onViewCreate$lambda0(TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel, User user) {
        Log_OC.getArray(transactionCommissionsActivityViewModel, "this$0");
        String $r2 = user.getPhoneNumber();
        Log_OC.loadImage($r2, "user.phoneNumber");
        transactionCommissionsActivityViewModel.setUserPhone($r2);
        Analytics $r3 = transactionCommissionsActivityViewModel.analytics;
        $r3.onCommissionPage(transactionCommissionsActivityViewModel.getUserPhone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreate$lambda-1  reason: not valid java name */
    public static final void m40967onViewCreate$lambda1(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getCommissionWallets() {
        C11680b r1 = this.commissionWallets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getOnCashOutComplete() {
        C11680b r1 = this.onCashOutComplete;
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
    public final String getUserPhone() {
        String r1 = this.userPhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        TransactionCommissionsActivityViewState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public TransactionCommissionsActivityViewState initialData() {
        TransactionCommissionsActivityViewState $r1 = new TransactionCommissionsActivityViewState(false, 1, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b isLoanProvider() {
        C11680b r1 = this.isLoanProvider;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCashOutConfirmed(String str) {
        Log_OC.getArray(str, "walletId");
        ViewData $r2 = getState();
        TransactionCommissionsActivityViewState $r3 = (TransactionCommissionsActivityViewState) $r2;
        publish($r3.copy(true));
        CommissionCashoutRequest $r4 = new CommissionCashoutRequest(str);
        RequestCommissionsCashoutUseCase $r5 = this.requestCommissionsCashoutUseCase;
        AbstractC11688p $r6 = $r5.execute($r4);
        FavoritesArrayAdapter $r9 = $r6.e0(new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsActivityViewModel $r1 = TransactionCommissionsActivityViewModel.this;
                CommissionCashoutResponse $r32 = (CommissionCashoutResponse) obj;
                TransactionCommissionsActivityViewModel.m40964onCashOutConfirmed$lambda7($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.MultiUserChat$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsActivityViewModel $r1 = TransactionCommissionsActivityViewModel.this;
                Throwable $r32 = (Throwable) obj;
                TransactionCommissionsActivityViewModel.m40965onCashOutConfirmed$lambda8($r1, $r32);
            }
        });
        C11280b $r10 = getCompositeDisposable();
        $r10.b($r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCashoutAction() {
        Analytics $r1 = this.analytics;
        String $r2 = this.userPhone;
        $r1.onCommissionsCashout($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCashoutCancelled() {
        Analytics $r1 = this.analytics;
        String $r2 = this.userPhone;
        $r1.onCancelCommissionsCashout($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onMoreOptionsAction() {
        Analytics $r1 = this.analytics;
        String $r2 = this.userPhone;
        $r1.onCommissionOptions($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onViewCreate() {
        C11280b $r1 = getCompositeDisposable();
        FetchCurrentUser $r2 = this.currentUser;
        AbstractC11696w $r3 = FetchCurrentUser.execute$default($r2, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactioncommissions.presentation.OfflineMessageManager$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsActivityViewModel $r12 = TransactionCommissionsActivityViewModel.this;
                User $r32 = (User) obj;
                TransactionCommissionsActivityViewModel.m40966onViewCreate$lambda0($r12, $r32);
            }
        };
        Message$RecipientType $r5 = Message$RecipientType.f1540TO;
        FavoritesArrayAdapter $r6 = $r3.s(object, $r5);
        $r1.b($r6);
        fetchWallets();
    }

    public final void setUserPhone(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.userPhone = str;
    }
}
