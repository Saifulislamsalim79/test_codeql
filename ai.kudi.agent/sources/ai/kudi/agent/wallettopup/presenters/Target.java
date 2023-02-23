package ai.kudi.agent.wallettopup.presenters;

import ai.kudi.agent.wallettopup.views.WalletTopupView;
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
    public final void setDescription(Object obj) {
        WalletTopupView $r2 = (WalletTopupView) obj;
        WalletTopupPresenter.m41768submitRequest$lambda7$lambda6($r2);
    }
}
