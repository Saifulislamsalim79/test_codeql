package ai.kudi.agent.product.airtime_data.presenter;

import ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView;
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
    public final void writeElement(Object obj) {
        AirtimeAndDataView $r2 = (AirtimeAndDataView) obj;
        AirtimeAndDataPresenter.m40162validateDataPurchaseFields$lambda10($r2);
    }
}
