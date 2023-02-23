package com.google.firebase.installations.p161q;

import com.google.firebase.installations.p161q.AbstractC6456d;
/* compiled from: AutoValue_InstallationResponse.java */
/* renamed from: com.google.firebase.installations.q.a */
/* loaded from: classes2.dex */
final class C6449a extends AbstractC6456d {

    /* renamed from: a */
    private final String f15574a;

    /* renamed from: b */
    private final String f15575b;

    /* renamed from: c */
    private final String f15576c;

    /* renamed from: d */
    private final AbstractC6460f f15577d;

    /* renamed from: e */
    private final AbstractC6456d.EnumC6458b f15578e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_InstallationResponse.java */
    /* renamed from: com.google.firebase.installations.q.a$b */
    /* loaded from: classes2.dex */
    public static final class C6451b extends AbstractC6456d.AbstractC6457a {

        /* renamed from: a */
        private String f15579a;

        /* renamed from: b */
        private String f15580b;

        /* renamed from: c */
        private String f15581c;

        /* renamed from: d */
        private AbstractC6460f f15582d;

        /* renamed from: e */
        private AbstractC6456d.EnumC6458b f15583e;

        @Override // com.google.firebase.installations.p161q.AbstractC6456d.AbstractC6457a
        /* renamed from: a */
        public AbstractC6456d mo21961a() {
            return new C6449a(this.f15579a, this.f15580b, this.f15581c, this.f15582d, this.f15583e);
        }

        @Override // com.google.firebase.installations.p161q.AbstractC6456d.AbstractC6457a
        /* renamed from: b */
        public AbstractC6456d.AbstractC6457a mo21960b(AbstractC6460f abstractC6460f) {
            this.f15582d = abstractC6460f;
            return this;
        }

        @Override // com.google.firebase.installations.p161q.AbstractC6456d.AbstractC6457a
        /* renamed from: c */
        public AbstractC6456d.AbstractC6457a mo21959c(String str) {
            this.f15580b = str;
            return this;
        }

        @Override // com.google.firebase.installations.p161q.AbstractC6456d.AbstractC6457a
        /* renamed from: d */
        public AbstractC6456d.AbstractC6457a mo21958d(String str) {
            this.f15581c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p161q.AbstractC6456d.AbstractC6457a
        /* renamed from: e */
        public AbstractC6456d.AbstractC6457a mo21957e(AbstractC6456d.EnumC6458b enumC6458b) {
            this.f15583e = enumC6458b;
            return this;
        }

        @Override // com.google.firebase.installations.p161q.AbstractC6456d.AbstractC6457a
        /* renamed from: f */
        public AbstractC6456d.AbstractC6457a mo21956f(String str) {
            this.f15579a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.p161q.AbstractC6456d
    /* renamed from: b */
    public AbstractC6460f mo21966b() {
        return this.f15577d;
    }

    @Override // com.google.firebase.installations.p161q.AbstractC6456d
    /* renamed from: c */
    public String mo21965c() {
        return this.f15575b;
    }

    @Override // com.google.firebase.installations.p161q.AbstractC6456d
    /* renamed from: d */
    public String mo21964d() {
        return this.f15576c;
    }

    @Override // com.google.firebase.installations.p161q.AbstractC6456d
    /* renamed from: e */
    public AbstractC6456d.EnumC6458b mo21963e() {
        return this.f15578e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6456d) {
            AbstractC6456d abstractC6456d = (AbstractC6456d) obj;
            String str = this.f15574a;
            if (str != null ? str.equals(abstractC6456d.mo21962f()) : abstractC6456d.mo21962f() == null) {
                String str2 = this.f15575b;
                if (str2 != null ? str2.equals(abstractC6456d.mo21965c()) : abstractC6456d.mo21965c() == null) {
                    String str3 = this.f15576c;
                    if (str3 != null ? str3.equals(abstractC6456d.mo21964d()) : abstractC6456d.mo21964d() == null) {
                        AbstractC6460f abstractC6460f = this.f15577d;
                        if (abstractC6460f != null ? abstractC6460f.equals(abstractC6456d.mo21966b()) : abstractC6456d.mo21966b() == null) {
                            AbstractC6456d.EnumC6458b enumC6458b = this.f15578e;
                            if (enumC6458b == null) {
                                if (abstractC6456d.mo21963e() == null) {
                                    return true;
                                }
                            } else if (enumC6458b.equals(abstractC6456d.mo21963e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.installations.p161q.AbstractC6456d
    /* renamed from: f */
    public String mo21962f() {
        return this.f15574a;
    }

    public int hashCode() {
        String str = this.f15574a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f15575b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15576c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC6460f abstractC6460f = this.f15577d;
        int hashCode4 = (hashCode3 ^ (abstractC6460f == null ? 0 : abstractC6460f.hashCode())) * 1000003;
        AbstractC6456d.EnumC6458b enumC6458b = this.f15578e;
        return hashCode4 ^ (enumC6458b != null ? enumC6458b.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f15574a + ", fid=" + this.f15575b + ", refreshToken=" + this.f15576c + ", authToken=" + this.f15577d + ", responseCode=" + this.f15578e + "}";
    }

    private C6449a(String str, String str2, String str3, AbstractC6460f abstractC6460f, AbstractC6456d.EnumC6458b enumC6458b) {
        this.f15574a = str;
        this.f15575b = str2;
        this.f15576c = str3;
        this.f15577d = abstractC6460f;
        this.f15578e = enumC6458b;
    }
}
