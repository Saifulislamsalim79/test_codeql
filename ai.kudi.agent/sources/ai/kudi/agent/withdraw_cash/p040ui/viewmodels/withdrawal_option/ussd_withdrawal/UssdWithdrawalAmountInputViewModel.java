package ai.kudi.agent.withdraw_cash.p040ui.viewmodels.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.common_screens.amount_input.p003ui.viewmodels.BaseAmountInputViewModel;
import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.network.response.APIResponse;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdraw_cash.domain.usecases.GenerateUssdWithdrawalCode;
import ai.kudi.agent.withdraw_cash.domain.wiki.UssdWithdrawalWithdrawalCodeGenerationApiCommData;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload;
import ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewData;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p450e0.Object;
/* compiled from: UssdWithdrawalAmountInputViewModel.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewmodels/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputViewModel;", "Lai/kudi/agent/common_screens/amount_input/ui/viewmodels/BaseAmountInputViewModel;", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalAmountInputViewData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "feeLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "generateUssdWithdrawalCode", "Lai/kudi/agent/withdraw_cash/domain/usecases/GenerateUssdWithdrawalCode;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;Lai/kudi/agent/withdraw_cash/domain/usecases/GenerateUssdWithdrawalCode;)V", "payload", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "fetchServiceFee", "", TransactionField.AMOUNT, "", "initialData", "onNextButtonClicked", "setPayload", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.UssdWithdrawalAmountInputViewModel */
/* loaded from: classes.dex */
public final class UssdWithdrawalAmountInputViewModel extends BaseAmountInputViewModel<UssdWithdrawalAmountInputViewData> {
    private final FetchCurrentUser currentUser;
    private final PerformServiceFeeLookup feeLookup;
    private final GenerateUssdWithdrawalCode generateUssdWithdrawalCode;
    private NoVoucherWithdrawalPayload payload;

    public UssdWithdrawalAmountInputViewModel(FetchCurrentUser fetchCurrentUser, PerformServiceFeeLookup performServiceFeeLookup, GenerateUssdWithdrawalCode generateUssdWithdrawalCode) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(performServiceFeeLookup, "feeLookup");
        Log_OC.getArray(generateUssdWithdrawalCode, "generateUssdWithdrawalCode");
        this.currentUser = fetchCurrentUser;
        this.feeLookup = performServiceFeeLookup;
        this.generateUssdWithdrawalCode = generateUssdWithdrawalCode;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchServiceFee(int i) {
        PerformServiceFeeLookup $r1 = this.feeLookup;
        String $r3 = String.valueOf(i);
        FeesLookupRequest $r2 = new FeesLookupRequest("withdrawal_cardless", $r3, "withdrawal_cardless");
        AbstractC11688p $r4 = $r1.execute($r2);
        $r4.e0(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.NotFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalAmountInputViewModel $r12 = UssdWithdrawalAmountInputViewModel.this;
                FeesLookupResponse $r32 = (FeesLookupResponse) obj;
                UssdWithdrawalAmountInputViewModel.m41827fetchServiceFee$lambda3($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalAmountInputViewModel $r12 = UssdWithdrawalAmountInputViewModel.this;
                Throwable $r32 = (Throwable) obj;
                UssdWithdrawalAmountInputViewModel.m41828fetchServiceFee$lambda4($r12, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-3  reason: not valid java name */
    public static final void m41827fetchServiceFee$lambda3(UssdWithdrawalAmountInputViewModel ussdWithdrawalAmountInputViewModel, FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(ussdWithdrawalAmountInputViewModel, "this$0");
        NoVoucherWithdrawalPayload $r2 = ussdWithdrawalAmountInputViewModel.payload;
        Log_OC.append($r2);
        String $r3 = feesLookupResponse.getServiceFee();
        ussdWithdrawalAmountInputViewModel.payload = NoVoucherWithdrawalPayload.copy$default($r2, null, null, 0, $r3, null, 23, null);
        ViewData $r4 = ussdWithdrawalAmountInputViewModel.getState();
        UssdWithdrawalAmountInputViewData $r5 = UssdWithdrawalAmountInputViewData.copy$default((UssdWithdrawalAmountInputViewData) $r4, false, null, ussdWithdrawalAmountInputViewModel.payload, 3, null);
        ussdWithdrawalAmountInputViewModel.publish($r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchServiceFee$lambda-4  reason: not valid java name */
    public static final void m41828fetchServiceFee$lambda4(UssdWithdrawalAmountInputViewModel ussdWithdrawalAmountInputViewModel, Throwable th) {
        Log_OC.getArray(ussdWithdrawalAmountInputViewModel, "this$0");
        ViewData $r2 = ussdWithdrawalAmountInputViewModel.getState();
        UssdWithdrawalAmountInputViewData $r3 = (UssdWithdrawalAmountInputViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("An error occurred while fetching fees. Try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ussdWithdrawalAmountInputViewModel.publish($r3.copy(false, $r6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNextButtonClicked$lambda-2  reason: not valid java name */
    public static final void m41829onNextButtonClicked$lambda2(final UssdWithdrawalAmountInputViewModel ussdWithdrawalAmountInputViewModel, final int i, User user) {
        Log_OC.getArray(ussdWithdrawalAmountInputViewModel, "this$0");
        GenerateUssdWithdrawalCode $r2 = ussdWithdrawalAmountInputViewModel.generateUssdWithdrawalCode;
        String $r3 = user.getSessionId();
        Log_OC.loadImage($r3, "user.sessionId");
        NoVoucherWithdrawalPayload $r5 = ussdWithdrawalAmountInputViewModel.payload;
        Log_OC.append($r5);
        String $r6 = $r5.getCustomerPhoneNumber();
        NoVoucherWithdrawalPayload $r52 = ussdWithdrawalAmountInputViewModel.payload;
        Log_OC.append($r52);
        UssdWithdrawalProvider $r7 = $r52.getProvider();
        String $r8 = $r7.getApiBankName();
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Request $r4 = new UssdWithdrawalWithdrawalCodeGenerationApiCommData.Request(i, $r6, $r8);
        AbstractC11688p $r9 = $r2.execute($r3, $r4);
        $r9.e0(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalAmountInputViewModel $r1 = UssdWithdrawalAmountInputViewModel.this;
                int $i0 = i;
                APIResponse $r32 = (APIResponse) obj;
                UssdWithdrawalAmountInputViewModel.m41830onNextButtonClicked$lambda2$lambda0($r1, $i0, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalAmountInputViewModel $r1 = UssdWithdrawalAmountInputViewModel.this;
                Throwable $r32 = (Throwable) obj;
                UssdWithdrawalAmountInputViewModel.m41831onNextButtonClicked$lambda2$lambda1($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNextButtonClicked$lambda-2$lambda-0  reason: not valid java name */
    public static final void m41830onNextButtonClicked$lambda2$lambda0(UssdWithdrawalAmountInputViewModel ussdWithdrawalAmountInputViewModel, int i, APIResponse aPIResponse) {
        Log_OC.getArray(ussdWithdrawalAmountInputViewModel, "this$0");
        Object $r3 = aPIResponse.data;
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r4 = (UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response) $r3;
        NoVoucherWithdrawalPayload $r1 = ussdWithdrawalAmountInputViewModel.payload;
        Log_OC.append($r1);
        ussdWithdrawalAmountInputViewModel.payload = NoVoucherWithdrawalPayload.copy$default($r1, null, null, i, null, $r4, 11, null);
        ussdWithdrawalAmountInputViewModel.fetchServiceFee(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNextButtonClicked$lambda-2$lambda-1  reason: not valid java name */
    public static final void m41831onNextButtonClicked$lambda2$lambda1(UssdWithdrawalAmountInputViewModel ussdWithdrawalAmountInputViewModel, Throwable th) {
        Log_OC.getArray(ussdWithdrawalAmountInputViewModel, "this$0");
        ViewData $r2 = ussdWithdrawalAmountInputViewModel.getState();
        UssdWithdrawalAmountInputViewData $r3 = (UssdWithdrawalAmountInputViewData) $r2;
        InterfaceC11767l $r4 = KudiErrorParserKt.parseHttpError2$default("An error occurred while generating reference code. Try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r5 = $r4.invoke(th);
        String $r6 = (String) $r5;
        ussdWithdrawalAmountInputViewModel.publish($r3.copy(false, $r6, null));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        UssdWithdrawalAmountInputViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public UssdWithdrawalAmountInputViewData initialData() {
        UssdWithdrawalAmountInputViewData $r1 = new UssdWithdrawalAmountInputViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onNextButtonClicked(final int i) {
        ViewData $r1 = getState();
        UssdWithdrawalAmountInputViewData $r2 = (UssdWithdrawalAmountInputViewData) $r1;
        publish(UssdWithdrawalAmountInputViewData.copy$default($r2, true, null, null, 6, null));
        NoVoucherWithdrawalPayload $r3 = this.payload;
        Log_OC.append($r3);
        UssdWithdrawalWithdrawalCodeGenerationApiCommData.Response $r4 = $r3.getResponse();
        if ($r4 != null) {
            fetchServiceFee(i);
            return;
        }
        FetchCurrentUser $r5 = this.currentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        $r6.r(new Object() { // from class: ai.kudi.agent.withdraw_cash.ui.viewmodels.withdrawal_option.ussd_withdrawal.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UssdWithdrawalAmountInputViewModel $r12 = UssdWithdrawalAmountInputViewModel.this;
                int $i0 = i;
                User $r32 = (User) obj;
                UssdWithdrawalAmountInputViewModel.m41829onNextButtonClicked$lambda2($r12, $i0, $r32);
            }
        });
    }

    public final void setPayload(NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
        Log_OC.getArray(noVoucherWithdrawalPayload, "payload");
        this.payload = noVoucherWithdrawalPayload;
    }
}
