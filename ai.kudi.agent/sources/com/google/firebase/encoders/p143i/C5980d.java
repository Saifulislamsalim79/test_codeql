package com.google.firebase.encoders.p143i;

import java.io.OutputStream;
/* compiled from: LengthCountingOutputStream.java */
/* renamed from: com.google.firebase.encoders.i.d */
/* loaded from: classes2.dex */
final class C5980d extends OutputStream {

    /* renamed from: c */
    private long f14634c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public long m23130c() {
        return this.f14634c;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f14634c++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f14634c += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f14634c += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
