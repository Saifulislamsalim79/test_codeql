package kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u;

import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
/* compiled from: JvmClassName.java */
/* renamed from: kotlin.j0.o.c.p0.i.u.d */
/* loaded from: classes3.dex */
public class C12756d {

    /* renamed from: a */
    private final String f28608a;

    private C12756d(String str) {
        if (str != null) {
            this.f28608a = str;
        } else {
            m6836a(5);
            throw null;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m6836a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    public static C12756d m6835b(C12608b c12608b) {
        if (c12608b != null) {
            C12609c m7389h = c12608b.m7389h();
            String replace = c12608b.m7388i().m7382b().replace('.', '$');
            if (m7389h.m7380d()) {
                return new C12756d(replace);
            }
            return new C12756d(m7389h.m7382b().replace('.', '/') + "/" + replace);
        }
        m6836a(1);
        throw null;
    }

    /* renamed from: c */
    public static C12756d m6834c(C12609c c12609c) {
        if (c12609c != null) {
            return new C12756d(c12609c.m7382b().replace('.', '/'));
        }
        m6836a(2);
        throw null;
    }

    /* renamed from: d */
    public static C12756d m6833d(String str) {
        if (str != null) {
            return new C12756d(str);
        }
        m6836a(0);
        throw null;
    }

    /* renamed from: e */
    public C12609c m6832e() {
        return new C12609c(this.f28608a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12756d.class != obj.getClass()) {
            return false;
        }
        return this.f28608a.equals(((C12756d) obj).f28608a);
    }

    /* renamed from: f */
    public String m6831f() {
        String str = this.f28608a;
        if (str != null) {
            return str;
        }
        m6836a(8);
        throw null;
    }

    /* renamed from: g */
    public C12609c m6830g() {
        int lastIndexOf = this.f28608a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            C12609c c12609c = C12609c.f28373c;
            if (c12609c != null) {
                return c12609c;
            }
            m6836a(7);
            throw null;
        }
        return new C12609c(this.f28608a.substring(0, lastIndexOf).replace('/', '.'));
    }

    public int hashCode() {
        return this.f28608a.hashCode();
    }

    public String toString() {
        return this.f28608a;
    }
}
