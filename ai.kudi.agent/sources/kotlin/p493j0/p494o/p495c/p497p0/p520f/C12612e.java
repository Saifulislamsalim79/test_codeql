package kotlin.p493j0.p494o.p495c.p497p0.p520f;

import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import kotlin.e0.d.l;
import kotlin.p549l0.C13276s;
/* compiled from: FqNamesUtil.kt */
/* renamed from: kotlin.j0.o.c.p0.f.e */
/* loaded from: classes3.dex */
public final class C12612e {

    /* compiled from: FqNamesUtil.kt */
    /* renamed from: kotlin.j0.o.c.p0.f.e$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12613a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28383a;

        static {
            int[] iArr = new int[EnumC12617i.values().length];
            iArr[EnumC12617i.BEGINNING.ordinal()] = 1;
            iArr[EnumC12617i.AFTER_DOT.ordinal()] = 2;
            iArr[EnumC12617i.MIDDLE.ordinal()] = 3;
            f28383a = iArr;
        }
    }

    /* renamed from: a */
    private static final boolean m7358a(String str, String str2) {
        boolean m5447E;
        m5447E = C13276s.m5447E(str, str2, false, 2, null);
        return m5447E && str.charAt(str2.length()) == '.';
    }

    /* renamed from: b */
    public static final boolean m7357b(C12609c c12609c, C12609c c12609c2) {
        l.f(c12609c, "<this>");
        l.f(c12609c2, BanksWithMethods.PACKAGE_NAME);
        if (l.b(c12609c, c12609c2) || c12609c2.m7380d()) {
            return true;
        }
        String m7382b = c12609c.m7382b();
        l.e(m7382b, "this.asString()");
        String m7382b2 = c12609c2.m7382b();
        l.e(m7382b2, "packageName.asString()");
        return m7358a(m7382b, m7382b2);
    }

    /* renamed from: c */
    public static final boolean m7356c(String str) {
        if (str == null) {
            return false;
        }
        EnumC12617i enumC12617i = EnumC12617i.BEGINNING;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            int i2 = C12613a.f28383a[enumC12617i.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                enumC12617i = EnumC12617i.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                enumC12617i = EnumC12617i.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        return enumC12617i != EnumC12617i.AFTER_DOT;
    }

    /* renamed from: d */
    public static final C12609c m7355d(C12609c c12609c, C12609c c12609c2) {
        l.f(c12609c, "<this>");
        l.f(c12609c2, "prefix");
        if (!m7357b(c12609c, c12609c2) || c12609c2.m7380d()) {
            return c12609c;
        }
        if (l.b(c12609c, c12609c2)) {
            C12609c c12609c3 = C12609c.f28373c;
            l.e(c12609c3, "ROOT");
            return c12609c3;
        }
        String m7382b = c12609c.m7382b();
        l.e(m7382b, "asString()");
        String substring = m7382b.substring(c12609c2.m7382b().length() + 1);
        l.e(substring, "(this as java.lang.String).substring(startIndex)");
        return new C12609c(substring);
    }
}
