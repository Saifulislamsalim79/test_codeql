package p425j.p444e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.Callable;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p453b.C11301a;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11314b;
import p425j.p444e.p451f0.p454c.InterfaceC11316d;
import p425j.p444e.p451f0.p455d.C11326d;
import p425j.p444e.p451f0.p456e.p459c.C11439f;
import p425j.p444e.p451f0.p456e.p460d.C11481c;
import p425j.p444e.p451f0.p456e.p462f.C11580a;
import p425j.p444e.p451f0.p456e.p462f.C11582b;
import p425j.p444e.p451f0.p456e.p462f.C11584c;
import p425j.p444e.p451f0.p456e.p462f.C11586d;
import p425j.p444e.p451f0.p456e.p462f.C11589e;
import p425j.p444e.p451f0.p456e.p462f.C11590f;
import p425j.p444e.p451f0.p456e.p462f.C11591g;
import p425j.p444e.p451f0.p456e.p462f.C11593h;
import p425j.p444e.p451f0.p456e.p462f.C11595i;
import p425j.p444e.p451f0.p456e.p462f.C11597j;
import p425j.p444e.p451f0.p456e.p462f.C11599k;
import p425j.p444e.p451f0.p456e.p462f.C11601l;
import p425j.p444e.p451f0.p456e.p462f.C11603m;
/* compiled from: Single.java */
/* renamed from: j.e.w */
/* loaded from: classes3.dex */
public abstract class AbstractC11696w<T> implements InterfaceC11270a0<T> {
    /* renamed from: e */
    public static <T> AbstractC11696w<T> m10445e(InterfaceC11699z<T> interfaceC11699z) {
        C11312b.m11113d(interfaceC11699z, "source is null");
        return a.n(new C11580a(interfaceC11699z));
    }

    /* renamed from: k */
    public static <T> AbstractC11696w<T> m10439k(Callable<? extends T> callable) {
        C11312b.m11113d(callable, "callable is null");
        return a.n(new C11589e(callable));
    }

    /* renamed from: l */
    public static <T> AbstractC11696w<T> m10438l(T t) {
        C11312b.m11113d(t, "item is null");
        return a.n(new C11590f(t));
    }

    @Override // p425j.p444e.InterfaceC11270a0
    /* renamed from: b */
    public final void mo10446b(InterfaceC11698y<? super T> interfaceC11698y) {
        C11312b.m11113d(interfaceC11698y, "observer is null");
        InterfaceC11698y<? super T> z = a.z(this, interfaceC11698y);
        C11312b.m11113d(z, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo10430t(z);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C11118a.m11646b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: f */
    public final AbstractC11696w<T> m10444f(e<? super Throwable> eVar) {
        C11312b.m11113d(eVar, "onError is null");
        return a.n(new C11582b(this, eVar));
    }

    /* renamed from: g */
    public final AbstractC11696w<T> m10443g(e<? super T> eVar) {
        C11312b.m11113d(eVar, "onSuccess is null");
        return a.n(new C11584c(this, eVar));
    }

    /* renamed from: h */
    public final AbstractC11677k<T> m10442h(InterfaceC11292g<? super T> interfaceC11292g) {
        C11312b.m11113d(interfaceC11292g, "predicate is null");
        return a.l(new C11439f(this, interfaceC11292g));
    }

    /* renamed from: i */
    public final <R> AbstractC11696w<R> m10441i(InterfaceC11291f<? super T, ? extends InterfaceC11270a0<? extends R>> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.n(new C11586d(this, interfaceC11291f));
    }

    /* renamed from: j */
    public final <R> AbstractC11688p<R> m10440j(InterfaceC11291f<? super T, ? extends InterfaceC11692s<? extends R>> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.m(new C11481c(this, interfaceC11291f));
    }

    /* renamed from: m */
    public final <R> AbstractC11696w<R> m10437m(InterfaceC11291f<? super T, ? extends R> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "mapper is null");
        return a.n(new C11591g(this, interfaceC11291f));
    }

    /* renamed from: n */
    public final AbstractC11696w<T> m10436n(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.n(new C11593h(this, vVar));
    }

    /* renamed from: o */
    public final AbstractC11696w<T> m10435o(AbstractC11696w<? extends T> abstractC11696w) {
        C11312b.m11113d(abstractC11696w, "resumeSingleInCaseOfError is null");
        return m10434p(C11301a.m11122e(abstractC11696w));
    }

    /* renamed from: p */
    public final AbstractC11696w<T> m10434p(InterfaceC11291f<? super Throwable, ? extends InterfaceC11270a0<? extends T>> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "resumeFunctionInCaseOfError is null");
        return a.n(new C11597j(this, interfaceC11291f));
    }

    /* renamed from: q */
    public final AbstractC11696w<T> m10433q(InterfaceC11291f<Throwable, ? extends T> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "resumeFunction is null");
        return a.n(new C11595i(this, interfaceC11291f, null));
    }

    /* renamed from: r */
    public final c m10432r(e<? super T> eVar) {
        return m10431s(eVar, C11301a.f25433e);
    }

    /* renamed from: s */
    public final c m10431s(e<? super T> eVar, e<? super Throwable> eVar2) {
        C11312b.m11113d(eVar, "onSuccess is null");
        C11312b.m11113d(eVar2, "onError is null");
        C11326d c11326d = new C11326d(eVar, eVar2);
        mo10446b(c11326d);
        return c11326d;
    }

    /* renamed from: t */
    protected abstract void mo10430t(InterfaceC11698y<? super T> interfaceC11698y);

    /* renamed from: u */
    public final AbstractC11696w<T> m10429u(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.n(new C11599k(this, vVar));
    }

    /* renamed from: v */
    public final AbstractC11293f<T> m10428v() {
        if (this instanceof InterfaceC11314b) {
            return ((InterfaceC11314b) this).mo11061d();
        }
        return a.k(new C11601l(this));
    }

    /* renamed from: w */
    public final AbstractC11688p<T> m10427w() {
        if (this instanceof InterfaceC11316d) {
            return ((InterfaceC11316d) this).mo10806a();
        }
        return a.m(new C11603m(this));
    }
}
