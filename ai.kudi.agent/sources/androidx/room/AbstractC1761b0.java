package androidx.room;

import p201g.p262t.p263a.InterfaceC8101k;
/* compiled from: EntityDeletionOrUpdateAdapter.java */
/* renamed from: androidx.room.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1761b0<T> extends AbstractC1841w0 {
    public AbstractC1761b0(AbstractC1802o0 abstractC1802o0) {
        super(abstractC1802o0);
    }

    protected abstract void bind(InterfaceC8101k interfaceC8101k, T t);

    @Override // androidx.room.AbstractC1841w0
    protected abstract String createQuery();

    public final int handle(T t) {
        InterfaceC8101k acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        InterfaceC8101k acquire = acquire();
        int i = 0;
        try {
            for (T t : iterable) {
                bind(acquire, t);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] tArr) {
        InterfaceC8101k acquire = acquire();
        try {
            int i = 0;
            for (T t : tArr) {
                bind(acquire, t);
                i += acquire.executeUpdateDelete();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
