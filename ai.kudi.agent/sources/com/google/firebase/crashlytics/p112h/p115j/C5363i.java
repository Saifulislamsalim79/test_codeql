package com.google.firebase.crashlytics.p112h.p115j;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* renamed from: com.google.firebase.crashlytics.h.j.i */
/* loaded from: classes2.dex */
public final class C5363i extends AbstractC5402t {

    /* renamed from: a */
    private final AbstractC5448a0 f13230a;

    /* renamed from: b */
    private final String f13231b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5363i(AbstractC5448a0 abstractC5448a0, String str) {
        if (abstractC5448a0 != null) {
            this.f13230a = abstractC5448a0;
            if (str != null) {
                this.f13231b = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.AbstractC5402t
    /* renamed from: b */
    public AbstractC5448a0 mo24852b() {
        return this.f13230a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p115j.AbstractC5402t
    /* renamed from: c */
    public String mo24851c() {
        return this.f13231b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5402t) {
            AbstractC5402t abstractC5402t = (AbstractC5402t) obj;
            return this.f13230a.equals(abstractC5402t.mo24852b()) && this.f13231b.equals(abstractC5402t.mo24851c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13230a.hashCode() ^ 1000003) * 1000003) ^ this.f13231b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f13230a + ", sessionId=" + this.f13231b + "}";
    }
}
