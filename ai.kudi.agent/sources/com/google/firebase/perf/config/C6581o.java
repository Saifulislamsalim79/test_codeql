package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.o */
/* loaded from: classes2.dex */
public final class C6581o extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6581o f15866a;

    private C6581o() {
    }

    /* renamed from: e */
    public static synchronized C6581o m21562e() {
        C6581o c6581o;
        synchronized (C6581o.class) {
            if (f15866a == null) {
                f15866a = new C6581o();
            }
            c6581o = f15866a;
        }
        return c6581o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: b */
    public String mo21546b() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21563d() {
        return 100L;
    }
}
