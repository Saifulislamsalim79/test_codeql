package p425j.p444e.p451f0.p456e.p458b;

import io.reactivex.exceptions.C11118a;
import io.reactivex.exceptions.MissingBackpressureException;
import j.e.c0.c;
import j.e.e0.e;
import j.e.i0.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.AbstractC11293f;
import p425j.p444e.InterfaceC11676j;
import p425j.p444e.p449d0.AbstractC11285a;
import p425j.p444e.p451f0.p454c.InterfaceC11319g;
import p425j.p444e.p451f0.p454c.InterfaceC11322j;
import p425j.p444e.p451f0.p463f.C11607b;
import p425j.p444e.p451f0.p466i.EnumC11652g;
import p425j.p444e.p451f0.p467j.C11657d;
import p425j.p444e.p451f0.p467j.C11661h;
import p425j.p444e.p451f0.p467j.EnumC11664j;
import p577n.p586b.InterfaceC14455a;
import p577n.p586b.InterfaceC14456b;
import p577n.p586b.InterfaceC14457c;
/* compiled from: FlowablePublish.java */
/* renamed from: j.e.f0.e.b.x */
/* loaded from: classes3.dex */
public final class C11423x<T> extends AbstractC11285a<T> {

    /* renamed from: d */
    final AbstractC11293f<T> f25713d;

    /* renamed from: e */
    final AtomicReference<C11426c<T>> f25714e;

    /* renamed from: f */
    final int f25715f;

    /* renamed from: w */
    final InterfaceC14455a<T> f25716w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowablePublish.java */
    /* renamed from: j.e.f0.e.b.x$a */
    /* loaded from: classes3.dex */
    public static final class C11424a<T> implements InterfaceC14455a<T> {

        /* renamed from: c */
        private final AtomicReference<C11426c<T>> f25717c;

        /* renamed from: d */
        private final int f25718d;

        C11424a(AtomicReference<C11426c<T>> atomicReference, int i) {
            this.f25717c = atomicReference;
            this.f25718d = i;
        }

        @Override // p577n.p586b.InterfaceC14455a
        /* renamed from: a */
        public void mo1691a(InterfaceC14456b<? super T> interfaceC14456b) {
            C11426c<T> c11426c;
            C11425b<T> c11425b = new C11425b<>(interfaceC14456b);
            interfaceC14456b.mo1687g(c11425b);
            while (true) {
                c11426c = this.f25717c.get();
                if (c11426c == null || c11426c.m11008j()) {
                    C11426c<T> c11426c2 = new C11426c<>(this.f25717c, this.f25718d);
                    if (this.f25717c.compareAndSet(c11426c, c11426c2)) {
                        c11426c = c11426c2;
                    } else {
                        continue;
                    }
                }
                if (c11426c.m11012c(c11425b)) {
                    break;
                }
            }
            if (c11425b.get() == Long.MIN_VALUE) {
                c11426c.m11007k(c11425b);
            } else {
                c11425b.f25720d = c11426c;
            }
            c11426c.m11010e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowablePublish.java */
    /* renamed from: j.e.f0.e.b.x$b */
    /* loaded from: classes3.dex */
    public static final class C11425b<T> extends AtomicLong implements InterfaceC14457c {

        /* renamed from: c */
        final InterfaceC14456b<? super T> f25719c;

        /* renamed from: d */
        volatile C11426c<T> f25720d;

        /* renamed from: e */
        long f25721e;

        C11425b(InterfaceC14456b<? super T> interfaceC14456b) {
            this.f25719c = interfaceC14456b;
        }

        @Override // p577n.p586b.InterfaceC14457c
        public void cancel() {
            C11426c<T> c11426c;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (c11426c = this.f25720d) == null) {
                return;
            }
            c11426c.m11007k(this);
            c11426c.m11010e();
        }

        @Override // p577n.p586b.InterfaceC14457c
        /* renamed from: e */
        public void mo1686e(long j) {
            if (EnumC11652g.m10669m(j)) {
                C11657d.m10656b(this, j);
                C11426c<T> c11426c = this.f25720d;
                if (c11426c != null) {
                    c11426c.m11010e();
                }
            }
        }
    }

    /* compiled from: FlowablePublish.java */
    /* renamed from: j.e.f0.e.b.x$c */
    /* loaded from: classes3.dex */
    static final class C11426c<T> extends AtomicInteger implements InterfaceC11676j<T>, c {

        /* renamed from: A */
        static final C11425b[] f25722A = new C11425b[0];

        /* renamed from: B */
        static final C11425b[] f25723B = new C11425b[0];

        /* renamed from: c */
        final AtomicReference<C11426c<T>> f25724c;

        /* renamed from: d */
        final int f25725d;

        /* renamed from: x */
        volatile Object f25729x;

        /* renamed from: y */
        int f25730y;

        /* renamed from: z */
        volatile InterfaceC11322j<T> f25731z;

        /* renamed from: w */
        final AtomicReference<InterfaceC14457c> f25728w = new AtomicReference<>();

        /* renamed from: e */
        final AtomicReference<C11425b<T>[]> f25726e = new AtomicReference<>(f25722A);

        /* renamed from: f */
        final AtomicBoolean f25727f = new AtomicBoolean();

        C11426c(AtomicReference<C11426c<T>> atomicReference, int i) {
            this.f25724c = atomicReference;
            this.f25725d = i;
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: a */
        public void mo1690a() {
            if (this.f25729x == null) {
                this.f25729x = EnumC11664j.m10637e();
                m11010e();
            }
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: b */
        public void mo1689b(Throwable th) {
            if (this.f25729x == null) {
                this.f25729x = EnumC11664j.m10635h(th);
                m11010e();
                return;
            }
            a.r(th);
        }

        /* renamed from: c */
        boolean m11012c(C11425b<T> c11425b) {
            C11425b<T>[] c11425bArr;
            C11425b<T>[] c11425bArr2;
            do {
                c11425bArr = this.f25726e.get();
                if (c11425bArr == f25723B) {
                    return false;
                }
                int length = c11425bArr.length;
                c11425bArr2 = new C11425b[length + 1];
                System.arraycopy(c11425bArr, 0, c11425bArr2, 0, length);
                c11425bArr2[length] = c11425b;
            } while (!this.f25726e.compareAndSet(c11425bArr, c11425bArr2));
            return true;
        }

        /* renamed from: d */
        boolean m11011d(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!EnumC11664j.m10632m(obj)) {
                    Throwable m10634i = EnumC11664j.m10634i(obj);
                    this.f25724c.compareAndSet(this, null);
                    C11425b<T>[] andSet = this.f25726e.getAndSet(f25723B);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].f25719c.mo1689b(m10634i);
                            i++;
                        }
                    } else {
                        a.r(m10634i);
                    }
                    return true;
                } else if (z) {
                    this.f25724c.compareAndSet(this, null);
                    C11425b<T>[] andSet2 = this.f25726e.getAndSet(f25723B);
                    int length2 = andSet2.length;
                    while (i < length2) {
                        andSet2[i].f25719c.mo1690a();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:110:0x0014, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x011e, code lost:
            if (r11 == 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0123, code lost:
            if (r25.f25730y == 1) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0125, code lost:
            r25.f25728w.get().mo1686e(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0131, code lost:
            r4 = r0;
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0135, code lost:
            if (r11 == 0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0137, code lost:
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x013a, code lost:
            if (r25.f25730y == 1) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x013c, code lost:
            r25.f25728w.get().mo1686e(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0148, code lost:
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x014d, code lost:
            if (r14 == 0) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x014f, code lost:
            if (r8 != false) goto L74;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m11010e() {
            /*
                Method dump skipped, instructions count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p425j.p444e.p451f0.p456e.p458b.C11423x.C11426c.m11010e():void");
        }

        @Override // p577n.p586b.InterfaceC14456b
        /* renamed from: f */
        public void mo1688f(T t) {
            if (this.f25730y == 0 && !this.f25731z.offer(t)) {
                mo1689b(new MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                m11010e();
            }
        }

        @Override // p425j.p444e.InterfaceC11676j, p577n.p586b.InterfaceC14456b
        /* renamed from: g */
        public void mo1687g(InterfaceC14457c interfaceC14457c) {
            if (EnumC11652g.m10670j(this.f25728w, interfaceC14457c)) {
                if (interfaceC14457c instanceof InterfaceC11319g) {
                    InterfaceC11319g interfaceC11319g = (InterfaceC11319g) interfaceC14457c;
                    int mo10681m = interfaceC11319g.mo10681m(7);
                    if (mo10681m == 1) {
                        this.f25730y = mo10681m;
                        this.f25731z = interfaceC11319g;
                        this.f25729x = EnumC11664j.m10637e();
                        m11010e();
                        return;
                    } else if (mo10681m == 2) {
                        this.f25730y = mo10681m;
                        this.f25731z = interfaceC11319g;
                        interfaceC14457c.mo1686e(this.f25725d);
                        return;
                    }
                }
                this.f25731z = new C11607b(this.f25725d);
                interfaceC14457c.mo1686e(this.f25725d);
            }
        }

        /* renamed from: i */
        public void m11009i() {
            C11425b<T>[] c11425bArr = this.f25726e.get();
            C11425b<T>[] c11425bArr2 = f25723B;
            if (c11425bArr == c11425bArr2 || this.f25726e.getAndSet(c11425bArr2) == f25723B) {
                return;
            }
            this.f25724c.compareAndSet(this, null);
            EnumC11652g.m10675a(this.f25728w);
        }

        /* renamed from: j */
        public boolean m11008j() {
            return this.f25726e.get() == f25723B;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        void m11007k(C11425b<T> c11425b) {
            C11425b<T>[] c11425bArr;
            C11425b[] c11425bArr2;
            do {
                c11425bArr = this.f25726e.get();
                int length = c11425bArr.length;
                if (length == 0) {
                    return;
                }
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (c11425bArr[i2].equals(c11425b)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c11425bArr2 = f25722A;
                } else {
                    C11425b[] c11425bArr3 = new C11425b[length - 1];
                    System.arraycopy(c11425bArr, 0, c11425bArr3, 0, i);
                    System.arraycopy(c11425bArr, i + 1, c11425bArr3, i, (length - i) - 1);
                    c11425bArr2 = c11425bArr3;
                }
            } while (!this.f25726e.compareAndSet(c11425bArr, c11425bArr2));
        }
    }

    private C11423x(InterfaceC14455a<T> interfaceC14455a, AbstractC11293f<T> abstractC11293f, AtomicReference<C11426c<T>> atomicReference, int i) {
        this.f25716w = interfaceC14455a;
        this.f25713d = abstractC11293f;
        this.f25714e = atomicReference;
        this.f25715f = i;
    }

    /* renamed from: S */
    public static <T> AbstractC11285a<T> m11013S(AbstractC11293f<T> abstractC11293f, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return a.o(new C11423x(new C11424a(atomicReference, i), abstractC11293f, atomicReference, i));
    }

    @Override // p425j.p444e.AbstractC11293f
    /* renamed from: L */
    protected void mo10791L(InterfaceC14456b<? super T> interfaceC14456b) {
        this.f25716w.mo1691a(interfaceC14456b);
    }

    @Override // p425j.p444e.p449d0.AbstractC11285a
    /* renamed from: R */
    public void mo11014R(e<? super c> eVar) {
        C11426c<T> c11426c;
        while (true) {
            c11426c = this.f25714e.get();
            if (c11426c != null && !c11426c.m11008j()) {
                break;
            }
            C11426c<T> c11426c2 = new C11426c<>(this.f25714e, this.f25715f);
            if (this.f25714e.compareAndSet(c11426c, c11426c2)) {
                c11426c = c11426c2;
                break;
            }
        }
        boolean z = true;
        z = (c11426c.f25727f.get() || !c11426c.f25727f.compareAndSet(false, true)) ? false : false;
        try {
            eVar.accept(c11426c);
            if (z) {
                this.f25713d.m11188K(c11426c);
            }
        } catch (Throwable th) {
            C11118a.m11646b(th);
            throw C11661h.m10646d(th);
        }
    }
}
