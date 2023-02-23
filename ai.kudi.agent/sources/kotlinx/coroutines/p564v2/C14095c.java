package kotlinx.coroutines.p564v2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.C13939o;
import kotlinx.coroutines.InterfaceC13930m;
import kotlinx.coroutines.InterfaceC14110y0;
import kotlinx.coroutines.internal.AbstractC13877d;
import kotlinx.coroutines.internal.AbstractC13910u;
import kotlinx.coroutines.internal.C13895l;
import kotlinx.coroutines.internal.C13897n;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: Mutex.kt */
/* renamed from: kotlinx.coroutines.v2.c */
/* loaded from: classes3.dex */
public final class C14095c implements InterfaceC14094b {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f30739a = AtomicReferenceFieldUpdater.newUpdater(C14095c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.v2.c$a */
    /* loaded from: classes3.dex */
    public final class C14096a extends AbstractC14098b {

        /* renamed from: x */
        private final InterfaceC13930m<C13666w> f30740x;

        /* compiled from: Mutex.kt */
        /* renamed from: kotlinx.coroutines.v2.c$a$a */
        /* loaded from: classes3.dex */
        static final class C14097a extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {

            /* renamed from: c */
            final /* synthetic */ C14095c f30742c;

            /* renamed from: d */
            final /* synthetic */ C14096a f30743d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14097a(C14095c c14095c, C14096a c14096a) {
                super(1);
                this.f30742c = c14095c;
                this.f30743d = c14096a;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
                invoke2(th);
                return C13666w.f30112a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f30742c.mo2979b(this.f30743d.f30745f);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C14096a(Object obj, InterfaceC13930m<? super C13666w> interfaceC13930m) {
            super(C14095c.this, obj);
            this.f30740x = interfaceC13930m;
        }

        @Override // kotlinx.coroutines.p564v2.C14095c.AbstractC14098b
        /* renamed from: B */
        public void mo2976B() {
            this.f30740x.mo3371p(C13939o.f30425a);
        }

        @Override // kotlinx.coroutines.p564v2.C14095c.AbstractC14098b
        /* renamed from: D */
        public boolean mo2974D() {
            return m2975C() && this.f30740x.mo3375l(C13666w.f30112a, null, new C14097a(C14095c.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.C13897n
        public String toString() {
            return "LockCont[" + this.f30745f + ", " + this.f30740x + "] for " + C14095c.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.v2.c$b */
    /* loaded from: classes3.dex */
    public abstract class AbstractC14098b extends C13897n implements InterfaceC14110y0 {

        /* renamed from: w */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f30744w = AtomicReferenceFieldUpdater.newUpdater(AbstractC14098b.class, Object.class, "isTaken");

        /* renamed from: f */
        public final Object f30745f;
        private volatile /* synthetic */ Object isTaken = Boolean.FALSE;

        public AbstractC14098b(C14095c c14095c, Object obj) {
            this.f30745f = obj;
        }

        /* renamed from: B */
        public abstract void mo2976B();

        /* renamed from: C */
        public final boolean m2975C() {
            return f30744w.compareAndSet(this, Boolean.FALSE, Boolean.TRUE);
        }

        /* renamed from: D */
        public abstract boolean mo2974D();

        @Override // kotlinx.coroutines.InterfaceC14110y0
        /* renamed from: i */
        public final void mo2939i() {
            mo3474w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.v2.c$c */
    /* loaded from: classes3.dex */
    public static final class C14099c extends C13895l {

        /* renamed from: f */
        public Object f30746f;

        public C14099c(Object obj) {
            this.f30746f = obj;
        }

        @Override // kotlinx.coroutines.internal.C13897n
        public String toString() {
            return "LockedQueue[" + this.f30746f + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.v2.c$d */
    /* loaded from: classes3.dex */
    public static final class C14100d extends AbstractC13877d<C14095c> {

        /* renamed from: b */
        public final C14099c f30747b;

        public C14100d(C14099c c14099c) {
            this.f30747b = c14099c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC13877d
        /* renamed from: h */
        public void mo2973d(C14095c c14095c, Object obj) {
            C14095c.f30739a.compareAndSet(c14095c, this, obj == null ? C14102d.f30754e : this.f30747b);
        }

        @Override // kotlinx.coroutines.internal.AbstractC13877d
        /* renamed from: i */
        public Object mo2972g(C14095c c14095c) {
            C13914y c13914y;
            if (this.f30747b.m3491B()) {
                return null;
            }
            c13914y = C14102d.f30750a;
            return c13914y;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.v2.c$e */
    /* loaded from: classes3.dex */
    public static final class C14101e extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {

        /* renamed from: d */
        final /* synthetic */ Object f30749d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14101e(Object obj) {
            super(1);
            this.f30749d = obj;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
            invoke2(th);
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C14095c.this.mo2979b(this.f30749d);
        }
    }

    public C14095c(boolean z) {
        this._state = z ? C14102d.f30753d : C14102d.f30754e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        kotlinx.coroutines.C13945p.m3354c(r0, r1);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m2978c(java.lang.Object r7, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r8) {
        /*
            r6 = this;
            kotlin.c0.d r0 = kotlin.p476c0.p477j.C11728b.m10392c(r8)
            kotlinx.coroutines.n r0 = kotlinx.coroutines.C13945p.m3355b(r0)
            kotlinx.coroutines.v2.c$a r1 = new kotlinx.coroutines.v2.c$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.p564v2.C14093a
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.v2.a r3 = (kotlinx.coroutines.p564v2.C14093a) r3
            java.lang.Object r4 = r3.f30738a
            kotlinx.coroutines.internal.y r5 = kotlinx.coroutines.p564v2.C14102d.m2964f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.p564v2.C14095c.f30739a
            kotlinx.coroutines.v2.c$c r5 = new kotlinx.coroutines.v2.c$c
            java.lang.Object r3 = r3.f30738a
            r5.<init>(r3)
            r4.compareAndSet(r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.v2.a r3 = kotlinx.coroutines.p564v2.C14102d.m2967c()
            goto L37
        L32:
            kotlinx.coroutines.v2.a r3 = new kotlinx.coroutines.v2.a
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.p564v2.C14095c.f30739a
            boolean r2 = r4.compareAndSet(r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.w r1 = kotlin.C13666w.f30112a
            kotlinx.coroutines.v2.c$e r2 = new kotlinx.coroutines.v2.c$e
            r2.<init>(r7)
            r0.mo3373n(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.p564v2.C14095c.C14099c
            if (r3 == 0) goto L98
            r3 = r2
            kotlinx.coroutines.v2.c$c r3 = (kotlinx.coroutines.p564v2.C14095c.C14099c) r3
            java.lang.Object r4 = r3.f30746f
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.m3486h(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.m2975C()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.v2.c$a r1 = new kotlinx.coroutines.v2.c$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            kotlinx.coroutines.C13945p.m3354c(r0, r1)
        L71:
            java.lang.Object r7 = r0.m3363y()
            java.lang.Object r0 = kotlin.p476c0.p477j.C11728b.m10391d()
            if (r7 != r0) goto L7e
            kotlin.p476c0.p478k.p479a.C11741h.m10374c(r8)
        L7e:
            java.lang.Object r8 = kotlin.p476c0.p477j.C11728b.m10391d()
            if (r7 != r8) goto L85
            return r7
        L85:
            kotlin.w r7 = kotlin.C13666w.f30112a
            return r7
        L88:
            java.lang.String r8 = "Already locked by "
            java.lang.String r7 = kotlin.e0.d.l.m(r8, r7)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L98:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.AbstractC13910u
            if (r3 == 0) goto La3
            kotlinx.coroutines.internal.u r2 = (kotlinx.coroutines.internal.AbstractC13910u) r2
            r2.mo3436c(r6)
            goto Ld
        La3:
            java.lang.String r7 = "Illegal state "
            java.lang.String r7 = kotlin.e0.d.l.m(r7, r2)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            goto Lb4
        Lb3:
            throw r8
        Lb4:
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p564v2.C14095c.m2978c(java.lang.Object, kotlin.c0.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.p564v2.InterfaceC14094b
    /* renamed from: a */
    public Object mo2980a(Object obj, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        Object m10387d;
        if (m2977d(obj)) {
            return C13666w.f30112a;
        }
        Object m2978c = m2978c(obj, interfaceC11714d);
        m10387d = C11734d.m10387d();
        return m2978c == m10387d ? m2978c : C13666w.f30112a;
    }

    @Override // kotlinx.coroutines.p564v2.InterfaceC14094b
    /* renamed from: b */
    public void mo2979b(Object obj) {
        C14093a c14093a;
        C13914y c13914y;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C14093a) {
                if (obj == null) {
                    Object obj3 = ((C14093a) obj2).f30738a;
                    c13914y = C14102d.f30752c;
                    if (!(obj3 != c13914y)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    C14093a c14093a2 = (C14093a) obj2;
                    if (!(c14093a2.f30738a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c14093a2.f30738a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30739a;
                c14093a = C14102d.f30754e;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c14093a)) {
                    return;
                }
            } else if (obj2 instanceof AbstractC13910u) {
                ((AbstractC13910u) obj2).mo3436c(this);
            } else if (obj2 instanceof C14099c) {
                if (obj != null) {
                    C14099c c14099c = (C14099c) obj2;
                    if (!(c14099c.f30746f == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c14099c.f30746f + " but expected " + obj).toString());
                    }
                }
                C14099c c14099c2 = (C14099c) obj2;
                C13897n m3473x = c14099c2.m3473x();
                if (m3473x == null) {
                    C14100d c14100d = new C14100d(c14099c2);
                    if (f30739a.compareAndSet(this, obj2, c14100d) && c14100d.mo3436c(this) == null) {
                        return;
                    }
                } else {
                    AbstractC14098b abstractC14098b = (AbstractC14098b) m3473x;
                    if (abstractC14098b.mo2974D()) {
                        Object obj4 = abstractC14098b.f30745f;
                        if (obj4 == null) {
                            obj4 = C14102d.f30751b;
                        }
                        c14099c2.f30746f = obj4;
                        abstractC14098b.mo2976B();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(l.m("Illegal state ", obj2).toString());
            }
        }
    }

    /* renamed from: d */
    public boolean m2977d(Object obj) {
        C13914y c13914y;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C14093a) {
                Object obj3 = ((C14093a) obj2).f30738a;
                c13914y = C14102d.f30752c;
                if (obj3 != c13914y) {
                    return false;
                }
                if (f30739a.compareAndSet(this, obj2, obj == null ? C14102d.f30753d : new C14093a(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C14099c) {
                if (((C14099c) obj2).f30746f != obj) {
                    return false;
                }
                throw new IllegalStateException(l.m("Already locked by ", obj).toString());
            } else if (!(obj2 instanceof AbstractC13910u)) {
                throw new IllegalStateException(l.m("Illegal state ", obj2).toString());
            } else {
                ((AbstractC13910u) obj2).mo3436c(this);
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C14093a) {
                return "Mutex[" + ((C14093a) obj).f30738a + ']';
            } else if (!(obj instanceof AbstractC13910u)) {
                if (obj instanceof C14099c) {
                    return "Mutex[" + ((C14099c) obj).f30746f + ']';
                }
                throw new IllegalStateException(l.m("Illegal state ", obj).toString());
            } else {
                ((AbstractC13910u) obj).mo3436c(this);
            }
        }
    }
}
