package kotlin.p493j0.p494o.p495c.p497p0.p520f;
/* compiled from: Name.java */
/* renamed from: kotlin.j0.o.c.p0.f.f */
/* loaded from: classes3.dex */
public final class C12614f implements Comparable<C12614f> {

    /* renamed from: c */
    private final String f28384c;

    /* renamed from: d */
    private final boolean f28385d;

    private C12614f(String str, boolean z) {
        if (str != null) {
            this.f28384c = str;
            this.f28385d = z;
            return;
        }
        m7354a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m7354a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[1] = "getIdentifier";
        }
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                objArr[2] = "identifier";
                break;
            case 4:
                objArr[2] = "isValidIdentifier";
                break;
            case 5:
                objArr[2] = "special";
                break;
            case 6:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: h */
    public static C12614f m7350h(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return m7346n(str);
            }
            return m7349i(str);
        }
        m7354a(6);
        throw null;
    }

    /* renamed from: i */
    public static C12614f m7349i(String str) {
        if (str != null) {
            return new C12614f(str, false);
        }
        m7354a(3);
        throw null;
    }

    /* renamed from: m */
    public static boolean m7347m(String str) {
        if (str != null) {
            if (str.isEmpty() || str.startsWith("<")) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
        m7354a(4);
        throw null;
    }

    /* renamed from: n */
    public static C12614f m7346n(String str) {
        if (str != null) {
            if (str.startsWith("<")) {
                return new C12614f(str, true);
            }
            throw new IllegalArgumentException("special name must start with '<': " + str);
        }
        m7354a(5);
        throw null;
    }

    /* renamed from: b */
    public String m7353b() {
        String str = this.f28384c;
        if (str != null) {
            return str;
        }
        m7354a(1);
        throw null;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(C12614f c12614f) {
        return this.f28384c.compareTo(c12614f.f28384c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12614f) {
            C12614f c12614f = (C12614f) obj;
            return this.f28385d == c12614f.f28385d && this.f28384c.equals(c12614f.f28384c);
        }
        return false;
    }

    /* renamed from: g */
    public String m7351g() {
        if (!this.f28385d) {
            String m7353b = m7353b();
            if (m7353b != null) {
                return m7353b;
            }
            m7354a(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public int hashCode() {
        return (this.f28384c.hashCode() * 31) + (this.f28385d ? 1 : 0);
    }

    /* renamed from: j */
    public boolean m7348j() {
        return this.f28385d;
    }

    public String toString() {
        return this.f28384c;
    }
}
