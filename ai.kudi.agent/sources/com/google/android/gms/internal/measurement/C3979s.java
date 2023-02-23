package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.s */
/* loaded from: classes2.dex */
final class C3979s implements Iterator<q> {

    /* renamed from: c */
    private int f9673c = 0;

    /* renamed from: d */
    final /* synthetic */ C4011u f9674d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3979s(C4011u c4011u) {
        this.f9674d = c4011u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f9673c;
        str = this.f9674d.f9721c;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        String str;
        int i = this.f9673c;
        str = this.f9674d.f9721c;
        if (i < str.length()) {
            int i2 = this.f9673c;
            this.f9673c = i2 + 1;
            return new C4011u(String.valueOf(i2));
        }
        throw new NoSuchElementException();
    }
}
