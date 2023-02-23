package org.apache.commons.collections4.p592a;

import java.util.Iterator;
/* compiled from: AbstractUntypedIteratorDecorator.java */
/* renamed from: org.apache.commons.collections4.a.a */
/* loaded from: classes3.dex */
public abstract class AbstractC14518a<I, O> implements Iterator<O> {

    /* renamed from: c */
    private final Iterator<I> f32067c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC14518a(Iterator<I> it) {
        if (it != null) {
            this.f32067c = it;
            return;
        }
        throw new NullPointerException("Iterator must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Iterator<I> m1402a() {
        return this.f32067c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f32067c.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f32067c.remove();
    }
}
