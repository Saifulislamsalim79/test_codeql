package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.google.android.play.core.internal.t */
/* loaded from: classes2.dex */
final class C4999t {

    /* renamed from: a */
    private final ConcurrentHashMap<C4997s, List<Throwable>> f12651a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f12652b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m25882a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f12652b.poll();
            if (poll == null) {
                break;
            }
            this.f12651a.remove(poll);
        }
        List<Throwable> list = this.f12651a.get(new C4997s(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f12651a.putIfAbsent(new C4997s(th, this.f12652b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
