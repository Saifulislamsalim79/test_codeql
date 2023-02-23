package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v3 */
/* loaded from: classes2.dex */
public final class C3570v3 extends AbstractC3255j2<C3366n7> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3570v3() {
        super(C3366n7.class, new C3518t3(InterfaceC3542u1.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ C3174g2 m30142j(int i, int i2) {
        C3418p7 m30452A = C3444q7.m30452A();
        m30452A.m30472h(i);
        return new C3174g2(m30452A.m31126e(), i2);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3366n7> mo29976a() {
        return new C3544u3(this, C3444q7.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3366n7 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3366n7.m30583C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3366n7 c3366n7) throws GeneralSecurityException {
        C3366n7 c3366n72 = c3366n7;
        C3657yc.m29960c(c3366n72.m30579z(), 0);
        C3657yc.m29961b(c3366n72.m30582D().mo31014f());
    }
}
