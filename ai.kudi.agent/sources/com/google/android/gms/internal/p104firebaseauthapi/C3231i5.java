package com.google.android.gms.internal.p104firebaseauthapi;

import java.security.GeneralSecurityException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i5 */
/* loaded from: classes2.dex */
public final class C3231i5 {

    /* renamed from: a */
    private final InterfaceC3542u1 f8579a;

    /* renamed from: b */
    private final InterfaceC3646y1 f8580b;

    public C3231i5(InterfaceC3542u1 interfaceC3542u1) {
        this.f8579a = interfaceC3542u1;
        this.f8580b = null;
    }

    public C3231i5(InterfaceC3646y1 interfaceC3646y1) {
        this.f8579a = null;
        this.f8580b = interfaceC3646y1;
    }

    /* renamed from: a */
    public final byte[] m30982a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        InterfaceC3542u1 interfaceC3542u1 = this.f8579a;
        if (interfaceC3542u1 != null) {
            return interfaceC3542u1.mo29893a(bArr, bArr2);
        }
        return this.f8580b.mo29977a(bArr, bArr2);
    }
}
