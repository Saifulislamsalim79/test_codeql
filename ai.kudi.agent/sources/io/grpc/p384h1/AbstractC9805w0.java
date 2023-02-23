package io.grpc.p384h1;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
/* compiled from: InUseStateAggregator.java */
/* renamed from: io.grpc.h1.w0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9805w0<T> {

    /* renamed from: a */
    private final Set<T> f23026a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: a */
    public final boolean m13950a(Object... objArr) {
        for (Object obj : objArr) {
            if (this.f23026a.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    protected abstract void mo13596b();

    /* renamed from: c */
    protected abstract void mo13595c();

    /* renamed from: d */
    public final boolean m13949d() {
        return !this.f23026a.isEmpty();
    }

    /* renamed from: e */
    public final void m13948e(T t, boolean z) {
        int size = this.f23026a.size();
        if (z) {
            this.f23026a.add(t);
            if (size == 0) {
                mo13596b();
            }
        } else if (this.f23026a.remove(t) && size == 1) {
            mo13595c();
        }
    }
}
