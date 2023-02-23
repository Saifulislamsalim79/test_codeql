package com.google.firebase.components;

import ai.kudi.agent.payments.domain.wiki.MPOSPaymentMethod;
/* compiled from: Dependency.java */
/* renamed from: com.google.firebase.components.u */
/* loaded from: classes2.dex */
public final class C5313u {

    /* renamed from: a */
    private final Class<?> f13148a;

    /* renamed from: b */
    private final int f13149b;

    /* renamed from: c */
    private final int f13150c;

    private C5313u(Class<?> cls, int i, int i2) {
        C5318z.m25138c(cls, "Null dependency anInterface.");
        this.f13148a = cls;
        this.f13149b = i;
        this.f13150c = i2;
    }

    /* renamed from: a */
    public static C5313u m25166a(Class<?> cls) {
        return new C5313u(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m25165b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    /* renamed from: h */
    public static C5313u m25159h(Class<?> cls) {
        return new C5313u(cls, 0, 0);
    }

    /* renamed from: i */
    public static C5313u m25158i(Class<?> cls) {
        return new C5313u(cls, 0, 1);
    }

    /* renamed from: j */
    public static C5313u m25157j(Class<?> cls) {
        return new C5313u(cls, 1, 0);
    }

    /* renamed from: k */
    public static C5313u m25156k(Class<?> cls) {
        return new C5313u(cls, 1, 1);
    }

    /* renamed from: l */
    public static C5313u m25155l(Class<?> cls) {
        return new C5313u(cls, 2, 0);
    }

    /* renamed from: c */
    public Class<?> m25164c() {
        return this.f13148a;
    }

    /* renamed from: d */
    public boolean m25163d() {
        return this.f13150c == 2;
    }

    /* renamed from: e */
    public boolean m25162e() {
        return this.f13150c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5313u) {
            C5313u c5313u = (C5313u) obj;
            return this.f13148a == c5313u.f13148a && this.f13149b == c5313u.f13149b && this.f13150c == c5313u.f13150c;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m25161f() {
        return this.f13149b == 1;
    }

    /* renamed from: g */
    public boolean m25160g() {
        return this.f13149b == 2;
    }

    public int hashCode() {
        return ((((this.f13148a.hashCode() ^ 1000003) * 1000003) ^ this.f13149b) * 1000003) ^ this.f13150c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f13148a);
        sb.append(", type=");
        int i = this.f13149b;
        sb.append(i == 1 ? MPOSPaymentMethod.STATE_REQUIRED : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m25165b(this.f13150c));
        sb.append("}");
        return sb.toString();
    }
}
