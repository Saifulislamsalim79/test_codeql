package com.google.firebase.database.tubesock;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import com.google.firebase.database.p129r.C5684i;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p138t.InterfaceC5900d;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
/* compiled from: WebSocket.java */
/* renamed from: com.google.firebase.database.tubesock.c */
/* loaded from: classes2.dex */
public class C5909c {

    /* renamed from: l */
    private static final AtomicInteger f14501l = new AtomicInteger(0);

    /* renamed from: m */
    private static final Charset f14502m = Charset.forName("UTF-8");

    /* renamed from: n */
    private static ThreadFactory f14503n = Executors.defaultThreadFactory();

    /* renamed from: o */
    private static InterfaceC5908b f14504o = new C5910a();

    /* renamed from: d */
    private final URI f14508d;

    /* renamed from: e */
    private final String f14509e;

    /* renamed from: f */
    private final C5917g f14510f;

    /* renamed from: g */
    private final C5918h f14511g;

    /* renamed from: h */
    private final C5915e f14512h;

    /* renamed from: i */
    private final C5899c f14513i;

    /* renamed from: a */
    private volatile EnumC5913d f14505a = EnumC5913d.NONE;

    /* renamed from: b */
    private volatile Socket f14506b = null;

    /* renamed from: c */
    private InterfaceC5914d f14507c = null;

    /* renamed from: j */
    private final int f14514j = f14501l.incrementAndGet();

    /* renamed from: k */
    private final Thread f14515k = m23340j().newThread(new RunnableC5911b());

    /* compiled from: WebSocket.java */
    /* renamed from: com.google.firebase.database.tubesock.c$a */
    /* loaded from: classes2.dex */
    class C5910a implements InterfaceC5908b {
        C5910a() {
        }

        @Override // com.google.firebase.database.tubesock.InterfaceC5908b
        /* renamed from: a */
        public void mo23331a(Thread thread, String str) {
            thread.setName(str);
        }
    }

    /* compiled from: WebSocket.java */
    /* renamed from: com.google.firebase.database.tubesock.c$b */
    /* loaded from: classes2.dex */
    class RunnableC5911b implements Runnable {
        RunnableC5911b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5909c.this.m23336n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebSocket.java */
    /* renamed from: com.google.firebase.database.tubesock.c$c */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5912c {

        /* renamed from: a */
        static final /* synthetic */ int[] f14517a;

        static {
            int[] iArr = new int[EnumC5913d.values().length];
            f14517a = iArr;
            try {
                iArr[EnumC5913d.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14517a[EnumC5913d.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14517a[EnumC5913d.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14517a[EnumC5913d.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14517a[EnumC5913d.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebSocket.java */
    /* renamed from: com.google.firebase.database.tubesock.c$d */
    /* loaded from: classes2.dex */
    public enum EnumC5913d {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public C5909c(C5684i c5684i, URI uri, String str, Map<String, String> map) {
        this.f14508d = uri;
        this.f14509e = c5684i.m24171g();
        InterfaceC5900d m24172f = c5684i.m24172f();
        this.f14513i = new C5899c(m24172f, "WebSocket", "sk_" + this.f14514j);
        this.f14512h = new C5915e(uri, str, map);
        this.f14510f = new C5917g(this);
        this.f14511g = new C5918h(this, "TubeSock", this.f14514j);
    }

    /* renamed from: d */
    private synchronized void m23346d() {
        if (this.f14505a == EnumC5913d.DISCONNECTED) {
            return;
        }
        this.f14510f.m23312h();
        this.f14511g.m23303i();
        if (this.f14506b != null) {
            try {
                this.f14506b.close();
            } catch (Exception e) {
                this.f14507c.mo23327d(new WebSocketException("Failed to close", e));
            }
        }
        this.f14505a = EnumC5913d.DISCONNECTED;
        this.f14507c.mo23330a();
    }

    /* renamed from: f */
    private Socket m23344f() {
        String scheme = this.f14508d.getScheme();
        String host = this.f14508d.getHost();
        int port = this.f14508d.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e) {
                throw new WebSocketException("unknown host: " + host, e);
            } catch (IOException e2) {
                throw new WebSocketException("error while creating socket to " + this.f14508d, e2);
            }
        } else if (scheme != null && scheme.equals("wss")) {
            if (port == -1) {
                port = 443;
            }
            SSLSessionCache sSLSessionCache = null;
            try {
                if (this.f14509e != null) {
                    sSLSessionCache = new SSLSessionCache(new File(this.f14509e));
                }
            } catch (IOException e3) {
                this.f14513i.m23367a("Failed to initialize SSL session cache", e3, new Object[0]);
            }
            try {
                SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
                if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                    return sSLSocket;
                }
                throw new WebSocketException("Error while verifying secure socket to " + this.f14508d);
            } catch (UnknownHostException e4) {
                throw new WebSocketException("unknown host: " + host, e4);
            } catch (IOException e5) {
                throw new WebSocketException("error while creating secure socket to " + this.f14508d, e5);
            }
        } else {
            throw new WebSocketException("unsupported protocol: " + scheme);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static InterfaceC5908b m23341i() {
        return f14504o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static ThreadFactory m23340j() {
        return f14503n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m23336n() {
        try {
            try {
                Socket m23344f = m23344f();
                synchronized (this) {
                    this.f14506b = m23344f;
                    if (this.f14505a == EnumC5913d.DISCONNECTED) {
                        try {
                            this.f14506b.close();
                            this.f14506b = null;
                            return;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    DataInputStream dataInputStream = new DataInputStream(m23344f.getInputStream());
                    OutputStream outputStream = m23344f.getOutputStream();
                    outputStream.write(this.f14512h.m23324c());
                    byte[] bArr = new byte[1000];
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    while (true) {
                        int i = 0;
                        while (!z) {
                            int read = dataInputStream.read();
                            if (read != -1) {
                                bArr[i] = (byte) read;
                                i++;
                                if (bArr[i - 1] == 10 && bArr[i - 2] == 13) {
                                    String str = new String(bArr, f14502m);
                                    if (str.trim().equals("")) {
                                        z = true;
                                    } else {
                                        arrayList.add(str.trim());
                                    }
                                    bArr = new byte[1000];
                                } else if (i == 1000) {
                                    String str2 = new String(bArr, f14502m);
                                    throw new WebSocketException("Unexpected long line in handshake: " + str2);
                                }
                            } else {
                                throw new WebSocketException("Connection closed before handshake was complete");
                            }
                        }
                        this.f14512h.m23321f((String) arrayList.get(0));
                        arrayList.remove(0);
                        HashMap<String, String> hashMap = new HashMap<>();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String[] split = ((String) it.next()).split(": ", 2);
                            hashMap.put(split[0].toLowerCase(Locale.US), split[1].toLowerCase(Locale.US));
                        }
                        this.f14512h.m23322e(hashMap);
                        this.f14511g.m23304h(outputStream);
                        this.f14510f.m23313g(dataInputStream);
                        this.f14505a = EnumC5913d.CONNECTED;
                        this.f14511g.m23308d().start();
                        this.f14507c.mo23329b();
                        this.f14510f.m23314f();
                    }
                }
            } finally {
                m23347c();
            }
        } catch (WebSocketException e2) {
            this.f14507c.mo23327d(e2);
        } catch (Throwable th) {
            InterfaceC5914d interfaceC5914d = this.f14507c;
            interfaceC5914d.mo23327d(new WebSocketException("error while connecting: " + th.getMessage(), th));
        }
    }

    /* renamed from: o */
    private synchronized void m23335o(byte b, byte[] bArr) {
        if (this.f14505a != EnumC5913d.CONNECTED) {
            this.f14507c.mo23327d(new WebSocketException("error while sending data: not connected"));
        } else {
            try {
                this.f14511g.m23305g(b, true, bArr);
            } catch (IOException e) {
                this.f14507c.mo23327d(new WebSocketException("Failed to send frame", e));
                m23347c();
            }
        }
    }

    /* renamed from: q */
    private void m23333q() {
        try {
            this.f14505a = EnumC5913d.DISCONNECTING;
            this.f14511g.m23303i();
            this.f14511g.m23305g((byte) 8, true, new byte[0]);
        } catch (IOException e) {
            this.f14507c.mo23327d(new WebSocketException("Failed to send close frame", e));
        }
    }

    /* renamed from: b */
    public void m23348b() throws InterruptedException {
        if (this.f14511g.m23308d().getState() != Thread.State.NEW) {
            this.f14511g.m23308d().join();
        }
        m23342h().join();
    }

    /* renamed from: c */
    public synchronized void m23347c() {
        int i = C5912c.f14517a[this.f14505a.ordinal()];
        if (i == 1) {
            this.f14505a = EnumC5913d.DISCONNECTED;
        } else if (i == 2) {
            m23346d();
        } else if (i == 3) {
            m23333q();
        } else if (i != 4) {
            if (i != 5) {
            }
        }
    }

    /* renamed from: e */
    public synchronized void m23345e() {
        if (this.f14505a != EnumC5913d.NONE) {
            this.f14507c.mo23327d(new WebSocketException("connect() already called"));
            m23347c();
            return;
        }
        InterfaceC5908b m23341i = m23341i();
        Thread m23342h = m23342h();
        m23341i.mo23331a(m23342h, "TubeSockReader-" + this.f14514j);
        this.f14505a = EnumC5913d.CONNECTING;
        m23342h().start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC5914d m23343g() {
        return this.f14507c;
    }

    /* renamed from: h */
    Thread m23342h() {
        return this.f14515k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m23339k(WebSocketException webSocketException) {
        this.f14507c.mo23327d(webSocketException);
        if (this.f14505a == EnumC5913d.CONNECTED) {
            m23347c();
        }
        m23346d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m23338l() {
        m23346d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized void m23337m(byte[] bArr) {
        m23335o((byte) 10, bArr);
    }

    /* renamed from: p */
    public synchronized void m23334p(String str) {
        m23335o((byte) 1, str.getBytes(f14502m));
    }

    /* renamed from: r */
    public void m23332r(InterfaceC5914d interfaceC5914d) {
        this.f14507c = interfaceC5914d;
    }
}
