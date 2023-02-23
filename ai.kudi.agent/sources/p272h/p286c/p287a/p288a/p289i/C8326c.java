package p272h.p286c.p287a.p288a.p289i;

import java.util.Map;
import p272h.p286c.p287a.p288a.p289i.AbstractC8342j;
/* compiled from: AutoValue_EventInternal.java */
/* renamed from: h.c.a.a.i.c */
/* loaded from: classes2.dex */
final class C8326c extends AbstractC8342j {

    /* renamed from: a */
    private final String f19951a;

    /* renamed from: b */
    private final Integer f19952b;

    /* renamed from: c */
    private final C8341i f19953c;

    /* renamed from: d */
    private final long f19954d;

    /* renamed from: e */
    private final long f19955e;

    /* renamed from: f */
    private final Map<String, String> f19956f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_EventInternal.java */
    /* renamed from: h.c.a.a.i.c$b */
    /* loaded from: classes2.dex */
    public static final class C8328b extends AbstractC8342j.AbstractC8343a {

        /* renamed from: a */
        private String f19957a;

        /* renamed from: b */
        private Integer f19958b;

        /* renamed from: c */
        private C8341i f19959c;

        /* renamed from: d */
        private Long f19960d;

        /* renamed from: e */
        private Long f19961e;

        /* renamed from: f */
        private Map<String, String> f19962f;

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j.AbstractC8343a
        /* renamed from: d */
        public AbstractC8342j mo16270d() {
            String str = "";
            if (this.f19957a == null) {
                str = " transportName";
            }
            if (this.f19959c == null) {
                str = str + " encodedPayload";
            }
            if (this.f19960d == null) {
                str = str + " eventMillis";
            }
            if (this.f19961e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f19962f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C8326c(this.f19957a, this.f19958b, this.f19959c, this.f19960d.longValue(), this.f19961e.longValue(), this.f19962f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j.AbstractC8343a
        /* renamed from: e */
        protected Map<String, String> mo16269e() {
            Map<String, String> map = this.f19962f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j.AbstractC8343a
        /* renamed from: f */
        public AbstractC8342j.AbstractC8343a mo16268f(Map<String, String> map) {
            if (map != null) {
                this.f19962f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j.AbstractC8343a
        /* renamed from: g */
        public AbstractC8342j.AbstractC8343a mo16267g(Integer num) {
            this.f19958b = num;
            return this;
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j.AbstractC8343a
        /* renamed from: h */
        public AbstractC8342j.AbstractC8343a mo16266h(C8341i c8341i) {
            if (c8341i != null) {
                this.f19959c = c8341i;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j.AbstractC8343a
        /* renamed from: i */
        public AbstractC8342j.AbstractC8343a mo16265i(long j) {
            this.f19960d = Long.valueOf(j);
            return this;
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j.AbstractC8343a
        /* renamed from: j */
        public AbstractC8342j.AbstractC8343a mo16264j(String str) {
            if (str != null) {
                this.f19957a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j.AbstractC8343a
        /* renamed from: k */
        public AbstractC8342j.AbstractC8343a mo16263k(long j) {
            this.f19961e = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j
    /* renamed from: c */
    public Map<String, String> mo16283c() {
        return this.f19956f;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j
    /* renamed from: d */
    public Integer mo16282d() {
        return this.f19952b;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j
    /* renamed from: e */
    public C8341i mo16281e() {
        return this.f19953c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8342j) {
            AbstractC8342j abstractC8342j = (AbstractC8342j) obj;
            return this.f19951a.equals(abstractC8342j.mo16276j()) && ((num = this.f19952b) != null ? num.equals(abstractC8342j.mo16282d()) : abstractC8342j.mo16282d() == null) && this.f19953c.equals(abstractC8342j.mo16281e()) && this.f19954d == abstractC8342j.mo16280f() && this.f19955e == abstractC8342j.mo16275k() && this.f19956f.equals(abstractC8342j.mo16283c());
        }
        return false;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j
    /* renamed from: f */
    public long mo16280f() {
        return this.f19954d;
    }

    public int hashCode() {
        int hashCode = (this.f19951a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f19952b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f19954d;
        long j2 = this.f19955e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f19953c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f19956f.hashCode();
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j
    /* renamed from: j */
    public String mo16276j() {
        return this.f19951a;
    }

    @Override // p272h.p286c.p287a.p288a.p289i.AbstractC8342j
    /* renamed from: k */
    public long mo16275k() {
        return this.f19955e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f19951a + ", code=" + this.f19952b + ", encodedPayload=" + this.f19953c + ", eventMillis=" + this.f19954d + ", uptimeMillis=" + this.f19955e + ", autoMetadata=" + this.f19956f + "}";
    }

    private C8326c(String str, Integer num, C8341i c8341i, long j, long j2, Map<String, String> map) {
        this.f19951a = str;
        this.f19952b = num;
        this.f19953c = c8341i;
        this.f19954d = j;
        this.f19955e = j2;
        this.f19956f = map;
    }
}
