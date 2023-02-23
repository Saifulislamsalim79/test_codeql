package io.intercom.com.bumptech.glide.p393l;

import android.graphics.Bitmap;
import android.util.Log;
import io.intercom.com.bumptech.glide.p393l.InterfaceC10501a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
/* compiled from: StandardGifDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.l.e */
/* loaded from: classes3.dex */
public class C10506e implements InterfaceC10501a {

    /* renamed from: u */
    private static final String f24071u = "e";

    /* renamed from: a */
    private int[] f24072a;

    /* renamed from: b */
    private final int[] f24073b;

    /* renamed from: c */
    private final InterfaceC10501a.InterfaceC10502a f24074c;

    /* renamed from: d */
    private ByteBuffer f24075d;

    /* renamed from: e */
    private byte[] f24076e;

    /* renamed from: f */
    private short[] f24077f;

    /* renamed from: g */
    private byte[] f24078g;

    /* renamed from: h */
    private byte[] f24079h;

    /* renamed from: i */
    private byte[] f24080i;

    /* renamed from: j */
    private int[] f24081j;

    /* renamed from: k */
    private int f24082k;

    /* renamed from: l */
    private C10504c f24083l;

    /* renamed from: m */
    private Bitmap f24084m;

    /* renamed from: n */
    private boolean f24085n;

    /* renamed from: o */
    private int f24086o;

    /* renamed from: p */
    private int f24087p;

    /* renamed from: q */
    private int f24088q;

    /* renamed from: r */
    private int f24089r;

    /* renamed from: s */
    private Boolean f24090s;

    /* renamed from: t */
    private Bitmap.Config f24091t;

    public C10506e(InterfaceC10501a.InterfaceC10502a interfaceC10502a, C10504c c10504c, ByteBuffer byteBuffer, int i) {
        this(interfaceC10502a);
        m12875r(c10504c, byteBuffer, i);
    }

    /* renamed from: j */
    private int m12883j(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f24087p + i; i9++) {
            byte[] bArr = this.f24080i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f24072a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f24087p + i11; i12++) {
            byte[] bArr2 = this.f24080i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f24072a[bArr2[i12] & 255];
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
    private void m12882k(C10503b c10503b) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f24081j;
        int i6 = c10503b.f24046d;
        int i7 = this.f24087p;
        int i8 = i6 / i7;
        int i9 = c10503b.f24044b / i7;
        int i10 = c10503b.f24045c / i7;
        int i11 = c10503b.f24043a / i7;
        boolean z = this.f24082k == 0;
        int i12 = this.f24087p;
        int i13 = this.f24089r;
        int i14 = this.f24088q;
        byte[] bArr = this.f24080i;
        int[] iArr2 = this.f24072a;
        Boolean bool = this.f24090s;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (c10503b.f24047e) {
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
                int i25 = i16 * i12 * c10503b.f24045c;
                if (z2) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i9;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (bool2 == null && z && !bool2.booleanValue()) {
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
                            int m12883j = m12883j(i25, i29, c10503b.f24045c);
                            if (m12883j != 0) {
                                iArr[i30] = m12883j;
                            } else if (z && !bool2.booleanValue()) {
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
        if (this.f24090s == null) {
            this.f24090s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    /* renamed from: l */
    private void m12881l(C10503b c10503b) {
        C10503b c10503b2 = c10503b;
        int[] iArr = this.f24081j;
        int i = c10503b2.f24046d;
        int i2 = c10503b2.f24044b;
        int i3 = c10503b2.f24045c;
        int i4 = c10503b2.f24043a;
        boolean z = this.f24082k == 0;
        int i5 = this.f24089r;
        byte[] bArr = this.f24080i;
        int[] iArr2 = this.f24072a;
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
            int i11 = c10503b2.f24045c * i6;
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
            c10503b2 = c10503b;
        }
        this.f24090s = Boolean.valueOf(this.f24090s == null && z && b != -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    private void m12880m(C10503b c10503b) {
        int i;
        int i2;
        short s;
        C10506e c10506e = this;
        if (c10503b != null) {
            c10506e.f24075d.position(c10503b.f24052j);
        }
        if (c10503b == null) {
            C10504c c10504c = c10506e.f24083l;
            i = c10504c.f24059f;
            i2 = c10504c.f24060g;
        } else {
            i = c10503b.f24045c;
            i2 = c10503b.f24046d;
        }
        int i3 = i * i2;
        byte[] bArr = c10506e.f24080i;
        if (bArr == null || bArr.length < i3) {
            c10506e.f24080i = c10506e.f24074c.mo12322e(i3);
        }
        byte[] bArr2 = c10506e.f24080i;
        if (c10506e.f24077f == null) {
            c10506e.f24077f = new short[4096];
        }
        short[] sArr = c10506e.f24077f;
        if (c10506e.f24078g == null) {
            c10506e.f24078g = new byte[4096];
        }
        byte[] bArr3 = c10506e.f24078g;
        if (c10506e.f24079h == null) {
            c10506e.f24079h = new byte[4097];
        }
        byte[] bArr4 = c10506e.f24079h;
        int m12876q = m12876q();
        int i4 = 1 << m12876q;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = m12876q + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = c10506e.f24076e;
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
                i14 = m12877p();
                if (i14 <= 0) {
                    c10506e.f24086o = 3;
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
                    c10506e = this;
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
                    c10506e = this;
                    break;
                } else if (i24 == -1) {
                    bArr4[i20] = bArr3[i29];
                    i20++;
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
    private Bitmap m12878o() {
        Boolean bool = this.f24090s;
        Bitmap mo12326a = this.f24074c.mo12326a(this.f24089r, this.f24088q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f24091t);
        mo12326a.setHasAlpha(true);
        return mo12326a;
    }

    /* renamed from: p */
    private int m12877p() {
        int m12876q = m12876q();
        if (m12876q <= 0) {
            return m12876q;
        }
        ByteBuffer byteBuffer = this.f24075d;
        byteBuffer.get(this.f24076e, 0, Math.min(m12876q, byteBuffer.remaining()));
        return m12876q;
    }

    /* renamed from: q */
    private int m12876q() {
        return this.f24075d.get() & 255;
    }

    /* renamed from: s */
    private Bitmap m12874s(C10503b c10503b, C10503b c10503b2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f24081j;
        int i3 = 0;
        if (c10503b2 == null) {
            Bitmap bitmap2 = this.f24084m;
            if (bitmap2 != null) {
                this.f24074c.mo12324c(bitmap2);
            }
            this.f24084m = null;
            Arrays.fill(iArr, 0);
        }
        if (c10503b2 != null && c10503b2.f24049g == 3 && this.f24084m == null) {
            Arrays.fill(iArr, 0);
        }
        if (c10503b2 != null && (i2 = c10503b2.f24049g) > 0) {
            if (i2 == 2) {
                if (!c10503b.f24048f) {
                    C10504c c10504c = this.f24083l;
                    int i4 = c10504c.f24065l;
                    if (c10503b.f24053k == null || c10504c.f24063j != c10503b.f24050h) {
                        i3 = i4;
                    }
                } else if (this.f24082k == 0) {
                    this.f24090s = Boolean.TRUE;
                }
                int i5 = c10503b2.f24046d;
                int i6 = this.f24087p;
                int i7 = i5 / i6;
                int i8 = c10503b2.f24044b / i6;
                int i9 = c10503b2.f24045c / i6;
                int i10 = c10503b2.f24043a / i6;
                int i11 = this.f24089r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f24089r;
                }
            } else if (i2 == 3 && (bitmap = this.f24084m) != null) {
                int i16 = this.f24089r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f24088q);
            }
        }
        m12880m(c10503b);
        if (!c10503b.f24047e && this.f24087p == 1) {
            m12881l(c10503b);
        } else {
            m12882k(c10503b);
        }
        if (this.f24085n && ((i = c10503b.f24049g) == 0 || i == 1)) {
            if (this.f24084m == null) {
                this.f24084m = m12878o();
            }
            Bitmap bitmap3 = this.f24084m;
            int i17 = this.f24089r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f24088q);
        }
        Bitmap m12878o = m12878o();
        int i18 = this.f24089r;
        m12878o.setPixels(iArr, 0, i18, 0, 0, i18, this.f24088q);
        return m12878o;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: a */
    public synchronized Bitmap mo12892a() {
        if (this.f24083l.f24056c <= 0 || this.f24082k < 0) {
            if (Log.isLoggable(f24071u, 3)) {
                String str = f24071u;
                Log.d(str, "Unable to decode frame, frameCount=" + this.f24083l.f24056c + ", framePointer=" + this.f24082k);
            }
            this.f24086o = 1;
        }
        if (this.f24086o != 1 && this.f24086o != 2) {
            this.f24086o = 0;
            if (this.f24076e == null) {
                this.f24076e = this.f24074c.mo12322e(255);
            }
            C10503b c10503b = this.f24083l.f24058e.get(this.f24082k);
            int i = this.f24082k - 1;
            C10503b c10503b2 = i >= 0 ? this.f24083l.f24058e.get(i) : null;
            int[] iArr = c10503b.f24053k != null ? c10503b.f24053k : this.f24083l.f24054a;
            this.f24072a = iArr;
            if (iArr == null) {
                if (Log.isLoggable(f24071u, 3)) {
                    String str2 = f24071u;
                    Log.d(str2, "No valid color table found for frame #" + this.f24082k);
                }
                this.f24086o = 1;
                return null;
            }
            if (c10503b.f24048f) {
                System.arraycopy(iArr, 0, this.f24073b, 0, iArr.length);
                int[] iArr2 = this.f24073b;
                this.f24072a = iArr2;
                iArr2[c10503b.f24050h] = 0;
            }
            return m12874s(c10503b, c10503b2);
        }
        if (Log.isLoggable(f24071u, 3)) {
            String str3 = f24071u;
            Log.d(str3, "Unable to decode frame, status=" + this.f24086o);
        }
        return null;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: b */
    public void mo12891b() {
        this.f24082k = (this.f24082k + 1) % this.f24083l.f24056c;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: c */
    public int mo12890c() {
        return this.f24083l.f24056c;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    public void clear() {
        this.f24083l = null;
        byte[] bArr = this.f24080i;
        if (bArr != null) {
            this.f24074c.mo12323d(bArr);
        }
        int[] iArr = this.f24081j;
        if (iArr != null) {
            this.f24074c.mo12321f(iArr);
        }
        Bitmap bitmap = this.f24084m;
        if (bitmap != null) {
            this.f24074c.mo12324c(bitmap);
        }
        this.f24084m = null;
        this.f24075d = null;
        this.f24090s = null;
        byte[] bArr2 = this.f24076e;
        if (bArr2 != null) {
            this.f24074c.mo12323d(bArr2);
        }
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: d */
    public int mo12889d() {
        int i;
        if (this.f24083l.f24056c <= 0 || (i = this.f24082k) < 0) {
            return 0;
        }
        return m12879n(i);
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: e */
    public void mo12888e(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f24091t = config;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: f */
    public ByteBuffer mo12887f() {
        return this.f24075d;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: g */
    public void mo12886g() {
        this.f24082k = -1;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: h */
    public int mo12885h() {
        return this.f24082k;
    }

    @Override // io.intercom.com.bumptech.glide.p393l.InterfaceC10501a
    /* renamed from: i */
    public int mo12884i() {
        return this.f24075d.limit() + this.f24080i.length + (this.f24081j.length * 4);
    }

    /* renamed from: n */
    public int m12879n(int i) {
        if (i >= 0) {
            C10504c c10504c = this.f24083l;
            if (i < c10504c.f24056c) {
                return c10504c.f24058e.get(i).f24051i;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public synchronized void m12875r(C10504c c10504c, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f24086o = 0;
            this.f24083l = c10504c;
            this.f24082k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f24075d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f24075d.order(ByteOrder.LITTLE_ENDIAN);
            this.f24085n = false;
            Iterator<C10503b> it = c10504c.f24058e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f24049g == 3) {
                    this.f24085n = true;
                    break;
                }
            }
            this.f24087p = highestOneBit;
            this.f24089r = c10504c.f24059f / highestOneBit;
            this.f24088q = c10504c.f24060g / highestOneBit;
            this.f24080i = this.f24074c.mo12322e(c10504c.f24059f * c10504c.f24060g);
            this.f24081j = this.f24074c.mo12325b(this.f24089r * this.f24088q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    public C10506e(InterfaceC10501a.InterfaceC10502a interfaceC10502a) {
        this.f24073b = new int[256];
        this.f24091t = Bitmap.Config.ARGB_8888;
        this.f24074c = interfaceC10502a;
        this.f24083l = new C10504c();
    }
}
