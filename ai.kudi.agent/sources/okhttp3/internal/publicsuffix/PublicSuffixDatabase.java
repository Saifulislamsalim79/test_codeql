package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p565l.p566g0.C14148c;
import p565l.p566g0.p571i.C14198f;
import p576m.C14351j;
import p576m.C14353l;
import p576m.InterfaceC14346e;
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    private static final byte[] f32059e = {42};

    /* renamed from: f */
    private static final String[] f32060f = new String[0];

    /* renamed from: g */
    private static final String[] f32061g = {"*"};

    /* renamed from: h */
    private static final PublicSuffixDatabase f32062h = new PublicSuffixDatabase();

    /* renamed from: a */
    private final AtomicBoolean f32063a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f32064b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f32065c;

    /* renamed from: d */
    private byte[] f32066d;

    /* renamed from: a */
    private static String m1408a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else if (i10 == bArr2.length - 1) {
                        break;
                    } else {
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, C14148c.f30913i);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    /* renamed from: b */
    private String[] m1407b(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (!this.f32063a.get() && this.f32063a.compareAndSet(false, true)) {
            m1403f();
        } else {
            try {
                this.f32064b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        synchronized (this) {
            if (this.f32065c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(C14148c.f30913i);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = m1408a(this.f32065c, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = f32059e;
                str3 = m1408a(this.f32065c, bArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String m1408a = m1408a(this.f32066d, bArr, i);
                if (m1408a != null) {
                    str = m1408a;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return f32061g;
        } else {
            if (str2 != null) {
                strArr2 = str2.split("\\.");
            } else {
                strArr2 = f32060f;
            }
            if (str3 != null) {
                strArr3 = str3.split("\\.");
            } else {
                strArr3 = f32060f;
            }
            return strArr2.length > strArr3.length ? strArr2 : strArr3;
        }
    }

    /* renamed from: c */
    public static PublicSuffixDatabase m1406c() {
        return f32062h;
    }

    /* renamed from: e */
    private void m1404e() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(io.intercom.okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC14346e m2021d = C14353l.m2021d(new C14351j(C14353l.m2014k(resourceAsStream)));
        try {
            byte[] bArr = new byte[m2021d.readInt()];
            m2021d.readFully(bArr);
            byte[] bArr2 = new byte[m2021d.readInt()];
            m2021d.readFully(bArr2);
            synchronized (this) {
                this.f32065c = bArr;
                this.f32066d = bArr2;
            }
            this.f32064b.countDown();
        } finally {
            C14148c.m2801g(m2021d);
        }
    }

    /* renamed from: f */
    private void m1403f() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m1404e();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C14198f.m2653j().mo2646q(5, "Failed to read public suffix list", e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: d */
    public String m1405d(String str) {
        int length;
        int length2;
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] m1407b = m1407b(split);
            if (split.length != m1407b.length || m1407b[0].charAt(0) == '!') {
                if (m1407b[0].charAt(0) == '!') {
                    length = split.length;
                    length2 = m1407b.length;
                } else {
                    length = split.length;
                    length2 = m1407b.length + 1;
                }
                StringBuilder sb = new StringBuilder();
                String[] split2 = str.split("\\.");
                for (int i = length - length2; i < split2.length; i++) {
                    sb.append(split2[i]);
                    sb.append('.');
                }
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }
            return null;
        }
        throw new NullPointerException("domain == null");
    }
}
