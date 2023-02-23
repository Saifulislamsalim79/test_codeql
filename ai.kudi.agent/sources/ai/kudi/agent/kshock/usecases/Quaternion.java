package ai.kudi.agent.kshock.usecases;

import ai.kudi.agent.kshock.data.model.OtpStatusResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Quaternion implements InterfaceC11291f {

    /* renamed from: J */
    public static final /* synthetic */ Quaternion f603J;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Quaternion $r0 = new Quaternion();
        f603J = $r0;
    }

    private /* synthetic */ Quaternion() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        OtpStatusResponse $r3 = (OtpStatusResponse) obj;
        String $r1 = OtpStatusCheck.m39695isOtpRequired$lambda1($r3);
        return $r1;
    }
}
