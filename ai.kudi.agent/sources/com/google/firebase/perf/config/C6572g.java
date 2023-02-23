package com.google.firebase.perf.config;

import com.google.firebase.perf.C6564b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.g */
/* loaded from: classes2.dex */
public final class C6572g extends AbstractC6589w<String> {

    /* renamed from: a */
    private static C6572g f15857a;

    /* renamed from: b */
    private static final Map<Long, String> f15858b = Collections.unmodifiableMap(new C6573a());

    /* compiled from: ConfigurationConstants.java */
    /* renamed from: com.google.firebase.perf.config.g$a */
    /* loaded from: classes2.dex */
    class C6573a extends HashMap<Long, String> {
        C6573a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, C6564b.f15840c);
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private C6572g() {
    }

    /* renamed from: e */
    public static synchronized C6572g m21580e() {
        C6572g c6572g;
        synchronized (C6572g.class) {
            if (f15857a == null) {
                f15857a = new C6572g();
            }
            c6572g = f15857a;
        }
        return c6572g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static String m21579f(long j) {
        return f15858b.get(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public static boolean m21578g(long j) {
        return f15858b.containsKey(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_log_source";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m21581d() {
        return C6564b.f15840c;
    }
}
