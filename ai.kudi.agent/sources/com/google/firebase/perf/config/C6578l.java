package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.l */
/* loaded from: classes2.dex */
public final class C6578l extends AbstractC6589w<String> {

    /* renamed from: a */
    private static C6578l f15863a;

    protected C6578l() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6578l m21568e() {
        C6578l c6578l;
        synchronized (C6578l.class) {
            if (f15863a == null) {
                f15863a = new C6578l();
            }
            c6578l = f15863a;
        }
        return c6578l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_disabled_android_versions";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public String m21569d() {
        return "";
    }
}
