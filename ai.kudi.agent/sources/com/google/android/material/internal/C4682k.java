package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p201g.p227h.p238l.C7698g0;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.InterfaceC7752q;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
/* compiled from: ScrimInsetsFrameLayout.java */
/* renamed from: com.google.android.material.internal.k */
/* loaded from: classes2.dex */
public class C4682k extends FrameLayout {

    /* renamed from: c */
    Drawable f11742c;

    /* renamed from: d */
    Rect f11743d;

    /* renamed from: e */
    private Rect f11744e;

    /* renamed from: f */
    private boolean f11745f;

    /* renamed from: w */
    private boolean f11746w;

    /* compiled from: ScrimInsetsFrameLayout.java */
    /* renamed from: com.google.android.material.internal.k$a */
    /* loaded from: classes2.dex */
    class C4683a implements InterfaceC7752q {
        C4683a() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7752q
        /* renamed from: a */
        public C7698g0 mo17573a(View view, C7698g0 c7698g0) {
            C4682k c4682k = C4682k.this;
            if (c4682k.f11743d == null) {
                c4682k.f11743d = new Rect();
            }
            C4682k.this.f11743d.set(c7698g0.m17784j(), c7698g0.m17782l(), c7698g0.m17783k(), c7698g0.m17785i());
            C4682k.this.mo26679a(c7698g0);
            C4682k.this.setWillNotDraw(!c7698g0.m17781m() || C4682k.this.f11742c == null);
            C7759x.m17516g0(C4682k.this);
            return c7698g0.m17791c();
        }
    }

    public C4682k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    protected void mo26679a(C7698g0 c7698g0) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f11743d == null || this.f11742c == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f11745f) {
            this.f11744e.set(0, 0, width, this.f11743d.top);
            this.f11742c.setBounds(this.f11744e);
            this.f11742c.draw(canvas);
        }
        if (this.f11746w) {
            this.f11744e.set(0, height - this.f11743d.bottom, width, height);
            this.f11742c.setBounds(this.f11744e);
            this.f11742c.draw(canvas);
        }
        Rect rect = this.f11744e;
        Rect rect2 = this.f11743d;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f11742c.setBounds(this.f11744e);
        this.f11742c.draw(canvas);
        Rect rect3 = this.f11744e;
        Rect rect4 = this.f11743d;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f11742c.setBounds(this.f11744e);
        this.f11742c.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f11742c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f11742c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f11746w = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f11745f = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f11742c = drawable;
    }

    public C4682k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11744e = new Rect();
        this.f11745f = true;
        this.f11746w = true;
        TypedArray m26690h = C4695q.m26690h(context, attributeSet, C9277l.ScrimInsetsFrameLayout, i, C9276k.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f11742c = m26690h.getDrawable(C9277l.ScrimInsetsFrameLayout_insetForeground);
        m26690h.recycle();
        setWillNotDraw(true);
        C7759x.m17562C0(this, new C4683a());
    }
}
