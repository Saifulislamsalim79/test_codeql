package ai.kudi.agent.core.network;

import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import retrofit2.C14841m;
/* compiled from: NetworkService.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/core/network/NetworkService;", "", "retrofit", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)V", "api", "Lai/kudi/agent/core/network/Api;", "getApi", "()Lai/kudi/agent/core/network/Api;", "customerApi", "Lai/kudi/agent/core/network/CustomerApi;", "getCustomerApi", "()Lai/kudi/agent/core/network/CustomerApi;", "insuranceApi", "Lai/kudi/agent/core/network/InsuranceApi;", "getInsuranceApi", "()Lai/kudi/agent/core/network/InsuranceApi;", "onboardingApi", "Lai/kudi/agent/core/network/OnboardingApi;", "getOnboardingApi", "()Lai/kudi/agent/core/network/OnboardingApi;", "outletApi", "Lai/kudi/agent/core/network/OutletMgtApi;", "getOutletApi", "()Lai/kudi/agent/core/network/OutletMgtApi;", "referralApi", "Lai/kudi/agent/core/network/ReferralApi;", "getReferralApi", "()Lai/kudi/agent/core/network/ReferralApi;", "terminalApi", "Lai/kudi/agent/core/network/TerminalApi;", "getTerminalApi", "()Lai/kudi/agent/core/network/TerminalApi;", "transactionApi", "Lai/kudi/agent/core/network/TransactionApi;", "getTransactionApi", "()Lai/kudi/agent/core/network/TransactionApi;", "voucherApi", "Lai/kudi/agent/core/network/VoucherApi;", "getVoucherApi", "()Lai/kudi/agent/core/network/VoucherApi;", "withdrawalApi", "Lai/kudi/agent/core/network/WithdrawalApi;", "getWithdrawalApi", "()Lai/kudi/agent/core/network/WithdrawalApi;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkService {
    private final CustomerApi customerApi;
    private final InsuranceApi insuranceApi;
    private final OnboardingApi onboardingApi;
    private final OutletMgtApi outletApi;
    private final ReferralApi referralApi;
    private final C14841m retrofit;
    private final TerminalApi terminalApi;
    private final TransactionApi transactionApi;
    private final VoucherApi voucherApi;
    private final WithdrawalApi withdrawalApi;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public NetworkService(C14841m c14841m) {
        Log_OC.getArray(c14841m, "retrofit");
        this.retrofit = c14841m;
        Object $r2 = c14841m.m274d(OnboardingApi.class);
        Log_OC.loadImage($r2, "retrofit.create(OnboardingApi::class.java)");
        OnboardingApi $r3 = (OnboardingApi) $r2;
        this.onboardingApi = $r3;
        C14841m $r1 = this.retrofit;
        Object $r22 = $r1.m274d(TerminalApi.class);
        Log_OC.loadImage($r22, "retrofit.create(TerminalApi::class.java)");
        TerminalApi $r4 = (TerminalApi) $r22;
        this.terminalApi = $r4;
        C14841m $r12 = this.retrofit;
        Object $r23 = $r12.m274d(TransactionApi.class);
        Log_OC.loadImage($r23, "retrofit.create(TransactionApi::class.java)");
        TransactionApi $r5 = (TransactionApi) $r23;
        this.transactionApi = $r5;
        C14841m $r13 = this.retrofit;
        Object $r24 = $r13.m274d(ReferralApi.class);
        Log_OC.loadImage($r24, "retrofit.create(ReferralApi::class.java)");
        ReferralApi $r6 = (ReferralApi) $r24;
        this.referralApi = $r6;
        C14841m $r14 = this.retrofit;
        Object $r25 = $r14.m274d(VoucherApi.class);
        Log_OC.loadImage($r25, "retrofit.create(VoucherApi::class.java)");
        VoucherApi $r7 = (VoucherApi) $r25;
        this.voucherApi = $r7;
        C14841m $r15 = this.retrofit;
        Object $r26 = $r15.m274d(CustomerApi.class);
        Log_OC.loadImage($r26, "retrofit.create(CustomerApi::class.java)");
        CustomerApi $r8 = (CustomerApi) $r26;
        this.customerApi = $r8;
        C14841m $r16 = this.retrofit;
        Object $r27 = $r16.m274d(InsuranceApi.class);
        Log_OC.loadImage($r27, "retrofit.create(InsuranceApi::class.java)");
        InsuranceApi $r9 = (InsuranceApi) $r27;
        this.insuranceApi = $r9;
        C14841m $r17 = this.retrofit;
        Object $r28 = $r17.m274d(OutletMgtApi.class);
        Log_OC.loadImage($r28, "retrofit.create(OutletMgtApi::class.java)");
        OutletMgtApi $r10 = (OutletMgtApi) $r28;
        this.outletApi = $r10;
        C14841m $r18 = this.retrofit;
        Object $r29 = $r18.m274d(WithdrawalApi.class);
        Log_OC.loadImage($r29, "retrofit.create(WithdrawalApi::class.java)");
        WithdrawalApi $r11 = (WithdrawalApi) $r29;
        this.withdrawalApi = $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AddNoteCommand getApi() {
        C14841m $r2 = this.retrofit;
        Object $r1 = $r2.m274d(Api.class);
        Log_OC.loadImage($r1, "retrofit.create(Api::class.java)");
        AddNoteCommand $r3 = (AddNoteCommand) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CustomerApi getCustomerApi() {
        CustomerApi r1 = this.customerApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceApi getInsuranceApi() {
        InsuranceApi r1 = this.insuranceApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OnboardingApi getOnboardingApi() {
        OnboardingApi r1 = this.onboardingApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletMgtApi getOutletApi() {
        OutletMgtApi r1 = this.outletApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ReferralApi getReferralApi() {
        ReferralApi r1 = this.referralApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TerminalApi getTerminalApi() {
        TerminalApi r1 = this.terminalApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionApi getTransactionApi() {
        TransactionApi r1 = this.transactionApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VoucherApi getVoucherApi() {
        VoucherApi r1 = this.voucherApi;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WithdrawalApi getWithdrawalApi() {
        WithdrawalApi r1 = this.withdrawalApi;
        return r1;
    }
}
