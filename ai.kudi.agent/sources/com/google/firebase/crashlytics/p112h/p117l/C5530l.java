package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* renamed from: com.google.firebase.crashlytics.h.l.l */
/* loaded from: classes2.dex */
final class C5530l extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a {

    /* renamed from: a */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b f13634a;

    /* renamed from: b */
    private final C5492b0<AbstractC5448a0.AbstractC5452c> f13635b;

    /* renamed from: c */
    private final C5492b0<AbstractC5448a0.AbstractC5452c> f13636c;

    /* renamed from: d */
    private final Boolean f13637d;

    /* renamed from: e */
    private final int f13638e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.l$b */
    /* loaded from: classes2.dex */
    public static final class C5532b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a {

        /* renamed from: a */
        private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b f13639a;

        /* renamed from: b */
        private C5492b0<AbstractC5448a0.AbstractC5452c> f13640b;

        /* renamed from: c */
        private C5492b0<AbstractC5448a0.AbstractC5452c> f13641c;

        /* renamed from: d */
        private Boolean f13642d;

        /* renamed from: e */
        private Integer f13643e;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a mo24568a() {
            String str = "";
            if (this.f13639a == null) {
                str = " execution";
            }
            if (this.f13643e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C5530l(this.f13639a, this.f13640b, this.f13641c, this.f13642d, this.f13643e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a mo24567b(Boolean bool) {
            this.f13642d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a mo24566c(C5492b0<AbstractC5448a0.AbstractC5452c> c5492b0) {
            this.f13640b = c5492b0;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a mo24565d(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b abstractC5468b) {
            if (abstractC5468b != null) {
                this.f13639a = abstractC5468b;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a mo24564e(C5492b0<AbstractC5448a0.AbstractC5452c> c5492b0) {
            this.f13641c = c5492b0;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a mo24563f(int i) {
            this.f13643e = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5532b() {
        }

        private C5532b(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a abstractC5466a) {
            this.f13639a = abstractC5466a.mo24572d();
            this.f13640b = abstractC5466a.mo24573c();
            this.f13641c = abstractC5466a.mo24571e();
            this.f13642d = abstractC5466a.mo24574b();
            this.f13643e = Integer.valueOf(abstractC5466a.mo24570f());
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a
    /* renamed from: b */
    public Boolean mo24574b() {
        return this.f13637d;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a
    /* renamed from: c */
    public C5492b0<AbstractC5448a0.AbstractC5452c> mo24573c() {
        return this.f13635b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a
    /* renamed from: d */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b mo24572d() {
        return this.f13634a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a
    /* renamed from: e */
    public C5492b0<AbstractC5448a0.AbstractC5452c> mo24571e() {
        return this.f13636c;
    }

    public boolean equals(Object obj) {
        C5492b0<AbstractC5448a0.AbstractC5452c> c5492b0;
        C5492b0<AbstractC5448a0.AbstractC5452c> c5492b02;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a abstractC5466a = (AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a) obj;
            return this.f13634a.equals(abstractC5466a.mo24572d()) && ((c5492b0 = this.f13635b) != null ? c5492b0.equals(abstractC5466a.mo24573c()) : abstractC5466a.mo24573c() == null) && ((c5492b02 = this.f13636c) != null ? c5492b02.equals(abstractC5466a.mo24571e()) : abstractC5466a.mo24571e() == null) && ((bool = this.f13637d) != null ? bool.equals(abstractC5466a.mo24574b()) : abstractC5466a.mo24574b() == null) && this.f13638e == abstractC5466a.mo24570f();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a
    /* renamed from: f */
    public int mo24570f() {
        return this.f13638e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a
    /* renamed from: g */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5467a mo24569g() {
        return new C5532b(this);
    }

    public int hashCode() {
        int hashCode = (this.f13634a.hashCode() ^ 1000003) * 1000003;
        C5492b0<AbstractC5448a0.AbstractC5452c> c5492b0 = this.f13635b;
        int hashCode2 = (hashCode ^ (c5492b0 == null ? 0 : c5492b0.hashCode())) * 1000003;
        C5492b0<AbstractC5448a0.AbstractC5452c> c5492b02 = this.f13636c;
        int hashCode3 = (hashCode2 ^ (c5492b02 == null ? 0 : c5492b02.hashCode())) * 1000003;
        Boolean bool = this.f13637d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f13638e;
    }

    public String toString() {
        return "Application{execution=" + this.f13634a + ", customAttributes=" + this.f13635b + ", internalKeys=" + this.f13636c + ", background=" + this.f13637d + ", uiOrientation=" + this.f13638e + "}";
    }

    private C5530l(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b abstractC5468b, C5492b0<AbstractC5448a0.AbstractC5452c> c5492b0, C5492b0<AbstractC5448a0.AbstractC5452c> c5492b02, Boolean bool, int i) {
        this.f13634a = abstractC5468b;
        this.f13635b = c5492b0;
        this.f13636c = c5492b02;
        this.f13637d = bool;
        this.f13638e = i;
    }
}
