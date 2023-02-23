package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r4 */
/* loaded from: classes2.dex */
public final class C3467r4 extends AbstractC3255j2<C3018a8> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3467r4() {
        super(C3018a8.class, new C3389o4(InterfaceC3646y1.class));
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: a */
    public final AbstractC3201h2<?, C3018a8> mo29976a() {
        return new C3415p4(this, C3099d8.class);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: b */
    public final EnumC3576v9 mo29906b() {
        return EnumC3576v9.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3018a8 mo29905c(AbstractC3223ho abstractC3223ho) throws zzaae {
        return C3018a8.m31451C(abstractC3223ho, C3617wo.m30072a());
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: g */
    public final String mo29904g() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3255j2
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo29903i(C3018a8 c3018a8) throws GeneralSecurityException {
        C3018a8 c3018a82 = c3018a8;
        C3657yc.m29960c(c3018a82.m31447z(), 0);
        if (c3018a82.m31450D().mo31014f() == 64) {
            return;
        }
        int mo31014f = c3018a82.m31450D().mo31014f();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(mo31014f);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }
}
