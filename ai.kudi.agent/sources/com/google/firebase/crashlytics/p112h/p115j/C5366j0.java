package com.google.firebase.crashlytics.p112h.p115j;

import java.util.Map;
/* compiled from: UserMetadata.java */
/* renamed from: com.google.firebase.crashlytics.h.j.j0 */
/* loaded from: classes2.dex */
public class C5366j0 {

    /* renamed from: a */
    private String f13232a = null;

    /* renamed from: b */
    private final C5353d0 f13233b = new C5353d0(64, 1024);

    /* renamed from: c */
    private final C5353d0 f13234c = new C5353d0(64, 8192);

    /* renamed from: a */
    public Map<String, String> m25029a() {
        return this.f13233b.m25070a();
    }

    /* renamed from: b */
    public Map<String, String> m25028b() {
        return this.f13234c.m25070a();
    }

    /* renamed from: c */
    public String m25027c() {
        return this.f13232a;
    }

    /* renamed from: d */
    public void m25026d(String str, String str2) {
        this.f13233b.m25067d(str, str2);
    }

    /* renamed from: e */
    public void m25025e(Map<String, String> map) {
        this.f13233b.m25066e(map);
    }

    /* renamed from: f */
    public void m25024f(String str) {
        this.f13232a = this.f13233b.m25069b(str);
    }
}
