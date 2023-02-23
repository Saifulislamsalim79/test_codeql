package com.google.common.collect;

import com.google.common.base.C5051n;
/* compiled from: SingletonImmutableSet.java */
/* renamed from: com.google.common.collect.y */
/* loaded from: classes2.dex */
final class C5135y<E> extends AbstractC5079k<E> {

    /* renamed from: e */
    final transient E f12813e;

    /* renamed from: f */
    private transient int f12814f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5135y(E e) {
        C5051n.m25780n(e);
        this.f12813e = e;
    }

    @Override // com.google.common.collect.AbstractC5079k
    /* renamed from: F */
    AbstractC5074i<E> mo25557F() {
        return AbstractC5074i.m25736J(this.f12813e);
    }

    @Override // com.google.common.collect.AbstractC5079k
    /* renamed from: I */
    boolean mo25556I() {
        return this.f12814f != 0;
    }

    @Override // com.google.common.collect.AbstractC5072h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f12813e.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: d */
    int mo25555d(Object[] objArr, int i) {
        objArr[i] = this.f12813e;
        return i + 1;
    }

    @Override // com.google.common.collect.AbstractC5079k, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.f12814f;
        if (i == 0) {
            int hashCode = this.f12813e.hashCode();
            this.f12814f = hashCode;
            return hashCode;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: k */
    public boolean mo25554k() {
        return false;
    }

    @Override // com.google.common.collect.AbstractC5079k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l */
    public AbstractC5064a0<E> iterator() {
        return C5080l.m25707c(this.f12813e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f12813e.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5135y(E e, int i) {
        this.f12813e = e;
        this.f12814f = i;
    }
}
