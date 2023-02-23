package com.google.android.material.bottomappbar;

import p272h.p286c.p287a.p323c.p326c0.C9242f;
import p272h.p286c.p287a.p323c.p326c0.C9258m;
/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* renamed from: com.google.android.material.bottomappbar.a */
/* loaded from: classes2.dex */
public class C4523a extends C9242f implements Cloneable {

    /* renamed from: c */
    private float f11089c;

    /* renamed from: d */
    private float f11090d;

    /* renamed from: e */
    private float f11091e;

    /* renamed from: f */
    private float f11092f;

    /* renamed from: w */
    private float f11093w;

    @Override // p272h.p286c.p287a.p323c.p326c0.C9242f
    /* renamed from: b */
    public void mo15433b(float f, float f2, float f3, C9258m c9258m) {
        float f4 = this.f11091e;
        if (f4 == 0.0f) {
            c9258m.m15277m(f, 0.0f);
            return;
        }
        float f5 = ((this.f11090d * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f11089c;
        float f7 = f2 + this.f11093w;
        float f8 = (this.f11092f * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            c9258m.m15277m(f, 0.0f);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((f9 * f9) - (f10 * f10));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f10));
        float f13 = 90.0f - degrees;
        c9258m.m15277m(f11, 0.0f);
        float f14 = f6 * 2.0f;
        c9258m.m15289a(f11 - f6, 0.0f, f11 + f6, f14, 270.0f, degrees);
        c9258m.m15289a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        c9258m.m15289a(f12 - f6, 0.0f, f12 + f6, f14, 270.0f - degrees, degrees);
        c9258m.m15277m(f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m27536c() {
        return this.f11092f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m27535d() {
        return this.f11090d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m27534e() {
        return this.f11089c;
    }

    /* renamed from: f */
    public float m27533f() {
        return this.f11091e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m27532g(float f) {
        if (f >= 0.0f) {
            this.f11092f = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m27531h(float f) {
        this.f11090d = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m27530i(float f) {
        this.f11089c = f;
    }

    /* renamed from: j */
    public void m27529j(float f) {
        this.f11091e = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m27528k(float f) {
        this.f11093w = f;
    }
}
