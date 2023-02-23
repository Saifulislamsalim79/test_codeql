package p201g.p227h.p235j;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p201g.p227h.p237k.C7670c;
/* compiled from: PrecomputedTextCompat.java */
/* renamed from: g.h.j.c */
/* loaded from: classes2.dex */
public class C7655c implements Spannable {

    /* renamed from: c */
    private final Spannable f18370c;

    /* renamed from: d */
    private final C7656a f18371d;

    /* renamed from: e */
    private final PrecomputedText f18372e;

    /* renamed from: a */
    public C7656a m17901a() {
        return this.f18371d;
    }

    /* renamed from: b */
    public PrecomputedText m17900b() {
        Spannable spannable = this.f18370c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f18370c.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f18370c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f18370c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f18370c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f18372e.getSpans(i, i2, cls);
        }
        return (T[]) this.f18370c.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f18370c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f18370c.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f18372e.removeSpan(obj);
                return;
            } else {
                this.f18370c.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f18372e.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.f18370c.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f18370c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f18370c.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* renamed from: g.h.j.c$a */
    /* loaded from: classes2.dex */
    public static final class C7656a {

        /* renamed from: a */
        private final TextPaint f18373a;

        /* renamed from: b */
        private final TextDirectionHeuristic f18374b;

        /* renamed from: c */
        private final int f18375c;

        /* renamed from: d */
        private final int f18376d;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: g.h.j.c$a$a */
        /* loaded from: classes2.dex */
        public static class C7657a {

            /* renamed from: a */
            private final TextPaint f18377a;

            /* renamed from: b */
            private TextDirectionHeuristic f18378b;

            /* renamed from: c */
            private int f18379c;

            /* renamed from: d */
            private int f18380d;

            public C7657a(TextPaint textPaint) {
                this.f18377a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f18379c = 1;
                    this.f18380d = 1;
                } else {
                    this.f18380d = 0;
                    this.f18379c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f18378b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f18378b = null;
                }
            }

            /* renamed from: a */
            public C7656a m17894a() {
                return new C7656a(this.f18377a, this.f18378b, this.f18379c, this.f18380d);
            }

            /* renamed from: b */
            public C7657a m17893b(int i) {
                this.f18379c = i;
                return this;
            }

            /* renamed from: c */
            public C7657a m17892c(int i) {
                this.f18380d = i;
                return this;
            }

            /* renamed from: d */
            public C7657a m17891d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f18378b = textDirectionHeuristic;
                return this;
            }
        }

        C7656a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f18373a = textPaint;
            this.f18374b = textDirectionHeuristic;
            this.f18375c = i;
            this.f18376d = i2;
        }

        /* renamed from: a */
        public boolean m17899a(C7656a c7656a) {
            if ((Build.VERSION.SDK_INT < 23 || (this.f18375c == c7656a.m17898b() && this.f18376d == c7656a.m17897c())) && this.f18373a.getTextSize() == c7656a.m17895e().getTextSize() && this.f18373a.getTextScaleX() == c7656a.m17895e().getTextScaleX() && this.f18373a.getTextSkewX() == c7656a.m17895e().getTextSkewX()) {
                if ((Build.VERSION.SDK_INT < 21 || (this.f18373a.getLetterSpacing() == c7656a.m17895e().getLetterSpacing() && TextUtils.equals(this.f18373a.getFontFeatureSettings(), c7656a.m17895e().getFontFeatureSettings()))) && this.f18373a.getFlags() == c7656a.m17895e().getFlags()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 24) {
                        if (!this.f18373a.getTextLocales().equals(c7656a.m17895e().getTextLocales())) {
                            return false;
                        }
                    } else if (i >= 17 && !this.f18373a.getTextLocale().equals(c7656a.m17895e().getTextLocale())) {
                        return false;
                    }
                    return this.f18373a.getTypeface() == null ? c7656a.m17895e().getTypeface() == null : this.f18373a.getTypeface().equals(c7656a.m17895e().getTypeface());
                }
                return false;
            }
            return false;
        }

        /* renamed from: b */
        public int m17898b() {
            return this.f18375c;
        }

        /* renamed from: c */
        public int m17897c() {
            return this.f18376d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m17896d() {
            return this.f18374b;
        }

        /* renamed from: e */
        public TextPaint m17895e() {
            return this.f18373a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C7656a) {
                C7656a c7656a = (C7656a) obj;
                if (m17899a(c7656a)) {
                    return Build.VERSION.SDK_INT < 18 || this.f18374b == c7656a.m17896d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C7670c.m17874b(Float.valueOf(this.f18373a.getTextSize()), Float.valueOf(this.f18373a.getTextScaleX()), Float.valueOf(this.f18373a.getTextSkewX()), Float.valueOf(this.f18373a.getLetterSpacing()), Integer.valueOf(this.f18373a.getFlags()), this.f18373a.getTextLocales(), this.f18373a.getTypeface(), Boolean.valueOf(this.f18373a.isElegantTextHeight()), this.f18374b, Integer.valueOf(this.f18375c), Integer.valueOf(this.f18376d));
            }
            if (i >= 21) {
                return C7670c.m17874b(Float.valueOf(this.f18373a.getTextSize()), Float.valueOf(this.f18373a.getTextScaleX()), Float.valueOf(this.f18373a.getTextSkewX()), Float.valueOf(this.f18373a.getLetterSpacing()), Integer.valueOf(this.f18373a.getFlags()), this.f18373a.getTextLocale(), this.f18373a.getTypeface(), Boolean.valueOf(this.f18373a.isElegantTextHeight()), this.f18374b, Integer.valueOf(this.f18375c), Integer.valueOf(this.f18376d));
            }
            if (i >= 18) {
                return C7670c.m17874b(Float.valueOf(this.f18373a.getTextSize()), Float.valueOf(this.f18373a.getTextScaleX()), Float.valueOf(this.f18373a.getTextSkewX()), Integer.valueOf(this.f18373a.getFlags()), this.f18373a.getTextLocale(), this.f18373a.getTypeface(), this.f18374b, Integer.valueOf(this.f18375c), Integer.valueOf(this.f18376d));
            }
            if (i >= 17) {
                return C7670c.m17874b(Float.valueOf(this.f18373a.getTextSize()), Float.valueOf(this.f18373a.getTextScaleX()), Float.valueOf(this.f18373a.getTextSkewX()), Integer.valueOf(this.f18373a.getFlags()), this.f18373a.getTextLocale(), this.f18373a.getTypeface(), this.f18374b, Integer.valueOf(this.f18375c), Integer.valueOf(this.f18376d));
            }
            return C7670c.m17874b(Float.valueOf(this.f18373a.getTextSize()), Float.valueOf(this.f18373a.getTextScaleX()), Float.valueOf(this.f18373a.getTextSkewX()), Integer.valueOf(this.f18373a.getFlags()), this.f18373a.getTypeface(), this.f18374b, Integer.valueOf(this.f18375c), Integer.valueOf(this.f18376d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f18373a.getTextSize());
            sb.append(", textScaleX=" + this.f18373a.getTextScaleX());
            sb.append(", textSkewX=" + this.f18373a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f18373a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f18373a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                sb.append(", textLocale=" + this.f18373a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f18373a.getTextLocale());
            }
            sb.append(", typeface=" + this.f18373a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f18373a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f18374b);
            sb.append(", breakStrategy=" + this.f18375c);
            sb.append(", hyphenationFrequency=" + this.f18376d);
            sb.append("}");
            return sb.toString();
        }

        public C7656a(PrecomputedText.Params params) {
            this.f18373a = params.getTextPaint();
            this.f18374b = params.getTextDirection();
            this.f18375c = params.getBreakStrategy();
            this.f18376d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }
    }
}
