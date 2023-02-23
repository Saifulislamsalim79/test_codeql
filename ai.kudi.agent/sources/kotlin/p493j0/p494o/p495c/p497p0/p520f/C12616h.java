package kotlin.p493j0.p494o.p495c.p497p0.p520f;
/* compiled from: SpecialNames.java */
/* renamed from: kotlin.j0.o.c.p0.f.h */
/* loaded from: classes3.dex */
public class C12616h {

    /* renamed from: a */
    public static final C12614f f28387a = C12614f.m7346n("<no name provided>");

    /* renamed from: b */
    public static final C12614f f28388b;

    /* renamed from: c */
    public static final C12614f f28389c;

    static {
        C12614f.m7346n("<root package>");
        f28388b = C12614f.m7349i("Companion");
        f28389c = C12614f.m7349i("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
        C12614f.m7346n("<anonymous>");
    }

    /* renamed from: a */
    private static /* synthetic */ void m7344a(int i) {
        String str = i != 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 1 ? 2 : 3];
        if (i != 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        } else {
            objArr[0] = "name";
        }
        if (i != 1) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (i == 1) {
            objArr[2] = "isSafeIdentifier";
        }
        String format = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: b */
    public static boolean m7343b(C12614f c12614f) {
        if (c12614f != null) {
            return (c12614f.m7353b().isEmpty() || c12614f.m7348j()) ? false : true;
        }
        m7344a(1);
        throw null;
    }

    /* renamed from: c */
    public static C12614f m7342c(C12614f c12614f) {
        if (c12614f == null || c12614f.m7348j()) {
            c12614f = f28389c;
        }
        if (c12614f != null) {
            return c12614f;
        }
        m7344a(0);
        throw null;
    }
}
