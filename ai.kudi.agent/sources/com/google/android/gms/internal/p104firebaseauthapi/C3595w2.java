package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w2 */
/* loaded from: classes2.dex */
public final class C3595w2<PrimitiveT, KeyProtoT extends InterfaceC3644y, PublicKeyProtoT extends InterfaceC3644y> extends C3093d2<PrimitiveT, KeyProtoT> implements InterfaceC3039b2 {

    /* renamed from: c */
    private final AbstractC3255j2<PublicKeyProtoT> f9047c;

    public C3595w2(AbstractC3621x2<KeyProtoT, PublicKeyProtoT> abstractC3621x2, AbstractC3255j2<PublicKeyProtoT> abstractC3255j2, Class<PrimitiveT> cls) {
        super(abstractC3621x2, cls);
        this.f9047c = abstractC3255j2;
    }

    /* renamed from: g */
    public final C3602w9 m30100g(AbstractC3223ho abstractC3223ho) throws GeneralSecurityException {
        try {
            C3627x8 m30047C = C3627x8.m30047C(abstractC3223ho, C3617wo.m30072a());
            C3623x4.m30061l(m30047C);
            C3019a9 m30046D = m30047C.m30046D();
            this.f9047c.mo29903i(m30046D);
            C3550u9 m30087z = C3602w9.m30087z();
            m30087z.m30175i("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
            m30087z.m30174j(m30046D.mo30001k());
            m30087z.m30176h(EnumC3576v9.ASYMMETRIC_PUBLIC);
            return m30087z.m31126e();
        } catch (zzaae e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}
