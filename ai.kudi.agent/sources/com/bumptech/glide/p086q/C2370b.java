package com.bumptech.glide.p086q;

import p201g.p218e.C7521a;
import p201g.p218e.C7534g;
/* compiled from: CachedHashCodeArrayMap.java */
/* renamed from: com.bumptech.glide.q.b */
/* loaded from: classes2.dex */
public final class C2370b<K, V> extends C7521a<K, V> {

    /* renamed from: A */
    private int f6858A;

    @Override // p201g.p218e.C7534g, java.util.Map
    public void clear() {
        this.f6858A = 0;
        super.clear();
    }

    @Override // p201g.p218e.C7534g, java.util.Map
    public int hashCode() {
        if (this.f6858A == 0) {
            this.f6858A = super.hashCode();
        }
        return this.f6858A;
    }

    @Override // p201g.p218e.C7534g
    /* renamed from: l */
    public void mo18451l(C7534g<? extends K, ? extends V> c7534g) {
        this.f6858A = 0;
        super.mo18451l(c7534g);
    }

    @Override // p201g.p218e.C7534g
    /* renamed from: m */
    public V mo18450m(int i) {
        this.f6858A = 0;
        return (V) super.mo18450m(i);
    }

    @Override // p201g.p218e.C7534g
    /* renamed from: n */
    public V mo18449n(int i, V v) {
        this.f6858A = 0;
        return (V) super.mo18449n(i, v);
    }

    @Override // p201g.p218e.C7534g, java.util.Map
    public V put(K k, V v) {
        this.f6858A = 0;
        return (V) super.put(k, v);
    }
}
