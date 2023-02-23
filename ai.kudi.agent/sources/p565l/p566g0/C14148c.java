package p565l.p566g0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.http2.C14482b;
import p565l.AbstractC14120b0;
import p565l.AbstractC14135d0;
import p565l.C14229s;
import p565l.C14231t;
import p565l.C14235v;
import p576m.C14342c;
import p576m.C14347f;
import p576m.InterfaceC14346e;
import p576m.InterfaceC14365s;
/* compiled from: Util.java */
/* renamed from: l.g0.c */
/* loaded from: classes3.dex */
public final class C14148c {

    /* renamed from: a */
    public static final byte[] f30905a;

    /* renamed from: b */
    public static final String[] f30906b = new String[0];

    /* renamed from: c */
    public static final AbstractC14135d0 f30907c;

    /* renamed from: d */
    private static final C14347f f30908d;

    /* renamed from: e */
    private static final C14347f f30909e;

    /* renamed from: f */
    private static final C14347f f30910f;

    /* renamed from: g */
    private static final C14347f f30911g;

    /* renamed from: h */
    private static final C14347f f30912h;

    /* renamed from: i */
    public static final Charset f30913i;

    /* renamed from: j */
    private static final Charset f30914j;

    /* renamed from: k */
    private static final Charset f30915k;

    /* renamed from: l */
    private static final Charset f30916l;

    /* renamed from: m */
    private static final Charset f30917m;

    /* renamed from: n */
    public static final TimeZone f30918n;

    /* renamed from: o */
    public static final Comparator<String> f30919o;

    /* renamed from: p */
    private static final Method f30920p;

    /* renamed from: q */
    private static final Pattern f30921q;

    /* compiled from: Util.java */
    /* renamed from: l.g0.c$a */
    /* loaded from: classes3.dex */
    class C14149a implements Comparator<String> {
        C14149a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* compiled from: Util.java */
    /* renamed from: l.g0.c$b */
    /* loaded from: classes3.dex */
    class ThreadFactoryC14150b implements ThreadFactory {

        /* renamed from: c */
        final /* synthetic */ String f30922c;

        /* renamed from: d */
        final /* synthetic */ boolean f30923d;

        ThreadFactoryC14150b(String str, boolean z) {
            this.f30922c = str;
            this.f30923d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f30922c);
            thread.setDaemon(this.f30923d);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f30905a = bArr;
        Method method = null;
        f30907c = AbstractC14135d0.m2836J(null, bArr);
        AbstractC14120b0.create((C14235v) null, f30905a);
        f30908d = C14347f.m2038h("efbbbf");
        f30909e = C14347f.m2038h("feff");
        f30910f = C14347f.m2038h("fffe");
        f30911g = C14347f.m2038h("0000ffff");
        f30912h = C14347f.m2038h("ffff0000");
        f30913i = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        f30914j = Charset.forName("UTF-16BE");
        f30915k = Charset.forName("UTF-16LE");
        f30916l = Charset.forName("UTF-32BE");
        f30917m = Charset.forName("UTF-32LE");
        f30918n = TimeZone.getTimeZone("GMT");
        f30919o = new C14149a();
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f30920p = method;
        f30921q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: A */
    public static boolean m2817A(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: B */
    public static boolean m2816B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static X509TrustManager m2815C() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw m2806b("No System TLS", e);
        }
    }

    /* renamed from: D */
    public static boolean m2814D(InterfaceC14365s interfaceC14365s, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long mo1951c = interfaceC14365s.timeout().mo1950e() ? interfaceC14365s.timeout().mo1951c() - nanoTime : Long.MAX_VALUE;
        interfaceC14365s.timeout().mo1948d(Math.min(mo1951c, timeUnit.toNanos(i)) + nanoTime);
        try {
            C14342c c14342c = new C14342c();
            while (interfaceC14365s.mo312O0(c14342c, 8192L) != -1) {
                c14342c.m2058c();
            }
            if (mo1951c == Long.MAX_VALUE) {
                interfaceC14365s.timeout().mo1953a();
            } else {
                interfaceC14365s.timeout().mo1948d(nanoTime + mo1951c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (mo1951c == Long.MAX_VALUE) {
                interfaceC14365s.timeout().mo1953a();
            } else {
                interfaceC14365s.timeout().mo1948d(nanoTime + mo1951c);
            }
            return false;
        } catch (Throwable th) {
            if (mo1951c == Long.MAX_VALUE) {
                interfaceC14365s.timeout().mo1953a();
            } else {
                interfaceC14365s.timeout().mo1948d(nanoTime + mo1951c);
            }
            throw th;
        }
    }

    /* renamed from: E */
    public static int m2813E(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: F */
    public static int m2812F(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: G */
    public static ThreadFactory m2811G(String str, boolean z) {
        return new ThreadFactoryC14150b(str, z);
    }

    /* renamed from: H */
    public static C14229s m2810H(List<C14482b> list) {
        C14229s.C14230a c14230a = new C14229s.C14230a();
        for (C14482b c14482b : list) {
            AbstractC14146a.f30903a.mo2434b(c14230a, c14482b.f31910a.mo1965M(), c14482b.f31911b.mo1965M());
        }
        return c14230a.m2539d();
    }

    /* renamed from: I */
    public static String m2809I(String str, int i, int i2) {
        int m2813E = m2813E(str, i, i2);
        return str.substring(m2813E, m2812F(str, m2813E, i2));
    }

    /* renamed from: J */
    public static boolean m2808J(String str) {
        return f30921q.matcher(str).matches();
    }

    /* renamed from: a */
    public static void m2807a(Throwable th, Throwable th2) {
        Method method = f30920p;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: b */
    public static AssertionError m2806b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: c */
    public static Charset m2805c(InterfaceC14346e interfaceC14346e, Charset charset) throws IOException {
        if (interfaceC14346e.mo1986l0(0L, f30908d)) {
            interfaceC14346e.mo1994a(f30908d.mo1969A());
            return f30913i;
        } else if (interfaceC14346e.mo1986l0(0L, f30909e)) {
            interfaceC14346e.mo1994a(f30909e.mo1969A());
            return f30914j;
        } else if (interfaceC14346e.mo1986l0(0L, f30910f)) {
            interfaceC14346e.mo1994a(f30910f.mo1969A());
            return f30915k;
        } else if (interfaceC14346e.mo1986l0(0L, f30911g)) {
            interfaceC14346e.mo1994a(f30911g.mo1969A());
            return f30916l;
        } else if (interfaceC14346e.mo1986l0(0L, f30912h)) {
            interfaceC14346e.mo1994a(f30912h.mo1969A());
            return f30917m;
        } else {
            return charset;
        }
    }

    /* renamed from: d */
    public static String m2804d(String str) {
        InetAddress m2795m;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                m2795m = m2795m(str, 1, str.length() - 1);
            } else {
                m2795m = m2795m(str, 0, str.length());
            }
            if (m2795m == null) {
                return null;
            }
            byte[] address = m2795m.getAddress();
            if (address.length == 16) {
                return m2783y(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (m2798j(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static int m2803e(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(str + " < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: f */
    public static void m2802f(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: g */
    public static void m2801g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static void m2800h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m2817A(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    public static String[] m2799i(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: j */
    private static boolean m2798j(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static int m2797k(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    return -1;
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    /* renamed from: l */
    private static boolean m2796l(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress m2795m(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
        L9:
            r7 = 0
            if (r12 >= r13) goto L7a
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L27
            java.lang.String r9 = "::"
            r10 = 2
            boolean r9 = r11.regionMatches(r12, r9, r3, r10)
            if (r9 == 0) goto L27
            if (r5 == r2) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L25
            goto L7a
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L4a
            java.lang.String r8 = ":"
            r9 = 1
            boolean r8 = r11.regionMatches(r12, r8, r3, r9)
            if (r8 == 0) goto L35
            int r12 = r12 + 1
            goto L4a
        L35:
            java.lang.String r8 = "."
            boolean r12 = r11.regionMatches(r12, r8, r3, r9)
            if (r12 == 0) goto L49
            int r12 = r4 + (-2)
            boolean r11 = m2796l(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L46
            return r7
        L46:
            int r4 = r4 + 2
            goto L7a
        L49:
            return r7
        L4a:
            r6 = r12
        L4b:
            r12 = r6
            r8 = 0
        L4d:
            if (r12 >= r13) goto L60
            char r9 = r11.charAt(r12)
            int r9 = m2797k(r9)
            if (r9 != r2) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4d
        L60:
            int r9 = r12 - r6
            if (r9 == 0) goto L79
            r10 = 4
            if (r9 <= r10) goto L68
            goto L79
        L68:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L79:
            return r7
        L7a:
            if (r4 == r0) goto L8b
            if (r5 != r2) goto L7f
            return r7
        L7f:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r3)
        L8b:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
            return r11
        L90:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            goto L97
        L96:
            throw r11
        L97:
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: p565l.p566g0.C14148c.m2795m(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: n */
    public static int m2794n(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: o */
    public static int m2793o(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: p */
    public static boolean m2792p(InterfaceC14365s interfaceC14365s, int i, TimeUnit timeUnit) {
        try {
            return m2814D(interfaceC14365s, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m2791q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: r */
    public static String m2790r(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: s */
    public static String m2789s(C14231t c14231t, boolean z) {
        String m2516m;
        if (c14231t.m2516m().contains(":")) {
            m2516m = "[" + c14231t.m2516m() + "]";
        } else {
            m2516m = c14231t.m2516m();
        }
        if (z || c14231t.m2503z() != C14231t.m2524e(c14231t.m2531E())) {
            return m2516m + ":" + c14231t.m2503z();
        }
        return m2516m;
    }

    /* renamed from: t */
    public static <T> List<T> m2788t(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: u */
    public static <T> List<T> m2787u(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: v */
    public static <K, V> Map<K, V> m2786v(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: w */
    public static int m2785w(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public static int m2784x(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    private static String m2783y(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C14342c c14342c = new C14342c();
        while (i < bArr.length) {
            if (i == i2) {
                c14342c.m2061Z0(58);
                i += i4;
                if (i == 16) {
                    c14342c.m2061Z0(58);
                }
            } else {
                if (i > 0) {
                    c14342c.m2061Z0(58);
                }
                c14342c.m2057c1(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
                i += 2;
            }
        }
        return c14342c.m2044x0();
    }

    /* renamed from: z */
    public static String[] m2782z(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
