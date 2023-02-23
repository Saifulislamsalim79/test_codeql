package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.FirebaseAnalyticsImpl;
import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.core.util.ResourceDelegate;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import ai.kudi.agent.withdraw_cash.domain.model.UssdWithdrawalVoucherModel;
import ai.kudi.agent.withdraw_cash.domain.usecases.CardlessWithdrawalUsecase;
import ai.kudi.agent.withdraw_cash.domain.usecases.FetchUssdWithdrawalProviderListUsecase;
import ai.kudi.agent.withdraw_cash.domain.wiki.CardlessWithdrawalApiCommData;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewData;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.VoucherData;
import ai.kudi.agent.withdraw_cash.utils.UssdWithdrawalProviderFactoryKt;
import ai.kudi.agent.withdraw_cash.utils.UssdWithdrawalUtilKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: UssdWithdrawalVoucherInputViewModel.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0017J\u0006\u0010\u001f\u001a\u00020\u0014J\"\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0006\u0010'\u001a\u00020\u0014J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010)\u001a\u00020\u0014J\u0016\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputViewData;", "context", "Lai/kudi/agent/core/util/ResourceDelegate;", "usecase", "Lai/kudi/agent/withdraw_cash/domain/usecases/CardlessWithdrawalUsecase;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchProvidersList", "Lai/kudi/agent/withdraw_cash/domain/usecases/FetchUssdWithdrawalProviderListUsecase;", "(Lai/kudi/agent/core/util/ResourceDelegate;Lai/kudi/agent/withdraw_cash/domain/usecases/CardlessWithdrawalUsecase;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/withdraw_cash/domain/usecases/FetchUssdWithdrawalProviderListUsecase;)V", "providerList", "Ljava/util/ArrayList;", "Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;", "Lkotlin/collections/ArrayList;", "selectedProvider", "fetchProviderList", "", "getAvailableProviders", "", "", "getProviderByName", "name", "initialData", "onFailure", MetricTracker.Object.MESSAGE, "onProviderSelected", BanksWithMethods.BANK_NAME, "onRetryButtonClicked", "onTransactionComponentsFetchSuccessful", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Request;", "response", "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Response;", "feesLookupResponse", "Lai/kudi/agent/bills/domain/usecases/FeesLookupResponse;", "onViewCreated", "onVoucherCodeValidationSuccess", "stop", "validateInput", "voucherCode", "phoneNumber", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewModel */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherInputViewModel extends BaseViewModel<UssdWithdrawalVoucherInputViewData> {
    public static final Companion Companion;
    public static final int SCREEN_INPUT_FORM = 2;
    public static final int SCREEN_LOADING = 0;
    public static final int SCREEN_RETRY = 1;
    private final Analytics analytics;
    private final ResourceDelegate context;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchUssdWithdrawalProviderListUsecase fetchProvidersList;
    private final ArrayList<UssdWithdrawalProvider> providerList;
    private UssdWithdrawalProvider selectedProvider;
    private final CardlessWithdrawalUsecase usecase;

    /* compiled from: UssdWithdrawalVoucherInputViewModel.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputViewModel$Companion;", "", "()V", "SCREEN_INPUT_FORM", "", "SCREEN_LOADING", "SCREEN_RETRY", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewModel$Companion */
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
    public UssdWithdrawalVoucherInputViewModel(ResourceDelegate resourceDelegate, CardlessWithdrawalUsecase cardlessWithdrawalUsecase, FetchCurrentUser fetchCurrentUser, Analytics analytics, FetchUssdWithdrawalProviderListUsecase fetchUssdWithdrawalProviderListUsecase) {
        Log_OC.getArray(resourceDelegate, "context");
        Log_OC.getArray(cardlessWithdrawalUsecase, "usecase");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchUssdWithdrawalProviderListUsecase, "fetchProvidersList");
        this.context = resourceDelegate;
        this.usecase = cardlessWithdrawalUsecase;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.fetchProvidersList = fetchUssdWithdrawalProviderListUsecase;
        ArrayList $r6 = new ArrayList();
        this.providerList = $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchProviderList() {
        ArrayList $r1 = this.providerList;
        boolean $z0 = $r1.isEmpty();
        if (!$z0) {
            return;
        }
        ArrayList $r12 = this.providerList;
        List $r2 = UssdWithdrawalProviderFactoryKt.getLocalUssdWithdrawalProvider();
        $r12.addAll($r2);
        ViewData $r3 = getState();
        UssdWithdrawalVoucherInputViewData $r4 = UssdWithdrawalVoucherInputViewData.copy$default((UssdWithdrawalVoucherInputViewData) $r3, false, null, null, 0, null, null, false, false, false, false, 2, false, false, false, null, null, 64511, null);
        publish($r4);
        FetchUssdWithdrawalProviderListUsecase $r5 = this.fetchProvidersList;
        AbstractC11688p $r6 = $r5.execute();
        Item $r7 = ClassWriter.LogError();
        AbstractC11688p $r62 = $r6.h0($r7);
        Item $r72 = ContextUtils.LogError();
        FavoritesArrayAdapter $r10 = $r62.R($r72).e0(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherInputViewModel $r13 = UssdWithdrawalVoucherInputViewModel.this;
                List $r32 = (List) obj;
                UssdWithdrawalVoucherInputViewModel.m41839fetchProviderList$lambda1($r13, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherInputViewModel $r13 = UssdWithdrawalVoucherInputViewModel.this;
                Throwable $r32 = (Throwable) obj;
                UssdWithdrawalVoucherInputViewModel.m41840fetchProviderList$lambda2($r13, $r32);
            }
        });
        Log_OC.loadImage($r10, "fetchProvidersList.execute().subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread()).subscribe(\n                { list ->\n                    list?.let {\n                        // This condition happens when the database is cleared before adding new set\n                        // of data to the database\n                        if (providerList.isNotEmpty() && it.isEmpty())\n                            return@subscribe\n                        providerList.clear()\n                        providerList.addAll(it)\n                        if (providerList.isNotEmpty())\n                            publish(\n                                state.copy(\n                                    screenStateId = SCREEN_INPUT_FORM,\n                                    showScreenLoader = false\n                                )\n                            )\n                    }\n                },\n                {\n                    publish(\n                        state.copy(screenStateId = SCREEN_RETRY, showScreenLoader = false)\n                    )\n                }\n            )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProviderList$lambda-1  reason: not valid java name */
    public static final void m41839fetchProviderList$lambda1(UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel, List list) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "this$0");
        if (list == null) {
            return;
        }
        ArrayList $r2 = ussdWithdrawalVoucherInputViewModel.providerList;
        boolean $z0 = $r2.isEmpty();
        if (!$z0) {
            boolean $z02 = list.isEmpty();
            if ($z02) {
                return;
            }
        }
        ArrayList $r22 = ussdWithdrawalVoucherInputViewModel.providerList;
        $r22.clear();
        ArrayList $r23 = ussdWithdrawalVoucherInputViewModel.providerList;
        $r23.addAll(list);
        ArrayList $r24 = ussdWithdrawalVoucherInputViewModel.providerList;
        boolean $z03 = $r24.isEmpty();
        if (!$z03) {
            ViewData $r3 = ussdWithdrawalVoucherInputViewModel.getState();
            UssdWithdrawalVoucherInputViewData $r4 = UssdWithdrawalVoucherInputViewData.copy$default((UssdWithdrawalVoucherInputViewData) $r3, false, null, null, 0, null, null, false, false, false, false, 2, false, false, false, null, null, 64510, null);
            ussdWithdrawalVoucherInputViewModel.publish($r4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchProviderList$lambda-2  reason: not valid java name */
    public static final void m41840fetchProviderList$lambda2(UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel, Throwable th) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "this$0");
        ViewData $r2 = ussdWithdrawalVoucherInputViewModel.getState();
        UssdWithdrawalVoucherInputViewData $r3 = UssdWithdrawalVoucherInputViewData.copy$default((UssdWithdrawalVoucherInputViewData) $r2, false, null, null, 0, null, null, false, false, false, false, 1, false, false, false, null, null, 64510, null);
        ussdWithdrawalVoucherInputViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider getProviderByName(java.lang.String r10) {
        /*
            r9 = this;
            java.util.ArrayList<ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider> r0 = r9.providerList
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider r5 = (ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider) r5
            r4 = r5
            boolean r2 = r4.getEnable()
            if (r2 == 0) goto L6
            java.lang.String r6 = r4.getBankName()
            r7 = 1
            boolean r2 = kotlin.p549l0.C13265j.m5472s(r6, r10, r7)
            if (r2 == 0) goto L6
            return r4
        L26:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewModel.getProviderByName(java.lang.String):ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onFailure(String $r1) {
        if ($r1 == null) {
            $r1 = "";
        }
        ViewData $r2 = getState();
        UssdWithdrawalVoucherInputViewData $r3 = UssdWithdrawalVoucherInputViewData.copy$default((UssdWithdrawalVoucherInputViewData) $r2, false, null, $r1, C0001R.C0003id.et_voucher, null, null, false, false, false, false, 0, false, false, false, null, null, 51186, null);
        publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onProviderSelected$lambda-3  reason: not valid java name */
    public static final void m41841onProviderSelected$lambda3(UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel, User user) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "this$0");
        Analytics $r3 = ussdWithdrawalVoucherInputViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.onUssdProviderSelected($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onProviderSelected$lambda-4  reason: not valid java name */
    public static final void m41842onProviderSelected$lambda4(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onTransactionComponentsFetchSuccessful(CardlessWithdrawalApiCommData.Request request, CardlessWithdrawalApiCommData.Response response, FeesLookupResponse feesLookupResponse) {
        ArrayList $r4 = new ArrayList();
        UssdWithdrawalProvider $r5 = this.selectedProvider;
        Log_OC.append($r5);
        String $r6 = $r5.getBankCode();
        boolean $z0 = Log_OC.append($r6, UssdWithdrawalUtilKt.USSD_PROVIDER_KUDI_SAVE);
        if ($z0) {
            String $r62 = response.getRecipientPhoneNumber();
            UssdWithdrawalVoucherModel $r7 = new UssdWithdrawalVoucherModel("Recipient Number", $r62, false, 4, null);
            $r4.add($r7);
            String $r63 = response.getRequestReference();
            UssdWithdrawalVoucherModel $r72 = new UssdWithdrawalVoucherModel("Request Ref.", $r63, false, 4, null);
            $r4.add($r72);
            String $r64 = response.getAmount();
            UssdWithdrawalVoucherModel $r73 = new UssdWithdrawalVoucherModel("Amount", StringExtKt.getFormatAmount($r64), false, 4, null);
            $r4.add($r73);
            Log_OC.append(feesLookupResponse);
            String $r65 = feesLookupResponse.getServiceFee();
            UssdWithdrawalVoucherModel $r74 = new UssdWithdrawalVoucherModel("Nomba Charge", StringExtKt.getFormatAmount($r65), false, 4, null);
            $r4.add($r74);
        }
        String $r66 = response.getAmount();
        VoucherData $r8 = new VoucherData($r66, $r4, request);
        ViewData $r9 = getState();
        UssdWithdrawalVoucherInputViewData $r10 = (UssdWithdrawalVoucherInputViewData) $r9;
        publish(UssdWithdrawalVoucherInputViewData.copy$default($r10, false, "", "", -1, null, null, false, false, false, false, 0, false, true, false, $r8, null, 34800, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onVoucherCodeValidationSuccess(final CardlessWithdrawalApiCommData.Request request, final CardlessWithdrawalApiCommData.Response response) {
        CardlessWithdrawalUsecase $r3 = this.usecase;
        String $r5 = response.getAmount();
        FeesLookupRequest $r4 = new FeesLookupRequest("withdrawal_cardless", $r5, "withdrawal_cardless");
        AbstractC11688p $r6 = $r3.fetchServiceCharge($r4);
        Item $r7 = ClassWriter.LogError();
        AbstractC11688p $r62 = $r6.h0($r7);
        Item $r72 = ContextUtils.LogError();
        FavoritesArrayAdapter $r10 = $r62.R($r72).e0(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherInputViewModel $r1 = UssdWithdrawalVoucherInputViewModel.this;
                CardlessWithdrawalApiCommData.Request $r2 = request;
                CardlessWithdrawalApiCommData.Response $r32 = response;
                FeesLookupResponse $r52 = (FeesLookupResponse) obj;
                UssdWithdrawalVoucherInputViewModel.m41843onVoucherCodeValidationSuccess$lambda12($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.PacketIDFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherInputViewModel $r1 = UssdWithdrawalVoucherInputViewModel.this;
                Throwable $r32 = (Throwable) obj;
                UssdWithdrawalVoucherInputViewModel.m41844onVoucherCodeValidationSuccess$lambda13($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "usecase.fetchServiceCharge(\n            FeesLookupRequest(\n                \"withdrawal_cardless\",\n                response.amount,\n                productId = \"withdrawal_cardless\"\n            )\n        )\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n\n                    onTransactionComponentsFetchSuccessful(\n                        request.copy(\n                            amount = response.amount.sanitizeFormattedAmount()!!.toBigDecimal()\n                        ),\n                        response, it\n                    )\n                },\n                {\n                    publish(\n                        state.copy(\n                            toastMsg = parseHttpError2(\"Unable to fetch Nomba Charge for this transaction, please retry\")(\n                                it\n                            ),\n                            errorMsg = \"\",\n                            errorViewId = -1,\n                            openBankSelector = false,\n                            openAmountInputScreen = false,\n                            openVoucherScreen = false,\n                            voucherData = null\n                        )\n\n                    )\n                }\n            )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onVoucherCodeValidationSuccess$lambda-12  reason: not valid java name */
    public static final void m41843onVoucherCodeValidationSuccess$lambda12(UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel, CardlessWithdrawalApiCommData.Request request, CardlessWithdrawalApiCommData.Response response, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "this$0");
        Log_OC.getArray(request, "$request");
        Log_OC.getArray(response, "$response");
        String $r5 = StringExtKt.sanitizeFormattedAmount(response.getAmount());
        Log_OC.append($r5);
        BigDecimal $r3 = new BigDecimal($r5);
        CardlessWithdrawalApiCommData.Request $r4 = CardlessWithdrawalApiCommData.Request.copy$default(request, null, null, null, $r3, 7, null);
        ussdWithdrawalVoucherInputViewModel.onTransactionComponentsFetchSuccessful($r4, response, feesLookupResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onVoucherCodeValidationSuccess$lambda-13  reason: not valid java name */
    public static final void m41844onVoucherCodeValidationSuccess$lambda13(UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel, Throwable th) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "this$0");
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Unable to fetch Nomba Charge for this transaction, please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        ViewData $r5 = ussdWithdrawalVoucherInputViewModel.getState();
        UssdWithdrawalVoucherInputViewData $r6 = UssdWithdrawalVoucherInputViewData.copy$default((UssdWithdrawalVoucherInputViewData) $r5, false, (String) $r3, "", -1, null, null, false, false, false, false, 0, false, false, false, null, null, 34801, null);
        ussdWithdrawalVoucherInputViewModel.publish($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInput$lambda-10  reason: not valid java name */
    public static final void m41845validateInput$lambda10(final UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel, final CardlessWithdrawalApiCommData.Request request, final User user) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "this$0");
        Log_OC.getArray(request, "$request");
        CardlessWithdrawalUsecase $r3 = ussdWithdrawalVoucherInputViewModel.usecase;
        AbstractC11688p $r4 = $r3.validateVoucher(request);
        Item $r5 = ContextUtils.LogError();
        AbstractC11688p $r42 = $r4.R($r5);
        Item $r52 = ClassWriter.LogError();
        FavoritesArrayAdapter $r8 = $r42.h0($r52).e0(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.ExtensionData
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherInputViewModel $r1 = UssdWithdrawalVoucherInputViewModel.this;
                CardlessWithdrawalApiCommData.Request $r2 = request;
                User $r32 = user;
                APIResponse $r53 = (APIResponse) obj;
                UssdWithdrawalVoucherInputViewModel.m41846validateInput$lambda10$lambda8($r1, $r2, $r32, $r53);
            }
        }, new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.StandardShowcaseDrawer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherInputViewModel $r1 = UssdWithdrawalVoucherInputViewModel.this;
                User $r2 = user;
                Throwable $r43 = (Throwable) obj;
                UssdWithdrawalVoucherInputViewModel.m41847validateInput$lambda10$lambda9($r1, $r2, $r43);
            }
        });
        Log_OC.loadImage($r8, "usecase.validateVoucher(request)\n                            .observeOn(AndroidSchedulers.mainThread())\n                            .subscribeOn(Schedulers.io())\n                            .subscribe(\n                                {\n                                    onVoucherCodeValidationSuccess(request, it.data)\n                                    analytics.onUssdVoucherCodeValidated(\n                                        user.phoneNumber,\n                                        FirebaseAnalyticsImpl.STATUS_SUCCESS\n                                    )\n                                },\n                                {\n                                    onFailure(parseHttpError2(\"Something went wrong\")(it))\n                                    analytics.onUssdVoucherCodeValidated(\n                                        user.phoneNumber,\n                                        FirebaseAnalyticsImpl.STATUS_FAILURE\n                                    )\n                                }\n                            )");
        C11280b $r9 = ussdWithdrawalVoucherInputViewModel.getCompositeDisposable();
        RxExtKt.addTo($r8, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInput$lambda-10$lambda-8  reason: not valid java name */
    public static final void m41846validateInput$lambda10$lambda8(UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel, CardlessWithdrawalApiCommData.Request request, User user, APIResponse aPIResponse) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "this$0");
        Log_OC.getArray(request, "$request");
        Object $r5 = aPIResponse.data;
        Log_OC.loadImage($r5, "it.data");
        CardlessWithdrawalApiCommData.Response $r6 = (CardlessWithdrawalApiCommData.Response) $r5;
        ussdWithdrawalVoucherInputViewModel.onVoucherCodeValidationSuccess(request, $r6);
        Analytics $r7 = ussdWithdrawalVoucherInputViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "user.phoneNumber");
        $r7.onUssdVoucherCodeValidated($r0, "success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInput$lambda-10$lambda-9  reason: not valid java name */
    public static final void m41847validateInput$lambda10$lambda9(UssdWithdrawalVoucherInputViewModel ussdWithdrawalVoucherInputViewModel, User user, Throwable th) {
        Log_OC.getArray(ussdWithdrawalVoucherInputViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Something went wrong", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        ussdWithdrawalVoucherInputViewModel.onFailure((String) $r4);
        Analytics $r6 = ussdWithdrawalVoucherInputViewModel.analytics;
        String $r5 = user.getPhoneNumber();
        Log_OC.loadImage($r5, "user.phoneNumber");
        $r6.onUssdVoucherCodeValidated($r5, FirebaseAnalyticsImpl.STATUS_FAILURE);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0036 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getAvailableProviders() {
        /*
            r11 = this;
            java.util.ArrayList<ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider> r0 = r11.providerList
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L23
            java.lang.Object r4 = r2.next()
            r6 = r4
            ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider r6 = (ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider) r6
            r5 = r6
            boolean r3 = r5.getEnable()
            if (r3 == 0) goto Lb
            r1.add(r4)
            goto Lb
        L23:
            java.util.ArrayList r0 = new java.util.ArrayList
            r8 = 10
            int r7 = kotlin.p557z.C13722p.m3921o(r1, r8)
            r0.<init>(r7)
            java.util.Iterator r2 = r1.iterator()
        L32:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r4 = r2.next()
            r9 = r4
            ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider r9 = (ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider) r9
            r5 = r9
            java.lang.String r10 = r5.getBankName()
            r0.add(r10)
            goto L32
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewModel.getAvailableProviders():java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        UssdWithdrawalVoucherInputViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public UssdWithdrawalVoucherInputViewData initialData() {
        UssdWithdrawalVoucherInputViewData $r1 = new UssdWithdrawalVoucherInputViewData(false, null, null, 0, null, null, false, false, false, false, 0, false, false, false, null, null, 65535, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onProviderSelected(String str) {
        Log_OC.getArray(str, BanksWithMethods.BANK_NAME);
        UssdWithdrawalProvider $r2 = getProviderByName(str);
        Log_OC.append($r2);
        this.selectedProvider = $r2;
        Log_OC.append($r2);
        boolean $z0 = UssdWithdrawalUtilKt.getCanShowPromptOnVoucherInput($r2);
        UssdWithdrawalProvider $r22 = this.selectedProvider;
        Log_OC.append($r22);
        boolean $z1 = UssdWithdrawalUtilKt.getRequiresVoucherCodeInput($r22);
        UssdWithdrawalProvider $r23 = this.selectedProvider;
        Log_OC.append($r23);
        String $r1 = $r23.getPrompt();
        UssdWithdrawalProvider $r24 = this.selectedProvider;
        Log_OC.append($r24);
        String $r3 = $r24.getBankName();
        boolean z = this.selectedProvider != null;
        UssdWithdrawalProvider $r25 = this.selectedProvider;
        Log_OC.append($r25);
        boolean $z3 = UssdWithdrawalUtilKt.getShowWarningText($r25);
        ViewData $r4 = getState();
        UssdWithdrawalVoucherInputViewData $r5 = UssdWithdrawalVoucherInputViewData.copy$default((UssdWithdrawalVoucherInputViewData) $r4, false, null, null, 0, $r3, $r1, $z3, z, $z0, $z1, 0, false, false, false, null, null, 64527, null);
        publish($r5);
        FetchCurrentUser $r6 = this.fetchCurrentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        AbstractC11688p $r8 = $r7.m10427w();
        Item $r9 = ClassWriter.LogError();
        AbstractC11688p $r82 = $r8.h0($r9);
        Item $r92 = ContextUtils.LogError();
        AbstractC11688p $r83 = $r82.R($r92);
        Object object = new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherInputViewModel $r12 = UssdWithdrawalVoucherInputViewModel.this;
                User $r32 = (User) obj;
                UssdWithdrawalVoucherInputViewModel.m41841onProviderSelected$lambda3($r12, $r32);
            }
        };
        Function $r11 = Function.LEN;
        FavoritesArrayAdapter $r12 = $r83.e0(object, $r11);
        Log_OC.loadImage($r12, "fetchCurrentUser.execute().toObservable().subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onUssdProviderSelected(it.phoneNumber)\n                },\n                {\n\n                }\n            )");
        C11280b $r13 = getCompositeDisposable();
        RxExtKt.addTo($r12, $r13);
    }

    public final void onRetryButtonClicked() {
        fetchProviderList();
    }

    public final void onViewCreated() {
        fetchProviderList();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void stop() {
        ViewData $r1 = getState();
        UssdWithdrawalVoucherInputViewData $r2 = UssdWithdrawalVoucherInputViewData.copy$default((UssdWithdrawalVoucherInputViewData) $r1, false, null, null, 0, null, null, false, false, false, false, 0, false, false, false, null, null, 51199, null);
        publish($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void validateInput(String $r1, String str) {
        Log_OC.getArray($r1, "voucherCode");
        Log_OC.getArray(str, "phoneNumber");
        ViewData $r3 = getState();
        UssdWithdrawalVoucherInputViewData $r4 = UssdWithdrawalVoucherInputViewData.copy$default((UssdWithdrawalVoucherInputViewData) $r3, true, null, "", -1, null, null, false, false, false, false, 0, false, false, false, null, null, 51186, null);
        publish($r4);
        UssdWithdrawalProvider $r5 = this.selectedProvider;
        if ($r5 == null) {
            ResourceDelegate $r6 = this.context;
            String $r12 = $r6.getString(C0001R.string.text_select_a_provider);
            ViewData $r32 = getState();
            UssdWithdrawalVoucherInputViewData $r42 = (UssdWithdrawalVoucherInputViewData) $r32;
            publish(UssdWithdrawalVoucherInputViewData.copy$default($r42, false, $r12, null, 0, null, null, false, false, false, false, 0, true, false, false, null, null, 51196, null));
            return;
        }
        Log_OC.append($r5);
        boolean $z0 = UssdWithdrawalUtilKt.getRequiresVoucherCodeInput($r5);
        if ($z0) {
            int $i0 = $r1.length();
            boolean $z02 = $i0 == 0;
            if ($z02) {
                ResourceDelegate $r62 = this.context;
                String $r13 = $r62.getString(C0001R.string.text_withdrawal_code_cannot_be_empty);
                ViewData $r33 = getState();
                UssdWithdrawalVoucherInputViewData $r43 = (UssdWithdrawalVoucherInputViewData) $r33;
                publish(UssdWithdrawalVoucherInputViewData.copy$default($r43, false, null, $r13, C0001R.C0003id.et_voucher, null, null, false, false, false, false, 0, false, false, false, null, null, 51186, null));
                return;
            }
        }
        int $i02 = str.length();
        if ($i02 == 0) {
            ResourceDelegate $r63 = this.context;
            String $r14 = $r63.getString(C0001R.string.text_phone_number_cannot_be_empty);
            ViewData $r34 = getState();
            UssdWithdrawalVoucherInputViewData $r44 = (UssdWithdrawalVoucherInputViewData) $r34;
            publish(UssdWithdrawalVoucherInputViewData.copy$default($r44, false, null, $r14, C0001R.C0003id.et_phone_num, null, null, false, false, false, false, 0, false, false, false, null, null, 51186, null));
            return;
        }
        int $i03 = str.length();
        if ($i03 < 11) {
            ResourceDelegate $r64 = this.context;
            String $r15 = $r64.getString(C0001R.string.text_incomplete_phone_num);
            ViewData $r35 = getState();
            UssdWithdrawalVoucherInputViewData $r45 = (UssdWithdrawalVoucherInputViewData) $r35;
            publish(UssdWithdrawalVoucherInputViewData.copy$default($r45, false, null, $r15, C0001R.C0003id.et_phone_num, null, null, false, false, false, false, 0, false, false, false, null, null, 51186, null));
            return;
        }
        boolean $z1 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z1) {
            ResourceDelegate $r65 = this.context;
            String $r16 = $r65.getString(C0001R.string.text_invalid_phone_number);
            ViewData $r36 = getState();
            UssdWithdrawalVoucherInputViewData $r46 = (UssdWithdrawalVoucherInputViewData) $r36;
            publish(UssdWithdrawalVoucherInputViewData.copy$default($r46, false, null, $r16, C0001R.C0003id.et_phone_num, null, null, false, false, false, false, 0, false, false, false, null, null, 51186, null));
            return;
        }
        UssdWithdrawalProvider $r52 = this.selectedProvider;
        Log_OC.append($r52);
        boolean $z12 = UssdWithdrawalUtilKt.getRequiresVoucherCodeInput($r52);
        if (!$z12) {
            UssdWithdrawalProvider $r53 = this.selectedProvider;
            Log_OC.append($r53);
            NoVoucherWithdrawalPayload $r17 = new NoVoucherWithdrawalPayload(str, $r53, 0, null, null, 28, null);
            ViewData $r37 = getState();
            UssdWithdrawalVoucherInputViewData $r47 = (UssdWithdrawalVoucherInputViewData) $r37;
            publish(UssdWithdrawalVoucherInputViewData.copy$default($r47, false, null, null, 0, null, null, false, false, false, false, 0, false, false, true, null, $r17, 18430, null));
            return;
        }
        UssdWithdrawalProvider $r54 = this.selectedProvider;
        Log_OC.append($r54);
        String $r8 = $r54.getApiBankName();
        long $l1 = 0;
        BigDecimal $r9 = BigDecimal.valueOf($l1);
        Log_OC.loadImage($r9, "BigDecimal.valueOf(this.toLong())");
        final CardlessWithdrawalApiCommData.Request $r7 = new CardlessWithdrawalApiCommData.Request($r1, str, $r8, $r9);
        FetchCurrentUser $r10 = this.fetchCurrentUser;
        AbstractC11696w $r11 = FetchCurrentUser.execute$default($r10, null, null, 3, null);
        Item $r122 = ContextUtils.LogError();
        AbstractC11696w $r112 = $r11.n($r122);
        Item $r123 = ClassWriter.LogError();
        AbstractC11696w $r113 = $r112.u($r123);
        Object object = new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherInputViewModel $r18 = UssdWithdrawalVoucherInputViewModel.this;
                CardlessWithdrawalApiCommData.Request $r2 = $r7;
                User $r48 = (User) obj;
                UssdWithdrawalVoucherInputViewModel.m41845validateInput$lambda10($r18, $r2, $r48);
            }
        };
        DateFormat $r142 = DateFormat.SHORT;
        FavoritesArrayAdapter $r152 = $r113.s(object, $r142);
        Log_OC.loadImage($r152, "fetchCurrentUser.execute().observeOn(AndroidSchedulers.mainThread())\n                .subscribeOn(Schedulers.io()).subscribe(\n                    { user ->\n                        usecase.validateVoucher(request)\n                            .observeOn(AndroidSchedulers.mainThread())\n                            .subscribeOn(Schedulers.io())\n                            .subscribe(\n                                {\n                                    onVoucherCodeValidationSuccess(request, it.data)\n                                    analytics.onUssdVoucherCodeValidated(\n                                        user.phoneNumber,\n                                        FirebaseAnalyticsImpl.STATUS_SUCCESS\n                                    )\n                                },\n                                {\n                                    onFailure(parseHttpError2(\"Something went wrong\")(it))\n                                    analytics.onUssdVoucherCodeValidated(\n                                        user.phoneNumber,\n                                        FirebaseAnalyticsImpl.STATUS_FAILURE\n                                    )\n                                }\n                            ).addTo(compositeDisposable)\n                    },\n                    {\n                        it.printStackTrace()\n                    }\n                )");
        C11280b $r162 = getCompositeDisposable();
        RxExtKt.addTo($r152, $r162);
    }
}
