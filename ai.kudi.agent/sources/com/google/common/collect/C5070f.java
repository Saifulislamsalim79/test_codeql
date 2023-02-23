package com.google.common.collect;

import com.google.common.base.C5051n;
import java.io.Serializable;
import java.util.Comparator;
/* compiled from: ComparatorOrdering.java */
/* renamed from: com.google.common.collect.f */
/* loaded from: classes2.dex */
final class C5070f<T> extends AbstractC5125s<T> implements Serializable {

    /* renamed from: c */
    final Comparator<T> f12712c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5070f(Comparator<T> comparator) {
        C5051n.m25780n(comparator);
        this.f12712c = comparator;
    }

    @Override // com.google.common.collect.AbstractC5125s, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f12712c.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5070f) {
            return this.f12712c.equals(((C5070f) obj).f12712c);
        }
        return false;
    }

    public int hashCode() {
        return this.f12712c.hashCode();
    }

    public String toString() {
        return this.f12712c.toString();
    }
}
