package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.transfer.views.TransferToBankCustomerView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Target implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Target NONE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Target $r0 = new Target();
        NONE = $r0;
    }

    private /* synthetic */ Target() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onRemove(Object obj) {
        TransferToBankCustomerView $r2 = (TransferToBankCustomerView) obj;
        TransferToBankCustomerPresenter.m41349validateFields$lambda6($r2);
    }
}
