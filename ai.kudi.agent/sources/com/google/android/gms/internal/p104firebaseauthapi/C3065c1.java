package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.ListIterator;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c1 */
/* loaded from: classes2.dex */
final class C3065c1 implements ListIterator<String> {

    /* renamed from: c */
    final ListIterator<String> f8292c;

    /* renamed from: d */
    final /* synthetic */ int f8293d;

    /* renamed from: e */
    final /* synthetic */ C3119e1 f8294e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3065c1(C3119e1 c3119e1, int i) {
        InterfaceC3225i interfaceC3225i;
        this.f8294e = c3119e1;
        this.f8293d = i;
        interfaceC3225i = this.f8294e.f8414c;
        this.f8292c = interfaceC3225i.listIterator(this.f8293d);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8292c.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8292c.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f8292c.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8292c.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f8292c.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8292c.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
