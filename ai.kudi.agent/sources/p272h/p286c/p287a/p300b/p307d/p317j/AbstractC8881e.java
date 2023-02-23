package p272h.p286c.p287a.p300b.p307d.p317j;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.e */
/* loaded from: classes2.dex */
abstract class AbstractC8881e extends AbstractC9033o1 {

    /* renamed from: c */
    private final int f20868c;

    /* renamed from: d */
    private int f20869d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8881e(int i, int i2) {
        C8851c.m15805b(i2, i, "index");
        this.f20868c = i;
        this.f20869d = i2;
    }

    /* renamed from: a */
    protected abstract Object mo15621a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f20869d < this.f20868c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f20869d > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f20869d;
            this.f20869d = i + 1;
            return mo15621a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f20869d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f20869d - 1;
            this.f20869d = i;
            return mo15621a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f20869d - 1;
    }
}
