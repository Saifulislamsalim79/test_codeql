package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.domain.wiki.BvnLookUpResponse;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Token implements InterfaceC11291f {
    public static final /* synthetic */ Token UNION;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Token $r0 = new Token();
        UNION = $r0;
    }

    private /* synthetic */ Token() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        BvnLookUpResponse $r1 = (BvnLookUpResponse) obj;
        return Log_OC.getArray($r1, "it");
    }
}
