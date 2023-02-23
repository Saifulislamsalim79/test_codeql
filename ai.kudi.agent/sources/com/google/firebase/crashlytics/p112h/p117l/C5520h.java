package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* renamed from: com.google.firebase.crashlytics.h.l.h */
/* loaded from: classes2.dex */
final class C5520h extends AbstractC5448a0.AbstractC5458e.AbstractC5459a {

    /* renamed from: a */
    private final String f13591a;

    /* renamed from: b */
    private final String f13592b;

    /* renamed from: c */
    private final String f13593c;

    /* renamed from: d */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b f13594d;

    /* renamed from: e */
    private final String f13595e;

    /* renamed from: f */
    private final String f13596f;

    /* renamed from: g */
    private final String f13597g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.h$b */
    /* loaded from: classes2.dex */
    public static final class C5522b extends AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a {

        /* renamed from: a */
        private String f13598a;

        /* renamed from: b */
        private String f13599b;

        /* renamed from: c */
        private String f13600c;

        /* renamed from: d */
        private AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b f13601d;

        /* renamed from: e */
        private String f13602e;

        /* renamed from: f */
        private String f13603f;

        /* renamed from: g */
        private String f13604g;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5459a mo24613a() {
            String str = "";
            if (this.f13598a == null) {
                str = " identifier";
            }
            if (this.f13599b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C5520h(this.f13598a, this.f13599b, this.f13600c, this.f13601d, this.f13602e, this.f13603f, this.f13604g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a mo24612b(String str) {
            this.f13603f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a mo24611c(String str) {
            this.f13604g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a mo24610d(String str) {
            this.f13600c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a mo24609e(String str) {
            if (str != null) {
                this.f13598a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a mo24608f(String str) {
            this.f13602e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a
        /* renamed from: g */
        public AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5460a mo24607g(String str) {
            if (str != null) {
                this.f13599b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a
    /* renamed from: b */
    public String mo24620b() {
        return this.f13596f;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a
    /* renamed from: c */
    public String mo24619c() {
        return this.f13597g;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a
    /* renamed from: d */
    public String mo24618d() {
        return this.f13593c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a
    /* renamed from: e */
    public String mo24617e() {
        return this.f13591a;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b abstractC5461b;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5459a) {
            AbstractC5448a0.AbstractC5458e.AbstractC5459a abstractC5459a = (AbstractC5448a0.AbstractC5458e.AbstractC5459a) obj;
            if (this.f13591a.equals(abstractC5459a.mo24617e()) && this.f13592b.equals(abstractC5459a.mo24614h()) && ((str = this.f13593c) != null ? str.equals(abstractC5459a.mo24618d()) : abstractC5459a.mo24618d() == null) && ((abstractC5461b = this.f13594d) != null ? abstractC5461b.equals(abstractC5459a.mo24615g()) : abstractC5459a.mo24615g() == null) && ((str2 = this.f13595e) != null ? str2.equals(abstractC5459a.mo24616f()) : abstractC5459a.mo24616f() == null) && ((str3 = this.f13596f) != null ? str3.equals(abstractC5459a.mo24620b()) : abstractC5459a.mo24620b() == null)) {
                String str4 = this.f13597g;
                if (str4 == null) {
                    if (abstractC5459a.mo24619c() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC5459a.mo24619c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a
    /* renamed from: f */
    public String mo24616f() {
        return this.f13595e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a
    /* renamed from: g */
    public AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b mo24615g() {
        return this.f13594d;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5459a
    /* renamed from: h */
    public String mo24614h() {
        return this.f13592b;
    }

    public int hashCode() {
        int hashCode = (((this.f13591a.hashCode() ^ 1000003) * 1000003) ^ this.f13592b.hashCode()) * 1000003;
        String str = this.f13593c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b abstractC5461b = this.f13594d;
        int hashCode3 = (hashCode2 ^ (abstractC5461b == null ? 0 : abstractC5461b.hashCode())) * 1000003;
        String str2 = this.f13595e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13596f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f13597g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f13591a + ", version=" + this.f13592b + ", displayVersion=" + this.f13593c + ", organization=" + this.f13594d + ", installationUuid=" + this.f13595e + ", developmentPlatform=" + this.f13596f + ", developmentPlatformVersion=" + this.f13597g + "}";
    }

    private C5520h(String str, String str2, String str3, AbstractC5448a0.AbstractC5458e.AbstractC5459a.AbstractC5461b abstractC5461b, String str4, String str5, String str6) {
        this.f13591a = str;
        this.f13592b = str2;
        this.f13593c = str3;
        this.f13594d = abstractC5461b;
        this.f13595e = str4;
        this.f13596f = str5;
        this.f13597g = str6;
    }
}
