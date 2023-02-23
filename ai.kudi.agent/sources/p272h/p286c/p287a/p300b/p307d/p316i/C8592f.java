package p272h.p286c.p287a.p300b.p307d.p316i;

import java.io.OutputStream;
/* compiled from: com.google.mlkit:vision-common@@17.0.0 */
/* renamed from: h.c.a.b.d.i.f */
/* loaded from: classes2.dex */
final class C8592f extends OutputStream {

    /* renamed from: c */
    private long f20455c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final long m15971c() {
        return this.f20455c;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f20455c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f20455c += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f20455c += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
