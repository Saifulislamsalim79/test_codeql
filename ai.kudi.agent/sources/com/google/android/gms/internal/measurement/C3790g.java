package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.g */
/* loaded from: classes2.dex */
public final class C3790g implements q {

    /* renamed from: c */
    private final boolean f9363c;

    public C3790g(Boolean bool) {
        this.f9363c = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: b */
    public final Double m29596b() {
        return Double.valueOf(true != this.f9363c ? 0.0d : 1.0d);
    }

    /* renamed from: d */
    public final q m29595d() {
        return new C3790g(Boolean.valueOf(this.f9363c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3790g) && this.f9363c == ((C3790g) obj).f9363c;
    }

    /* renamed from: f */
    public final Boolean m29594f() {
        return Boolean.valueOf(this.f9363c);
    }

    /* renamed from: h */
    public final String m29593h() {
        return Boolean.toString(this.f9363c);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f9363c).hashCode();
    }

    /* renamed from: l */
    public final Iterator<q> m29592l() {
        return null;
    }

    /* renamed from: s */
    public final q m29591s(String str, C3968r4 c3968r4, List<q> list) {
        if ("toString".equals(str)) {
            return new C4011u(Boolean.toString(this.f9363c));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f9363c), str));
    }

    public final String toString() {
        return String.valueOf(this.f9363c);
    }
}
