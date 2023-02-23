package io.intercom.com.bumptech.glide.load.p398m;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ExifOrientationStream.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.e */
/* loaded from: classes3.dex */
public final class C10638e extends FilterInputStream {

    /* renamed from: e */
    private static final byte[] f24431e;

    /* renamed from: f */
    private static final int f24432f;

    /* renamed from: w */
    private static final int f24433w;

    /* renamed from: c */
    private final byte f24434c;

    /* renamed from: d */
    private int f24435d;

    static {
        byte[] bArr = {-1, -31, 0, PrinterCommands.OTHER_SYMBOL, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f24431e = bArr;
        int length = bArr.length;
        f24432f = length;
        f24433w = length + 2;
    }

    public C10638e(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f24434c = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i;
        int i2 = this.f24435d;
        if (i2 < 2 || i2 > (i = f24433w)) {
            read = super.read();
        } else if (i2 == i) {
            read = this.f24434c;
        } else {
            read = f24431e[i2 - 2] & 255;
        }
        if (read != -1) {
            this.f24435d++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f24435d = (int) (this.f24435d + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f24435d;
        int i5 = f24433w;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f24434c;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f24431e, this.f24435d - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f24435d += i3;
        }
        return i3;
    }
}
