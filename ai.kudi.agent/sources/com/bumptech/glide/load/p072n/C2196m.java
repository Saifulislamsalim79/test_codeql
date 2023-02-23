package com.bumptech.glide.load.p072n;

import com.bumptech.glide.p086q.C2377g;
import com.bumptech.glide.p086q.C2381k;
import java.util.Queue;
/* compiled from: ModelCache.java */
/* renamed from: com.bumptech.glide.load.n.m */
/* loaded from: classes2.dex */
public class C2196m<A, B> {

    /* renamed from: a */
    private final C2377g<C2198b<A>, B> f6506a;

    /* compiled from: ModelCache.java */
    /* renamed from: com.bumptech.glide.load.n.m$a */
    /* loaded from: classes2.dex */
    class C2197a extends C2377g<C2198b<A>, B> {
        C2197a(C2196m c2196m, long j) {
            super(j);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.p086q.C2377g
        /* renamed from: n */
        public void mo33139j(C2198b<A> c2198b, B b) {
            c2198b.m33555c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelCache.java */
    /* renamed from: com.bumptech.glide.load.n.m$b */
    /* loaded from: classes2.dex */
    public static final class C2198b<A> {

        /* renamed from: d */
        private static final Queue<C2198b<?>> f6507d = C2381k.m33123e(0);

        /* renamed from: a */
        private int f6508a;

        /* renamed from: b */
        private int f6509b;

        /* renamed from: c */
        private A f6510c;

        private C2198b() {
        }

        /* renamed from: a */
        static <A> C2198b<A> m33557a(A a, int i, int i2) {
            C2198b<A> c2198b;
            synchronized (f6507d) {
                c2198b = (C2198b<A>) f6507d.poll();
            }
            if (c2198b == null) {
                c2198b = new C2198b<>();
            }
            c2198b.m33556b(a, i, i2);
            return c2198b;
        }

        /* renamed from: b */
        private void m33556b(A a, int i, int i2) {
            this.f6510c = a;
            this.f6509b = i;
            this.f6508a = i2;
        }

        /* renamed from: c */
        public void m33555c() {
            synchronized (f6507d) {
                f6507d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2198b) {
                C2198b c2198b = (C2198b) obj;
                return this.f6509b == c2198b.f6509b && this.f6508a == c2198b.f6508a && this.f6510c.equals(c2198b.f6510c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f6508a * 31) + this.f6509b) * 31) + this.f6510c.hashCode();
        }
    }

    public C2196m(long j) {
        this.f6506a = new C2197a(this, j);
    }

    /* renamed from: a */
    public B m33560a(A a, int i, int i2) {
        C2198b<A> m33557a = C2198b.m33557a(a, i, i2);
        B m33142g = this.f6506a.m33142g(m33557a);
        m33557a.m33555c();
        return m33142g;
    }

    /* renamed from: b */
    public void m33559b(A a, int i, int i2, B b) {
        this.f6506a.m33138k(C2198b.m33557a(a, i, i2), b);
    }
}
