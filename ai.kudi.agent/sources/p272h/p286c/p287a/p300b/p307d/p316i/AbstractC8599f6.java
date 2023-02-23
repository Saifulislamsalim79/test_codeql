package p272h.p286c.p287a.p300b.p307d.p316i;

import java.util.NoSuchElementException;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.f6 */
/* loaded from: classes2.dex */
abstract class AbstractC8599f6 extends AbstractC8557c {

    /* renamed from: c */
    private final int f20460c;

    /* renamed from: d */
    private int f20461d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8599f6(int i, int i2) {
        C8573d4.m15980b(i2, i, "index");
        this.f20460c = i;
        this.f20461d = i2;
    }

    /* renamed from: a */
    protected abstract Object mo15896a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20461d < this.f20460c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20461d > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f20461d;
            this.f20461d = i + 1;
            return mo15896a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20461d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f20461d - 1;
            this.f20461d = i;
            return mo15896a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20461d - 1;
    }
}
