package com.google.android.gms.internal.p104firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v4 */
/* loaded from: classes2.dex */
public final class C3571v4 extends AbstractC3228i2<InterfaceC3672z1, C3627x8> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3571v4(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3228i2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC3672z1 mo29907b(C3627x8 c3627x8) throws GeneralSecurityException {
        C3627x8 c3627x82 = c3627x8;
        C3549u8 m31446A = c3627x82.m30046D().m31446A();
        C3100d9 m30181E = m31446A.m30181E();
        int m31118c = C3177g5.m31118c(m30181E.m31258C());
        byte[] m31017Z = c3627x82.m30045E().m31017Z();
        return new C3049bc((ECPrivateKey) C3184gc.f8508i.m31099a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, m31017Z), C3130ec.m31189f(m31118c))), m30181E.m31256E().m31017Z(), C3177g5.m31120a(m30181E.m31257D()), C3177g5.m31117d(m31446A.m30177z()), new C3204h5(m31446A.m30185A().m30576C()));
    }
}
