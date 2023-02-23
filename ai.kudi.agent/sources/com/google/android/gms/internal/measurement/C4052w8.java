package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.w8 */
/* loaded from: classes2.dex */
public final class C4052w8 extends AbstractC3721b7<String> implements RandomAccess, InterfaceC4068x8 {

    /* renamed from: e */
    private static final C4052w8 f9821e;

    /* renamed from: d */
    private final List<Object> f9822d;

    static {
        C4052w8 c4052w8 = new C4052w8(10);
        f9821e = c4052w8;
        c4052w8.zzb();
    }

    public C4052w8() {
        this(10);
    }

    /* renamed from: f */
    private static String m28692f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3909n7) {
            return ((AbstractC3909n7) obj).m29343J(C4004t8.f9713a);
        }
        return C4004t8.m28902h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4068x8
    /* renamed from: a */
    public final InterfaceC4068x8 mo28660a() {
        return mo28973c() ? new C3990sa(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m29798d();
        this.f9822d.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        m29798d();
        if (collection instanceof InterfaceC4068x8) {
            collection = ((InterfaceC4068x8) collection).mo28659b();
        }
        boolean addAll = this.f9822d.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4068x8
    /* renamed from: b */
    public final List<?> mo28659b() {
        return Collections.unmodifiableList(this.f9822d);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m29798d();
        this.f9822d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i) {
        Object obj = this.f9822d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3909n7) {
            AbstractC3909n7 abstractC3909n7 = (AbstractC3909n7) obj;
            String m29343J = abstractC3909n7.m29343J(C4004t8.f9713a);
            if (abstractC3909n7.mo29335s()) {
                this.f9822d.set(i, m29343J);
            }
            return m29343J;
        }
        byte[] bArr = (byte[]) obj;
        String m28902h = C4004t8.m28902h(bArr);
        if (C4004t8.m28901i(bArr)) {
            this.f9822d.set(i, m28902h);
        }
        return m28902h;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3988s8
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC3988s8 mo28653i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f9822d);
            return new C4052w8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4068x8
    /* renamed from: n */
    public final Object mo28658n(int i) {
        return this.f9822d.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m29798d();
        Object remove = this.f9822d.remove(i);
        ((AbstractList) this).modCount++;
        return m28692f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m29798d();
        return m28692f(this.f9822d.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9822d.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4068x8
    /* renamed from: v */
    public final void mo28657v(AbstractC3909n7 abstractC3909n7) {
        m29798d();
        this.f9822d.add(abstractC3909n7);
        ((AbstractList) this).modCount++;
    }

    public C4052w8(int i) {
        this.f9822d = new ArrayList(i);
    }

    private C4052w8(ArrayList<Object> arrayList) {
        this.f9822d = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3721b7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
