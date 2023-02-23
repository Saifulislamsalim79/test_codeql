package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* renamed from: com.google.firebase.crashlytics.h.l.r */
/* loaded from: classes2.dex */
final class C5548r extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b {

    /* renamed from: a */
    private final long f13684a;

    /* renamed from: b */
    private final String f13685b;

    /* renamed from: c */
    private final String f13686c;

    /* renamed from: d */
    private final long f13687d;

    /* renamed from: e */
    private final int f13688e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.r$b */
    /* loaded from: classes2.dex */
    public static final class C5550b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a {

        /* renamed from: a */
        private Long f13689a;

        /* renamed from: b */
        private String f13690b;

        /* renamed from: c */
        private String f13691c;

        /* renamed from: d */
        private Long f13692d;

        /* renamed from: e */
        private Integer f13693e;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b mo24512a() {
            String str = "";
            if (this.f13689a == null) {
                str = " pc";
            }
            if (this.f13690b == null) {
                str = str + " symbol";
            }
            if (this.f13692d == null) {
                str = str + " offset";
            }
            if (this.f13693e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C5548r(this.f13689a.longValue(), this.f13690b, this.f13691c, this.f13692d.longValue(), this.f13693e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a mo24511b(String str) {
            this.f13691c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a mo24510c(int i) {
            this.f13693e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a mo24509d(long j) {
            this.f13692d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a mo24508e(long j) {
            this.f13689a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b.AbstractC5479a mo24507f(String str) {
            if (str != null) {
                this.f13690b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b
    /* renamed from: b */
    public String mo24517b() {
        return this.f13686c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b
    /* renamed from: c */
    public int mo24516c() {
        return this.f13688e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b
    /* renamed from: d */
    public long mo24515d() {
        return this.f13687d;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b
    /* renamed from: e */
    public long mo24514e() {
        return this.f13684a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b abstractC5478b = (AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b) obj;
            return this.f13684a == abstractC5478b.mo24514e() && this.f13685b.equals(abstractC5478b.mo24513f()) && ((str = this.f13686c) != null ? str.equals(abstractC5478b.mo24517b()) : abstractC5478b.mo24517b() == null) && this.f13687d == abstractC5478b.mo24515d() && this.f13688e == abstractC5478b.mo24516c();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b
    /* renamed from: f */
    public String mo24513f() {
        return this.f13685b;
    }

    public int hashCode() {
        long j = this.f13684a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13685b.hashCode()) * 1000003;
        String str = this.f13686c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f13687d;
        return this.f13688e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f13684a + ", symbol=" + this.f13685b + ", file=" + this.f13686c + ", offset=" + this.f13687d + ", importance=" + this.f13688e + "}";
    }

    private C5548r(long j, String str, String str2, long j2, int i) {
        this.f13684a = j;
        this.f13685b = str;
        this.f13686c = str2;
        this.f13687d = j2;
        this.f13688e = i;
    }
}
