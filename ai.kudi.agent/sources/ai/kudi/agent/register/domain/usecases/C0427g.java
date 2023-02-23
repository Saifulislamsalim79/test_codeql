package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.domain.wiki.OtpVerificationBvnResponse;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.register.domain.usecases.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0427g implements InterfaceC11291f {

    /* renamed from: d */
    public static final /* synthetic */ C0427g f1025d;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0427g $r0 = new C0427g();
        f1025d = $r0;
    }

    private /* synthetic */ C0427g() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        OtpVerificationBvnResponse $r1 = ValidateOtp.m40354verifyOtpForBvn$lambda1($r3);
        return $r1;
    }
}
