package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* renamed from: com.google.firebase.crashlytics.h.l.v */
/* loaded from: classes2.dex */
final class C5560v extends AbstractC5448a0.AbstractC5458e.AbstractC5487f {

    /* renamed from: a */
    private final String f13716a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.v$b */
    /* loaded from: classes2.dex */
    public static final class C5562b extends AbstractC5448a0.AbstractC5458e.AbstractC5487f.AbstractC5488a {

        /* renamed from: a */
        private String f13717a;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5487f.AbstractC5488a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5487f mo24480a() {
            String str = "";
            if (this.f13717a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new C5560v(this.f13717a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5487f.AbstractC5488a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5487f.AbstractC5488a mo24479b(String str) {
            if (str != null) {
                this.f13717a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5487f
    /* renamed from: b */
    public String mo24481b() {
        return this.f13716a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5487f) {
            return this.f13716a.equals(((AbstractC5448a0.AbstractC5458e.AbstractC5487f) obj).mo24481b());
        }
        return false;
    }

    public int hashCode() {
        return this.f13716a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f13716a + "}";
    }

    private C5560v(String str) {
        this.f13716a = str;
    }
}
