package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* renamed from: com.google.firebase.crashlytics.h.l.s */
/* loaded from: classes2.dex */
final class C5551s extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c {

    /* renamed from: a */
    private final Double f13694a;

    /* renamed from: b */
    private final int f13695b;

    /* renamed from: c */
    private final boolean f13696c;

    /* renamed from: d */
    private final int f13697d;

    /* renamed from: e */
    private final long f13698e;

    /* renamed from: f */
    private final long f13699f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.s$b */
    /* loaded from: classes2.dex */
    public static final class C5553b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a {

        /* renamed from: a */
        private Double f13700a;

        /* renamed from: b */
        private Integer f13701b;

        /* renamed from: c */
        private Boolean f13702c;

        /* renamed from: d */
        private Integer f13703d;

        /* renamed from: e */
        private Long f13704e;

        /* renamed from: f */
        private Long f13705f;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c mo24500a() {
            String str = "";
            if (this.f13701b == null) {
                str = " batteryVelocity";
            }
            if (this.f13702c == null) {
                str = str + " proximityOn";
            }
            if (this.f13703d == null) {
                str = str + " orientation";
            }
            if (this.f13704e == null) {
                str = str + " ramUsed";
            }
            if (this.f13705f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C5551s(this.f13700a, this.f13701b.intValue(), this.f13702c.booleanValue(), this.f13703d.intValue(), this.f13704e.longValue(), this.f13705f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a mo24499b(Double d) {
            this.f13700a = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a mo24498c(int i) {
            this.f13701b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a mo24497d(long j) {
            this.f13705f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a mo24496e(int i) {
            this.f13703d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a mo24495f(boolean z) {
            this.f13702c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a
        /* renamed from: g */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c.AbstractC5482a mo24494g(long j) {
            this.f13704e = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c
    /* renamed from: b */
    public Double mo24506b() {
        return this.f13694a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c
    /* renamed from: c */
    public int mo24505c() {
        return this.f13695b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c
    /* renamed from: d */
    public long mo24504d() {
        return this.f13699f;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c
    /* renamed from: e */
    public int mo24503e() {
        return this.f13697d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c abstractC5481c = (AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c) obj;
            Double d = this.f13694a;
            if (d != null ? d.equals(abstractC5481c.mo24506b()) : abstractC5481c.mo24506b() == null) {
                if (this.f13695b == abstractC5481c.mo24505c() && this.f13696c == abstractC5481c.mo24501g() && this.f13697d == abstractC5481c.mo24503e() && this.f13698e == abstractC5481c.mo24502f() && this.f13699f == abstractC5481c.mo24504d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c
    /* renamed from: f */
    public long mo24502f() {
        return this.f13698e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c
    /* renamed from: g */
    public boolean mo24501g() {
        return this.f13696c;
    }

    public int hashCode() {
        Double d = this.f13694a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f13695b) * 1000003;
        int i = this.f13696c ? 1231 : 1237;
        long j = this.f13698e;
        long j2 = this.f13699f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f13697d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f13694a + ", batteryVelocity=" + this.f13695b + ", proximityOn=" + this.f13696c + ", orientation=" + this.f13697d + ", ramUsed=" + this.f13698e + ", diskUsed=" + this.f13699f + "}";
    }

    private C5551s(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f13694a = d;
        this.f13695b = i;
        this.f13696c = z;
        this.f13697d = i2;
        this.f13698e = j;
        this.f13699f = j2;
    }
}
