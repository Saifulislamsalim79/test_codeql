package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* renamed from: com.google.firebase.crashlytics.h.l.u */
/* loaded from: classes2.dex */
final class C5557u extends AbstractC5448a0.AbstractC5458e.AbstractC5485e {

    /* renamed from: a */
    private final int f13708a;

    /* renamed from: b */
    private final String f13709b;

    /* renamed from: c */
    private final String f13710c;

    /* renamed from: d */
    private final boolean f13711d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.u$b */
    /* loaded from: classes2.dex */
    public static final class C5559b extends AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a {

        /* renamed from: a */
        private Integer f13712a;

        /* renamed from: b */
        private String f13713b;

        /* renamed from: c */
        private String f13714c;

        /* renamed from: d */
        private Boolean f13715d;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5485e mo24486a() {
            String str = "";
            if (this.f13712a == null) {
                str = " platform";
            }
            if (this.f13713b == null) {
                str = str + " version";
            }
            if (this.f13714c == null) {
                str = str + " buildVersion";
            }
            if (this.f13715d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C5557u(this.f13712a.intValue(), this.f13713b, this.f13714c, this.f13715d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a mo24485b(String str) {
            if (str != null) {
                this.f13714c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a mo24484c(boolean z) {
            this.f13715d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a mo24483d(int i) {
            this.f13712a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5485e.AbstractC5486a mo24482e(String str) {
            if (str != null) {
                this.f13713b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e
    /* renamed from: b */
    public String mo24490b() {
        return this.f13710c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e
    /* renamed from: c */
    public int mo24489c() {
        return this.f13708a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e
    /* renamed from: d */
    public String mo24488d() {
        return this.f13709b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5485e
    /* renamed from: e */
    public boolean mo24487e() {
        return this.f13711d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5485e) {
            AbstractC5448a0.AbstractC5458e.AbstractC5485e abstractC5485e = (AbstractC5448a0.AbstractC5458e.AbstractC5485e) obj;
            return this.f13708a == abstractC5485e.mo24489c() && this.f13709b.equals(abstractC5485e.mo24488d()) && this.f13710c.equals(abstractC5485e.mo24490b()) && this.f13711d == abstractC5485e.mo24487e();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f13708a ^ 1000003) * 1000003) ^ this.f13709b.hashCode()) * 1000003) ^ this.f13710c.hashCode()) * 1000003) ^ (this.f13711d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f13708a + ", version=" + this.f13709b + ", buildVersion=" + this.f13710c + ", jailbroken=" + this.f13711d + "}";
    }

    private C5557u(int i, String str, String str2, boolean z) {
        this.f13708a = i;
        this.f13709b = str;
        this.f13710c = str2;
        this.f13711d = z;
    }
}
