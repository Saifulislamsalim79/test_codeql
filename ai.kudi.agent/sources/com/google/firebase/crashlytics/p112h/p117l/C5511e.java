package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* renamed from: com.google.firebase.crashlytics.h.l.e */
/* loaded from: classes2.dex */
final class C5511e extends AbstractC5448a0.AbstractC5454d {

    /* renamed from: a */
    private final C5492b0<AbstractC5448a0.AbstractC5454d.AbstractC5456b> f13561a;

    /* renamed from: b */
    private final String f13562b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.e$b */
    /* loaded from: classes2.dex */
    public static final class C5513b extends AbstractC5448a0.AbstractC5454d.AbstractC5455a {

        /* renamed from: a */
        private C5492b0<AbstractC5448a0.AbstractC5454d.AbstractC5456b> f13563a;

        /* renamed from: b */
        private String f13564b;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d.AbstractC5455a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5454d mo24652a() {
            String str = "";
            if (this.f13563a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new C5511e(this.f13563a, this.f13564b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d.AbstractC5455a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5454d.AbstractC5455a mo24651b(C5492b0<AbstractC5448a0.AbstractC5454d.AbstractC5456b> c5492b0) {
            if (c5492b0 != null) {
                this.f13563a = c5492b0;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d.AbstractC5455a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5454d.AbstractC5455a mo24650c(String str) {
            this.f13564b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d
    /* renamed from: b */
    public C5492b0<AbstractC5448a0.AbstractC5454d.AbstractC5456b> mo24654b() {
        return this.f13561a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5454d
    /* renamed from: c */
    public String mo24653c() {
        return this.f13562b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5454d) {
            AbstractC5448a0.AbstractC5454d abstractC5454d = (AbstractC5448a0.AbstractC5454d) obj;
            if (this.f13561a.equals(abstractC5454d.mo24654b())) {
                String str = this.f13562b;
                if (str == null) {
                    if (abstractC5454d.mo24653c() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC5454d.mo24653c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f13561a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13562b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f13561a + ", orgId=" + this.f13562b + "}";
    }

    private C5511e(C5492b0<AbstractC5448a0.AbstractC5454d.AbstractC5456b> c5492b0, String str) {
        this.f13561a = c5492b0;
        this.f13562b = str;
    }
}
