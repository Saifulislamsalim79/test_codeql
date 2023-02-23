package com.google.firebase.database.p129r;

import com.google.firebase.database.p129r.C5711r;
import com.google.firebase.database.p138t.C5899c;
import com.google.firebase.database.p138t.InterfaceC5900d;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Connection.java */
/* renamed from: com.google.firebase.database.r.h */
/* loaded from: classes2.dex */
public class C5680h implements C5711r.InterfaceC5714c {

    /* renamed from: f */
    private static long f13949f;

    /* renamed from: a */
    private C5688l f13950a;

    /* renamed from: b */
    private C5711r f13951b;

    /* renamed from: c */
    private InterfaceC5681a f13952c;

    /* renamed from: d */
    private EnumC5683c f13953d;

    /* renamed from: e */
    private final C5899c f13954e;

    /* compiled from: Connection.java */
    /* renamed from: com.google.firebase.database.r.h$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5681a {
        /* renamed from: e */
        void mo24119e(String str);

        /* renamed from: g */
        void mo24115g(String str);

        /* renamed from: i */
        void mo24111i(long j, String str);

        /* renamed from: n */
        void mo24101n(Map<String, Object> map);

        /* renamed from: p */
        void mo24097p(EnumC5682b enumC5682b);
    }

    /* compiled from: Connection.java */
    /* renamed from: com.google.firebase.database.r.h$b */
    /* loaded from: classes2.dex */
    public enum EnumC5682b {
        SERVER_RESET,
        OTHER
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Connection.java */
    /* renamed from: com.google.firebase.database.r.h$c */
    /* loaded from: classes2.dex */
    public enum EnumC5683c {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public C5680h(C5684i c5684i, C5688l c5688l, String str, InterfaceC5681a interfaceC5681a, String str2, String str3) {
        long j = f13949f;
        f13949f = 1 + j;
        this.f13950a = c5688l;
        this.f13952c = interfaceC5681a;
        InterfaceC5900d m24172f = c5684i.m24172f();
        this.f13954e = new C5899c(m24172f, "Connection", "conn_" + j);
        this.f13953d = EnumC5683c.REALTIME_CONNECTING;
        this.f13951b = new C5711r(c5684i, c5688l, str, str3, this, str2);
    }

    /* renamed from: e */
    private void m24186e(long j, String str) {
        if (this.f13954e.m23362f()) {
            this.f13954e.m23366b("realtime connection established", new Object[0]);
        }
        this.f13953d = EnumC5683c.REALTIME_CONNECTED;
        this.f13952c.mo24111i(j, str);
    }

    /* renamed from: f */
    private void m24185f(String str) {
        if (this.f13954e.m23362f()) {
            this.f13954e.m23366b("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.f13952c.mo24115g(str);
        m24188c();
    }

    /* renamed from: g */
    private void m24184g(Map<String, Object> map) {
        if (this.f13954e.m23362f()) {
            C5899c c5899c = this.f13954e;
            c5899c.m23366b("Got control message: " + map.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str != null) {
                if (str.equals("s")) {
                    m24185f((String) map.get("d"));
                    return;
                } else if (str.equals("r")) {
                    m24181j((String) map.get("d"));
                    return;
                } else if (str.equals("h")) {
                    m24182i((Map) map.get("d"));
                    return;
                } else if (this.f13954e.m23362f()) {
                    C5899c c5899c2 = this.f13954e;
                    c5899c2.m23366b("Ignoring unknown control message: " + str, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            if (this.f13954e.m23362f()) {
                C5899c c5899c3 = this.f13954e;
                c5899c3.m23366b("Got invalid control message: " + map.toString(), new Object[0]);
            }
            m24188c();
        } catch (ClassCastException e) {
            if (this.f13954e.m23362f()) {
                C5899c c5899c4 = this.f13954e;
                c5899c4.m23366b("Failed to parse control message: " + e.toString(), new Object[0]);
            }
            m24188c();
        }
    }

    /* renamed from: h */
    private void m24183h(Map<String, Object> map) {
        if (this.f13954e.m23362f()) {
            C5899c c5899c = this.f13954e;
            c5899c.m23366b("received data message: " + map.toString(), new Object[0]);
        }
        this.f13952c.mo24101n(map);
    }

    /* renamed from: i */
    private void m24182i(Map<String, Object> map) {
        long longValue = ((Long) map.get("ts")).longValue();
        this.f13952c.mo24119e((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.f13953d == EnumC5683c.REALTIME_CONNECTING) {
            this.f13951b.m24024y();
            m24186e(longValue, str);
        }
    }

    /* renamed from: j */
    private void m24181j(String str) {
        if (this.f13954e.m23362f()) {
            C5899c c5899c = this.f13954e;
            c5899c.m23366b("Got a reset; killing connection to " + this.f13950a.m24162b() + "; Updating internalHost to " + str, new Object[0]);
        }
        this.f13952c.mo24119e(str);
        m24187d(EnumC5682b.SERVER_RESET);
    }

    /* renamed from: l */
    private void m24179l(Map<String, Object> map, boolean z) {
        if (this.f13953d != EnumC5683c.REALTIME_CONNECTED) {
            this.f13954e.m23366b("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z) {
            this.f13954e.m23366b("Sending data (contents hidden)", new Object[0]);
        } else {
            this.f13954e.m23366b("Sending data: %s", map);
        }
        this.f13951b.m24027v(map);
    }

    @Override // com.google.firebase.database.p129r.C5711r.InterfaceC5714c
    /* renamed from: a */
    public void mo24023a(Map<String, Object> map) {
        try {
            String str = (String) map.get("t");
            if (str != null) {
                if (str.equals("d")) {
                    m24183h((Map) map.get("d"));
                    return;
                } else if (str.equals("c")) {
                    m24184g((Map) map.get("d"));
                    return;
                } else if (this.f13954e.m23362f()) {
                    C5899c c5899c = this.f13954e;
                    c5899c.m23366b("Ignoring unknown server message type: " + str, new Object[0]);
                    return;
                } else {
                    return;
                }
            }
            if (this.f13954e.m23362f()) {
                C5899c c5899c2 = this.f13954e;
                c5899c2.m23366b("Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
            }
            m24188c();
        } catch (ClassCastException e) {
            if (this.f13954e.m23362f()) {
                C5899c c5899c3 = this.f13954e;
                c5899c3.m23366b("Failed to parse server message: " + e.toString(), new Object[0]);
            }
            m24188c();
        }
    }

    @Override // com.google.firebase.database.p129r.C5711r.InterfaceC5714c
    /* renamed from: b */
    public void mo24022b(boolean z) {
        this.f13951b = null;
        if (!z && this.f13953d == EnumC5683c.REALTIME_CONNECTING) {
            if (this.f13954e.m23362f()) {
                this.f13954e.m23366b("Realtime connection failed", new Object[0]);
            }
        } else if (this.f13954e.m23362f()) {
            this.f13954e.m23366b("Realtime connection lost", new Object[0]);
        }
        m24188c();
    }

    /* renamed from: c */
    public void m24188c() {
        m24187d(EnumC5682b.OTHER);
    }

    /* renamed from: d */
    public void m24187d(EnumC5682b enumC5682b) {
        if (this.f13953d != EnumC5683c.REALTIME_DISCONNECTED) {
            if (this.f13954e.m23362f()) {
                this.f13954e.m23366b("closing realtime connection", new Object[0]);
            }
            this.f13953d = EnumC5683c.REALTIME_DISCONNECTED;
            C5711r c5711r = this.f13951b;
            if (c5711r != null) {
                c5711r.m24038k();
                this.f13951b = null;
            }
            this.f13952c.mo24097p(enumC5682b);
        }
    }

    /* renamed from: k */
    public void m24180k() {
        if (this.f13954e.m23362f()) {
            this.f13954e.m23366b("Opening a connection", new Object[0]);
        }
        this.f13951b.m24029t();
    }

    /* renamed from: m */
    public void m24178m(Map<String, Object> map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        m24179l(hashMap, z);
    }
}
