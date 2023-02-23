package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* renamed from: com.google.firebase.crashlytics.h.l.t */
/* loaded from: classes2.dex */
final class C5554t extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d {

    /* renamed from: a */
    private final String f13706a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.t$b */
    /* loaded from: classes2.dex */
    public static final class C5556b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.AbstractC5484a {

        /* renamed from: a */
        private String f13707a;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.AbstractC5484a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d mo24492a() {
            String str = "";
            if (this.f13707a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new C5554t(this.f13707a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.AbstractC5484a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d.AbstractC5484a mo24491b(String str) {
            if (str != null) {
                this.f13707a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d
    /* renamed from: b */
    public String mo24493b() {
        return this.f13706a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d) {
            return this.f13706a.equals(((AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d) obj).mo24493b());
        }
        return false;
    }

    public int hashCode() {
        return this.f13706a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f13706a + "}";
    }

    private C5554t(String str) {
        this.f13706a = str;
    }
}
