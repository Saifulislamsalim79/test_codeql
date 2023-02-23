package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.p */
/* loaded from: classes2.dex */
public final class C6582p extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6582p f15867a;

    private C6582p() {
    }

    /* renamed from: e */
    public static synchronized C6582p m21560e() {
        C6582p c6582p;
        synchronized (C6582p.class) {
            if (f15867a == null) {
                f15867a = new C6582p();
            }
            c6582p = f15867a;
        }
        return c6582p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: b */
    public String mo21546b() {
        return "sessions_max_length_minutes";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_session_max_duration_min";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21561d() {
        return 240L;
    }
}
