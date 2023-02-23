package ai.kudi.agent.product.repository;

import java.util.List;
import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class FalseFileFilter implements Object {
    public static final /* synthetic */ FalseFileFilter FALSE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        FalseFileFilter $r0 = new FalseFileFilter();
        FALSE = $r0;
    }

    private /* synthetic */ FalseFileFilter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        List $r2 = (List) obj;
        BillerRepositoryImpl$fetchFrequentlyUsedBillers$2.m40229invoke$lambda0($r2);
    }
}
