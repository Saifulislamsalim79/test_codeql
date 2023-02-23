package com.google.firebase.inappmessaging.model;

import com.google.firebase.inappmessaging.model.AbstractC6395m;
/* compiled from: AutoValue_RateLimit.java */
/* renamed from: com.google.firebase.inappmessaging.model.b */
/* loaded from: classes2.dex */
final class C6368b extends AbstractC6395m {

    /* renamed from: a */
    private final String f15410a;

    /* renamed from: b */
    private final long f15411b;

    /* renamed from: c */
    private final long f15412c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_RateLimit.java */
    /* renamed from: com.google.firebase.inappmessaging.model.b$b */
    /* loaded from: classes2.dex */
    public static final class C6370b extends AbstractC6395m.AbstractC6396a {

        /* renamed from: a */
        private String f15413a;

        /* renamed from: b */
        private Long f15414b;

        /* renamed from: c */
        private Long f15415c;

        @Override // com.google.firebase.inappmessaging.model.AbstractC6395m.AbstractC6396a
        /* renamed from: a */
        public AbstractC6395m mo22122a() {
            String str = "";
            if (this.f15413a == null) {
                str = " limiterKey";
            }
            if (this.f15414b == null) {
                str = str + " limit";
            }
            if (this.f15415c == null) {
                str = str + " timeToLiveMillis";
            }
            if (str.isEmpty()) {
                return new C6368b(this.f15413a, this.f15414b.longValue(), this.f15415c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.inappmessaging.model.AbstractC6395m.AbstractC6396a
        /* renamed from: b */
        public AbstractC6395m.AbstractC6396a mo22121b(long j) {
            this.f15414b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.AbstractC6395m.AbstractC6396a
        /* renamed from: c */
        public AbstractC6395m.AbstractC6396a mo22120c(String str) {
            if (str != null) {
                this.f15413a = str;
                return this;
            }
            throw new NullPointerException("Null limiterKey");
        }

        @Override // com.google.firebase.inappmessaging.model.AbstractC6395m.AbstractC6396a
        /* renamed from: d */
        public AbstractC6395m.AbstractC6396a mo22119d(long j) {
            this.f15415c = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.inappmessaging.model.AbstractC6395m
    /* renamed from: b */
    public long mo22125b() {
        return this.f15411b;
    }

    @Override // com.google.firebase.inappmessaging.model.AbstractC6395m
    /* renamed from: c */
    public String mo22124c() {
        return this.f15410a;
    }

    @Override // com.google.firebase.inappmessaging.model.AbstractC6395m
    /* renamed from: d */
    public long mo22123d() {
        return this.f15412c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6395m) {
            AbstractC6395m abstractC6395m = (AbstractC6395m) obj;
            return this.f15410a.equals(abstractC6395m.mo22124c()) && this.f15411b == abstractC6395m.mo22125b() && this.f15412c == abstractC6395m.mo22123d();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f15411b;
        long j2 = this.f15412c;
        return ((((this.f15410a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RateLimit{limiterKey=" + this.f15410a + ", limit=" + this.f15411b + ", timeToLiveMillis=" + this.f15412c + "}";
    }

    private C6368b(String str, long j, long j2) {
        this.f15410a = str;
        this.f15411b = j;
        this.f15412c = j2;
    }
}
