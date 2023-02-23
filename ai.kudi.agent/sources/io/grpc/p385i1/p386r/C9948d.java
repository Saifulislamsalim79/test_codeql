package io.grpc.p385i1.p386r;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* compiled from: OkHostnameVerifier.java */
/* renamed from: io.grpc.i1.r.d */
/* loaded from: classes2.dex */
public final class C9948d implements HostnameVerifier {

    /* renamed from: a */
    public static final C9948d f23566a = new C9948d();

    /* renamed from: b */
    private static final Pattern f23567b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private C9948d() {
    }

    /* renamed from: a */
    private static List<String> m13502a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: c */
    static boolean m13500c(String str) {
        return f23567b.matcher(str).matches();
    }

    /* renamed from: d */
    private boolean m13499d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (str.endsWith(substring)) {
                int length = str.length() - substring.length();
                return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m13498e(String str, X509Certificate x509Certificate) {
        String m13509b;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> m13502a = m13502a(x509Certificate, 2);
        int size = m13502a.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (m13499d(lowerCase, m13502a.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (z || (m13509b = new C9947c(x509Certificate.getSubjectX500Principal()).m13509b("cn")) == null) {
            return false;
        }
        return m13499d(lowerCase, m13509b);
    }

    /* renamed from: f */
    private boolean m13497f(String str, X509Certificate x509Certificate) {
        List<String> m13502a = m13502a(x509Certificate, 7);
        int size = m13502a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(m13502a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m13501b(String str, X509Certificate x509Certificate) {
        if (m13500c(str)) {
            return m13497f(str, x509Certificate);
        }
        return m13498e(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m13501b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
