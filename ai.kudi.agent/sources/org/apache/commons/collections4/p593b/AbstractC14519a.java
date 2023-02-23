package org.apache.commons.collections4.p593b;
/* compiled from: AbstractKeyValue.java */
/* renamed from: org.apache.commons.collections4.b.a */
/* loaded from: classes3.dex */
public abstract class AbstractC14519a<K, V> {

    /* renamed from: c */
    private K f32068c;

    /* renamed from: d */
    private V f32069d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC14519a(K k, V v) {
        this.f32068c = k;
        this.f32069d = v;
    }

    public K getKey() {
        return this.f32068c;
    }

    public abstract V getValue();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
