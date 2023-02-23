package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.p134i0.C5795m;
/* compiled from: ChildKey.java */
/* renamed from: com.google.firebase.database.u.b */
/* loaded from: classes2.dex */
public class C5921b implements Comparable<C5921b> {

    /* renamed from: d */
    private static final C5921b f14544d = new C5921b("[MIN_NAME]");

    /* renamed from: e */
    private static final C5921b f14545e = new C5921b("[MAX_KEY]");

    /* renamed from: f */
    private static final C5921b f14546f = new C5921b(".priority");

    /* renamed from: c */
    private final String f14547c;

    /* compiled from: ChildKey.java */
    /* renamed from: com.google.firebase.database.u.b$b */
    /* loaded from: classes2.dex */
    private static class C5923b extends C5921b {

        /* renamed from: w */
        private final int f14548w;

        C5923b(String str, int i) {
            super(str);
            this.f14548w = i;
        }

        @Override // com.google.firebase.database.p139u.C5921b, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(C5921b c5921b) {
            return super.compareTo(c5921b);
        }

        @Override // com.google.firebase.database.p139u.C5921b
        /* renamed from: m */
        protected int mo23291m() {
            return this.f14548w;
        }

        @Override // com.google.firebase.database.p139u.C5921b
        /* renamed from: n */
        protected boolean mo23290n() {
            return true;
        }

        @Override // com.google.firebase.database.p139u.C5921b
        public String toString() {
            return "IntegerChildName(\"" + ((C5921b) this).f14547c + "\")";
        }
    }

    /* renamed from: g */
    public static C5921b m23296g(String str) {
        Integer m23740k = C5795m.m23740k(str);
        if (m23740k != null) {
            return new C5923b(str, m23740k.intValue());
        }
        if (str.equals(".priority")) {
            return f14546f;
        }
        C5795m.m23745f(!str.contains("/"));
        return new C5921b(str);
    }

    /* renamed from: h */
    public static C5921b m23295h() {
        return f14545e;
    }

    /* renamed from: i */
    public static C5921b m23294i() {
        return f14544d;
    }

    /* renamed from: j */
    public static C5921b m23293j() {
        return f14546f;
    }

    /* renamed from: b */
    public String m23298b() {
        return this.f14547c;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(C5921b c5921b) {
        if (this == c5921b) {
            return 0;
        }
        if (this.f14547c.equals("[MIN_NAME]") || c5921b.f14547c.equals("[MAX_KEY]")) {
            return -1;
        }
        if (c5921b.f14547c.equals("[MIN_NAME]") || this.f14547c.equals("[MAX_KEY]")) {
            return 1;
        }
        if (mo23290n()) {
            if (c5921b.mo23290n()) {
                int m23750a = C5795m.m23750a(mo23291m(), c5921b.mo23291m());
                return m23750a == 0 ? C5795m.m23750a(this.f14547c.length(), c5921b.f14547c.length()) : m23750a;
            }
            return -1;
        } else if (c5921b.mo23290n()) {
            return 1;
        } else {
            return this.f14547c.compareTo(c5921b.f14547c);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5921b) {
            if (this == obj) {
                return true;
            }
            return this.f14547c.equals(((C5921b) obj).f14547c);
        }
        return false;
    }

    public int hashCode() {
        return this.f14547c.hashCode();
    }

    /* renamed from: m */
    protected int mo23291m() {
        return 0;
    }

    /* renamed from: n */
    protected boolean mo23290n() {
        return false;
    }

    /* renamed from: p */
    public boolean m23292p() {
        return equals(f14546f);
    }

    public String toString() {
        return "ChildKey(\"" + this.f14547c + "\")";
    }

    private C5921b(String str) {
        this.f14547c = str;
    }
}
