package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.google.android.play.core.assetpacks.d0 */
/* loaded from: classes2.dex */
final class C4850d0 extends InputStream {

    /* renamed from: c */
    private final InputStream f12273c;

    /* renamed from: d */
    private long f12274d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4850d0(InputStream inputStream, long j) {
        this.f12273c = inputStream;
        this.f12274d = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f12273c.close();
        this.f12274d = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.f12274d;
        if (j <= 0) {
            return -1;
        }
        this.f12274d = j - 1;
        return this.f12273c.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f12274d;
        if (j <= 0) {
            return -1;
        }
        int read = this.f12273c.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.f12274d -= read;
        }
        return read;
    }
}
