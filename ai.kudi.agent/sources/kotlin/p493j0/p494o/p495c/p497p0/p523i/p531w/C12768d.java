package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
/* compiled from: MemberScope.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.d */
/* loaded from: classes3.dex */
public final class C12768d {

    /* renamed from: c */
    public static final C12769a f28635c;

    /* renamed from: d */
    private static int f28636d = 1;

    /* renamed from: e */
    private static final int f28637e;

    /* renamed from: f */
    private static final int f28638f;

    /* renamed from: g */
    private static final int f28639g;

    /* renamed from: h */
    private static final int f28640h;

    /* renamed from: i */
    private static final int f28641i;

    /* renamed from: j */
    private static final int f28642j;

    /* renamed from: k */
    private static final int f28643k;

    /* renamed from: l */
    private static final int f28644l;

    /* renamed from: m */
    private static final int f28645m;

    /* renamed from: n */
    private static final int f28646n;

    /* renamed from: o */
    public static final C12768d f28647o;

    /* renamed from: p */
    public static final C12768d f28648p;

    /* renamed from: q */
    public static final C12768d f28649q;

    /* renamed from: r */
    public static final C12768d f28650r;

    /* renamed from: s */
    public static final C12768d f28651s;

    /* renamed from: t */
    private static final List<C12769a.C12770a> f28652t;

    /* renamed from: u */
    private static final List<C12769a.C12770a> f28653u;

    /* renamed from: a */
    private final List<AbstractC12765c> f28654a;

    /* renamed from: b */
    private final int f28655b;

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.j0.o.c.p0.i.w.d$a */
    /* loaded from: classes3.dex */
    public static final class C12769a {

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.j0.o.c.p0.i.w.d$a$a */
        /* loaded from: classes3.dex */
        private static final class C12770a {

            /* renamed from: a */
            private final int f28656a;

            /* renamed from: b */
            private final String f28657b;

            public C12770a(int i, String str) {
                l.f(str, "name");
                this.f28656a = i;
                this.f28657b = str;
            }

            /* renamed from: a */
            public final int m6787a() {
                return this.f28656a;
            }

            /* renamed from: b */
            public final String m6786b() {
                return this.f28657b;
            }
        }

        private C12769a() {
        }

        public /* synthetic */ C12769a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final int m6788j() {
            int i = C12768d.f28636d;
            C12769a c12769a = C12768d.f28635c;
            C12768d.f28636d <<= 1;
            return i;
        }

        /* renamed from: b */
        public final int m6796b() {
            return C12768d.f28643k;
        }

        /* renamed from: c */
        public final int m6795c() {
            return C12768d.f28644l;
        }

        /* renamed from: d */
        public final int m6794d() {
            return C12768d.f28641i;
        }

        /* renamed from: e */
        public final int m6793e() {
            return C12768d.f28637e;
        }

        /* renamed from: f */
        public final int m6792f() {
            return C12768d.f28640h;
        }

        /* renamed from: g */
        public final int m6791g() {
            return C12768d.f28638f;
        }

        /* renamed from: h */
        public final int m6790h() {
            return C12768d.f28639g;
        }

        /* renamed from: i */
        public final int m6789i() {
            return C12768d.f28642j;
        }
    }

    static {
        C12769a.C12770a c12770a;
        C12769a.C12770a c12770a2;
        C12769a c12769a = new C12769a(null);
        f28635c = c12769a;
        f28637e = c12769a.m6788j();
        f28638f = f28635c.m6788j();
        f28639g = f28635c.m6788j();
        f28640h = f28635c.m6788j();
        f28641i = f28635c.m6788j();
        f28642j = f28635c.m6788j();
        int m6788j = f28635c.m6788j() - 1;
        f28643k = m6788j;
        int i = f28637e;
        int i2 = f28638f;
        f28644l = i | i2 | f28639g;
        int i3 = f28641i;
        int i4 = f28642j;
        f28645m = i2 | i3 | i4;
        f28646n = i3 | i4;
        f28647o = new C12768d(m6788j, null, 2, null);
        f28648p = new C12768d(f28646n, null, 2, null);
        new C12768d(f28637e, null, 2, null);
        new C12768d(f28638f, null, 2, null);
        new C12768d(f28639g, null, 2, null);
        f28649q = new C12768d(f28644l, null, 2, null);
        new C12768d(f28640h, null, 2, null);
        f28650r = new C12768d(f28641i, null, 2, null);
        f28651s = new C12768d(f28642j, null, 2, null);
        new C12768d(f28645m, null, 2, null);
        Field[] fields = C12768d.class.getFields();
        l.e(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            C12768d c12768d = obj instanceof C12768d ? (C12768d) obj : null;
            if (c12768d != null) {
                int m6799m = c12768d.m6799m();
                String name = field2.getName();
                l.e(name, "field.name");
                c12770a2 = new C12769a.C12770a(m6799m, name);
            } else {
                c12770a2 = null;
            }
            if (c12770a2 != null) {
                arrayList2.add(c12770a2);
            }
        }
        f28652t = arrayList2;
        Field[] fields2 = C12768d.class.getFields();
        l.e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (l.b(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                l.e(name2, "field.name");
                c12770a = new C12769a.C12770a(intValue, name2);
            } else {
                c12770a = null;
            }
            if (c12770a != null) {
                arrayList5.add(c12770a);
            }
        }
        f28653u = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12768d(int i, List<? extends AbstractC12765c> list) {
        l.f(list, "excludes");
        this.f28654a = list;
        for (AbstractC12765c abstractC12765c : list) {
            i &= abstractC12765c.mo6812a() ^ (-1);
        }
        this.f28655b = i;
    }

    /* renamed from: a */
    public final boolean m6811a(int i) {
        return (i & this.f28655b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (l.b(C12768d.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                C12768d c12768d = (C12768d) obj;
                return l.b(this.f28654a, c12768d.f28654a) && this.f28655b == c12768d.f28655b;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        }
        return false;
    }

    public int hashCode() {
        return (this.f28654a.hashCode() * 31) + this.f28655b;
    }

    /* renamed from: l */
    public final List<AbstractC12765c> m6800l() {
        return this.f28654a;
    }

    /* renamed from: m */
    public final int m6799m() {
        return this.f28655b;
    }

    /* renamed from: n */
    public final C12768d m6798n(int i) {
        int i2 = i & this.f28655b;
        if (i2 == 0) {
            return null;
        }
        return new C12768d(i2, this.f28654a);
    }

    public String toString() {
        Object obj;
        boolean z;
        Iterator<T> it = f28652t.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C12769a.C12770a) obj).m6787a() == m6799m()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C12769a.C12770a c12770a = (C12769a.C12770a) obj;
        String m6786b = c12770a == null ? null : c12770a.m6786b();
        if (m6786b == null) {
            List<C12769a.C12770a> list = f28653u;
            ArrayList arrayList = new ArrayList();
            for (C12769a.C12770a c12770a2 : list) {
                String m6786b2 = m6811a(c12770a2.m6787a()) ? c12770a2.m6786b() : null;
                if (m6786b2 != null) {
                    arrayList.add(m6786b2);
                }
            }
            m6786b = C13742z.m3797a0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + m6786b + ", " + this.f28654a + ')';
    }

    public /* synthetic */ C12768d(int i, List list, int i2, g gVar) {
        this(i, (i2 & 2) != 0 ? C13726r.m3891e() : list);
    }
}
