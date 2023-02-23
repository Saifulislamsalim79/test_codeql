package ai.kudi.agent.voucher.cashout.p039ui;

import ai.kudi.agent.voucher.cashout.presenter.VoucherPhoneVerificationPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.voucher.cashout.ui.VoucherCashOutPhoneVerificationActivity_MembersInjector */
/* loaded from: classes.dex */
public final class VoucherCashOutPhoneVerificationActivity_MembersInjector implements InterfaceC9463a<VoucherCashOutPhoneVerificationActivity> {
    private final InterfaceC11700a<VoucherPhoneVerificationPresenter> thisPresenterProvider;

    public VoucherCashOutPhoneVerificationActivity_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        VoucherCashOutPhoneVerificationActivity_MembersInjector $r1 = new VoucherCashOutPhoneVerificationActivity_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(VoucherCashOutPhoneVerificationActivity voucherCashOutPhoneVerificationActivity, VoucherPhoneVerificationPresenter voucherPhoneVerificationPresenter) {
        voucherCashOutPhoneVerificationActivity.thisPresenter = voucherPhoneVerificationPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(VoucherCashOutPhoneVerificationActivity voucherCashOutPhoneVerificationActivity) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        VoucherPhoneVerificationPresenter $r4 = (VoucherPhoneVerificationPresenter) $r2;
        injectThisPresenter(voucherCashOutPhoneVerificationActivity, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        VoucherCashOutPhoneVerificationActivity $r2 = (VoucherCashOutPhoneVerificationActivity) obj;
        injectMembers($r2);
    }
}
