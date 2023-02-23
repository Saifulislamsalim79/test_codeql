package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p342z.C9320b;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalendarStyle.java */
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes2.dex */
public final class C4582c {

    /* renamed from: a */
    final C4581b f11400a;

    /* renamed from: b */
    final C4581b f11401b;

    /* renamed from: c */
    final C4581b f11402c;

    /* renamed from: d */
    final C4581b f11403d;

    /* renamed from: e */
    final C4581b f11404e;

    /* renamed from: f */
    final C4581b f11405f;

    /* renamed from: g */
    final C4581b f11406g;

    /* renamed from: h */
    final Paint f11407h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4582c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C9320b.m15055c(context, C9233b.materialCalendarStyle, C4588h.class.getCanonicalName()), C9277l.MaterialCalendar);
        this.f11400a = C4581b.m27131a(context, obtainStyledAttributes.getResourceId(C9277l.MaterialCalendar_dayStyle, 0));
        this.f11406g = C4581b.m27131a(context, obtainStyledAttributes.getResourceId(C9277l.MaterialCalendar_dayInvalidStyle, 0));
        this.f11401b = C4581b.m27131a(context, obtainStyledAttributes.getResourceId(C9277l.MaterialCalendar_daySelectedStyle, 0));
        this.f11402c = C4581b.m27131a(context, obtainStyledAttributes.getResourceId(C9277l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList m15053a = C9321c.m15053a(context, obtainStyledAttributes, C9277l.MaterialCalendar_rangeFillColor);
        this.f11403d = C4581b.m27131a(context, obtainStyledAttributes.getResourceId(C9277l.MaterialCalendar_yearStyle, 0));
        this.f11404e = C4581b.m27131a(context, obtainStyledAttributes.getResourceId(C9277l.MaterialCalendar_yearSelectedStyle, 0));
        this.f11405f = C4581b.m27131a(context, obtainStyledAttributes.getResourceId(C9277l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f11407h = paint;
        paint.setColor(m15053a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
