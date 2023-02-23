package ai.kudi.agent.product.airtime_data.presenter;

import ai.kudi.agent.product.airtime_data.views.AirtimeAndDataView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class MainActivity$21 implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ MainActivity$21 STATUS_COMPLETED;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        MainActivity$21 $r0 = new MainActivity$21();
        STATUS_COMPLETED = $r0;
    }

    private /* synthetic */ MainActivity$21() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onPreferenceChange(Object obj) {
        AirtimeAndDataView $r2 = (AirtimeAndDataView) obj;
        AirtimeAndDataPresenter.m40163validateDataPurchaseFields$lambda11($r2);
    }
}
