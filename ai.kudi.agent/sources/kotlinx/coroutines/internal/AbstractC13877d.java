package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C13952q0;
/* compiled from: Atomic.kt */
/* renamed from: kotlinx.coroutines.internal.d */
/* loaded from: classes3.dex */
public abstract class AbstractC13877d<T> extends AbstractC13910u {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30349a = AtomicReferenceFieldUpdater.newUpdater(AbstractC13877d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C13872c.f30341a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC13910u
    /* renamed from: a */
    public AbstractC13877d<?> mo3438a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC13910u
    /* renamed from: c */
    public final Object mo3436c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C13872c.f30341a) {
            obj2 = m3545e(mo2972g(obj));
        }
        mo2973d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo2973d(T t, Object obj);

    /* renamed from: e */
    public final Object m3545e(Object obj) {
        if (C13952q0.m3345a()) {
            if (!(obj != C13872c.f30341a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = C13872c.f30341a;
        return obj2 != obj3 ? obj2 : f30349a.compareAndSet(this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long m3544f() {
        return 0L;
    }

    /* renamed from: g */
    public abstract Object mo2972g(T t);
}
