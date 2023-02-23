package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC6435k;
/* compiled from: AutoValue_InstallationTokenResult.java */
/* renamed from: com.google.firebase.installations.e */
/* loaded from: classes2.dex */
final class C6425e extends AbstractC6435k {

    /* renamed from: a */
    private final String f15515a;

    /* renamed from: b */
    private final long f15516b;

    /* renamed from: c */
    private final long f15517c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_InstallationTokenResult.java */
    /* renamed from: com.google.firebase.installations.e$b */
    /* loaded from: classes2.dex */
    public static final class C6427b extends AbstractC6435k.AbstractC6436a {

        /* renamed from: a */
        private String f15518a;

        /* renamed from: b */
        private Long f15519b;

        /* renamed from: c */
        private Long f15520c;

        @Override // com.google.firebase.installations.AbstractC6435k.AbstractC6436a
        /* renamed from: a */
        public AbstractC6435k mo22044a() {
            String str = "";
            if (this.f15518a == null) {
                str = " token";
            }
            if (this.f15519b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f15520c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6425e(this.f15518a, this.f15519b.longValue(), this.f15520c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC6435k.AbstractC6436a
        /* renamed from: b */
        public AbstractC6435k.AbstractC6436a mo22043b(String str) {
            if (str != null) {
                this.f15518a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.AbstractC6435k.AbstractC6436a
        /* renamed from: c */
        public AbstractC6435k.AbstractC6436a mo22042c(long j) {
            this.f15520c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC6435k.AbstractC6436a
        /* renamed from: d */
        public AbstractC6435k.AbstractC6436a mo22041d(long j) {
            this.f15519b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC6435k
    /* renamed from: b */
    public String mo22047b() {
        return this.f15515a;
    }

    @Override // com.google.firebase.installations.AbstractC6435k
    /* renamed from: c */
    public long mo22046c() {
        return this.f15517c;
    }

    @Override // com.google.firebase.installations.AbstractC6435k
    /* renamed from: d */
    public long mo22045d() {
        return this.f15516b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6435k) {
            AbstractC6435k abstractC6435k = (AbstractC6435k) obj;
            return this.f15515a.equals(abstractC6435k.mo22047b()) && this.f15516b == abstractC6435k.mo22045d() && this.f15517c == abstractC6435k.mo22046c();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f15516b;
        long j2 = this.f15517c;
        return ((((this.f15515a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f15515a + ", tokenExpirationTimestamp=" + this.f15516b + ", tokenCreationTimestamp=" + this.f15517c + "}";
    }

    private C6425e(String str, long j, long j2) {
        this.f15515a = str;
        this.f15516b = j;
        this.f15517c = j2;
    }
}
