package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1265d;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9248i;
/* compiled from: RadialViewGroup.java */
/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes2.dex */
class C4820a extends ConstraintLayout {

    /* renamed from: c */
    private final Runnable f12212c;

    /* renamed from: d */
    private int f12213d;

    /* renamed from: e */
    private C9243g f12214e;

    /* compiled from: RadialViewGroup.java */
    /* renamed from: com.google.android.material.timepicker.a$a */
    /* loaded from: classes2.dex */
    class RunnableC4821a implements Runnable {
        RunnableC4821a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4820a.this.m26217f();
        }
    }

    public C4820a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private Drawable m26221b() {
        C9243g c9243g = new C9243g();
        this.f12214e = c9243g;
        c9243g.m15411V(new C9248i(0.5f));
        this.f12214e.m15409X(ColorStateList.valueOf(-1));
        return this.f12214e;
    }

    /* renamed from: e */
    private static boolean m26218e(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: g */
    private void m26216g() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f12212c);
            handler.post(this.f12212c);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C7759x.m17509k());
        }
        m26216g();
    }

    /* renamed from: c */
    public int m26220c() {
        return this.f12213d;
    }

    /* renamed from: d */
    public void mo26219d(int i) {
        this.f12213d = i;
        m26217f();
    }

    /* renamed from: f */
    protected void m26217f() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m26218e(getChildAt(i2))) {
                i++;
            }
        }
        C1265d c1265d = new C1265d();
        c1265d.m36603g(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != C9271f.circle_center && !m26218e(childAt)) {
                c1265d.m36599k(childAt.getId(), C9271f.circle_center, this.f12213d, f);
                f += 360.0f / (childCount - i);
            }
        }
        c1265d.m36607c(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m26217f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m26216g();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f12214e.m15409X(ColorStateList.valueOf(i));
    }

    public C4820a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C9273h.material_radial_view_group, this);
        C7759x.m17492s0(this, m26221b());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9277l.RadialViewGroup, i, 0);
        this.f12213d = obtainStyledAttributes.getDimensionPixelSize(C9277l.RadialViewGroup_materialCircleRadius, 0);
        this.f12212c = new RunnableC4821a();
        obtainStyledAttributes.recycle();
    }
}
