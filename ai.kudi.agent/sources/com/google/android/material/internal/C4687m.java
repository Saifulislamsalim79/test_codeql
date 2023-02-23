package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import p201g.p227h.p237k.C7675h;
/* compiled from: StaticLayoutBuilderCompat.java */
/* renamed from: com.google.android.material.internal.m */
/* loaded from: classes2.dex */
final class C4687m {

    /* renamed from: k */
    private static boolean f11755k;

    /* renamed from: l */
    private static Constructor<StaticLayout> f11756l;

    /* renamed from: m */
    private static Object f11757m;

    /* renamed from: a */
    private CharSequence f11758a;

    /* renamed from: b */
    private final TextPaint f11759b;

    /* renamed from: c */
    private final int f11760c;

    /* renamed from: e */
    private int f11762e;

    /* renamed from: i */
    private boolean f11766i;

    /* renamed from: d */
    private int f11761d = 0;

    /* renamed from: f */
    private Layout.Alignment f11763f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f11764g = Integer.MAX_VALUE;

    /* renamed from: h */
    private boolean f11765h = true;

    /* renamed from: j */
    private TextUtils.TruncateAt f11767j = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StaticLayoutBuilderCompat.java */
    /* renamed from: com.google.android.material.internal.m$a */
    /* loaded from: classes2.dex */
    public static class C4688a extends Exception {
        C4688a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private C4687m(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f11758a = charSequence;
        this.f11759b = textPaint;
        this.f11760c = i;
        this.f11762e = charSequence.length();
    }

    /* renamed from: b */
    private void m26715b() throws C4688a {
        Class<?> cls;
        if (f11755k) {
            return;
        }
        try {
            boolean z = this.f11766i && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f11757m = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = C4687m.class.getClassLoader();
                String str = this.f11766i ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f11757m = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            f11756l = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f11755k = true;
        } catch (Exception e) {
            throw new C4688a(e);
        }
    }

    /* renamed from: c */
    public static C4687m m26714c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C4687m(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m26716a() throws C4688a {
        if (this.f11758a == null) {
            this.f11758a = "";
        }
        int max = Math.max(0, this.f11760c);
        CharSequence charSequence = this.f11758a;
        if (this.f11764g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f11759b, max, this.f11767j);
        }
        this.f11762e = Math.min(charSequence.length(), this.f11762e);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f11766i) {
                this.f11763f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f11761d, this.f11762e, this.f11759b, max);
            obtain.setAlignment(this.f11763f);
            obtain.setIncludePad(this.f11765h);
            obtain.setTextDirection(this.f11766i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f11767j;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f11764g);
            return obtain.build();
        }
        m26715b();
        try {
            Constructor<StaticLayout> constructor = f11756l;
            C7675h.m17866f(constructor);
            Object obj = f11757m;
            C7675h.m17866f(obj);
            return constructor.newInstance(charSequence, Integer.valueOf(this.f11761d), Integer.valueOf(this.f11762e), this.f11759b, Integer.valueOf(max), this.f11763f, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f11765h), null, Integer.valueOf(max), Integer.valueOf(this.f11764g));
        } catch (Exception e) {
            throw new C4688a(e);
        }
    }

    /* renamed from: d */
    public C4687m m26713d(Layout.Alignment alignment) {
        this.f11763f = alignment;
        return this;
    }

    /* renamed from: e */
    public C4687m m26712e(TextUtils.TruncateAt truncateAt) {
        this.f11767j = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C4687m m26711f(boolean z) {
        this.f11765h = z;
        return this;
    }

    /* renamed from: g */
    public C4687m m26710g(boolean z) {
        this.f11766i = z;
        return this;
    }

    /* renamed from: h */
    public C4687m m26709h(int i) {
        this.f11764g = i;
        return this;
    }
}
