package p272h.p286c.p287a.p288a.p289i.p290a0.p291j;

import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0;
/* compiled from: AutoValue_EventStoreConfig.java */
/* renamed from: h.c.a.a.i.a0.j.f0 */
/* loaded from: classes2.dex */
final class C8264f0 extends AbstractC8274j0 {

    /* renamed from: b */
    private final long f19856b;

    /* renamed from: c */
    private final int f19857c;

    /* renamed from: d */
    private final int f19858d;

    /* renamed from: e */
    private final long f19859e;

    /* renamed from: f */
    private final int f19860f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventStoreConfig.java */
    /* renamed from: h.c.a.a.i.a0.j.f0$b */
    /* loaded from: classes2.dex */
    public static final class C8266b extends AbstractC8274j0.AbstractC8275a {

        /* renamed from: a */
        private Long f19861a;

        /* renamed from: b */
        private Integer f19862b;

        /* renamed from: c */
        private Integer f19863c;

        /* renamed from: d */
        private Long f19864d;

        /* renamed from: e */
        private Integer f19865e;

        @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0.AbstractC8275a
        /* renamed from: a */
        AbstractC8274j0 mo16416a() {
            String str = "";
            if (this.f19861a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f19862b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f19863c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f19864d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f19865e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C8264f0(this.f19861a.longValue(), this.f19862b.intValue(), this.f19863c.intValue(), this.f19864d.longValue(), this.f19865e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0.AbstractC8275a
        /* renamed from: b */
        AbstractC8274j0.AbstractC8275a mo16415b(int i) {
            this.f19863c = Integer.valueOf(i);
            return this;
        }

        @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0.AbstractC8275a
        /* renamed from: c */
        AbstractC8274j0.AbstractC8275a mo16414c(long j) {
            this.f19864d = Long.valueOf(j);
            return this;
        }

        @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0.AbstractC8275a
        /* renamed from: d */
        AbstractC8274j0.AbstractC8275a mo16413d(int i) {
            this.f19862b = Integer.valueOf(i);
            return this;
        }

        @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0.AbstractC8275a
        /* renamed from: e */
        AbstractC8274j0.AbstractC8275a mo16412e(int i) {
            this.f19865e = Integer.valueOf(i);
            return this;
        }

        @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0.AbstractC8275a
        /* renamed from: f */
        AbstractC8274j0.AbstractC8275a mo16411f(long j) {
            this.f19861a = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0
    /* renamed from: b */
    public int mo16421b() {
        return this.f19858d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0
    /* renamed from: c */
    public long mo16420c() {
        return this.f19859e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0
    /* renamed from: d */
    public int mo16419d() {
        return this.f19857c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0
    /* renamed from: e */
    public int mo16418e() {
        return this.f19860f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8274j0) {
            AbstractC8274j0 abstractC8274j0 = (AbstractC8274j0) obj;
            return this.f19856b == abstractC8274j0.mo16417f() && this.f19857c == abstractC8274j0.mo16419d() && this.f19858d == abstractC8274j0.mo16421b() && this.f19859e == abstractC8274j0.mo16420c() && this.f19860f == abstractC8274j0.mo16418e();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8274j0
    /* renamed from: f */
    public long mo16417f() {
        return this.f19856b;
    }

    public int hashCode() {
        long j = this.f19856b;
        long j2 = this.f19859e;
        return this.f19860f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f19857c) * 1000003) ^ this.f19858d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f19856b + ", loadBatchSize=" + this.f19857c + ", criticalSectionEnterTimeoutMs=" + this.f19858d + ", eventCleanUpAge=" + this.f19859e + ", maxBlobByteSizePerRow=" + this.f19860f + "}";
    }

    private C8264f0(long j, int i, int i2, long j2, int i3) {
        this.f19856b = j;
        this.f19857c = i;
        this.f19858d = i2;
        this.f19859e = j2;
        this.f19860f = i3;
    }
}
