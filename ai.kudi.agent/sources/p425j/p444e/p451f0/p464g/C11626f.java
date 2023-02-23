package p425j.p444e.p451f0.p464g;

import j.e.v;
import java.util.concurrent.ThreadFactory;
import p425j.p444e.v$b;
/* compiled from: NewThreadScheduler.java */
/* renamed from: j.e.f0.g.f */
/* loaded from: classes3.dex */
public final class C11626f extends v {

    /* renamed from: b */
    private static final ThreadFactoryC11628h f26267b = new ThreadFactoryC11628h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: a */
    final ThreadFactory f26268a;

    public C11626f() {
        this(f26267b);
    }

    /* renamed from: a */
    public v$b m10722a() {
        return new C11627g(this.f26268a);
    }

    public C11626f(ThreadFactory threadFactory) {
        this.f26268a = threadFactory;
    }
}
