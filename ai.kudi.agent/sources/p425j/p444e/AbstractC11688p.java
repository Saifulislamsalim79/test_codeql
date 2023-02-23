package p425j.p444e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p453b.C11301a;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceCallableC11320h;
import p425j.p444e.p451f0.p455d.C11331i;
import p425j.p444e.p451f0.p456e.p458b.C11403n;
import p425j.p444e.p451f0.p456e.p458b.C11419v;
import p425j.p444e.p451f0.p456e.p461e.C11484a0;
import p425j.p444e.p451f0.p456e.p461e.C11488b0;
import p425j.p444e.p451f0.p456e.p461e.C11490c;
import p425j.p444e.p451f0.p456e.p461e.C11492c0;
import p425j.p444e.p451f0.p456e.p461e.C11496d;
import p425j.p444e.p451f0.p456e.p461e.C11502e;
import p425j.p444e.p451f0.p456e.p461e.C11504e0;
import p425j.p444e.p451f0.p456e.p461e.C11507f;
import p425j.p444e.p451f0.p456e.p461e.C11509f0;
import p425j.p444e.p451f0.p456e.p461e.C11511g;
import p425j.p444e.p451f0.p456e.p461e.C11514g0;
import p425j.p444e.p451f0.p456e.p461e.C11517h;
import p425j.p444e.p451f0.p456e.p461e.C11518h0;
import p425j.p444e.p451f0.p456e.p461e.C11520i;
import p425j.p444e.p451f0.p456e.p461e.C11522i0;
import p425j.p444e.p451f0.p456e.p461e.C11524j;
import p425j.p444e.p451f0.p456e.p461e.C11526j0;
import p425j.p444e.p451f0.p456e.p461e.C11528k;
import p425j.p444e.p451f0.p456e.p461e.C11530k0;
import p425j.p444e.p451f0.p456e.p461e.C11533l;
import p425j.p444e.p451f0.p456e.p461e.C11534l0;
import p425j.p444e.p451f0.p456e.p461e.C11536m;
import p425j.p444e.p451f0.p456e.p461e.C11538m0;
import p425j.p444e.p451f0.p456e.p461e.C11540n;
import p425j.p444e.p451f0.p456e.p461e.C11543n0;
import p425j.p444e.p451f0.p456e.p461e.C11549o0;
import p425j.p444e.p451f0.p456e.p461e.C11551p;
import p425j.p444e.p451f0.p456e.p461e.C11554p0;
import p425j.p444e.p451f0.p456e.p461e.C11556q;
import p425j.p444e.p451f0.p456e.p461e.C11559q0;
import p425j.p444e.p451f0.p456e.p461e.C11562r;
import p425j.p444e.p451f0.p456e.p461e.C11564r0;
import p425j.p444e.p451f0.p456e.p461e.C11568t;
import p425j.p444e.p451f0.p456e.p461e.C11570u;
import p425j.p444e.p451f0.p456e.p461e.C11571v;
import p425j.p444e.p451f0.p456e.p461e.C11575x;
import p425j.p444e.p451f0.p456e.p461e.C11577y;
import p425j.p444e.p451f0.p456e.p461e.C11578z;
import p425j.p444e.p451f0.p456e.p461e.CallableC11567s;
import p425j.p444e.p451f0.p467j.EnumC11660g;
import p425j.p444e.p468g0.AbstractC11671a;
/* compiled from: Observable.java */
/* renamed from: j.e.p */
/* loaded from: classes3.dex */
public abstract class AbstractC11688p<T> implements InterfaceC11692s<T> {

    /* compiled from: Observable.java */
    /* renamed from: j.e.p$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C11689a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26406a;

        static {
            int[] iArr = new int[EnumC11269a.values().length];
            f26406a = iArr;
            try {
                iArr[EnumC11269a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26406a[EnumC11269a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26406a[EnumC11269a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26406a[EnumC11269a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: I */
    public static <T> AbstractC11688p<T> m10537I(T... tArr) {
        C11312b.m11113d(tArr, "items is null");
        if (tArr.length == 0) {
            return m10483y();
        }
        if (tArr.length == 1) {
            return m10532N(tArr[0]);
        }
        return a.m(new C11562r(tArr));
    }

    /* renamed from: J */
    public static <T> AbstractC11688p<T> m10536J(Callable<? extends T> callable) {
        C11312b.m11113d(callable, "supplier is null");
        return a.m(new CallableC11567s(callable));
    }

    /* renamed from: K */
    public static <T> AbstractC11688p<T> m10535K(Iterable<? extends T> iterable) {
        C11312b.m11113d(iterable, "source is null");
        return a.m(new C11568t(iterable));
    }

    /* renamed from: N */
    public static <T> AbstractC11688p<T> m10532N(T t) {
        C11312b.m11113d(t, "item is null");
        return a.m(new C11577y(t));
    }

    /* renamed from: P */
    public static <T> AbstractC11688p<T> m10530P(InterfaceC11692s<? extends T> interfaceC11692s, InterfaceC11692s<? extends T> interfaceC11692s2) {
        C11312b.m11113d(interfaceC11692s, "source1 is null");
        C11312b.m11113d(interfaceC11692s2, "source2 is null");
        return m10537I(interfaceC11692s, interfaceC11692s2).m10543C(C11301a.m11123d(), false, 2);
    }

    /* renamed from: Q */
    public static <T> AbstractC11688p<T> m10529Q(InterfaceC11692s<? extends T> interfaceC11692s, InterfaceC11692s<? extends T> interfaceC11692s2) {
        C11312b.m11113d(interfaceC11692s, "source1 is null");
        C11312b.m11113d(interfaceC11692s2, "source2 is null");
        return m10537I(interfaceC11692s, interfaceC11692s2).m10543C(C11301a.m11123d(), true, 2);
    }

    /* renamed from: h */
    public static int m10512h() {
        return AbstractC11293f.m11182c();
    }

    /* renamed from: i */
    public static <T1, T2, R> AbstractC11688p<R> m10510i(InterfaceC11692s<? extends T1> interfaceC11692s, InterfaceC11692s<? extends T2> interfaceC11692s2, InterfaceC11288b<? super T1, ? super T2, ? extends R> interfaceC11288b) {
        C11312b.m11113d(interfaceC11692s, "source1 is null");
        C11312b.m11113d(interfaceC11692s2, "source2 is null");
        return m10508j(C11301a.m11120g(interfaceC11288b), m10512h(), interfaceC11692s, interfaceC11692s2);
    }

    /* renamed from: j */
    public static <T, R> AbstractC11688p<R> m10508j(InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f, int i, InterfaceC11692s<? extends T>... interfaceC11692sArr) {
        return m10506k(interfaceC11692sArr, interfaceC11291f, i);
    }

    /* renamed from: k */
    public static <T, R> AbstractC11688p<R> m10506k(InterfaceC11692s<? extends T>[] interfaceC11692sArr, InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f, int i) {
        C11312b.m11113d(interfaceC11692sArr, "sources is null");
        if (interfaceC11692sArr.length == 0) {
            return m10483y();
        }
        C11312b.m11113d(interfaceC11291f, "combiner is null");
        C11312b.m11112e(i, "bufferSize");
        return a.m(new C11496d(interfaceC11692sArr, null, interfaceC11291f, i << 1, false));
    }

    /* renamed from: m */
    public static <T> AbstractC11688p<T> m10502m(int i, int i2, InterfaceC11692s<? extends T>... interfaceC11692sArr) {
        return m10537I(interfaceC11692sArr).m10498o(C11301a.m11123d(), i, i2, false);
    }

    /* renamed from: m0 */
    public static AbstractC11688p<Long> m10501m0(long j, TimeUnit timeUnit) {
        return m10499n0(j, timeUnit, j.e.j0.a.a());
    }

    /* renamed from: n */
    public static <T> AbstractC11688p<T> m10500n(InterfaceC11692s<? extends T>... interfaceC11692sArr) {
        return m10502m(m10512h(), m10512h(), interfaceC11692sArr);
    }

    /* renamed from: n0 */
    public static AbstractC11688p<Long> m10499n0(long j, TimeUnit timeUnit, v vVar) {
        C11312b.m11113d(timeUnit, "unit is null");
        C11312b.m11113d(vVar, "scheduler is null");
        return a.m(new C11554p0(Math.max(j, 0L), timeUnit, vVar));
    }

    /* renamed from: q */
    public static <T> AbstractC11688p<T> m10494q(InterfaceC11691r<T> interfaceC11691r) {
        C11312b.m11113d(interfaceC11691r, "source is null");
        return a.m(new C11507f(interfaceC11691r));
    }

    /* renamed from: q0 */
    public static <T> AbstractC11688p<T> m10493q0(InterfaceC11692s<T> interfaceC11692s) {
        C11312b.m11113d(interfaceC11692s, "source is null");
        if (interfaceC11692s instanceof AbstractC11688p) {
            return a.m((AbstractC11688p) interfaceC11692s);
        }
        return a.m(new C11570u(interfaceC11692s));
    }

    /* renamed from: r0 */
    public static <T1, T2, R> AbstractC11688p<R> m10491r0(InterfaceC11692s<? extends T1> interfaceC11692s, InterfaceC11692s<? extends T2> interfaceC11692s2, InterfaceC11288b<? super T1, ? super T2, ? extends R> interfaceC11288b) {
        C11312b.m11113d(interfaceC11692s, "source1 is null");
        C11312b.m11113d(interfaceC11692s2, "source2 is null");
        return m10489s0(C11301a.m11120g(interfaceC11288b), false, m10512h(), interfaceC11692s, interfaceC11692s2);
    }

    /* renamed from: s0 */
    public static <T, R> AbstractC11688p<R> m10489s0(InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f, boolean z, int i, InterfaceC11692s<? extends T>... interfaceC11692sArr) {
        if (interfaceC11692sArr.length == 0) {
            return m10483y();
        }
        C11312b.m11113d(interfaceC11291f, "zipper is null");
        C11312b.m11112e(i, "bufferSize");
        return a.m(new C11564r0(interfaceC11692sArr, null, interfaceC11291f, i, z));
    }

    /* renamed from: t */
    public static <T> AbstractC11688p<T> m10488t(Callable<? extends InterfaceC11692s<? extends T>> callable) {
        C11312b.m11113d(callable, "supplier is null");
        return a.m(new C11517h(callable));
    }

    /* renamed from: w */
    private AbstractC11688p<T> m10485w(e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2) {
        C11312b.m11113d(eVar, "onNext is null");
        C11312b.m11113d(eVar2, "onError is null");
        C11312b.m11113d(interfaceC11287a, "onComplete is null");
        C11312b.m11113d(interfaceC11287a2, "onAfterTerminate is null");
        return a.m(new C11528k(this, eVar, eVar2, interfaceC11287a, interfaceC11287a2));
    }

    /* renamed from: y */
    public static <T> AbstractC11688p<T> m10483y() {
        return a.m(C11533l.f26010c);
    }

    /* renamed from: A */
    public final <R> AbstractC11688p<R> m10545A(InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
        return m10544B(interfaceC11291f, false);
    }

    /* renamed from: B */
    public final <R> AbstractC11688p<R> m10544B(InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f, boolean z) {
        return m10543C(interfaceC11291f, z, Integer.MAX_VALUE);
    }

    /* renamed from: C */
    public final <R> AbstractC11688p<R> m10543C(InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f, boolean z, int i) {
        return m10542D(interfaceC11291f, z, i, m10512h());
    }

    /* renamed from: D */
    public final <R> AbstractC11688p<R> m10542D(InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f, boolean z, int i, int i2) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        C11312b.m11112e(i, "maxConcurrency");
        C11312b.m11112e(i2, "bufferSize");
        if (this instanceof InterfaceCallableC11320h) {
            Object call = ((InterfaceCallableC11320h) this).call();
            if (call == null) {
                return m10483y();
            }
            return C11514g0.m10893a(call, interfaceC11291f);
        }
        return a.m(new C11540n(this, interfaceC11291f, z, i, i2));
    }

    /* renamed from: E */
    public final AbstractC11271b m10541E(InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f) {
        return m10540F(interfaceC11291f, false);
    }

    /* renamed from: F */
    public final AbstractC11271b m10540F(InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f, boolean z) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.j(new C11551p(this, interfaceC11291f, z));
    }

    /* renamed from: G */
    public final <R> AbstractC11688p<R> m10539G(InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f) {
        return m10538H(interfaceC11291f, false);
    }

    /* renamed from: H */
    public final <R> AbstractC11688p<R> m10538H(InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f, boolean z) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.m(new C11556q(this, interfaceC11291f, z));
    }

    /* renamed from: L */
    public final AbstractC11688p<T> m10534L() {
        return a.m(new C11571v(this));
    }

    /* renamed from: M */
    public final AbstractC11271b m10533M() {
        return a.j(new C11575x(this));
    }

    /* renamed from: O */
    public final <R> AbstractC11688p<R> m10531O(InterfaceC11291f<? super T, ? extends R> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.m(new C11578z(this, interfaceC11291f));
    }

    /* renamed from: R */
    public final AbstractC11688p<T> m10528R(v vVar) {
        return m10527S(vVar, false, m10512h());
    }

    /* renamed from: S */
    public final AbstractC11688p<T> m10527S(v vVar, boolean z, int i) {
        C11312b.m11113d(vVar, "scheduler is null");
        C11312b.m11112e(i, "bufferSize");
        return a.m(new C11484a0(this, vVar, z, i));
    }

    /* renamed from: T */
    public final AbstractC11688p<T> m10526T(InterfaceC11291f<? super Throwable, ? extends T> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "valueSupplier is null");
        return a.m(new C11488b0(this, interfaceC11291f));
    }

    /* renamed from: U */
    public final AbstractC11671a<T> m10525U() {
        return C11492c0.m10943v0(this);
    }

    /* renamed from: V */
    public final AbstractC11688p<T> m10524V(InterfaceC11291f<? super AbstractC11688p<Object>, ? extends InterfaceC11692s<?>> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "handler is null");
        return a.m(new C11504e0(this, interfaceC11291f));
    }

    /* renamed from: W */
    public final AbstractC11688p<T> m10523W() {
        return m10522X(Long.MAX_VALUE, C11301a.m11126a());
    }

    /* renamed from: X */
    public final AbstractC11688p<T> m10522X(long j, InterfaceC11292g<? super Throwable> interfaceC11292g) {
        if (j >= 0) {
            C11312b.m11113d(interfaceC11292g, "predicate is null");
            return a.m(new C11509f0(this, j, interfaceC11292g));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    /* renamed from: Y */
    public final AbstractC11688p<T> m10521Y() {
        return m10525U().m10619u0();
    }

    /* renamed from: Z */
    public final AbstractC11677k<T> m10520Z() {
        return a.l(new C11518h0(this));
    }

    /* renamed from: a0 */
    public final AbstractC11696w<T> m10519a0() {
        return a.n(new C11522i0(this, null));
    }

    /* renamed from: b0 */
    public final AbstractC11688p<T> m10518b0(long j) {
        if (j <= 0) {
            return a.m(this);
        }
        return a.m(new C11526j0(this, j));
    }

    /* renamed from: c0 */
    public final c m10517c0() {
        return m10514f0(C11301a.m11125b(), C11301a.f25433e, C11301a.f25431c, C11301a.m11125b());
    }

    /* renamed from: d0 */
    public final c m10516d0(e<? super T> eVar) {
        return m10514f0(eVar, C11301a.f25433e, C11301a.f25431c, C11301a.m11125b());
    }

    @Override // p425j.p444e.InterfaceC11692s
    /* renamed from: e */
    public final void mo10478e(InterfaceC11695u<? super T> interfaceC11695u) {
        C11312b.m11113d(interfaceC11695u, "observer is null");
        try {
            InterfaceC11695u<? super T> y = a.y(this, interfaceC11695u);
            C11312b.m11113d(y, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo336g0(y);
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

    /* renamed from: e0 */
    public final c m10515e0(e<? super T> eVar, e<? super Throwable> eVar2) {
        return m10514f0(eVar, eVar2, C11301a.f25431c, C11301a.m11125b());
    }

    /* renamed from: f0 */
    public final c m10514f0(e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, e<? super c> eVar3) {
        C11312b.m11113d(eVar, "onNext is null");
        C11312b.m11113d(eVar2, "onError is null");
        C11312b.m11113d(interfaceC11287a, "onComplete is null");
        C11312b.m11113d(eVar3, "onSubscribe is null");
        C11331i c11331i = new C11331i(eVar, eVar2, interfaceC11287a, eVar3);
        mo10478e(c11331i);
        return c11331i;
    }

    /* renamed from: g */
    public final AbstractC11696w<Boolean> m10513g(InterfaceC11292g<? super T> interfaceC11292g) {
        C11312b.m11113d(interfaceC11292g, "predicate is null");
        return a.n(new C11490c(this, interfaceC11292g));
    }

    /* renamed from: g0 */
    protected abstract void mo336g0(InterfaceC11695u<? super T> interfaceC11695u);

    /* renamed from: h0 */
    public final AbstractC11688p<T> m10511h0(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.m(new C11530k0(this, vVar));
    }

    /* renamed from: i0 */
    public final AbstractC11688p<T> m10509i0(InterfaceC11692s<? extends T> interfaceC11692s) {
        C11312b.m11113d(interfaceC11692s, "other is null");
        return a.m(new C11534l0(this, interfaceC11692s));
    }

    /* renamed from: j0 */
    public final AbstractC11688p<T> m10507j0(long j) {
        if (j >= 0) {
            return a.m(new C11538m0(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    /* renamed from: k0 */
    public final <U> AbstractC11688p<T> m10505k0(InterfaceC11692s<U> interfaceC11692s) {
        C11312b.m11113d(interfaceC11692s, "other is null");
        return a.m(new C11543n0(this, interfaceC11692s));
    }

    /* renamed from: l */
    public final <R> AbstractC11688p<R> m10504l(InterfaceC11694t<? super T, ? extends R> interfaceC11694t) {
        C11312b.m11113d(interfaceC11694t, "composer is null");
        return m10493q0(interfaceC11694t.mo10452a(this));
    }

    /* renamed from: l0 */
    public final AbstractC11688p<T> m10503l0(InterfaceC11292g<? super T> interfaceC11292g) {
        C11312b.m11113d(interfaceC11292g, "stopPredicate is null");
        return a.m(new C11549o0(this, interfaceC11292g));
    }

    /* renamed from: o */
    public final <R> AbstractC11688p<R> m10498o(InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f, int i, int i2, boolean z) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        C11312b.m11112e(i, "maxConcurrency");
        C11312b.m11112e(i2, "prefetch");
        return a.m(new C11502e(this, interfaceC11291f, z ? EnumC11660g.END : EnumC11660g.BOUNDARY, i, i2));
    }

    /* renamed from: o0 */
    public final AbstractC11293f<T> m10497o0(EnumC11269a enumC11269a) {
        C11403n c11403n = new C11403n(this);
        int i = C11689a.f26406a[enumC11269a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return c11403n.m11198A();
                    }
                    return a.k(new C11419v(c11403n));
                }
                return c11403n;
            }
            return c11403n.m11195D();
        }
        return c11403n.m11196C();
    }

    /* renamed from: p */
    public final AbstractC11696w<Boolean> m10496p(Object obj) {
        C11312b.m11113d(obj, "element is null");
        return m10513g(C11301a.m11124c(obj));
    }

    /* renamed from: p0 */
    public final AbstractC11688p<T> m10495p0(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.m(new C11559q0(this, vVar));
    }

    /* renamed from: r */
    public final AbstractC11688p<T> m10492r(long j, TimeUnit timeUnit) {
        return m10490s(j, timeUnit, j.e.j0.a.a());
    }

    /* renamed from: s */
    public final AbstractC11688p<T> m10490s(long j, TimeUnit timeUnit, v vVar) {
        C11312b.m11113d(timeUnit, "unit is null");
        C11312b.m11113d(vVar, "scheduler is null");
        return a.m(new C11511g(this, j, timeUnit, vVar));
    }

    /* renamed from: u */
    public final AbstractC11688p<T> m10487u(e<? super T> eVar) {
        C11312b.m11113d(eVar, "onAfterNext is null");
        return a.m(new C11520i(this, eVar));
    }

    /* renamed from: v */
    public final AbstractC11688p<T> m10486v(InterfaceC11287a interfaceC11287a) {
        C11312b.m11113d(interfaceC11287a, "onFinally is null");
        return a.m(new C11524j(this, interfaceC11287a));
    }

    /* renamed from: x */
    public final AbstractC11688p<T> m10484x(e<? super Throwable> eVar) {
        e<? super T> m11125b = C11301a.m11125b();
        InterfaceC11287a interfaceC11287a = C11301a.f25431c;
        return m10485w(m11125b, eVar, interfaceC11287a, interfaceC11287a);
    }

    /* renamed from: z */
    public final AbstractC11688p<T> m10482z(InterfaceC11292g<? super T> interfaceC11292g) {
        C11312b.m11113d(interfaceC11292g, "predicate is null");
        return a.m(new C11536m(this, interfaceC11292g));
    }
}
