package kotlin.p548k0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11800j;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sequences.kt */
/* renamed from: kotlin.k0.n */
/* loaded from: classes3.dex */
public class C13242n extends C13240m {

    /* compiled from: Iterables.kt */
    /* renamed from: kotlin.k0.n$a */
    /* loaded from: classes3.dex */
    public static final class C13243a implements Iterable<T>, InterfaceC11791a {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13230h f29400c;

        public C13243a(InterfaceC13230h interfaceC13230h) {
            this.f29400c = interfaceC13230h;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f29400c.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: _Sequences.kt */
    /* renamed from: kotlin.k0.n$b */
    /* loaded from: classes3.dex */
    public static final class C13244b extends AbstractC11802m implements InterfaceC11767l<T, Boolean> {

        /* renamed from: c */
        public static final C13244b f29401c = new C13244b();

        C13244b() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m5561a(T t) {
            return t == 0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(m5561a(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: _Sequences.kt */
    /* renamed from: kotlin.k0.n$c */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class C13245c extends C11800j implements InterfaceC11767l<InterfaceC13230h<? extends R>, Iterator<? extends R>> {

        /* renamed from: B */
        public static final C13245c f29402B = new C13245c();

        C13245c() {
            super(1, InterfaceC13230h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final Iterator<R> invoke(InterfaceC13230h<? extends R> interfaceC13230h) {
            l.f(interfaceC13230h, "p1");
            return interfaceC13230h.iterator();
        }
    }

    /* renamed from: j */
    public static <T> Iterable<T> m5577j(InterfaceC13230h<? extends T> interfaceC13230h) {
        l.f(interfaceC13230h, "$this$asIterable");
        return new C13243a(interfaceC13230h);
    }

    /* renamed from: k */
    public static <T> int m5576k(InterfaceC13230h<? extends T> interfaceC13230h) {
        l.f(interfaceC13230h, "$this$count");
        Iterator<? extends T> it = interfaceC13230h.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C13722p.m3925m();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static <T> InterfaceC13230h<T> m5575l(InterfaceC13230h<? extends T> interfaceC13230h, int i) {
        l.f(interfaceC13230h, "$this$drop");
        if (i >= 0) {
            return i == 0 ? interfaceC13230h : interfaceC13230h instanceof InterfaceC13222c ? ((InterfaceC13222c) interfaceC13230h).mo5621a(i) : new C13220b(interfaceC13230h, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: m */
    public static <T> InterfaceC13230h<T> m5574m(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, Boolean> interfaceC11767l) {
        l.f(interfaceC13230h, "$this$filter");
        l.f(interfaceC11767l, "predicate");
        return new C13224e(interfaceC13230h, true, interfaceC11767l);
    }

    /* renamed from: n */
    public static <T> InterfaceC13230h<T> m5573n(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, Boolean> interfaceC11767l) {
        l.f(interfaceC13230h, "$this$filterNot");
        l.f(interfaceC11767l, "predicate");
        return new C13224e(interfaceC13230h, false, interfaceC11767l);
    }

    /* renamed from: o */
    public static <T> InterfaceC13230h<T> m5572o(InterfaceC13230h<? extends T> interfaceC13230h) {
        InterfaceC13230h<T> m5573n;
        l.f(interfaceC13230h, "$this$filterNotNull");
        m5573n = m5573n(interfaceC13230h, C13244b.f29401c);
        if (m5573n != null) {
            return m5573n;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.sequences.Sequence<T>");
    }

    /* renamed from: p */
    public static <T> T m5571p(InterfaceC13230h<? extends T> interfaceC13230h) {
        l.f(interfaceC13230h, "$this$firstOrNull");
        Iterator<? extends T> it = interfaceC13230h.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: q */
    public static <T, R> InterfaceC13230h<R> m5570q(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, ? extends InterfaceC13230h<? extends R>> interfaceC11767l) {
        l.f(interfaceC13230h, "$this$flatMap");
        l.f(interfaceC11767l, "transform");
        return new C13226f(interfaceC13230h, interfaceC11767l, C13245c.f29402B);
    }

    /* renamed from: r */
    public static <T, R> InterfaceC13230h<R> m5569r(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, ? extends R> interfaceC11767l) {
        l.f(interfaceC13230h, "$this$map");
        l.f(interfaceC11767l, "transform");
        return new C13248p(interfaceC13230h, interfaceC11767l);
    }

    /* renamed from: s */
    public static <T, R> InterfaceC13230h<R> m5568s(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, ? extends R> interfaceC11767l) {
        InterfaceC13230h<R> m5572o;
        l.f(interfaceC13230h, "$this$mapNotNull");
        l.f(interfaceC11767l, "transform");
        m5572o = m5572o(new C13248p(interfaceC13230h, interfaceC11767l));
        return m5572o;
    }

    /* renamed from: t */
    public static <T> InterfaceC13230h<T> m5567t(InterfaceC13230h<? extends T> interfaceC13230h, Iterable<? extends T> iterable) {
        InterfaceC13230h m3818H;
        l.f(interfaceC13230h, "$this$plus");
        l.f(iterable, "elements");
        m3818H = C13742z.m3818H(iterable);
        return C13234l.m5585d(C13234l.m5581h(interfaceC13230h, m3818H));
    }

    /* renamed from: u */
    public static <T> InterfaceC13230h<T> m5566u(InterfaceC13230h<? extends T> interfaceC13230h, T t) {
        l.f(interfaceC13230h, "$this$plus");
        return C13234l.m5585d(C13234l.m5581h(interfaceC13230h, C13234l.m5581h(t)));
    }

    /* renamed from: v */
    public static <T> InterfaceC13230h<T> m5565v(InterfaceC13230h<? extends T> interfaceC13230h, InterfaceC11767l<? super T, Boolean> interfaceC11767l) {
        l.f(interfaceC13230h, "$this$takeWhile");
        l.f(interfaceC11767l, "predicate");
        return new C13246o(interfaceC13230h, interfaceC11767l);
    }

    /* renamed from: w */
    public static final <T, C extends Collection<? super T>> C m5564w(InterfaceC13230h<? extends T> interfaceC13230h, C c) {
        l.f(interfaceC13230h, "$this$toCollection");
        l.f(c, "destination");
        for (T t : interfaceC13230h) {
            c.add(t);
        }
        return c;
    }

    /* renamed from: x */
    public static <T> List<T> m5563x(InterfaceC13230h<? extends T> interfaceC13230h) {
        List m5562y;
        List<T> m3884l;
        l.f(interfaceC13230h, "$this$toList");
        m5562y = m5562y(interfaceC13230h);
        m3884l = C13726r.m3884l(m5562y);
        return m3884l;
    }

    /* renamed from: y */
    public static <T> List<T> m5562y(InterfaceC13230h<? extends T> interfaceC13230h) {
        l.f(interfaceC13230h, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        m5564w(interfaceC13230h, arrayList);
        return arrayList;
    }
}
