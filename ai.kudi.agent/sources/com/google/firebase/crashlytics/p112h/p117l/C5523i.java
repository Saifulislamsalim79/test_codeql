package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* renamed from: com.google.firebase.crashlytics.h.l.i */
/* loaded from: classes2.dex */
final class C5523i extends AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b {

    /* renamed from: a */
    private final String f13605a;

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b
    /* renamed from: a */
    public String mo24606a() {
        return this.f13605a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b) {
            return this.f13605a.equals(((AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b) obj).mo24606a());
        }
        return false;
    }

    public int hashCode() {
        return this.f13605a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f13605a + "}";
    }
}
