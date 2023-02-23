package org.apache.commons.collections4.p593b;

import java.util.Map;
/* compiled from: AbstractMapEntry.java */
/* renamed from: org.apache.commons.collections4.b.b */
/* loaded from: classes3.dex */
public abstract class AbstractC14520b<K, V> extends AbstractC14519a<K, V> implements Map.Entry<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC14520b(K k, V v) {
        super(k, v);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (getValue().equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }
}
