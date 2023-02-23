package p272h.p286c.p287a.p300b.p307d.p315h;

import java.util.NoSuchElementException;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: h.c.a.b.d.h.d */
/* loaded from: classes2.dex */
abstract class AbstractC8491d extends AbstractC8529w {

    /* renamed from: c */
    private final int f20201c;

    /* renamed from: d */
    private int f20202d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8491d(int i, int i2) {
        C8487b.m16038b(i2, i, "index");
        this.f20201c = i;
        this.f20202d = i2;
    }

    /* renamed from: a */
    protected abstract Object mo16027a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20202d < this.f20201c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20202d > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f20202d;
            this.f20202d = i + 1;
            return mo16027a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20202d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f20202d - 1;
            this.f20202d = i;
            return mo16027a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20202d - 1;
    }
}
