package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* renamed from: com.google.firebase.crashlytics.h.l.k */
/* loaded from: classes2.dex */
final class C5527k extends AbstractC5448a0.AbstractC5458e.AbstractC5465d {

    /* renamed from: a */
    private final long f13624a;

    /* renamed from: b */
    private final String f13625b;

    /* renamed from: c */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a f13626c;

    /* renamed from: d */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c f13627d;

    /* renamed from: e */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d f13628e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.k$b */
    /* loaded from: classes2.dex */
    public static final class C5529b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b {

        /* renamed from: a */
        private Long f13629a;

        /* renamed from: b */
        private String f13630b;

        /* renamed from: c */
        private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a f13631c;

        /* renamed from: d */
        private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c f13632d;

        /* renamed from: e */
        private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d f13633e;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d mo24580a() {
            String str = "";
            if (this.f13629a == null) {
                str = " timestamp";
            }
            if (this.f13630b == null) {
                str = str + " type";
            }
            if (this.f13631c == null) {
                str = str + " app";
            }
            if (this.f13632d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C5527k(this.f13629a.longValue(), this.f13630b, this.f13631c, this.f13632d, this.f13633e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b mo24579b(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a abstractC5466a) {
            if (abstractC5466a != null) {
                this.f13631c = abstractC5466a;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b mo24578c(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c abstractC5481c) {
            if (abstractC5481c != null) {
                this.f13632d = abstractC5481c;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b mo24577d(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d abstractC5483d) {
            this.f13633e = abstractC5483d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b mo24576e(long j) {
            this.f13629a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b mo24575f(String str) {
            if (str != null) {
                this.f13630b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5529b() {
        }

        private C5529b(AbstractC5448a0.AbstractC5458e.AbstractC5465d abstractC5465d) {
            this.f13629a = Long.valueOf(abstractC5465d.mo24583e());
            this.f13630b = abstractC5465d.mo24582f();
            this.f13631c = abstractC5465d.mo24586b();
            this.f13632d = abstractC5465d.mo24585c();
            this.f13633e = abstractC5465d.mo24584d();
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d
    /* renamed from: b */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a mo24586b() {
        return this.f13626c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d
    /* renamed from: c */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c mo24585c() {
        return this.f13627d;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d
    /* renamed from: d */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d mo24584d() {
        return this.f13628e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d
    /* renamed from: e */
    public long mo24583e() {
        return this.f13624a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d abstractC5465d = (AbstractC5448a0.AbstractC5458e.AbstractC5465d) obj;
            if (this.f13624a == abstractC5465d.mo24583e() && this.f13625b.equals(abstractC5465d.mo24582f()) && this.f13626c.equals(abstractC5465d.mo24586b()) && this.f13627d.equals(abstractC5465d.mo24585c())) {
                AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d abstractC5483d = this.f13628e;
                if (abstractC5483d == null) {
                    if (abstractC5465d.mo24584d() == null) {
                        return true;
                    }
                } else if (abstractC5483d.equals(abstractC5465d.mo24584d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d
    /* renamed from: f */
    public String mo24582f() {
        return this.f13625b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d
    /* renamed from: g */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5480b mo24581g() {
        return new C5529b(this);
    }

    public int hashCode() {
        long j = this.f13624a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13625b.hashCode()) * 1000003) ^ this.f13626c.hashCode()) * 1000003) ^ this.f13627d.hashCode()) * 1000003;
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d abstractC5483d = this.f13628e;
        return (abstractC5483d == null ? 0 : abstractC5483d.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.f13624a + ", type=" + this.f13625b + ", app=" + this.f13626c + ", device=" + this.f13627d + ", log=" + this.f13628e + "}";
    }

    private C5527k(long j, String str, AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a abstractC5466a, AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5481c abstractC5481c, AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5483d abstractC5483d) {
        this.f13624a = j;
        this.f13625b = str;
        this.f13626c = abstractC5466a;
        this.f13627d = abstractC5481c;
        this.f13628e = abstractC5483d;
    }
}
