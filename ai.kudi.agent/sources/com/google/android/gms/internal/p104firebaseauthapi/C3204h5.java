package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h5 */
/* loaded from: classes2.dex */
final class C3204h5 implements InterfaceC3022ac {

    /* renamed from: a */
    private final String f8528a;

    /* renamed from: b */
    private final int f8529b;

    /* renamed from: c */
    private C3366n7 f8530c;

    /* renamed from: d */
    private C3391o6 f8531d;

    /* renamed from: e */
    private int f8532e;

    /* renamed from: f */
    private C3018a8 f8533f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3204h5(C3020aa c3020aa) throws GeneralSecurityException {
        String m31430E = c3020aa.m31430E();
        this.f8528a = m31430E;
        if (m31430E.equals(C3121e3.f8417b)) {
            try {
                C3444q7 m30450C = C3444q7.m30450C(c3020aa.m31431D(), C3617wo.m30072a());
                this.f8530c = (C3366n7) C3067c3.m31305d(c3020aa);
                this.f8529b = m30450C.m30448z();
            } catch (zzaae e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f8528a.equals(C3121e3.f8416a)) {
            try {
                C3469r6 m30394B = C3469r6.m30394B(c3020aa.m31431D(), C3617wo.m30072a());
                this.f8531d = (C3391o6) C3067c3.m31305d(c3020aa);
                this.f8532e = m30394B.m30393C().m29963z();
                this.f8529b = this.f8532e + m30394B.m30392D().m30499z();
            } catch (zzaae e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (this.f8528a.equals(C3493s4.f8938a)) {
            try {
                C3099d8 m31263C = C3099d8.m31263C(c3020aa.m31431D(), C3617wo.m30072a());
                this.f8533f = (C3018a8) C3067c3.m31305d(c3020aa);
                this.f8529b = m31263C.m31261z();
            } catch (zzaae e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(this.f8528a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3022ac
    /* renamed from: a */
    public final C3231i5 mo31084a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == this.f8529b) {
            if (this.f8528a.equals(C3121e3.f8417b)) {
                C3340m7 m30585A = C3366n7.m30585A();
                m30585A.m31127d(this.f8530c);
                m30585A.m30711h(AbstractC3223ho.m31021O(bArr, 0, this.f8529b));
                return new C3231i5((InterfaceC3542u1) C3067c3.m31301h(this.f8528a, m30585A.m31126e(), InterfaceC3542u1.class));
            } else if (this.f8528a.equals(C3121e3.f8416a)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f8532e);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f8532e, this.f8529b);
                C3547u6 m30141A = C3573v6.m30141A();
                m30141A.m31127d(this.f8531d.m30512D());
                m30141A.m30195h(AbstractC3223ho.m31022J(copyOfRange));
                C3289k9 m30786A = C3316l9.m30786A();
                m30786A.m31127d(this.f8531d.m30511E());
                m30786A.m30849h(AbstractC3223ho.m31022J(copyOfRange2));
                C3365n6 m30515A = C3391o6.m30515A();
                m30515A.m30586j(this.f8531d.m30507z());
                m30515A.m30588h(m30141A.m31126e());
                m30515A.m30587i(m30786A.m31126e());
                return new C3231i5((InterfaceC3542u1) C3067c3.m31301h(this.f8528a, m30515A.m31126e(), InterfaceC3542u1.class));
            } else if (this.f8528a.equals(C3493s4.f8938a)) {
                C3678z7 m31453A = C3018a8.m31453A();
                m31453A.m31127d(this.f8533f);
                m31453A.m29902h(AbstractC3223ho.m31021O(bArr, 0, this.f8529b));
                return new C3231i5((InterfaceC3646y1) C3067c3.m31301h(this.f8528a, m31453A.m31126e(), InterfaceC3646y1.class));
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3022ac
    public final int zza() {
        return this.f8529b;
    }
}
