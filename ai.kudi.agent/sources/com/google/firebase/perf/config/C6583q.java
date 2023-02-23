package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.q */
/* loaded from: classes2.dex */
public final class C6583q extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6583q f15868a;

    private C6583q() {
    }

    /* renamed from: e */
    public static synchronized C6583q m21558e() {
        C6583q c6583q;
        synchronized (C6583q.class) {
            if (f15868a == null) {
                f15868a = new C6583q();
            }
            c6583q = f15868a;
        }
        return c6583q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: b */
    public String mo21546b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21559d() {
        return 0L;
    }
}
