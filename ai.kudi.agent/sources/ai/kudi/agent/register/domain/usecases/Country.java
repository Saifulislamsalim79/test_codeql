package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class Country implements InterfaceC11291f {

    /* renamed from: LR */
    public static final /* synthetic */ Country f1011LR;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Country $r0 = new Country();
        f1011LR = $r0;
    }

    private /* synthetic */ Country() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        OtpVerificationModel $r1 = ResendOtp.m40344execute$lambda0($r3);
        return $r1;
    }
}
