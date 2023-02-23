package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: DescendantOffsetUtils.java */
/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes2.dex */
public class C4661c {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f11698a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f11699b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m26786a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m26784c(viewGroup, view, rect);
    }

    /* renamed from: b */
    private static void m26785b(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m26785b(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: c */
    public static void m26784c(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f11698a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f11698a.set(matrix);
        } else {
            matrix.reset();
        }
        m26785b(viewGroup, view, matrix);
        RectF rectF = f11699b.get();
        if (rectF == null) {
            rectF = new RectF();
            f11699b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
