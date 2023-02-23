package io.grpc.p384h1;

import com.google.common.base.C5055p;
import io.grpc.p384h1.InterfaceC9773s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: Http2Ping.java */
/* renamed from: io.grpc.h1.v0 */
/* loaded from: classes2.dex */
public class C9799v0 {

    /* renamed from: g */
    private static final Logger f23011g = Logger.getLogger(C9799v0.class.getName());

    /* renamed from: a */
    private final long f23012a;

    /* renamed from: b */
    private final C5055p f23013b;

    /* renamed from: c */
    private Map<InterfaceC9773s.InterfaceC9774a, Executor> f23014c = new LinkedHashMap();

    /* renamed from: d */
    private boolean f23015d;

    /* renamed from: e */
    private Throwable f23016e;

    /* renamed from: f */
    private long f23017f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Ping.java */
    /* renamed from: io.grpc.h1.v0$a */
    /* loaded from: classes2.dex */
    public class RunnableC9800a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9773s.InterfaceC9774a f23018c;

        /* renamed from: d */
        final /* synthetic */ long f23019d;

        RunnableC9800a(InterfaceC9773s.InterfaceC9774a interfaceC9774a, long j) {
            this.f23018c = interfaceC9774a;
            this.f23019d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23018c.mo14030b(this.f23019d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Ping.java */
    /* renamed from: io.grpc.h1.v0$b */
    /* loaded from: classes2.dex */
    public class RunnableC9801b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ InterfaceC9773s.InterfaceC9774a f23020c;

        /* renamed from: d */
        final /* synthetic */ Throwable f23021d;

        RunnableC9801b(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Throwable th) {
            this.f23020c = interfaceC9774a;
            this.f23021d = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23020c.mo14031a(this.f23021d);
        }
    }

    public C9799v0(long j, C5055p c5055p) {
        this.f23012a = j;
        this.f23013b = c5055p;
    }

    /* renamed from: b */
    private static Runnable m13959b(InterfaceC9773s.InterfaceC9774a interfaceC9774a, long j) {
        return new RunnableC9800a(interfaceC9774a, j);
    }

    /* renamed from: c */
    private static Runnable m13958c(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Throwable th) {
        return new RunnableC9801b(interfaceC9774a, th);
    }

    /* renamed from: e */
    private static void m13956e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f23011g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    /* renamed from: g */
    public static void m13954g(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Executor executor, Throwable th) {
        m13956e(executor, m13958c(interfaceC9774a, th));
    }

    /* renamed from: a */
    public void m13960a(InterfaceC9773s.InterfaceC9774a interfaceC9774a, Executor executor) {
        synchronized (this) {
            if (!this.f23015d) {
                this.f23014c.put(interfaceC9774a, executor);
            } else {
                m13956e(executor, this.f23016e != null ? m13958c(interfaceC9774a, this.f23016e) : m13959b(interfaceC9774a, this.f23017f));
            }
        }
    }

    /* renamed from: d */
    public boolean m13957d() {
        synchronized (this) {
            if (this.f23015d) {
                return false;
            }
            this.f23015d = true;
            long m25763d = this.f23013b.m25763d(TimeUnit.NANOSECONDS);
            this.f23017f = m25763d;
            Map<InterfaceC9773s.InterfaceC9774a, Executor> map = this.f23014c;
            this.f23014c = null;
            for (Map.Entry<InterfaceC9773s.InterfaceC9774a, Executor> entry : map.entrySet()) {
                m13956e(entry.getValue(), m13959b(entry.getKey(), m25763d));
            }
            return true;
        }
    }

    /* renamed from: f */
    public void m13955f(Throwable th) {
        synchronized (this) {
            if (this.f23015d) {
                return;
            }
            this.f23015d = true;
            this.f23016e = th;
            Map<InterfaceC9773s.InterfaceC9774a, Executor> map = this.f23014c;
            this.f23014c = null;
            for (Map.Entry<InterfaceC9773s.InterfaceC9774a, Executor> entry : map.entrySet()) {
                m13954g(entry.getKey(), entry.getValue(), th);
            }
        }
    }

    /* renamed from: h */
    public long m13953h() {
        return this.f23012a;
    }
}
