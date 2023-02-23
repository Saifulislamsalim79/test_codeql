package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.k */
/* loaded from: classes2.dex */
public final class C6577k extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6577k f15862a;

    private C6577k() {
    }

    /* renamed from: e */
    public static synchronized C6577k m21570e() {
        C6577k c6577k;
        synchronized (C6577k.class) {
            if (f15862a == null) {
                f15862a = new C6577k();
            }
            c6577k = f15862a;
        }
        return c6577k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_rl_time_limit_sec";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21571d() {
        return 600L;
    }
}
