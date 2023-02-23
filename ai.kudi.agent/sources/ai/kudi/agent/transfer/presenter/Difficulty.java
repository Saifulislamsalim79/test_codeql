package ai.kudi.agent.transfer.presenter;

import ai.kudi.agent.transfer.views.TransferToBankView;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Difficulty implements C9410b.InterfaceC9411a {
    public static final /* synthetic */ Difficulty HARD;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Difficulty $r0 = new Difficulty();
        HARD = $r0;
    }

    private /* synthetic */ Difficulty() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setValue(Object obj) {
        TransferToBankView $r2 = (TransferToBankView) obj;
        TransferToBankPresenter.m41356checkCachedLastTransferLookUpResult$lambda2($r2);
    }
}
