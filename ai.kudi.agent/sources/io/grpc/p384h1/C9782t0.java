package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.collect.AbstractC5079k;
import io.grpc.C9497c1;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HedgingPolicy.java */
/* renamed from: io.grpc.h1.t0 */
/* loaded from: classes2.dex */
public final class C9782t0 {

    /* renamed from: a */
    final int f22984a;

    /* renamed from: b */
    final long f22985b;

    /* renamed from: c */
    final Set<C9497c1.EnumC9499b> f22986c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9782t0(int i, long j, Set<C9497c1.EnumC9499b> set) {
        this.f22984a = i;
        this.f22985b = j;
        this.f22986c = AbstractC5079k.m25716E(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9782t0.class != obj.getClass()) {
            return false;
        }
        C9782t0 c9782t0 = (C9782t0) obj;
        return this.f22984a == c9782t0.f22984a && this.f22985b == c9782t0.f22985b && C5046k.m25800a(this.f22986c, c9782t0.f22986c);
    }

    public int hashCode() {
        return C5046k.m25799b(Integer.valueOf(this.f22984a), Long.valueOf(this.f22985b), this.f22986c);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25810b("maxAttempts", this.f22984a);
        m25812c.m25809c("hedgingDelayNanos", this.f22985b);
        m25812c.m25808d("nonFatalStatusCodes", this.f22986c);
        return m25812c.toString();
    }
}
