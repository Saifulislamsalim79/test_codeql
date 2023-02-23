package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.analytics.FirebaseAnalyticsImpl;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.usecases.CardlessWithdrawalUsecase;
import ai.kudi.agent.withdraw_cash.domain.wiki.CardlessWithdrawalApiCommData;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewData;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: UssdWithdrawalVoucherSummaryViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherSummaryViewData;", "usecase", "Lai/kudi/agent/withdraw_cash/domain/usecases/CardlessWithdrawalUsecase;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/withdraw_cash/domain/usecases/CardlessWithdrawalUsecase;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "doWithdrawal", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Request;", "initialData", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherSummaryViewModel */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherSummaryViewModel extends BaseViewModel<UssdWithdrawalVoucherSummaryViewData> {
    private final Analytics analytics;
    private final FetchCurrentUser fetchCurrentUser;
    private final CardlessWithdrawalUsecase usecase;

    public UssdWithdrawalVoucherSummaryViewModel(CardlessWithdrawalUsecase cardlessWithdrawalUsecase, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(cardlessWithdrawalUsecase, "usecase");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(analytics, "analytics");
        this.usecase = cardlessWithdrawalUsecase;
        this.fetchCurrentUser = fetchCurrentUser;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: doWithdrawal$lambda-2  reason: not valid java name */
    public static final void m41850doWithdrawal$lambda2(final UssdWithdrawalVoucherSummaryViewModel ussdWithdrawalVoucherSummaryViewModel, CardlessWithdrawalApiCommData.Request request, final User user) {
        Log_OC.getArray(ussdWithdrawalVoucherSummaryViewModel, "this$0");
        Log_OC.getArray(request, "$request");
        CardlessWithdrawalUsecase $r4 = ussdWithdrawalVoucherSummaryViewModel.usecase;
        AbstractC11688p $r5 = $r4.doWithdrawal(request);
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.SimpleXYSeries
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherSummaryViewModel $r2 = UssdWithdrawalVoucherSummaryViewModel.this;
                User $r3 = user;
                UssdWithdrawalVoucherSummaryViewModel.m41851doWithdrawal$lambda2$lambda0($r2, $r3, obj);
            }
        }, new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.Widget
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherSummaryViewModel $r1 = UssdWithdrawalVoucherSummaryViewModel.this;
                User $r2 = user;
                Throwable $r42 = (Throwable) obj;
                UssdWithdrawalVoucherSummaryViewModel.m41852doWithdrawal$lambda2$lambda1($r1, $r2, $r42);
            }
        });
        Log_OC.loadImage($r7, "usecase.doWithdrawal(request).subscribe(\n                    {\n                        publish(state.copy(showLoader = false, isTxnDone = true, toastMsg = null))\n                        analytics.onUssdTransactionCompleted(\n                            user.phoneNumber,\n                            FirebaseAnalyticsImpl.STATUS_SUCCESS\n                        )\n                    },\n                    {\n                        publish(\n                            state.copy(\n                                showLoader = false,\n                                isTxnDone = false,\n                                toastMsg = parseHttpError2(\"Oops! Something went wrong. Please retry\")(\n                                    it\n                                )\n                            )\n                        )\n                        analytics.onUssdTransactionCompleted(\n                            user.phoneNumber,\n                            FirebaseAnalyticsImpl.STATUS_FAILURE\n                        )\n                    }\n                )");
        C11280b $r8 = ussdWithdrawalVoucherSummaryViewModel.getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: doWithdrawal$lambda-2$lambda-0  reason: not valid java name */
    public static final void m41851doWithdrawal$lambda2$lambda0(UssdWithdrawalVoucherSummaryViewModel ussdWithdrawalVoucherSummaryViewModel, User user, Object obj) {
        Log_OC.getArray(ussdWithdrawalVoucherSummaryViewModel, "this$0");
        ViewData $r3 = ussdWithdrawalVoucherSummaryViewModel.getState();
        UssdWithdrawalVoucherSummaryViewData $r4 = (UssdWithdrawalVoucherSummaryViewData) $r3;
        ussdWithdrawalVoucherSummaryViewModel.publish($r4.copy(false, true, null));
        Analytics $r5 = ussdWithdrawalVoucherSummaryViewModel.analytics;
        String $r6 = user.getPhoneNumber();
        Log_OC.loadImage($r6, "user.phoneNumber");
        $r5.onUssdTransactionCompleted($r6, "success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: doWithdrawal$lambda-2$lambda-1  reason: not valid java name */
    public static final void m41852doWithdrawal$lambda2$lambda1(UssdWithdrawalVoucherSummaryViewModel ussdWithdrawalVoucherSummaryViewModel, User user, Throwable th) {
        Log_OC.getArray(ussdWithdrawalVoucherSummaryViewModel, "this$0");
        ViewData $r3 = ussdWithdrawalVoucherSummaryViewModel.getState();
        UssdWithdrawalVoucherSummaryViewData $r4 = (UssdWithdrawalVoucherSummaryViewData) $r3;
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Oops! Something went wrong. Please retry", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        ussdWithdrawalVoucherSummaryViewModel.publish($r4.copy(false, false, (String) $r6));
        Analytics $r8 = ussdWithdrawalVoucherSummaryViewModel.analytics;
        String $r7 = user.getPhoneNumber();
        Log_OC.loadImage($r7, "user.phoneNumber");
        $r8.onUssdTransactionCompleted($r7, FirebaseAnalyticsImpl.STATUS_FAILURE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doWithdrawal$lambda-3  reason: not valid java name */
    public static final void m41853doWithdrawal$lambda3(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void doWithdrawal(final CardlessWithdrawalApiCommData.Request request) {
        Log_OC.getArray(request, TransactionRequest.TYPE_REQUEST);
        ViewData $r2 = getState();
        UssdWithdrawalVoucherSummaryViewData $r3 = (UssdWithdrawalVoucherSummaryViewData) $r2;
        publish(UssdWithdrawalVoucherSummaryViewData.copy$default($r3, true, false, null, 2, null));
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        Item $r6 = ContextUtils.LogError();
        AbstractC11696w $r52 = $r5.n($r6);
        Item $r62 = ClassWriter.LogError();
        AbstractC11696w $r53 = $r52.u($r62);
        Object object = new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalVoucherSummaryViewModel $r1 = UssdWithdrawalVoucherSummaryViewModel.this;
                CardlessWithdrawalApiCommData.Request $r22 = request;
                User $r42 = (User) obj;
                UssdWithdrawalVoucherSummaryViewModel.m41850doWithdrawal$lambda2($r1, $r22, $r42);
            }
        };
        HttpStatus $r8 = HttpStatus.SYNCHRONIZED;
        FavoritesArrayAdapter $r9 = $r53.s(object, $r8);
        Log_OC.loadImage($r9, "fetchCurrentUser.execute().observeOn(AndroidSchedulers.mainThread())\n            .subscribeOn(Schedulers.io()).subscribe(\n            { user ->\n\n                usecase.doWithdrawal(request).subscribe(\n                    {\n                        publish(state.copy(showLoader = false, isTxnDone = true, toastMsg = null))\n                        analytics.onUssdTransactionCompleted(\n                            user.phoneNumber,\n                            FirebaseAnalyticsImpl.STATUS_SUCCESS\n                        )\n                    },\n                    {\n                        publish(\n                            state.copy(\n                                showLoader = false,\n                                isTxnDone = false,\n                                toastMsg = parseHttpError2(\"Oops! Something went wrong. Please retry\")(\n                                    it\n                                )\n                            )\n                        )\n                        analytics.onUssdTransactionCompleted(\n                            user.phoneNumber,\n                            FirebaseAnalyticsImpl.STATUS_FAILURE\n                        )\n                    }\n                ).addTo(compositeDisposable)\n            },\n            {\n            }\n        )");
        C11280b $r10 = getCompositeDisposable();
        RxExtKt.addTo($r9, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        UssdWithdrawalVoucherSummaryViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public UssdWithdrawalVoucherSummaryViewData initialData() {
        UssdWithdrawalVoucherSummaryViewData $r1 = new UssdWithdrawalVoucherSummaryViewData(false, false, null, 7, null);
        return $r1;
    }
}
