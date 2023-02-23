package kotlin.p493j0.p494o.p495c.p497p0.p520f;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p557z.C13706j;
/* compiled from: FqNameUnsafe.java */
/* renamed from: kotlin.j0.o.c.p0.f.d */
/* loaded from: classes3.dex */
public final class C12610d {

    /* renamed from: e */
    private static final C12614f f28376e = C12614f.m7346n("<root>");

    /* renamed from: f */
    private static final Pattern f28377f = Pattern.compile("\\.");

    /* renamed from: g */
    private static final InterfaceC11767l<String, C12614f> f28378g = new C12611a();

    /* renamed from: a */
    private final String f28379a;

    /* renamed from: b */
    private transient C12609c f28380b;

    /* renamed from: c */
    private transient C12610d f28381c;

    /* renamed from: d */
    private transient C12614f f28382d;

    /* compiled from: FqNameUnsafe.java */
    /* renamed from: kotlin.j0.o.c.p0.f.d$a */
    /* loaded from: classes3.dex */
    static class C12611a implements InterfaceC11767l<String, C12614f> {
        C12611a() {
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public C12614f invoke(String str) {
            return C12614f.m7350h(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12610d(String str, C12609c c12609c) {
        if (str == null) {
            m7372a(0);
            throw null;
        } else if (c12609c != null) {
            this.f28379a = str;
            this.f28380b = c12609c;
        } else {
            m7372a(1);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m7372a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: d */
    private void m7369d() {
        int lastIndexOf = this.f28379a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f28382d = C12614f.m7350h(this.f28379a.substring(lastIndexOf + 1));
            this.f28381c = new C12610d(this.f28379a.substring(0, lastIndexOf));
            return;
        }
        this.f28382d = C12614f.m7350h(this.f28379a);
        this.f28381c = C12609c.f28373c.m7374j();
    }

    /* renamed from: m */
    public static C12610d m7360m(C12614f c12614f) {
        if (c12614f != null) {
            return new C12610d(c12614f.m7353b(), C12609c.f28373c.m7374j(), c12614f);
        }
        m7372a(16);
        throw null;
    }

    /* renamed from: b */
    public String m7371b() {
        String str = this.f28379a;
        if (str != null) {
            return str;
        }
        m7372a(4);
        throw null;
    }

    /* renamed from: c */
    public C12610d m7370c(C12614f c12614f) {
        String str;
        if (c12614f != null) {
            if (m7368e()) {
                str = c12614f.m7353b();
            } else {
                str = this.f28379a + "." + c12614f.m7353b();
            }
            return new C12610d(str, this, c12614f);
        }
        m7372a(9);
        throw null;
    }

    /* renamed from: e */
    public boolean m7368e() {
        return this.f28379a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12610d) && this.f28379a.equals(((C12610d) obj).f28379a);
    }

    /* renamed from: f */
    public boolean m7367f() {
        return this.f28380b != null || m7371b().indexOf(60) < 0;
    }

    /* renamed from: g */
    public C12610d m7366g() {
        C12610d c12610d = this.f28381c;
        if (c12610d != null) {
            if (c12610d != null) {
                return c12610d;
            }
            m7372a(7);
            throw null;
        } else if (!m7368e()) {
            m7369d();
            C12610d c12610d2 = this.f28381c;
            if (c12610d2 != null) {
                return c12610d2;
            }
            m7372a(8);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: h */
    public List<C12614f> m7365h() {
        List<C12614f> emptyList = m7368e() ? Collections.emptyList() : C13706j.m4110J(f28377f.split(this.f28379a), f28378g);
        if (emptyList != null) {
            return emptyList;
        }
        m7372a(14);
        throw null;
    }

    public int hashCode() {
        return this.f28379a.hashCode();
    }

    /* renamed from: i */
    public C12614f m7364i() {
        C12614f c12614f = this.f28382d;
        if (c12614f != null) {
            if (c12614f != null) {
                return c12614f;
            }
            m7372a(10);
            throw null;
        } else if (!m7368e()) {
            m7369d();
            C12614f c12614f2 = this.f28382d;
            if (c12614f2 != null) {
                return c12614f2;
            }
            m7372a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: j */
    public C12614f m7363j() {
        if (m7368e()) {
            C12614f c12614f = f28376e;
            if (c12614f != null) {
                return c12614f;
            }
            m7372a(12);
            throw null;
        }
        C12614f m7364i = m7364i();
        if (m7364i != null) {
            return m7364i;
        }
        m7372a(13);
        throw null;
    }

    /* renamed from: k */
    public boolean m7362k(C12614f c12614f) {
        if (c12614f != null) {
            if (m7368e()) {
                return false;
            }
            int indexOf = this.f28379a.indexOf(46);
            String str = this.f28379a;
            String m7353b = c12614f.m7353b();
            if (indexOf == -1) {
                indexOf = this.f28379a.length();
            }
            return str.regionMatches(0, m7353b, 0, indexOf);
        }
        m7372a(15);
        throw null;
    }

    /* renamed from: l */
    public C12609c m7361l() {
        C12609c c12609c = this.f28380b;
        if (c12609c != null) {
            if (c12609c != null) {
                return c12609c;
            }
            m7372a(5);
            throw null;
        }
        C12609c c12609c2 = new C12609c(this);
        this.f28380b = c12609c2;
        if (c12609c2 != null) {
            return c12609c2;
        }
        m7372a(6);
        throw null;
    }

    public String toString() {
        String m7353b = m7368e() ? f28376e.m7353b() : this.f28379a;
        if (m7353b != null) {
            return m7353b;
        }
        m7372a(17);
        throw null;
    }

    public C12610d(String str) {
        if (str != null) {
            this.f28379a = str;
        } else {
            m7372a(2);
            throw null;
        }
    }

    private C12610d(String str, C12610d c12610d, C12614f c12614f) {
        if (str != null) {
            this.f28379a = str;
            this.f28381c = c12610d;
            this.f28382d = c12614f;
            return;
        }
        m7372a(3);
        throw null;
    }
}
