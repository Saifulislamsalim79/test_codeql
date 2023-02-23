package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
/* renamed from: com.google.android.play.core.assetpacks.w1 */
/* loaded from: classes2.dex */
public final class C4936w1 extends InputStream {

    /* renamed from: c */
    private final Enumeration<File> f12574c;

    /* renamed from: d */
    private InputStream f12575d;

    public C4936w1(Enumeration<File> enumeration) throws IOException {
        this.f12574c = enumeration;
        m25987c();
    }

    /* renamed from: c */
    final void m25987c() throws IOException {
        InputStream inputStream = this.f12575d;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f12575d = this.f12574c.hasMoreElements() ? new FileInputStream(this.f12574c.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f12575d;
        if (inputStream != null) {
            inputStream.close();
            this.f12575d = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f12575d;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m25987c();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f12575d == null) {
            return -1;
        }
        if (bArr != null) {
            if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 != 0) {
                do {
                    int read = this.f12575d.read(bArr, i, i2);
                    if (read > 0) {
                        return read;
                    }
                    m25987c();
                } while (this.f12575d != null);
                return -1;
            }
            return 0;
        }
        throw null;
    }
}
