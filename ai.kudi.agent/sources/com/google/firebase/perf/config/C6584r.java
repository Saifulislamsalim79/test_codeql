package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.r */
/* loaded from: classes2.dex */
public final class C6584r extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6584r f15869a;

    private C6584r() {
    }

    /* renamed from: e */
    public static synchronized C6584r m21556e() {
        C6584r c6584r;
        synchronized (C6584r.class) {
            if (f15869a == null) {
                f15869a = new C6584r();
            }
            c6584r = f15869a;
        }
        return c6584r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: b */
    public String mo21546b() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21557d() {
        return 100L;
    }
}
