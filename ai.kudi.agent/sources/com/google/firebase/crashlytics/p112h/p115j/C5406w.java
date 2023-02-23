package com.google.firebase.crashlytics.p112h.p115j;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.j;
import com.google.firebase.C5988g;
import com.google.firebase.crashlytics.p112h.C5335f;
import java.util.concurrent.Executor;
/* compiled from: DataCollectionArbiter.java */
/* renamed from: com.google.firebase.crashlytics.h.j.w */
/* loaded from: classes2.dex */
public class C5406w {

    /* renamed from: a */
    private final SharedPreferences f13347a;

    /* renamed from: b */
    private final C5988g f13348b;

    /* renamed from: f */
    private Boolean f13352f;

    /* renamed from: c */
    private final Object f13349c = new Object();

    /* renamed from: d */
    C4465k<Void> f13350d = new C4465k<>();

    /* renamed from: e */
    private boolean f13351e = false;

    /* renamed from: g */
    private final C4465k<Void> f13353g = new C4465k<>();

    public C5406w(C5988g c5988g) {
        Context m23093i = c5988g.m23093i();
        this.f13348b = c5988g;
        this.f13347a = C5373n.m24984r(m23093i);
        Boolean m24845b = m24845b();
        this.f13352f = m24845b == null ? m24846a(m23093i) : m24845b;
        synchronized (this.f13349c) {
            if (m24843d()) {
                this.f13350d.m27773e(null);
            }
        }
    }

    /* renamed from: a */
    private Boolean m24846a(Context context) {
        Boolean m24841f = m24841f(context);
        if (m24841f == null) {
            this.f13351e = false;
            return null;
        }
        this.f13351e = true;
        return Boolean.valueOf(Boolean.TRUE.equals(m24841f));
    }

    /* renamed from: b */
    private Boolean m24845b() {
        if (this.f13347a.contains("firebase_crashlytics_collection_enabled")) {
            this.f13351e = false;
            return Boolean.valueOf(this.f13347a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    /* renamed from: e */
    private void m24842e(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f13352f == null) {
            str = "global Firebase setting";
        } else {
            str = this.f13351e ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        C5335f.m25102f().m25106b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    /* renamed from: f */
    private static Boolean m24841f(Context context) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            C5335f.m25102f().m25103e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: c */
    public void m24844c(boolean z) {
        if (z) {
            this.f13353g.m27773e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean m24843d() {
        boolean m23083s;
        if (this.f13352f != null) {
            m23083s = this.f13352f.booleanValue();
        } else {
            m23083s = this.f13348b.m23083s();
        }
        m24842e(m23083s);
        return m23083s;
    }

    /* renamed from: g */
    public j<Void> m24840g() {
        j<Void> m27777a;
        synchronized (this.f13349c) {
            m27777a = this.f13350d.m27777a();
        }
        return m27777a;
    }

    /* renamed from: h */
    public j<Void> m24839h(Executor executor) {
        return C5368k0.m25012g(executor, this.f13353g.m27777a(), m24840g());
    }
}
