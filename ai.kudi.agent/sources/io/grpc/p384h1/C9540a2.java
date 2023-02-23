package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.collect.AbstractC5079k;
import io.grpc.C9497c1;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RetryPolicy.java */
/* renamed from: io.grpc.h1.a2 */
/* loaded from: classes2.dex */
public final class C9540a2 {

    /* renamed from: a */
    final int f22332a;

    /* renamed from: b */
    final long f22333b;

    /* renamed from: c */
    final long f22334c;

    /* renamed from: d */
    final double f22335d;

    /* renamed from: e */
    final Long f22336e;

    /* renamed from: f */
    final Set<C9497c1.EnumC9499b> f22337f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9540a2(int i, long j, long j2, double d, Long l, Set<C9497c1.EnumC9499b> set) {
        this.f22332a = i;
        this.f22333b = j;
        this.f22334c = j2;
        this.f22335d = d;
        this.f22336e = l;
        this.f22337f = AbstractC5079k.m25716E(set);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9540a2) {
            C9540a2 c9540a2 = (C9540a2) obj;
            return this.f22332a == c9540a2.f22332a && this.f22333b == c9540a2.f22333b && this.f22334c == c9540a2.f22334c && Double.compare(this.f22335d, c9540a2.f22335d) == 0 && C5046k.m25800a(this.f22336e, c9540a2.f22336e) && C5046k.m25800a(this.f22337f, c9540a2.f22337f);
        }
        return false;
    }

    public int hashCode() {
        return C5046k.m25799b(Integer.valueOf(this.f22332a), Long.valueOf(this.f22333b), Long.valueOf(this.f22334c), Double.valueOf(this.f22335d), this.f22336e, this.f22337f);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25810b("maxAttempts", this.f22332a);
        m25812c.m25809c("initialBackoffNanos", this.f22333b);
        m25812c.m25809c("maxBackoffNanos", this.f22334c);
        m25812c.m25811a("backoffMultiplier", this.f22335d);
        m25812c.m25808d("perAttemptRecvTimeoutNanos", this.f22336e);
        m25812c.m25808d("retryableStatusCodes", this.f22337f);
        return m25812c.toString();
    }
}
