package ai.kudi.agent.transactions.presenters;

import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class FalseFileFilter implements Object {
    public static final /* synthetic */ FalseFileFilter IMAGE_GAP;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        FalseFileFilter $r0 = new FalseFileFilter();
        IMAGE_GAP = $r0;
    }

    private /* synthetic */ FalseFileFilter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        Throwable $r2 = (Throwable) obj;
        TransactionDetailsPresenter.m41187isUserAllowedToAccessFeature$lambda24($r2);
    }
}
