package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.a0 */
/* loaded from: classes2.dex */
abstract class AbstractC8822a0 implements Iterator {

    /* renamed from: c */
    int f20777c;

    /* renamed from: d */
    int f20778d;

    /* renamed from: e */
    int f20779e;

    /* renamed from: f */
    final /* synthetic */ C8897f0 f20780f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC8822a0(C8897f0 c8897f0, C9149w c9149w) {
        int i;
        this.f20780f = c8897f0;
        C8897f0 c8897f02 = this.f20780f;
        i = c8897f02.f20943w;
        this.f20777c = i;
        this.f20778d = c8897f02.m15730i();
        this.f20779e = -1;
    }

    /* renamed from: b */
    private final void m15836b() {
        int i;
        i = this.f20780f.f20943w;
        if (i != this.f20777c) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    abstract Object mo15513a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20778d >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m15836b();
        if (hasNext()) {
            int i = this.f20778d;
            this.f20779e = i;
            Object mo15513a = mo15513a(i);
            this.f20778d = this.f20780f.m15729j(this.f20778d);
            return mo15513a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        m15836b();
        C8851c.m15803d(this.f20779e >= 0, "no calls to next() since the last call to remove()");
        this.f20777c += 32;
        C8897f0 c8897f0 = this.f20780f;
        c8897f0.remove(C8897f0.m15728k(c8897f0, this.f20779e));
        this.f20778d--;
        this.f20779e = -1;
    }
}
