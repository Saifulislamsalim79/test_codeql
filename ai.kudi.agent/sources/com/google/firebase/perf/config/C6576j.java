package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.j */
/* loaded from: classes2.dex */
public final class C6576j extends AbstractC6589w<Float> {

    /* renamed from: a */
    private static C6576j f15861a;

    private C6576j() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6576j m21572e() {
        C6576j c6576j;
        synchronized (C6576j.class) {
            if (f15861a == null) {
                f15861a = new C6576j();
            }
            c6576j = f15861a;
        }
        return c6576j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Float m21573d() {
        return Float.valueOf(1.0f);
    }
}
