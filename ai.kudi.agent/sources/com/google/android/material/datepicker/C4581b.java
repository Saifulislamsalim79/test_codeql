package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import p201g.p227h.p237k.C7675h;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* compiled from: CalendarItemStyle.java */
/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes2.dex */
final class C4581b {

    /* renamed from: a */
    private final Rect f11394a;

    /* renamed from: b */
    private final ColorStateList f11395b;

    /* renamed from: c */
    private final ColorStateList f11396c;

    /* renamed from: d */
    private final ColorStateList f11397d;

    /* renamed from: e */
    private final int f11398e;

    /* renamed from: f */
    private final C9250k f11399f;

    private C4581b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C9250k c9250k, Rect rect) {
        C7675h.m17868d(rect.left);
        C7675h.m17868d(rect.top);
        C7675h.m17868d(rect.right);
        C7675h.m17868d(rect.bottom);
        this.f11394a = rect;
        this.f11395b = colorStateList2;
        this.f11396c = colorStateList;
        this.f11397d = colorStateList3;
        this.f11398e = i;
        this.f11399f = c9250k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4581b m27131a(Context context, int i) {
        C7675h.m17870b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C9277l.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C9277l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C9277l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C9277l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C9277l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList m15053a = C9321c.m15053a(context, obtainStyledAttributes, C9277l.MaterialCalendarItem_itemFillColor);
        ColorStateList m15053a2 = C9321c.m15053a(context, obtainStyledAttributes, C9277l.MaterialCalendarItem_itemTextColor);
        ColorStateList m15053a3 = C9321c.m15053a(context, obtainStyledAttributes, C9277l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C9277l.MaterialCalendarItem_itemStrokeWidth, 0);
        C9250k m15320m = C9250k.m15362b(context, obtainStyledAttributes.getResourceId(C9277l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C9277l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m15320m();
        obtainStyledAttributes.recycle();
        return new C4581b(m15053a, m15053a2, m15053a3, dimensionPixelSize, m15320m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m27130b() {
        return this.f11394a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m27129c() {
        return this.f11394a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m27128d(TextView textView) {
        C9243g c9243g = new C9243g();
        C9243g c9243g2 = new C9243g();
        c9243g.setShapeAppearanceModel(this.f11399f);
        c9243g2.setShapeAppearanceModel(this.f11399f);
        c9243g.m15409X(this.f11396c);
        c9243g.m15398e0(this.f11398e, this.f11397d);
        textView.setTextColor(this.f11395b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f11395b.withAlpha(30), c9243g, c9243g2) : c9243g;
        Rect rect = this.f11394a;
        C7759x.m17492s0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
