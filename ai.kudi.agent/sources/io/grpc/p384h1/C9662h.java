package io.grpc.p384h1;

import com.google.common.base.C5051n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: AtomicBackoff.java */
/* renamed from: io.grpc.h1.h */
/* loaded from: classes2.dex */
public final class C9662h {

    /* renamed from: c */
    private static final Logger f22670c = Logger.getLogger(C9662h.class.getName());

    /* renamed from: a */
    private final String f22671a;

    /* renamed from: b */
    private final AtomicLong f22672b = new AtomicLong();

    /* compiled from: AtomicBackoff.java */
    /* renamed from: io.grpc.h1.h$b */
    /* loaded from: classes2.dex */
    public final class C9664b {

        /* renamed from: a */
        private final long f22673a;

        /* renamed from: a */
        public void m14227a() {
            long j = this.f22673a;
            long max = Math.max(2 * j, j);
            if (C9662h.this.f22672b.compareAndSet(this.f22673a, max)) {
                C9662h.f22670c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C9662h.this.f22671a, Long.valueOf(max)});
            }
        }

        /* renamed from: b */
        public long m14226b() {
            return this.f22673a;
        }

        private C9664b(long j) {
            this.f22673a = j;
        }
    }

    public C9662h(String str, long j) {
        C5051n.m25789e(j > 0, "value must be positive");
        this.f22671a = str;
        this.f22672b.set(j);
    }

    /* renamed from: d */
    public C9664b m14228d() {
        return new C9664b(this.f22672b.get());
    }
}
