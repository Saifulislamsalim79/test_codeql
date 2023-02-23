package ai.kudi.agent.register.domain.usecases;

import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class BigReal implements InterfaceC11291f {
    public static final /* synthetic */ BigReal ZERO;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        BigReal $r0 = new BigReal();
        ZERO = $r0;
    }

    private /* synthetic */ BigReal() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        List $r1 = FetchLocation.m40337execute$lambda0($r3);
        return $r1;
    }
}
