package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.f */
/* loaded from: classes2.dex */
public final class C6571f extends AbstractC6589w<Boolean> {

    /* renamed from: a */
    private static C6571f f15856a;

    private C6571f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static synchronized C6571f m21582d() {
        C6571f c6571f;
        synchronized (C6571f.class) {
            if (f15856a == null) {
                f15856a = new C6571f();
            }
            c6571f = f15856a;
        }
        return c6571f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "isEnabled";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: b */
    public String mo21546b() {
        return "firebase_performance_collection_enabled";
    }
}
