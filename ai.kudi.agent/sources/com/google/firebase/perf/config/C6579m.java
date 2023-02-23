package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.m */
/* loaded from: classes2.dex */
public final class C6579m extends AbstractC6589w<Boolean> {

    /* renamed from: a */
    private static C6579m f15864a;

    protected C6579m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6579m m21566e() {
        C6579m c6579m;
        synchronized (C6579m.class) {
            if (f15864a == null) {
                f15864a = new C6579m();
            }
            c6579m = f15864a;
        }
        return c6579m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_enabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean m21567d() {
        return Boolean.TRUE;
    }
}
