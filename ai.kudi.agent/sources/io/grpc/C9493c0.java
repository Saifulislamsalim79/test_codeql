package io.grpc;

import com.google.common.base.C5051n;
import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* compiled from: InternalChannelz.java */
/* renamed from: io.grpc.c0 */
/* loaded from: classes2.dex */
public final class C9493c0 {

    /* renamed from: d */
    private static final Logger f22180d = Logger.getLogger(C9493c0.class.getName());

    /* renamed from: e */
    private static final C9493c0 f22181e = new C9493c0();

    /* renamed from: a */
    private final ConcurrentNavigableMap<Long, InterfaceC9522g0<Object>> f22182a;

    /* renamed from: b */
    private final ConcurrentMap<Long, InterfaceC9522g0<Object>> f22183b;

    /* renamed from: c */
    private final ConcurrentMap<Long, InterfaceC9522g0<Object>> f22184c;

    /* compiled from: InternalChannelz.java */
    /* renamed from: io.grpc.c0$b */
    /* loaded from: classes2.dex */
    public static final class C9495b {
        public C9495b(C9496c c9496c) {
            C5051n.m25780n(c9496c);
        }
    }

    /* compiled from: InternalChannelz.java */
    /* renamed from: io.grpc.c0$c */
    /* loaded from: classes2.dex */
    public static final class C9496c {
        public C9496c(SSLSession sSLSession) {
            sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                Certificate certificate = localCertificates[0];
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    Certificate certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                C9493c0.f22180d.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e);
            }
        }
    }

    public C9493c0() {
        new ConcurrentSkipListMap();
        this.f22182a = new ConcurrentSkipListMap();
        this.f22183b = new ConcurrentHashMap();
        this.f22184c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    /* renamed from: b */
    private static <T extends InterfaceC9522g0<?>> void m14605b(Map<Long, T> map, T t) {
        map.put(Long.valueOf(t.mo13324f().m14524d()), t);
    }

    /* renamed from: f */
    public static long m14601f(InterfaceC10006l0 interfaceC10006l0) {
        return interfaceC10006l0.mo13324f().m14524d();
    }

    /* renamed from: g */
    public static C9493c0 m14600g() {
        return f22181e;
    }

    /* renamed from: h */
    private static <T extends InterfaceC9522g0<?>> void m14599h(Map<Long, T> map, T t) {
        map.remove(Long.valueOf(m14601f(t)));
    }

    /* renamed from: c */
    public void m14604c(InterfaceC9522g0<Object> interfaceC9522g0) {
        m14605b(this.f22184c, interfaceC9522g0);
    }

    /* renamed from: d */
    public void m14603d(InterfaceC9522g0<Object> interfaceC9522g0) {
        m14605b(this.f22182a, interfaceC9522g0);
    }

    /* renamed from: e */
    public void m14602e(InterfaceC9522g0<Object> interfaceC9522g0) {
        m14605b(this.f22183b, interfaceC9522g0);
    }

    /* renamed from: i */
    public void m14598i(InterfaceC9522g0<Object> interfaceC9522g0) {
        m14599h(this.f22184c, interfaceC9522g0);
    }

    /* renamed from: j */
    public void m14597j(InterfaceC9522g0<Object> interfaceC9522g0) {
        m14599h(this.f22182a, interfaceC9522g0);
    }

    /* renamed from: k */
    public void m14596k(InterfaceC9522g0<Object> interfaceC9522g0) {
        m14599h(this.f22183b, interfaceC9522g0);
    }
}
