package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* renamed from: com.google.firebase.crashlytics.h.l.m */
/* loaded from: classes2.dex */
final class C5533m extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b {

    /* renamed from: a */
    private final C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> f13644a;

    /* renamed from: b */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c f13645b;

    /* renamed from: c */
    private final AbstractC5448a0.AbstractC5449a f13646c;

    /* renamed from: d */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d f13647d;

    /* renamed from: e */
    private final C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a> f13648e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.m$b */
    /* loaded from: classes2.dex */
    public static final class C5535b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b {

        /* renamed from: a */
        private C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> f13649a;

        /* renamed from: b */
        private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c f13650b;

        /* renamed from: c */
        private AbstractC5448a0.AbstractC5449a f13651c;

        /* renamed from: d */
        private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d f13652d;

        /* renamed from: e */
        private C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a> f13653e;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b mo24557a() {
            String str = "";
            if (this.f13652d == null) {
                str = " signal";
            }
            if (this.f13653e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C5533m(this.f13649a, this.f13650b, this.f13651c, this.f13652d, this.f13653e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b mo24556b(AbstractC5448a0.AbstractC5449a abstractC5449a) {
            this.f13651c = abstractC5449a;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b mo24555c(C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a> c5492b0) {
            if (c5492b0 != null) {
                this.f13653e = c5492b0;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b mo24554d(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c) {
            this.f13650b = abstractC5472c;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b mo24553e(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d abstractC5474d) {
            if (abstractC5474d != null) {
                this.f13652d = abstractC5474d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5471b mo24552f(C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> c5492b0) {
            this.f13649a = c5492b0;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b
    /* renamed from: b */
    public AbstractC5448a0.AbstractC5449a mo24562b() {
        return this.f13646c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b
    /* renamed from: c */
    public C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a> mo24561c() {
        return this.f13648e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b
    /* renamed from: d */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c mo24560d() {
        return this.f13645b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b
    /* renamed from: e */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d mo24559e() {
        return this.f13647d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b abstractC5468b = (AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b) obj;
            C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> c5492b0 = this.f13644a;
            if (c5492b0 != null ? c5492b0.equals(abstractC5468b.mo24558f()) : abstractC5468b.mo24558f() == null) {
                AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c = this.f13645b;
                if (abstractC5472c != null ? abstractC5472c.equals(abstractC5468b.mo24560d()) : abstractC5468b.mo24560d() == null) {
                    AbstractC5448a0.AbstractC5449a abstractC5449a = this.f13646c;
                    if (abstractC5449a != null ? abstractC5449a.equals(abstractC5468b.mo24562b()) : abstractC5468b.mo24562b() == null) {
                        if (this.f13647d.equals(abstractC5468b.mo24559e()) && this.f13648e.equals(abstractC5468b.mo24561c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b
    /* renamed from: f */
    public C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> mo24558f() {
        return this.f13644a;
    }

    public int hashCode() {
        C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> c5492b0 = this.f13644a;
        int hashCode = ((c5492b0 == null ? 0 : c5492b0.hashCode()) ^ 1000003) * 1000003;
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c = this.f13645b;
        int hashCode2 = (hashCode ^ (abstractC5472c == null ? 0 : abstractC5472c.hashCode())) * 1000003;
        AbstractC5448a0.AbstractC5449a abstractC5449a = this.f13646c;
        return ((((hashCode2 ^ (abstractC5449a != null ? abstractC5449a.hashCode() : 0)) * 1000003) ^ this.f13647d.hashCode()) * 1000003) ^ this.f13648e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f13644a + ", exception=" + this.f13645b + ", appExitInfo=" + this.f13646c + ", signal=" + this.f13647d + ", binaries=" + this.f13648e + "}";
    }

    private C5533m(C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e> c5492b0, AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c, AbstractC5448a0.AbstractC5449a abstractC5449a, AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5474d abstractC5474d, C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5469a> c5492b02) {
        this.f13644a = c5492b0;
        this.f13645b = abstractC5472c;
        this.f13646c = abstractC5449a;
        this.f13647d = abstractC5474d;
        this.f13648e = c5492b02;
    }
}
