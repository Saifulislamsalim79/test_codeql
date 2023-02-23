package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.transfer.views.TransferToBankView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Button implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Button background;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Button $r0 = new Button();
        background = $r0;
    }

    private /* synthetic */ Button() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setOnClickListener(Object obj) {
        TransferToBankView $r2 = (TransferToBankView) obj;
        TransferToBankPresenter.m41371isAccountNumberValid$lambda12($r2);
    }
}
