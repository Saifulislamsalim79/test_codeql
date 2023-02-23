package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.l */
/* loaded from: classes2.dex */
public final class C3870l implements Iterator<q> {

    /* renamed from: c */
    final /* synthetic */ Iterator f9457c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3870l(Iterator it) {
        this.f9457c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9457c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        return new C4011u((String) this.f9457c.next());
    }
}
