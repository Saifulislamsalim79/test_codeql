package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* renamed from: com.google.firebase.crashlytics.h.l.x */
/* loaded from: classes2.dex */
public final class C5564x extends AbstractC5496c0.AbstractC5497a {

    /* renamed from: a */
    private final String f13721a;

    /* renamed from: b */
    private final String f13722b;

    /* renamed from: c */
    private final String f13723c;

    /* renamed from: d */
    private final String f13724d;

    /* renamed from: e */
    private final int f13725e;

    /* renamed from: f */
    private final String f13726f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5564x(String str, String str2, String str3, String str4, int i, String str5) {
        if (str != null) {
            this.f13721a = str;
            if (str2 != null) {
                this.f13722b = str2;
                if (str3 != null) {
                    this.f13723c = str3;
                    if (str4 != null) {
                        this.f13724d = str4;
                        this.f13725e = i;
                        this.f13726f = str5;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5497a
    /* renamed from: a */
    public String mo24475a() {
        return this.f13721a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5497a
    /* renamed from: c */
    public int mo24474c() {
        return this.f13725e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5497a
    /* renamed from: d */
    public String mo24473d() {
        return this.f13724d;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5497a
    /* renamed from: e */
    public String mo24472e() {
        return this.f13726f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5496c0.AbstractC5497a) {
            AbstractC5496c0.AbstractC5497a abstractC5497a = (AbstractC5496c0.AbstractC5497a) obj;
            if (this.f13721a.equals(abstractC5497a.mo24475a()) && this.f13722b.equals(abstractC5497a.mo24471f()) && this.f13723c.equals(abstractC5497a.mo24470g()) && this.f13724d.equals(abstractC5497a.mo24473d()) && this.f13725e == abstractC5497a.mo24474c()) {
                String str = this.f13726f;
                if (str == null) {
                    if (abstractC5497a.mo24472e() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC5497a.mo24472e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5497a
    /* renamed from: f */
    public String mo24471f() {
        return this.f13722b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5497a
    /* renamed from: g */
    public String mo24470g() {
        return this.f13723c;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f13721a.hashCode() ^ 1000003) * 1000003) ^ this.f13722b.hashCode()) * 1000003) ^ this.f13723c.hashCode()) * 1000003) ^ this.f13724d.hashCode()) * 1000003) ^ this.f13725e) * 1000003;
        String str = this.f13726f;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f13721a + ", versionCode=" + this.f13722b + ", versionName=" + this.f13723c + ", installUuid=" + this.f13724d + ", deliveryMechanism=" + this.f13725e + ", unityVersion=" + this.f13726f + "}";
    }
}
