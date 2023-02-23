package kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13705i0;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13741y0;
import kotlin.p557z.C13742z;
/* compiled from: JvmNameResolver.kt */
/* renamed from: kotlin.j0.o.c.p0.e.a0.b.f */
/* loaded from: classes3.dex */
public final class C12495f implements InterfaceC12593c {

    /* renamed from: e */
    private static final String f27752e;

    /* renamed from: f */
    private static final List<String> f27753f;

    /* renamed from: a */
    private final C12470a.C12481e f27754a;

    /* renamed from: b */
    private final String[] f27755b;

    /* renamed from: c */
    private final Set<Integer> f27756c;

    /* renamed from: d */
    private final List<C12470a.C12481e.C12484c> f27757d;

    /* compiled from: JvmNameResolver.kt */
    /* renamed from: kotlin.j0.o.c.p0.e.a0.b.f$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12496a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27758a;

        static {
            int[] iArr = new int[C12470a.C12481e.C12484c.EnumC12487c.values().length];
            iArr[C12470a.C12481e.C12484c.EnumC12487c.NONE.ordinal()] = 1;
            iArr[C12470a.C12481e.C12484c.EnumC12487c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[C12470a.C12481e.C12484c.EnumC12487c.DESC_TO_CLASS_ID.ordinal()] = 3;
            f27758a = iArr;
        }
    }

    static {
        List m3888h;
        String m3797a0;
        List<String> m3888h2;
        Iterable<C13705i0> m3817H0;
        int m3867o;
        int m3898f;
        int m10271a;
        m3888h = C13726r.m3888h('k', 'o', 't', 'l', 'i', 'n');
        m3797a0 = C13742z.m3797a0(m3888h, "", null, null, 0, null, null, 62, null);
        f27752e = m3797a0;
        m3888h2 = C13726r.m3888h(l.m(m3797a0, "/Any"), l.m(f27752e, "/Nothing"), l.m(f27752e, "/Unit"), l.m(f27752e, "/Throwable"), l.m(f27752e, "/Number"), l.m(f27752e, "/Byte"), l.m(f27752e, "/Double"), l.m(f27752e, "/Float"), l.m(f27752e, "/Int"), l.m(f27752e, "/Long"), l.m(f27752e, "/Short"), l.m(f27752e, "/Boolean"), l.m(f27752e, "/Char"), l.m(f27752e, "/CharSequence"), l.m(f27752e, "/String"), l.m(f27752e, "/Comparable"), l.m(f27752e, "/Enum"), l.m(f27752e, "/Array"), l.m(f27752e, "/ByteArray"), l.m(f27752e, "/DoubleArray"), l.m(f27752e, "/FloatArray"), l.m(f27752e, "/IntArray"), l.m(f27752e, "/LongArray"), l.m(f27752e, "/ShortArray"), l.m(f27752e, "/BooleanArray"), l.m(f27752e, "/CharArray"), l.m(f27752e, "/Cloneable"), l.m(f27752e, "/Annotation"), l.m(f27752e, "/collections/Iterable"), l.m(f27752e, "/collections/MutableIterable"), l.m(f27752e, "/collections/Collection"), l.m(f27752e, "/collections/MutableCollection"), l.m(f27752e, "/collections/List"), l.m(f27752e, "/collections/MutableList"), l.m(f27752e, "/collections/Set"), l.m(f27752e, "/collections/MutableSet"), l.m(f27752e, "/collections/Map"), l.m(f27752e, "/collections/MutableMap"), l.m(f27752e, "/collections/Map.Entry"), l.m(f27752e, "/collections/MutableMap.MutableEntry"), l.m(f27752e, "/collections/Iterator"), l.m(f27752e, "/collections/MutableIterator"), l.m(f27752e, "/collections/ListIterator"), l.m(f27752e, "/collections/MutableListIterator"));
        f27753f = m3888h2;
        m3817H0 = C13742z.m3817H0(m3888h2);
        m3867o = C13728s.m3867o(m3817H0, 10);
        m3898f = C13725q0.m3898f(m3867o);
        m10271a = C11841h.m10271a(m3898f, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m10271a);
        for (C13705i0 c13705i0 : m3817H0) {
            linkedHashMap.put((String) c13705i0.m4116d(), Integer.valueOf(c13705i0.m4117c()));
        }
    }

    public C12495f(C12470a.C12481e c12481e, String[] strArr) {
        Set<Integer> m3821F0;
        l.f(c12481e, "types");
        l.f(strArr, "strings");
        this.f27754a = c12481e;
        this.f27755b = strArr;
        List<Integer> m8717y = c12481e.m8717y();
        if (m8717y.isEmpty()) {
            m3821F0 = C13741y0.m3831b();
        } else {
            l.e(m8717y, "");
            m3821F0 = C13742z.m3821F0(m8717y);
        }
        this.f27756c = m3821F0;
        ArrayList arrayList = new ArrayList();
        List<C12470a.C12481e.C12484c> m8716z = m8641c().m8716z();
        arrayList.ensureCapacity(m8716z.size());
        for (C12470a.C12481e.C12484c c12484c : m8716z) {
            int m8697G = c12484c.m8697G();
            for (int i = 0; i < m8697G; i++) {
                arrayList.add(c12484c);
            }
        }
        arrayList.trimToSize();
        C13666w c13666w = C13666w.f30112a;
        this.f27757d = arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c
    /* renamed from: a */
    public String mo7433a(int i) {
        return getString(i);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c
    /* renamed from: b */
    public boolean mo7432b(int i) {
        return this.f27756c.contains(Integer.valueOf(i));
    }

    /* renamed from: c */
    public final C12470a.C12481e m8641c() {
        return this.f27754a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c
    public String getString(int i) {
        String str;
        C12470a.C12481e.C12484c c12484c = this.f27757d.get(i);
        if (c12484c.m8687Q()) {
            str = c12484c.m8694J();
        } else {
            if (c12484c.m8689O()) {
                int size = f27753f.size() - 1;
                int m8698F = c12484c.m8698F();
                if (m8698F >= 0 && m8698F <= size) {
                    str = f27753f.get(c12484c.m8698F());
                }
            }
            str = this.f27755b[i];
        }
        if (c12484c.m8692L() >= 2) {
            List<Integer> m8691M = c12484c.m8691M();
            l.e(m8691M, "substringIndexList");
            Integer num = m8691M.get(0);
            Integer num2 = m8691M.get(1);
            l.e(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                l.e(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    l.e(str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    l.e(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        String str2 = str;
        if (c12484c.m8696H() >= 2) {
            List<Integer> m8695I = c12484c.m8695I();
            l.e(m8695I, "replaceCharList");
            l.e(str2, "string");
            str2 = C13276s.m5435z(str2, (char) m8695I.get(0).intValue(), (char) m8695I.get(1).intValue(), false, 4, null);
        }
        String str3 = str2;
        C12470a.C12481e.C12484c.EnumC12487c m8699E = c12484c.m8699E();
        if (m8699E == null) {
            m8699E = C12470a.C12481e.C12484c.EnumC12487c.NONE;
        }
        int i2 = C12496a.f27758a[m8699E.ordinal()];
        if (i2 == 2) {
            l.e(str3, "string");
            str3 = C13276s.m5435z(str3, '$', '.', false, 4, null);
        } else if (i2 == 3) {
            if (str3.length() >= 2) {
                l.e(str3, "string");
                str3 = str3.substring(1, str3.length() - 1);
                l.e(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            String str4 = str3;
            l.e(str4, "string");
            str3 = C13276s.m5435z(str4, '$', '.', false, 4, null);
        }
        l.e(str3, "string");
        return str3;
    }
}
