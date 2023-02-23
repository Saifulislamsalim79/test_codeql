package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.u */
/* loaded from: classes2.dex */
public final class C6587u extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6587u f15872a;

    private C6587u() {
    }

    /* renamed from: e */
    public static synchronized C6587u m21550e() {
        C6587u c6587u;
        synchronized (C6587u.class) {
            if (f15872a == null) {
                f15872a = new C6587u();
            }
            c6587u = f15872a;
        }
        return c6587u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_rl_trace_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21551d() {
        return 300L;
    }
}
