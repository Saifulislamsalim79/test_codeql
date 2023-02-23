package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.r */
/* loaded from: classes2.dex */
final class C4343r implements Iterator<String> {

    /* renamed from: c */
    final Iterator<String> f10626c;

    /* renamed from: d */
    final /* synthetic */ C4355s f10627d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4343r(C4355s c4355s) {
        Bundle bundle;
        this.f10627d = c4355s;
        bundle = this.f10627d.f10656c;
        this.f10626c = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final String next() {
        return this.f10626c.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10626c.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
