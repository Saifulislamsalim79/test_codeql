package com.google.firebase.installations.p161q;

import com.google.firebase.installations.p161q.AbstractC6460f;
/* compiled from: AutoValue_TokenResult.java */
/* renamed from: com.google.firebase.installations.q.b */
/* loaded from: classes2.dex */
final class C6452b extends AbstractC6460f {

    /* renamed from: a */
    private final String f15584a;

    /* renamed from: b */
    private final long f15585b;

    /* renamed from: c */
    private final AbstractC6460f.EnumC6462b f15586c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: com.google.firebase.installations.q.b$b */
    /* loaded from: classes2.dex */
    public static final class C6454b extends AbstractC6460f.AbstractC6461a {

        /* renamed from: a */
        private String f15587a;

        /* renamed from: b */
        private Long f15588b;

        /* renamed from: c */
        private AbstractC6460f.EnumC6462b f15589c;

        @Override // com.google.firebase.installations.p161q.AbstractC6460f.AbstractC6461a
        /* renamed from: a */
        public AbstractC6460f mo21945a() {
            String str = "";
            if (this.f15588b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6452b(this.f15587a, this.f15588b.longValue(), this.f15589c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.p161q.AbstractC6460f.AbstractC6461a
        /* renamed from: b */
        public AbstractC6460f.AbstractC6461a mo21944b(AbstractC6460f.EnumC6462b enumC6462b) {
            this.f15589c = enumC6462b;
            return this;
        }

        @Override // com.google.firebase.installations.p161q.AbstractC6460f.AbstractC6461a
        /* renamed from: c */
        public AbstractC6460f.AbstractC6461a mo21943c(String str) {
            this.f15587a = str;
            return this;
        }

        @Override // com.google.firebase.installations.p161q.AbstractC6460f.AbstractC6461a
        /* renamed from: d */
        public AbstractC6460f.AbstractC6461a mo21942d(long j) {
            this.f15588b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.installations.p161q.AbstractC6460f
    /* renamed from: b */
    public AbstractC6460f.EnumC6462b mo21948b() {
        return this.f15586c;
    }

    @Override // com.google.firebase.installations.p161q.AbstractC6460f
    /* renamed from: c */
    public String mo21947c() {
        return this.f15584a;
    }

    @Override // com.google.firebase.installations.p161q.AbstractC6460f
    /* renamed from: d */
    public long mo21946d() {
        return this.f15585b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6460f) {
            AbstractC6460f abstractC6460f = (AbstractC6460f) obj;
            String str = this.f15584a;
            if (str != null ? str.equals(abstractC6460f.mo21947c()) : abstractC6460f.mo21947c() == null) {
                if (this.f15585b == abstractC6460f.mo21946d()) {
                    AbstractC6460f.EnumC6462b enumC6462b = this.f15586c;
                    if (enumC6462b == null) {
                        if (abstractC6460f.mo21948b() == null) {
                            return true;
                        }
                    } else if (enumC6462b.equals(abstractC6460f.mo21948b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15584a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f15585b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC6460f.EnumC6462b enumC6462b = this.f15586c;
        return i ^ (enumC6462b != null ? enumC6462b.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f15584a + ", tokenExpirationTimestamp=" + this.f15585b + ", responseCode=" + this.f15586c + "}";
    }

    private C6452b(String str, long j, AbstractC6460f.EnumC6462b enumC6462b) {
        this.f15584a = str;
        this.f15585b = j;
        this.f15586c = enumC6462b;
    }
}
