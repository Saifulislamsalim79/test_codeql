package com.google.common.collect;
/* compiled from: RegularImmutableSet.java */
/* renamed from: com.google.common.collect.w */
/* loaded from: classes2.dex */
final class C5133w<E> extends AbstractC5079k<E> {

    /* renamed from: z */
    static final C5133w<Object> f12807z = new C5133w<>(new Object[0], 0, null, 0, 0);

    /* renamed from: e */
    final transient Object[] f12808e;

    /* renamed from: f */
    final transient Object[] f12809f;

    /* renamed from: w */
    private final transient int f12810w;

    /* renamed from: x */
    private final transient int f12811x;

    /* renamed from: y */
    private final transient int f12812y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5133w(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f12808e = objArr;
        this.f12809f = objArr2;
        this.f12810w = i2;
        this.f12811x = i;
        this.f12812y = i3;
    }

    @Override // com.google.common.collect.AbstractC5079k
    /* renamed from: F */
    AbstractC5074i<E> mo25557F() {
        return AbstractC5074i.m25733s(this.f12808e, this.f12812y);
    }

    @Override // com.google.common.collect.AbstractC5079k
    /* renamed from: I */
    boolean mo25556I() {
        return true;
    }

    @Override // com.google.common.collect.AbstractC5072h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f12809f;
        if (obj == null || objArr == null) {
            return false;
        }
        int m25741b = C5071g.m25741b(obj);
        while (true) {
            int i = m25741b & this.f12810w;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m25741b = i + 1;
        }
    }

    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: d */
    int mo25555d(Object[] objArr, int i) {
        System.arraycopy(this.f12808e, 0, objArr, i, this.f12812y);
        return i + this.f12812y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: e */
    public Object[] mo25562e() {
        return this.f12808e;
    }

    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: f */
    int mo25561f() {
        return this.f12812y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5072h
    /* renamed from: h */
    public int mo25560h() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC5079k, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f12811x;
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
        return mo25563m().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f12812y;
    }
}
