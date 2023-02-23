package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1713j;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: AsyncDifferConfig.java */
/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes2.dex */
public final class C1676c<T> {

    /* renamed from: a */
    private final Executor f5144a;

    /* renamed from: b */
    private final Executor f5145b;

    /* renamed from: c */
    private final C1713j.AbstractC1719f<T> f5146c;

    /* compiled from: AsyncDifferConfig.java */
    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes2.dex */
    public static final class C1677a<T> {

        /* renamed from: d */
        private static final Object f5147d = new Object();

        /* renamed from: e */
        private static Executor f5148e;

        /* renamed from: a */
        private Executor f5149a;

        /* renamed from: b */
        private Executor f5150b;

        /* renamed from: c */
        private final C1713j.AbstractC1719f<T> f5151c;

        public C1677a(C1713j.AbstractC1719f<T> abstractC1719f) {
            this.f5151c = abstractC1719f;
        }

        /* renamed from: a */
        public C1676c<T> m34847a() {
            if (this.f5150b == null) {
                synchronized (f5147d) {
                    if (f5148e == null) {
                        f5148e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f5150b = f5148e;
            }
            return new C1676c<>(this.f5149a, this.f5150b, this.f5151c);
        }
    }

    C1676c(Executor executor, Executor executor2, C1713j.AbstractC1719f<T> abstractC1719f) {
        this.f5144a = executor;
        this.f5145b = executor2;
        this.f5146c = abstractC1719f;
    }

    /* renamed from: a */
    public Executor m34850a() {
        return this.f5145b;
    }

    /* renamed from: b */
    public C1713j.AbstractC1719f<T> m34849b() {
        return this.f5146c;
    }

    /* renamed from: c */
    public Executor m34848c() {
        return this.f5144a;
    }
}
