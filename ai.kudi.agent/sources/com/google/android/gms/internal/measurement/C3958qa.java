package com.google.android.gms.internal.measurement;

import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.qa */
/* loaded from: classes2.dex */
final class C3958qa implements ListIterator<String> {

    /* renamed from: c */
    final ListIterator<String> f9631c;

    /* renamed from: d */
    final /* synthetic */ int f9632d;

    /* renamed from: e */
    final /* synthetic */ C3990sa f9633e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3958qa(C3990sa c3990sa, int i) {
        InterfaceC4068x8 interfaceC4068x8;
        this.f9633e = c3990sa;
        this.f9632d = i;
        interfaceC4068x8 = this.f9633e.f9694c;
        this.f9631c = interfaceC4068x8.listIterator(this.f9632d);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f9631c.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9631c.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f9631c.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9631c.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f9631c.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9631c.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
