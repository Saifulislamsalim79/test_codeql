package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport.java */
/* renamed from: com.google.firebase.crashlytics.h.l.b */
/* loaded from: classes2.dex */
final class C5489b extends AbstractC5448a0 {

    /* renamed from: b */
    private final String f13517b;

    /* renamed from: c */
    private final String f13518c;

    /* renamed from: d */
    private final int f13519d;

    /* renamed from: e */
    private final String f13520e;

    /* renamed from: f */
    private final String f13521f;

    /* renamed from: g */
    private final String f13522g;

    /* renamed from: h */
    private final AbstractC5448a0.AbstractC5458e f13523h;

    /* renamed from: i */
    private final AbstractC5448a0.AbstractC5454d f13524i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.b$b */
    /* loaded from: classes2.dex */
    public static final class C5491b extends AbstractC5448a0.AbstractC5451b {

        /* renamed from: a */
        private String f13525a;

        /* renamed from: b */
        private String f13526b;

        /* renamed from: c */
        private Integer f13527c;

        /* renamed from: d */
        private String f13528d;

        /* renamed from: e */
        private String f13529e;

        /* renamed from: f */
        private String f13530f;

        /* renamed from: g */
        private AbstractC5448a0.AbstractC5458e f13531g;

        /* renamed from: h */
        private AbstractC5448a0.AbstractC5454d f13532h;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: a */
        public AbstractC5448a0 mo24723a() {
            String str = "";
            if (this.f13525a == null) {
                str = " sdkVersion";
            }
            if (this.f13526b == null) {
                str = str + " gmpAppId";
            }
            if (this.f13527c == null) {
                str = str + " platform";
            }
            if (this.f13528d == null) {
                str = str + " installationUuid";
            }
            if (this.f13529e == null) {
                str = str + " buildVersion";
            }
            if (this.f13530f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C5489b(this.f13525a, this.f13526b, this.f13527c.intValue(), this.f13528d, this.f13529e, this.f13530f, this.f13531g, this.f13532h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5451b mo24722b(String str) {
            if (str != null) {
                this.f13529e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5451b mo24721c(String str) {
            if (str != null) {
                this.f13530f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5451b mo24720d(String str) {
            if (str != null) {
                this.f13526b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5451b mo24719e(String str) {
            if (str != null) {
                this.f13528d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5451b mo24718f(AbstractC5448a0.AbstractC5454d abstractC5454d) {
            this.f13532h = abstractC5454d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: g */
        public AbstractC5448a0.AbstractC5451b mo24717g(int i) {
            this.f13527c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: h */
        public AbstractC5448a0.AbstractC5451b mo24716h(String str) {
            if (str != null) {
                this.f13525a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5451b
        /* renamed from: i */
        public AbstractC5448a0.AbstractC5451b mo24715i(AbstractC5448a0.AbstractC5458e abstractC5458e) {
            this.f13531g = abstractC5458e;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5491b() {
        }

        private C5491b(AbstractC5448a0 abstractC5448a0) {
            this.f13525a = abstractC5448a0.mo24726i();
            this.f13526b = abstractC5448a0.mo24730e();
            this.f13527c = Integer.valueOf(abstractC5448a0.mo24727h());
            this.f13528d = abstractC5448a0.mo24729f();
            this.f13529e = abstractC5448a0.mo24732c();
            this.f13530f = abstractC5448a0.mo24731d();
            this.f13531g = abstractC5448a0.mo24725j();
            this.f13532h = abstractC5448a0.mo24728g();
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: c */
    public String mo24732c() {
        return this.f13521f;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: d */
    public String mo24731d() {
        return this.f13522g;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: e */
    public String mo24730e() {
        return this.f13518c;
    }

    public boolean equals(Object obj) {
        AbstractC5448a0.AbstractC5458e abstractC5458e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0) {
            AbstractC5448a0 abstractC5448a0 = (AbstractC5448a0) obj;
            if (this.f13517b.equals(abstractC5448a0.mo24726i()) && this.f13518c.equals(abstractC5448a0.mo24730e()) && this.f13519d == abstractC5448a0.mo24727h() && this.f13520e.equals(abstractC5448a0.mo24729f()) && this.f13521f.equals(abstractC5448a0.mo24732c()) && this.f13522g.equals(abstractC5448a0.mo24731d()) && ((abstractC5458e = this.f13523h) != null ? abstractC5458e.equals(abstractC5448a0.mo24725j()) : abstractC5448a0.mo24725j() == null)) {
                AbstractC5448a0.AbstractC5454d abstractC5454d = this.f13524i;
                if (abstractC5454d == null) {
                    if (abstractC5448a0.mo24728g() == null) {
                        return true;
                    }
                } else if (abstractC5454d.equals(abstractC5448a0.mo24728g())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: f */
    public String mo24729f() {
        return this.f13520e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: g */
    public AbstractC5448a0.AbstractC5454d mo24728g() {
        return this.f13524i;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: h */
    public int mo24727h() {
        return this.f13519d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f13517b.hashCode() ^ 1000003) * 1000003) ^ this.f13518c.hashCode()) * 1000003) ^ this.f13519d) * 1000003) ^ this.f13520e.hashCode()) * 1000003) ^ this.f13521f.hashCode()) * 1000003) ^ this.f13522g.hashCode()) * 1000003;
        AbstractC5448a0.AbstractC5458e abstractC5458e = this.f13523h;
        int hashCode2 = (hashCode ^ (abstractC5458e == null ? 0 : abstractC5458e.hashCode())) * 1000003;
        AbstractC5448a0.AbstractC5454d abstractC5454d = this.f13524i;
        return hashCode2 ^ (abstractC5454d != null ? abstractC5454d.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: i */
    public String mo24726i() {
        return this.f13517b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: j */
    public AbstractC5448a0.AbstractC5458e mo24725j() {
        return this.f13523h;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0
    /* renamed from: k */
    protected AbstractC5448a0.AbstractC5451b mo24724k() {
        return new C5491b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f13517b + ", gmpAppId=" + this.f13518c + ", platform=" + this.f13519d + ", installationUuid=" + this.f13520e + ", buildVersion=" + this.f13521f + ", displayVersion=" + this.f13522g + ", session=" + this.f13523h + ", ndkPayload=" + this.f13524i + "}";
    }

    private C5489b(String str, String str2, int i, String str3, String str4, String str5, AbstractC5448a0.AbstractC5458e abstractC5458e, AbstractC5448a0.AbstractC5454d abstractC5454d) {
        this.f13517b = str;
        this.f13518c = str2;
        this.f13519d = i;
        this.f13520e = str3;
        this.f13521f = str4;
        this.f13522g = str5;
        this.f13523h = abstractC5458e;
        this.f13524i = abstractC5454d;
    }
}
