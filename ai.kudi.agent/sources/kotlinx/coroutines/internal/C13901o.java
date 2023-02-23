package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: LockFreeTaskQueue.kt */
/* renamed from: kotlinx.coroutines.internal.o */
/* loaded from: classes3.dex */
public class C13901o<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f30381a = AtomicReferenceFieldUpdater.newUpdater(C13901o.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C13901o(boolean z) {
        this._cur = new C13902p(8, z);
    }

    /* renamed from: a */
    public final boolean m3468a(E e) {
        while (true) {
            C13902p c13902p = (C13902p) this._cur;
            int m3464a = c13902p.m3464a(e);
            if (m3464a == 0) {
                return true;
            }
            if (m3464a == 1) {
                f30381a.compareAndSet(this, c13902p, c13902p.m3456i());
            } else if (m3464a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m3467b() {
        while (true) {
            C13902p c13902p = (C13902p) this._cur;
            if (c13902p.m3461d()) {
                return;
            }
            f30381a.compareAndSet(this, c13902p, c13902p.m3456i());
        }
    }

    /* renamed from: c */
    public final int m3466c() {
        return ((C13902p) this._cur).m3459f();
    }

    /* renamed from: d */
    public final E m3465d() {
        while (true) {
            C13902p c13902p = (C13902p) this._cur;
            E e = (E) c13902p.m3455j();
            if (e != C13902p.f30385h) {
                return e;
            }
            f30381a.compareAndSet(this, c13902p, c13902p.m3456i());
        }
    }
}
