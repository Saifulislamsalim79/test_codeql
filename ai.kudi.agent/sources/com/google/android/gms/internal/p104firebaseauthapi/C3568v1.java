package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v1 */
/* loaded from: classes2.dex */
public final class C3568v1 implements InterfaceC3335m2 {

    /* renamed from: a */
    private final OutputStream f9015a;

    private C3568v1(OutputStream outputStream) {
        this.f9015a = outputStream;
    }

    /* renamed from: c */
    public static InterfaceC3335m2 m30144c(OutputStream outputStream) {
        return new C3568v1(outputStream);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3335m2
    /* renamed from: a */
    public final void mo30146a(C3236ia c3236ia) throws IOException {
        try {
            c3236ia.m30161c(this.f9015a);
        } finally {
            this.f9015a.close();
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3335m2
    /* renamed from: b */
    public final void mo30145b(C3208h9 c3208h9) throws IOException {
        throw null;
    }
}
