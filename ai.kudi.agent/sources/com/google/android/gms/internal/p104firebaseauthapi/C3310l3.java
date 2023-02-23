package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l3 */
/* loaded from: classes2.dex */
public final class C3310l3 extends AbstractC3255j2<C3391o6> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3310l3() {
        super(C3391o6.class, new C3256j3(InterfaceC3542u1.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ C3174g2 m30794j(int i, int i2, int i3, int i4, EnumC3235i9 enumC3235i9, int i5) {
        C3625x6 m29971A = C3651y6.m29971A();
        C3017a7 m31408A = C3044b7.m31408A();
        m31408A.m31454h(16);
        m29971A.m30055i(m31408A.m31126e());
        m29971A.m30056h(i);
        C3368n9 m30506A = C3394o9.m30506A();
        C3446q9 m30387B = C3472r9.m30387B();
        m30387B.m30442h(enumC3235i9);
        m30387B.m30441i(i4);
        m30506A.m30572i(m30387B.m31126e());
        m30506A.m30573h(32);
        C3443q6 m30389z = C3469r6.m30389z();
        m30389z.m30454h(m29971A.m31126e());
        m30389z.m30453i(m30506A.m31126e());
        return new C3174g2(m30389z.m31126e(), i5);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3391o6> mo29976a() {
        return new C3283k3(this, C3469r6.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3391o6 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3391o6.m30513C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3391o6 c3391o6) throws GeneralSecurityException {
        C3391o6 c3391o62 = c3391o6;
        C3657yc.m29960c(c3391o62.m30507z(), 0);
        new C3388o3();
        C3388o3.m30520k(c3391o62.m30512D());
        new C3624x5();
        C3624x5.m30058l(c3391o62.m30511E());
    }
}
