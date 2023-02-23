package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.t */
/* loaded from: classes2.dex */
final class C3995t implements Iterator<q> {

    /* renamed from: c */
    private int f9702c = 0;

    /* renamed from: d */
    final /* synthetic */ C4011u f9703d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3995t(C4011u c4011u) {
        this.f9703d = c4011u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.f9702c;
        str = this.f9703d.f9721c;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ q next() {
        String str;
        String str2;
        int i = this.f9702c;
        str = this.f9703d.f9721c;
        if (i < str.length()) {
            str2 = this.f9703d.f9721c;
            int i2 = this.f9702c;
            this.f9702c = i2 + 1;
            return new C4011u(String.valueOf(str2.charAt(i2)));
        }
        throw new NoSuchElementException();
    }
}
