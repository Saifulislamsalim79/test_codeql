package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
/* renamed from: com.google.android.play.core.assetpacks.k0 */
/* loaded from: classes2.dex */
final class C4885k0 extends FilterInputStream {

    /* renamed from: c */
    private final C4940x1 f12377c;

    /* renamed from: d */
    private byte[] f12378d;

    /* renamed from: e */
    private long f12379e;

    /* renamed from: f */
    private boolean f12380f;

    /* renamed from: w */
    private boolean f12381w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4885k0(InputStream inputStream) {
        super(inputStream);
        this.f12377c = new C4940x1();
        this.f12378d = new byte[4096];
        this.f12380f = false;
        this.f12381w = false;
    }

    /* renamed from: c */
    private final int m26104c(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* renamed from: m */
    private final boolean m26102m(int i) throws IOException {
        int m26104c = m26104c(this.f12378d, 0, i);
        if (m26104c != i) {
            int i2 = i - m26104c;
            if (m26104c(this.f12378d, m26104c, i2) != i2) {
                this.f12377c.m25982b(this.f12378d, 0, m26104c);
                return false;
            }
        }
        this.f12377c.m25982b(this.f12378d, 0, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean m26107F() {
        return this.f12380f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean m26106I() {
        return this.f12381w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final long m26105J() {
        return this.f12379e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final C4917r2 m26103g() throws IOException {
        byte[] bArr;
        if (this.f12379e <= 0) {
            if (this.f12380f) {
            }
            return new C4917r2(null, -1L, -1, false, false, null);
        }
        do {
            bArr = this.f12378d;
        } while (read(bArr, 0, bArr.length) != -1);
        if (!this.f12380f || this.f12381w) {
            return new C4917r2(null, -1L, -1, false, false, null);
        }
        if (!m26102m(30)) {
            this.f12380f = true;
            return this.f12377c.m25981c();
        }
        C4917r2 m25981c = this.f12377c.m25981c();
        if (m25981c.m26020h()) {
            this.f12381w = true;
            return m25981c;
        } else if (m25981c.m26023e() != 4294967295L) {
            int m25980d = this.f12377c.m25980d() - 30;
            long j = m25980d;
            int length = this.f12378d.length;
            if (j > length) {
                do {
                    length += length;
                } while (length < j);
                this.f12378d = Arrays.copyOf(this.f12378d, length);
            }
            if (!m26102m(m25980d)) {
                this.f12380f = true;
                return this.f12377c.m25981c();
            }
            C4917r2 m25981c2 = this.f12377c.m25981c();
            this.f12379e = m25981c2.m26023e();
            return m25981c2;
        } else {
            throw new C4923t0("Files bigger than 4GiB are not supported.");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f12379e;
        if (j <= 0 || this.f12380f) {
            return -1;
        }
        int m26104c = m26104c(bArr, i, (int) Math.min(j, i2));
        this.f12379e -= m26104c;
        if (m26104c == 0) {
            this.f12380f = true;
            return 0;
        }
        return m26104c;
    }
}
