package ai.kudi.agent.withdrawal.presenter;

import ai.kudi.agent.bills.domain.usecases.FeesLookupRequest;
import ai.kudi.agent.bills.domain.usecases.FeesLookupResponse;
import ai.kudi.agent.bills.domain.usecases.PerformServiceFeeLookup;
import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
import ai.kudi.agent.payments.domain.wiki.PaymentVendors;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import ai.kudi.agent.withdrawal.view.OthersWithdrawView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.Object;
/* compiled from: OthersWithdrawalPresenter.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bJ&\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0017R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/withdrawal/presenter/OthersWithdrawalPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/withdrawal/view/OthersWithdrawView;", "feeLookup", "Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "(Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/core/analytics/Analytics;)V", "agentPhoneNumber", "", "getAgentPhoneNumber", "()Ljava/lang/String;", "setAgentPhoneNumber", "(Ljava/lang/String;)V", "getAnalytics", "()Lai/kudi/agent/core/analytics/Analytics;", "getCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getFeeLookup", "()Lai/kudi/agent/bills/domain/usecases/PerformServiceFeeLookup;", "isConfirmationState", "", "()Z", "setConfirmationState", "(Z)V", "getPaymentMethod", "Lai/kudi/agent/payments/domain/dto/MPOSPaymentMethod;", "cardVendor", "logEventOnLookup", "", "type", TransactionField.AMOUNT, "product", "fee", "performWithdrawal", "customersPhoneNumber", "serviceFeeIncluded", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OthersWithdrawalPresenter extends C9410b<OthersWithdrawView> {
    private String agentPhoneNumber;
    private final Analytics analytics;
    private final FetchCurrentUser currentUser;
    private final PerformServiceFeeLookup feeLookup;
    private boolean isConfirmationState;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public OthersWithdrawalPresenter(PerformServiceFeeLookup performServiceFeeLookup, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        Log_OC.getArray(performServiceFeeLookup, "feeLookup");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(analytics, "analytics");
        this.feeLookup = performServiceFeeLookup;
        this.currentUser = fetchCurrentUser;
        this.analytics = analytics;
        this.agentPhoneNumber = "";
        AbstractC11696w $r1 = FetchCurrentUser.execute$default(fetchCurrentUser, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.withdrawal.presenter.OrFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OthersWithdrawalPresenter $r12 = OthersWithdrawalPresenter.this;
                User $r3 = (User) obj;
                OthersWithdrawalPresenter.m41858_init_$lambda0($r12, $r3);
            }
        };
        Button $r6 = Button.background;
        $r1.s(object, $r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m41858_init_$lambda0(OthersWithdrawalPresenter othersWithdrawalPresenter, User user) {
        Log_OC.getArray(othersWithdrawalPresenter, "this$0");
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        othersWithdrawalPresenter.setAgentPhoneNumber($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final MPOSPaymentMethod getPaymentMethod(String str) {
        boolean $z0 = Log_OC.append(str, PaymentVendors.POS_PAYPAD);
        if ($z0) {
            MPOSPaymentMethod.Companion $r2 = MPOSPaymentMethod.Companion;
            MPOSPaymentMethod $r3 = $r2.required();
            return $r3;
        }
        boolean $z02 = Log_OC.append(str, PaymentVendors.DEBIT_CARD);
        if ($z02) {
            MPOSPaymentMethod.Companion $r22 = MPOSPaymentMethod.Companion;
            MPOSPaymentMethod $r32 = $r22.success();
            return $r32;
        }
        MPOSPaymentMethod.Companion $r23 = MPOSPaymentMethod.Companion;
        MPOSPaymentMethod $r33 = $r23.empty();
        return $r33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: logEventOnLookup$lambda-14  reason: not valid java name */
    public static final void m41860logEventOnLookup$lambda14(OthersWithdrawalPresenter othersWithdrawalPresenter, String str, String str2, String str3, String str4, User user) {
        Log_OC.getArray(othersWithdrawalPresenter, "this$0");
        Log_OC.getArray(str, "$type");
        Log_OC.getArray(str2, "$amount");
        Log_OC.getArray(str3, "$product");
        Log_OC.getArray(str4, "$fee");
        Analytics $r6 = othersWithdrawalPresenter.getAnalytics();
        $r6.onTransactionLookUpEvent(str, str2, "", str3, str4, user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performWithdrawal$lambda-10  reason: not valid java name */
    public static final void m41862performWithdrawal$lambda10(final OthersWithdrawalPresenter othersWithdrawalPresenter, final WithdrawalRequest withdrawalRequest, final FeesLookupResponse feesLookupResponse) {
        Log_OC.getArray(othersWithdrawalPresenter, "this$0");
        Log_OC.getArray(withdrawalRequest, "$request");
        othersWithdrawalPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.withdrawal.presenter.Settings$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void run(Object obj) {
                OthersWithdrawalPresenter $r1 = OthersWithdrawalPresenter.this;
                WithdrawalRequest $r2 = withdrawalRequest;
                FeesLookupResponse $r3 = feesLookupResponse;
                OthersWithdrawView $r5 = (OthersWithdrawView) obj;
                OthersWithdrawalPresenter.m41863performWithdrawal$lambda10$lambda9($r1, $r2, $r3, $r5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performWithdrawal$lambda-10$lambda-9  reason: not valid java name */
    public static final void m41863performWithdrawal$lambda10$lambda9(OthersWithdrawalPresenter othersWithdrawalPresenter, WithdrawalRequest withdrawalRequest, FeesLookupResponse feesLookupResponse, OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawalPresenter, "this$0");
        Log_OC.getArray(withdrawalRequest, "$request");
        Log_OC.getArray(othersWithdrawView, "view");
        int $i0 = withdrawalRequest.getAmount();
        String $r4 = String.valueOf($i0);
        String $r5 = feesLookupResponse.getServiceFee();
        othersWithdrawalPresenter.logEventOnLookup(TransactionBreakDownItemType.WITHDRAWAL, $r4, "", $r5);
        othersWithdrawView.toggleServiceFeeLoading(false);
        othersWithdrawalPresenter.setConfirmationState(true);
        String $r42 = feesLookupResponse.getServiceFee();
        othersWithdrawView.showServiceFee($r42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performWithdrawal$lambda-12  reason: not valid java name */
    public static final void m41864performWithdrawal$lambda12(OthersWithdrawalPresenter othersWithdrawalPresenter, Throwable th) {
        Log_OC.getArray(othersWithdrawalPresenter, "this$0");
        Token $r2 = Token.GREATER_THAN;
        othersWithdrawalPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-12$lambda-11  reason: not valid java name */
    public static final void m41865performWithdrawal$lambda12$lambda11(OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawView, "view");
        othersWithdrawView.toggleServiceFeeLoading(false);
        othersWithdrawView.showFeeLoadingFailed("An error occurred while fetching fees. Try again");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-13  reason: not valid java name */
    public static final void m41866performWithdrawal$lambda13(OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawView, "it");
        othersWithdrawView.showInvalidAmount("Please provide a valid amount");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-2  reason: not valid java name */
    public static final void m41867performWithdrawal$lambda2(OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawView, "it");
        othersWithdrawView.showInvalidPhoneNumber("Phone Number is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-3  reason: not valid java name */
    public static final void m41868performWithdrawal$lambda3(OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawView, "it");
        othersWithdrawView.showInvalidPhoneNumber("Correct phone number is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-4  reason: not valid java name */
    public static final void m41869performWithdrawal$lambda4(OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawView, "it");
        othersWithdrawView.showInvalidPhoneNumber("You can not use your phone number. Please use the phone number of the customer.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-5  reason: not valid java name */
    public static final void m41870performWithdrawal$lambda5(OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawView, "it");
        othersWithdrawView.showInvalidAmount("Amount is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-6  reason: not valid java name */
    public static final void m41871performWithdrawal$lambda6(OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawView, "it");
        othersWithdrawView.showInvalidAmount("Withdrawal amount cannot be more than NGN 30,000");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-7  reason: not valid java name */
    public static final void m41872performWithdrawal$lambda7(WithdrawalRequest withdrawalRequest, OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(withdrawalRequest, "$request");
        Log_OC.getArray(othersWithdrawView, "it");
        othersWithdrawView.openPerformWithdrawal(withdrawalRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performWithdrawal$lambda-8  reason: not valid java name */
    public static final void m41873performWithdrawal$lambda8(OthersWithdrawView othersWithdrawView) {
        Log_OC.getArray(othersWithdrawView, "it");
        othersWithdrawView.toggleServiceFeeLoading(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentPhoneNumber() {
        String r1 = this.agentPhoneNumber;
        return r1;
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
    public final FetchCurrentUser getCurrentUser() {
        FetchCurrentUser r1 = this.currentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PerformServiceFeeLookup getFeeLookup() {
        PerformServiceFeeLookup r1 = this.feeLookup;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isConfirmationState() {
        boolean z0 = this.isConfirmationState;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void logEventOnLookup(final String str, final String str2, final String str3, final String str4) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Log_OC.getArray(str3, "product");
        Log_OC.getArray(str4, "fee");
        FetchCurrentUser $r6 = this.currentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        p425j.p444e.Item $r8 = p425j.p444e.p470j0.ClassWriter.LogError();
        AbstractC11696w $r72 = $r7.u($r8);
        p425j.p444e.Item $r82 = ContextUtils.LogError();
        AbstractC11696w $r73 = $r72.n($r82);
        Object object = new Object() { // from class: ai.kudi.agent.withdrawal.presenter.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                OthersWithdrawalPresenter $r2 = OthersWithdrawalPresenter.this;
                String $r3 = str;
                String $r4 = str2;
                String $r5 = str3;
                String $r62 = str4;
                User $r74 = (User) obj;
                OthersWithdrawalPresenter.m41860logEventOnLookup$lambda14($r2, $r3, $r4, $r5, $r62, $r74);
            }
        };
        Message$RecipientType $r9 = Message$RecipientType.f2114TO;
        $r73.s(object, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performWithdrawal(String str, String str2, String str3, boolean z) {
        boolean $z1;
        boolean $z12;
        Log_OC.getArray(str, "customersPhoneNumber");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Log_OC.getArray(str3, "cardVendor");
        try {
            $z1 = C13276s.m5440u(str);
            if ($z1) {
                Format $r5 = Format.THREAD;
                ifViewAttached($r5);
                return;
            }
            boolean $z13 = StringExtKt.isNigerianPhoneNumber(str);
            if (!$z13) {
                MXParser $r6 = MXParser.THREAD;
                ifViewAttached($r6);
                return;
            }
            String $r7 = this.agentPhoneNumber;
            boolean $z14 = Log_OC.append($r7, str);
            if ($z14) {
                Direction $r8 = Direction.f2108E;
                ifViewAttached($r8);
                return;
            }
            $z12 = C13276s.m5440u(str2);
            if ($z12) {
                Target $r9 = Target.f2118a;
                ifViewAttached($r9);
                return;
            }
            int $i0 = Integer.parseInt(str2);
            if ($i0 > 30000) {
                C0754c $r10 = C0754c.f2119d;
                ifViewAttached($r10);
                return;
            }
            int $i02 = Integer.parseInt(str2);
            MPOSPaymentMethod $r11 = getPaymentMethod(str3);
            final WithdrawalRequest $r1 = new WithdrawalRequest(str, $i02, str3, z, $r11);
            boolean $z0 = this.isConfirmationState;
            if ($z0) {
                ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.withdrawal.presenter.NumberPicker$TwoDigitFormatter
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    public final void format(Object obj) {
                        WithdrawalRequest $r12 = WithdrawalRequest.this;
                        OthersWithdrawView $r3 = (OthersWithdrawView) obj;
                        OthersWithdrawalPresenter.m41872performWithdrawal$lambda7($r12, $r3);
                    }
                });
                return;
            }
            ClassWriter $r13 = ClassWriter.attrs;
            ifViewAttached($r13);
            PerformServiceFeeLookup $r14 = this.feeLookup;
            FeesLookupRequest $r15 = new FeesLookupRequest(TransactionBreakDownItemType.WITHDRAWAL, str2, TransactionBreakDownItemType.WITHDRAWAL);
            AbstractC11688p $r16 = $r14.execute($r15);
            $r16.e0(new Object() { // from class: ai.kudi.agent.withdrawal.presenter.MethodWriter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OthersWithdrawalPresenter $r12 = OthersWithdrawalPresenter.this;
                    WithdrawalRequest $r2 = $r1;
                    FeesLookupResponse $r4 = (FeesLookupResponse) obj;
                    OthersWithdrawalPresenter.m41862performWithdrawal$lambda10($r12, $r2, $r4);
                }
            }, new Object() { // from class: ai.kudi.agent.withdrawal.presenter.IOUtils$2
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    OthersWithdrawalPresenter $r12 = OthersWithdrawalPresenter.this;
                    Throwable $r3 = (Throwable) obj;
                    OthersWithdrawalPresenter.m41864performWithdrawal$lambda12($r12, $r3);
                }
            });
        } catch (NumberFormatException $r19) {
            CrashlyticsReport.logException($r19);
            Compression $r20 = Compression.METADATA;
            ifViewAttached($r20);
        }
    }

    public final void setAgentPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.agentPhoneNumber = str;
    }

    public final void setConfirmationState(boolean z) {
        this.isConfirmationState = z;
    }
}
