package ai.kudi.agent.p036v2.common.domain.repositories;

import java.util.List;
import p425j.p444e.p450e0.Object;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.v2.common.domain.repositories.Function */
/* loaded from: classes.dex */
public final /* synthetic */ class Function implements Object {
    public static final /* synthetic */ Function LEN;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Function $r0 = new Function();
        LEN = $r0;
    }

    private /* synthetic */ Function() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.Object
    public final void accept(Object obj) {
        List $r2 = (List) obj;
        ProductSectorRepository.m41507saveProductSectors$lambda1($r2);
    }
}
