package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.h7 */
/* loaded from: classes2.dex */
final class C3814h7 extends AbstractC3830i7 {

    /* renamed from: c */
    private int f9382c = 0;

    /* renamed from: d */
    private final int f9383d;

    /* renamed from: e */
    final /* synthetic */ AbstractC3909n7 f9384e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3814h7(AbstractC3909n7 abstractC3909n7) {
        this.f9384e = abstractC3909n7;
        this.f9383d = this.f9384e.mo29340f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9382c < this.f9383d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3862k7
    public final byte zza() {
        int i = this.f9382c;
        if (i < this.f9383d) {
            this.f9382c = i + 1;
            return this.f9384e.mo29341e(i);
        }
        throw new NoSuchElementException();
    }
}
