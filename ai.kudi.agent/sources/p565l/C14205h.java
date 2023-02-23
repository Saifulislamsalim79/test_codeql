package p565l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: CipherSuite.java */
/* renamed from: l.h */
/* loaded from: classes3.dex */
public final class C14205h {

    /* renamed from: b */
    static final Comparator<String> f31066b = new C14206a();

    /* renamed from: c */
    private static final Map<String, C14205h> f31067c = new LinkedHashMap();

    /* renamed from: d */
    public static final C14205h f31068d;

    /* renamed from: e */
    public static final C14205h f31069e;

    /* renamed from: f */
    public static final C14205h f31070f;

    /* renamed from: g */
    public static final C14205h f31071g;

    /* renamed from: h */
    public static final C14205h f31072h;

    /* renamed from: i */
    public static final C14205h f31073i;

    /* renamed from: j */
    public static final C14205h f31074j;

    /* renamed from: k */
    public static final C14205h f31075k;

    /* renamed from: l */
    public static final C14205h f31076l;

    /* renamed from: m */
    public static final C14205h f31077m;

    /* renamed from: n */
    public static final C14205h f31078n;

    /* renamed from: o */
    public static final C14205h f31079o;

    /* renamed from: p */
    public static final C14205h f31080p;

    /* renamed from: q */
    public static final C14205h f31081q;

    /* renamed from: r */
    public static final C14205h f31082r;

    /* renamed from: s */
    public static final C14205h f31083s;

    /* renamed from: t */
    public static final C14205h f31084t;

    /* renamed from: u */
    public static final C14205h f31085u;

    /* renamed from: a */
    final String f31086a;

    /* compiled from: CipherSuite.java */
    /* renamed from: l.h$a */
    /* loaded from: classes3.dex */
    class C14206a implements Comparator<String> {
        C14206a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i = 4; i < min; i++) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    static {
        m2633c("SSL_RSA_WITH_NULL_MD5", 1);
        m2633c("SSL_RSA_WITH_NULL_SHA", 2);
        m2633c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m2633c("SSL_RSA_WITH_RC4_128_MD5", 4);
        m2633c("SSL_RSA_WITH_RC4_128_SHA", 5);
        m2633c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m2633c("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f31068d = m2633c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        m2633c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m2633c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m2633c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m2633c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m2633c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m2633c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m2633c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m2633c("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m2633c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m2633c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m2633c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m2633c("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m2633c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m2633c("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m2633c("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m2633c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m2633c("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m2633c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m2633c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m2633c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m2633c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f31069e = m2633c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        m2633c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m2633c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m2633c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f31070f = m2633c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        m2633c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m2633c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m2633c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m2633c("TLS_RSA_WITH_NULL_SHA256", 59);
        m2633c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m2633c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m2633c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m2633c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m2633c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m2633c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m2633c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m2633c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m2633c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m2633c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m2633c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m2633c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m2633c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m2633c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m2633c("TLS_PSK_WITH_RC4_128_SHA", 138);
        m2633c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m2633c("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m2633c("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m2633c("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f31071g = m2633c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f31072h = m2633c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        m2633c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m2633c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m2633c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m2633c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m2633c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m2633c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m2633c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m2633c("TLS_FALLBACK_SCSV", 22016);
        m2633c("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m2633c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m2633c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m2633c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m2633c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m2633c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m2633c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m2633c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m2633c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m2633c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m2633c("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m2633c("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m2633c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m2633c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m2633c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m2633c("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m2633c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m2633c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f31073i = m2633c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f31074j = m2633c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        m2633c("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m2633c("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m2633c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m2633c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m2633c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m2633c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m2633c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m2633c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m2633c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m2633c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m2633c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m2633c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m2633c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f31075k = m2633c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f31076l = m2633c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        m2633c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m2633c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f31077m = m2633c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f31078n = m2633c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        m2633c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m2633c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m2633c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m2633c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f31079o = m2633c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f31080p = m2633c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        m2633c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m2633c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f31081q = m2633c("TLS_AES_128_GCM_SHA256", 4865);
        f31082r = m2633c("TLS_AES_256_GCM_SHA384", 4866);
        f31083s = m2633c("TLS_CHACHA20_POLY1305_SHA256", 4867);
        f31084t = m2633c("TLS_AES_128_CCM_SHA256", 4868);
        f31085u = m2633c("TLS_AES_256_CCM_8_SHA256", 4869);
    }

    private C14205h(String str) {
        if (str != null) {
            this.f31086a = str;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static synchronized C14205h m2635a(String str) {
        C14205h c14205h;
        synchronized (C14205h.class) {
            c14205h = f31067c.get(str);
            if (c14205h == null) {
                c14205h = f31067c.get(m2631e(str));
                if (c14205h == null) {
                    c14205h = new C14205h(str);
                }
                f31067c.put(str, c14205h);
            }
        }
        return c14205h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List<C14205h> m2634b(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m2635a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    private static C14205h m2633c(String str, int i) {
        C14205h c14205h = new C14205h(str);
        f31067c.put(str, c14205h);
        return c14205h;
    }

    /* renamed from: e */
    private static String m2631e(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        } else if (str.startsWith("SSL_")) {
            return "TLS_" + str.substring(4);
        } else {
            return str;
        }
    }

    /* renamed from: d */
    public String m2632d() {
        return this.f31086a;
    }

    public String toString() {
        return this.f31086a;
    }
}
