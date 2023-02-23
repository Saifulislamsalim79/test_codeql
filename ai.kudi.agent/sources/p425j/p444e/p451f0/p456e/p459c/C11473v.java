package p425j.p444e.p451f0.p456e.p459c;

import io.reactivex.exceptions.C11118a;
import j.e.c0.c;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.InterfaceC11685m;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p453b.C11312b;
import p425j.p444e.p451f0.p456e.p459c.C11454n;
/* compiled from: MaybeZipArray.java */
/* renamed from: j.e.f0.e.c.v */
/* loaded from: classes3.dex */
public final class C11473v<T, R> extends AbstractC11677k<R> {

    /* renamed from: c */
    final InterfaceC11687o<? extends T>[] f25818c;

    /* renamed from: d */
    final InterfaceC11291f<? super Object[], ? extends R> f25819d;

    /* compiled from: MaybeZipArray.java */
    /* renamed from: j.e.f0.e.c.v$a */
    /* loaded from: classes3.dex */
    final class C11474a implements InterfaceC11291f<T, R> {
        C11474a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: a */
        public R mo10663a(T t) throws Exception {
            R mo10663a = C11473v.this.f25819d.mo10663a(new Object[]{t});
            C11312b.m11113d(mo10663a, "The zipper returned a null value");
            return mo10663a;
        }
    }

    /* compiled from: MaybeZipArray.java */
    /* renamed from: j.e.f0.e.c.v$b */
    /* loaded from: classes3.dex */
    static final class C11475b<T, R> extends AtomicInteger implements c {

        /* renamed from: c */
        final InterfaceC11685m<? super R> f25821c;

        /* renamed from: d */
        final InterfaceC11291f<? super Object[], ? extends R> f25822d;

        /* renamed from: e */
        final C11476c<T>[] f25823e;

        /* renamed from: f */
        final Object[] f25824f;

        C11475b(InterfaceC11685m<? super R> interfaceC11685m, int i, InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f) {
            super(i);
            this.f25821c = interfaceC11685m;
            this.f25822d = interfaceC11291f;
            C11476c<T>[] c11476cArr = new C11476c[i];
            for (int i2 = 0; i2 < i; i2++) {
                c11476cArr[i2] = new C11476c<>(this, i2);
            }
            this.f25823e = c11476cArr;
            this.f25824f = new Object[i];
        }

        /* renamed from: a */
        void m10968a(int i) {
            C11476c<T>[] c11476cArr = this.f25823e;
            int length = c11476cArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                c11476cArr[i2].m10962e();
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                }
                c11476cArr[i].m10962e();
            }
        }

        /* renamed from: b */
        void m10967b(int i) {
            if (getAndSet(0) > 0) {
                m10968a(i);
                this.f25821c.mo10551a();
            }
        }

        /* renamed from: c */
        void m10966c(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                m10968a(i);
                this.f25821c.mo10550b(th);
                return;
            }
            a.r(th);
        }

        /* renamed from: d */
        void m10965d(T t, int i) {
            this.f25824f[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    R mo10663a = this.f25822d.mo10663a(this.f25824f);
                    C11312b.m11113d(mo10663a, "The zipper returned a null value");
                    this.f25821c.mo10549c(mo10663a);
                } catch (Throwable th) {
                    C11118a.m11646b(th);
                    this.f25821c.mo10550b(th);
                }
            }
        }

        /* renamed from: i */
        public void m10964i() {
            if (getAndSet(0) > 0) {
                for (C11476c<T> c11476c : this.f25823e) {
                    c11476c.m10962e();
                }
            }
        }

        /* renamed from: j */
        public boolean m10963j() {
            return get() <= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaybeZipArray.java */
    /* renamed from: j.e.f0.e.c.v$c */
    /* loaded from: classes3.dex */
    public static final class C11476c<T> extends AtomicReference<c> implements InterfaceC11685m<T> {

        /* renamed from: c */
        final C11475b<T, ?> f25825c;

        /* renamed from: d */
        final int f25826d;

        C11476c(C11475b<T, ?> c11475b, int i) {
            this.f25825c = c11475b;
            this.f25826d = i;
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: a */
        public void mo10551a() {
            this.f25825c.m10967b(this.f25826d);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: b */
        public void mo10550b(Throwable th) {
            this.f25825c.m10966c(th, this.f25826d);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: c */
        public void mo10549c(T t) {
            this.f25825c.m10965d(t, this.f25826d);
        }

        @Override // p425j.p444e.InterfaceC11685m
        /* renamed from: d */
        public void mo10548d(c cVar) {
            EnumC11296c.m11149m(this, cVar);
        }

        /* renamed from: e */
        public void m10962e() {
            EnumC11296c.m11156a(this);
        }
    }

    public C11473v(InterfaceC11687o<? extends T>[] interfaceC11687oArr, InterfaceC11291f<? super Object[], ? extends R> interfaceC11291f) {
        this.f25818c = interfaceC11687oArr;
        this.f25819d = interfaceC11291f;
    }

    @Override // p425j.p444e.AbstractC11677k
    /* renamed from: u */
    protected void mo10582u(InterfaceC11685m<? super R> interfaceC11685m) {
        InterfaceC11687o<? extends T>[] interfaceC11687oArr = this.f25818c;
        int length = interfaceC11687oArr.length;
        if (length == 1) {
            interfaceC11687oArr[0].mo10546a(new C11454n.C11455a(interfaceC11685m, new C11474a()));
            return;
        }
        C11475b c11475b = new C11475b(interfaceC11685m, length, this.f25819d);
        interfaceC11685m.mo10548d(c11475b);
        for (int i = 0; i < length && !c11475b.m10963j(); i++) {
            InterfaceC11687o<? extends T> interfaceC11687o = interfaceC11687oArr[i];
            if (interfaceC11687o == null) {
                c11475b.m10966c(new NullPointerException("One of the sources is null"), i);
                return;
            }
            interfaceC11687o.mo10546a(c11475b.f25823e[i]);
        }
    }
}
