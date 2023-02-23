package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.f9 */
/* loaded from: classes2.dex */
public final class C3784f9 implements InterfaceC3707aa {

    /* renamed from: b */
    private static final InterfaceC3895m9 f9353b = new C3755d9();

    /* renamed from: a */
    private final InterfaceC3895m9 f9354a;

    public C3784f9() {
        InterfaceC3895m9 interfaceC3895m9;
        InterfaceC3895m9[] interfaceC3895m9Arr = new InterfaceC3895m9[2];
        interfaceC3895m9Arr[0] = C3831i8.m29519c();
        try {
            interfaceC3895m9 = (InterfaceC3895m9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC3895m9 = f9353b;
        }
        interfaceC3895m9Arr[1] = interfaceC3895m9;
        C3770e9 c3770e9 = new C3770e9(interfaceC3895m9Arr);
        C4004t8.m28904f(c3770e9, "messageInfoFactory");
        this.f9354a = c3770e9;
    }

    /* renamed from: a */
    private static boolean m29609a(InterfaceC3864k9 interfaceC3864k9) {
        return interfaceC3864k9.mo28597c() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3707aa
    /* renamed from: b */
    public final <T> InterfaceC4101z9<T> mo29608b(Class<T> cls) {
        C3724ba.m29758g(cls);
        InterfaceC3864k9 mo29382a = this.f9354a.mo29382a(cls);
        if (mo29382a.zzb()) {
            if (AbstractC3894m8.class.isAssignableFrom(cls)) {
                return C3989s9.m28972j(C3724ba.m29764b(), C3738c8.m29713b(), mo29382a.zza());
            }
            return C3989s9.m28972j(C3724ba.m29763b0(), C3738c8.m29714a(), mo29382a.zza());
        } else if (AbstractC3894m8.class.isAssignableFrom(cls)) {
            if (m29609a(mo29382a)) {
                return C3973r9.m29021F(cls, mo29382a, C4021u9.m28846b(), AbstractC3723b9.m29793d(), C3724ba.m29764b(), C3738c8.m29713b(), C3848j9.m29449b());
            }
            return C3973r9.m29021F(cls, mo29382a, C4021u9.m28846b(), AbstractC3723b9.m29793d(), C3724ba.m29764b(), null, C3848j9.m29449b());
        } else if (m29609a(mo29382a)) {
            return C3973r9.m29021F(cls, mo29382a, C4021u9.m28847a(), AbstractC3723b9.m29794c(), C3724ba.m29763b0(), C3738c8.m29714a(), C3848j9.m29450a());
        } else {
            return C3973r9.m29021F(cls, mo29382a, C4021u9.m28847a(), AbstractC3723b9.m29794c(), C3724ba.m29766a(), null, C3848j9.m29450a());
        }
    }
}
