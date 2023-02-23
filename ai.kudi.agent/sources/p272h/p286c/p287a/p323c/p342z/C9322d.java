package p272h.p286c.p287a.p323c.p342z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p057e.C1355f;
import p272h.p286c.p287a.p323c.C9277l;
/* compiled from: TextAppearance.java */
/* renamed from: h.c.a.c.z.d */
/* loaded from: classes2.dex */
public class C9322d {

    /* renamed from: a */
    public final ColorStateList f21904a;

    /* renamed from: b */
    public final ColorStateList f21905b;

    /* renamed from: c */
    public final ColorStateList f21906c;

    /* renamed from: d */
    public final ColorStateList f21907d;

    /* renamed from: e */
    public final String f21908e;

    /* renamed from: f */
    public final int f21909f;

    /* renamed from: g */
    public final int f21910g;

    /* renamed from: h */
    public final float f21911h;

    /* renamed from: i */
    public final float f21912i;

    /* renamed from: j */
    public final float f21913j;

    /* renamed from: k */
    public final boolean f21914k;

    /* renamed from: l */
    public final float f21915l;

    /* renamed from: m */
    public float f21916m;

    /* renamed from: n */
    private final int f21917n;

    /* renamed from: o */
    private boolean f21918o = false;

    /* renamed from: p */
    private Typeface f21919p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* renamed from: h.c.a.c.z.d$a */
    /* loaded from: classes2.dex */
    public class C9323a extends C1355f.AbstractC1358c {

        /* renamed from: a */
        final /* synthetic */ AbstractC9326f f21920a;

        C9323a(AbstractC9326f abstractC9326f) {
            this.f21920a = abstractC9326f;
        }

        @Override // androidx.core.content.p057e.C1355f.AbstractC1358c
        /* renamed from: d */
        public void mo15033d(int i) {
            C9322d.this.f21918o = true;
            this.f21920a.mo15030a(i);
        }

        @Override // androidx.core.content.p057e.C1355f.AbstractC1358c
        /* renamed from: e */
        public void mo15032e(Typeface typeface) {
            C9322d c9322d = C9322d.this;
            c9322d.f21919p = Typeface.create(typeface, c9322d.f21909f);
            C9322d.this.f21918o = true;
            this.f21920a.mo15029b(C9322d.this.f21919p, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* renamed from: h.c.a.c.z.d$b */
    /* loaded from: classes2.dex */
    public class C9324b extends AbstractC9326f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f21922a;

        /* renamed from: b */
        final /* synthetic */ AbstractC9326f f21923b;

        C9324b(TextPaint textPaint, AbstractC9326f abstractC9326f) {
            this.f21922a = textPaint;
            this.f21923b = abstractC9326f;
        }

        @Override // p272h.p286c.p287a.p323c.p342z.AbstractC9326f
        /* renamed from: a */
        public void mo15030a(int i) {
            this.f21923b.mo15030a(i);
        }

        @Override // p272h.p286c.p287a.p323c.p342z.AbstractC9326f
        /* renamed from: b */
        public void mo15029b(Typeface typeface, boolean z) {
            C9322d.this.m15034l(this.f21922a, typeface);
            this.f21923b.mo15029b(typeface, z);
        }
    }

    public C9322d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C9277l.TextAppearance);
        this.f21916m = obtainStyledAttributes.getDimension(C9277l.TextAppearance_android_textSize, 0.0f);
        this.f21904a = C9321c.m15053a(context, obtainStyledAttributes, C9277l.TextAppearance_android_textColor);
        this.f21905b = C9321c.m15053a(context, obtainStyledAttributes, C9277l.TextAppearance_android_textColorHint);
        this.f21906c = C9321c.m15053a(context, obtainStyledAttributes, C9277l.TextAppearance_android_textColorLink);
        this.f21909f = obtainStyledAttributes.getInt(C9277l.TextAppearance_android_textStyle, 0);
        this.f21910g = obtainStyledAttributes.getInt(C9277l.TextAppearance_android_typeface, 1);
        int m15049e = C9321c.m15049e(obtainStyledAttributes, C9277l.TextAppearance_fontFamily, C9277l.TextAppearance_android_fontFamily);
        this.f21917n = obtainStyledAttributes.getResourceId(m15049e, 0);
        this.f21908e = obtainStyledAttributes.getString(m15049e);
        obtainStyledAttributes.getBoolean(C9277l.TextAppearance_textAllCaps, false);
        this.f21907d = C9321c.m15053a(context, obtainStyledAttributes, C9277l.TextAppearance_android_shadowColor);
        this.f21911h = obtainStyledAttributes.getFloat(C9277l.TextAppearance_android_shadowDx, 0.0f);
        this.f21912i = obtainStyledAttributes.getFloat(C9277l.TextAppearance_android_shadowDy, 0.0f);
        this.f21913j = obtainStyledAttributes.getFloat(C9277l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C9277l.MaterialTextAppearance);
            this.f21914k = obtainStyledAttributes2.hasValue(C9277l.MaterialTextAppearance_android_letterSpacing);
            this.f21915l = obtainStyledAttributes2.getFloat(C9277l.MaterialTextAppearance_android_letterSpacing, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f21914k = false;
        this.f21915l = 0.0f;
    }

    /* renamed from: d */
    private void m15042d() {
        String str;
        if (this.f21919p == null && (str = this.f21908e) != null) {
            this.f21919p = Typeface.create(str, this.f21909f);
        }
        if (this.f21919p == null) {
            int i = this.f21910g;
            if (i == 1) {
                this.f21919p = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f21919p = Typeface.SERIF;
            } else if (i != 3) {
                this.f21919p = Typeface.DEFAULT;
            } else {
                this.f21919p = Typeface.MONOSPACE;
            }
            this.f21919p = Typeface.create(this.f21919p, this.f21909f);
        }
    }

    /* renamed from: i */
    private boolean m15037i(Context context) {
        return C9325e.m15031a();
    }

    /* renamed from: e */
    public Typeface m15041e() {
        m15042d();
        return this.f21919p;
    }

    /* renamed from: f */
    public Typeface m15040f(Context context) {
        if (this.f21918o) {
            return this.f21919p;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m36245e = C1355f.m36245e(context, this.f21917n);
                this.f21919p = m36245e;
                if (m36245e != null) {
                    this.f21919p = Typeface.create(m36245e, this.f21909f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f21908e, e);
            }
        }
        m15042d();
        this.f21918o = true;
        return this.f21919p;
    }

    /* renamed from: g */
    public void m15039g(Context context, TextPaint textPaint, AbstractC9326f abstractC9326f) {
        m15034l(textPaint, m15041e());
        m15038h(context, new C9324b(textPaint, abstractC9326f));
    }

    /* renamed from: h */
    public void m15038h(Context context, AbstractC9326f abstractC9326f) {
        if (m15037i(context)) {
            m15040f(context);
        } else {
            m15042d();
        }
        if (this.f21917n == 0) {
            this.f21918o = true;
        }
        if (this.f21918o) {
            abstractC9326f.mo15029b(this.f21919p, true);
            return;
        }
        try {
            C1355f.m36243g(context, this.f21917n, new C9323a(abstractC9326f), null);
        } catch (Resources.NotFoundException unused) {
            this.f21918o = true;
            abstractC9326f.mo15030a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f21908e, e);
            this.f21918o = true;
            abstractC9326f.mo15030a(-3);
        }
    }

    /* renamed from: j */
    public void m15036j(Context context, TextPaint textPaint, AbstractC9326f abstractC9326f) {
        m15035k(context, textPaint, abstractC9326f);
        ColorStateList colorStateList = this.f21904a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f21913j;
        float f2 = this.f21911h;
        float f3 = this.f21912i;
        ColorStateList colorStateList2 = this.f21907d;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: k */
    public void m15035k(Context context, TextPaint textPaint, AbstractC9326f abstractC9326f) {
        if (m15037i(context)) {
            m15034l(textPaint, m15040f(context));
        } else {
            m15039g(context, textPaint, abstractC9326f);
        }
    }

    /* renamed from: l */
    public void m15034l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f21909f;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f21916m);
        if (Build.VERSION.SDK_INT < 21 || !this.f21914k) {
            return;
        }
        textPaint.setLetterSpacing(this.f21915l);
    }
}
