package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.v */
/* loaded from: classes2.dex */
public final class C6588v extends AbstractC6589w<Float> {

    /* renamed from: a */
    private static C6588v f15873a;

    private C6588v() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6588v m21548e() {
        C6588v c6588v;
        synchronized (C6588v.class) {
            if (f15873a == null) {
                f15873a = new C6588v();
            }
            c6588v = f15873a;
        }
        return c6588v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_vc_trace_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Float m21549d() {
        return Float.valueOf(1.0f);
    }
}
