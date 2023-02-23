package kotlin.p549l0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p491i0.C11834c;
import kotlin.p491i0.C11837e;
import kotlin.p491i0.C11841h;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13712m;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13728s;
/* compiled from: Strings.kt */
/* renamed from: kotlin.l0.t */
/* loaded from: classes3.dex */
public class C13277t extends C13276s {

    /* compiled from: Strings.kt */
    /* renamed from: kotlin.l0.t$a */
    /* loaded from: classes3.dex */
    public static final class C13278a extends AbstractC11802m implements InterfaceC11771p<CharSequence, Integer, C13287o<? extends Integer, ? extends Integer>> {

        /* renamed from: c */
        final /* synthetic */ char[] f29432c;

        /* renamed from: d */
        final /* synthetic */ boolean f29433d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13278a(char[] cArr, boolean z) {
            super(2);
            this.f29432c = cArr;
            this.f29433d = z;
        }

        /* renamed from: a */
        public final C13287o<Integer, Integer> m5374a(CharSequence charSequence, int i) {
            l.f(charSequence, "$receiver");
            int m5403X = C13277t.m5403X(charSequence, this.f29432c, i, this.f29433d);
            if (m5403X < 0) {
                return null;
            }
            return C13664u.m4227a(Integer.valueOf(m5403X), 1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13287o<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m5374a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    /* renamed from: kotlin.l0.t$b */
    /* loaded from: classes3.dex */
    public static final class C13279b extends AbstractC11802m implements InterfaceC11771p<CharSequence, Integer, C13287o<? extends Integer, ? extends Integer>> {

        /* renamed from: c */
        final /* synthetic */ List f29434c;

        /* renamed from: d */
        final /* synthetic */ boolean f29435d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13279b(List list, boolean z) {
            super(2);
            this.f29434c = list;
            this.f29435d = z;
        }

        /* renamed from: a */
        public final C13287o<Integer, Integer> m5373a(CharSequence charSequence, int i) {
            l.f(charSequence, "$receiver");
            C13287o m5412O = C13277t.m5412O(charSequence, this.f29434c, i, this.f29435d, false);
            if (m5412O != null) {
                return C13664u.m4227a(m5412O.m5364c(), Integer.valueOf(((String) m5412O.m5363d()).length()));
            }
            return null;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13287o<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m5373a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    /* renamed from: kotlin.l0.t$c */
    /* loaded from: classes3.dex */
    public static final class C13280c extends AbstractC11802m implements InterfaceC11767l<C11837e, String> {

        /* renamed from: c */
        final /* synthetic */ CharSequence f29436c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13280c(CharSequence charSequence) {
            super(1);
            this.f29436c = charSequence;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final String invoke(C11837e c11837e) {
            l.f(c11837e, "it");
            return C13277t.m5376y0(this.f29436c, c11837e);
        }
    }

    /* renamed from: A0 */
    public static String m5434A0(String str, String str2, String str3) {
        int m5404W;
        l.f(str, "$this$substringAfter");
        l.f(str2, "delimiter");
        l.f(str3, "missingDelimiterValue");
        m5404W = m5404W(str, str2, 0, false, 6, null);
        if (m5404W == -1) {
            return str3;
        }
        String substring = str.substring(m5404W + str2.length(), str.length());
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: B0 */
    public static /* synthetic */ String m5433B0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m5375z0(str, c, str2);
    }

    /* renamed from: C0 */
    public static /* synthetic */ String m5432C0(String str, String str2, String str3, int i, Object obj) {
        String m5434A0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        m5434A0 = m5434A0(str, str2, str3);
        return m5434A0;
    }

    /* renamed from: D0 */
    public static String m5431D0(String str, char c, String str2) {
        l.f(str, "$this$substringAfterLast");
        l.f(str2, "missingDelimiterValue");
        int m5400a0 = m5400a0(str, c, 0, false, 6, null);
        if (m5400a0 == -1) {
            return str2;
        }
        String substring = str.substring(m5400a0 + 1, str.length());
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: E0 */
    public static /* synthetic */ String m5430E0(String str, char c, String str2, int i, Object obj) {
        String m5431D0;
        if ((i & 2) != 0) {
            str2 = str;
        }
        m5431D0 = m5431D0(str, c, str2);
        return m5431D0;
    }

    /* renamed from: F0 */
    public static final String m5428F0(String str, char c, String str2) {
        int m5405V;
        l.f(str, "$this$substringBefore");
        l.f(str2, "missingDelimiterValue");
        m5405V = m5405V(str, c, 0, false, 6, null);
        if (m5405V == -1) {
            return str2;
        }
        String substring = str.substring(0, m5405V);
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: G */
    public static final boolean m5427G(CharSequence charSequence, char c, boolean z) {
        int m5405V;
        l.f(charSequence, "$this$contains");
        m5405V = m5405V(charSequence, c, 0, z, 2, null);
        return m5405V >= 0;
    }

    /* renamed from: G0 */
    public static final String m5426G0(String str, String str2, String str3) {
        int m5404W;
        l.f(str, "$this$substringBefore");
        l.f(str2, "delimiter");
        l.f(str3, "missingDelimiterValue");
        m5404W = m5404W(str, str2, 0, false, 6, null);
        if (m5404W == -1) {
            return str3;
        }
        String substring = str.substring(0, m5404W);
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: H */
    public static boolean m5425H(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int m5404W;
        l.f(charSequence, "$this$contains");
        l.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            m5404W = m5404W(charSequence, (String) charSequence2, 0, z, 2, null);
            if (m5404W >= 0) {
                return true;
            }
        } else if (m5406U(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H0 */
    public static /* synthetic */ String m5424H0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m5428F0(str, c, str2);
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m5423I(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5427G(charSequence, c, z);
    }

    /* renamed from: I0 */
    public static /* synthetic */ String m5422I0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m5426G0(str, str2, str3);
    }

    /* renamed from: J */
    public static /* synthetic */ boolean m5421J(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean m5425H;
        if ((i & 2) != 0) {
            z = false;
        }
        m5425H = m5425H(charSequence, charSequence2, z);
        return m5425H;
    }

    /* renamed from: J0 */
    public static String m5420J0(String str, char c, String str2) {
        l.f(str, "$this$substringBeforeLast");
        l.f(str2, "missingDelimiterValue");
        int m5400a0 = m5400a0(str, c, 0, false, 6, null);
        if (m5400a0 == -1) {
            return str2;
        }
        String substring = str.substring(0, m5400a0);
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: K */
    public static final boolean m5419K(CharSequence charSequence, char c, boolean z) {
        int m5410Q;
        l.f(charSequence, "$this$endsWith");
        if (charSequence.length() > 0) {
            m5410Q = m5410Q(charSequence);
            if (C13253c.m5544f(charSequence.charAt(m5410Q), c, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    public static String m5418K0(String str, String str2, String str3) {
        int m5399b0;
        l.f(str, "$this$substringBeforeLast");
        l.f(str2, "delimiter");
        l.f(str3, "missingDelimiterValue");
        m5399b0 = m5399b0(str, str2, 0, false, 6, null);
        if (m5399b0 == -1) {
            return str3;
        }
        String substring = str.substring(0, m5399b0);
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: L */
    public static final boolean m5417L(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean m5443r;
        l.f(charSequence, "$this$endsWith");
        l.f(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            m5443r = C13276s.m5443r((String) charSequence, (String) charSequence2, false, 2, null);
            return m5443r;
        }
        return m5391j0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: L0 */
    public static /* synthetic */ String m5416L0(String str, String str2, String str3, int i, Object obj) {
        String m5418K0;
        if ((i & 2) != 0) {
            str3 = str;
        }
        m5418K0 = m5418K0(str, str2, str3);
        return m5418K0;
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m5415M(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5419K(charSequence, c, z);
    }

    /* renamed from: M0 */
    public static CharSequence m5414M0(CharSequence charSequence) {
        boolean m5547c;
        l.f(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            m5547c = C13252b.m5547c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!m5547c) {
                    break;
                }
                length--;
            } else if (m5547c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m5413N(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5417L(charSequence, charSequence2, z);
    }

    /* renamed from: O */
    public static final C13287o<Integer, String> m5412O(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int m5410Q;
        int m10268d;
        C11834c m10263i;
        Object obj;
        Object obj2;
        int m10271a;
        if (!z && collection.size() == 1) {
            String str = (String) C13722p.m3919p0(collection);
            int m5404W = !z2 ? m5404W(charSequence, str, i, false, 4, null) : m5399b0(charSequence, str, i, false, 4, null);
            if (m5404W < 0) {
                return null;
            }
            return C13664u.m4227a(Integer.valueOf(m5404W), str);
        }
        if (z2) {
            m5410Q = m5410Q(charSequence);
            m10268d = C11841h.m10268d(i, m5410Q);
            m10263i = C11841h.m10263i(m10268d, 0);
        } else {
            m10271a = C11841h.m10271a(i, 0);
            m10263i = new C11837e(m10271a, charSequence.length());
        }
        if (charSequence instanceof String) {
            int m10292l = m10263i.m10292l();
            int m10291m = m10263i.m10291m();
            int m10290s = m10263i.m10290s();
            if (m10290s < 0 ? m10292l >= m10291m : m10292l <= m10291m) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (C13276s.m5439v(str2, 0, (String) charSequence, m10292l, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (m10292l == m10291m) {
                            break;
                        }
                        m10292l += m10290s;
                    } else {
                        return C13664u.m4227a(Integer.valueOf(m10292l), str3);
                    }
                }
            }
        } else {
            int m10292l2 = m10263i.m10292l();
            int m10291m2 = m10263i.m10291m();
            int m10290s2 = m10263i.m10290s();
            if (m10290s2 < 0 ? m10292l2 >= m10291m2 : m10292l2 <= m10291m2) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (m5391j0(str4, 0, charSequence, m10292l2, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (m10292l2 == m10291m2) {
                            break;
                        }
                        m10292l2 += m10290s2;
                    } else {
                        return C13664u.m4227a(Integer.valueOf(m10292l2), str5);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: P */
    public static C11837e m5411P(CharSequence charSequence) {
        l.f(charSequence, "$this$indices");
        return new C11837e(0, charSequence.length() - 1);
    }

    /* renamed from: Q */
    public static int m5410Q(CharSequence charSequence) {
        l.f(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: R */
    public static final int m5409R(CharSequence charSequence, char c, int i, boolean z) {
        l.f(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m5403X(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: S */
    public static final int m5408S(CharSequence charSequence, String str, int i, boolean z) {
        l.f(charSequence, "$this$indexOf");
        l.f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m5406U(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: T */
    private static final int m5407T(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int m5410Q;
        int m10268d;
        int m10271a;
        C11834c m10263i;
        int m10271a2;
        int m10268d2;
        if (!z2) {
            m10271a2 = C11841h.m10271a(i, 0);
            m10268d2 = C11841h.m10268d(i2, charSequence.length());
            m10263i = new C11837e(m10271a2, m10268d2);
        } else {
            m5410Q = m5410Q(charSequence);
            m10268d = C11841h.m10268d(i, m5410Q);
            m10271a = C11841h.m10271a(i2, 0);
            m10263i = C11841h.m10263i(m10268d, m10271a);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m10292l = m10263i.m10292l();
            int m10291m = m10263i.m10291m();
            int m10290s = m10263i.m10290s();
            if (m10290s >= 0) {
                if (m10292l > m10291m) {
                    return -1;
                }
            } else if (m10292l < m10291m) {
                return -1;
            }
            while (!C13276s.m5439v((String) charSequence2, 0, (String) charSequence, m10292l, charSequence2.length(), z)) {
                if (m10292l == m10291m) {
                    return -1;
                }
                m10292l += m10290s;
            }
            return m10292l;
        }
        int m10292l2 = m10263i.m10292l();
        int m10291m2 = m10263i.m10291m();
        int m10290s2 = m10263i.m10290s();
        if (m10290s2 >= 0) {
            if (m10292l2 > m10291m2) {
                return -1;
            }
        } else if (m10292l2 < m10291m2) {
            return -1;
        }
        while (!m5391j0(charSequence2, 0, charSequence, m10292l2, charSequence2.length(), z)) {
            if (m10292l2 == m10291m2) {
                return -1;
            }
            m10292l2 += m10290s2;
        }
        return m10292l2;
    }

    /* renamed from: U */
    static /* synthetic */ int m5406U(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m5407T(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: V */
    public static /* synthetic */ int m5405V(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5409R(charSequence, c, i, z);
    }

    /* renamed from: W */
    public static /* synthetic */ int m5404W(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5408S(charSequence, str, i, z);
    }

    /* renamed from: X */
    public static final int m5403X(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int m10271a;
        int m5410Q;
        boolean z2;
        char m4038M;
        l.f(charSequence, "$this$indexOfAny");
        l.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            m4038M = C13715n.m4038M(cArr);
            return ((String) charSequence).indexOf(m4038M, i);
        }
        m10271a = C11841h.m10271a(i, 0);
        m5410Q = m5410Q(charSequence);
        if (m10271a > m5410Q) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(m10271a);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                } else if (C13253c.m5544f(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return m10271a;
            }
            if (m10271a == m5410Q) {
                return -1;
            }
            m10271a++;
        }
    }

    /* renamed from: Y */
    public static final int m5402Y(CharSequence charSequence, char c, int i, boolean z) {
        l.f(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m5398c0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: Z */
    public static final int m5401Z(CharSequence charSequence, String str, int i, boolean z) {
        l.f(charSequence, "$this$lastIndexOf");
        l.f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return m5407T(charSequence, str, i, 0, z, true);
    }

    /* renamed from: a0 */
    public static /* synthetic */ int m5400a0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m5410Q(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5402Y(charSequence, c, i, z);
    }

    /* renamed from: b0 */
    public static /* synthetic */ int m5399b0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m5410Q(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m5401Z(charSequence, str, i, z);
    }

    /* renamed from: c0 */
    public static final int m5398c0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int m5410Q;
        int m10268d;
        char m4038M;
        l.f(charSequence, "$this$lastIndexOfAny");
        l.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            m4038M = C13715n.m4038M(cArr);
            return ((String) charSequence).lastIndexOf(m4038M, i);
        }
        m5410Q = m5410Q(charSequence);
        for (m10268d = C11841h.m10268d(i, m5410Q); m10268d >= 0; m10268d--) {
            char charAt = charSequence.charAt(m10268d);
            int length = cArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (C13253c.m5544f(cArr[i2], charAt, z)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return m10268d;
            }
        }
        return -1;
    }

    /* renamed from: d0 */
    public static final InterfaceC13230h<String> m5397d0(CharSequence charSequence) {
        l.f(charSequence, "$this$lineSequence");
        return m5381t0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    /* renamed from: e0 */
    public static final List<String> m5396e0(CharSequence charSequence) {
        List<String> m5563x;
        l.f(charSequence, "$this$lines");
        m5563x = C13242n.m5563x(m5397d0(charSequence));
        return m5563x;
    }

    /* renamed from: f0 */
    private static final InterfaceC13230h<C11837e> m5395f0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m5388m0(i2);
        return new C13255e(charSequence, i, i2, new C13278a(cArr, z));
    }

    /* renamed from: g0 */
    private static final InterfaceC13230h<C11837e> m5394g0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        List m4067d;
        m5388m0(i2);
        m4067d = C13712m.m4067d(strArr);
        return new C13255e(charSequence, i, i2, new C13279b(m4067d, z));
    }

    /* renamed from: h0 */
    static /* synthetic */ InterfaceC13230h m5393h0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m5395f0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: i0 */
    static /* synthetic */ InterfaceC13230h m5392i0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m5394g0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: j0 */
    public static final boolean m5391j0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        l.f(charSequence, "$this$regionMatchesImpl");
        l.f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C13253c.m5544f(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k0 */
    public static String m5390k0(String str, CharSequence charSequence) {
        l.f(str, "$this$removePrefix");
        l.f(charSequence, "prefix");
        if (m5377x0(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: l0 */
    public static String m5389l0(String str, CharSequence charSequence) {
        l.f(str, "$this$removeSuffix");
        l.f(charSequence, "suffix");
        if (m5413N(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: m0 */
    public static final void m5388m0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    /* renamed from: n0 */
    public static final List<String> m5387n0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        Iterable<C11837e> m5577j;
        int m3867o;
        l.f(charSequence, "$this$split");
        l.f(cArr, "delimiters");
        if (cArr.length == 1) {
            return m5385p0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        m5577j = C13242n.m5577j(m5393h0(charSequence, cArr, 0, z, i, 2, null));
        m3867o = C13728s.m3867o(m5577j, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C11837e c11837e : m5577j) {
            arrayList.add(m5376y0(charSequence, c11837e));
        }
        return arrayList;
    }

    /* renamed from: o0 */
    public static final List<String> m5386o0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        Iterable<C11837e> m5577j;
        int m3867o;
        l.f(charSequence, "$this$split");
        l.f(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return m5385p0(charSequence, str, z, i);
            }
        }
        m5577j = C13242n.m5577j(m5392i0(charSequence, strArr, 0, z, i, 2, null));
        m3867o = C13728s.m3867o(m5577j, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (C11837e c11837e : m5577j) {
            arrayList.add(m5376y0(charSequence, c11837e));
        }
        return arrayList;
    }

    /* renamed from: p0 */
    private static final List<String> m5385p0(CharSequence charSequence, String str, boolean z, int i) {
        List<String> m3901b;
        m5388m0(i);
        int i2 = 0;
        int m5408S = m5408S(charSequence, str, 0, z);
        if (m5408S != -1 && i != 1) {
            boolean z2 = i > 0;
            ArrayList arrayList = new ArrayList(z2 ? C11841h.m10268d(i, 10) : 10);
            do {
                arrayList.add(charSequence.subSequence(i2, m5408S).toString());
                i2 = str.length() + m5408S;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                m5408S = m5408S(charSequence, str, i2, z);
            } while (m5408S != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        m3901b = C13724q.m3901b(charSequence.toString());
        return m3901b;
    }

    /* renamed from: q0 */
    public static /* synthetic */ List m5384q0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m5387n0(charSequence, cArr, z, i);
    }

    /* renamed from: r0 */
    public static /* synthetic */ List m5383r0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m5386o0(charSequence, strArr, z, i);
    }

    /* renamed from: s0 */
    public static final InterfaceC13230h<String> m5382s0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        InterfaceC13230h<String> m5569r;
        l.f(charSequence, "$this$splitToSequence");
        l.f(strArr, "delimiters");
        m5569r = C13242n.m5569r(m5392i0(charSequence, strArr, 0, z, i, 2, null), new C13280c(charSequence));
        return m5569r;
    }

    /* renamed from: t0 */
    public static /* synthetic */ InterfaceC13230h m5381t0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m5382s0(charSequence, strArr, z, i);
    }

    /* renamed from: u0 */
    public static final boolean m5380u0(CharSequence charSequence, char c, boolean z) {
        l.f(charSequence, "$this$startsWith");
        return charSequence.length() > 0 && C13253c.m5544f(charSequence.charAt(0), c, z);
    }

    /* renamed from: v0 */
    public static boolean m5379v0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean m5447E;
        l.f(charSequence, "$this$startsWith");
        l.f(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            m5447E = C13276s.m5447E((String) charSequence, (String) charSequence2, false, 2, null);
            return m5447E;
        }
        return m5391j0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: w0 */
    public static /* synthetic */ boolean m5378w0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m5380u0(charSequence, c, z);
    }

    /* renamed from: x0 */
    public static /* synthetic */ boolean m5377x0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        boolean m5379v0;
        if ((i & 2) != 0) {
            z = false;
        }
        m5379v0 = m5379v0(charSequence, charSequence2, z);
        return m5379v0;
    }

    /* renamed from: y0 */
    public static final String m5376y0(CharSequence charSequence, C11837e c11837e) {
        l.f(charSequence, "$this$substring");
        l.f(c11837e, "range");
        return charSequence.subSequence(c11837e.mo10283h().intValue(), c11837e.mo10282k().intValue() + 1).toString();
    }

    /* renamed from: z0 */
    public static final String m5375z0(String str, char c, String str2) {
        int m5405V;
        l.f(str, "$this$substringAfter");
        l.f(str2, "missingDelimiterValue");
        m5405V = m5405V(str, c, 0, false, 6, null);
        if (m5405V == -1) {
            return str2;
        }
        String substring = str.substring(m5405V + 1, str.length());
        l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
