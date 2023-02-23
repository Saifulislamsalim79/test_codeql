package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y;
import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c2 */
/* loaded from: classes2.dex */
final class C3066c2<KeyFormatProtoT extends InterfaceC3644y, KeyProtoT extends InterfaceC3644y> {

    /* renamed from: a */
    final AbstractC3201h2<KeyFormatProtoT, KeyProtoT> f8295a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3066c2(AbstractC3201h2<KeyFormatProtoT, KeyProtoT> abstractC3201h2) {
        this.f8295a = abstractC3201h2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final KeyProtoT m31309a(AbstractC3223ho abstractC3223ho) throws GeneralSecurityException, zzaae {
        KeyFormatProtoT mo30067a = this.f8295a.mo30067a(abstractC3223ho);
        this.f8295a.mo30064e(mo30067a);
        return this.f8295a.mo30066c(mo30067a);
    }
}
