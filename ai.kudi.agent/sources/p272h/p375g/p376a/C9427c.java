package p272h.p375g.p376a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.BitSet;
/* compiled from: IsoMessage.java */
/* renamed from: h.g.a.c */
/* loaded from: classes2.dex */
public class C9427c {

    /* renamed from: i */
    static final byte[] f22059i = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: a */
    private int f22060a;

    /* renamed from: b */
    private boolean f22061b;

    /* renamed from: c */
    private C9429e[] f22062c;

    /* renamed from: d */
    private String f22063d;

    /* renamed from: e */
    private boolean f22064e;

    /* renamed from: f */
    private boolean f22065f;

    /* renamed from: g */
    private boolean f22066g;

    /* renamed from: h */
    private String f22067h;

    public C9427c() {
        this.f22062c = new C9429e[129];
        this.f22067h = System.getProperty("file.encoding");
    }

    /* renamed from: a */
    protected BitSet m14781a() {
        BitSet bitSet = new BitSet(this.f22064e ? 128 : 64);
        for (int i = 2; i < 129; i++) {
            if (this.f22062c[i] != null) {
                bitSet.set(i - 1);
            }
        }
        if (this.f22064e) {
            bitSet.set(0);
            return bitSet;
        } else if (bitSet.length() > 64) {
            BitSet bitSet2 = new BitSet(128);
            bitSet2.or(bitSet);
            bitSet2.set(0);
            return bitSet2;
        } else {
            return bitSet;
        }
    }

    /* renamed from: b */
    public <T> C9429e<T> m14780b(int i) {
        return this.f22062c[i];
    }

    /* renamed from: c */
    public <T> T m14779c(int i) {
        C9429e c9429e = this.f22062c[i];
        if (c9429e == null) {
            return null;
        }
        return (T) c9429e.m14759e();
    }

    /* renamed from: d */
    public int m14778d() {
        return this.f22060a;
    }

    /* renamed from: e */
    public boolean m14777e(int i) {
        return this.f22062c[i] != null;
    }

    /* renamed from: f */
    public void m14776f(boolean z) {
        this.f22061b = z;
    }

    /* renamed from: g */
    public void m14775g(boolean z) {
        this.f22065f = z;
    }

    /* renamed from: h */
    public void m14774h(String str) {
        if (str != null) {
            this.f22067h = str;
            return;
        }
        throw new IllegalArgumentException("Cannot set null encoding.");
    }

    /* renamed from: i */
    public C9427c m14773i(int i, C9429e<?> c9429e) {
        if (i >= 2 && i <= 128) {
            if (c9429e != null) {
                c9429e.m14758f(this.f22067h);
            }
            this.f22062c[i] = c9429e;
            return this;
        }
        throw new IndexOutOfBoundsException("Field index must be between 2 and 128");
    }

    /* renamed from: j */
    public void m14772j(int i) {
        this.f22060a = i;
    }

    /* renamed from: k */
    public <T> C9427c m14771k(int i, T t, InterfaceC9426b<T> interfaceC9426b, EnumC9428d enumC9428d, int i2) {
        C9429e c9429e;
        if (i < 2 || i > 128) {
            throw new IndexOutOfBoundsException("Field index must be between 2 and 128");
        }
        if (t == null) {
            this.f22062c[i] = null;
        } else {
            if (enumC9428d.m14764i()) {
                c9429e = new C9429e(enumC9428d, t, i2, interfaceC9426b);
            } else {
                c9429e = new C9429e(enumC9428d, t, interfaceC9426b);
            }
            c9429e.m14758f(this.f22067h);
            this.f22062c[i] = c9429e;
        }
        return this;
    }

    /* renamed from: l */
    public byte[] m14770l() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = this.f22063d;
        if (str != null) {
            try {
                byteArrayOutputStream.write(str.getBytes(this.f22067h));
            } catch (IOException unused) {
            }
        }
        if (this.f22061b) {
            byteArrayOutputStream.write((this.f22060a & 65280) >> 8);
            byteArrayOutputStream.write(this.f22060a & 255);
        } else {
            try {
                byteArrayOutputStream.write(String.format("%04x", Integer.valueOf(this.f22060a)).getBytes(this.f22067h));
            } catch (IOException unused2) {
            }
        }
        BitSet m14781a = m14781a();
        if (!this.f22061b && !this.f22065f) {
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            if (this.f22066g) {
                byteArrayOutputStream2 = byteArrayOutputStream;
                byteArrayOutputStream = new ByteArrayOutputStream();
            }
            int size = m14781a.size() / 4;
            int i = 0;
            int i2 = 0;
            while (i < size) {
                int i3 = i2 + 1;
                int i4 = m14781a.get(i2) ? 8 : 0;
                int i5 = i3 + 1;
                if (m14781a.get(i3)) {
                    i4 |= 4;
                }
                int i6 = i5 + 1;
                if (m14781a.get(i5)) {
                    i4 |= 2;
                }
                int i7 = i6 + 1;
                if (m14781a.get(i6)) {
                    i4 |= 1;
                }
                byteArrayOutputStream.write(f22059i[i4]);
                i++;
                i2 = i7;
            }
            if (this.f22066g) {
                try {
                    byteArrayOutputStream2.write(new String(byteArrayOutputStream.toByteArray()).getBytes(this.f22067h));
                } catch (IOException unused3) {
                }
                byteArrayOutputStream = byteArrayOutputStream2;
            }
        } else {
            int i8 = 0;
            int i9 = 128;
            for (int i10 = 0; i10 < m14781a.size(); i10++) {
                if (m14781a.get(i10)) {
                    i8 |= i9;
                }
                i9 >>= 1;
                if (i9 == 0) {
                    byteArrayOutputStream.write(i8);
                    i8 = 0;
                    i9 = 128;
                }
            }
        }
        for (int i11 = 2; i11 < 129; i11++) {
            C9429e c9429e = this.f22062c[i11];
            if (c9429e != null) {
                try {
                    c9429e.m14757g(byteArrayOutputStream, this.f22061b, this.f22066g);
                } catch (IOException unused4) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C9427c(String str) {
        this.f22062c = new C9429e[129];
        this.f22067h = System.getProperty("file.encoding");
        this.f22063d = str;
    }
}
