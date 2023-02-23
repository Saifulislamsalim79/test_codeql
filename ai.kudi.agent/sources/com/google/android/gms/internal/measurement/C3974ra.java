package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ra */
/* loaded from: classes2.dex */
final class C3974ra implements Iterator<String> {

    /* renamed from: c */
    final Iterator<String> f9667c;

    /* renamed from: d */
    final /* synthetic */ C3990sa f9668d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3974ra(C3990sa c3990sa) {
        InterfaceC4068x8 interfaceC4068x8;
        this.f9668d = c3990sa;
        interfaceC4068x8 = this.f9668d.f9694c;
        this.f9667c = interfaceC4068x8.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9667c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ String next() {
        return this.f9667c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
