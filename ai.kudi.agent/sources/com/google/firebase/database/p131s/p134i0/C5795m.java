package com.google.firebase.database.p131s.p134i0;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.j;
import com.google.firebase.database.C5611c;
import com.google.firebase.database.C5612d;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5859o;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
/* compiled from: Utilities.java */
/* renamed from: com.google.firebase.database.s.i0.m */
/* loaded from: classes2.dex */
public class C5795m {

    /* renamed from: a */
    private static final char[] f14230a = "0123456789abcdef".toCharArray();

    /* compiled from: Utilities.java */
    /* renamed from: com.google.firebase.database.s.i0.m$a */
    /* loaded from: classes2.dex */
    class C5796a implements C5612d.InterfaceC5614b {

        /* renamed from: a */
        final /* synthetic */ C4465k f14231a;

        C5796a(C4465k c4465k) {
            this.f14231a = c4465k;
        }

        @Override // com.google.firebase.database.C5612d.InterfaceC5614b
        /* renamed from: a */
        public void mo23738a(C5611c c5611c, C5612d c5612d) {
            if (c5611c != null) {
                this.f14231a.m27776b(c5611c.m24328i());
            } else {
                this.f14231a.m27775c(null);
            }
        }
    }

    /* renamed from: a */
    public static int m23750a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: b */
    public static int m23749b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: c */
    public static String m23748c(double d) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d);
        for (int i = 7; i >= 0; i--) {
            int i2 = (int) ((doubleToLongBits >>> (i * 8)) & 255);
            sb.append(f14230a[(i2 >> 4) & 15]);
            sb.append(f14230a[i2 & 15]);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static boolean m23747d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    private static String m23746e(String str) {
        int indexOf = str.indexOf("//");
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 2);
            int indexOf2 = substring.indexOf("/");
            if (indexOf2 != -1) {
                int indexOf3 = substring.indexOf("?");
                if (indexOf3 != -1) {
                    return substring.substring(indexOf2 + 1, indexOf3);
                }
                return substring.substring(indexOf2 + 1);
            }
            return "";
        }
        throw new DatabaseException("Firebase Database URL is missing URL scheme");
    }

    /* renamed from: f */
    public static void m23745f(boolean z) {
        m23744g(z, "");
    }

    /* renamed from: g */
    public static void m23744g(boolean z, String str) {
        if (z) {
            return;
        }
        Log.w("FirebaseDatabase", "Assertion failed: " + str);
    }

    /* renamed from: h */
    public static C5786h m23743h(String str) throws DatabaseException {
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme != null) {
                String host = parse.getHost();
                if (host != null) {
                    String queryParameter = parse.getQueryParameter("ns");
                    boolean z = false;
                    if (queryParameter == null) {
                        queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
                    }
                    C5859o c5859o = new C5859o();
                    c5859o.f14399a = host.toLowerCase(Locale.US);
                    int port = parse.getPort();
                    if (port != -1) {
                        c5859o.f14400b = (scheme.equals("https") || scheme.equals("wss")) ? true : true;
                        c5859o.f14399a += ":" + port;
                    } else {
                        c5859o.f14400b = true;
                    }
                    c5859o.f14401c = queryParameter;
                    String replace = m23746e(str).replace("+", " ");
                    C5797n.m23732f(replace);
                    C5786h c5786h = new C5786h();
                    c5786h.f14218b = new C5830l(replace);
                    c5786h.f14217a = c5859o;
                    return c5786h;
                }
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            throw new IllegalArgumentException("Database URL does not specify a URL scheme");
        } catch (Exception e) {
            throw new DatabaseException("Invalid Firebase Database url specified: " + str, e);
        }
    }

    /* renamed from: i */
    public static String m23742i(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e);
        }
    }

    /* renamed from: j */
    public static String m23741j(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return '\"' + replace + '\"';
    }

    /* renamed from: k */
    public static Integer m23740k(String str) {
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i = 0;
        boolean z = true;
        if (str.charAt(0) != '-') {
            z = false;
        } else if (str.length() == 1) {
            return null;
        } else {
            i = 1;
        }
        long j = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j = (j * 10) + (charAt - '0');
            i++;
        }
        if (!z) {
            if (j > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) j);
        }
        long j2 = -j;
        if (j2 < -2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j2);
    }

    /* renamed from: l */
    public static C5785g<j<Void>, C5612d.InterfaceC5614b> m23739l(C5612d.InterfaceC5614b interfaceC5614b) {
        if (interfaceC5614b == null) {
            C4465k c4465k = new C4465k();
            return new C5785g<>(c4465k.m27777a(), new C5796a(c4465k));
        }
        return new C5785g<>(null, interfaceC5614b);
    }
}
