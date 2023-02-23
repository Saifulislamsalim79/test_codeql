package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.transfer.views.TransferToBankCustomerView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ISBNCheckDigit implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ ISBNCheckDigit EXTERNAL;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ISBNCheckDigit $r0 = new ISBNCheckDigit();
        EXTERNAL = $r0;
    }

    private /* synthetic */ ISBNCheckDigit() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void calculate(Object obj) {
        TransferToBankCustomerView $r2 = (TransferToBankCustomerView) obj;
        TransferToBankCustomerPresenter.m41345validateFields$lambda2($r2);
    }
}
