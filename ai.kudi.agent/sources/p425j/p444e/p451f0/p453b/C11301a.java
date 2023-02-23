package p425j.p444e.p451f0.p453b;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import j.e.e0.e;
import j.e.i0.a;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
/* compiled from: Functions.java */
/* renamed from: j.e.f0.b.a */
/* loaded from: classes3.dex */
public final class C11301a {

    /* renamed from: a */
    static final InterfaceC11291f<Object, Object> f25429a = new C11307f();

    /* renamed from: b */
    public static final Runnable f25430b = new RunnableC11305d();

    /* renamed from: c */
    public static final InterfaceC11287a f25431c = new C11303b();

    /* renamed from: d */
    static final e<Object> f25432d = new C11304c();

    /* renamed from: e */
    public static final e<Throwable> f25433e = new C11310i();

    /* renamed from: f */
    static final InterfaceC11292g<Object> f25434f = new C11311j();

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$a */
    /* loaded from: classes3.dex */
    static final class C11302a<T1, T2, R> implements InterfaceC11291f<Object[], R> {

        /* renamed from: c */
        final InterfaceC11288b<? super T1, ? super T2, ? extends R> f25435c;

        C11302a(InterfaceC11288b<? super T1, ? super T2, ? extends R> interfaceC11288b) {
            this.f25435c = interfaceC11288b;
        }

        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: b */
        public R mo10663a(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f25435c.mo11200a(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$b */
    /* loaded from: classes3.dex */
    static final class C11303b implements InterfaceC11287a {
        C11303b() {
        }

        @Override // p425j.p444e.p450e0.InterfaceC11287a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$c */
    /* loaded from: classes3.dex */
    static final class C11304c implements e<Object> {
        C11304c() {
        }

        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$d */
    /* loaded from: classes3.dex */
    static final class RunnableC11305d implements Runnable {
        RunnableC11305d() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$e */
    /* loaded from: classes3.dex */
    static final class C11306e<T> implements InterfaceC11292g<T> {

        /* renamed from: c */
        final T f25436c;

        C11306e(T t) {
            this.f25436c = t;
        }

        @Override // p425j.p444e.p450e0.InterfaceC11292g
        /* renamed from: c */
        public boolean mo10557c(T t) throws Exception {
            return C11312b.m11114c(t, this.f25436c);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$f */
    /* loaded from: classes3.dex */
    static final class C11307f implements InterfaceC11291f<Object, Object> {
        C11307f() {
        }

        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: a */
        public Object mo10663a(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$g */
    /* loaded from: classes3.dex */
    static final class CallableC11308g<T, U> implements Callable<U>, InterfaceC11291f<T, U> {

        /* renamed from: c */
        final U f25437c;

        CallableC11308g(U u) {
            this.f25437c = u;
        }

        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: a */
        public U mo10663a(T t) throws Exception {
            return this.f25437c;
        }

        @Override // java.util.concurrent.Callable
        public U call() throws Exception {
            return this.f25437c;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$h */
    /* loaded from: classes3.dex */
    static final class C11309h<T> implements InterfaceC11291f<List<T>, List<T>> {

        /* renamed from: c */
        final Comparator<? super T> f25438c;

        C11309h(Comparator<? super T> comparator) {
            this.f25438c = comparator;
        }

        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo10663a(Object obj) throws Exception {
            List<T> list = (List) obj;
            m11118b(list);
            return list;
        }

        /* renamed from: b */
        public List<T> m11118b(List<T> list) {
            Collections.sort(list, this.f25438c);
            return list;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$i */
    /* loaded from: classes3.dex */
    static final class C11310i implements e<Throwable> {
        C11310i() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            a.r(new OnErrorNotImplementedException(th));
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: j.e.f0.b.a$j */
    /* loaded from: classes3.dex */
    static final class C11311j implements InterfaceC11292g<Object> {
        C11311j() {
        }

        @Override // p425j.p444e.p450e0.InterfaceC11292g
        /* renamed from: c */
        public boolean mo10557c(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC11292g<T> m11126a() {
        return (InterfaceC11292g<T>) f25434f;
    }

    /* renamed from: b */
    public static <T> e<T> m11125b() {
        return (e<T>) f25432d;
    }

    /* renamed from: c */
    public static <T> InterfaceC11292g<T> m11124c(T t) {
        return new C11306e(t);
    }

    /* renamed from: d */
    public static <T> InterfaceC11291f<T, T> m11123d() {
        return (InterfaceC11291f<T, T>) f25429a;
    }

    /* renamed from: e */
    public static <T, U> InterfaceC11291f<T, U> m11122e(U u) {
        return new CallableC11308g(u);
    }

    /* renamed from: f */
    public static <T> InterfaceC11291f<List<T>, List<T>> m11121f(Comparator<? super T> comparator) {
        return new C11309h(comparator);
    }

    /* renamed from: g */
    public static <T1, T2, R> InterfaceC11291f<Object[], R> m11120g(InterfaceC11288b<? super T1, ? super T2, ? extends R> interfaceC11288b) {
        C11312b.m11113d(interfaceC11288b, "f is null");
        return new C11302a(interfaceC11288b);
    }
}
