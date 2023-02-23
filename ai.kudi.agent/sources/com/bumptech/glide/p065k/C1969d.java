package com.bumptech.glide.p065k;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: GifHeaderParser.java */
/* renamed from: com.bumptech.glide.k.d */
/* loaded from: classes2.dex */
public class C1969d {

    /* renamed from: b */
    private ByteBuffer f6013b;

    /* renamed from: c */
    private C1968c f6014c;

    /* renamed from: a */
    private final byte[] f6012a = new byte[256];

    /* renamed from: d */
    private int f6015d = 0;

    /* renamed from: b */
    private boolean m34048b() {
        return this.f6014c.f6000b != 0;
    }

    /* renamed from: d */
    private int m34046d() {
        try {
            return this.f6013b.get() & 255;
        } catch (Exception unused) {
            this.f6014c.f6000b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m34045e() {
        this.f6014c.f6002d.f5988a = m34036n();
        this.f6014c.f6002d.f5989b = m34036n();
        this.f6014c.f6002d.f5990c = m34036n();
        this.f6014c.f6002d.f5991d = m34036n();
        int m34046d = m34046d();
        boolean z = (m34046d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (m34046d & 7) + 1);
        this.f6014c.f6002d.f5992e = (m34046d & 64) != 0;
        if (z) {
            this.f6014c.f6002d.f5998k = m34043g(pow);
        } else {
            this.f6014c.f6002d.f5998k = null;
        }
        this.f6014c.f6002d.f5997j = this.f6013b.position();
        m34032r();
        if (m34048b()) {
            return;
        }
        C1968c c1968c = this.f6014c;
        c1968c.f6001c++;
        c1968c.f6003e.add(c1968c.f6002d);
    }

    /* renamed from: f */
    private void m34044f() {
        int m34046d = m34046d();
        this.f6015d = m34046d;
        if (m34046d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f6015d) {
                try {
                    i2 = this.f6015d - i;
                    this.f6013b.get(this.f6012a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f6015d, e);
                    }
                    this.f6014c.f6000b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m34043g(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f6013b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f6014c.f6000b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m34042h() {
        m34041i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m34041i(int i) {
        boolean z = false;
        while (!z && !m34048b() && this.f6014c.f6001c <= i) {
            int m34046d = m34046d();
            if (m34046d == 33) {
                int m34046d2 = m34046d();
                if (m34046d2 == 1) {
                    m34033q();
                } else if (m34046d2 == 249) {
                    this.f6014c.f6002d = new C1967b();
                    m34040j();
                } else if (m34046d2 == 254) {
                    m34033q();
                } else if (m34046d2 != 255) {
                    m34033q();
                } else {
                    m34044f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f6012a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m34037m();
                    } else {
                        m34033q();
                    }
                }
            } else if (m34046d == 44) {
                C1968c c1968c = this.f6014c;
                if (c1968c.f6002d == null) {
                    c1968c.f6002d = new C1967b();
                }
                m34045e();
            } else if (m34046d != 59) {
                this.f6014c.f6000b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m34040j() {
        m34046d();
        int m34046d = m34046d();
        C1967b c1967b = this.f6014c.f6002d;
        int i = (m34046d & 28) >> 2;
        c1967b.f5994g = i;
        if (i == 0) {
            c1967b.f5994g = 1;
        }
        this.f6014c.f6002d.f5993f = (m34046d & 1) != 0;
        int m34036n = m34036n();
        if (m34036n < 2) {
            m34036n = 10;
        }
        C1967b c1967b2 = this.f6014c.f6002d;
        c1967b2.f5996i = m34036n * 10;
        c1967b2.f5995h = m34046d();
        m34046d();
    }

    /* renamed from: k */
    private void m34039k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m34046d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f6014c.f6000b = 1;
            return;
        }
        m34038l();
        if (!this.f6014c.f6006h || m34048b()) {
            return;
        }
        C1968c c1968c = this.f6014c;
        c1968c.f5999a = m34043g(c1968c.f6007i);
        C1968c c1968c2 = this.f6014c;
        c1968c2.f6010l = c1968c2.f5999a[c1968c2.f6008j];
    }

    /* renamed from: l */
    private void m34038l() {
        this.f6014c.f6004f = m34036n();
        this.f6014c.f6005g = m34036n();
        int m34046d = m34046d();
        this.f6014c.f6006h = (m34046d & 128) != 0;
        this.f6014c.f6007i = (int) Math.pow(2.0d, (m34046d & 7) + 1);
        this.f6014c.f6008j = m34046d();
        this.f6014c.f6009k = m34046d();
    }

    /* renamed from: m */
    private void m34037m() {
        do {
            m34044f();
            byte[] bArr = this.f6012a;
            if (bArr[0] == 1) {
                this.f6014c.f6011m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f6015d <= 0) {
                return;
            }
        } while (!m34048b());
    }

    /* renamed from: n */
    private int m34036n() {
        return this.f6013b.getShort();
    }

    /* renamed from: o */
    private void m34035o() {
        this.f6013b = null;
        Arrays.fill(this.f6012a, (byte) 0);
        this.f6014c = new C1968c();
        this.f6015d = 0;
    }

    /* renamed from: q */
    private void m34033q() {
        int m34046d;
        do {
            m34046d = m34046d();
            this.f6013b.position(Math.min(this.f6013b.position() + m34046d, this.f6013b.limit()));
        } while (m34046d > 0);
    }

    /* renamed from: r */
    private void m34032r() {
        m34046d();
        m34033q();
    }

    /* renamed from: a */
    public void m34049a() {
        this.f6013b = null;
        this.f6014c = null;
    }

    /* renamed from: c */
    public C1968c m34047c() {
        if (this.f6013b != null) {
            if (m34048b()) {
                return this.f6014c;
            }
            m34039k();
            if (!m34048b()) {
                m34042h();
                C1968c c1968c = this.f6014c;
                if (c1968c.f6001c < 0) {
                    c1968c.f6000b = 1;
                }
            }
            return this.f6014c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    /* renamed from: p */
    public C1969d m34034p(ByteBuffer byteBuffer) {
        m34035o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f6013b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f6013b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
