package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.model.LoanHistoryResponse;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.kshock.usecases.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0305b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0305b f604e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0305b $r0 = new C0305b();
        f604e = $r0;
    }

    private /* synthetic */ C0305b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        LoanHistoryResponse $r1 = (LoanHistoryResponse) obj;
        return Log_OC.getArray($r1, "it");
    }
}
