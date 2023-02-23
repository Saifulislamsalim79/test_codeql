package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.e */
/* loaded from: classes2.dex */
public final class C6570e extends AbstractC6589w<Boolean> {

    /* renamed from: a */
    private static C6570e f15855a;

    private C6570e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static synchronized C6570e m21583e() {
        C6570e c6570e;
        synchronized (C6570e.class) {
            if (f15855a == null) {
                f15855a = new C6570e();
            }
            c6570e = f15855a;
        }
        return c6570e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: b */
    public String mo21546b() {
        return "firebase_performance_collection_deactivated";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Boolean m21584d() {
        return Boolean.FALSE;
    }
}
