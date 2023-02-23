package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: DividerItemDecoration.java */
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes2.dex */
public class C1723k extends RecyclerView.AbstractC1634o {

    /* renamed from: d */
    private static final int[] f5289d = {16843284};

    /* renamed from: a */
    private Drawable f5290a;

    /* renamed from: b */
    private int f5291b;

    /* renamed from: c */
    private final Rect f5292c = new Rect();

    public C1723k(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5289d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f5290a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        m34702g(i);
    }

    /* renamed from: d */
    private void m34705d(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().m35131Z(childAt, this.f5292c);
            int round = this.f5292c.right + Math.round(childAt.getTranslationX());
            this.f5290a.setBounds(round - this.f5290a.getIntrinsicWidth(), i, round, height);
            this.f5290a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: e */
    private void m34704e(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.m35290i0(childAt, this.f5292c);
            int round = this.f5292c.bottom + Math.round(childAt.getTranslationY());
            this.f5290a.setBounds(i, round - this.f5290a.getIntrinsicHeight(), width, round);
            this.f5290a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: f */
    public void m34703f(Drawable drawable) {
        if (drawable != null) {
            this.f5290a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: g */
    public void m34702g(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f5291b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
        Drawable drawable = this.f5290a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f5291b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
        if (recyclerView.getLayoutManager() == null || this.f5290a == null) {
            return;
        }
        if (this.f5291b == 1) {
            m34704e(canvas, recyclerView);
        } else {
            m34705d(canvas, recyclerView);
        }
    }
}
