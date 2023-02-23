package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s;
import java.util.Set;
/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
/* loaded from: classes2.dex */
final class C2662q extends AbstractC2666s.AbstractC2668b {

    /* renamed from: a */
    private final long f7457a;

    /* renamed from: b */
    private final long f7458b;

    /* renamed from: c */
    private final Set<AbstractC2666s.EnumC2670c> f7459c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q$b */
    /* loaded from: classes2.dex */
    static final class C2664b extends AbstractC2666s.AbstractC2668b.AbstractC2669a {

        /* renamed from: a */
        private Long f7460a;

        /* renamed from: b */
        private Long f7461b;

        /* renamed from: c */
        private Set<AbstractC2666s.EnumC2670c> f7462c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s.AbstractC2668b.AbstractC2669a
        /* renamed from: a */
        public AbstractC2666s.AbstractC2668b mo32423a() {
            String str = "";
            if (this.f7460a == null) {
                str = " delta";
            }
            if (this.f7461b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f7462c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C2662q(this.f7460a.longValue(), this.f7461b.longValue(), this.f7462c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s.AbstractC2668b.AbstractC2669a
        /* renamed from: b */
        public AbstractC2666s.AbstractC2668b.AbstractC2669a mo32422b(long j) {
            this.f7460a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s.AbstractC2668b.AbstractC2669a
        /* renamed from: c */
        public AbstractC2666s.AbstractC2668b.AbstractC2669a mo32421c(Set<AbstractC2666s.EnumC2670c> set) {
            if (set != null) {
                this.f7462c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s.AbstractC2668b.AbstractC2669a
        /* renamed from: d */
        public AbstractC2666s.AbstractC2668b.AbstractC2669a mo32420d(long j) {
            this.f7461b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s.AbstractC2668b
    /* renamed from: b */
    long mo32426b() {
        return this.f7457a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s.AbstractC2668b
    /* renamed from: c */
    Set<AbstractC2666s.EnumC2670c> mo32425c() {
        return this.f7459c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC2666s.AbstractC2668b
    /* renamed from: d */
    long mo32424d() {
        return this.f7458b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2666s.AbstractC2668b) {
            AbstractC2666s.AbstractC2668b abstractC2668b = (AbstractC2666s.AbstractC2668b) obj;
            return this.f7457a == abstractC2668b.mo32426b() && this.f7458b == abstractC2668b.mo32424d() && this.f7459c.equals(abstractC2668b.mo32425c());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7457a;
        long j2 = this.f7458b;
        return this.f7459c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f7457a + ", maxAllowedDelay=" + this.f7458b + ", flags=" + this.f7459c + "}";
    }

    private C2662q(long j, long j2, Set<AbstractC2666s.EnumC2670c> set) {
        this.f7457a = j;
        this.f7458b = j2;
        this.f7459c = set;
    }
}
