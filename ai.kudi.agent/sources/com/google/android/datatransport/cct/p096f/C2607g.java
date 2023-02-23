package com.google.android.datatransport.cct.p096f;

import com.google.android.datatransport.cct.p096f.AbstractC2620m;
import java.util.List;
/* compiled from: AutoValue_LogRequest.java */
/* renamed from: com.google.android.datatransport.cct.f.g */
/* loaded from: classes2.dex */
final class C2607g extends AbstractC2620m {

    /* renamed from: a */
    private final long f7317a;

    /* renamed from: b */
    private final long f7318b;

    /* renamed from: c */
    private final AbstractC2615k f7319c;

    /* renamed from: d */
    private final Integer f7320d;

    /* renamed from: e */
    private final String f7321e;

    /* renamed from: f */
    private final List<AbstractC2618l> f7322f;

    /* renamed from: g */
    private final EnumC2627p f7323g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_LogRequest.java */
    /* renamed from: com.google.android.datatransport.cct.f.g$b */
    /* loaded from: classes2.dex */
    public static final class C2609b extends AbstractC2620m.AbstractC2621a {

        /* renamed from: a */
        private Long f7324a;

        /* renamed from: b */
        private Long f7325b;

        /* renamed from: c */
        private AbstractC2615k f7326c;

        /* renamed from: d */
        private Integer f7327d;

        /* renamed from: e */
        private String f7328e;

        /* renamed from: f */
        private List<AbstractC2618l> f7329f;

        /* renamed from: g */
        private EnumC2627p f7330g;

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m.AbstractC2621a
        /* renamed from: a */
        public AbstractC2620m mo32499a() {
            String str = "";
            if (this.f7324a == null) {
                str = " requestTimeMs";
            }
            if (this.f7325b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C2607g(this.f7324a.longValue(), this.f7325b.longValue(), this.f7326c, this.f7327d, this.f7328e, this.f7329f, this.f7330g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m.AbstractC2621a
        /* renamed from: b */
        public AbstractC2620m.AbstractC2621a mo32498b(AbstractC2615k abstractC2615k) {
            this.f7326c = abstractC2615k;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m.AbstractC2621a
        /* renamed from: c */
        public AbstractC2620m.AbstractC2621a mo32497c(List<AbstractC2618l> list) {
            this.f7329f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m.AbstractC2621a
        /* renamed from: d */
        AbstractC2620m.AbstractC2621a mo32496d(Integer num) {
            this.f7327d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m.AbstractC2621a
        /* renamed from: e */
        AbstractC2620m.AbstractC2621a mo32495e(String str) {
            this.f7328e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m.AbstractC2621a
        /* renamed from: f */
        public AbstractC2620m.AbstractC2621a mo32494f(EnumC2627p enumC2627p) {
            this.f7330g = enumC2627p;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m.AbstractC2621a
        /* renamed from: g */
        public AbstractC2620m.AbstractC2621a mo32493g(long j) {
            this.f7324a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m.AbstractC2621a
        /* renamed from: h */
        public AbstractC2620m.AbstractC2621a mo32492h(long j) {
            this.f7325b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m
    /* renamed from: b */
    public AbstractC2615k mo32506b() {
        return this.f7319c;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m
    /* renamed from: c */
    public List<AbstractC2618l> mo32505c() {
        return this.f7322f;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m
    /* renamed from: d */
    public Integer mo32504d() {
        return this.f7320d;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m
    /* renamed from: e */
    public String mo32503e() {
        return this.f7321e;
    }

    public boolean equals(Object obj) {
        AbstractC2615k abstractC2615k;
        Integer num;
        String str;
        List<AbstractC2618l> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2620m) {
            AbstractC2620m abstractC2620m = (AbstractC2620m) obj;
            if (this.f7317a == abstractC2620m.mo32501g() && this.f7318b == abstractC2620m.mo32500h() && ((abstractC2615k = this.f7319c) != null ? abstractC2615k.equals(abstractC2620m.mo32506b()) : abstractC2620m.mo32506b() == null) && ((num = this.f7320d) != null ? num.equals(abstractC2620m.mo32504d()) : abstractC2620m.mo32504d() == null) && ((str = this.f7321e) != null ? str.equals(abstractC2620m.mo32503e()) : abstractC2620m.mo32503e() == null) && ((list = this.f7322f) != null ? list.equals(abstractC2620m.mo32505c()) : abstractC2620m.mo32505c() == null)) {
                EnumC2627p enumC2627p = this.f7323g;
                if (enumC2627p == null) {
                    if (abstractC2620m.mo32502f() == null) {
                        return true;
                    }
                } else if (enumC2627p.equals(abstractC2620m.mo32502f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m
    /* renamed from: f */
    public EnumC2627p mo32502f() {
        return this.f7323g;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m
    /* renamed from: g */
    public long mo32501g() {
        return this.f7317a;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2620m
    /* renamed from: h */
    public long mo32500h() {
        return this.f7318b;
    }

    public int hashCode() {
        long j = this.f7317a;
        long j2 = this.f7318b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        AbstractC2615k abstractC2615k = this.f7319c;
        int hashCode = (i ^ (abstractC2615k == null ? 0 : abstractC2615k.hashCode())) * 1000003;
        Integer num = this.f7320d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f7321e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC2618l> list = this.f7322f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC2627p enumC2627p = this.f7323g;
        return hashCode4 ^ (enumC2627p != null ? enumC2627p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f7317a + ", requestUptimeMs=" + this.f7318b + ", clientInfo=" + this.f7319c + ", logSource=" + this.f7320d + ", logSourceName=" + this.f7321e + ", logEvents=" + this.f7322f + ", qosTier=" + this.f7323g + "}";
    }

    private C2607g(long j, long j2, AbstractC2615k abstractC2615k, Integer num, String str, List<AbstractC2618l> list, EnumC2627p enumC2627p) {
        this.f7317a = j;
        this.f7318b = j2;
        this.f7319c = abstractC2615k;
        this.f7320d = num;
        this.f7321e = str;
        this.f7322f = list;
        this.f7323g = enumC2627p;
    }
}
