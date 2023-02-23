package com.google.common.p109io;

import com.google.common.base.C5027b;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import p272h.p286c.p348b.p349a.C9358a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* renamed from: com.google.common.io.BaseEncoding */
/* loaded from: classes2.dex */
public abstract class BaseEncoding {

    /* renamed from: a */
    private static final BaseEncoding f12815a = new C5139c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final BaseEncoding f12816b;

    /* renamed from: com.google.common.io.BaseEncoding$DecodingException */
    /* loaded from: classes2.dex */
    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.io.BaseEncoding$a */
    /* loaded from: classes2.dex */
    public static final class C5137a {

        /* renamed from: a */
        private final String f12817a;

        /* renamed from: b */
        private final char[] f12818b;

        /* renamed from: c */
        final int f12819c;

        /* renamed from: d */
        final int f12820d;

        /* renamed from: e */
        final int f12821e;

        /* renamed from: f */
        final int f12822f;

        /* renamed from: g */
        private final byte[] f12823g;

        /* renamed from: h */
        private final boolean[] f12824h;

        C5137a(String str, char[] cArr) {
            C5051n.m25780n(str);
            this.f12817a = str;
            C5051n.m25780n(cArr);
            this.f12818b = cArr;
            try {
                int m14965d = C9358a.m14965d(cArr.length, RoundingMode.UNNECESSARY);
                this.f12820d = m14965d;
                int min = Math.min(8, Integer.lowestOneBit(m14965d));
                try {
                    this.f12821e = 8 / min;
                    this.f12822f = this.f12820d / min;
                    this.f12819c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        C5051n.m25788f(c < 128, "Non-ASCII character: %s", c);
                        C5051n.m25788f(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.f12823g = bArr;
                    boolean[] zArr = new boolean[this.f12821e];
                    for (int i2 = 0; i2 < this.f12822f; i2++) {
                        zArr[C9358a.m14968a(i2 * 8, this.f12820d, RoundingMode.CEILING)] = true;
                    }
                    this.f12824h = zArr;
                } catch (ArithmeticException e) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                }
            } catch (ArithmeticException e2) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        /* renamed from: d */
        private boolean m25542d() {
            for (char c : this.f12818b) {
                if (C5027b.m25837a(c)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        private boolean m25541e() {
            for (char c : this.f12818b) {
                if (C5027b.m25836b(c)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        int m25544b(char c) throws DecodingException {
            if (c > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f12823g[c];
            if (b == -1) {
                if (c > ' ' && c != 127) {
                    StringBuilder sb = new StringBuilder(25);
                    sb.append("Unrecognized character: ");
                    sb.append(c);
                    throw new DecodingException(sb.toString());
                }
                String valueOf2 = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            return b;
        }

        /* renamed from: c */
        char m25543c(int i) {
            return this.f12818b[i];
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5137a) {
                return Arrays.equals(this.f12818b, ((C5137a) obj).f12818b);
            }
            return false;
        }

        /* renamed from: f */
        boolean m25540f(int i) {
            return this.f12824h[i % this.f12821e];
        }

        /* renamed from: g */
        public boolean m25539g(char c) {
            byte[] bArr = this.f12823g;
            return c < bArr.length && bArr[c] != -1;
        }

        /* renamed from: h */
        C5137a m25538h() {
            if (!m25542d()) {
                return this;
            }
            C5051n.m25773u(!m25541e(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f12818b.length];
            int i = 0;
            while (true) {
                char[] cArr2 = this.f12818b;
                if (i < cArr2.length) {
                    cArr[i] = C5027b.m25834d(cArr2[i]);
                    i++;
                } else {
                    return new C5137a(String.valueOf(this.f12817a).concat(".upperCase()"), cArr);
                }
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.f12818b);
        }

        public String toString() {
            return this.f12817a;
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$b */
    /* loaded from: classes2.dex */
    static final class C5138b extends C5140d {

        /* renamed from: f */
        final char[] f12825f;

        C5138b(String str, String str2) {
            this(new C5137a(str, str2.toCharArray()));
        }

        @Override // com.google.common.p109io.BaseEncoding.C5140d, com.google.common.p109io.BaseEncoding
        /* renamed from: e */
        int mo25537e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            C5051n.m25780n(bArr);
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    bArr[i2] = (byte) ((this.f12826c.m25544b(charSequence.charAt(i)) << 4) | this.f12826c.m25544b(charSequence.charAt(i + 1)));
                    i += 2;
                    i2++;
                }
                return i2;
            }
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        @Override // com.google.common.p109io.BaseEncoding.C5140d, com.google.common.p109io.BaseEncoding
        /* renamed from: h */
        void mo25536h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C5051n.m25780n(appendable);
            C5051n.m25775s(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.f12825f[i4]);
                appendable.append(this.f12825f[i4 | 256]);
            }
        }

        @Override // com.google.common.p109io.BaseEncoding.C5140d
        /* renamed from: p */
        BaseEncoding mo25529p(C5137a c5137a, Character ch) {
            return new C5138b(c5137a);
        }

        private C5138b(C5137a c5137a) {
            super(c5137a, null);
            this.f12825f = new char[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED];
            C5051n.m25790d(c5137a.f12818b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f12825f[i] = c5137a.m25543c(i >>> 4);
                this.f12825f[i | 256] = c5137a.m25543c(i & 15);
            }
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$c */
    /* loaded from: classes2.dex */
    static final class C5139c extends C5140d {
        C5139c(String str, String str2, Character ch) {
            this(new C5137a(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.p109io.BaseEncoding.C5140d, com.google.common.p109io.BaseEncoding
        /* renamed from: e */
        int mo25537e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            C5051n.m25780n(bArr);
            CharSequence mo25532m = mo25532m(charSequence);
            if (this.f12826c.m25540f(mo25532m.length())) {
                int i = 0;
                int i2 = 0;
                while (i < mo25532m.length()) {
                    int i3 = i + 1;
                    int i4 = i3 + 1;
                    int m25544b = (this.f12826c.m25544b(mo25532m.charAt(i)) << 18) | (this.f12826c.m25544b(mo25532m.charAt(i3)) << 12);
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (m25544b >>> 16);
                    if (i4 < mo25532m.length()) {
                        int i6 = i4 + 1;
                        int m25544b2 = m25544b | (this.f12826c.m25544b(mo25532m.charAt(i4)) << 6);
                        i2 = i5 + 1;
                        bArr[i5] = (byte) ((m25544b2 >>> 8) & 255);
                        if (i6 < mo25532m.length()) {
                            i4 = i6 + 1;
                            i5 = i2 + 1;
                            bArr[i2] = (byte) ((m25544b2 | this.f12826c.m25544b(mo25532m.charAt(i6))) & 255);
                        } else {
                            i = i6;
                        }
                    }
                    i2 = i5;
                    i = i4;
                }
                return i2;
            }
            int length = mo25532m.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        @Override // com.google.common.p109io.BaseEncoding.C5140d, com.google.common.p109io.BaseEncoding
        /* renamed from: h */
        void mo25536h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C5051n.m25780n(appendable);
            int i3 = i + i2;
            C5051n.m25775s(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                int i6 = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                appendable.append(this.f12826c.m25543c(i6 >>> 18));
                appendable.append(this.f12826c.m25543c((i6 >>> 12) & 63));
                appendable.append(this.f12826c.m25543c((i6 >>> 6) & 63));
                appendable.append(this.f12826c.m25543c(i6 & 63));
                i2 -= 3;
                i = i5 + 1;
            }
            if (i < i3) {
                m25530o(appendable, bArr, i, i3 - i);
            }
        }

        @Override // com.google.common.p109io.BaseEncoding.C5140d
        /* renamed from: p */
        BaseEncoding mo25529p(C5137a c5137a, Character ch) {
            return new C5139c(c5137a, ch);
        }

        private C5139c(C5137a c5137a, Character ch) {
            super(c5137a, ch);
            C5051n.m25790d(c5137a.f12818b.length == 64);
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$d */
    /* loaded from: classes2.dex */
    static class C5140d extends BaseEncoding {

        /* renamed from: c */
        final C5137a f12826c;

        /* renamed from: d */
        final Character f12827d;

        /* renamed from: e */
        private transient BaseEncoding f12828e;

        C5140d(String str, String str2, Character ch) {
            this(new C5137a(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.p109io.BaseEncoding
        /* renamed from: e */
        int mo25537e(byte[] bArr, CharSequence charSequence) throws DecodingException {
            C5137a c5137a;
            C5051n.m25780n(bArr);
            CharSequence mo25532m = mo25532m(charSequence);
            if (this.f12826c.m25540f(mo25532m.length())) {
                int i = 0;
                int i2 = 0;
                while (i < mo25532m.length()) {
                    long j = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        c5137a = this.f12826c;
                        if (i3 >= c5137a.f12821e) {
                            break;
                        }
                        j <<= c5137a.f12820d;
                        if (i + i3 < mo25532m.length()) {
                            j |= this.f12826c.m25544b(mo25532m.charAt(i4 + i));
                            i4++;
                        }
                        i3++;
                    }
                    int i5 = c5137a.f12822f;
                    int i6 = (i5 * 8) - (i4 * c5137a.f12820d);
                    int i7 = (i5 - 1) * 8;
                    while (i7 >= i6) {
                        bArr[i2] = (byte) ((j >>> i7) & 255);
                        i7 -= 8;
                        i2++;
                    }
                    i += this.f12826c.f12821e;
                }
                return i2;
            }
            int length = mo25532m.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new DecodingException(sb.toString());
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5140d) {
                C5140d c5140d = (C5140d) obj;
                return this.f12826c.equals(c5140d.f12826c) && C5046k.m25800a(this.f12827d, c5140d.f12827d);
            }
            return false;
        }

        @Override // com.google.common.p109io.BaseEncoding
        /* renamed from: h */
        void mo25536h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C5051n.m25780n(appendable);
            C5051n.m25775s(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                m25530o(appendable, bArr, i + i3, Math.min(this.f12826c.f12822f, i2 - i3));
                i3 += this.f12826c.f12822f;
            }
        }

        public int hashCode() {
            return this.f12826c.hashCode() ^ C5046k.m25799b(this.f12827d);
        }

        @Override // com.google.common.p109io.BaseEncoding
        /* renamed from: j */
        int mo25535j(int i) {
            return (int) (((this.f12826c.f12820d * i) + 7) / 8);
        }

        @Override // com.google.common.p109io.BaseEncoding
        /* renamed from: k */
        int mo25534k(int i) {
            C5137a c5137a = this.f12826c;
            return c5137a.f12821e * C9358a.m14968a(i, c5137a.f12822f, RoundingMode.CEILING);
        }

        @Override // com.google.common.p109io.BaseEncoding
        /* renamed from: l */
        public BaseEncoding mo25533l() {
            return this.f12827d == null ? this : mo25529p(this.f12826c, null);
        }

        @Override // com.google.common.p109io.BaseEncoding
        /* renamed from: m */
        CharSequence mo25532m(CharSequence charSequence) {
            C5051n.m25780n(charSequence);
            Character ch = this.f12827d;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.p109io.BaseEncoding
        /* renamed from: n */
        public BaseEncoding mo25531n() {
            BaseEncoding baseEncoding = this.f12828e;
            if (baseEncoding == null) {
                C5137a m25538h = this.f12826c.m25538h();
                baseEncoding = m25538h == this.f12826c ? this : mo25529p(m25538h, this.f12827d);
                this.f12828e = baseEncoding;
            }
            return baseEncoding;
        }

        /* renamed from: o */
        void m25530o(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C5051n.m25780n(appendable);
            C5051n.m25775s(i, i + i2, bArr.length);
            int i3 = 0;
            C5051n.m25790d(i2 <= this.f12826c.f12822f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | (bArr[i + i4] & 255)) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f12826c.f12820d;
            while (i3 < i2 * 8) {
                C5137a c5137a = this.f12826c;
                appendable.append(c5137a.m25543c(((int) (j >>> (i5 - i3))) & c5137a.f12819c));
                i3 += this.f12826c.f12820d;
            }
            if (this.f12827d != null) {
                while (i3 < this.f12826c.f12822f * 8) {
                    appendable.append(this.f12827d.charValue());
                    i3 += this.f12826c.f12820d;
                }
            }
        }

        /* renamed from: p */
        BaseEncoding mo25529p(C5137a c5137a, Character ch) {
            return new C5140d(c5137a, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f12826c.toString());
            if (8 % this.f12826c.f12820d != 0) {
                if (this.f12827d == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f12827d);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        C5140d(C5137a c5137a, Character ch) {
            C5051n.m25780n(c5137a);
            this.f12826c = c5137a;
            C5051n.m25784j(ch == null || !c5137a.m25539g(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f12827d = ch;
        }
    }

    static {
        new C5139c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new C5140d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new C5140d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f12816b = new C5138b("base16()", "0123456789ABCDEF");
    }

    BaseEncoding() {
    }

    /* renamed from: a */
    public static BaseEncoding m25552a() {
        return f12816b;
    }

    /* renamed from: b */
    public static BaseEncoding m25551b() {
        return f12815a;
    }

    /* renamed from: i */
    private static byte[] m25546i(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: c */
    public final byte[] m25550c(CharSequence charSequence) {
        try {
            return m25549d(charSequence);
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    final byte[] m25549d(CharSequence charSequence) throws DecodingException {
        CharSequence mo25532m = mo25532m(charSequence);
        byte[] bArr = new byte[mo25535j(mo25532m.length())];
        return m25546i(bArr, mo25537e(bArr, mo25532m));
    }

    /* renamed from: e */
    abstract int mo25537e(byte[] bArr, CharSequence charSequence) throws DecodingException;

    /* renamed from: f */
    public String m25548f(byte[] bArr) {
        return m25547g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public final String m25547g(byte[] bArr, int i, int i2) {
        C5051n.m25775s(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo25534k(i2));
        try {
            mo25536h(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    abstract void mo25536h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: j */
    abstract int mo25535j(int i);

    /* renamed from: k */
    abstract int mo25534k(int i);

    /* renamed from: l */
    public abstract BaseEncoding mo25533l();

    /* renamed from: m */
    abstract CharSequence mo25532m(CharSequence charSequence);

    /* renamed from: n */
    public abstract BaseEncoding mo25531n();
}
