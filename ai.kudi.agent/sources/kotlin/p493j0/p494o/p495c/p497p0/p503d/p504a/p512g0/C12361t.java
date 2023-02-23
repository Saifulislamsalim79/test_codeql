package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12082d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12386v;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13042r;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.C13354k;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.g0.t */
/* loaded from: classes3.dex */
public final class C12361t {

    /* renamed from: a */
    private static final C12301b f27443a;

    /* renamed from: b */
    private static final C12301b f27444b;

    /* compiled from: typeEnhancement.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.g0.t$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12362a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27445a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f27446b;

        static {
            int[] iArr = new int[EnumC12308f.values().length];
            iArr[EnumC12308f.READ_ONLY.ordinal()] = 1;
            iArr[EnumC12308f.MUTABLE.ordinal()] = 2;
            f27445a = iArr;
            int[] iArr2 = new int[EnumC12310h.values().length];
            iArr2[EnumC12310h.NULLABLE.ordinal()] = 1;
            iArr2[EnumC12310h.NOT_NULL.ordinal()] = 2;
            f27446b = iArr2;
        }
    }

    static {
        C12609c c12609c = C12386v.f27482o;
        l.e(c12609c, "ENHANCED_NULLABILITY_ANNOTATION");
        f27443a = new C12301b(c12609c);
        C12609c c12609c2 = C12386v.f27483p;
        l.e(c12609c2, "ENHANCED_MUTABILITY_ANNOTATION");
        f27444b = new C12301b(c12609c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final InterfaceC13346g m9128d(List<? extends InterfaceC13346g> list) {
        List m3825B0;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                m3825B0 = C13742z.m3825B0(list);
                return new C13354k(m3825B0);
            }
            return (InterfaceC13346g) C13722p.m3918q0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final C12302c<InterfaceC13334h> m9127e(InterfaceC13334h interfaceC13334h, C12306e c12306e, EnumC12357p enumC12357p) {
        if (C12358q.m9137a(enumC12357p) && (interfaceC13334h instanceof InterfaceC13312e)) {
            C12082d c12082d = C12082d.f26941a;
            EnumC12308f m9242b = c12306e.m9242b();
            int i = m9242b == null ? -1 : C12362a.f27445a[m9242b.ordinal()];
            if (i != 1) {
                if (i == 2 && enumC12357p == EnumC12357p.FLEXIBLE_UPPER) {
                    InterfaceC13312e interfaceC13312e = (InterfaceC13312e) interfaceC13334h;
                    if (c12082d.m9755e(interfaceC13312e)) {
                        return m9126f(c12082d.m9758b(interfaceC13312e));
                    }
                }
            } else if (enumC12357p == EnumC12357p.FLEXIBLE_LOWER) {
                InterfaceC13312e interfaceC13312e2 = (InterfaceC13312e) interfaceC13334h;
                if (c12082d.m9757c(interfaceC13312e2)) {
                    return m9126f(c12082d.m9759a(interfaceC13312e2));
                }
            }
            return m9122j(interfaceC13334h);
        }
        return m9122j(interfaceC13334h);
    }

    /* renamed from: f */
    private static final <T> C12302c<T> m9126f(T t) {
        return new C12302c<>(t, f27444b);
    }

    /* renamed from: g */
    private static final <T> C12302c<T> m9125g(T t) {
        return new C12302c<>(t, f27443a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final C12302c<Boolean> m9124h(AbstractC12965b0 abstractC12965b0, C12306e c12306e, EnumC12357p enumC12357p) {
        if (C12358q.m9137a(enumC12357p)) {
            EnumC12310h m9241c = c12306e.m9241c();
            int i = m9241c == null ? -1 : C12362a.f27446b[m9241c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return m9122j(Boolean.valueOf(abstractC12965b0.mo5778X0()));
                }
                return m9125g(Boolean.FALSE);
            }
            return m9125g(Boolean.TRUE);
        }
        return m9122j(Boolean.valueOf(abstractC12965b0.mo5778X0()));
    }

    /* renamed from: i */
    public static final boolean m9123i(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "<this>");
        return C12359r.m9135b(C13042r.f29135a, abstractC12965b0);
    }

    /* renamed from: j */
    private static final <T> C12302c<T> m9122j(T t) {
        return new C12302c<>(t, null);
    }
}
