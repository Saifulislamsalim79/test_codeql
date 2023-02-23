package com.google.common.collect;

import com.google.common.base.C5051n;
import java.util.NoSuchElementException;
/* compiled from: AbstractIndexedListIterator.java */
/* renamed from: com.google.common.collect.a */
/* loaded from: classes2.dex */
abstract class AbstractC5063a<E> extends AbstractC5066b0<E> {

    /* renamed from: c */
    private final int f12708c;

    /* renamed from: d */
    private int f12709d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5063a(int i, int i2) {
        C5051n.m25777q(i2, i);
        this.f12708c = i;
        this.f12709d = i2;
    }

    /* renamed from: a */
    protected abstract E mo25731a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12709d < this.f12708c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12709d > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.f12709d;
            this.f12709d = i + 1;
            return mo25731a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12709d;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f12709d - 1;
            this.f12709d = i;
            return mo25731a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12709d - 1;
    }
}
