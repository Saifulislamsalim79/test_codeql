package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* renamed from: com.google.firebase.crashlytics.h.l.q */
/* loaded from: classes2.dex */
final class C5545q extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e {

    /* renamed from: a */
    private final String f13678a;

    /* renamed from: b */
    private final int f13679b;

    /* renamed from: c */
    private final C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> f13680c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.q$b */
    /* loaded from: classes2.dex */
    public static final class C5547b extends AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a {

        /* renamed from: a */
        private String f13681a;

        /* renamed from: b */
        private Integer f13682b;

        /* renamed from: c */
        private C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> f13683c;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e mo24521a() {
            String str = "";
            if (this.f13681a == null) {
                str = " name";
            }
            if (this.f13682b == null) {
                str = str + " importance";
            }
            if (this.f13683c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C5545q(this.f13681a, this.f13682b.intValue(), this.f13683c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a mo24520b(C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> c5492b0) {
            if (c5492b0 != null) {
                this.f13683c = c5492b0;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a mo24519c(int i) {
            this.f13682b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a
        /* renamed from: d */
        public AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5477a mo24518d(String str) {
            if (str != null) {
                this.f13681a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e
    /* renamed from: b */
    public C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> mo24524b() {
        return this.f13680c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e
    /* renamed from: c */
    public int mo24523c() {
        return this.f13679b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e
    /* renamed from: d */
    public String mo24522d() {
        return this.f13678a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e) {
            AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e abstractC5476e = (AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e) obj;
            return this.f13678a.equals(abstractC5476e.mo24522d()) && this.f13679b == abstractC5476e.mo24523c() && this.f13680c.equals(abstractC5476e.mo24524b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13678a.hashCode() ^ 1000003) * 1000003) ^ this.f13679b) * 1000003) ^ this.f13680c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f13678a + ", importance=" + this.f13679b + ", frames=" + this.f13680c + "}";
    }

    private C5545q(String str, int i, C5492b0<AbstractC5448a0.AbstractC5458e.AbstractC5465d.AbstractC5466a.AbstractC5468b.AbstractC5476e.AbstractC5478b> c5492b0) {
        this.f13678a = str;
        this.f13679b = i;
        this.f13680c = c5492b0;
    }
}
