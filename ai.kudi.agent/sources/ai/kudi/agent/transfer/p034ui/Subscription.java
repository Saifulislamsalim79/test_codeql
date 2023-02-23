package ai.kudi.agent.transfer.p034ui;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.transfer.ui.Subscription */
/* loaded from: classes.dex */
public final /* synthetic */ class Subscription implements Object {
    public static final /* synthetic */ Subscription none;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Subscription $r0 = new Subscription();
        none = $r0;
    }

    private /* synthetic */ Subscription() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        TransferToMultipleBankFragment.m41400observerViewModel$lambda21$lambda20($r2);
    }
}
