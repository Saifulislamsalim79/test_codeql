package p201g.p227h.p238l;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
/* compiled from: GravityCompat.java */
/* renamed from: g.h.l.e */
/* loaded from: classes2.dex */
public final class C7693e {
    /* renamed from: a */
    public static void m17806a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: b */
    public static int m17805b(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }
}
