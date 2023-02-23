package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.i */
/* loaded from: classes2.dex */
public final class C3822i implements q {

    /* renamed from: c */
    private final Double f9401c;

    public C3822i(Double d) {
        if (d == null) {
            this.f9401c = Double.valueOf(Double.NaN);
        } else {
            this.f9401c = d;
        }
    }

    /* renamed from: b */
    public final Double m29539b() {
        return this.f9401c;
    }

    /* renamed from: d */
    public final q m29538d() {
        return new C3822i(this.f9401c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3822i) {
            return this.f9401c.equals(((C3822i) obj).f9401c);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m29537f() {
        boolean z = false;
        if (!Double.isNaN(this.f9401c.doubleValue()) && this.f9401c.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    public final String m29536h() {
        int scale;
        if (Double.isNaN(this.f9401c.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f9401c.doubleValue())) {
            return this.f9401c.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f9401c.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    public final int hashCode() {
        return this.f9401c.hashCode();
    }

    /* renamed from: l */
    public final Iterator<q> m29535l() {
        return null;
    }

    /* renamed from: s */
    public final q m29534s(String str, C3968r4 c3968r4, List<q> list) {
        if ("toString".equals(str)) {
            return new C4011u(m29536h());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", m29536h(), str));
    }

    public final String toString() {
        return m29536h();
    }
}
