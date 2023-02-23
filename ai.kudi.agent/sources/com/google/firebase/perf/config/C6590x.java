package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.C5988g;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6628e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: DeviceCacheManager.java */
/* renamed from: com.google.firebase.perf.config.x */
/* loaded from: classes2.dex */
public class C6590x {

    /* renamed from: c */
    private static final C6609a f15874c = C6609a.m21475e();

    /* renamed from: d */
    private static C6590x f15875d;

    /* renamed from: a */
    private volatile SharedPreferences f15876a;

    /* renamed from: b */
    private final ExecutorService f15877b;

    public C6590x(ExecutorService executorService) {
        this.f15877b = executorService;
    }

    /* renamed from: b */
    private Context m21543b() {
        try {
            C5988g.m23092j();
            return C5988g.m23092j().m23093i();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static synchronized C6590x m21541d() {
        C6590x c6590x;
        synchronized (C6590x.class) {
            if (f15875d == null) {
                f15875d = new C6590x(Executors.newSingleThreadExecutor());
            }
            c6590x = f15875d;
        }
        return c6590x;
    }

    /* renamed from: a */
    public C6628e<Boolean> m21544a(String str) {
        if (str == null) {
            f15874c.m21479a("Key is null when getting boolean value on device cache.");
            return C6628e.m21409a();
        }
        if (this.f15876a == null) {
            m21537h(m21543b());
            if (this.f15876a == null) {
                return C6628e.m21409a();
            }
        }
        if (!this.f15876a.contains(str)) {
            return C6628e.m21409a();
        }
        try {
            return C6628e.m21405e(Boolean.valueOf(this.f15876a.getBoolean(str, false)));
        } catch (ClassCastException e) {
            f15874c.m21478b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return C6628e.m21409a();
        }
    }

    /* renamed from: c */
    public C6628e<Float> m21542c(String str) {
        if (str == null) {
            f15874c.m21479a("Key is null when getting float value on device cache.");
            return C6628e.m21409a();
        }
        if (this.f15876a == null) {
            m21537h(m21543b());
            if (this.f15876a == null) {
                return C6628e.m21409a();
            }
        }
        if (!this.f15876a.contains(str)) {
            return C6628e.m21409a();
        }
        try {
            return C6628e.m21405e(Float.valueOf(this.f15876a.getFloat(str, 0.0f)));
        } catch (ClassCastException e) {
            f15874c.m21478b("Key %s from sharedPreferences has type other than float: %s", str, e.getMessage());
            return C6628e.m21409a();
        }
    }

    /* renamed from: e */
    public C6628e<Long> m21540e(String str) {
        if (str == null) {
            f15874c.m21479a("Key is null when getting long value on device cache.");
            return C6628e.m21409a();
        }
        if (this.f15876a == null) {
            m21537h(m21543b());
            if (this.f15876a == null) {
                return C6628e.m21409a();
            }
        }
        if (!this.f15876a.contains(str)) {
            return C6628e.m21409a();
        }
        try {
            return C6628e.m21405e(Long.valueOf(this.f15876a.getLong(str, 0L)));
        } catch (ClassCastException e) {
            f15874c.m21478b("Key %s from sharedPreferences has type other than long: %s", str, e.getMessage());
            return C6628e.m21409a();
        }
    }

    /* renamed from: f */
    public C6628e<String> m21539f(String str) {
        if (str == null) {
            f15874c.m21479a("Key is null when getting String value on device cache.");
            return C6628e.m21409a();
        }
        if (this.f15876a == null) {
            m21537h(m21543b());
            if (this.f15876a == null) {
                return C6628e.m21409a();
            }
        }
        if (!this.f15876a.contains(str)) {
            return C6628e.m21409a();
        }
        try {
            return C6628e.m21405e(this.f15876a.getString(str, ""));
        } catch (ClassCastException e) {
            f15874c.m21478b("Key %s from sharedPreferences has type other than String: %s", str, e.getMessage());
            return C6628e.m21409a();
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m21538g(Context context) {
        if (this.f15876a != null || context == null) {
            return;
        }
        this.f15876a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    /* renamed from: h */
    public synchronized void m21537h(final Context context) {
        if (this.f15876a == null && context != null) {
            this.f15877b.execute(new Runnable() { // from class: com.google.firebase.perf.config.a
                @Override // java.lang.Runnable
                public final void run() {
                    C6590x.this.m21538g(context);
                }
            });
        }
    }

    /* renamed from: i */
    public boolean m21536i(String str, float f) {
        if (str == null) {
            f15874c.m21479a("Key is null when setting float value on device cache.");
            return false;
        }
        if (this.f15876a == null) {
            m21537h(m21543b());
            if (this.f15876a == null) {
                return false;
            }
        }
        this.f15876a.edit().putFloat(str, f).apply();
        return true;
    }

    /* renamed from: j */
    public boolean m21535j(String str, long j) {
        if (str == null) {
            f15874c.m21479a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f15876a == null) {
            m21537h(m21543b());
            if (this.f15876a == null) {
                return false;
            }
        }
        this.f15876a.edit().putLong(str, j).apply();
        return true;
    }

    /* renamed from: k */
    public boolean m21534k(String str, String str2) {
        if (str == null) {
            f15874c.m21479a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f15876a == null) {
            m21537h(m21543b());
            if (this.f15876a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f15876a.edit().remove(str).apply();
            return true;
        }
        this.f15876a.edit().putString(str, str2).apply();
        return true;
    }

    /* renamed from: l */
    public boolean m21533l(String str, boolean z) {
        if (str == null) {
            f15874c.m21479a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f15876a == null) {
            m21537h(m21543b());
            if (this.f15876a == null) {
                return false;
            }
        }
        this.f15876a.edit().putBoolean(str, z).apply();
        return true;
    }
}
