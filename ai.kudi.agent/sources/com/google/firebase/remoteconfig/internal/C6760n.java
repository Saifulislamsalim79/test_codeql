package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.InterfaceC6770l;
import com.google.firebase.remoteconfig.internal.C6764q;
import com.google.firebase.remoteconfig.m;
import java.util.Date;
/* compiled from: ConfigMetadataClient.java */
/* renamed from: com.google.firebase.remoteconfig.internal.n */
/* loaded from: classes2.dex */
public class C6760n {

    /* renamed from: d */
    static final Date f16278d = new Date(-1);

    /* renamed from: e */
    static final Date f16279e = new Date(-1);

    /* renamed from: a */
    private final SharedPreferences f16280a;

    /* renamed from: b */
    private final Object f16281b = new Object();

    /* renamed from: c */
    private final Object f16282c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigMetadataClient.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.n$a */
    /* loaded from: classes2.dex */
    public static class C6761a {

        /* renamed from: a */
        private int f16283a;

        /* renamed from: b */
        private Date f16284b;

        C6761a(int i, Date date) {
            this.f16283a = i;
            this.f16284b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public Date m20816a() {
            return this.f16284b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m20815b() {
            return this.f16283a;
        }
    }

    public C6760n(SharedPreferences sharedPreferences) {
        this.f16280a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6761a m20829a() {
        C6761a c6761a;
        synchronized (this.f16282c) {
            c6761a = new C6761a(this.f16280a.getInt("num_failed_fetches", 0), new Date(this.f16280a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return c6761a;
    }

    /* renamed from: b */
    public long m20828b() {
        return this.f16280a.getLong("fetch_timeout_in_seconds", 60L);
    }

    /* renamed from: c */
    public InterfaceC6770l m20827c() {
        C6764q m20807a;
        synchronized (this.f16281b) {
            long j = this.f16280a.getLong("last_fetch_time_in_millis", -1L);
            int i = this.f16280a.getInt("last_fetch_status", 0);
            m.b bVar = new m.b();
            bVar.d(this.f16280a.getLong("fetch_timeout_in_seconds", 60L));
            bVar.e(this.f16280a.getLong("minimum_fetch_interval_in_seconds", C6757l.f16258j));
            com.google.firebase.remoteconfig.m c = bVar.c();
            C6764q.C6766b m20808b = C6764q.m20808b();
            m20808b.m20805c(i);
            m20808b.m20804d(j);
            m20808b.m20806b(c);
            m20807a = m20808b.m20807a();
        }
        return m20807a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m20826d() {
        return this.f16280a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Date m20825e() {
        return new Date(this.f16280a.getLong("last_fetch_time_in_millis", -1L));
    }

    /* renamed from: f */
    public long m20824f() {
        return this.f16280a.getLong("minimum_fetch_interval_in_seconds", C6757l.f16258j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m20823g() {
        m20822h(0, f16279e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m20822h(int i, Date date) {
        synchronized (this.f16282c) {
            this.f16280a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: i */
    public void m20821i(com.google.firebase.remoteconfig.m mVar) {
        synchronized (this.f16281b) {
            this.f16280a.edit().putLong("fetch_timeout_in_seconds", mVar.a()).putLong("minimum_fetch_interval_in_seconds", mVar.b()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m20820j(String str) {
        synchronized (this.f16281b) {
            this.f16280a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m20819k() {
        synchronized (this.f16281b) {
            this.f16280a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m20818l(Date date) {
        synchronized (this.f16281b) {
            this.f16280a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m20817m() {
        synchronized (this.f16281b) {
            this.f16280a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
