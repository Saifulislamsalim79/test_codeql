package io.grpc.p385i1;

import com.google.common.base.C5051n;
import io.grpc.p385i1.p386r.C9944b;
import io.grpc.p385i1.p386r.C9948d;
import io.grpc.p385i1.p386r.EnumC9959g;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: OkHttpTlsUpgrader.java */
/* renamed from: io.grpc.i1.m */
/* loaded from: classes2.dex */
final class C9935m {

    /* renamed from: a */
    static final List<EnumC9959g> f23435a = Collections.unmodifiableList(Arrays.asList(EnumC9959g.HTTP_2));

    /* renamed from: a */
    static String m13561a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    /* renamed from: b */
    public static SSLSocket m13560b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i, C9944b c9944b) throws IOException {
        C5051n.m25779o(sSLSocketFactory, "sslSocketFactory");
        C5051n.m25779o(socket, "socket");
        C5051n.m25779o(c9944b, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        c9944b.m13525c(sSLSocket, false);
        String mo13571h = C9931j.m13576e().mo13571h(sSLSocket, str, c9944b.m13522f() ? f23435a : null);
        boolean contains = f23435a.contains(EnumC9959g.m13473a(mo13571h));
        C5051n.m25771w(contains, "Only " + f23435a + " are supported, but negotiated protocol is %s", mo13571h);
        if (hostnameVerifier == null) {
            hostnameVerifier = C9948d.f23566a;
        }
        if (hostnameVerifier.verify(m13561a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
