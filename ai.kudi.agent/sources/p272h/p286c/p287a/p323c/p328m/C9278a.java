package p272h.p286c.p287a.p323c.p328m;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p201g.p249m.p250a.p251a.C7804a;
import p201g.p249m.p250a.p251a.C7805b;
import p201g.p249m.p250a.p251a.C7806c;
/* compiled from: AnimationUtils.java */
/* renamed from: h.c.a.c.m.a */
/* loaded from: classes2.dex */
public class C9278a {

    /* renamed from: a */
    public static final TimeInterpolator f21806a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f21807b = new C7805b();

    /* renamed from: c */
    public static final TimeInterpolator f21808c = new C7804a();

    /* renamed from: d */
    public static final TimeInterpolator f21809d = new C7806c();

    /* renamed from: e */
    public static final TimeInterpolator f21810e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m15237a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static int m15236b(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
