package p425j.p444e;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.Callable;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
import p425j.p444e.p451f0.p453b.C11301a;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p454c.InterfaceC11315c;
import p425j.p444e.p451f0.p455d.C11328f;
import p425j.p444e.p451f0.p456e.p457a.C11333a;
import p425j.p444e.p451f0.p456e.p457a.C11336b;
import p425j.p444e.p451f0.p456e.p457a.C11337c;
import p425j.p444e.p451f0.p456e.p457a.C11338d;
import p425j.p444e.p451f0.p456e.p457a.C11339e;
import p425j.p444e.p451f0.p456e.p457a.C11340f;
import p425j.p444e.p451f0.p456e.p457a.C11341g;
import p425j.p444e.p451f0.p456e.p457a.C11343h;
import p425j.p444e.p451f0.p456e.p457a.C11345i;
import p425j.p444e.p451f0.p456e.p457a.C11347j;
import p425j.p444e.p451f0.p456e.p457a.C11349k;
import p425j.p444e.p451f0.p456e.p459c.C11447j;
import p425j.p444e.p451f0.p456e.p460d.C11477a;
/* compiled from: Completable.java */
/* renamed from: j.e.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11271b implements InterfaceC11284d {
    /* renamed from: e */
    public static AbstractC11271b m11246e() {
        return a.j(C11337c.f25466c);
    }

    /* renamed from: f */
    public static AbstractC11271b m11245f(Callable<? extends InterfaceC11284d> callable) {
        C11312b.m11113d(callable, "completableSupplier");
        return a.j(new C11336b(callable));
    }

    /* renamed from: i */
    private AbstractC11271b m11242i(e<? super c> eVar, e<? super Throwable> eVar2, InterfaceC11287a interfaceC11287a, InterfaceC11287a interfaceC11287a2, InterfaceC11287a interfaceC11287a3, InterfaceC11287a interfaceC11287a4) {
        C11312b.m11113d(eVar, "onSubscribe is null");
        C11312b.m11113d(eVar2, "onError is null");
        C11312b.m11113d(interfaceC11287a, "onComplete is null");
        C11312b.m11113d(interfaceC11287a2, "onTerminate is null");
        C11312b.m11113d(interfaceC11287a3, "onAfterTerminate is null");
        C11312b.m11113d(interfaceC11287a4, "onDispose is null");
        return a.j(new C11345i(this, eVar, eVar2, interfaceC11287a, interfaceC11287a2, interfaceC11287a3, interfaceC11287a4));
    }

    /* renamed from: j */
    public static AbstractC11271b m11241j(Throwable th) {
        C11312b.m11113d(th, "error is null");
        return a.j(new C11338d(th));
    }

    /* renamed from: k */
    public static AbstractC11271b m11240k(InterfaceC11287a interfaceC11287a) {
        C11312b.m11113d(interfaceC11287a, "run is null");
        return a.j(new C11339e(interfaceC11287a));
    }

    /* renamed from: l */
    public static AbstractC11271b m11239l(Callable<?> callable) {
        C11312b.m11113d(callable, "callable is null");
        return a.j(new C11340f(callable));
    }

    /* renamed from: u */
    private static NullPointerException m11231u(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @Override // p425j.p444e.InterfaceC11284d
    /* renamed from: b */
    public final void mo11202b(InterfaceC11278c interfaceC11278c) {
        C11312b.m11113d(interfaceC11278c, "observer is null");
        try {
            InterfaceC11278c w = a.w(this, interfaceC11278c);
            C11312b.m11113d(w, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo10805r(w);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C11118a.m11646b(th);
            a.r(th);
            throw m11231u(th);
        }
    }

    /* renamed from: c */
    public final AbstractC11271b m11248c(InterfaceC11284d interfaceC11284d) {
        C11312b.m11113d(interfaceC11284d, "next is null");
        return a.j(new C11333a(this, interfaceC11284d));
    }

    /* renamed from: d */
    public final <T> AbstractC11688p<T> m11247d(InterfaceC11692s<T> interfaceC11692s) {
        C11312b.m11113d(interfaceC11692s, "next is null");
        return a.m(new C11477a(this, interfaceC11692s));
    }

    /* renamed from: g */
    public final AbstractC11271b m11244g(InterfaceC11287a interfaceC11287a) {
        e<? super c> m11125b = C11301a.m11125b();
        e<? super Throwable> m11125b2 = C11301a.m11125b();
        InterfaceC11287a interfaceC11287a2 = C11301a.f25431c;
        return m11242i(m11125b, m11125b2, interfaceC11287a, interfaceC11287a2, interfaceC11287a2, interfaceC11287a2);
    }

    /* renamed from: h */
    public final AbstractC11271b m11243h(e<? super Throwable> eVar) {
        e<? super c> m11125b = C11301a.m11125b();
        InterfaceC11287a interfaceC11287a = C11301a.f25431c;
        return m11242i(m11125b, eVar, interfaceC11287a, interfaceC11287a, interfaceC11287a, interfaceC11287a);
    }

    /* renamed from: m */
    public final AbstractC11271b m11238m(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.j(new C11341g(this, vVar));
    }

    /* renamed from: n */
    public final AbstractC11271b m11237n() {
        return m11236o(C11301a.m11126a());
    }

    /* renamed from: o */
    public final AbstractC11271b m11236o(InterfaceC11292g<? super Throwable> interfaceC11292g) {
        C11312b.m11113d(interfaceC11292g, "predicate is null");
        return a.j(new C11343h(this, interfaceC11292g));
    }

    /* renamed from: p */
    public final AbstractC11271b m11235p(InterfaceC11291f<? super Throwable, ? extends InterfaceC11284d> interfaceC11291f) {
        C11312b.m11113d(interfaceC11291f, "errorMapper is null");
        return a.j(new C11347j(this, interfaceC11291f));
    }

    /* renamed from: q */
    public final c m11234q() {
        C11328f c11328f = new C11328f();
        mo11202b(c11328f);
        return c11328f;
    }

    /* renamed from: r */
    protected abstract void mo10805r(InterfaceC11278c interfaceC11278c);

    /* renamed from: s */
    public final AbstractC11271b m11233s(v vVar) {
        C11312b.m11113d(vVar, "scheduler is null");
        return a.j(new C11349k(this, vVar));
    }

    /* renamed from: t */
    public final <T> AbstractC11677k<T> m11232t() {
        if (this instanceof InterfaceC11315c) {
            return ((InterfaceC11315c) this).m11111c();
        }
        return a.l(new C11447j(this));
    }
}
