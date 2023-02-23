package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* renamed from: com.google.firebase.crashlytics.h.l.p */
/* loaded from: classes2.dex */
final class C5542p extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d {

    /* renamed from: a */
    private final String f13672a;

    /* renamed from: b */
    private final String f13673b;

    /* renamed from: c */
    private final long f13674c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.p$b */
    /* loaded from: classes2.dex */
    public static final class C5544b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a {

        /* renamed from: a */
        private String f13675a;

        /* renamed from: b */
        private String f13676b;

        /* renamed from: c */
        private Long f13677c;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d mo24528a() {
            String str = "";
            if (this.f13675a == null) {
                str = " name";
            }
            if (this.f13676b == null) {
                str = str + " code";
            }
            if (this.f13677c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C5542p(this.f13675a, this.f13676b, this.f13677c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a mo24527b(long j) {
            this.f13677c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a mo24526c(String str) {
            if (str != null) {
                this.f13676b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d.AbstractC5475a mo24525d(String str) {
            if (str != null) {
                this.f13675a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d
    /* renamed from: b */
    public long mo24531b() {
        return this.f13674c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d
    /* renamed from: c */
    public String mo24530c() {
        return this.f13673b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d
    /* renamed from: d */
    public String mo24529d() {
        return this.f13672a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d abstractC5474d = (AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d) obj;
            return this.f13672a.equals(abstractC5474d.mo24529d()) && this.f13673b.equals(abstractC5474d.mo24530c()) && this.f13674c == abstractC5474d.mo24531b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f13674c;
        return ((((this.f13672a.hashCode() ^ 1000003) * 1000003) ^ this.f13673b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f13672a + ", code=" + this.f13673b + ", address=" + this.f13674c + "}";
    }

    private C5542p(String str, String str2, long j) {
        this.f13672a = str;
        this.f13673b = str2;
        this.f13674c = j;
    }
}
