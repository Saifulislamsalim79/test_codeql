package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.InterfaceC2966d;
import com.google.firebase.remoteconfig.InterfaceC6771n;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
/* compiled from: ConfigGetParameterHandler.java */
/* renamed from: com.google.firebase.remoteconfig.internal.m */
/* loaded from: classes2.dex */
public class C6759m {

    /* renamed from: e */
    static final Pattern f16272e;

    /* renamed from: f */
    static final Pattern f16273f;

    /* renamed from: a */
    private final Set<InterfaceC2966d<String, C6754k>> f16274a = new HashSet();

    /* renamed from: b */
    private final Executor f16275b;

    /* renamed from: c */
    private final C6751j f16276c;

    /* renamed from: d */
    private final C6751j f16277d;

    static {
        Charset.forName("UTF-8");
        f16272e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f16273f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C6759m(Executor executor, C6751j c6751j, C6751j c6751j2) {
        this.f16275b = executor;
        this.f16276c = c6751j;
        this.f16277d = c6751j2;
    }

    /* renamed from: b */
    private void m20839b(final String str, final C6754k c6754k) {
        if (c6754k == null) {
            return;
        }
        synchronized (this.f16274a) {
            for (final InterfaceC2966d<String, C6754k> interfaceC2966d : this.f16274a) {
                this.f16275b.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2966d.this.mo20907a(str, c6754k);
                    }
                });
            }
        }
    }

    /* renamed from: e */
    private static C6754k m20836e(C6751j c6751j) {
        return c6751j.m20889d();
    }

    /* renamed from: f */
    private static Set<String> m20835f(C6751j c6751j) {
        HashSet hashSet = new HashSet();
        C6754k m20836e = m20836e(c6751j);
        if (m20836e == null) {
            return hashSet;
        }
        Iterator<String> keys = m20836e.m20876d().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: h */
    private static String m20833h(C6751j c6751j, String str) {
        C6754k m20836e = m20836e(c6751j);
        if (m20836e == null) {
            return null;
        }
        try {
            return m20836e.m20876d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: k */
    private static void m20830k(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    /* renamed from: a */
    public void m20840a(InterfaceC2966d<String, C6754k> interfaceC2966d) {
        synchronized (this.f16274a) {
            this.f16274a.add(interfaceC2966d);
        }
    }

    /* renamed from: c */
    public Map<String, InterfaceC6771n> m20838c() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(m20835f(this.f16276c));
        hashSet.addAll(m20835f(this.f16277d));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, m20832i(str));
        }
        return hashMap;
    }

    /* renamed from: d */
    public boolean m20837d(String str) {
        String m20833h = m20833h(this.f16276c, str);
        if (m20833h != null) {
            if (f16272e.matcher(m20833h).matches()) {
                m20839b(str, m20836e(this.f16276c));
                return true;
            } else if (f16273f.matcher(m20833h).matches()) {
                m20839b(str, m20836e(this.f16276c));
                return false;
            }
        }
        String m20833h2 = m20833h(this.f16277d, str);
        if (m20833h2 != null) {
            if (f16272e.matcher(m20833h2).matches()) {
                return true;
            }
            if (f16273f.matcher(m20833h2).matches()) {
                return false;
            }
        }
        m20830k(str, "Boolean");
        return false;
    }

    /* renamed from: g */
    public String m20834g(String str) {
        String m20833h = m20833h(this.f16276c, str);
        if (m20833h != null) {
            m20839b(str, m20836e(this.f16276c));
            return m20833h;
        }
        String m20833h2 = m20833h(this.f16277d, str);
        if (m20833h2 != null) {
            return m20833h2;
        }
        m20830k(str, "String");
        return "";
    }

    /* renamed from: i */
    public InterfaceC6771n m20832i(String str) {
        String m20833h = m20833h(this.f16276c, str);
        if (m20833h != null) {
            m20839b(str, m20836e(this.f16276c));
            return new C6767r(m20833h, 2);
        }
        String m20833h2 = m20833h(this.f16277d, str);
        if (m20833h2 != null) {
            return new C6767r(m20833h2, 1);
        }
        m20830k(str, "FirebaseRemoteConfigValue");
        return new C6767r("", 0);
    }
}
