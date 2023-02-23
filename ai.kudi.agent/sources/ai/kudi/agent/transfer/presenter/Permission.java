package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.transfer.views.TransferToBankCustomerView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Permission implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Permission NONE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Permission $r0 = new Permission();
        NONE = $r0;
    }

    private /* synthetic */ Permission() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void populateNodeForItem(Object obj) {
        TransferToBankCustomerView $r2 = (TransferToBankCustomerView) obj;
        TransferToBankCustomerPresenter.m41346validateFields$lambda3($r2);
    }
}
