package com.google.android.gms.internal.p104firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ho */
/* loaded from: classes2.dex */
public abstract class AbstractC3223ho implements Iterable<Byte>, Serializable {

    /* renamed from: d */
    public static final AbstractC3223ho f8571d = new C3196go(C3117e.f8413b);

    /* renamed from: c */
    private int f8572c = 0;

    static {
        int i = C3616wn.f9068a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m31024F(int i, int i2, int i3) {
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

    /* renamed from: J */
    public static AbstractC3223ho m31022J(byte[] bArr) {
        return m31021O(bArr, 0, bArr.length);
    }

    /* renamed from: O */
    public static AbstractC3223ho m31021O(byte[] bArr, int i, int i2) {
        m31024F(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C3196go(bArr2);
    }

    /* renamed from: P */
    public static AbstractC3223ho m31020P(String str) {
        return new C3196go(str.getBytes(C3117e.f8412a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static AbstractC3223ho m31019V(byte[] bArr) {
        return new C3196go(bArr);
    }

    /* renamed from: E */
    public abstract boolean mo31025E();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final int m31023I() {
        return this.f8572c;
    }

    /* renamed from: X */
    public final String m31018X(Charset charset) {
        return mo31014f() == 0 ? "" : mo31009s(charset);
    }

    /* renamed from: Z */
    public final byte[] m31017Z() {
        int mo31014f = mo31014f();
        if (mo31014f == 0) {
            return C3117e.f8413b;
        }
        byte[] bArr = new byte[mo31014f];
        mo31013h(bArr, 0, 0, mo31014f);
        return bArr;
    }

    /* renamed from: d */
    public abstract byte mo31016d(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract byte mo31015e(int i);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo31014f();

    /* renamed from: h */
    protected abstract void mo31013h(byte[] bArr, int i, int i2, int i3);

    public final int hashCode() {
        int i = this.f8572c;
        if (i == 0) {
            int mo31014f = mo31014f();
            i = mo31012k(mo31014f, 0, mo31014f);
            if (i == 0) {
                i = 1;
            }
            this.f8572c = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new C3061bo(this);
    }

    /* renamed from: k */
    protected abstract int mo31012k(int i, int i2, int i3);

    /* renamed from: l */
    public abstract AbstractC3223ho mo31011l(int i, int i2);

    /* renamed from: m */
    public abstract AbstractC3304ko mo31010m();

    /* renamed from: s */
    protected abstract String mo31009s(Charset charset);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo31014f());
        objArr[2] = mo31014f() <= 50 ? C3619x0.m30068a(this) : String.valueOf(C3619x0.m30068a(mo31011l(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public abstract void mo31008u(AbstractC3034ao abstractC3034ao) throws IOException;
}
