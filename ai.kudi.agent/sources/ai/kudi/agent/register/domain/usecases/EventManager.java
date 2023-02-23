package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import p425j.p444e.p450e0.InterfaceC11291f;
import retrofit2.C14840l;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class EventManager implements InterfaceC11291f {

    /* renamed from: em */
    public static final /* synthetic */ EventManager f1012em;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        EventManager $r0 = new EventManager();
        f1012em = $r0;
    }

    private /* synthetic */ EventManager() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        C14840l $r3 = (C14840l) obj;
        OtpVerificationModel $r1 = ResendOtp.m40345executeAccountHolderVerification$lambda1($r3);
        return $r1;
    }
}
