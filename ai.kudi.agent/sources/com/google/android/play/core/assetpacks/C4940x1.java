package com.google.android.play.core.assetpacks;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.x1 */
/* loaded from: classes2.dex */
public final class C4940x1 {

    /* renamed from: a */
    private byte[] f12586a = new byte[4096];

    /* renamed from: b */
    private int f12587b;

    /* renamed from: c */
    private long f12588c;

    /* renamed from: d */
    private long f12589d;

    /* renamed from: e */
    private int f12590e;

    /* renamed from: f */
    private int f12591f;

    /* renamed from: g */
    private int f12592g;

    /* renamed from: h */
    private boolean f12593h;

    /* renamed from: i */
    private String f12594i;

    public C4940x1() {
        m25979e();
    }

    /* renamed from: a */
    private final int m25983a(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f12587b;
        if (i4 < i) {
            int min = Math.min(i3, i - i4);
            System.arraycopy(bArr, i2, this.f12586a, this.f12587b, min);
            int i5 = this.f12587b + min;
            this.f12587b = i5;
            if (i5 < i) {
                return -1;
            }
            return min;
        }
        return 0;
    }

    /* renamed from: b */
    public final int m25982b(byte[] bArr, int i, int i2) {
        int m25983a = m25983a(30, bArr, i, i2);
        if (m25983a != -1) {
            if (this.f12588c == -1) {
                long m25995e = C4932v1.m25995e(this.f12586a, 0);
                this.f12588c = m25995e;
                if (m25995e == 67324752) {
                    this.f12593h = false;
                    this.f12589d = C4932v1.m25995e(this.f12586a, 18);
                    this.f12592g = C4932v1.m25993g(this.f12586a, 8);
                    this.f12590e = C4932v1.m25993g(this.f12586a, 26);
                    int m25993g = this.f12590e + 30 + C4932v1.m25993g(this.f12586a, 28);
                    this.f12591f = m25993g;
                    int length = this.f12586a.length;
                    if (length < m25993g) {
                        do {
                            length += length;
                        } while (length < m25993g);
                        this.f12586a = Arrays.copyOf(this.f12586a, length);
                    }
                } else {
                    this.f12593h = true;
                }
            }
            int m25983a2 = m25983a(this.f12591f, bArr, i + m25983a, i2 - m25983a);
            if (m25983a2 == -1) {
                return -1;
            }
            int i3 = m25983a + m25983a2;
            if (!this.f12593h && this.f12594i == null) {
                this.f12594i = new String(this.f12586a, 30, this.f12590e);
            }
            return i3;
        }
        return -1;
    }

    /* renamed from: c */
    public final C4917r2 m25981c() {
        int i = this.f12587b;
        int i2 = this.f12591f;
        if (i < i2) {
            return C4917r2.m26027a(this.f12594i, this.f12589d, this.f12592g, true, Arrays.copyOf(this.f12586a, i), this.f12593h);
        }
        C4917r2 m26027a = C4917r2.m26027a(this.f12594i, this.f12589d, this.f12592g, false, Arrays.copyOf(this.f12586a, i2), this.f12593h);
        m25979e();
        return m26027a;
    }

    /* renamed from: d */
    public final int m25980d() {
        return this.f12591f;
    }

    /* renamed from: e */
    public final void m25979e() {
        this.f12587b = 0;
        this.f12590e = -1;
        this.f12588c = -1L;
        this.f12593h = false;
        this.f12591f = 30;
        this.f12589d = -1L;
        this.f12592g = -1;
        this.f12594i = null;
    }
}
