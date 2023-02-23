package p272h.p286c.p287a.p323c.p338v;

import android.content.Context;
import android.graphics.Color;
import p201g.p227h.p228e.C7603a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.p335s.C9310a;
import p272h.p286c.p287a.p323c.p342z.C9320b;
/* compiled from: ElevationOverlayProvider.java */
/* renamed from: h.c.a.c.v.a */
/* loaded from: classes2.dex */
public class C9313a {

    /* renamed from: a */
    private final boolean f21890a;

    /* renamed from: b */
    private final int f21891b;

    /* renamed from: c */
    private final int f21892c;

    /* renamed from: d */
    private final float f21893d;

    public C9313a(Context context) {
        this.f21890a = C9320b.m15056b(context, C9233b.elevationOverlayEnabled, false);
        this.f21891b = C9310a.m15084a(context, C9233b.elevationOverlayColor, 0);
        this.f21892c = C9310a.m15084a(context, C9233b.colorSurface, 0);
        this.f21893d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m15072e(int i) {
        return C7603a.m18066h(i, 255) == this.f21892c;
    }

    /* renamed from: a */
    public float m15076a(float f) {
        float f2 = this.f21893d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m15075b(int i, float f) {
        float m15076a = m15076a(f);
        return C7603a.m18066h(C9310a.m15079f(C7603a.m18066h(i, 255), this.f21891b, m15076a), Color.alpha(i));
    }

    /* renamed from: c */
    public int m15074c(int i, float f) {
        return (this.f21890a && m15072e(i)) ? m15075b(i, f) : i;
    }

    /* renamed from: d */
    public boolean m15073d() {
        return this.f21890a;
    }
}
