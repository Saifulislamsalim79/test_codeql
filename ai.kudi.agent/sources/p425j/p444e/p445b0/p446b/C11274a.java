package p425j.p444e.p445b0.p446b;

import io.reactivex.exceptions.C11118a;
import j.e.v;
import java.util.concurrent.Callable;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RxAndroidPlugins.java */
/* renamed from: j.e.b0.b.a */
/* loaded from: classes3.dex */
public final class C11274a {

    /* renamed from: a */
    private static volatile InterfaceC11291f<Callable<v>, v> f25408a;

    /* renamed from: b */
    private static volatile InterfaceC11291f<v, v> f25409b;

    /* renamed from: a */
    static <T, R> R m11227a(InterfaceC11291f<T, R> interfaceC11291f, T t) {
        try {
            return interfaceC11291f.mo10663a(t);
        } catch (Throwable th) {
            C11118a.m11647a(th);
            throw null;
        }
    }

    /* renamed from: b */
    static v m11226b(InterfaceC11291f<Callable<v>, v> interfaceC11291f, Callable<v> callable) {
        v vVar = (v) m11227a(interfaceC11291f, callable);
        if (vVar != null) {
            return vVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* renamed from: c */
    static v m11225c(Callable<v> callable) {
        try {
            v call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            C11118a.m11647a(th);
            throw null;
        }
    }

    /* renamed from: d */
    public static v m11224d(Callable<v> callable) {
        if (callable != null) {
            InterfaceC11291f<Callable<v>, v> interfaceC11291f = f25408a;
            if (interfaceC11291f == null) {
                return m11225c(callable);
            }
            return m11226b(interfaceC11291f, callable);
        }
        throw new NullPointerException("scheduler == null");
    }

    /* renamed from: e */
    public static v m11223e(v vVar) {
        if (vVar != null) {
            InterfaceC11291f<v, v> interfaceC11291f = f25409b;
            return interfaceC11291f == null ? vVar : (v) m11227a(interfaceC11291f, vVar);
        }
        throw new NullPointerException("scheduler == null");
    }
}
