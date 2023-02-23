package ai.kudi.agent.voucher.cashout.presenter;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.voucher.cashout.domain.usecase.CashOutVoucherVerification;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class VoucherVerificationPresenter_Factory implements InterfaceC9468d<VoucherVerificationPresenter> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<CashOutVoucherVerification> cashOutVoucherVerificationProvider;
    private final InterfaceC11700a<FetchCurrentUser> fetchCurrentUserProvider;

    public VoucherVerificationPresenter_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        this.cashOutVoucherVerificationProvider = interfaceC11700a;
        this.fetchCurrentUserProvider = interfaceC11700a2;
        this.analyticsProvider = interfaceC11700a3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VoucherVerificationPresenter_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2, InterfaceC11700a interfaceC11700a3) {
        VoucherVerificationPresenter_Factory $r3 = new VoucherVerificationPresenter_Factory(interfaceC11700a, interfaceC11700a2, interfaceC11700a3);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static VoucherVerificationPresenter newInstance(CashOutVoucherVerification cashOutVoucherVerification, FetchCurrentUser fetchCurrentUser, Analytics analytics) {
        VoucherVerificationPresenter $r3 = new VoucherVerificationPresenter(cashOutVoucherVerification, fetchCurrentUser, analytics);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public VoucherVerificationPresenter multiply() {
        InterfaceC11700a $r1 = this.cashOutVoucherVerificationProvider;
        Object $r2 = $r1.get();
        CashOutVoucherVerification $r3 = (CashOutVoucherVerification) $r2;
        InterfaceC11700a $r12 = this.fetchCurrentUserProvider;
        Object $r22 = $r12.get();
        FetchCurrentUser $r4 = (FetchCurrentUser) $r22;
        InterfaceC11700a $r13 = this.analyticsProvider;
        Object $r23 = $r13.get();
        Analytics $r5 = (Analytics) $r23;
        VoucherVerificationPresenter $r6 = newInstance($r3, $r4, $r5);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m41741multiply() {
        VoucherVerificationPresenter $r1 = multiply();
        return $r1;
    }
}
