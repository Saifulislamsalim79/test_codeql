package com.google.firebase.database.p131s.p133h0;
/* compiled from: LRUCachePolicy.java */
/* renamed from: com.google.firebase.database.s.h0.c */
/* loaded from: classes2.dex */
public class C5756c implements InterfaceC5754a {

    /* renamed from: a */
    public final long f14177a;

    public C5756c(long j) {
        this.f14177a = j;
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5754a
    /* renamed from: a */
    public boolean mo23893a(long j, long j2) {
        return j > this.f14177a || j2 > 1000;
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5754a
    /* renamed from: b */
    public long mo23892b() {
        return 1000L;
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5754a
    /* renamed from: c */
    public float mo23891c() {
        return 0.2f;
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5754a
    /* renamed from: d */
    public boolean mo23890d(long j) {
        return j > 1000;
    }
}
