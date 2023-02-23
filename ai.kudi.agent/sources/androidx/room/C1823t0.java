package androidx.room;

import androidx.room.C1775g0;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.EnumC11269a;
import p425j.p444e.InterfaceC11672h;
import p425j.p444e.InterfaceC11675i;
import p425j.p444e.InterfaceC11687o;
import p425j.p444e.InterfaceC11690q;
import p425j.p444e.InterfaceC11691r;
import p425j.p444e.InterfaceC11697x;
import p425j.p444e.InterfaceC11699z;
import p425j.p444e.p448c0.C11281d;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: RxRoom.java */
/* renamed from: androidx.room.t0 */
/* loaded from: classes2.dex */
public class C1823t0 {

    /* renamed from: a */
    public static final Object f5547a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.t0$a */
    /* loaded from: classes2.dex */
    public class C1824a implements InterfaceC11675i<Object> {

        /* renamed from: a */
        final /* synthetic */ String[] f5548a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1802o0 f5549b;

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.t0$a$a */
        /* loaded from: classes2.dex */
        class C1825a extends C1775g0.AbstractC1778c {

            /* renamed from: b */
            final /* synthetic */ InterfaceC11672h f5550b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1825a(C1824a c1824a, String[] strArr, InterfaceC11672h interfaceC11672h) {
                super(strArr);
                this.f5550b = interfaceC11672h;
            }

            @Override // androidx.room.C1775g0.AbstractC1778c
            /* renamed from: b */
            public void mo34456b(Set<String> set) {
                if (this.f5550b.isCancelled()) {
                    return;
                }
                this.f5550b.mo10903f(C1823t0.f5547a);
            }
        }

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.t0$a$b */
        /* loaded from: classes2.dex */
        class C1826b implements InterfaceC11287a {

            /* renamed from: a */
            final /* synthetic */ C1775g0.AbstractC1778c f5551a;

            C1826b(C1775g0.AbstractC1778c abstractC1778c) {
                this.f5551a = abstractC1778c;
            }

            @Override // p425j.p444e.p450e0.InterfaceC11287a
            public void run() throws Exception {
                C1824a.this.f5549b.getInvalidationTracker().m34527k(this.f5551a);
            }
        }

        C1824a(String[] strArr, AbstractC1802o0 abstractC1802o0) {
            this.f5548a = strArr;
            this.f5549b = abstractC1802o0;
        }

        @Override // p425j.p444e.InterfaceC11675i
        public void subscribe(InterfaceC11672h<Object> interfaceC11672h) throws Exception {
            C1825a c1825a = new C1825a(this, this.f5548a, interfaceC11672h);
            if (!interfaceC11672h.isCancelled()) {
                this.f5549b.getInvalidationTracker().m34537a(c1825a);
                interfaceC11672h.mo10618c(C11281d.m11208c(new C1826b(c1825a)));
            }
            if (interfaceC11672h.isCancelled()) {
                return;
            }
            interfaceC11672h.mo10903f(C1823t0.f5547a);
        }
    }

    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.t0$b */
    /* loaded from: classes2.dex */
    class C1827b implements InterfaceC11291f<Object, InterfaceC11687o<T>> {

        /* renamed from: c */
        final /* synthetic */ AbstractC11677k f5553c;

        C1827b(AbstractC11677k abstractC11677k) {
            this.f5553c = abstractC11677k;
        }

        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: b */
        public InterfaceC11687o<T> mo10663a(Object obj) throws Exception {
            return this.f5553c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.t0$c */
    /* loaded from: classes2.dex */
    public class C1828c implements InterfaceC11691r<Object> {

        /* renamed from: a */
        final /* synthetic */ String[] f5554a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1802o0 f5555b;

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.t0$c$a */
        /* loaded from: classes2.dex */
        class C1829a extends C1775g0.AbstractC1778c {

            /* renamed from: b */
            final /* synthetic */ InterfaceC11690q f5556b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1829a(C1828c c1828c, String[] strArr, InterfaceC11690q interfaceC11690q) {
                super(strArr);
                this.f5556b = interfaceC11690q;
            }

            @Override // androidx.room.C1775g0.AbstractC1778c
            /* renamed from: b */
            public void mo34456b(Set<String> set) {
                this.f5556b.mo10903f(C1823t0.f5547a);
            }
        }

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.t0$c$b */
        /* loaded from: classes2.dex */
        class C1830b implements InterfaceC11287a {

            /* renamed from: a */
            final /* synthetic */ C1775g0.AbstractC1778c f5557a;

            C1830b(C1775g0.AbstractC1778c abstractC1778c) {
                this.f5557a = abstractC1778c;
            }

            @Override // p425j.p444e.p450e0.InterfaceC11287a
            public void run() throws Exception {
                C1828c.this.f5555b.getInvalidationTracker().m34527k(this.f5557a);
            }
        }

        C1828c(String[] strArr, AbstractC1802o0 abstractC1802o0) {
            this.f5554a = strArr;
            this.f5555b = abstractC1802o0;
        }

        @Override // p425j.p444e.InterfaceC11691r
        /* renamed from: a */
        public void mo3155a(InterfaceC11690q<Object> interfaceC11690q) throws Exception {
            C1829a c1829a = new C1829a(this, this.f5554a, interfaceC11690q);
            this.f5555b.getInvalidationTracker().m34537a(c1829a);
            interfaceC11690q.mo10480c(C11281d.m11208c(new C1830b(c1829a)));
            interfaceC11690q.mo10903f(C1823t0.f5547a);
        }
    }

    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.t0$d */
    /* loaded from: classes2.dex */
    class C1831d implements InterfaceC11291f<Object, InterfaceC11687o<T>> {

        /* renamed from: c */
        final /* synthetic */ AbstractC11677k f5559c;

        C1831d(AbstractC11677k abstractC11677k) {
            this.f5559c = abstractC11677k;
        }

        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: b */
        public InterfaceC11687o<T> mo10663a(Object obj) throws Exception {
            return this.f5559c;
        }
    }

    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.t0$e */
    /* loaded from: classes2.dex */
    class C1832e implements InterfaceC11699z<T> {

        /* renamed from: a */
        final /* synthetic */ Callable f5560a;

        C1832e(Callable callable) {
            this.f5560a = callable;
        }

        @Override // p425j.p444e.InterfaceC11699z
        /* renamed from: a */
        public void mo10424a(InterfaceC11697x<T> interfaceC11697x) throws Exception {
            try {
                interfaceC11697x.mo10425c(this.f5560a.call());
            } catch (EmptyResultSetException e) {
                interfaceC11697x.mo10426b(e);
            }
        }
    }

    /* renamed from: a */
    public static <T> AbstractC11293f<T> m34463a(AbstractC1802o0 abstractC1802o0, boolean z, String[] strArr, Callable<T> callable) {
        j.e.v b = j.e.j0.a.b(m34458f(abstractC1802o0, z));
        return (AbstractC11293f<T>) m34462b(abstractC1802o0, strArr).m11187M(b).m11184P(b).m11160y(b).m11168q(new C1827b(AbstractC11677k.m10591l(callable)));
    }

    /* renamed from: b */
    public static AbstractC11293f<Object> m34462b(AbstractC1802o0 abstractC1802o0, String... strArr) {
        return AbstractC11293f.m11179f(new C1824a(strArr, abstractC1802o0), EnumC11269a.LATEST);
    }

    /* renamed from: c */
    public static <T> AbstractC11688p<T> m34461c(AbstractC1802o0 abstractC1802o0, boolean z, String[] strArr, Callable<T> callable) {
        j.e.v b = j.e.j0.a.b(m34458f(abstractC1802o0, z));
        return (AbstractC11688p<T>) m34460d(abstractC1802o0, strArr).m10511h0(b).m10495p0(b).m10528R(b).m10539G(new C1831d(AbstractC11677k.m10591l(callable)));
    }

    /* renamed from: d */
    public static AbstractC11688p<Object> m34460d(AbstractC1802o0 abstractC1802o0, String... strArr) {
        return AbstractC11688p.m10494q(new C1828c(strArr, abstractC1802o0));
    }

    /* renamed from: e */
    public static <T> AbstractC11696w<T> m34459e(Callable<T> callable) {
        return AbstractC11696w.m10445e(new C1832e(callable));
    }

    /* renamed from: f */
    private static Executor m34458f(AbstractC1802o0 abstractC1802o0, boolean z) {
        if (z) {
            return abstractC1802o0.getTransactionExecutor();
        }
        return abstractC1802o0.getQueryExecutor();
    }
}
