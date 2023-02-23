package com.google.firebase.crashlytics.p112h.p115j;

import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p120n.InterfaceC5577h;
import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CrashlyticsFileMarker.java */
/* renamed from: com.google.firebase.crashlytics.h.j.r */
/* loaded from: classes2.dex */
public class C5400r {

    /* renamed from: a */
    private final String f13334a;

    /* renamed from: b */
    private final InterfaceC5577h f13335b;

    public C5400r(String str, InterfaceC5577h interfaceC5577h) {
        this.f13334a = str;
        this.f13335b = interfaceC5577h;
    }

    /* renamed from: b */
    private File m24880b() {
        return new File(this.f13335b.mo24405b(), this.f13334a);
    }

    /* renamed from: a */
    public boolean m24881a() {
        try {
            return m24880b().createNewFile();
        } catch (IOException e) {
            C5335f m25102f = C5335f.m25102f();
            m25102f.m25103e("Error creating marker: " + this.f13334a, e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean m24879c() {
        return m24880b().exists();
    }

    /* renamed from: d */
    public boolean m24878d() {
        return m24880b().delete();
    }
}
