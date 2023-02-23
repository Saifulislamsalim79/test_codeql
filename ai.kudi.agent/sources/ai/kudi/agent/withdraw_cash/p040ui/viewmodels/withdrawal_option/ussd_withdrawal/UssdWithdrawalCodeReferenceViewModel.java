package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.usecases.CheckUssdWithdrawalTransactionStatus;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalTransactonStatusApiCommData;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalWithdrawalCodeGenerationApiCommData;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceViewData;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: UssdWithdrawalCodeReferenceViewModel.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalCodeReferenceViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "checkStatus", "Lai/kudi/agent/withdraw_cash/domain/usecases/CheckUssdWithdrawalTransactionStatus;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/withdraw_cash/domain/usecases/CheckUssdWithdrawalTransactionStatus;Lai/kudi/agent/core/analytics/Analytics;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "getCheckStatus", "()Lai/kudi/agent/withdraw_cash/domain/usecases/CheckUssdWithdrawalTransactionStatus;", "getFetchCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "initialData", "onCheckStatusClicked", "", "payload", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "onUssdInfoCopied", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalCodeReferenceViewModel */
/* loaded from: classes.dex */
public final class UssdWithdrawalCodeReferenceViewModel extends BaseViewModel<UssdWithdrawalCodeReferenceViewData> {
    private final Analytics analytics;
    private final CheckUssdWithdrawalTransactionStatus checkStatus;
    private final FetchCurrentUser fetchCurrentUser;

    public UssdWithdrawalCodeReferenceViewModel(FetchCurrentUser fetchCurrentUser, CheckUssdWithdrawalTransactionStatus checkUssdWithdrawalTransactionStatus, Analytics analytics) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(checkUssdWithdrawalTransactionStatus, "checkStatus");
        Log_OC.getArray(analytics, "analytics");
        this.fetchCurrentUser = fetchCurrentUser;
        this.checkStatus = checkUssdWithdrawalTransactionStatus;
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCheckStatusClicked$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m41833onCheckStatusClicked$lambda0(UssdWithdrawalCodeReferenceViewModel ussdWithdrawalCodeReferenceViewModel, NoVoucherWithdrawalPayload noVoucherWithdrawalPayload, User user) {
        Log_OC.getArray(ussdWithdrawalCodeReferenceViewModel, "this$0");
        Log_OC.getArray(noVoucherWithdrawalPayload, "$payload");
        Log_OC.getArray(user, "it");
        CheckUssdWithdrawalTransactionStatus $r3 = ussdWithdrawalCodeReferenceViewModel.getCheckStatus();
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r6 = noVoucherWithdrawalPayload.getResponse();
        Log_OC.append($r6);
        String $r7 = $r6.getReference();
        String $r8 = noVoucherWithdrawalPayload.getCustomerPhoneNumber();
        int $i0 = noVoucherWithdrawalPayload.getAmount();
        UssdWithdrawalProvider $r9 = noVoucherWithdrawalPayload.getProvider();
        String $r10 = $r9.getApiBankName();
        UssdWithdrawalTransactonStatusApiCommData.Request $r5 = new UssdWithdrawalTransactonStatusApiCommData.Request($r7, $r8, $i0, $r10);
        AbstractC11688p $r11 = $r3.checkStatus($r4, $r5);
        return $r11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCheckStatusClicked$lambda-1  reason: not valid java name */
    public static final void m41834onCheckStatusClicked$lambda1(UssdWithdrawalCodeReferenceViewModel ussdWithdrawalCodeReferenceViewModel, APIResponse aPIResponse) {
        Log_OC.getArray(ussdWithdrawalCodeReferenceViewModel, "this$0");
        Object $r2 = aPIResponse.data;
        UssdWithdrawalTransactonStatusApiCommData.Response $r3 = (UssdWithdrawalTransactonStatusApiCommData.Response) $r2;
        String $r4 = $r3.getTransactionReference();
        ViewData $r5 = ussdWithdrawalCodeReferenceViewModel.getState();
        UssdWithdrawalCodeReferenceViewData $r6 = (UssdWithdrawalCodeReferenceViewData) $r5;
        ussdWithdrawalCodeReferenceViewModel.publish($r6.copy(false, null, $r4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCheckStatusClicked$lambda-2  reason: not valid java name */
    public static final void m41835onCheckStatusClicked$lambda2(UssdWithdrawalCodeReferenceViewModel ussdWithdrawalCodeReferenceViewModel, Throwable th) {
        Log_OC.getArray(ussdWithdrawalCodeReferenceViewModel, "this$0");
        ViewData $r2 = ussdWithdrawalCodeReferenceViewModel.getState();
        UssdWithdrawalCodeReferenceViewData $r3 = (UssdWithdrawalCodeReferenceViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("Ooops! Something went wrong, please retry.", null, 2, null);
        Log_OC.loadImage(th, "th");
        Object $r5 = $r4.invoke(th);
        ussdWithdrawalCodeReferenceViewModel.publish(UssdWithdrawalCodeReferenceViewData.copy$default($r3, false, (String) $r5, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onUssdInfoCopied$lambda-3  reason: not valid java name */
    public static final void m41836onUssdInfoCopied$lambda3(UssdWithdrawalCodeReferenceViewModel ussdWithdrawalCodeReferenceViewModel, User user) {
        Log_OC.getArray(ussdWithdrawalCodeReferenceViewModel, "this$0");
        Analytics $r2 = ussdWithdrawalCodeReferenceViewModel.getAnalytics();
        String $r3 = user.getPhoneNumber();
        Log_OC.loadImage($r3, "it.phoneNumber");
        $r2.onUssdInfoCopied($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onUssdInfoCopied$lambda-4  reason: not valid java name */
    public static final void m41837onUssdInfoCopied$lambda4(Throwable th) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Analytics getAnalytics() {
        Analytics r1 = this.analytics;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CheckUssdWithdrawalTransactionStatus getCheckStatus() {
        CheckUssdWithdrawalTransactionStatus r1 = this.checkStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchCurrentUser() {
        FetchCurrentUser r1 = this.fetchCurrentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        UssdWithdrawalCodeReferenceViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public UssdWithdrawalCodeReferenceViewData initialData() {
        UssdWithdrawalCodeReferenceViewData $r1 = new UssdWithdrawalCodeReferenceViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCheckStatusClicked(final NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
        Log_OC.getArray(noVoucherWithdrawalPayload, "payload");
        ViewData $r2 = getState();
        UssdWithdrawalCodeReferenceViewData $r3 = (UssdWithdrawalCodeReferenceViewData) $r2;
        publish(UssdWithdrawalCodeReferenceViewData.copy$default($r3, true, null, null, 6, null));
        FetchCurrentUser $r4 = this.fetchCurrentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                UssdWithdrawalCodeReferenceViewModel $r1 = UssdWithdrawalCodeReferenceViewModel.this;
                NoVoucherWithdrawalPayload $r22 = noVoucherWithdrawalPayload;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = UssdWithdrawalCodeReferenceViewModel.m41833onCheckStatusClicked$lambda0($r1, $r22, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalCodeReferenceViewModel $r1 = UssdWithdrawalCodeReferenceViewModel.this;
                APIResponse $r32 = (APIResponse) obj;
                UssdWithdrawalCodeReferenceViewModel.m41834onCheckStatusClicked$lambda1($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalCodeReferenceViewModel $r1 = UssdWithdrawalCodeReferenceViewModel.this;
                Throwable $r32 = (Throwable) obj;
                UssdWithdrawalCodeReferenceViewModel.m41835onCheckStatusClicked$lambda2($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "fetchCurrentUser.execute().flatMapObservable {\n            checkStatus.checkStatus(\n                it.sessionId,\n                UssdWithdrawalTransactonStatusApiCommData.Request(\n                    payload.response!!.reference,\n                    payload.customerPhoneNumber,\n                    payload.amount,\n                    payload.provider.apiBankName\n                )\n            )\n        }.subscribe(\n            { response ->\n                publish(\n                    state.copy(\n                        reference = response.data.transactionReference,\n                        showLoader = false,\n                        errorMsg = null\n                    )\n                )\n            },\n            { th ->\n                publish(\n                    state.copy(\n                        showLoader = false,\n                        errorMsg = parseHttpError2(\"Ooops! Something went wrong, please retry.\")(\n                            th\n                        )\n                    )\n                )\n            }\n        )");
        C11280b $r11 = getCompositeDisposable();
        RxExtKt.addTo($r10, $r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onUssdInfoCopied() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        AbstractC11688p $r3 = $r2.m10427w();
        Item $r4 = ClassWriter.LogError();
        AbstractC11688p $r32 = $r3.h0($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r42);
        Object object = new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalCodeReferenceViewModel $r12 = UssdWithdrawalCodeReferenceViewModel.this;
                User $r34 = (User) obj;
                UssdWithdrawalCodeReferenceViewModel.m41836onUssdInfoCopied$lambda3($r12, $r34);
            }
        };
        Token $r6 = Token.BOOL;
        FavoritesArrayAdapter $r7 = $r33.e0(object, $r6);
        Log_OC.loadImage($r7, "fetchCurrentUser.execute().toObservable().subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())\n            .subscribe(\n                {\n                    analytics.onUssdInfoCopied(it.phoneNumber)\n                },\n                {\n\n                }\n            )");
        C11280b $r8 = getCompositeDisposable();
        RxExtKt.addTo($r7, $r8);
    }
}
