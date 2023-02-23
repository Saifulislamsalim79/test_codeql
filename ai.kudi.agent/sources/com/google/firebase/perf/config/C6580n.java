package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.n */
/* loaded from: classes2.dex */
public final class C6580n extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6580n f15865a;

    private C6580n() {
    }

    /* renamed from: e */
    public static synchronized C6580n m21564e() {
        C6580n c6580n;
        synchronized (C6580n.class) {
            if (f15865a == null) {
                f15865a = new C6580n();
            }
            c6580n = f15865a;
        }
        return c6580n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: b */
    public String mo21546b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21565d() {
        return 0L;
    }
}
