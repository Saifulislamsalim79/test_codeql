package com.google.firebase.crashlytics.p112h.p122p.p123i;
/* compiled from: SettingsData.java */
/* renamed from: com.google.firebase.crashlytics.h.p.i.e */
/* loaded from: classes2.dex */
public class C5595e implements InterfaceC5594d {

    /* renamed from: a */
    public final C5591a f13790a;

    /* renamed from: b */
    public final C5593c f13791b;

    /* renamed from: c */
    public final C5592b f13792c;

    /* renamed from: d */
    public final long f13793d;

    public C5595e(long j, C5591a c5591a, C5593c c5593c, C5592b c5592b, int i, int i2) {
        this.f13793d = j;
        this.f13790a = c5591a;
        this.f13791b = c5593c;
        this.f13792c = c5592b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p122p.p123i.InterfaceC5594d
    /* renamed from: a */
    public C5592b mo24364a() {
        return this.f13792c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p122p.p123i.InterfaceC5594d
    /* renamed from: b */
    public C5593c mo24363b() {
        return this.f13791b;
    }

    /* renamed from: c */
    public C5591a m24362c() {
        return this.f13790a;
    }

    /* renamed from: d */
    public long m24361d() {
        return this.f13793d;
    }

    /* renamed from: e */
    public boolean m24360e(long j) {
        return this.f13793d < j;
    }
}
