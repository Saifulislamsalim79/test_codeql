package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* renamed from: com.google.firebase.crashlytics.h.l.c */
/* loaded from: classes2.dex */
final class C5493c extends AbstractC5448a0.AbstractC5449a {

    /* renamed from: a */
    private final int f13534a;

    /* renamed from: b */
    private final String f13535b;

    /* renamed from: c */
    private final int f13536c;

    /* renamed from: d */
    private final int f13537d;

    /* renamed from: e */
    private final long f13538e;

    /* renamed from: f */
    private final long f13539f;

    /* renamed from: g */
    private final long f13540g;

    /* renamed from: h */
    private final String f13541h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.c$b */
    /* loaded from: classes2.dex */
    public static final class C5495b extends AbstractC5448a0.AbstractC5449a.AbstractC5450a {

        /* renamed from: a */
        private Integer f13542a;

        /* renamed from: b */
        private String f13543b;

        /* renamed from: c */
        private Integer f13544c;

        /* renamed from: d */
        private Integer f13545d;

        /* renamed from: e */
        private Long f13546e;

        /* renamed from: f */
        private Long f13547f;

        /* renamed from: g */
        private Long f13548g;

        /* renamed from: h */
        private String f13549h;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5449a mo24704a() {
            String str = "";
            if (this.f13542a == null) {
                str = " pid";
            }
            if (this.f13543b == null) {
                str = str + " processName";
            }
            if (this.f13544c == null) {
                str = str + " reasonCode";
            }
            if (this.f13545d == null) {
                str = str + " importance";
            }
            if (this.f13546e == null) {
                str = str + " pss";
            }
            if (this.f13547f == null) {
                str = str + " rss";
            }
            if (this.f13548g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C5493c(this.f13542a.intValue(), this.f13543b, this.f13544c.intValue(), this.f13545d.intValue(), this.f13546e.longValue(), this.f13547f.longValue(), this.f13548g.longValue(), this.f13549h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5449a.AbstractC5450a mo24703b(int i) {
            this.f13545d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5449a.AbstractC5450a mo24702c(int i) {
            this.f13542a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5449a.AbstractC5450a mo24701d(String str) {
            if (str != null) {
                this.f13543b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5449a.AbstractC5450a mo24700e(long j) {
            this.f13546e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5449a.AbstractC5450a mo24699f(int i) {
            this.f13544c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: g */
        public AbstractC5448a0.AbstractC5449a.AbstractC5450a mo24698g(long j) {
            this.f13547f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: h */
        public AbstractC5448a0.AbstractC5449a.AbstractC5450a mo24697h(long j) {
            this.f13548g = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a.AbstractC5450a
        /* renamed from: i */
        public AbstractC5448a0.AbstractC5449a.AbstractC5450a mo24696i(String str) {
            this.f13549h = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a
    /* renamed from: b */
    public int mo24712b() {
        return this.f13537d;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a
    /* renamed from: c */
    public int mo24711c() {
        return this.f13534a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a
    /* renamed from: d */
    public String mo24710d() {
        return this.f13535b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a
    /* renamed from: e */
    public long mo24709e() {
        return this.f13538e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5449a) {
            AbstractC5448a0.AbstractC5449a abstractC5449a = (AbstractC5448a0.AbstractC5449a) obj;
            if (this.f13534a == abstractC5449a.mo24711c() && this.f13535b.equals(abstractC5449a.mo24710d()) && this.f13536c == abstractC5449a.mo24708f() && this.f13537d == abstractC5449a.mo24712b() && this.f13538e == abstractC5449a.mo24709e() && this.f13539f == abstractC5449a.mo24707g() && this.f13540g == abstractC5449a.mo24706h()) {
                String str = this.f13541h;
                if (str == null) {
                    if (abstractC5449a.mo24705i() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC5449a.mo24705i())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a
    /* renamed from: f */
    public int mo24708f() {
        return this.f13536c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a
    /* renamed from: g */
    public long mo24707g() {
        return this.f13539f;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a
    /* renamed from: h */
    public long mo24706h() {
        return this.f13540g;
    }

    public int hashCode() {
        long j = this.f13538e;
        long j2 = this.f13539f;
        long j3 = this.f13540g;
        int hashCode = (((((((((((((this.f13534a ^ 1000003) * 1000003) ^ this.f13535b.hashCode()) * 1000003) ^ this.f13536c) * 1000003) ^ this.f13537d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f13541h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5449a
    /* renamed from: i */
    public String mo24705i() {
        return this.f13541h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f13534a + ", processName=" + this.f13535b + ", reasonCode=" + this.f13536c + ", importance=" + this.f13537d + ", pss=" + this.f13538e + ", rss=" + this.f13539f + ", timestamp=" + this.f13540g + ", traceFile=" + this.f13541h + "}";
    }

    private C5493c(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.f13534a = i;
        this.f13535b = str;
        this.f13536c = i2;
        this.f13537d = i3;
        this.f13538e = j;
        this.f13539f = j2;
        this.f13540g = j3;
        this.f13541h = str2;
    }
}
