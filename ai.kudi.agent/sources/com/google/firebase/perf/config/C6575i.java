package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.i */
/* loaded from: classes2.dex */
public final class C6575i extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6575i f15860a;

    private C6575i() {
    }

    /* renamed from: e */
    public static synchronized C6575i m21574e() {
        C6575i c6575i;
        synchronized (C6575i.class) {
            if (f15860a == null) {
                f15860a = new C6575i();
            }
            c6575i = f15860a;
        }
        return c6575i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_rl_network_event_count_fg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21575d() {
        return 700L;
    }
}
