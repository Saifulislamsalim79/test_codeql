package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.transfer.views.TransferToBankCustomerView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Cache implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Cache NONE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Cache $r0 = new Cache();
        NONE = $r0;
    }

    private /* synthetic */ Cache() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addElement(Object obj) {
        TransferToBankCustomerView $r2 = (TransferToBankCustomerView) obj;
        TransferToBankCustomerPresenter.m41344validateFields$lambda11($r2);
    }
}
