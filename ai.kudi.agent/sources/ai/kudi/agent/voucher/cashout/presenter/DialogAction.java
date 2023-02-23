package ai.kudi.agent.voucher.cashout.presenter;

import ai.kudi.agent.voucher.cashout.view.VoucherVerificationView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogAction implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ DialogAction POSITIVE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        DialogAction $r0 = new DialogAction();
        POSITIVE = $r0;
    }

    private /* synthetic */ DialogAction() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void calculate(Object obj) {
        VoucherVerificationView $r2 = (VoucherVerificationView) obj;
        VoucherVerificationPresenter.m41736showLoading$lambda1($r2);
    }
}
