package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.d */
/* loaded from: classes2.dex */
final class C3745d implements Iterator<q> {

    /* renamed from: c */
    final /* synthetic */ Iterator f9232c;

    /* renamed from: d */
    final /* synthetic */ Iterator f9233d;

    C3745d(f fVar, Iterator it, Iterator it2) {
        this.f9232c = it;
        this.f9233d = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9232c.hasNext()) {
            return true;
        }
        return this.f9233d.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        if (this.f9232c.hasNext()) {
            return new C4011u(((Integer) this.f9232c.next()).toString());
        }
        if (this.f9233d.hasNext()) {
            return new C4011u((String) this.f9233d.next());
        }
        throw new NoSuchElementException();
    }
}
