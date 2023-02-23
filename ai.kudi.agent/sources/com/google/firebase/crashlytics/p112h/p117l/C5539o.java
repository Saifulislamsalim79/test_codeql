package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* renamed from: com.google.firebase.crashlytics.h.l.o */
/* loaded from: classes2.dex */
final class C5539o extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c {

    /* renamed from: a */
    private final String f13662a;

    /* renamed from: b */
    private final String f13663b;

    /* renamed from: c */
    private final C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> f13664c;

    /* renamed from: d */
    private final AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c f13665d;

    /* renamed from: e */
    private final int f13666e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.o$b */
    /* loaded from: classes2.dex */
    public static final class C5541b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a {

        /* renamed from: a */
        private String f13667a;

        /* renamed from: b */
        private String f13668b;

        /* renamed from: c */
        private C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> f13669c;

        /* renamed from: d */
        private AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c f13670d;

        /* renamed from: e */
        private Integer f13671e;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c mo24537a() {
            String str = "";
            if (this.f13667a == null) {
                str = " type";
            }
            if (this.f13669c == null) {
                str = str + " frames";
            }
            if (this.f13671e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C5539o(this.f13667a, this.f13668b, this.f13669c, this.f13670d, this.f13671e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a mo24536b(AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c) {
            this.f13670d = abstractC5472c;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a mo24535c(C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> c5492b0) {
            if (c5492b0 != null) {
                this.f13669c = c5492b0;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a mo24534d(int i) {
            this.f13671e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a
        /* renamed from: e */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a mo24533e(String str) {
            this.f13668b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a
        /* renamed from: f */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c.AbstractC5473a mo24532f(String str) {
            if (str != null) {
                this.f13667a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c
    /* renamed from: b */
    public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c mo24542b() {
        return this.f13665d;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c
    /* renamed from: c */
    public C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> mo24541c() {
        return this.f13664c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c
    /* renamed from: d */
    public int mo24540d() {
        return this.f13666e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c
    /* renamed from: e */
    public String mo24539e() {
        return this.f13663b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c2 = (AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c) obj;
            return this.f13662a.equals(abstractC5472c2.mo24538f()) && ((str = this.f13663b) != null ? str.equals(abstractC5472c2.mo24539e()) : abstractC5472c2.mo24539e() == null) && this.f13664c.equals(abstractC5472c2.mo24541c()) && ((abstractC5472c = this.f13665d) != null ? abstractC5472c.equals(abstractC5472c2.mo24542b()) : abstractC5472c2.mo24542b() == null) && this.f13666e == abstractC5472c2.mo24540d();
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c
    /* renamed from: f */
    public String mo24538f() {
        return this.f13662a;
    }

    public int hashCode() {
        int hashCode = (this.f13662a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13663b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f13664c.hashCode()) * 1000003;
        AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c = this.f13665d;
        return ((hashCode2 ^ (abstractC5472c != null ? abstractC5472c.hashCode() : 0)) * 1000003) ^ this.f13666e;
    }

    public String toString() {
        return "Exception{type=" + this.f13662a + ", reason=" + this.f13663b + ", frames=" + this.f13664c + ", causedBy=" + this.f13665d + ", overflowCount=" + this.f13666e + "}";
    }

    private C5539o(String str, String str2, C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> c5492b0, AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5472c abstractC5472c, int i) {
        this.f13662a = str;
        this.f13663b = str2;
        this.f13664c = c5492b0;
        this.f13665d = abstractC5472c;
        this.f13666e = i;
    }
}
