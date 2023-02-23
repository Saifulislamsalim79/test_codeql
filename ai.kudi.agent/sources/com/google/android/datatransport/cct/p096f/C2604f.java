package com.google.android.datatransport.cct.p096f;

import com.google.android.datatransport.cct.p096f.AbstractC2618l;
import java.util.Arrays;
/* compiled from: AutoValue_LogEvent.java */
/* renamed from: com.google.android.datatransport.cct.f.f */
/* loaded from: classes2.dex */
final class C2604f extends AbstractC2618l {

    /* renamed from: a */
    private final long f7303a;

    /* renamed from: b */
    private final Integer f7304b;

    /* renamed from: c */
    private final long f7305c;

    /* renamed from: d */
    private final byte[] f7306d;

    /* renamed from: e */
    private final String f7307e;

    /* renamed from: f */
    private final long f7308f;

    /* renamed from: g */
    private final AbstractC2623o f7309g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_LogEvent.java */
    /* renamed from: com.google.android.datatransport.cct.f.f$b */
    /* loaded from: classes2.dex */
    public static final class C2606b extends AbstractC2618l.AbstractC2619a {

        /* renamed from: a */
        private Long f7310a;

        /* renamed from: b */
        private Integer f7311b;

        /* renamed from: c */
        private Long f7312c;

        /* renamed from: d */
        private byte[] f7313d;

        /* renamed from: e */
        private String f7314e;

        /* renamed from: f */
        private Long f7315f;

        /* renamed from: g */
        private AbstractC2623o f7316g;

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l.AbstractC2619a
        /* renamed from: a */
        public AbstractC2618l mo32515a() {
            String str = "";
            if (this.f7310a == null) {
                str = " eventTimeMs";
            }
            if (this.f7312c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f7315f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C2604f(this.f7310a.longValue(), this.f7311b, this.f7312c.longValue(), this.f7313d, this.f7314e, this.f7315f.longValue(), this.f7316g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l.AbstractC2619a
        /* renamed from: b */
        public AbstractC2618l.AbstractC2619a mo32514b(Integer num) {
            this.f7311b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l.AbstractC2619a
        /* renamed from: c */
        public AbstractC2618l.AbstractC2619a mo32513c(long j) {
            this.f7310a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l.AbstractC2619a
        /* renamed from: d */
        public AbstractC2618l.AbstractC2619a mo32512d(long j) {
            this.f7312c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l.AbstractC2619a
        /* renamed from: e */
        public AbstractC2618l.AbstractC2619a mo32511e(AbstractC2623o abstractC2623o) {
            this.f7316g = abstractC2623o;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l.AbstractC2619a
        /* renamed from: f */
        AbstractC2618l.AbstractC2619a mo32510f(byte[] bArr) {
            this.f7313d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l.AbstractC2619a
        /* renamed from: g */
        AbstractC2618l.AbstractC2619a mo32509g(String str) {
            this.f7314e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l.AbstractC2619a
        /* renamed from: h */
        public AbstractC2618l.AbstractC2619a mo32508h(long j) {
            this.f7315f = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l
    /* renamed from: b */
    public Integer mo32524b() {
        return this.f7304b;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l
    /* renamed from: c */
    public long mo32523c() {
        return this.f7303a;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l
    /* renamed from: d */
    public long mo32522d() {
        return this.f7305c;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l
    /* renamed from: e */
    public AbstractC2623o mo32521e() {
        return this.f7309g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2618l) {
            AbstractC2618l abstractC2618l = (AbstractC2618l) obj;
            if (this.f7303a == abstractC2618l.mo32523c() && ((num = this.f7304b) != null ? num.equals(abstractC2618l.mo32524b()) : abstractC2618l.mo32524b() == null) && this.f7305c == abstractC2618l.mo32522d()) {
                if (Arrays.equals(this.f7306d, abstractC2618l instanceof C2604f ? ((C2604f) abstractC2618l).f7306d : abstractC2618l.mo32520f()) && ((str = this.f7307e) != null ? str.equals(abstractC2618l.mo32519g()) : abstractC2618l.mo32519g() == null) && this.f7308f == abstractC2618l.mo32518h()) {
                    AbstractC2623o abstractC2623o = this.f7309g;
                    if (abstractC2623o == null) {
                        if (abstractC2618l.mo32521e() == null) {
                            return true;
                        }
                    } else if (abstractC2623o.equals(abstractC2618l.mo32521e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l
    /* renamed from: f */
    public byte[] mo32520f() {
        return this.f7306d;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l
    /* renamed from: g */
    public String mo32519g() {
        return this.f7307e;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2618l
    /* renamed from: h */
    public long mo32518h() {
        return this.f7308f;
    }

    public int hashCode() {
        long j = this.f7303a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f7304b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f7305c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f7306d)) * 1000003;
        String str = this.f7307e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f7308f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC2623o abstractC2623o = this.f7309g;
        return i2 ^ (abstractC2623o != null ? abstractC2623o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f7303a + ", eventCode=" + this.f7304b + ", eventUptimeMs=" + this.f7305c + ", sourceExtension=" + Arrays.toString(this.f7306d) + ", sourceExtensionJsonProto3=" + this.f7307e + ", timezoneOffsetSeconds=" + this.f7308f + ", networkConnectionInfo=" + this.f7309g + "}";
    }

    private C2604f(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC2623o abstractC2623o) {
        this.f7303a = j;
        this.f7304b = num;
        this.f7305c = j2;
        this.f7306d = bArr;
        this.f7307e = str;
        this.f7308f = j3;
        this.f7309g = abstractC2623o;
    }
}
