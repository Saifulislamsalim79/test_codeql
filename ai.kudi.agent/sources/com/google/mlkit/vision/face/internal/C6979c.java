package com.google.mlkit.vision.face.internal;

import com.google.android.gms.common.internal.s;
import com.google.mlkit.common.p186b.C6929d;
import p272h.p286c.p360e.p361a.p363b.C9401e;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: com.google.mlkit.vision.face.internal.c */
/* loaded from: classes2.dex */
public final class C6979c {

    /* renamed from: a */
    private final C6981e f16711a;

    /* renamed from: b */
    private final C6929d f16712b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6979c(C6981e c6981e, C6929d c6929d) {
        this.f16711a = c6981e;
        this.f16712b = c6929d;
    }

    /* renamed from: a */
    public final FaceDetectorImpl m20399a(C9401e c9401e) {
        s.k(c9401e, "You must provide a valid FaceDetectorOptions.");
        return new FaceDetectorImpl((C6984h) this.f16711a.m20454b(c9401e), this.f16712b, c9401e, null);
    }
}
