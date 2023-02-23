package ai.kudi.agent.voucher.cashout.presenter;

import ai.kudi.agent.voucher.cashout.view.VoucherPhoneVerificationView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Image implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Image image;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Image $r0 = new Image();
        image = $r0;
    }

    private /* synthetic */ Image() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void runInBackground(Object obj) {
        VoucherPhoneVerificationView $r2 = (VoucherPhoneVerificationView) obj;
        VoucherPhoneVerificationPresenter.m41727showLoading$lambda3($r2);
    }
}
