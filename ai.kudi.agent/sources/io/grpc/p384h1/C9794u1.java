package io.grpc.p384h1;

import com.google.common.base.C5051n;
import com.google.common.base.InterfaceC5058r;
import io.grpc.AbstractC10091y0;
import io.grpc.C9484b0;
import io.grpc.InterfaceC10094z0;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ProxyDetectorImpl.java */
/* renamed from: io.grpc.h1.u1 */
/* loaded from: classes2.dex */
class C9794u1 implements InterfaceC10094z0 {

    /* renamed from: d */
    private static final Logger f23005d = Logger.getLogger(C9794u1.class.getName());

    /* renamed from: e */
    private static final InterfaceC9797c f23006e = new C9795a();

    /* renamed from: f */
    private static final InterfaceC5058r<ProxySelector> f23007f = new C9796b();

    /* renamed from: a */
    private final InterfaceC5058r<ProxySelector> f23008a;

    /* renamed from: b */
    private final InterfaceC9797c f23009b;

    /* renamed from: c */
    private final InetSocketAddress f23010c;

    /* compiled from: ProxyDetectorImpl.java */
    /* renamed from: io.grpc.h1.u1$a */
    /* loaded from: classes2.dex */
    class C9795a implements InterfaceC9797c {
        C9795a() {
        }

        @Override // io.grpc.p384h1.C9794u1.InterfaceC9797c
        /* renamed from: a */
        public PasswordAuthentication mo13961a(String str, InetAddress inetAddress, int i, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i, "");
            } catch (MalformedURLException unused) {
                C9794u1.f23005d.log(Level.WARNING, String.format("failed to create URL for Authenticator: %s %s", str2, str));
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* compiled from: ProxyDetectorImpl.java */
    /* renamed from: io.grpc.h1.u1$b */
    /* loaded from: classes2.dex */
    class C9796b implements InterfaceC5058r<ProxySelector> {
        C9796b() {
        }

        @Override // com.google.common.base.InterfaceC5058r
        /* renamed from: a */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProxyDetectorImpl.java */
    /* renamed from: io.grpc.h1.u1$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC9797c {
        /* renamed from: a */
        PasswordAuthentication mo13961a(String str, InetAddress inetAddress, int i, String str2, String str3, String str4);
    }

    public C9794u1() {
        this(f23007f, f23006e, System.getenv("GRPC_PROXY_EXP"));
    }

    /* renamed from: c */
    private AbstractC10091y0 m13964c(InetSocketAddress inetSocketAddress) throws IOException {
        try {
            try {
                URI uri = new URI("https", null, C9755r0.m14060h(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f23008a.get();
                if (proxySelector == null) {
                    f23005d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f23005d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication mo13961a = this.f23009b.mo13961a(C9755r0.m14060h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C9484b0.C9486b m14617e = C9484b0.m14617e();
                m14617e.m14613d(inetSocketAddress);
                m14617e.m14614c(inetSocketAddress2);
                if (mo13961a == null) {
                    return m14617e.m14616a();
                }
                m14617e.m14612e(mo13961a.getUserName());
                m14617e.m14615b(mo13961a.getPassword() != null ? new String(mo13961a.getPassword()) : null);
                return m14617e.m14616a();
            } catch (URISyntaxException e) {
                f23005d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
                return null;
            }
        } catch (Throwable th) {
            f23005d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    /* renamed from: d */
    private static InetSocketAddress m13963d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f23005d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], parseInt);
    }

    @Override // io.grpc.InterfaceC10094z0
    /* renamed from: a */
    public AbstractC10091y0 mo13073a(SocketAddress socketAddress) throws IOException {
        if (socketAddress instanceof InetSocketAddress) {
            if (this.f23010c != null) {
                C9484b0.C9486b m14617e = C9484b0.m14617e();
                m14617e.m14614c(this.f23010c);
                m14617e.m14613d((InetSocketAddress) socketAddress);
                return m14617e.m14616a();
            }
            return m13964c((InetSocketAddress) socketAddress);
        }
        return null;
    }

    C9794u1(InterfaceC5058r<ProxySelector> interfaceC5058r, InterfaceC9797c interfaceC9797c, String str) {
        C5051n.m25780n(interfaceC5058r);
        this.f23008a = interfaceC5058r;
        C5051n.m25780n(interfaceC9797c);
        this.f23009b = interfaceC9797c;
        if (str != null) {
            this.f23010c = m13963d(str);
        } else {
            this.f23010c = null;
        }
    }
}
