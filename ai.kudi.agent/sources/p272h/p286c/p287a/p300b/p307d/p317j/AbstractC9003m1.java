package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.m1 */
/* loaded from: classes2.dex */
abstract class AbstractC9003m1 implements Iterator {

    /* renamed from: c */
    final Iterator f21280c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9003m1(Iterator it) {
        if (it == null) {
            throw null;
        }
        this.f21280c = it;
    }

    /* renamed from: a */
    abstract Object mo15525a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21280c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo15525a(this.f21280c.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21280c.remove();
    }
}
