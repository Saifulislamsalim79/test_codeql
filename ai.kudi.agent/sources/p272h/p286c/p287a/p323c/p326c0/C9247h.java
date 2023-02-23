package p272h.p286c.p287a.p323c.p326c0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C4696r;
/* compiled from: MaterialShapeUtils.java */
/* renamed from: h.c.a.c.c0.h */
/* loaded from: classes2.dex */
public class C9247h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9240d m15371a(int i) {
        if (i != 0) {
            if (i != 1) {
                return m15370b();
            }
            return new C9241e();
        }
        return new C9249j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C9240d m15370b() {
        return new C9249j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C9242f m15369c() {
        return new C9242f();
    }

    /* renamed from: d */
    public static void m15368d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C9243g) {
            ((C9243g) background).m15410W(f);
        }
    }

    /* renamed from: e */
    public static void m15367e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C9243g) {
            m15366f(view, (C9243g) background);
        }
    }

    /* renamed from: f */
    public static void m15366f(View view, C9243g c9243g) {
        if (c9243g.m15418O()) {
            c9243g.m15406a0(C4696r.m26686c(view));
        }
    }
}
