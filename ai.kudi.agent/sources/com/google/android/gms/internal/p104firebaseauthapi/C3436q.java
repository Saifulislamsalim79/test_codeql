package com.google.android.gms.internal.p104firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q */
/* loaded from: classes2.dex */
public final class C3436q implements InterfaceC3333m0 {

    /* renamed from: b */
    private static final InterfaceC3592w f8866b = new C3384o();

    /* renamed from: a */
    private final InterfaceC3592w f8867a;

    public C3436q() {
        InterfaceC3592w interfaceC3592w;
        InterfaceC3592w[] interfaceC3592wArr = new InterfaceC3592w[2];
        interfaceC3592wArr[0] = C3143ep.m31170c();
        try {
            interfaceC3592w = (InterfaceC3592w) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC3592w = f8866b;
        }
        interfaceC3592wArr[1] = interfaceC3592w;
        C3410p c3410p = new C3410p(interfaceC3592wArr);
        C3117e.m31220f(c3410p, "messageInfoFactory");
        this.f8867a = c3410p;
    }

    /* renamed from: a */
    private static boolean m30456a(InterfaceC3566v interfaceC3566v) {
        return interfaceC3566v.mo30103c() == 1;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3333m0
    /* renamed from: b */
    public final <T> InterfaceC3307l0<T> mo30455b(Class<T> cls) {
        C3359n0.m30610g(cls);
        InterfaceC3566v mo30105a = this.f8867a.mo30105a(cls);
        if (mo30105a.zzb()) {
            if (AbstractC3251ip.class.isAssignableFrom(cls)) {
                return C3091d0.m31277k(C3359n0.m30616b(), C3695zo.m29874b(), mo30105a.zza());
            }
            return C3091d0.m31277k(C3359n0.m30615b0(), C3695zo.m29875a(), mo30105a.zza());
        } else if (AbstractC3251ip.class.isAssignableFrom(cls)) {
            if (m30456a(mo30105a)) {
                return C3064c0.m31339K(cls, mo30105a, C3145f0.m31167b(), AbstractC3332m.m30717e(), C3359n0.m30616b(), C3695zo.m29874b(), C3540u.m30206b());
            }
            return C3064c0.m31339K(cls, mo30105a, C3145f0.m31167b(), AbstractC3332m.m30717e(), C3359n0.m30616b(), null, C3540u.m30206b());
        } else if (m30456a(mo30105a)) {
            return C3064c0.m31339K(cls, mo30105a, C3145f0.m31168a(), AbstractC3332m.m30718d(), C3359n0.m30615b0(), C3695zo.m29875a(), C3540u.m30207a());
        } else {
            return C3064c0.m31339K(cls, mo30105a, C3145f0.m31168a(), AbstractC3332m.m30718d(), C3359n0.m30618a(), null, C3540u.m30207a());
        }
    }
}
