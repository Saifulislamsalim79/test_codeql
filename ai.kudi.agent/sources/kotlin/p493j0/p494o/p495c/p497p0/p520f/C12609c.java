package kotlin.p493j0.p494o.p495c.p497p0.p520f;

import java.util.List;
/* compiled from: FqName.java */
/* renamed from: kotlin.j0.o.c.p0.f.c */
/* loaded from: classes3.dex */
public final class C12609c {

    /* renamed from: c */
    public static final C12609c f28373c = new C12609c("");

    /* renamed from: a */
    private final C12610d f28374a;

    /* renamed from: b */
    private transient C12609c f28375b;

    public C12609c(String str) {
        if (str != null) {
            this.f28374a = new C12610d(str, this);
        } else {
            m7383a(1);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m7383a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: k */
    public static C12609c m7373k(C12614f c12614f) {
        if (c12614f != null) {
            return new C12609c(C12610d.m7360m(c12614f));
        }
        m7383a(13);
        throw null;
    }

    /* renamed from: b */
    public String m7382b() {
        String m7371b = this.f28374a.m7371b();
        if (m7371b != null) {
            return m7371b;
        }
        m7383a(4);
        throw null;
    }

    /* renamed from: c */
    public C12609c m7381c(C12614f c12614f) {
        if (c12614f != null) {
            return new C12609c(this.f28374a.m7370c(c12614f), this);
        }
        m7383a(8);
        throw null;
    }

    /* renamed from: d */
    public boolean m7380d() {
        return this.f28374a.m7368e();
    }

    /* renamed from: e */
    public C12609c m7379e() {
        C12609c c12609c = this.f28375b;
        if (c12609c != null) {
            if (c12609c != null) {
                return c12609c;
            }
            m7383a(6);
            throw null;
        } else if (!m7380d()) {
            C12609c c12609c2 = new C12609c(this.f28374a.m7366g());
            this.f28375b = c12609c2;
            if (c12609c2 != null) {
                return c12609c2;
            }
            m7383a(7);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12609c) && this.f28374a.equals(((C12609c) obj).f28374a);
    }

    /* renamed from: f */
    public List<C12614f> m7378f() {
        List<C12614f> m7365h = this.f28374a.m7365h();
        if (m7365h != null) {
            return m7365h;
        }
        m7383a(11);
        throw null;
    }

    /* renamed from: g */
    public C12614f m7377g() {
        C12614f m7364i = this.f28374a.m7364i();
        if (m7364i != null) {
            return m7364i;
        }
        m7383a(9);
        throw null;
    }

    /* renamed from: h */
    public C12614f m7376h() {
        C12614f m7363j = this.f28374a.m7363j();
        if (m7363j != null) {
            return m7363j;
        }
        m7383a(10);
        throw null;
    }

    public int hashCode() {
        return this.f28374a.hashCode();
    }

    /* renamed from: i */
    public boolean m7375i(C12614f c12614f) {
        if (c12614f != null) {
            return this.f28374a.m7362k(c12614f);
        }
        m7383a(12);
        throw null;
    }

    /* renamed from: j */
    public C12610d m7374j() {
        C12610d c12610d = this.f28374a;
        if (c12610d != null) {
            return c12610d;
        }
        m7383a(5);
        throw null;
    }

    public String toString() {
        return this.f28374a.toString();
    }

    public C12609c(C12610d c12610d) {
        if (c12610d != null) {
            this.f28374a = c12610d;
        } else {
            m7383a(2);
            throw null;
        }
    }

    private C12609c(C12610d c12610d, C12609c c12609c) {
        if (c12610d != null) {
            this.f28374a = c12610d;
            this.f28375b = c12609c;
            return;
        }
        m7383a(3);
        throw null;
    }
}
