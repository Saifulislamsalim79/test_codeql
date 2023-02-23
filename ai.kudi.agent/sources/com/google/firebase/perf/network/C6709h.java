package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p176h.C6609a;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
/* compiled from: NetworkRequestMetricBuilderUtil.java */
/* renamed from: com.google.firebase.perf.network.h */
/* loaded from: classes2.dex */
public final class C6709h {

    /* renamed from: a */
    private static final Pattern f16139a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /* renamed from: a */
    public static Long m20993a(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            C6609a.m21475e().m21479a("The content-length value is not a valid number");
            return null;
        }
    }

    /* renamed from: b */
    public static String m20992b(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    /* renamed from: c */
    public static boolean m20991c(String str) {
        return str == null || !f16139a.matcher(str).matches();
    }

    /* renamed from: d */
    public static void m20990d(C6695b c6695b) {
        if (!c6695b.m21106f()) {
            c6695b.m21100l();
        }
        c6695b.m21110b();
    }
}
