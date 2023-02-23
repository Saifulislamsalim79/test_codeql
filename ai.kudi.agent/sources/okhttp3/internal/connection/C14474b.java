package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import p565l.C14214k;
import p565l.p566g0.AbstractC14146a;
/* compiled from: ConnectionSpecSelector.java */
/* renamed from: okhttp3.internal.connection.b */
/* loaded from: classes3.dex */
public final class C14474b {

    /* renamed from: a */
    private final List<C14214k> f31846a;

    /* renamed from: b */
    private int f31847b = 0;

    /* renamed from: c */
    private boolean f31848c;

    /* renamed from: d */
    private boolean f31849d;

    public C14474b(List<C14214k> list) {
        this.f31846a = list;
    }

    /* renamed from: c */
    private boolean m1610c(SSLSocket sSLSocket) {
        for (int i = this.f31847b; i < this.f31846a.size(); i++) {
            if (this.f31846a.get(i).m2617c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C14214k m1612a(SSLSocket sSLSocket) throws IOException {
        C14214k c14214k;
        int i = this.f31847b;
        int size = this.f31846a.size();
        while (true) {
            if (i >= size) {
                c14214k = null;
                break;
            }
            c14214k = this.f31846a.get(i);
            if (c14214k.m2617c(sSLSocket)) {
                this.f31847b = i + 1;
                break;
            }
            i++;
        }
        if (c14214k != null) {
            this.f31848c = m1610c(sSLSocket);
            AbstractC14146a.f30903a.mo2433c(c14214k, sSLSocket, this.f31849d);
            return c14214k;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f31849d + ", modes=" + this.f31846a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* renamed from: b */
    public boolean m1611b(IOException iOException) {
        this.f31849d = true;
        if (!this.f31848c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
