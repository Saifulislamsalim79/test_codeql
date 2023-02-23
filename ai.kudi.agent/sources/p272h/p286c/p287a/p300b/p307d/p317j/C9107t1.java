package p272h.p286c.p287a.p300b.p307d.p317j;

import java.io.OutputStream;
/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.0.0 */
/* renamed from: h.c.a.b.d.j.t1 */
/* loaded from: classes2.dex */
final class C9107t1 extends OutputStream {

    /* renamed from: c */
    private long f21487c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final long m15543c() {
        return this.f21487c;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f21487c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f21487c += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
            this.f21487c += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
