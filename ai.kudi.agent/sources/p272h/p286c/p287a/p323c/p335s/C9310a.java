package p272h.p286c.p287a.p323c.p335s;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p201g.p227h.p228e.C7603a;
import p272h.p286c.p287a.p323c.p342z.C9320b;
/* compiled from: MaterialColors.java */
/* renamed from: h.c.a.c.s.a */
/* loaded from: classes2.dex */
public class C9310a {
    /* renamed from: a */
    public static int m15084a(Context context, int i, int i2) {
        TypedValue m15057a = C9320b.m15057a(context, i);
        return m15057a != null ? m15057a.data : i2;
    }

    /* renamed from: b */
    public static int m15083b(Context context, int i, String str) {
        return C9320b.m15055c(context, i, str);
    }

    /* renamed from: c */
    public static int m15082c(View view, int i) {
        return C9320b.m15054d(view, i);
    }

    /* renamed from: d */
    public static int m15081d(View view, int i, int i2) {
        return m15084a(view.getContext(), i, i2);
    }

    /* renamed from: e */
    public static int m15080e(int i, int i2) {
        return C7603a.m18069e(i2, i);
    }

    /* renamed from: f */
    public static int m15079f(int i, int i2, float f) {
        return m15080e(i, C7603a.m18066h(i2, Math.round(Color.alpha(i2) * f)));
    }

    /* renamed from: g */
    public static int m15078g(View view, int i, int i2, float f) {
        return m15079f(m15082c(view, i), m15082c(view, i2), f);
    }
}
