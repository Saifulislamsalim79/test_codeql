package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.sa */
/* loaded from: classes2.dex */
public final class C3990sa extends AbstractList<String> implements RandomAccess, InterfaceC4068x8 {

    /* renamed from: c */
    private final InterfaceC4068x8 f9694c;

    public C3990sa(InterfaceC4068x8 interfaceC4068x8) {
        this.f9694c = interfaceC4068x8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4068x8
    /* renamed from: a */
    public final InterfaceC4068x8 mo28660a() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4068x8
    /* renamed from: b */
    public final List<?> mo28659b() {
        return this.f9694c.mo28659b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C4052w8) this.f9694c).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C3974ra(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C3958qa(this, i);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4068x8
    /* renamed from: n */
    public final Object mo28658n(int i) {
        return this.f9694c.mo28658n(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9694c.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4068x8
    /* renamed from: v */
    public final void mo28657v(AbstractC3909n7 abstractC3909n7) {
        throw new UnsupportedOperationException();
    }
}
