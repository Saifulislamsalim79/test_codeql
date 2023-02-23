package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.C14505g;
import p565l.p566g0.AbstractRunnableC14147b;
import p565l.p566g0.C14148c;
import p565l.p566g0.p571i.C14198f;
import p576m.C14342c;
import p576m.C14347f;
import p576m.InterfaceC14345d;
import p576m.InterfaceC14346e;
/* compiled from: Http2Connection.java */
/* renamed from: okhttp3.internal.http2.f */
/* loaded from: classes3.dex */
public final class C14490f implements Closeable {

    /* renamed from: M */
    private static final ExecutorService f31946M = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C14148c.m2811G("OkHttp Http2Connection", true));

    /* renamed from: A */
    private final ExecutorService f31947A;

    /* renamed from: B */
    final InterfaceC14515k f31948B;

    /* renamed from: C */
    private boolean f31949C;

    /* renamed from: E */
    long f31951E;

    /* renamed from: I */
    final Socket f31955I;

    /* renamed from: J */
    final C14512i f31956J;

    /* renamed from: K */
    final C14501j f31957K;

    /* renamed from: c */
    final boolean f31959c;

    /* renamed from: d */
    final AbstractC14498h f31960d;

    /* renamed from: f */
    final String f31962f;

    /* renamed from: w */
    int f31963w;

    /* renamed from: x */
    int f31964x;

    /* renamed from: y */
    boolean f31965y;

    /* renamed from: z */
    private final ScheduledExecutorService f31966z;

    /* renamed from: e */
    final Map<Integer, C14508h> f31961e = new LinkedHashMap();

    /* renamed from: D */
    long f31950D = 0;

    /* renamed from: F */
    C14517l f31952F = new C14517l();

    /* renamed from: G */
    final C14517l f31953G = new C14517l();

    /* renamed from: H */
    boolean f31954H = false;

    /* renamed from: L */
    final Set<Integer> f31958L = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$a */
    /* loaded from: classes3.dex */
    public class C14491a extends AbstractRunnableC14147b {

        /* renamed from: d */
        final /* synthetic */ int f31967d;

        /* renamed from: e */
        final /* synthetic */ EnumC14481a f31968e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14491a(String str, Object[] objArr, int i, EnumC14481a enumC14481a) {
            super(str, objArr);
            this.f31967d = i;
            this.f31968e = enumC14481a;
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        public void mo1487e() {
            try {
                C14490f.this.m1518E0(this.f31967d, this.f31968e);
            } catch (IOException unused) {
                C14490f.this.m1513J();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$b */
    /* loaded from: classes3.dex */
    public class C14492b extends AbstractRunnableC14147b {

        /* renamed from: d */
        final /* synthetic */ int f31970d;

        /* renamed from: e */
        final /* synthetic */ long f31971e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14492b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f31970d = i;
            this.f31971e = j;
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        public void mo1487e() {
            try {
                C14490f.this.f31956J.windowUpdate(this.f31970d, this.f31971e);
            } catch (IOException unused) {
                C14490f.this.m1513J();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$c */
    /* loaded from: classes3.dex */
    public class C14493c extends AbstractRunnableC14147b {

        /* renamed from: d */
        final /* synthetic */ int f31973d;

        /* renamed from: e */
        final /* synthetic */ List f31974e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14493c(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f31973d = i;
            this.f31974e = list;
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        public void mo1487e() {
            if (C14490f.this.f31948B.onRequest(this.f31973d, this.f31974e)) {
                try {
                    C14490f.this.f31956J.m1435O(this.f31973d, EnumC14481a.CANCEL);
                    synchronized (C14490f.this) {
                        C14490f.this.f31958L.remove(Integer.valueOf(this.f31973d));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$d */
    /* loaded from: classes3.dex */
    public class C14494d extends AbstractRunnableC14147b {

        /* renamed from: d */
        final /* synthetic */ int f31976d;

        /* renamed from: e */
        final /* synthetic */ List f31977e;

        /* renamed from: f */
        final /* synthetic */ boolean f31978f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14494d(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f31976d = i;
            this.f31977e = list;
            this.f31978f = z;
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        public void mo1487e() {
            boolean onHeaders = C14490f.this.f31948B.onHeaders(this.f31976d, this.f31977e, this.f31978f);
            if (onHeaders) {
                try {
                    C14490f.this.f31956J.m1435O(this.f31976d, EnumC14481a.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (onHeaders || this.f31978f) {
                synchronized (C14490f.this) {
                    C14490f.this.f31958L.remove(Integer.valueOf(this.f31976d));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$e */
    /* loaded from: classes3.dex */
    public class C14495e extends AbstractRunnableC14147b {

        /* renamed from: d */
        final /* synthetic */ int f31980d;

        /* renamed from: e */
        final /* synthetic */ C14342c f31981e;

        /* renamed from: f */
        final /* synthetic */ int f31982f;

        /* renamed from: w */
        final /* synthetic */ boolean f31983w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14495e(String str, Object[] objArr, int i, C14342c c14342c, int i2, boolean z) {
            super(str, objArr);
            this.f31980d = i;
            this.f31981e = c14342c;
            this.f31982f = i2;
            this.f31983w = z;
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        public void mo1487e() {
            try {
                boolean mo1419b = C14490f.this.f31948B.mo1419b(this.f31980d, this.f31981e, this.f31982f, this.f31983w);
                if (mo1419b) {
                    C14490f.this.f31956J.m1435O(this.f31980d, EnumC14481a.CANCEL);
                }
                if (mo1419b || this.f31983w) {
                    synchronized (C14490f.this) {
                        C14490f.this.f31958L.remove(Integer.valueOf(this.f31980d));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$f */
    /* loaded from: classes3.dex */
    public class C14496f extends AbstractRunnableC14147b {

        /* renamed from: d */
        final /* synthetic */ int f31985d;

        /* renamed from: e */
        final /* synthetic */ EnumC14481a f31986e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14496f(String str, Object[] objArr, int i, EnumC14481a enumC14481a) {
            super(str, objArr);
            this.f31985d = i;
            this.f31986e = enumC14481a;
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        public void mo1487e() {
            C14490f.this.f31948B.mo1420a(this.f31985d, this.f31986e);
            synchronized (C14490f.this) {
                C14490f.this.f31958L.remove(Integer.valueOf(this.f31985d));
            }
        }
    }

    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$g */
    /* loaded from: classes3.dex */
    public static class C14497g {

        /* renamed from: a */
        Socket f31988a;

        /* renamed from: b */
        String f31989b;

        /* renamed from: c */
        InterfaceC14346e f31990c;

        /* renamed from: d */
        InterfaceC14345d f31991d;

        /* renamed from: e */
        AbstractC14498h f31992e = AbstractC14498h.f31996a;

        /* renamed from: f */
        InterfaceC14515k f31993f = InterfaceC14515k.f32056a;

        /* renamed from: g */
        boolean f31994g;

        /* renamed from: h */
        int f31995h;

        public C14497g(boolean z) {
            this.f31994g = z;
        }

        /* renamed from: a */
        public C14490f m1494a() {
            return new C14490f(this);
        }

        /* renamed from: b */
        public C14497g m1493b(AbstractC14498h abstractC14498h) {
            this.f31992e = abstractC14498h;
            return this;
        }

        /* renamed from: c */
        public C14497g m1492c(int i) {
            this.f31995h = i;
            return this;
        }

        /* renamed from: d */
        public C14497g m1491d(Socket socket, String str, InterfaceC14346e interfaceC14346e, InterfaceC14345d interfaceC14345d) {
            this.f31988a = socket;
            this.f31989b = str;
            this.f31990c = interfaceC14346e;
            this.f31991d = interfaceC14345d;
            return this;
        }
    }

    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$h */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14498h {

        /* renamed from: a */
        public static final AbstractC14498h f31996a = new C14499a();

        /* compiled from: Http2Connection.java */
        /* renamed from: okhttp3.internal.http2.f$h$a */
        /* loaded from: classes3.dex */
        class C14499a extends AbstractC14498h {
            C14499a() {
            }

            @Override // okhttp3.internal.http2.C14490f.AbstractC14498h
            /* renamed from: b */
            public void mo1489b(C14508h c14508h) throws IOException {
                c14508h.m1461f(EnumC14481a.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo1490a(C14490f c14490f) {
        }

        /* renamed from: b */
        public abstract void mo1489b(C14508h c14508h) throws IOException;
    }

    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$i */
    /* loaded from: classes3.dex */
    final class C14500i extends AbstractRunnableC14147b {

        /* renamed from: d */
        final boolean f31997d;

        /* renamed from: e */
        final int f31998e;

        /* renamed from: f */
        final int f31999f;

        C14500i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C14490f.this.f31962f, Integer.valueOf(i), Integer.valueOf(i2));
            this.f31997d = z;
            this.f31998e = i;
            this.f31999f = i2;
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        public void mo1487e() {
            C14490f.this.m1519D0(this.f31997d, this.f31998e, this.f31999f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Http2Connection.java */
    /* renamed from: okhttp3.internal.http2.f$j */
    /* loaded from: classes3.dex */
    public class C14501j extends AbstractRunnableC14147b implements C14505g.InterfaceC14507b {

        /* renamed from: d */
        final C14505g f32001d;

        /* compiled from: Http2Connection.java */
        /* renamed from: okhttp3.internal.http2.f$j$a */
        /* loaded from: classes3.dex */
        class C14502a extends AbstractRunnableC14147b {

            /* renamed from: d */
            final /* synthetic */ C14508h f32003d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14502a(String str, Object[] objArr, C14508h c14508h) {
                super(str, objArr);
                this.f32003d = c14508h;
            }

            @Override // p565l.p566g0.AbstractRunnableC14147b
            /* renamed from: e */
            public void mo1487e() {
                try {
                    C14490f.this.f31960d.mo1489b(this.f32003d);
                } catch (IOException e) {
                    C14198f m2653j = C14198f.m2653j();
                    m2653j.mo2646q(4, "Http2Connection.Listener failure for " + C14490f.this.f31962f, e);
                    try {
                        this.f32003d.m1461f(EnumC14481a.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: Http2Connection.java */
        /* renamed from: okhttp3.internal.http2.f$j$b */
        /* loaded from: classes3.dex */
        class C14503b extends AbstractRunnableC14147b {
            C14503b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // p565l.p566g0.AbstractRunnableC14147b
            /* renamed from: e */
            public void mo1487e() {
                C14490f c14490f = C14490f.this;
                c14490f.f31960d.mo1490a(c14490f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Http2Connection.java */
        /* renamed from: okhttp3.internal.http2.f$j$c */
        /* loaded from: classes3.dex */
        public class C14504c extends AbstractRunnableC14147b {

            /* renamed from: d */
            final /* synthetic */ C14517l f32006d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14504c(String str, Object[] objArr, C14517l c14517l) {
                super(str, objArr);
                this.f32006d = c14517l;
            }

            @Override // p565l.p566g0.AbstractRunnableC14147b
            /* renamed from: e */
            public void mo1487e() {
                try {
                    C14490f.this.f31956J.m1429c(this.f32006d);
                } catch (IOException unused) {
                    C14490f.this.m1513J();
                }
            }
        }

        C14501j(C14505g c14505g) {
            super("OkHttp %s", C14490f.this.f31962f);
            this.f32001d = c14505g;
        }

        /* renamed from: f */
        private void m1488f(C14517l c14517l) {
            try {
                C14490f.this.f31966z.execute(new C14504c("OkHttp %s ACK Settings", new Object[]{C14490f.this.f31962f}, c14517l));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        /* renamed from: a */
        public void mo1470a(boolean z, int i, InterfaceC14346e interfaceC14346e, int i2) throws IOException {
            if (C14490f.this.m1499o0(i)) {
                C14490f.this.m1507b0(i, interfaceC14346e, i2, z);
                return;
            }
            C14508h m1512O = C14490f.this.m1512O(i);
            if (m1512O == null) {
                C14490f.this.m1516F0(i, EnumC14481a.PROTOCOL_ERROR);
                long j = i2;
                C14490f.this.m1521A0(j);
                interfaceC14346e.mo1994a(j);
                return;
            }
            m1512O.m1452o(interfaceC14346e, i2);
            if (z) {
                m1512O.m1451p();
            }
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        /* renamed from: b */
        public void mo1469b(boolean z, C14517l c14517l) {
            C14508h[] c14508hArr;
            long j;
            int i;
            synchronized (C14490f.this) {
                int m1415d = C14490f.this.f31953G.m1415d();
                if (z) {
                    C14490f.this.f31953G.m1418a();
                }
                C14490f.this.f31953G.m1411h(c14517l);
                m1488f(c14517l);
                int m1415d2 = C14490f.this.f31953G.m1415d();
                c14508hArr = null;
                if (m1415d2 == -1 || m1415d2 == m1415d) {
                    j = 0;
                } else {
                    j = m1415d2 - m1415d;
                    if (!C14490f.this.f31954H) {
                        C14490f.this.f31954H = true;
                    }
                    if (!C14490f.this.f31961e.isEmpty()) {
                        c14508hArr = (C14508h[]) C14490f.this.f31961e.values().toArray(new C14508h[C14490f.this.f31961e.size()]);
                    }
                }
                C14490f.f31946M.execute(new C14503b("OkHttp %s settings", C14490f.this.f31962f));
            }
            if (c14508hArr == null || j == 0) {
                return;
            }
            for (C14508h c14508h : c14508hArr) {
                synchronized (c14508h) {
                    c14508h.m1464c(j);
                }
            }
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        /* renamed from: c */
        public void mo1468c(int i, EnumC14481a enumC14481a) {
            if (C14490f.this.m1499o0(i)) {
                C14490f.this.m1501k0(i, enumC14481a);
                return;
            }
            C14508h m1498u0 = C14490f.this.m1498u0(i);
            if (m1498u0 != null) {
                m1498u0.m1449r(enumC14481a);
            }
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        /* renamed from: d */
        public void mo1467d(int i, EnumC14481a enumC14481a, C14347f c14347f) {
            C14508h[] c14508hArr;
            c14347f.mo1969A();
            synchronized (C14490f.this) {
                c14508hArr = (C14508h[]) C14490f.this.f31961e.values().toArray(new C14508h[C14490f.this.f31961e.size()]);
                C14490f.this.f31965y = true;
            }
            for (C14508h c14508h : c14508hArr) {
                if (c14508h.m1458i() > i && c14508h.m1455l()) {
                    c14508h.m1449r(EnumC14481a.REFUSED_STREAM);
                    C14490f.this.m1498u0(c14508h.m1458i());
                }
            }
        }

        @Override // p565l.p566g0.AbstractRunnableC14147b
        /* renamed from: e */
        protected void mo1487e() {
            EnumC14481a enumC14481a;
            C14490f c14490f;
            EnumC14481a enumC14481a2 = EnumC14481a.INTERNAL_ERROR;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    this.f32001d.m1472m(this);
                    while (this.f32001d.m1475g(false, this)) {
                    }
                    enumC14481a = EnumC14481a.NO_ERROR;
                } catch (IOException unused) {
                }
                try {
                    enumC14481a2 = EnumC14481a.CANCEL;
                    c14490f = C14490f.this;
                } catch (IOException unused2) {
                    enumC14481a = EnumC14481a.PROTOCOL_ERROR;
                    enumC14481a2 = EnumC14481a.PROTOCOL_ERROR;
                    c14490f = C14490f.this;
                    c14490f.m1514I(enumC14481a, enumC14481a2);
                    C14148c.m2801g(this.f32001d);
                }
            } catch (IOException unused3) {
            } catch (Throwable th2) {
                th = th2;
                enumC14481a = enumC14481a2;
                try {
                    C14490f.this.m1514I(enumC14481a, enumC14481a2);
                } catch (IOException unused4) {
                }
                C14148c.m2801g(this.f32001d);
                throw th;
            }
            c14490f.m1514I(enumC14481a, enumC14481a2);
            C14148c.m2801g(this.f32001d);
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        public void headers(boolean z, int i, int i2, List<C14482b> list) {
            if (C14490f.this.m1499o0(i)) {
                C14490f.this.m1503g0(i, list, z);
                return;
            }
            synchronized (C14490f.this) {
                C14508h m1512O = C14490f.this.m1512O(i);
                if (m1512O == null) {
                    if (C14490f.this.f31965y) {
                        return;
                    }
                    if (i <= C14490f.this.f31963w) {
                        return;
                    }
                    if (i % 2 == C14490f.this.f31964x % 2) {
                        return;
                    }
                    C14508h c14508h = new C14508h(i, C14490f.this, false, z, C14148c.m2810H(list));
                    C14490f.this.f31963w = i;
                    C14490f.this.f31961e.put(Integer.valueOf(i), c14508h);
                    C14490f.f31946M.execute(new C14502a("OkHttp %s stream %d", new Object[]{C14490f.this.f31962f, Integer.valueOf(i)}, c14508h));
                    return;
                }
                m1512O.m1450q(list);
                if (z) {
                    m1512O.m1451p();
                }
            }
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        public void ping(boolean z, int i, int i2) {
            if (z) {
                synchronized (C14490f.this) {
                    C14490f.this.f31949C = false;
                    C14490f.this.notifyAll();
                }
                return;
            }
            try {
                C14490f.this.f31966z.execute(new C14500i(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        public void pushPromise(int i, int i2, List<C14482b> list) {
            C14490f.this.m1502i0(i2, list);
        }

        @Override // okhttp3.internal.http2.C14505g.InterfaceC14507b
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (C14490f.this) {
                    C14490f.this.f31951E += j;
                    C14490f.this.notifyAll();
                }
                return;
            }
            C14508h m1512O = C14490f.this.m1512O(i);
            if (m1512O != null) {
                synchronized (m1512O) {
                    m1512O.m1464c(j);
                }
            }
        }
    }

    C14490f(C14497g c14497g) {
        this.f31948B = c14497g.f31993f;
        boolean z = c14497g.f31994g;
        this.f31959c = z;
        this.f31960d = c14497g.f31992e;
        int i = z ? 1 : 2;
        this.f31964x = i;
        if (c14497g.f31994g) {
            this.f31964x = i + 2;
        }
        if (c14497g.f31994g) {
            this.f31952F.m1410i(7, 16777216);
        }
        this.f31962f = c14497g.f31989b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C14148c.m2811G(C14148c.m2790r("OkHttp %s Writer", this.f31962f), false));
        this.f31966z = scheduledThreadPoolExecutor;
        if (c14497g.f31995h != 0) {
            C14500i c14500i = new C14500i(false, 0, 0);
            int i2 = c14497g.f31995h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c14500i, i2, i2, TimeUnit.MILLISECONDS);
        }
        this.f31947A = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C14148c.m2811G(C14148c.m2790r("OkHttp %s Push Observer", this.f31962f), true));
        this.f31953G.m1410i(7, 65535);
        this.f31953G.m1410i(5, 16384);
        this.f31951E = this.f31953G.m1415d();
        this.f31955I = c14497g.f31988a;
        this.f31956J = new C14512i(c14497g.f31991d, this.f31959c);
        this.f31957K = new C14501j(new C14505g(c14497g.f31990c, this.f31959c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m1513J() {
        try {
            m1514I(EnumC14481a.PROTOCOL_ERROR, EnumC14481a.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x0075, TryCatch #1 {, blocks: (B:4:0x0006, B:24:0x004f, B:28:0x005e, B:25:0x0055, B:27:0x0059, B:32:0x0067, B:33:0x006e, B:5:0x0007, B:7:0x000e, B:8:0x0013, B:10:0x0017, B:12:0x002b, B:14:0x0033, B:19:0x003d, B:21:0x0043, B:22:0x004c, B:34:0x006f, B:35:0x0074), top: B:42:0x0006 }] */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private okhttp3.internal.http2.C14508h m1509X(int r11, java.util.List<okhttp3.internal.http2.C14482b> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.i r7 = r10.f31956J
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L78
            int r0 = r10.f31964x     // Catch: java.lang.Throwable -> L75
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L13
            okhttp3.internal.http2.a r0 = okhttp3.internal.http2.EnumC14481a.REFUSED_STREAM     // Catch: java.lang.Throwable -> L75
            r10.m1497w0(r0)     // Catch: java.lang.Throwable -> L75
        L13:
            boolean r0 = r10.f31965y     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L6f
            int r8 = r10.f31964x     // Catch: java.lang.Throwable -> L75
            int r0 = r10.f31964x     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + 2
            r10.f31964x = r0     // Catch: java.lang.Throwable -> L75
            okhttp3.internal.http2.h r9 = new okhttp3.internal.http2.h     // Catch: java.lang.Throwable -> L75
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L75
            if (r13 == 0) goto L3c
            long r0 = r10.f31951E     // Catch: java.lang.Throwable -> L75
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L3c
            long r0 = r9.f32020b     // Catch: java.lang.Throwable -> L75
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L3a
            goto L3c
        L3a:
            r13 = 0
            goto L3d
        L3c:
            r13 = 1
        L3d:
            boolean r0 = r9.m1454m()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L4c
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r10.f31961e     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L75
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L75
        L4c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L75
            if (r11 != 0) goto L55
            okhttp3.internal.http2.i r0 = r10.f31956J     // Catch: java.lang.Throwable -> L78
            r0.m1433V(r6, r8, r11, r12)     // Catch: java.lang.Throwable -> L78
            goto L5e
        L55:
            boolean r0 = r10.f31959c     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L67
            okhttp3.internal.http2.i r0 = r10.f31956J     // Catch: java.lang.Throwable -> L78
            r0.m1436J(r11, r8, r12)     // Catch: java.lang.Throwable -> L78
        L5e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
            if (r13 == 0) goto L66
            okhttp3.internal.http2.i r11 = r10.f31956J
            r11.flush()
        L66:
            return r9
        L67:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L78
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L78
            throw r11     // Catch: java.lang.Throwable -> L78
        L6f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L75
            r11.<init>()     // Catch: java.lang.Throwable -> L75
            throw r11     // Catch: java.lang.Throwable -> L75
        L75:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L75
            throw r11     // Catch: java.lang.Throwable -> L78
        L78:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L78
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C14490f.m1509X(int, java.util.List, boolean):okhttp3.internal.http2.h");
    }

    /* renamed from: f0 */
    private synchronized void m1505f0(AbstractRunnableC14147b abstractRunnableC14147b) {
        if (!m1511P()) {
            this.f31947A.execute(abstractRunnableC14147b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public synchronized void m1521A0(long j) {
        long j2 = this.f31950D + j;
        this.f31950D = j2;
        if (j2 >= this.f31952F.m1415d() / 2) {
            m1515H0(0, this.f31950D);
            this.f31950D = 0L;
        }
    }

    /* renamed from: C0 */
    public void m1520C0(int i, boolean z, C14342c c14342c, long j) throws IOException {
        int min;
        long j2;
        if (j == 0) {
            this.f31956J.m1432W(z, i, c14342c, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.f31951E <= 0) {
                    try {
                        if (this.f31961e.containsKey(Integer.valueOf(i))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.f31951E), this.f31956J.maxDataLength());
                j2 = min;
                this.f31951E -= j2;
            }
            j -= j2;
            this.f31956J.m1432W(z && j == 0, i, c14342c, min);
        }
    }

    /* renamed from: D0 */
    void m1519D0(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f31949C;
                this.f31949C = true;
            }
            if (z2) {
                m1513J();
                return;
            }
        }
        try {
            this.f31956J.ping(z, i, i2);
        } catch (IOException unused) {
            m1513J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m1518E0(int i, EnumC14481a enumC14481a) throws IOException {
        this.f31956J.m1435O(i, enumC14481a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public void m1516F0(int i, EnumC14481a enumC14481a) {
        try {
            this.f31966z.execute(new C14491a("OkHttp %s stream %d", new Object[]{this.f31962f, Integer.valueOf(i)}, i, enumC14481a));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H0 */
    public void m1515H0(int i, long j) {
        try {
            this.f31966z.execute(new C14492b("OkHttp Window Update %s stream %d", new Object[]{this.f31962f, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: I */
    void m1514I(EnumC14481a enumC14481a, EnumC14481a enumC14481a2) throws IOException {
        C14508h[] c14508hArr = null;
        try {
            m1497w0(enumC14481a);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f31961e.isEmpty()) {
                c14508hArr = (C14508h[]) this.f31961e.values().toArray(new C14508h[this.f31961e.size()]);
                this.f31961e.clear();
            }
        }
        if (c14508hArr != null) {
            for (C14508h c14508h : c14508hArr) {
                try {
                    c14508h.m1461f(enumC14481a2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f31956J.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f31955I.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f31966z.shutdown();
        this.f31947A.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: O */
    synchronized C14508h m1512O(int i) {
        return this.f31961e.get(Integer.valueOf(i));
    }

    /* renamed from: P */
    public synchronized boolean m1511P() {
        return this.f31965y;
    }

    /* renamed from: V */
    public synchronized int m1510V() {
        return this.f31953G.m1414e(Integer.MAX_VALUE);
    }

    /* renamed from: Z */
    public C14508h m1508Z(List<C14482b> list, boolean z) throws IOException {
        return m1509X(0, list, z);
    }

    /* renamed from: b0 */
    void m1507b0(int i, InterfaceC14346e interfaceC14346e, int i2, boolean z) throws IOException {
        C14342c c14342c = new C14342c();
        long j = i2;
        interfaceC14346e.mo1978z(j);
        interfaceC14346e.mo312O0(c14342c, j);
        if (c14342c.m2072F0() == j) {
            m1505f0(new C14495e("OkHttp %s Push Data[%s]", new Object[]{this.f31962f, Integer.valueOf(i)}, i, c14342c, i2, z));
            return;
        }
        throw new IOException(c14342c.m2072F0() + " != " + i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m1514I(EnumC14481a.NO_ERROR, EnumC14481a.CANCEL);
    }

    public void flush() throws IOException {
        this.f31956J.flush();
    }

    /* renamed from: g0 */
    void m1503g0(int i, List<C14482b> list, boolean z) {
        try {
            m1505f0(new C14494d("OkHttp %s Push Headers[%s]", new Object[]{this.f31962f, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: i0 */
    void m1502i0(int i, List<C14482b> list) {
        synchronized (this) {
            if (this.f31958L.contains(Integer.valueOf(i))) {
                m1516F0(i, EnumC14481a.PROTOCOL_ERROR);
                return;
            }
            this.f31958L.add(Integer.valueOf(i));
            try {
                m1505f0(new C14493c("OkHttp %s Push Request[%s]", new Object[]{this.f31962f, Integer.valueOf(i)}, i, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: k0 */
    void m1501k0(int i, EnumC14481a enumC14481a) {
        m1505f0(new C14496f("OkHttp %s Push Reset[%s]", new Object[]{this.f31962f, Integer.valueOf(i)}, i, enumC14481a));
    }

    /* renamed from: o0 */
    boolean m1499o0(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public synchronized C14508h m1498u0(int i) {
        C14508h remove;
        remove = this.f31961e.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* renamed from: w0 */
    public void m1497w0(EnumC14481a enumC14481a) throws IOException {
        synchronized (this.f31956J) {
            synchronized (this) {
                if (this.f31965y) {
                    return;
                }
                this.f31965y = true;
                this.f31956J.m1438F(this.f31963w, enumC14481a, C14148c.f30905a);
            }
        }
    }

    /* renamed from: x0 */
    public void m1496x0() throws IOException {
        m1495z0(true);
    }

    /* renamed from: z0 */
    void m1495z0(boolean z) throws IOException {
        if (z) {
            this.f31956J.connectionPreface();
            this.f31956J.m1434P(this.f31952F);
            int m1415d = this.f31952F.m1415d();
            if (m1415d != 65535) {
                this.f31956J.windowUpdate(0, m1415d - 65535);
            }
        }
        new Thread(this.f31957K).start();
    }
}
