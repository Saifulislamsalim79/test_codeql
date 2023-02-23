package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* renamed from: com.google.firebase.crashlytics.h.l.g */
/* loaded from: classes2.dex */
final class C5517g extends AbstractC5448a0.AbstractC5458e {

    /* renamed from: a */
    private final String f13569a;

    /* renamed from: b */
    private final String f13570b;

    /* renamed from: c */
    private final long f13571c;

    /* renamed from: d */
    private final Long f13572d;

    /* renamed from: e */
    private final boolean f13573e;

    /* renamed from: f */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5459a f13574f;

    /* renamed from: g */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5487f f13575g;

    /* renamed from: h */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5485e f13576h;

    /* renamed from: i */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5463c f13577i;

    /* renamed from: j */
    private final C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d> f13578j;

    /* renamed from: k */
    private final int f13579k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.g$b */
    /* loaded from: classes2.dex */
    public static final class C5519b extends AbstractC5448a0.AbstractC5458e.AbstractC5462b {

        /* renamed from: a */
        private String f13580a;

        /* renamed from: b */
        private String f13581b;

        /* renamed from: c */
        private Long f13582c;

        /* renamed from: d */
        private Long f13583d;

        /* renamed from: e */
        private Boolean f13584e;

        /* renamed from: f */
        private AbstractC5448a0.AbstractC5458e.AbstractC5459a f13585f;

        /* renamed from: g */
        private AbstractC5448a0.AbstractC5458e.AbstractC5487f f13586g;

        /* renamed from: h */
        private AbstractC5448a0.AbstractC5458e.AbstractC5485e f13587h;

        /* renamed from: i */
        private AbstractC5448a0.AbstractC5458e.AbstractC5463c f13588i;

        /* renamed from: j */
        private C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d> f13589j;

        /* renamed from: k */
        private Integer f13590k;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e mo24632a() {
            String str = "";
            if (this.f13580a == null) {
                str = " generator";
            }
            if (this.f13581b == null) {
                str = str + " identifier";
            }
            if (this.f13582c == null) {
                str = str + " startedAt";
            }
            if (this.f13584e == null) {
                str = str + " crashed";
            }
            if (this.f13585f == null) {
                str = str + " app";
            }
            if (this.f13590k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C5517g(this.f13580a, this.f13581b, this.f13582c.longValue(), this.f13583d, this.f13584e.booleanValue(), this.f13585f, this.f13586g, this.f13587h, this.f13588i, this.f13589j, this.f13590k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24631b(AbstractC5448a0.AbstractC5458e.AbstractC5459a abstractC5459a) {
            if (abstractC5459a != null) {
                this.f13585f = abstractC5459a;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24630c(boolean z) {
            this.f13584e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24629d(AbstractC5448a0.AbstractC5458e.AbstractC5463c abstractC5463c) {
            this.f13588i = abstractC5463c;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24628e(Long l) {
            this.f13583d = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24627f(C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d> c5492b0) {
            this.f13589j = c5492b0;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: g */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24626g(String str) {
            if (str != null) {
                this.f13580a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: h */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24625h(int i) {
            this.f13590k = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: i */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24624i(String str) {
            if (str != null) {
                this.f13581b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: k */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24623k(AbstractC5448a0.AbstractC5458e.AbstractC5485e abstractC5485e) {
            this.f13587h = abstractC5485e;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: l */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24622l(long j) {
            this.f13582c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5462b
        /* renamed from: m */
        public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24621m(AbstractC5448a0.AbstractC5458e.AbstractC5487f abstractC5487f) {
            this.f13586g = abstractC5487f;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5519b() {
        }

        private C5519b(AbstractC5448a0.AbstractC5458e abstractC5458e) {
            this.f13580a = abstractC5458e.mo24640f();
            this.f13581b = abstractC5458e.mo24638h();
            this.f13582c = Long.valueOf(abstractC5458e.mo24636k());
            this.f13583d = abstractC5458e.mo24642d();
            this.f13584e = Boolean.valueOf(abstractC5458e.mo24634m());
            this.f13585f = abstractC5458e.mo24644b();
            this.f13586g = abstractC5458e.mo24635l();
            this.f13587h = abstractC5458e.mo24637j();
            this.f13588i = abstractC5458e.mo24643c();
            this.f13589j = abstractC5458e.mo24641e();
            this.f13590k = Integer.valueOf(abstractC5458e.mo24639g());
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: b */
    public AbstractC5448a0.AbstractC5458e.AbstractC5459a mo24644b() {
        return this.f13574f;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: c */
    public AbstractC5448a0.AbstractC5458e.AbstractC5463c mo24643c() {
        return this.f13577i;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: d */
    public Long mo24642d() {
        return this.f13572d;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: e */
    public C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d> mo24641e() {
        return this.f13578j;
    }

    public boolean equals(Object obj) {
        Long l;
        AbstractC5448a0.AbstractC5458e.AbstractC5487f abstractC5487f;
        AbstractC5448a0.AbstractC5458e.AbstractC5485e abstractC5485e;
        AbstractC5448a0.AbstractC5458e.AbstractC5463c abstractC5463c;
        C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d> c5492b0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e) {
            AbstractC5448a0.AbstractC5458e abstractC5458e = (AbstractC5448a0.AbstractC5458e) obj;
            return this.f13569a.equals(abstractC5458e.mo24640f()) && this.f13570b.equals(abstractC5458e.mo24638h()) && this.f13571c == abstractC5458e.mo24636k() && ((l = this.f13572d) != null ? l.equals(abstractC5458e.mo24642d()) : abstractC5458e.mo24642d() == null) && this.f13573e == abstractC5458e.mo24634m() && this.f13574f.equals(abstractC5458e.mo24644b()) && ((abstractC5487f = this.f13575g) != null ? abstractC5487f.equals(abstractC5458e.mo24635l()) : abstractC5458e.mo24635l() == null) && ((abstractC5485e = this.f13576h) != null ? abstractC5485e.equals(abstractC5458e.mo24637j()) : abstractC5458e.mo24637j() == null) && ((abstractC5463c = this.f13577i) != null ? abstractC5463c.equals(abstractC5458e.mo24643c()) : abstractC5458e.mo24643c() == null) && ((c5492b0 = this.f13578j) != null ? c5492b0.equals(abstractC5458e.mo24641e()) : abstractC5458e.mo24641e() == null) && this.f13579k == abstractC5458e.mo24639g();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: f */
    public String mo24640f() {
        return this.f13569a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: g */
    public int mo24639g() {
        return this.f13579k;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: h */
    public String mo24638h() {
        return this.f13570b;
    }

    public int hashCode() {
        long j = this.f13571c;
        int hashCode = (((((this.f13569a.hashCode() ^ 1000003) * 1000003) ^ this.f13570b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f13572d;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f13573e ? 1231 : 1237)) * 1000003) ^ this.f13574f.hashCode()) * 1000003;
        AbstractC5448a0.AbstractC5458e.AbstractC5487f abstractC5487f = this.f13575g;
        int hashCode3 = (hashCode2 ^ (abstractC5487f == null ? 0 : abstractC5487f.hashCode())) * 1000003;
        AbstractC5448a0.AbstractC5458e.AbstractC5485e abstractC5485e = this.f13576h;
        int hashCode4 = (hashCode3 ^ (abstractC5485e == null ? 0 : abstractC5485e.hashCode())) * 1000003;
        AbstractC5448a0.AbstractC5458e.AbstractC5463c abstractC5463c = this.f13577i;
        int hashCode5 = (hashCode4 ^ (abstractC5463c == null ? 0 : abstractC5463c.hashCode())) * 1000003;
        C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d> c5492b0 = this.f13578j;
        return ((hashCode5 ^ (c5492b0 != null ? c5492b0.hashCode() : 0)) * 1000003) ^ this.f13579k;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: j */
    public AbstractC5448a0.AbstractC5458e.AbstractC5485e mo24637j() {
        return this.f13576h;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: k */
    public long mo24636k() {
        return this.f13571c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: l */
    public AbstractC5448a0.AbstractC5458e.AbstractC5487f mo24635l() {
        return this.f13575g;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: m */
    public boolean mo24634m() {
        return this.f13573e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e
    /* renamed from: n */
    public AbstractC5448a0.AbstractC5458e.AbstractC5462b mo24633n() {
        return new C5519b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f13569a + ", identifier=" + this.f13570b + ", startedAt=" + this.f13571c + ", endedAt=" + this.f13572d + ", crashed=" + this.f13573e + ", app=" + this.f13574f + ", user=" + this.f13575g + ", os=" + this.f13576h + ", device=" + this.f13577i + ", events=" + this.f13578j + ", generatorType=" + this.f13579k + "}";
    }

    private C5517g(String str, String str2, long j, Long l, boolean z, AbstractC5448a0.AbstractC5458e.AbstractC5459a abstractC5459a, AbstractC5448a0.AbstractC5458e.AbstractC5487f abstractC5487f, AbstractC5448a0.AbstractC5458e.AbstractC5485e abstractC5485e, AbstractC5448a0.AbstractC5458e.AbstractC5463c abstractC5463c, C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d> c5492b0, int i) {
        this.f13569a = str;
        this.f13570b = str2;
        this.f13571c = j;
        this.f13572d = l;
        this.f13573e = z;
        this.f13574f = abstractC5459a;
        this.f13575g = abstractC5487f;
        this.f13576h = abstractC5485e;
        this.f13577i = abstractC5463c;
        this.f13578j = c5492b0;
        this.f13579k = i;
    }
}
