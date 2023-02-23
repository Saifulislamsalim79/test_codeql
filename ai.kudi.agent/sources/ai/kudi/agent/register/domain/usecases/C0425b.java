package ai.kudi.agent.register.domain.usecases;

import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.register.domain.usecases.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0425b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0425b f1023e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0425b $r0 = new C0425b();
        f1023e = $r0;
    }

    private /* synthetic */ C0425b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        RegistrationInfo $r3 = (RegistrationInfo) obj;
        Boolean $r1 = SaveBusinessInfo.m40348execute$lambda0($r3);
        return $r1;
    }
}
