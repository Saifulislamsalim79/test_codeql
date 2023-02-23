package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0;
/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* renamed from: com.google.firebase.crashlytics.h.l.d */
/* loaded from: classes2.dex */
final class C5500d extends AbstractC5448a0.AbstractC5452c {

    /* renamed from: a */
    private final String f13550a;

    /* renamed from: b */
    private final String f13551b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    /* renamed from: com.google.firebase.crashlytics.h.l.d$b */
    /* loaded from: classes2.dex */
    public static final class C5502b extends AbstractC5448a0.AbstractC5452c.AbstractC5453a {

        /* renamed from: a */
        private String f13552a;

        /* renamed from: b */
        private String f13553b;

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5452c.AbstractC5453a
        /* renamed from: a */
        public AbstractC5448a0.AbstractC5452c mo24689a() {
            String str = "";
            if (this.f13552a == null) {
                str = " key";
            }
            if (this.f13553b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C5500d(this.f13552a, this.f13553b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5452c.AbstractC5453a
        /* renamed from: b */
        public AbstractC5448a0.AbstractC5452c.AbstractC5453a mo24688b(String str) {
            if (str != null) {
                this.f13552a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5452c.AbstractC5453a
        /* renamed from: c */
        public AbstractC5448a0.AbstractC5452c.AbstractC5453a mo24687c(String str) {
            if (str != null) {
                this.f13553b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5452c
    /* renamed from: b */
    public String mo24691b() {
        return this.f13550a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5448a0.AbstractC5452c
    /* renamed from: c */
    public String mo24690c() {
        return this.f13551b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5448a0.AbstractC5452c) {
            AbstractC5448a0.AbstractC5452c abstractC5452c = (AbstractC5448a0.AbstractC5452c) obj;
            return this.f13550a.equals(abstractC5452c.mo24691b()) && this.f13551b.equals(abstractC5452c.mo24690c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13550a.hashCode() ^ 1000003) * 1000003) ^ this.f13551b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f13550a + ", value=" + this.f13551b + "}";
    }

    private C5500d(String str, String str2) {
        this.f13550a = str;
        this.f13551b = str2;
    }
}
