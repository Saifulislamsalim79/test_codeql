package ai.kudi.agent.voucher.cashout.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashout.domain.usecase.CashOutVoucherVerification;
import ai.kudi.agent.voucher.cashout.domain.usecase.ValidateRecipientPhone;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class VoucherPhoneVerificationPresenter_Factory implements InterfaceC9468d<VoucherPhoneVerificationPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;
    private final InterfaceC11700a<ValidateRecipientPhone> validateRecipientPhoneProvider;
    private final InterfaceC11700a<CashOutVoucherVerification> verificationProvider;

    public VoucherPhoneVerificationPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        this.fetchCurrentUserProvider = interfaceC11700a;
        this.verificationProvider = interfaceC11700a2;
        this.validateRecipientPhoneProvider = interfaceC11700a3;
        this.analyticsProvider = interfaceC11700a4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VoucherPhoneVerificationPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3, InterfaceC11700a interfaceC11700a4) {
        VoucherPhoneVerificationPresenter_Factory $r4 = new VoucherPhoneVerificationPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3, interfaceC11700a4);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VoucherPhoneVerificationPresenter newInstance(FetchCurrentUser fetchCurrentUser, CashOutVoucherVerification cashOutVoucherVerification, ValidateRecipientPhone validateRecipientPhone, Analytics analytics) {
        VoucherPhoneVerificationPresenter $r4 = new VoucherPhoneVerificationPresenter(fetchCurrentUser, cashOutVoucherVerification, validateRecipientPhone, analytics);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VoucherPhoneVerificationPresenter multiply() {
        InterfaceC11700a $r1 = this.fetchCurrentUserProvider;
        Object $r2 = $r1.get();
        FetchCurrentUser $r3 = (FetchCurrentUser) $r2;
        InterfaceC11700a $r12 = this.verificationProvider;
        Object $r22 = $r12.get();
        CashOutVoucherVerification $r4 = (CashOutVoucherVerification) $r22;
        InterfaceC11700a $r13 = this.validateRecipientPhoneProvider;
        Object $r23 = $r13.get();
        ValidateRecipientPhone $r5 = (ValidateRecipientPhone) $r23;
        InterfaceC11700a $r14 = this.analyticsProvider;
        Object $r24 = $r14.get();
        Analytics $r6 = (Analytics) $r24;
        VoucherPhoneVerificationPresenter $r7 = newInstance($r3, $r4, $r5, $r6);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41733multiply() {
        VoucherPhoneVerificationPresenter $r1 = multiply();
        return $r1;
    }
}
