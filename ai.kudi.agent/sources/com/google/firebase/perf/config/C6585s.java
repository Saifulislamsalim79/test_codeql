package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.s */
/* loaded from: classes2.dex */
public final class C6585s extends AbstractC6589w<Float> {

    /* renamed from: a */
    private static C6585s f15870a;

    private C6585s() {
    }

    /* renamed from: e */
    public static synchronized C6585s m21554e() {
        C6585s c6585s;
        synchronized (C6585s.class) {
            if (f15870a == null) {
                f15870a = new C6585s();
            }
            c6585s = f15870a;
        }
        return c6585s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: b */
    public String mo21546b() {
        return "sessions_sampling_percentage";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_vc_session_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Float m21555d() {
        return Float.valueOf(0.01f);
    }
}
