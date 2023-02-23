package ai.kudi.agent.voucher.cashout.p039ui;

import ai.kudi.agent.voucher.cashout.presenter.VoucherVerificationPresenter;
import p382i.InterfaceC9463a;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.voucher.cashout.ui.VoucherCodeInputFragment_MembersInjector */
/* loaded from: classes.dex */
public final class VoucherCodeInputFragment_MembersInjector implements InterfaceC9463a<VoucherCodeInputFragment> {
    private final InterfaceC11700a<VoucherVerificationPresenter> thisPresenterProvider;

    public VoucherCodeInputFragment_MembersInjector(InterfaceC11700a interfaceC11700a) {
        this.thisPresenterProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static InterfaceC9463a create(InterfaceC11700a interfaceC11700a) {
        VoucherCodeInputFragment_MembersInjector $r1 = new VoucherCodeInputFragment_MembersInjector(interfaceC11700a);
        return $r1;
    }

    public static void injectThisPresenter(VoucherCodeInputFragment voucherCodeInputFragment, VoucherVerificationPresenter voucherVerificationPresenter) {
        voucherCodeInputFragment.thisPresenter = voucherVerificationPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void injectMembers(VoucherCodeInputFragment voucherCodeInputFragment) {
        InterfaceC11700a $r3 = this.thisPresenterProvider;
        Object $r2 = $r3.get();
        VoucherVerificationPresenter $r4 = (VoucherVerificationPresenter) $r2;
        injectThisPresenter(voucherCodeInputFragment, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ void injectMembers(Object obj) {
        VoucherCodeInputFragment $r2 = (VoucherCodeInputFragment) obj;
        injectMembers($r2);
    }
}
