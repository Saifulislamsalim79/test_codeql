package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.t */
/* loaded from: classes2.dex */
public final class C6586t extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6586t f15871a;

    private C6586t() {
    }

    /* renamed from: e */
    public static synchronized C6586t m21552e() {
        C6586t c6586t;
        synchronized (C6586t.class) {
            if (f15871a == null) {
                f15871a = new C6586t();
            }
            c6586t = f15871a;
        }
        return c6586t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_rl_trace_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21553d() {
        return 30L;
    }
}
