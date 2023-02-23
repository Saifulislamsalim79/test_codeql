package kotlin.p493j0.p494o.p495c.p497p0.p520f;

import kotlin.p549l0.C13277t;
/* compiled from: ClassId.java */
/* renamed from: kotlin.j0.o.c.p0.f.b */
/* loaded from: classes3.dex */
public final class C12608b {

    /* renamed from: a */
    private final C12609c f28370a;

    /* renamed from: b */
    private final C12609c f28371b;

    /* renamed from: c */
    private final boolean f28372c;

    public C12608b(C12609c c12609c, C12609c c12609c2, boolean z) {
        if (c12609c == null) {
            m7396a(1);
            throw null;
        } else if (c12609c2 != null) {
            this.f28370a = c12609c;
            this.f28371b = c12609c2;
            this.f28372c = z;
        } else {
            m7396a(2);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m7396a(int i) {
        String str = (i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i == 9) {
            objArr[1] = "asSingleFqName";
        } else if (i == 13 || i == 14) {
            objArr[1] = "asString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 6 && i != 7 && i != 9 && i != 13 && i != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: e */
    public static C12608b m7392e(String str) {
        if (str != null) {
            return m7391f(str, false);
        }
        m7396a(11);
        throw null;
    }

    /* renamed from: f */
    public static C12608b m7391f(String str, boolean z) {
        String m5420J0;
        String m5431D0;
        if (str != null) {
            m5420J0 = C13277t.m5420J0(str, '/', "");
            String replace = m5420J0.replace('/', '.');
            m5431D0 = C13277t.m5431D0(str, '/', str);
            return new C12608b(new C12609c(replace), new C12609c(m5431D0), z);
        }
        m7396a(12);
        throw null;
    }

    /* renamed from: m */
    public static C12608b m7384m(C12609c c12609c) {
        if (c12609c != null) {
            return new C12608b(c12609c.m7379e(), c12609c.m7377g());
        }
        m7396a(0);
        throw null;
    }

    /* renamed from: b */
    public C12609c m7395b() {
        if (this.f28370a.m7380d()) {
            C12609c c12609c = this.f28371b;
            if (c12609c != null) {
                return c12609c;
            }
            m7396a(9);
            throw null;
        }
        return new C12609c(this.f28370a.m7382b() + "." + this.f28371b.m7382b());
    }

    /* renamed from: c */
    public String m7394c() {
        if (this.f28370a.m7380d()) {
            String m7382b = this.f28371b.m7382b();
            if (m7382b != null) {
                return m7382b;
            }
            m7396a(13);
            throw null;
        }
        String str = this.f28370a.m7382b().replace('.', '/') + "/" + this.f28371b.m7382b();
        if (str != null) {
            return str;
        }
        m7396a(14);
        throw null;
    }

    /* renamed from: d */
    public C12608b m7393d(C12614f c12614f) {
        if (c12614f != null) {
            return new C12608b(m7389h(), this.f28371b.m7381c(c12614f), this.f28372c);
        }
        m7396a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12608b.class != obj.getClass()) {
            return false;
        }
        C12608b c12608b = (C12608b) obj;
        return this.f28370a.equals(c12608b.f28370a) && this.f28371b.equals(c12608b.f28371b) && this.f28372c == c12608b.f28372c;
    }

    /* renamed from: g */
    public C12608b m7390g() {
        C12609c m7379e = this.f28371b.m7379e();
        if (m7379e.m7380d()) {
            return null;
        }
        return new C12608b(m7389h(), m7379e, this.f28372c);
    }

    /* renamed from: h */
    public C12609c m7389h() {
        C12609c c12609c = this.f28370a;
        if (c12609c != null) {
            return c12609c;
        }
        m7396a(5);
        throw null;
    }

    public int hashCode() {
        return (((this.f28370a.hashCode() * 31) + this.f28371b.hashCode()) * 31) + Boolean.valueOf(this.f28372c).hashCode();
    }

    /* renamed from: i */
    public C12609c m7388i() {
        C12609c c12609c = this.f28371b;
        if (c12609c != null) {
            return c12609c;
        }
        m7396a(6);
        throw null;
    }

    /* renamed from: j */
    public C12614f m7387j() {
        C12614f m7377g = this.f28371b.m7377g();
        if (m7377g != null) {
            return m7377g;
        }
        m7396a(7);
        throw null;
    }

    /* renamed from: k */
    public boolean m7386k() {
        return this.f28372c;
    }

    /* renamed from: l */
    public boolean m7385l() {
        return !this.f28371b.m7379e().m7380d();
    }

    public String toString() {
        if (this.f28370a.m7380d()) {
            return "/" + m7394c();
        }
        return m7394c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12608b(C12609c c12609c, C12614f c12614f) {
        this(c12609c, C12609c.m7373k(c12614f), false);
        if (c12609c == null) {
            m7396a(3);
            throw null;
        } else if (c12614f != null) {
        } else {
            m7396a(4);
            throw null;
        }
    }
}
