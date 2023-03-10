package p565l.p566g0.p573k;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p565l.p566g0.C14148c;
/* compiled from: OkHostnameVerifier.java */
/* renamed from: l.g0.k.d */
/* loaded from: classes3.dex */
public final class C14203d implements HostnameVerifier {

    /* renamed from: a */
    public static final C14203d f31065a = new C14203d();

    private C14203d() {
    }

    /* renamed from: a */
    public static List<String> m2641a(X509Certificate x509Certificate) {
        List<String> m2640b = m2640b(x509Certificate, 7);
        List<String> m2640b2 = m2640b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(m2640b.size() + m2640b2.size());
        arrayList.addAll(m2640b);
        arrayList.addAll(m2640b2);
        return arrayList;
    }

    /* renamed from: b */
    private static List<String> m2640b(X509Certificate x509Certificate, int i) {
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

    /* renamed from: e */
    private boolean m2637e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String str2 : m2640b(x509Certificate, 2)) {
            if (m2638d(lowerCase, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private boolean m2636f(String str, X509Certificate x509Certificate) {
        List<String> m2640b = m2640b(x509Certificate, 7);
        int size = m2640b.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(m2640b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m2639c(String str, X509Certificate x509Certificate) {
        if (C14148c.m2808J(str)) {
            return m2636f(str, x509Certificate);
        }
        return m2637e(str, x509Certificate);
    }

    /* renamed from: d */
    public boolean m2638d(String str, String str2) {
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

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m2639c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
