package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.h */
/* loaded from: classes2.dex */
public final class C4226h {

    /* renamed from: c */
    public static final C4226h f10322c = new C4226h(null, null);

    /* renamed from: a */
    private final Boolean f10323a;

    /* renamed from: b */
    private final Boolean f10324b;

    public C4226h(Boolean bool, Boolean bool2) {
        this.f10323a = bool;
        this.f10324b = bool2;
    }

    /* renamed from: a */
    public static C4226h m28192a(Bundle bundle) {
        if (bundle == null) {
            return f10322c;
        }
        return new C4226h(m28178o(bundle.getString("ad_storage")), m28178o(bundle.getString("analytics_storage")));
    }

    /* renamed from: b */
    public static C4226h m28191b(String str) {
        Boolean bool;
        if (str != null) {
            Boolean m28177p = str.length() >= 3 ? m28177p(str.charAt(2)) : null;
            bool = str.length() >= 4 ? m28177p(str.charAt(3)) : null;
            r0 = m28177p;
        } else {
            bool = null;
        }
        return new C4226h(r0, bool);
    }

    /* renamed from: g */
    static Boolean m28186g(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    public static String m28185h(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string == null || m28178o(string) != null) {
            String string2 = bundle.getString("analytics_storage");
            if (string2 == null || m28178o(string2) != null) {
                return null;
            }
            return string2;
        }
        return string;
    }

    /* renamed from: l */
    public static boolean m28181l(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: n */
    static final int m28179n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: o */
    private static Boolean m28178o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: p */
    private static Boolean m28177p(char c) {
        if (c != '0') {
            if (c != '1') {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* renamed from: q */
    private static final char m28176q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    /* renamed from: c */
    public final C4226h m28190c(C4226h c4226h) {
        return new C4226h(m28186g(this.f10323a, c4226h.f10323a), m28186g(this.f10324b, c4226h.f10324b));
    }

    /* renamed from: d */
    public final C4226h m28189d(C4226h c4226h) {
        Boolean bool = this.f10323a;
        if (bool == null) {
            bool = c4226h.f10323a;
        }
        Boolean bool2 = this.f10324b;
        if (bool2 == null) {
            bool2 = c4226h.f10324b;
        }
        return new C4226h(bool, bool2);
    }

    /* renamed from: e */
    public final Boolean m28188e() {
        return this.f10323a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4226h) {
            C4226h c4226h = (C4226h) obj;
            return m28179n(this.f10323a) == m28179n(c4226h.f10323a) && m28179n(this.f10324b) == m28179n(c4226h.f10324b);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m28187f() {
        return this.f10324b;
    }

    public final int hashCode() {
        return ((m28179n(this.f10323a) + 527) * 31) + m28179n(this.f10324b);
    }

    /* renamed from: i */
    public final String m28184i() {
        return "G1" + m28176q(this.f10323a) + m28176q(this.f10324b);
    }

    /* renamed from: j */
    public final boolean m28183j() {
        Boolean bool = this.f10323a;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean m28182k() {
        Boolean bool = this.f10324b;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: m */
    public final boolean m28180m(C4226h c4226h) {
        Boolean bool = this.f10323a;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || c4226h.f10323a == bool2) {
            Boolean bool3 = this.f10324b;
            Boolean bool4 = Boolean.FALSE;
            return bool3 == bool4 && c4226h.f10324b != bool4;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f10323a;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f10324b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true == bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }
}
