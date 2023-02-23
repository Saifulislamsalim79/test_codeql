package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d2 */
/* loaded from: classes2.dex */
class C3093d2<PrimitiveT, KeyProtoT extends InterfaceC3644y> implements InterfaceC3039b2<PrimitiveT> {

    /* renamed from: a */
    private final AbstractC3255j2<KeyProtoT> f8378a;

    /* renamed from: b */
    private final Class<PrimitiveT> f8379b;

    public C3093d2(AbstractC3255j2<KeyProtoT> abstractC3255j2, Class<PrimitiveT> cls) {
        if (!abstractC3255j2.m30904h().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", abstractC3255j2.toString(), cls.getName()));
        }
        this.f8378a = abstractC3255j2;
        this.f8379b = cls;
    }

    /* renamed from: e */
    private final C3066c2<?, KeyProtoT> m31272e() {
        return new C3066c2<>(this.f8378a.mo29976a());
    }

    /* renamed from: f */
    private final PrimitiveT m31271f(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f8379b)) {
            this.f8378a.mo29903i(keyprotot);
            return (PrimitiveT) this.f8378a.m30905f(keyprotot, (Class<PrimitiveT>) this.f8379b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3039b2
    /* renamed from: a */
    public final PrimitiveT mo31276a(InterfaceC3644y interfaceC3644y) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.f8378a.m30906e().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.f8378a.m30906e().isInstance(interfaceC3644y)) {
            return m31271f(interfaceC3644y);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3039b2
    /* renamed from: b */
    public final C3602w9 mo31275b(AbstractC3223ho abstractC3223ho) throws GeneralSecurityException {
        try {
            KeyProtoT m31309a = m31272e().m31309a(abstractC3223ho);
            C3550u9 m30087z = C3602w9.m30087z();
            m30087z.m30175i(this.f8378a.mo29904g());
            m30087z.m30174j(m31309a.mo30001k());
            m30087z.m30176h(this.f8378a.mo29906b());
            return m30087z.m31126e();
        } catch (zzaae e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3039b2
    /* renamed from: c */
    public final PrimitiveT mo31274c(AbstractC3223ho abstractC3223ho) throws GeneralSecurityException {
        try {
            return m31271f(this.f8378a.mo29905c(abstractC3223ho));
        } catch (zzaae e) {
            String valueOf = String.valueOf(this.f8378a.m30906e().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3039b2
    /* renamed from: d */
    public final InterfaceC3644y mo31273d(AbstractC3223ho abstractC3223ho) throws GeneralSecurityException {
        try {
            return m31272e().m31309a(abstractC3223ho);
        } catch (zzaae e) {
            String valueOf = String.valueOf(this.f8378a.mo29976a().m31085b().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }
}
