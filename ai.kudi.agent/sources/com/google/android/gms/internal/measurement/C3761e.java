package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes2.dex */
final class C3761e implements Iterator<q> {

    /* renamed from: c */
    private int f9267c = 0;

    /* renamed from: d */
    final /* synthetic */ f f9268d;

    C3761e(f fVar) {
        this.f9268d = fVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9267c < this.f9268d.E();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        if (this.f9267c < this.f9268d.E()) {
            f fVar = this.f9268d;
            int i = this.f9267c;
            this.f9267c = i + 1;
            return fVar.F(i);
        }
        int i2 = this.f9267c;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }
}
