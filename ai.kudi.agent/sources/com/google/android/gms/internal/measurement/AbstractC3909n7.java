package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.n7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3909n7 implements Iterable<Byte>, Serializable {

    /* renamed from: d */
    public static final AbstractC3909n7 f9575d = new C3893m7(C4004t8.f9714b);

    /* renamed from: c */
    private int f9576c = 0;

    static {
        int i = C3737c7.f9222a;
    }

    /* renamed from: F */
    public static AbstractC3909n7 m29345F(byte[] bArr, int i, int i2) {
        m29334u(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C3893m7(bArr2);
    }

    /* renamed from: I */
    public static AbstractC3909n7 m29344I(String str) {
        return new C3893m7(str.getBytes(C4004t8.f9713a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public static int m29334u(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final int m29346E() {
        return this.f9576c;
    }

    /* renamed from: J */
    public final String m29343J(Charset charset) {
        return mo29340f() == 0 ? "" : mo29337l(charset);
    }

    /* renamed from: d */
    public abstract byte mo29342d(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract byte mo29341e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo29340f();

    /* renamed from: h */
    protected abstract int mo29339h(int i, int i2, int i3);

    public final int hashCode() {
        int i = this.f9576c;
        if (i == 0) {
            int mo29340f = mo29340f();
            i = mo29339h(mo29340f, 0, mo29340f);
            if (i == 0) {
                i = 1;
            }
            this.f9576c = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new C3814h7(this);
    }

    /* renamed from: k */
    public abstract AbstractC3909n7 mo29338k(int i, int i2);

    /* renamed from: l */
    protected abstract String mo29337l(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract void mo29336m(C3798g7 c3798g7) throws IOException;

    /* renamed from: s */
    public abstract boolean mo29335s();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo29340f());
        objArr[2] = mo29340f() <= 50 ? C3881la.m29414a(this) : C3881la.m29414a(mo29338k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
