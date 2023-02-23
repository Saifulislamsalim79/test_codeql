package com.google.common.collect;

import java.util.ListIterator;
/* compiled from: UnmodifiableListIterator.java */
/* renamed from: com.google.common.collect.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5066b0<E> extends AbstractC5064a0<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
