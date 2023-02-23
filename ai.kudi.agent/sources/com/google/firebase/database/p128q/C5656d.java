package com.google.firebase.database.p128q;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: ImmutableSortedMapIterator.java */
/* renamed from: com.google.firebase.database.q.d */
/* loaded from: classes2.dex */
public class C5656d<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: c */
    private final ArrayDeque<AbstractC5665j<K, V>> f13902c = new ArrayDeque<>();

    /* renamed from: d */
    private final boolean f13903d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5656d(InterfaceC5661h<K, V> interfaceC5661h, K k, Comparator<K> comparator, boolean z) {
        int i;
        this.f13903d = z;
        while (!interfaceC5661h.isEmpty()) {
            if (k == null) {
                i = 1;
            } else if (z) {
                i = comparator.compare(k, interfaceC5661h.getKey());
            } else {
                i = comparator.compare(interfaceC5661h.getKey(), k);
            }
            if (i < 0) {
                if (z) {
                    interfaceC5661h = interfaceC5661h.mo24232a();
                } else {
                    interfaceC5661h = interfaceC5661h.mo24228f();
                }
            } else if (i == 0) {
                this.f13902c.push((AbstractC5665j) interfaceC5661h);
                return;
            } else {
                this.f13902c.push((AbstractC5665j) interfaceC5661h);
                if (z) {
                    interfaceC5661h = interfaceC5661h.mo24228f();
                } else {
                    interfaceC5661h = interfaceC5661h.mo24232a();
                }
            }
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public Map.Entry<K, V> next() {
        try {
            AbstractC5665j<K, V> pop = this.f13902c.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.f13903d) {
                for (InterfaceC5661h<K, V> mo24232a = pop.mo24232a(); !mo24232a.isEmpty(); mo24232a = mo24232a.mo24228f()) {
                    this.f13902c.push((AbstractC5665j) mo24232a);
                }
            } else {
                for (InterfaceC5661h<K, V> mo24228f = pop.mo24228f(); !mo24228f.isEmpty(); mo24228f = mo24228f.mo24232a()) {
                    this.f13902c.push((AbstractC5665j) mo24228f);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f13902c.size() > 0;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
