package p425j.p444e.p448c0;

import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: ReferenceDisposable.java */
/* renamed from: j.e.c0.e */
/* loaded from: classes3.dex */
abstract class AbstractC11282e<T> extends AtomicReference<T> implements c {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC11282e(T t) {
        super(t);
        C11312b.m11113d(t, "value is null");
    }

    /* renamed from: a */
    protected abstract void mo11204a(T t);

    /* renamed from: i */
    public final void m11206i() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo11204a(andSet);
    }

    /* renamed from: j */
    public final boolean m11205j() {
        return get() == null;
    }
}
