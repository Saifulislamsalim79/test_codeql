package com.bumptech.glide.p065k;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.p065k.InterfaceC1965a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: StandardGifDecoder.java */
/* renamed from: com.bumptech.glide.k.e */
/* loaded from: classes2.dex */
public class C1970e implements InterfaceC1965a {

    /* renamed from: u */
    private static final String f6016u = "e";

    /* renamed from: a */
    private int[] f6017a;

    /* renamed from: b */
    private final int[] f6018b;

    /* renamed from: c */
    private final InterfaceC1965a.InterfaceC1966a f6019c;

    /* renamed from: d */
    private ByteBuffer f6020d;

    /* renamed from: e */
    private byte[] f6021e;

    /* renamed from: f */
    private short[] f6022f;

    /* renamed from: g */
    private byte[] f6023g;

    /* renamed from: h */
    private byte[] f6024h;

    /* renamed from: i */
    private byte[] f6025i;

    /* renamed from: j */
    private int[] f6026j;

    /* renamed from: k */
    private int f6027k;

    /* renamed from: l */
    private C1968c f6028l;

    /* renamed from: m */
    private Bitmap f6029m;

    /* renamed from: n */
    private boolean f6030n;

    /* renamed from: o */
    private int f6031o;

    /* renamed from: p */
    private int f6032p;

    /* renamed from: q */
    private int f6033q;

    /* renamed from: r */
    private int f6034r;

    /* renamed from: s */
    private Boolean f6035s;

    /* renamed from: t */
    private Bitmap.Config f6036t;

    public C1970e(InterfaceC1965a.InterfaceC1966a interfaceC1966a, C1968c c1968c, ByteBuffer byteBuffer, int i) {
        this(interfaceC1966a);
        m34014r(c1968c, byteBuffer, i);
    }

    /* renamed from: j */
    private int m34022j(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f6032p + i; i9++) {
            byte[] bArr = this.f6025i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f6017a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f6032p + i11; i12++) {
            byte[] bArr2 = this.f6025i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f6017a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: k */
    private void m34021k(C1967b c1967b) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f6026j;
        int i6 = c1967b.f5991d;
        int i7 = this.f6032p;
        int i8 = i6 / i7;
        int i9 = c1967b.f5989b / i7;
        int i10 = c1967b.f5990c / i7;
        int i11 = c1967b.f5988a / i7;
        boolean z = this.f6027k == 0;
        int i12 = this.f6032p;
        int i13 = this.f6034r;
        int i14 = this.f6033q;
        byte[] bArr = this.f6025i;
        int[] iArr2 = this.f6017a;
        Boolean bool = this.f6035s;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (c1967b.f5992e) {
                if (i17 >= i8) {
                    i = i8;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i17 + i15;
            } else {
                i = i8;
                i2 = i17;
                i17 = i16;
            }
            int i20 = i17 + i9;
            boolean z2 = i12 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i11;
                int i23 = i22 + i10;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i3 = i2;
                int i25 = i16 * i12 * c1967b.f5990c;
                if (z2) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i9;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i25 += i12;
                        i26++;
                        i9 = i27;
                    }
                } else {
                    i5 = i9;
                    int i29 = ((i23 - i22) * i12) + i25;
                    int i30 = i22;
                    while (true) {
                        i4 = i10;
                        if (i30 < i23) {
                            int m34022j = m34022j(i25, i29, c1967b.f5990c);
                            if (m34022j != 0) {
                                iArr[i30] = m34022j;
                            } else if (z && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i25 += i12;
                            i30++;
                            i10 = i4;
                        }
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i17 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i17 = i3;
        }
        Boolean bool3 = bool;
        if (this.f6035s == null) {
            this.f6035s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    /* renamed from: l */
    private void m34020l(C1967b c1967b) {
        C1967b c1967b2 = c1967b;
        int[] iArr = this.f6026j;
        int i = c1967b2.f5991d;
        int i2 = c1967b2.f5989b;
        int i3 = c1967b2.f5990c;
        int i4 = c1967b2.f5988a;
        boolean z = this.f6027k == 0;
        int i5 = this.f6034r;
        byte[] bArr = this.f6025i;
        int[] iArr2 = this.f6017a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = c1967b2.f5990c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & 255;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            c1967b2 = c1967b;
        }
        Boolean bool = this.f6035s;
        this.f6035s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f6035s == null && z && b != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    private void m34019m(C1967b c1967b) {
        int i;
        int i2;
        short s;
        C1970e c1970e = this;
        if (c1967b != null) {
            c1970e.f6020d.position(c1967b.f5997j);
        }
        if (c1967b == null) {
            C1968c c1968c = c1970e.f6028l;
            i = c1968c.f6004f;
            i2 = c1968c.f6005g;
        } else {
            i = c1967b.f5990c;
            i2 = c1967b.f5991d;
        }
        int i3 = i * i2;
        byte[] bArr = c1970e.f6025i;
        if (bArr == null || bArr.length < i3) {
            c1970e.f6025i = c1970e.f6019c.mo33457e(i3);
        }
        byte[] bArr2 = c1970e.f6025i;
        if (c1970e.f6022f == null) {
            c1970e.f6022f = new short[4096];
        }
        short[] sArr = c1970e.f6022f;
        if (c1970e.f6023g == null) {
            c1970e.f6023g = new byte[4096];
        }
        byte[] bArr3 = c1970e.f6023g;
        if (c1970e.f6024h == null) {
            c1970e.f6024h = new byte[4097];
        }
        byte[] bArr4 = c1970e.f6024h;
        int m34015q = m34015q();
        int i4 = 1 << m34015q;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = m34015q + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = c1970e.f6021e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            if (i14 == 0) {
                i14 = m34016p();
                if (i14 <= 0) {
                    c1970e.f6031o = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & 255) << i16;
            i15++;
            i14--;
            int i22 = i16 + 8;
            int i23 = i12;
            int i24 = i19;
            int i25 = i11;
            int i26 = i7;
            int i27 = i21;
            while (true) {
                if (i22 < i25) {
                    i11 = i25;
                    i12 = i23;
                    i16 = i22;
                    c1970e = this;
                    i21 = i27;
                    i7 = i26;
                    i19 = i24;
                    break;
                }
                int i28 = i6;
                int i29 = i17 & i13;
                i17 >>= i25;
                i22 -= i25;
                if (i29 == i4) {
                    i13 = i8;
                    i25 = i26;
                    i23 = i28;
                    i6 = i23;
                    i24 = -1;
                } else if (i29 == i5) {
                    i16 = i22;
                    i21 = i27;
                    i12 = i23;
                    i7 = i26;
                    i6 = i28;
                    i11 = i25;
                    i19 = i24;
                    c1970e = this;
                    break;
                } else if (i24 == -1) {
                    bArr2[i18] = bArr3[i29];
                    i18++;
                    i9++;
                    i27 = i29;
                    i24 = i27;
                    i6 = i28;
                    i22 = i22;
                } else {
                    if (i29 >= i23) {
                        bArr4[i20] = (byte) i27;
                        i20++;
                        s = i24;
                    } else {
                        s = i29;
                    }
                    while (s >= i4) {
                        bArr4[i20] = bArr3[s];
                        i20++;
                        s = sArr[s];
                    }
                    i27 = bArr3[s] & 255;
                    byte b = (byte) i27;
                    bArr2[i18] = b;
                    while (true) {
                        i18++;
                        i9++;
                        if (i20 <= 0) {
                            break;
                        }
                        i20--;
                        bArr2[i18] = bArr4[i20];
                    }
                    byte[] bArr6 = bArr4;
                    if (i23 < 4096) {
                        sArr[i23] = (short) i24;
                        bArr3[i23] = b;
                        i23++;
                        if ((i23 & i13) == 0 && i23 < 4096) {
                            i25++;
                            i13 += i23;
                        }
                    }
                    i24 = i29;
                    i6 = i28;
                    i22 = i22;
                    bArr4 = bArr6;
                }
            }
        }
        Arrays.fill(bArr2, i18, i3, (byte) 0);
    }

    /* renamed from: o */
    private Bitmap m34017o() {
        Boolean bool = this.f6035s;
        Bitmap mo33461a = this.f6019c.mo33461a(this.f6034r, this.f6033q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f6036t);
        mo33461a.setHasAlpha(true);
        return mo33461a;
    }

    /* renamed from: p */
    private int m34016p() {
        int m34015q = m34015q();
        if (m34015q <= 0) {
            return m34015q;
        }
        ByteBuffer byteBuffer = this.f6020d;
        byteBuffer.get(this.f6021e, 0, Math.min(m34015q, byteBuffer.remaining()));
        return m34015q;
    }

    /* renamed from: q */
    private int m34015q() {
        return this.f6020d.get() & 255;
    }

    /* renamed from: s */
    private Bitmap m34013s(C1967b c1967b, C1967b c1967b2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f6026j;
        int i3 = 0;
        if (c1967b2 == null) {
            Bitmap bitmap2 = this.f6029m;
            if (bitmap2 != null) {
                this.f6019c.mo33459c(bitmap2);
            }
            this.f6029m = null;
            Arrays.fill(iArr, 0);
        }
        if (c1967b2 != null && c1967b2.f5994g == 3 && this.f6029m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c1967b2 != null && (i2 = c1967b2.f5994g) > 0) {
            if (i2 == 2) {
                if (!c1967b.f5993f) {
                    C1968c c1968c = this.f6028l;
                    int i4 = c1968c.f6010l;
                    if (c1967b.f5998k == null || c1968c.f6008j != c1967b.f5995h) {
                        i3 = i4;
                    }
                }
                int i5 = c1967b2.f5991d;
                int i6 = this.f6032p;
                int i7 = i5 / i6;
                int i8 = c1967b2.f5989b / i6;
                int i9 = c1967b2.f5990c / i6;
                int i10 = c1967b2.f5988a / i6;
                int i11 = this.f6034r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f6034r;
                }
            } else if (i2 == 3 && (bitmap = this.f6029m) != null) {
                int i16 = this.f6034r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f6033q);
            }
        }
        m34019m(c1967b);
        if (!c1967b.f5992e && this.f6032p == 1) {
            m34020l(c1967b);
        } else {
            m34021k(c1967b);
        }
        if (this.f6030n && ((i = c1967b.f5994g) == 0 || i == 1)) {
            if (this.f6029m == null) {
                this.f6029m = m34017o();
            }
            Bitmap bitmap3 = this.f6029m;
            int i17 = this.f6034r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f6033q);
        }
        Bitmap m34017o = m34017o();
        int i18 = this.f6034r;
        m34017o.setPixels(iArr, 0, i18, 0, 0, i18, this.f6033q);
        return m34017o;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: a */
    public synchronized Bitmap mo34031a() {
        if (this.f6028l.f6001c <= 0 || this.f6027k < 0) {
            if (Log.isLoggable(f6016u, 3)) {
                String str = f6016u;
                Log.d(str, "Unable to decode frame, frameCount=" + this.f6028l.f6001c + ", framePointer=" + this.f6027k);
            }
            this.f6031o = 1;
        }
        if (this.f6031o != 1 && this.f6031o != 2) {
            this.f6031o = 0;
            if (this.f6021e == null) {
                this.f6021e = this.f6019c.mo33457e(255);
            }
            C1967b c1967b = this.f6028l.f6003e.get(this.f6027k);
            int i = this.f6027k - 1;
            C1967b c1967b2 = i >= 0 ? this.f6028l.f6003e.get(i) : null;
            int[] iArr = c1967b.f5998k != null ? c1967b.f5998k : this.f6028l.f5999a;
            this.f6017a = iArr;
            if (iArr == null) {
                if (Log.isLoggable(f6016u, 3)) {
                    String str2 = f6016u;
                    Log.d(str2, "No valid color table found for frame #" + this.f6027k);
                }
                this.f6031o = 1;
                return null;
            }
            if (c1967b.f5993f) {
                System.arraycopy(iArr, 0, this.f6018b, 0, iArr.length);
                int[] iArr2 = this.f6018b;
                this.f6017a = iArr2;
                iArr2[c1967b.f5995h] = 0;
                if (c1967b.f5994g == 2 && this.f6027k == 0) {
                    this.f6035s = Boolean.TRUE;
                }
            }
            return m34013s(c1967b, c1967b2);
        }
        if (Log.isLoggable(f6016u, 3)) {
            String str3 = f6016u;
            Log.d(str3, "Unable to decode frame, status=" + this.f6031o);
        }
        return null;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: b */
    public void mo34030b() {
        this.f6027k = (this.f6027k + 1) % this.f6028l.f6001c;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: c */
    public int mo34029c() {
        return this.f6028l.f6001c;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    public void clear() {
        this.f6028l = null;
        byte[] bArr = this.f6025i;
        if (bArr != null) {
            this.f6019c.mo33458d(bArr);
        }
        int[] iArr = this.f6026j;
        if (iArr != null) {
            this.f6019c.mo33456f(iArr);
        }
        Bitmap bitmap = this.f6029m;
        if (bitmap != null) {
            this.f6019c.mo33459c(bitmap);
        }
        this.f6029m = null;
        this.f6020d = null;
        this.f6035s = null;
        byte[] bArr2 = this.f6021e;
        if (bArr2 != null) {
            this.f6019c.mo33458d(bArr2);
        }
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: d */
    public int mo34028d() {
        int i;
        if (this.f6028l.f6001c <= 0 || (i = this.f6027k) < 0) {
            return 0;
        }
        return m34018n(i);
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: e */
    public void mo34027e(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f6036t = config;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: f */
    public ByteBuffer mo34026f() {
        return this.f6020d;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: g */
    public void mo34025g() {
        this.f6027k = -1;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: h */
    public int mo34024h() {
        return this.f6027k;
    }

    @Override // com.bumptech.glide.p065k.InterfaceC1965a
    /* renamed from: i */
    public int mo34023i() {
        return this.f6020d.limit() + this.f6025i.length + (this.f6026j.length * 4);
    }

    /* renamed from: n */
    public int m34018n(int i) {
        if (i >= 0) {
            C1968c c1968c = this.f6028l;
            if (i < c1968c.f6001c) {
                return c1968c.f6003e.get(i).f5996i;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public synchronized void m34014r(C1968c c1968c, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f6031o = 0;
            this.f6028l = c1968c;
            this.f6027k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f6020d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f6020d.order(ByteOrder.LITTLE_ENDIAN);
            this.f6030n = false;
            Iterator<C1967b> it = c1968c.f6003e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f5994g == 3) {
                    this.f6030n = true;
                    break;
                }
            }
            this.f6032p = highestOneBit;
            this.f6034r = c1968c.f6004f / highestOneBit;
            this.f6033q = c1968c.f6005g / highestOneBit;
            this.f6025i = this.f6019c.mo33457e(c1968c.f6004f * c1968c.f6005g);
            this.f6026j = this.f6019c.mo33460b(this.f6034r * this.f6033q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public C1970e(InterfaceC1965a.InterfaceC1966a interfaceC1966a) {
        this.f6018b = new int[256];
        this.f6036t = Bitmap.Config.ARGB_8888;
        this.f6019c = interfaceC1966a;
        this.f6028l = new C1968c();
    }
}
