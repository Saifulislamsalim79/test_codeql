package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* renamed from: com.google.firebase.crashlytics.h.l.n */
/* loaded from: classes2.dex */
final class C5536n extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a {

    /* renamed from: a */
    private final long f13654a;

    /* renamed from: b */
    private final long f13655b;

    /* renamed from: c */
    private final String f13656c;

    /* renamed from: d */
    private final String f13657d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.n$b */
    /* loaded from: classes2.dex */
    public static final class C5538b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a {

        /* renamed from: a */
        private Long f13658a;

        /* renamed from: b */
        private Long f13659b;

        /* renamed from: c */
        private String f13660c;

        /* renamed from: d */
        private String f13661d;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a mo24547a() {
            String str = "";
            if (this.f13658a == null) {
                str = " baseAddress";
            }
            if (this.f13659b == null) {
                str = str + " size";
            }
            if (this.f13660c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C5536n(this.f13658a.longValue(), this.f13659b.longValue(), this.f13660c, this.f13661d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a mo24546b(long j) {
            this.f13658a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a mo24545c(String str) {
            if (str != null) {
                this.f13660c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a mo24544d(long j) {
            this.f13659b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a.AbstractC5470a mo24543e(String str) {
            this.f13661d = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a
    /* renamed from: b */
    public long mo24551b() {
        return this.f13654a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a
    /* renamed from: c */
    public String mo24550c() {
        return this.f13656c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a
    /* renamed from: d */
    public long mo24549d() {
        return this.f13655b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a
    /* renamed from: e */
    public String mo24548e() {
        return this.f13657d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a abstractC5469a = (AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a) obj;
            if (this.f13654a == abstractC5469a.mo24551b() && this.f13655b == abstractC5469a.mo24549d() && this.f13656c.equals(abstractC5469a.mo24550c())) {
                String str = this.f13657d;
                if (str == null) {
                    if (abstractC5469a.mo24548e() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC5469a.mo24548e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f13654a;
        long j2 = this.f13655b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f13656c.hashCode()) * 1000003;
        String str = this.f13657d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f13654a + ", size=" + this.f13655b + ", name=" + this.f13656c + ", uuid=" + this.f13657d + "}";
    }

    private C5536n(long j, long j2, String str, String str2) {
        this.f13654a = j;
        this.f13655b = j2;
        this.f13656c = str;
        this.f13657d = str2;
    }
}
