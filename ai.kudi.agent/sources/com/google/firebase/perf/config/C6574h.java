package com.google.firebase.perf.config;
/* compiled from: ConfigurationConstants.java */
/* renamed from: com.google.firebase.perf.config.h */
/* loaded from: classes2.dex */
public final class C6574h extends AbstractC6589w<Long> {

    /* renamed from: a */
    private static C6574h f15859a;

    private C6574h() {
    }

    /* renamed from: e */
    public static synchronized C6574h m21576e() {
        C6574h c6574h;
        synchronized (C6574h.class) {
            if (f15859a == null) {
                f15859a = new C6574h();
            }
            c6574h = f15859a;
        }
        return c6574h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: a */
    public String mo21547a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.perf.config.AbstractC6589w
    /* renamed from: c */
    public String mo21545c() {
        return "fpr_rl_network_event_count_bg";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Long m21577d() {
        return 70L;
    }
}
