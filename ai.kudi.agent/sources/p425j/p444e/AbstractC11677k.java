package p425j.p444e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.Callable;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p453b.C11301a;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11314b;
import p425j.p444e.p451f0.p454c.InterfaceC11316d;
import p425j.p444e.p451f0.p456e.p459c.C11433b;
import p425j.p444e.p451f0.p456e.p459c.C11434c;
import p425j.p444e.p451f0.p456e.p459c.C11436d;
import p425j.p444e.p451f0.p456e.p459c.C11437e;
import p425j.p444e.p451f0.p456e.p459c.C11441g;
import p425j.p444e.p451f0.p456e.p459c.C11443h;
import p425j.p444e.p451f0.p456e.p459c.C11451l;
import p425j.p444e.p451f0.p456e.p459c.C11453m;
import p425j.p444e.p451f0.p456e.p459c.C11454n;
import p425j.p444e.p451f0.p456e.p459c.C11456o;
import p425j.p444e.p451f0.p456e.p459c.C11458p;
import p425j.p444e.p451f0.p456e.p459c.C11461q;
import p425j.p444e.p451f0.p456e.p459c.C11463r;
import p425j.p444e.p451f0.p456e.p459c.C11466s;
import p425j.p444e.p451f0.p456e.p459c.C11469t;
import p425j.p444e.p451f0.p456e.p459c.C11471u;
import p425j.p444e.p451f0.p456e.p459c.C11473v;
import p425j.p444e.p451f0.p456e.p459c.CallableC11446i;
import p425j.p444e.p451f0.p456e.p460d.C11479b;
/* compiled from: Maybe.java */
/* renamed from: j.e.k */
/* loaded from: classes3.dex */
public abstract class AbstractC11677k<T> implements InterfaceC11687o<T> {
    /* renamed from: A */
    public static <T1, T2, R> AbstractC11677k<R> m10602A(InterfaceC11687o<? extends T1> interfaceC11687o, InterfaceC11687o<? extends T2> interfaceC11687o2, InterfaceC11288b<? super T1, ? super T2, ? extends R> interfaceC11288b) {
        C11312b.m11113d(interfaceC11687o, "source1 is null");
        C11312b.m11113d(interfaceC11687o2, "source2 is null");
        return m10601B(C11301a.m11120g(interfaceC11288b), interfaceC11687o, interfaceC11687o2);
    }

    /* renamed from: B */
    public static <T, R> AbstractC11677k<R> m10601B(InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f, InterfaceC11687o<? extends T>... interfaceC11687oArr) {
        C11312b.m11113d(interfaceC11687oArr, "sources is null");
        if (interfaceC11687oArr.length == 0) {
            return m10596g();
        }
        C11312b.m11113d(interfaceC11291f, "zipper is null");
        return a.l(new C11473v(interfaceC11687oArr, interfaceC11291f));
    }

    /* renamed from: b */
    public static <T> AbstractC11677k<T> m10600b(InterfaceC11686n<T> interfaceC11686n) {
        C11312b.m11113d(interfaceC11686n, "onSubscribe is null");
        return a.l(new C11434c(interfaceC11686n));
    }

    /* renamed from: g */
    public static <T> AbstractC11677k<T> m10596g() {
        return a.l(C11436d.f25750c);
    }

    /* renamed from: l */
    public static <T> AbstractC11677k<T> m10591l(Callable<? extends T> callable) {
        C11312b.m11113d(callable, "callable is null");
        return a.l(new CallableC11446i(callable));
    }

    /* renamed from: n */
    public static <T> AbstractC11677k<T> m10589n(T t) {
        C11312b.m11113d(t, "item is null");
        return a.l(new C11453m(t));
    }

    @Override // p425j.p444e.InterfaceC11687o
    /* renamed from: a */
    public final void mo10546a(InterfaceC11685m<? super T> interfaceC11685m) {
        C11312b.m11113d(interfaceC11685m, "observer is null");
        InterfaceC11685m<? super T> x = a.x(this, interfaceC11685m);
        C11312b.m11113d(x, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo10582u(x);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C11118a.m11646b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public final AbstractC11677k<T> m10599c(T t) {
        C11312b.m11113d(t, "defaultItem is null");
        return m10579x(m10589n(t));
    }

    /* renamed from: e */
    public final AbstractC11677k<T> m10598e(e<? super Throwable> eVar) {
        e m11125b = C11301a.m11125b();
        e m11125b2 = C11301a.m11125b();
        C11312b.m11113d(eVar, "onError is null");
        InterfaceC11287a interfaceC11287a = C11301a.f25431c;
        return a.l(new C11461q(this, m11125b, m11125b2, eVar, interfaceC11287a, interfaceC11287a, interfaceC11287a));
    }

    /* renamed from: f */
    public final AbstractC11677k<T> m10597f(e<? super T> eVar) {
        e m11125b = C11301a.m11125b();
        C11312b.m11113d(eVar, "onSuccess is null");
        e m11125b2 = C11301a.m11125b();
        InterfaceC11287a interfaceC11287a = C11301a.f25431c;
        return a.l(new C11461q(this, m11125b, eVar, m11125b2, interfaceC11287a, interfaceC11287a, interfaceC11287a));
    }

    /* renamed from: h */
    public final AbstractC11677k<T> m10595h(InterfaceC11292g<? super T> interfaceC11292g) {
        C11312b.m11113d(interfaceC11292g, "predicate is null");
        return a.l(new C11437e(this, interfaceC11292g));
    }

    /* renamed from: i */
    public final <R> AbstractC11677k<R> m10594i(InterfaceC11291f<? super T, ? extends InterfaceC11687o<? extends R>> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.l(new C11443h(this, interfaceC11291f));
    }

    /* renamed from: j */
    public final AbstractC11271b m10593j(InterfaceC11291f<? super T, ? extends InterfaceC11284d> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.j(new C11441g(this, interfaceC11291f));
    }

    /* renamed from: k */
    public final <R> AbstractC11688p<R> m10592k(InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.m(new C11479b(this, interfaceC11291f));
    }

    /* renamed from: m */
    public final AbstractC11696w<Boolean> m10590m() {
        return a.n(new C11451l(this));
    }

    /* renamed from: o */
    public final <R> AbstractC11677k<R> m10588o(InterfaceC11291f<? super T, ? extends R> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.l(new C11454n(this, interfaceC11291f));
    }

    /* renamed from: p */
    public final AbstractC11677k<T> m10587p(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.l(new C11456o(this, vVar));
    }

    /* renamed from: q */
    public final AbstractC11677k<T> m10586q(InterfaceC11687o<? extends T> interfaceC11687o) {
        C11312b.m11113d(interfaceC11687o, "next is null");
        return m10585r(C11301a.m11122e(interfaceC11687o));
    }

    /* renamed from: r */
    public final AbstractC11677k<T> m10585r(InterfaceC11291f<? super Throwable, ? extends InterfaceC11687o<? extends T>> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "resumeFunction is null");
        return a.l(new C11458p(this, interfaceC11291f, true));
    }

    /* renamed from: s */
    public final c m10584s() {
        return m10583t(C11301a.m11125b(), C11301a.f25433e, C11301a.f25431c);
    }

    /* renamed from: t */
    public final c m10583t(e<? super T> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a) {
        C11312b.m11113d(eVar, "onSuccess is null");
        C11312b.m11113d(eVar2, "onError is null");
        C11312b.m11113d(interfaceC11287a, "onComplete is null");
        C11433b c11433b = new C11433b(eVar, eVar2, interfaceC11287a);
        m10580w(c11433b);
        return c11433b;
    }

    /* renamed from: u */
    protected abstract void mo10582u(InterfaceC11685m<? super T> interfaceC11685m);

    /* renamed from: v */
    public final AbstractC11677k<T> m10581v(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.l(new C11463r(this, vVar));
    }

    /* renamed from: w */
    public final <E extends InterfaceC11685m<? super T>> E m10580w(E e) {
        mo10546a(e);
        return e;
    }

    /* renamed from: x */
    public final AbstractC11677k<T> m10579x(InterfaceC11687o<? extends T> interfaceC11687o) {
        C11312b.m11113d(interfaceC11687o, "other is null");
        return a.l(new C11466s(this, interfaceC11687o));
    }

    /* renamed from: y */
    public final AbstractC11293f<T> m10578y() {
        if (this instanceof InterfaceC11314b) {
            return ((InterfaceC11314b) this).mo11061d();
        }
        return a.k(new C11469t(this));
    }

    /* renamed from: z */
    public final AbstractC11688p<T> m10577z() {
        if (this instanceof InterfaceC11316d) {
            return ((InterfaceC11316d) this).mo10806a();
        }
        return a.m(new C11471u(this));
    }
}
