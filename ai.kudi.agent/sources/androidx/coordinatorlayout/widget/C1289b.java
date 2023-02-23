package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: ViewGroupUtils.java */
/* renamed from: androidx.coordinatorlayout.widget.b */
/* loaded from: classes2.dex */
public class C1289b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f4047a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f4048b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m36475a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m36473c(viewGroup, view, rect);
    }

    /* renamed from: b */
    private static void m36474b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m36474b(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: c */
    static void m36473c(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f4047a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f4047a.set(matrix);
        } else {
            matrix.reset();
        }
        m36474b(viewGroup, view, matrix);
        RectF rectF = f4048b.get();
        if (rectF == null) {
            rectF = new RectF();
            f4048b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
