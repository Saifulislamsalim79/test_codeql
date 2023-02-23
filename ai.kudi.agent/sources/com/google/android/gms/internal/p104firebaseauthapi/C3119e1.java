package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e1 */
/* loaded from: classes2.dex */
public final class C3119e1 extends AbstractList<String> implements RandomAccess, InterfaceC3225i {

    /* renamed from: c */
    private final InterfaceC3225i f8414c;

    public C3119e1(InterfaceC3225i interfaceC3225i) {
        this.f8414c = interfaceC3225i;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3225i
    /* renamed from: a */
    public final InterfaceC3225i mo31007a() {
        return this;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3225i
    /* renamed from: b */
    public final List<?> mo31006b() {
        return this.f8414c.mo31006b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C3198h) this.f8414c).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C3092d1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C3065c1(this, i);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3225i
    /* renamed from: n */
    public final Object mo31005n(int i) {
        return this.f8414c.mo31005n(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8414c.size();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3225i
    /* renamed from: w */
    public final void mo31004w(AbstractC3223ho abstractC3223ho) {
        throw new UnsupportedOperationException();
    }
}
