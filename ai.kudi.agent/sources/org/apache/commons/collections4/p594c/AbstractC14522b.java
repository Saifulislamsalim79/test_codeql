package org.apache.commons.collections4.p594c;

import java.util.Map;
/* compiled from: AbstractMapDecorator.java */
/* renamed from: org.apache.commons.collections4.c.b */
/* loaded from: classes3.dex */
public abstract class AbstractC14522b<K, V> extends AbstractC14521a<K, V> {

    /* renamed from: c */
    transient Map<K, V> f32070c;

    protected AbstractC14522b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Map<K, V> m1401a() {
        return this.f32070c;
    }

    public boolean containsKey(Object obj) {
        return m1401a().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return m1401a().containsValue(obj);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return m1401a().equals(obj);
    }

    public V get(Object obj) {
        return m1401a().get(obj);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return m1401a().hashCode();
    }

    public boolean isEmpty() {
        return m1401a().isEmpty();
    }

    public int size() {
        return m1401a().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC14522b(Map<K, V> map) {
        if (map != null) {
            this.f32070c = map;
            return;
        }
        throw new NullPointerException("Map must not be null.");
    }
}
