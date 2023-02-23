package com.google.common.collect;

import com.google.common.base.C5051n;
/* compiled from: RegularImmutableList.java */
/* renamed from: com.google.common.collect.u */
/* loaded from: classes2.dex */
class C5127u<E> extends AbstractC5074i<E> {

    /* renamed from: w */
    static final AbstractC5074i<Object> f12790w = new C5127u(new Object[0], 0);

    /* renamed from: e */
    final transient Object[] f12791e;

    /* renamed from: f */
    private final transient int f12792f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5127u(Object[] objArr, int i) {
        this.f12791e = objArr;
        this.f12792f = i;
    }

    @Override // com.google.common.collect.AbstractC5074i, com.google.common.collect.AbstractC5072h
    /* renamed from: d */
    int mo25555d(Object[] objArr, int i) {
        System.arraycopy(this.f12791e, 0, objArr, i, this.f12792f);
        return i + this.f12792f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: e */
    public Object[] mo25562e() {
        return this.f12791e;
    }

    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: f */
    int mo25561f() {
        return this.f12792f;
    }

    @Override // java.util.List
    public E get(int i) {
        C5051n.m25782l(i, this.f12792f);
        return (E) this.f12791e[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: h */
    public int mo25560h() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: k */
    public boolean mo25554k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12792f;
    }
}
