package com.google.firebase.database.p129r;

import com.google.firebase.database.p129r.p130s.C5724b;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p138t.InterfaceC5900d;
import com.google.firebase.database.p140v.C5957b;
import com.google.firebase.database.tubesock.C5909c;
import com.google.firebase.database.tubesock.C5916f;
import com.google.firebase.database.tubesock.InterfaceC5914d;
import com.google.firebase.database.tubesock.WebSocketException;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebsocketConnection.java */
/* renamed from: com.google.firebase.database.r.r */
/* loaded from: classes2.dex */
public class C5711r {

    /* renamed from: l */
    private static long f14051l;

    /* renamed from: a */
    private InterfaceC5715d f14052a;

    /* renamed from: b */
    private boolean f14053b = false;

    /* renamed from: c */
    private boolean f14054c = false;

    /* renamed from: d */
    private long f14055d = 0;

    /* renamed from: e */
    private C5724b f14056e;

    /* renamed from: f */
    private InterfaceC5714c f14057f;

    /* renamed from: g */
    private ScheduledFuture<?> f14058g;

    /* renamed from: h */
    private ScheduledFuture<?> f14059h;

    /* renamed from: i */
    private final C5684i f14060i;

    /* renamed from: j */
    private final ScheduledExecutorService f14061j;

    /* renamed from: k */
    private final C5899c f14062k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebsocketConnection.java */
    /* renamed from: com.google.firebase.database.r.r$a */
    /* loaded from: classes2.dex */
    public class RunnableC5712a implements Runnable {
        RunnableC5712a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5711r.this.m24037l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebsocketConnection.java */
    /* renamed from: com.google.firebase.database.r.r$b */
    /* loaded from: classes2.dex */
    public class RunnableC5713b implements Runnable {
        RunnableC5713b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5711r.this.f14052a != null) {
                C5711r.this.f14052a.send("0");
                C5711r.this.m24028u();
            }
        }
    }

    /* compiled from: WebsocketConnection.java */
    /* renamed from: com.google.firebase.database.r.r$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC5714c {
        /* renamed from: a */
        void mo24023a(Map<String, Object> map);

        /* renamed from: b */
        void mo24022b(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebsocketConnection.java */
    /* renamed from: com.google.firebase.database.r.r$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC5715d {
        void close();

        void connect();

        void send(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebsocketConnection.java */
    /* renamed from: com.google.firebase.database.r.r$e */
    /* loaded from: classes2.dex */
    public class C5716e implements InterfaceC5715d, InterfaceC5914d {

        /* renamed from: a */
        private C5909c f14065a;

        /* compiled from: WebsocketConnection.java */
        /* renamed from: com.google.firebase.database.r.r$e$a */
        /* loaded from: classes2.dex */
        class RunnableC5717a implements Runnable {
            RunnableC5717a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5711r.this.f14059h.cancel(false);
                C5711r.this.f14053b = true;
                if (C5711r.this.f14062k.m23362f()) {
                    C5711r.this.f14062k.m23366b("websocket opened", new Object[0]);
                }
                C5711r.this.m24028u();
            }
        }

        /* compiled from: WebsocketConnection.java */
        /* renamed from: com.google.firebase.database.r.r$e$b */
        /* loaded from: classes2.dex */
        class RunnableC5718b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ String f14068c;

            RunnableC5718b(String str) {
                this.f14068c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5711r.this.m24034o(this.f14068c);
            }
        }

        /* compiled from: WebsocketConnection.java */
        /* renamed from: com.google.firebase.database.r.r$e$c */
        /* loaded from: classes2.dex */
        class RunnableC5719c implements Runnable {
            RunnableC5719c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C5711r.this.f14062k.m23362f()) {
                    C5711r.this.f14062k.m23366b(MetricTracker.Action.CLOSED, new Object[0]);
                }
                C5711r.this.m24030s();
            }
        }

        /* compiled from: WebsocketConnection.java */
        /* renamed from: com.google.firebase.database.r.r$e$d */
        /* loaded from: classes2.dex */
        class RunnableC5720d implements Runnable {

            /* renamed from: c */
            final /* synthetic */ WebSocketException f14071c;

            RunnableC5720d(WebSocketException webSocketException) {
                this.f14071c = webSocketException;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f14071c.getCause() == null || !(this.f14071c.getCause() instanceof EOFException)) {
                    C5711r.this.f14062k.m23367a("WebSocket error.", this.f14071c, new Object[0]);
                } else {
                    C5711r.this.f14062k.m23366b("WebSocket reached EOF.", new Object[0]);
                }
                C5711r.this.m24030s();
            }
        }

        /* synthetic */ C5716e(C5711r c5711r, C5909c c5909c, RunnableC5712a runnableC5712a) {
            this(c5909c);
        }

        /* renamed from: e */
        private void m24021e() {
            this.f14065a.m23347c();
            try {
                this.f14065a.m23348b();
            } catch (InterruptedException e) {
                C5711r.this.f14062k.m23365c("Interrupted while shutting down websocket threads", e);
            }
        }

        @Override // com.google.firebase.database.tubesock.InterfaceC5914d
        /* renamed from: a */
        public void mo23330a() {
            C5711r.this.f14061j.execute(new RunnableC5719c());
        }

        @Override // com.google.firebase.database.tubesock.InterfaceC5914d
        /* renamed from: b */
        public void mo23329b() {
            C5711r.this.f14061j.execute(new RunnableC5717a());
        }

        @Override // com.google.firebase.database.tubesock.InterfaceC5914d
        /* renamed from: c */
        public void mo23328c(C5916f c5916f) {
            String m23320a = c5916f.m23320a();
            if (C5711r.this.f14062k.m23362f()) {
                C5899c c5899c = C5711r.this.f14062k;
                c5899c.m23366b("ws message: " + m23320a, new Object[0]);
            }
            C5711r.this.f14061j.execute(new RunnableC5718b(m23320a));
        }

        @Override // com.google.firebase.database.p129r.C5711r.InterfaceC5715d
        public void close() {
            this.f14065a.m23347c();
        }

        @Override // com.google.firebase.database.p129r.C5711r.InterfaceC5715d
        public void connect() {
            try {
                this.f14065a.m23345e();
            } catch (WebSocketException e) {
                if (C5711r.this.f14062k.m23362f()) {
                    C5711r.this.f14062k.m23367a("Error connecting", e, new Object[0]);
                }
                m24021e();
            }
        }

        @Override // com.google.firebase.database.tubesock.InterfaceC5914d
        /* renamed from: d */
        public void mo23327d(WebSocketException webSocketException) {
            C5711r.this.f14061j.execute(new RunnableC5720d(webSocketException));
        }

        @Override // com.google.firebase.database.p129r.C5711r.InterfaceC5715d
        public void send(String str) {
            this.f14065a.m23334p(str);
        }

        private C5716e(C5909c c5909c) {
            this.f14065a = c5909c;
            c5909c.m23332r(this);
        }
    }

    public C5711r(C5684i c5684i, C5688l c5688l, String str, String str2, InterfaceC5714c interfaceC5714c, String str3) {
        this.f14060i = c5684i;
        this.f14061j = c5684i.m24173e();
        this.f14057f = interfaceC5714c;
        long j = f14051l;
        f14051l = 1 + j;
        InterfaceC5900d m24172f = c5684i.m24172f();
        this.f14062k = new C5899c(m24172f, "WebSocket", "ws_" + j);
        this.f14052a = m24036m(c5688l, str, str2, str3);
    }

    /* renamed from: j */
    private void m24039j(String str) {
        this.f14056e.m24007c(str);
        long j = this.f14055d - 1;
        this.f14055d = j;
        if (j == 0) {
            try {
                this.f14056e.m24008J();
                Map<String, Object> m23180a = C5957b.m23180a(this.f14056e.toString());
                this.f14056e = null;
                if (this.f14062k.m23362f()) {
                    C5899c c5899c = this.f14062k;
                    c5899c.m23366b("handleIncomingFrame complete frame: " + m23180a, new Object[0]);
                }
                this.f14057f.mo24023a(m23180a);
            } catch (IOException e) {
                C5899c c5899c2 = this.f14062k;
                c5899c2.m23365c("Error parsing frame: " + this.f14056e.toString(), e);
                m24038k();
                m24026w();
            } catch (ClassCastException e2) {
                C5899c c5899c3 = this.f14062k;
                c5899c3.m23365c("Error parsing frame (cast error): " + this.f14056e.toString(), e2);
                m24038k();
                m24026w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m24037l() {
        if (this.f14053b || this.f14054c) {
            return;
        }
        if (this.f14062k.m23362f()) {
            this.f14062k.m23366b("timed out on connect", new Object[0]);
        }
        this.f14052a.close();
    }

    /* renamed from: m */
    private InterfaceC5715d m24036m(C5688l c5688l, String str, String str2, String str3) {
        if (str == null) {
            str = c5688l.m24162b();
        }
        URI m24163a = C5688l.m24163a(str, c5688l.m24160d(), c5688l.m24161c(), str3);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", this.f14060i.m24170h());
        hashMap.put("X-Firebase-GMPID", this.f14060i.m24176b());
        hashMap.put("X-Firebase-AppCheck", str2);
        return new C5716e(this, new C5909c(this.f14060i, m24163a, null, hashMap), null);
    }

    /* renamed from: n */
    private String m24035n(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt > 0) {
                    m24033p(parseInt);
                    return null;
                }
                return null;
            } catch (NumberFormatException unused) {
            }
        }
        m24033p(1);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m24034o(String str) {
        if (this.f14054c) {
            return;
        }
        m24028u();
        if (m24032q()) {
            m24039j(str);
            return;
        }
        String m24035n = m24035n(str);
        if (m24035n != null) {
            m24039j(m24035n);
        }
    }

    /* renamed from: p */
    private void m24033p(int i) {
        this.f14055d = i;
        this.f14056e = new C5724b();
        if (this.f14062k.m23362f()) {
            C5899c c5899c = this.f14062k;
            c5899c.m23366b("HandleNewFrameCount: " + this.f14055d, new Object[0]);
        }
    }

    /* renamed from: q */
    private boolean m24032q() {
        return this.f14056e != null;
    }

    /* renamed from: r */
    private Runnable m24031r() {
        return new RunnableC5713b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m24030s() {
        if (!this.f14054c) {
            if (this.f14062k.m23362f()) {
                this.f14062k.m23366b("closing itself", new Object[0]);
            }
            m24026w();
        }
        this.f14052a = null;
        ScheduledFuture<?> scheduledFuture = this.f14058g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m24028u() {
        if (this.f14054c) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f14058g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (this.f14062k.m23362f()) {
                C5899c c5899c = this.f14062k;
                c5899c.m23366b("Reset keepAlive. Remaining: " + this.f14058g.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
            }
        } else if (this.f14062k.m23362f()) {
            this.f14062k.m23366b("Reset keepAlive", new Object[0]);
        }
        this.f14058g = this.f14061j.schedule(m24031r(), 45000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: w */
    private void m24026w() {
        this.f14054c = true;
        this.f14057f.mo24022b(this.f14053b);
    }

    /* renamed from: x */
    private static String[] m24025x(String str, int i) {
        int i2 = 0;
        if (str.length() <= i) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < str.length()) {
            int i3 = i2 + i;
            arrayList.add(str.substring(i2, Math.min(i3, str.length())));
            i2 = i3;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: k */
    public void m24038k() {
        if (this.f14062k.m23362f()) {
            this.f14062k.m23366b("websocket is being closed", new Object[0]);
        }
        this.f14054c = true;
        this.f14052a.close();
        ScheduledFuture<?> scheduledFuture = this.f14059h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture2 = this.f14058g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    /* renamed from: t */
    public void m24029t() {
        this.f14052a.connect();
        this.f14059h = this.f14061j.schedule(new RunnableC5712a(), 30000L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: v */
    public void m24027v(Map<String, Object> map) {
        m24028u();
        try {
            String[] m24025x = m24025x(C5957b.m23178c(map), 16384);
            if (m24025x.length > 1) {
                this.f14052a.send("" + m24025x.length);
            }
            for (String str : m24025x) {
                this.f14052a.send(str);
            }
        } catch (IOException e) {
            this.f14062k.m23365c("Failed to serialize message: " + map.toString(), e);
            m24026w();
        }
    }

    /* renamed from: y */
    public void m24024y() {
    }
}
