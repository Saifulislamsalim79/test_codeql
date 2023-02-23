package p565l;

import java.util.concurrent.TimeUnit;
/* compiled from: CacheControl.java */
/* renamed from: l.d */
/* loaded from: classes3.dex */
public final class C14133d {

    /* renamed from: n */
    public static final C14133d f30855n;

    /* renamed from: a */
    private final boolean f30856a;

    /* renamed from: b */
    private final boolean f30857b;

    /* renamed from: c */
    private final int f30858c;

    /* renamed from: d */
    private final int f30859d;

    /* renamed from: e */
    private final boolean f30860e;

    /* renamed from: f */
    private final boolean f30861f;

    /* renamed from: g */
    private final boolean f30862g;

    /* renamed from: h */
    private final int f30863h;

    /* renamed from: i */
    private final int f30864i;

    /* renamed from: j */
    private final boolean f30865j;

    /* renamed from: k */
    private final boolean f30866k;

    /* renamed from: l */
    private final boolean f30867l;

    /* renamed from: m */
    String f30868m;

    /* compiled from: CacheControl.java */
    /* renamed from: l.d$a */
    /* loaded from: classes3.dex */
    public static final class C14134a {

        /* renamed from: a */
        boolean f30869a;

        /* renamed from: b */
        boolean f30870b;

        /* renamed from: c */
        int f30871c = -1;

        /* renamed from: d */
        int f30872d = -1;

        /* renamed from: e */
        int f30873e = -1;

        /* renamed from: f */
        boolean f30874f;

        /* renamed from: g */
        boolean f30875g;

        /* renamed from: h */
        boolean f30876h;

        /* renamed from: a */
        public C14133d m2842a() {
            return new C14133d(this);
        }

        /* renamed from: b */
        public C14134a m2841b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds(i);
                this.f30872d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: c */
        public C14134a m2840c() {
            this.f30869a = true;
            return this;
        }

        /* renamed from: d */
        public C14134a m2839d() {
            this.f30870b = true;
            return this;
        }

        /* renamed from: e */
        public C14134a m2838e() {
            this.f30874f = true;
            return this;
        }
    }

    static {
        C14134a c14134a = new C14134a();
        c14134a.m2840c();
        c14134a.m2842a();
        C14134a c14134a2 = new C14134a();
        c14134a2.m2838e();
        c14134a2.m2841b(Integer.MAX_VALUE, TimeUnit.SECONDS);
        f30855n = c14134a2.m2842a();
    }

    private C14133d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f30856a = z;
        this.f30857b = z2;
        this.f30858c = i;
        this.f30859d = i2;
        this.f30860e = z3;
        this.f30861f = z4;
        this.f30862g = z5;
        this.f30863h = i3;
        this.f30864i = i4;
        this.f30865j = z6;
        this.f30866k = z7;
        this.f30867l = z8;
        this.f30868m = str;
    }

    /* renamed from: a */
    private String m2853a() {
        StringBuilder sb = new StringBuilder();
        if (this.f30856a) {
            sb.append("no-cache, ");
        }
        if (this.f30857b) {
            sb.append("no-store, ");
        }
        if (this.f30858c != -1) {
            sb.append("max-age=");
            sb.append(this.f30858c);
            sb.append(", ");
        }
        if (this.f30859d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f30859d);
            sb.append(", ");
        }
        if (this.f30860e) {
            sb.append("private, ");
        }
        if (this.f30861f) {
            sb.append("public, ");
        }
        if (this.f30862g) {
            sb.append("must-revalidate, ");
        }
        if (this.f30863h != -1) {
            sb.append("max-stale=");
            sb.append(this.f30863h);
            sb.append(", ");
        }
        if (this.f30864i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f30864i);
            sb.append(", ");
        }
        if (this.f30865j) {
            sb.append("only-if-cached, ");
        }
        if (this.f30866k) {
            sb.append("no-transform, ");
        }
        if (this.f30867l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p565l.C14133d m2843k(p565l.C14229s r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p565l.C14133d.m2843k(l.s):l.d");
    }

    /* renamed from: b */
    public boolean m2852b() {
        return this.f30860e;
    }

    /* renamed from: c */
    public boolean m2851c() {
        return this.f30861f;
    }

    /* renamed from: d */
    public int m2850d() {
        return this.f30858c;
    }

    /* renamed from: e */
    public int m2849e() {
        return this.f30863h;
    }

    /* renamed from: f */
    public int m2848f() {
        return this.f30864i;
    }

    /* renamed from: g */
    public boolean m2847g() {
        return this.f30862g;
    }

    /* renamed from: h */
    public boolean m2846h() {
        return this.f30856a;
    }

    /* renamed from: i */
    public boolean m2845i() {
        return this.f30857b;
    }

    /* renamed from: j */
    public boolean m2844j() {
        return this.f30865j;
    }

    public String toString() {
        String str = this.f30868m;
        if (str != null) {
            return str;
        }
        String m2853a = m2853a();
        this.f30868m = m2853a;
        return m2853a;
    }

    C14133d(C14134a c14134a) {
        this.f30856a = c14134a.f30869a;
        this.f30857b = c14134a.f30870b;
        this.f30858c = c14134a.f30871c;
        this.f30859d = -1;
        this.f30860e = false;
        this.f30861f = false;
        this.f30862g = false;
        this.f30863h = c14134a.f30872d;
        this.f30864i = c14134a.f30873e;
        this.f30865j = c14134a.f30874f;
        this.f30866k = c14134a.f30875g;
        this.f30867l = c14134a.f30876h;
    }
}
