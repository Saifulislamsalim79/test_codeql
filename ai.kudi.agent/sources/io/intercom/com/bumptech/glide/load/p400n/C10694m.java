package io.intercom.com.bumptech.glide.load.p400n;

import io.intercom.com.bumptech.glide.p416r.C10889e;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.util.Queue;
/* compiled from: ModelCache.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.m */
/* loaded from: classes3.dex */
public class C10694m<A, B> {

    /* renamed from: a */
    private final C10889e<C10696b<A>, B> f24500a;

    /* compiled from: ModelCache.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.m$a */
    /* loaded from: classes3.dex */
    class C10695a extends C10889e<C10696b<A>, B> {
        C10695a(C10694m c10694m, long j) {
            super(j);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.intercom.com.bumptech.glide.p416r.C10889e
        /* renamed from: n */
        public void mo12025j(C10696b<A> c10696b, B b) {
            c10696b.m12506c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModelCache.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.m$b */
    /* loaded from: classes3.dex */
    public static final class C10696b<A> {

        /* renamed from: d */
        private static final Queue<C10696b<?>> f24501d = C10893i.m12007f(0);

        /* renamed from: a */
        private int f24502a;

        /* renamed from: b */
        private int f24503b;

        /* renamed from: c */
        private A f24504c;

        private C10696b() {
        }

        /* renamed from: a */
        static <A> C10696b<A> m12508a(A a, int i, int i2) {
            C10696b<A> c10696b;
            synchronized (f24501d) {
                c10696b = (C10696b<A>) f24501d.poll();
            }
            if (c10696b == null) {
                c10696b = new C10696b<>();
            }
            c10696b.m12507b(a, i, i2);
            return c10696b;
        }

        /* renamed from: b */
        private void m12507b(A a, int i, int i2) {
            this.f24504c = a;
            this.f24503b = i;
            this.f24502a = i2;
        }

        /* renamed from: c */
        public void m12506c() {
            synchronized (f24501d) {
                f24501d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10696b) {
                C10696b c10696b = (C10696b) obj;
                return this.f24503b == c10696b.f24503b && this.f24502a == c10696b.f24502a && this.f24504c.equals(c10696b.f24504c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f24502a * 31) + this.f24503b) * 31) + this.f24504c.hashCode();
        }
    }

    public C10694m(long j) {
        this.f24500a = new C10695a(this, j);
    }

    /* renamed from: a */
    public B m12511a(A a, int i, int i2) {
        C10696b<A> m12508a = C10696b.m12508a(a, i, i2);
        B m12028g = this.f24500a.m12028g(m12508a);
        m12508a.m12506c();
        return m12028g;
    }

    /* renamed from: b */
    public void m12510b(A a, int i, int i2, B b) {
        this.f24500a.m12024k(C10696b.m12508a(a, i, i2), b);
    }
}
