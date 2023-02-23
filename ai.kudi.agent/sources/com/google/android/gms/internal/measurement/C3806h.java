package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.h */
/* loaded from: classes2.dex */
public final class C3806h implements q {

    /* renamed from: c */
    private final q f9378c;

    /* renamed from: d */
    private final String f9379d;

    public C3806h() {
        throw null;
    }

    public C3806h(String str) {
        this.f9378c = q.i;
        this.f9379d = str;
    }

    public C3806h(String str, q qVar) {
        this.f9378c = qVar;
        this.f9379d = str;
    }

    /* renamed from: a */
    public final q m29578a() {
        return this.f9378c;
    }

    /* renamed from: b */
    public final Double m29577b() {
        throw new IllegalStateException("Control is not a double");
    }

    /* renamed from: c */
    public final String m29576c() {
        return this.f9379d;
    }

    /* renamed from: d */
    public final q m29575d() {
        return new C3806h(this.f9379d, this.f9378c.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3806h) {
            C3806h c3806h = (C3806h) obj;
            return this.f9379d.equals(c3806h.f9379d) && this.f9378c.equals(c3806h.f9378c);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m29574f() {
        throw new IllegalStateException("Control is not a boolean");
    }

    /* renamed from: h */
    public final String m29573h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.f9379d.hashCode() * 31) + this.f9378c.hashCode();
    }

    /* renamed from: l */
    public final Iterator<q> m29572l() {
        return null;
    }

    /* renamed from: s */
    public final q m29571s(String str, C3968r4 c3968r4, List<q> list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
