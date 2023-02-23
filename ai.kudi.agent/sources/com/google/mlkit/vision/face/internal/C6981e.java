package com.google.mlkit.vision.face.internal;

import android.content.Context;
import com.google.android.gms.common.C2834f;
import com.google.mlkit.common.p186b.AbstractC6931e;
import com.google.mlkit.common.p186b.C6939i;
import p272h.p286c.p287a.p300b.p307d.p317j.C8984kc;
import p272h.p286c.p287a.p300b.p307d.p317j.C9161wc;
import p272h.p286c.p360e.p361a.p363b.C9401e;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: com.google.mlkit.vision.face.internal.e */
/* loaded from: classes2.dex */
public final class C6981e extends AbstractC6931e {

    /* renamed from: b */
    private final C6939i f16713b;

    public C6981e(C6939i c6939i) {
        this.f16713b = c6939i;
    }

    @Override // com.google.mlkit.common.p186b.AbstractC6931e
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo15519a(Object obj) {
        InterfaceC6978b c6977a;
        C9401e c9401e = (C9401e) obj;
        Context m20447b = this.f16713b.m20447b();
        C8984kc m15515b = C9161wc.m15515b(C6986j.m20388b());
        if (!C6977a.m20404b(m20447b) && C2834f.m31847f().m31852a(m20447b) < 204500000) {
            c6977a = new C6989m(m20447b, c9401e, m15515b);
        } else {
            c6977a = new C6977a(m20447b, c9401e, m15515b);
        }
        return new C6984h(C9161wc.m15515b(C6986j.m20388b()), c9401e, c6977a);
    }
}
