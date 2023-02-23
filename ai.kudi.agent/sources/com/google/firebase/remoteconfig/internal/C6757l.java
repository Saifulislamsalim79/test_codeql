package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.InterfaceC2967e;
import com.google.android.gms.tasks.C4469m;
import com.google.android.gms.tasks.InterfaceC4450c;
import com.google.android.gms.tasks.InterfaceC4462i;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.installations.AbstractC6435k;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C6757l;
import com.google.firebase.remoteconfig.internal.C6760n;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: ConfigFetchHandler.java */
/* renamed from: com.google.firebase.remoteconfig.internal.l */
/* loaded from: classes2.dex */
public class C6757l {

    /* renamed from: j */
    public static final long f16258j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    static final int[] f16259k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    private final InterfaceC6432h f16260a;

    /* renamed from: b */
    private final InterfaceC6560b<InterfaceC5174a> f16261b;

    /* renamed from: c */
    private final Executor f16262c;

    /* renamed from: d */
    private final InterfaceC2967e f16263d;

    /* renamed from: e */
    private final Random f16264e;

    /* renamed from: f */
    private final C6751j f16265f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f16266g;

    /* renamed from: h */
    private final C6760n f16267h;

    /* renamed from: i */
    private final Map<String, String> f16268i;

    /* compiled from: ConfigFetchHandler.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.l$a */
    /* loaded from: classes2.dex */
    public static class C6758a {

        /* renamed from: a */
        private final int f16269a;

        /* renamed from: b */
        private final C6754k f16270b;

        /* renamed from: c */
        private final String f16271c;

        private C6758a(Date date, int i, C6754k c6754k, String str) {
            this.f16269a = i;
            this.f16270b = c6754k;
            this.f16271c = str;
        }

        /* renamed from: a */
        public static C6758a m20846a(Date date) {
            return new C6758a(date, 1, null, null);
        }

        /* renamed from: b */
        public static C6758a m20845b(C6754k c6754k, String str) {
            return new C6758a(c6754k.m20875e(), 0, c6754k, str);
        }

        /* renamed from: c */
        public static C6758a m20844c(Date date) {
            return new C6758a(date, 2, null, null);
        }

        /* renamed from: d */
        public C6754k m20843d() {
            return this.f16270b;
        }

        /* renamed from: e */
        String m20842e() {
            return this.f16271c;
        }

        /* renamed from: f */
        int m20841f() {
            return this.f16269a;
        }
    }

    public C6757l(InterfaceC6432h interfaceC6432h, InterfaceC6560b<InterfaceC5174a> interfaceC6560b, Executor executor, InterfaceC2967e interfaceC2967e, Random random, C6751j c6751j, ConfigFetchHttpClient configFetchHttpClient, C6760n c6760n, Map<String, String> map) {
        this.f16260a = interfaceC6432h;
        this.f16261b = interfaceC6560b;
        this.f16262c = executor;
        this.f16263d = interfaceC2967e;
        this.f16264e = random;
        this.f16265f = c6751j;
        this.f16266g = configFetchHttpClient;
        this.f16267h = c6760n;
        this.f16268i = map;
    }

    /* renamed from: a */
    private boolean m20866a(long j, Date date) {
        Date m20825e = this.f16267h.m20825e();
        if (m20825e.equals(C6760n.f16278d)) {
            return false;
        }
        return date.before(new Date(m20825e.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* renamed from: b */
    private FirebaseRemoteConfigServerException m20865b(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int m20930a = firebaseRemoteConfigServerException.m20930a();
        if (m20930a == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (m20930a == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (m20930a == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else {
            if (m20930a != 500) {
                switch (m20930a) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        int m20930a2 = firebaseRemoteConfigServerException.m20930a();
        return new FirebaseRemoteConfigServerException(m20930a2, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    /* renamed from: c */
    private String m20864c(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    /* renamed from: f */
    private C6758a m20861f(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        try {
            C6758a fetch = this.f16266g.fetch(this.f16266g.m20904c(), str, str2, m20856k(), this.f16267h.m20826d(), this.f16268i, date);
            if (fetch.m20842e() != null) {
                this.f16267h.m20820j(fetch.m20842e());
            }
            this.f16267h.m20823g();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e) {
            C6760n.C6761a m20849r = m20849r(e.m20930a(), date);
            if (m20850q(m20849r, e.m20930a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(m20849r.m20816a().getTime());
            }
            throw m20865b(e);
        }
    }

    /* renamed from: g */
    private com.google.android.gms.tasks.j<C6758a> m20860g(String str, String str2, Date date) {
        try {
            final C6758a m20861f = m20861f(str, str2, date);
            if (m20861f.m20841f() != 0) {
                return C4469m.m27765f(m20861f);
            }
            return this.f16265f.m20884i(m20861f.m20843d()).r(this.f16262c, new InterfaceC4462i() { // from class: com.google.firebase.remoteconfig.internal.e
                @Override // com.google.android.gms.tasks.InterfaceC4462i
                /* renamed from: a */
                public final com.google.android.gms.tasks.j mo20894a(Object obj) {
                    com.google.android.gms.tasks.j m27765f;
                    C6754k c6754k = (C6754k) obj;
                    m27765f = C4469m.m27765f(C6757l.C6758a.this);
                    return m27765f;
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return C4469m.m27766e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public com.google.android.gms.tasks.j<C6758a> m20854m(com.google.android.gms.tasks.j<C6754k> jVar, long j) {
        com.google.android.gms.tasks.j j2;
        final Date date = new Date(this.f16263d.currentTimeMillis());
        if (jVar.p() && m20866a(j, date)) {
            return C4469m.m27765f(C6758a.m20844c(date));
        }
        Date m20858i = m20858i(date);
        if (m20858i != null) {
            j2 = C4469m.m27766e(new FirebaseRemoteConfigFetchThrottledException(m20864c(m20858i.getTime() - date.getTime()), m20858i.getTime()));
        } else {
            final com.google.android.gms.tasks.j<String> mo22049h = this.f16260a.mo22049h();
            final com.google.android.gms.tasks.j<AbstractC6435k> mo22050a = this.f16260a.mo22050a(false);
            j2 = C4469m.m27761j(mo22049h, mo22050a).j(this.f16262c, new InterfaceC4450c() { // from class: com.google.firebase.remoteconfig.internal.d
                @Override // com.google.android.gms.tasks.InterfaceC4450c
                /* renamed from: a */
                public final Object mo20893a(com.google.android.gms.tasks.j jVar2) {
                    return C6757l.this.m20852o(mo22049h, mo22050a, date, jVar2);
                }
            });
        }
        return j2.j(this.f16262c, new InterfaceC4450c() { // from class: com.google.firebase.remoteconfig.internal.c
            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: a */
            public final Object mo20893a(com.google.android.gms.tasks.j jVar2) {
                return C6757l.this.m20851p(date, jVar2);
            }
        });
    }

    /* renamed from: i */
    private Date m20858i(Date date) {
        Date m20816a = this.f16267h.m20829a().m20816a();
        if (date.before(m20816a)) {
            return m20816a;
        }
        return null;
    }

    /* renamed from: j */
    private long m20857j(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f16259k;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + this.f16264e.nextInt((int) millis);
    }

    /* renamed from: k */
    private Map<String, String> m20856k() {
        HashMap hashMap = new HashMap();
        InterfaceC5174a interfaceC5174a = this.f16261b.get();
        if (interfaceC5174a == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : interfaceC5174a.mo22589a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: l */
    private boolean m20855l(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* renamed from: q */
    private boolean m20850q(C6760n.C6761a c6761a, int i) {
        return c6761a.m20815b() > 1 || i == 429;
    }

    /* renamed from: r */
    private C6760n.C6761a m20849r(int i, Date date) {
        if (m20855l(i)) {
            m20848s(date);
        }
        return this.f16267h.m20829a();
    }

    /* renamed from: s */
    private void m20848s(Date date) {
        int m20815b = this.f16267h.m20829a().m20815b() + 1;
        this.f16267h.m20822h(m20815b, new Date(date.getTime() + m20857j(m20815b)));
    }

    /* renamed from: t */
    private void m20847t(com.google.android.gms.tasks.j<C6758a> jVar, Date date) {
        if (jVar.p()) {
            this.f16267h.m20818l(date);
            return;
        }
        Exception k = jVar.k();
        if (k == null) {
            return;
        }
        if (k instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f16267h.m20817m();
        } else {
            this.f16267h.m20819k();
        }
    }

    /* renamed from: d */
    public com.google.android.gms.tasks.j<C6758a> m20863d() {
        return m20862e(this.f16267h.m20824f());
    }

    /* renamed from: e */
    public com.google.android.gms.tasks.j<C6758a> m20862e(final long j) {
        return this.f16265f.m20890c().j(this.f16262c, new InterfaceC4450c() { // from class: com.google.firebase.remoteconfig.internal.f
            @Override // com.google.android.gms.tasks.InterfaceC4450c
            /* renamed from: a */
            public final Object mo20893a(com.google.android.gms.tasks.j jVar) {
                return C6757l.this.m20854m(j, jVar);
            }
        });
    }

    /* renamed from: o */
    public /* synthetic */ com.google.android.gms.tasks.j m20852o(com.google.android.gms.tasks.j jVar, com.google.android.gms.tasks.j jVar2, Date date, com.google.android.gms.tasks.j jVar3) throws Exception {
        if (!jVar.p()) {
            return C4469m.m27766e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", jVar.k()));
        }
        if (!jVar2.p()) {
            return C4469m.m27766e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", jVar2.k()));
        }
        return m20860g((String) jVar.l(), ((AbstractC6435k) jVar2.l()).mo22047b(), date);
    }

    /* renamed from: p */
    public /* synthetic */ com.google.android.gms.tasks.j m20851p(Date date, com.google.android.gms.tasks.j jVar) throws Exception {
        m20847t(jVar, date);
        return jVar;
    }
}
