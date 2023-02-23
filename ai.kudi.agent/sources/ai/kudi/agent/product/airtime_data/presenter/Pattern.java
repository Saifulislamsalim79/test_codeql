package ai.kudi.agent.product.airtime_data.presenter;

import ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Pattern implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Pattern NONE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Pattern $r0 = new Pattern();
        NONE = $r0;
    }

    private /* synthetic */ Pattern() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void push(Object obj) {
        AirtimeAndDataView $r2 = (AirtimeAndDataView) obj;
        AirtimeAndDataPresenter.m40164validateDataPurchaseFields$lambda8($r2);
    }
}
