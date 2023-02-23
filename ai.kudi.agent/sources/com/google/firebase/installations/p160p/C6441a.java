package com.google.firebase.installations.p160p;

import com.google.firebase.installations.p160p.AbstractC6447d;
import com.google.firebase.installations.p160p.C6445c;
/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* renamed from: com.google.firebase.installations.p.a */
/* loaded from: classes2.dex */
final class C6441a extends AbstractC6447d {

    /* renamed from: a */
    private final String f15549a;

    /* renamed from: b */
    private final C6445c.EnumC6446a f15550b;

    /* renamed from: c */
    private final String f15551c;

    /* renamed from: d */
    private final String f15552d;

    /* renamed from: e */
    private final long f15553e;

    /* renamed from: f */
    private final long f15554f;

    /* renamed from: g */
    private final String f15555g;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: com.google.firebase.installations.p.a$b */
    /* loaded from: classes2.dex */
    static final class C6443b extends AbstractC6447d.AbstractC6448a {

        /* renamed from: a */
        private String f15556a;

        /* renamed from: b */
        private C6445c.EnumC6446a f15557b;

        /* renamed from: c */
        private String f15558c;

        /* renamed from: d */
        private String f15559d;

        /* renamed from: e */
        private Long f15560e;

        /* renamed from: f */
        private Long f15561f;

        /* renamed from: g */
        private String f15562g;

        @Override // com.google.firebase.installations.p160p.AbstractC6447d.AbstractC6448a
        /* renamed from: a */
        public AbstractC6447d mo21994a() {
            String str = "";
            if (this.f15557b == null) {
                str = " registrationStatus";
            }
            if (this.f15560e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f15561f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C6441a(this.f15556a, this.f15557b, this.f15558c, this.f15559d, this.f15560e.longValue(), this.f15561f.longValue(), this.f15562g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.p160p.AbstractC6447d.AbstractC6448a
        /* renamed from: b */
        public AbstractC6447d.AbstractC6448a mo21993b(String str) {
            this.f15558c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p160p.AbstractC6447d.AbstractC6448a
        /* renamed from: c */
        public AbstractC6447d.AbstractC6448a mo21992c(long j) {
            this.f15560e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.p160p.AbstractC6447d.AbstractC6448a
        /* renamed from: d */
        public AbstractC6447d.AbstractC6448a mo21991d(String str) {
            this.f15556a = str;
            return this;
        }

        @Override // com.google.firebase.installations.p160p.AbstractC6447d.AbstractC6448a
        /* renamed from: e */
        public AbstractC6447d.AbstractC6448a mo21990e(String str) {
            this.f15562g = str;
            return this;
        }

        @Override // com.google.firebase.installations.p160p.AbstractC6447d.AbstractC6448a
        /* renamed from: f */
        public AbstractC6447d.AbstractC6448a mo21989f(String str) {
            this.f15559d = str;
            return this;
        }

        @Override // com.google.firebase.installations.p160p.AbstractC6447d.AbstractC6448a
        /* renamed from: g */
        public AbstractC6447d.AbstractC6448a mo21988g(C6445c.EnumC6446a enumC6446a) {
            if (enumC6446a != null) {
                this.f15557b = enumC6446a;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // com.google.firebase.installations.p160p.AbstractC6447d.AbstractC6448a
        /* renamed from: h */
        public AbstractC6447d.AbstractC6448a mo21987h(long j) {
            this.f15561f = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C6443b() {
        }

        private C6443b(AbstractC6447d abstractC6447d) {
            this.f15556a = abstractC6447d.mo22011d();
            this.f15557b = abstractC6447d.mo22008g();
            this.f15558c = abstractC6447d.mo22013b();
            this.f15559d = abstractC6447d.mo22009f();
            this.f15560e = Long.valueOf(abstractC6447d.mo22012c());
            this.f15561f = Long.valueOf(abstractC6447d.mo22007h());
            this.f15562g = abstractC6447d.mo22010e();
        }
    }

    @Override // com.google.firebase.installations.p160p.AbstractC6447d
    /* renamed from: b */
    public String mo22013b() {
        return this.f15551c;
    }

    @Override // com.google.firebase.installations.p160p.AbstractC6447d
    /* renamed from: c */
    public long mo22012c() {
        return this.f15553e;
    }

    @Override // com.google.firebase.installations.p160p.AbstractC6447d
    /* renamed from: d */
    public String mo22011d() {
        return this.f15549a;
    }

    @Override // com.google.firebase.installations.p160p.AbstractC6447d
    /* renamed from: e */
    public String mo22010e() {
        return this.f15555g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6447d) {
            AbstractC6447d abstractC6447d = (AbstractC6447d) obj;
            String str3 = this.f15549a;
            if (str3 != null ? str3.equals(abstractC6447d.mo22011d()) : abstractC6447d.mo22011d() == null) {
                if (this.f15550b.equals(abstractC6447d.mo22008g()) && ((str = this.f15551c) != null ? str.equals(abstractC6447d.mo22013b()) : abstractC6447d.mo22013b() == null) && ((str2 = this.f15552d) != null ? str2.equals(abstractC6447d.mo22009f()) : abstractC6447d.mo22009f() == null) && this.f15553e == abstractC6447d.mo22012c() && this.f15554f == abstractC6447d.mo22007h()) {
                    String str4 = this.f15555g;
                    if (str4 == null) {
                        if (abstractC6447d.mo22010e() == null) {
                            return true;
                        }
                    } else if (str4.equals(abstractC6447d.mo22010e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.installations.p160p.AbstractC6447d
    /* renamed from: f */
    public String mo22009f() {
        return this.f15552d;
    }

    @Override // com.google.firebase.installations.p160p.AbstractC6447d
    /* renamed from: g */
    public C6445c.EnumC6446a mo22008g() {
        return this.f15550b;
    }

    @Override // com.google.firebase.installations.p160p.AbstractC6447d
    /* renamed from: h */
    public long mo22007h() {
        return this.f15554f;
    }

    public int hashCode() {
        String str = this.f15549a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f15550b.hashCode()) * 1000003;
        String str2 = this.f15551c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15552d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f15553e;
        long j2 = this.f15554f;
        int i = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f15555g;
        return i ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.p160p.AbstractC6447d
    /* renamed from: n */
    public AbstractC6447d.AbstractC6448a mo22001n() {
        return new C6443b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f15549a + ", registrationStatus=" + this.f15550b + ", authToken=" + this.f15551c + ", refreshToken=" + this.f15552d + ", expiresInSecs=" + this.f15553e + ", tokenCreationEpochInSecs=" + this.f15554f + ", fisError=" + this.f15555g + "}";
    }

    private C6441a(String str, C6445c.EnumC6446a enumC6446a, String str2, String str3, long j, long j2, String str4) {
        this.f15549a = str;
        this.f15550b = enumC6446a;
        this.f15551c = str2;
        this.f15552d = str3;
        this.f15553e = j;
        this.f15554f = j2;
        this.f15555g = str4;
    }
}
