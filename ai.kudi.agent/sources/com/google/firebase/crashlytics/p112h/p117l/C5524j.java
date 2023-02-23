package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* renamed from: com.google.firebase.crashlytics.h.l.j */
/* loaded from: classes2.dex */
final class C5524j extends AbstractC5448a0.AbstractC5458e.AbstractC5463c {

    /* renamed from: a */
    private final int f13606a;

    /* renamed from: b */
    private final String f13607b;

    /* renamed from: c */
    private final int f13608c;

    /* renamed from: d */
    private final long f13609d;

    /* renamed from: e */
    private final long f13610e;

    /* renamed from: f */
    private final boolean f13611f;

    /* renamed from: g */
    private final int f13612g;

    /* renamed from: h */
    private final String f13613h;

    /* renamed from: i */
    private final String f13614i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.j$b */
    /* loaded from: classes2.dex */
    public static final class C5526b extends AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a {

        /* renamed from: a */
        private Integer f13615a;

        /* renamed from: b */
        private String f13616b;

        /* renamed from: c */
        private Integer f13617c;

        /* renamed from: d */
        private Long f13618d;

        /* renamed from: e */
        private Long f13619e;

        /* renamed from: f */
        private Boolean f13620f;

        /* renamed from: g */
        private Integer f13621g;

        /* renamed from: h */
        private String f13622h;

        /* renamed from: i */
        private String f13623i;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c mo24596a() {
            String str = "";
            if (this.f13615a == null) {
                str = " arch";
            }
            if (this.f13616b == null) {
                str = str + " model";
            }
            if (this.f13617c == null) {
                str = str + " cores";
            }
            if (this.f13618d == null) {
                str = str + " ram";
            }
            if (this.f13619e == null) {
                str = str + " diskSpace";
            }
            if (this.f13620f == null) {
                str = str + " simulator";
            }
            if (this.f13621g == null) {
                str = str + " state";
            }
            if (this.f13622h == null) {
                str = str + " manufacturer";
            }
            if (this.f13623i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C5524j(this.f13615a.intValue(), this.f13616b, this.f13617c.intValue(), this.f13618d.longValue(), this.f13619e.longValue(), this.f13620f.booleanValue(), this.f13621g.intValue(), this.f13622h, this.f13623i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24595b(int i) {
            this.f13615a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24594c(int i) {
            this.f13617c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24593d(long j) {
            this.f13619e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24592e(String str) {
            if (str != null) {
                this.f13622h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24591f(String str) {
            if (str != null) {
                this.f13616b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: g */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24590g(String str) {
            if (str != null) {
                this.f13623i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: h */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24589h(long j) {
            this.f13618d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: i */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24588i(boolean z) {
            this.f13620f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a
        /* renamed from: j */
        public AbstractC5448a0.AbstractC5458e.AbstractC5463c.AbstractC5464a mo24587j(int i) {
            this.f13621g = Integer.valueOf(i);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: b */
    public int mo24605b() {
        return this.f13606a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: c */
    public int mo24604c() {
        return this.f13608c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: d */
    public long mo24603d() {
        return this.f13610e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: e */
    public String mo24602e() {
        return this.f13613h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5463c) {
            AbstractC5448a0.AbstractC5458e.AbstractC5463c abstractC5463c = (AbstractC5448a0.AbstractC5458e.AbstractC5463c) obj;
            return this.f13606a == abstractC5463c.mo24605b() && this.f13607b.equals(abstractC5463c.mo24601f()) && this.f13608c == abstractC5463c.mo24604c() && this.f13609d == abstractC5463c.mo24599h() && this.f13610e == abstractC5463c.mo24603d() && this.f13611f == abstractC5463c.mo24597j() && this.f13612g == abstractC5463c.mo24598i() && this.f13613h.equals(abstractC5463c.mo24602e()) && this.f13614i.equals(abstractC5463c.mo24600g());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: f */
    public String mo24601f() {
        return this.f13607b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: g */
    public String mo24600g() {
        return this.f13614i;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: h */
    public long mo24599h() {
        return this.f13609d;
    }

    public int hashCode() {
        long j = this.f13609d;
        long j2 = this.f13610e;
        return ((((((((((((((((this.f13606a ^ 1000003) * 1000003) ^ this.f13607b.hashCode()) * 1000003) ^ this.f13608c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f13611f ? 1231 : 1237)) * 1000003) ^ this.f13612g) * 1000003) ^ this.f13613h.hashCode()) * 1000003) ^ this.f13614i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: i */
    public int mo24598i() {
        return this.f13612g;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5463c
    /* renamed from: j */
    public boolean mo24597j() {
        return this.f13611f;
    }

    public String toString() {
        return "Device{arch=" + this.f13606a + ", model=" + this.f13607b + ", cores=" + this.f13608c + ", ram=" + this.f13609d + ", diskSpace=" + this.f13610e + ", simulator=" + this.f13611f + ", state=" + this.f13612g + ", manufacturer=" + this.f13613h + ", modelClass=" + this.f13614i + "}";
    }

    private C5524j(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f13606a = i;
        this.f13607b = str;
        this.f13608c = i2;
        this.f13609d = j;
        this.f13610e = j2;
        this.f13611f = z;
        this.f13612g = i3;
        this.f13613h = str2;
        this.f13614i = str3;
    }
}
