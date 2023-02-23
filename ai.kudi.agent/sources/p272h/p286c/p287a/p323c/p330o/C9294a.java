package p272h.p286c.p287a.p323c.p330o;

import android.graphics.Canvas;
import android.os.Build;
/* compiled from: CanvasCompat.java */
/* renamed from: h.c.a.c.o.a */
/* loaded from: classes2.dex */
public class C9294a {
    /* renamed from: a */
    public static int m15145a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
