package p425j.p444e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.Comparator;
import java.util.List;
import p425j.p444e.p449d0.AbstractC11285a;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p453b.C11301a;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceCallableC11320h;
import p425j.p444e.p451f0.p456e.p458b.C11354b;
import p425j.p444e.p451f0.p456e.p458b.C11362b0;
import p425j.p444e.p451f0.p456e.p458b.C11364c;
import p425j.p444e.p451f0.p456e.p458b.C11373c0;
import p425j.p444e.p451f0.p456e.p458b.C11376d;
import p425j.p444e.p451f0.p456e.p458b.C11381f;
import p425j.p444e.p451f0.p456e.p458b.C11383g;
import p425j.p444e.p451f0.p456e.p458b.C11384h;
import p425j.p444e.p451f0.p456e.p458b.C11387i;
import p425j.p444e.p451f0.p456e.p458b.C11390j;
import p425j.p444e.p451f0.p456e.p458b.C11393k;
import p425j.p444e.p451f0.p456e.p458b.C11395l;
import p425j.p444e.p451f0.p456e.p458b.C11399m;
import p425j.p444e.p451f0.p456e.p458b.C11405o;
import p425j.p444e.p451f0.p456e.p458b.C11407q;
import p425j.p444e.p451f0.p456e.p458b.C11408r;
import p425j.p444e.p451f0.p456e.p458b.C11411s;
import p425j.p444e.p451f0.p456e.p458b.C11415t;
import p425j.p444e.p451f0.p456e.p458b.C11417u;
import p425j.p444e.p451f0.p456e.p458b.C11421w;
import p425j.p444e.p451f0.p456e.p458b.C11423x;
import p425j.p444e.p451f0.p456e.p458b.C11427y;
import p425j.p444e.p451f0.p456e.p458b.C11429z;
import p425j.p444e.p451f0.p456e.p458b.EnumC11406p;
import p425j.p444e.p451f0.p465h.C11644c;
import p425j.p444e.p451f0.p465h.C11645d;
import p425j.p444e.p451f0.p467j.EnumC11660g;
import p577n.p586b.InterfaceC14455a;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: Flowable.java */
/* renamed from: j.e.f */
/* loaded from: classes3.dex */
public abstract class AbstractC11293f<T> implements InterfaceC14455a<T> {

    /* renamed from: c */
    static final int f25421c = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: c */
    public static int m11182c() {
        return f25421c;
    }

    /* renamed from: f */
    public static <T> AbstractC11293f<T> m11179f(InterfaceC11675i<T> interfaceC11675i, EnumC11269a enumC11269a) {
        C11312b.m11113d(interfaceC11675i, "source is null");
        C11312b.m11113d(enumC11269a, "mode is null");
        return a.k(new C11364c(interfaceC11675i, enumC11269a));
    }

    /* renamed from: g */
    private AbstractC11293f<T> m11178g(e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2) {
        C11312b.m11113d(eVar, "onNext is null");
        C11312b.m11113d(eVar2, "onError is null");
        C11312b.m11113d(interfaceC11287a, "onComplete is null");
        C11312b.m11113d(interfaceC11287a2, "onAfterTerminate is null");
        return a.k(new C11376d(this, eVar, eVar2, interfaceC11287a, interfaceC11287a2));
    }

    /* renamed from: j */
    public static <T> AbstractC11293f<T> m11175j() {
        return a.k(C11383g.f25578d);
    }

    /* renamed from: s */
    public static <T> AbstractC11293f<T> m11166s(T... tArr) {
        C11312b.m11113d(tArr, "items is null");
        if (tArr.length == 0) {
            return m11175j();
        }
        if (tArr.length == 1) {
            return m11163v(tArr[0]);
        }
        return a.k(new C11395l(tArr));
    }

    /* renamed from: t */
    public static <T> AbstractC11293f<T> m11165t(Iterable<? extends T> iterable) {
        C11312b.m11113d(iterable, "source is null");
        return a.k(new C11399m(iterable));
    }

    /* renamed from: u */
    public static <T> AbstractC11293f<T> m11164u(InterfaceC14455a<? extends T> interfaceC14455a) {
        if (interfaceC14455a instanceof AbstractC11293f) {
            return a.k((AbstractC11293f) interfaceC14455a);
        }
        C11312b.m11113d(interfaceC14455a, "source is null");
        return a.k(new C11405o(interfaceC14455a));
    }

    /* renamed from: v */
    public static <T> AbstractC11293f<T> m11163v(T t) {
        C11312b.m11113d(t, "item is null");
        return a.k(new C11407q(t));
    }

    /* renamed from: x */
    public static <T> AbstractC11293f<T> m11161x(InterfaceC14455a<? extends T> interfaceC14455a, InterfaceC14455a<? extends T> interfaceC14455a2, InterfaceC14455a<? extends T> interfaceC14455a3) {
        C11312b.m11113d(interfaceC14455a, "source1 is null");
        C11312b.m11113d(interfaceC14455a2, "source2 is null");
        C11312b.m11113d(interfaceC14455a3, "source3 is null");
        return m11166s(interfaceC14455a, interfaceC14455a2, interfaceC14455a3).m11172m(C11301a.m11123d(), false, 3);
    }

    /* renamed from: A */
    public final AbstractC11293f<T> m11198A() {
        return m11197B(m11182c(), false, true);
    }

    /* renamed from: B */
    public final AbstractC11293f<T> m11197B(int i, boolean z, boolean z2) {
        C11312b.m11112e(i, "capacity");
        return a.k(new C11415t(this, i, z2, z, C11301a.f25431c));
    }

    /* renamed from: C */
    public final AbstractC11293f<T> m11196C() {
        return a.k(new C11417u(this));
    }

    /* renamed from: D */
    public final AbstractC11293f<T> m11195D() {
        return a.k(new C11421w(this));
    }

    /* renamed from: E */
    public final AbstractC11285a<T> m11194E() {
        return m11193F(m11182c());
    }

    /* renamed from: F */
    public final AbstractC11285a<T> m11193F(int i) {
        C11312b.m11112e(i, "bufferSize");
        return C11423x.m11013S(this, i);
    }

    /* renamed from: G */
    public final AbstractC11293f<T> m11192G(Comparator<? super T> comparator) {
        C11312b.m11113d(comparator, "sortFunction");
        return m11185O().m10428v().m11162w(C11301a.m11121f(comparator)).m11170o(C11301a.m11123d());
    }

    /* renamed from: H */
    public final c m11191H(e<? super T> eVar) {
        return m11189J(eVar, C11301a.f25433e, C11301a.f25431c, EnumC11406p.INSTANCE);
    }

    /* renamed from: I */
    public final c m11190I(e<? super T> eVar, e<? super Throwable> eVar2) {
        return m11189J(eVar, eVar2, C11301a.f25431c, EnumC11406p.INSTANCE);
    }

    /* renamed from: J */
    public final c m11189J(e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, e<? super InterfaceC14457c> eVar3) {
        C11312b.m11113d(eVar, "onNext is null");
        C11312b.m11113d(eVar2, "onError is null");
        C11312b.m11113d(interfaceC11287a, "onComplete is null");
        C11312b.m11113d(eVar3, "onSubscribe is null");
        C11644c c11644c = new C11644c(eVar, eVar2, interfaceC11287a, eVar3);
        m11188K(c11644c);
        return c11644c;
    }

    /* renamed from: K */
    public final void m11188K(InterfaceC11676j<? super T> interfaceC11676j) {
        C11312b.m11113d(interfaceC11676j, "s is null");
        try {
            InterfaceC14456b<? super T> A = a.A(this, interfaceC11676j);
            C11312b.m11113d(A, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo10791L(A);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C11118a.m11646b(th);
            a.r(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: L */
    protected abstract void mo10791L(InterfaceC14456b<? super T> interfaceC14456b);

    /* renamed from: M */
    public final AbstractC11293f<T> m11187M(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return m11186N(vVar, !(this instanceof C11364c));
    }

    /* renamed from: N */
    public final AbstractC11293f<T> m11186N(v vVar, boolean z) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.k(new C11429z(this, vVar, z));
    }

    /* renamed from: O */
    public final AbstractC11696w<List<T>> m11185O() {
        return a.n(new C11362b0(this));
    }

    /* renamed from: P */
    public final AbstractC11293f<T> m11184P(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.k(new C11373c0(this, vVar));
    }

    @Override // p577n.p586b.InterfaceC14455a
    /* renamed from: a */
    public final void mo1691a(InterfaceC14456b<? super T> interfaceC14456b) {
        if (interfaceC14456b instanceof InterfaceC11676j) {
            m11188K((InterfaceC11676j) interfaceC14456b);
            return;
        }
        C11312b.m11113d(interfaceC14456b, "s is null");
        m11188K(new C11645d(interfaceC14456b));
    }

    /* renamed from: b */
    public final <R> R m11183b(InterfaceC11670g<T, ? extends R> interfaceC11670g) {
        C11312b.m11113d(interfaceC11670g, "converter is null");
        return interfaceC11670g.mo10621a(this);
    }

    /* renamed from: d */
    public final <R> AbstractC11293f<R> m11181d(InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f) {
        return m11180e(interfaceC11291f, 2);
    }

    /* renamed from: e */
    public final <R> AbstractC11293f<R> m11180e(InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f, int i) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        C11312b.m11112e(i, "prefetch");
        if (this instanceof InterfaceCallableC11320h) {
            Object call = ((InterfaceCallableC11320h) this).call();
            if (call == null) {
                return m11175j();
            }
            return C11427y.m11006a(call, interfaceC11291f);
        }
        return a.k(new C11354b(this, interfaceC11291f, i, EnumC11660g.IMMEDIATE));
    }

    /* renamed from: h */
    public final AbstractC11293f<T> m11177h(e<? super T> eVar) {
        e<? super Throwable> m11125b = C11301a.m11125b();
        InterfaceC11287a interfaceC11287a = C11301a.f25431c;
        return m11178g(eVar, m11125b, interfaceC11287a, interfaceC11287a);
    }

    /* renamed from: i */
    public final AbstractC11677k<T> m11176i(long j) {
        if (j >= 0) {
            return a.l(new C11381f(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: k */
    public final AbstractC11293f<T> m11174k(InterfaceC11292g<? super T> interfaceC11292g) {
        C11312b.m11113d(interfaceC11292g, "predicate is null");
        return a.k(new C11384h(this, interfaceC11292g));
    }

    /* renamed from: l */
    public final AbstractC11677k<T> m11173l() {
        return m11176i(0L);
    }

    /* renamed from: m */
    public final <R> AbstractC11293f<R> m11172m(InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f, boolean z, int i) {
        return m11171n(interfaceC11291f, z, i, m11182c());
    }

    /* renamed from: n */
    public final <R> AbstractC11293f<R> m11171n(InterfaceC11291f<? super T, ? extends InterfaceC14455a<? extends R>> interfaceC11291f, boolean z, int i, int i2) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        C11312b.m11112e(i, "maxConcurrency");
        C11312b.m11112e(i2, "bufferSize");
        if (this instanceof InterfaceCallableC11320h) {
            Object call = ((InterfaceCallableC11320h) this).call();
            if (call == null) {
                return m11175j();
            }
            return C11427y.m11006a(call, interfaceC11291f);
        }
        return a.k(new C11387i(this, interfaceC11291f, z, i, i2));
    }

    /* renamed from: o */
    public final <U> AbstractC11293f<U> m11170o(InterfaceC11291f<? super T, ? extends Iterable<? extends U>> interfaceC11291f) {
        return m11169p(interfaceC11291f, m11182c());
    }

    /* renamed from: p */
    public final <U> AbstractC11293f<U> m11169p(InterfaceC11291f<? super T, ? extends Iterable<? extends U>> interfaceC11291f, int i) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        C11312b.m11112e(i, "bufferSize");
        return a.k(new C11393k(this, interfaceC11291f, i));
    }

    /* renamed from: q */
    public final <R> AbstractC11293f<R> m11168q(InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f) {
        return m11167r(interfaceC11291f, false, Integer.MAX_VALUE);
    }

    /* renamed from: r */
    public final <R> AbstractC11293f<R> m11167r(InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f, boolean z, int i) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        C11312b.m11112e(i, "maxConcurrency");
        return a.k(new C11390j(this, interfaceC11291f, z, i));
    }

    /* renamed from: w */
    public final <R> AbstractC11293f<R> m11162w(InterfaceC11291f<? super T, ? extends R> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.k(new C11408r(this, interfaceC11291f));
    }

    /* renamed from: y */
    public final AbstractC11293f<T> m11160y(v vVar) {
        return m11159z(vVar, false, m11182c());
    }

    /* renamed from: z */
    public final AbstractC11293f<T> m11159z(v vVar, boolean z, int i) {
        C11312b.m11113d(vVar, "scheduler is null");
        C11312b.m11112e(i, "bufferSize");
        return a.k(new C11411s(this, vVar, z, i));
    }
}
