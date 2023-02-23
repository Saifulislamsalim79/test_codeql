package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Unit implements InterfaceC11291f {
    public static final /* synthetic */ Unit PERCENT;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Unit $r0 = new Unit();
        PERCENT = $r0;
    }

    private /* synthetic */ Unit() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        OtpVerificationModel $r1 = (OtpVerificationModel) obj;
        return Log_OC.getArray($r1, "it");
    }
}
