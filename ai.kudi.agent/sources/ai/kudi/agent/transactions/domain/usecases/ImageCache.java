package ai.kudi.agent.transactions.domain.usecases;

import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ImageCache implements InterfaceC11291f {
    public static final /* synthetic */ ImageCache inst;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ImageCache $r0 = new ImageCache();
        inst = $r0;
    }

    private /* synthetic */ ImageCache() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        VerifyPendingResponse $r1 = (VerifyPendingResponse) obj;
        return Log_OC.getArray($r1, "it");
    }
}
