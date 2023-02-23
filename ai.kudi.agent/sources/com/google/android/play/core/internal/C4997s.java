package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* renamed from: com.google.android.play.core.internal.s */
/* loaded from: classes2.dex */
final class C4997s extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f12650a;

    public C4997s(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f12650a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C4997s.class) {
            if (this == obj) {
                return true;
            }
            C4997s c4997s = (C4997s) obj;
            if (this.f12650a == c4997s.f12650a && get() == c4997s.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12650a;
    }
}
