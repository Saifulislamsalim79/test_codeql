package p272h.p286c.p287a.p323c.p329n;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.C4680j;
import p272h.p286c.p287a.p323c.p329n.C9289a;
/* compiled from: BadgeUtils.java */
/* renamed from: h.c.a.c.n.b */
/* loaded from: classes2.dex */
public class C9293b {

    /* renamed from: a */
    public static final boolean f21862a;

    static {
        f21862a = Build.VERSION.SDK_INT < 18;
    }

    /* renamed from: a */
    public static void m15151a(C9289a c9289a, View view, FrameLayout frameLayout) {
        m15147e(c9289a, view, frameLayout);
        if (c9289a.m15191j() != null) {
            c9289a.m15191j().setForeground(c9289a);
        } else if (!f21862a) {
            view.getOverlay().add(c9289a);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static SparseArray<C9289a> m15150b(Context context, C4680j c4680j) {
        SparseArray<C9289a> sparseArray = new SparseArray<>(c4680j.size());
        for (int i = 0; i < c4680j.size(); i++) {
            int keyAt = c4680j.keyAt(i);
            C9289a.C9291b c9291b = (C9289a.C9291b) c4680j.valueAt(i);
            if (c9291b != null) {
                sparseArray.put(keyAt, C9289a.m15195f(context, c9291b));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: c */
    public static C4680j m15149c(SparseArray<C9289a> sparseArray) {
        C4680j c4680j = new C4680j();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            C9289a valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                c4680j.put(keyAt, valueAt.m15188m());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return c4680j;
    }

    /* renamed from: d */
    public static void m15148d(C9289a c9289a, View view) {
        if (c9289a == null) {
            return;
        }
        if (!f21862a && c9289a.m15191j() == null) {
            view.getOverlay().remove(c9289a);
        } else {
            c9289a.m15191j().setForeground(null);
        }
    }

    /* renamed from: e */
    public static void m15147e(C9289a c9289a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c9289a.setBounds(rect);
        c9289a.m15203D(view, frameLayout);
    }

    /* renamed from: f */
    public static void m15146f(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
