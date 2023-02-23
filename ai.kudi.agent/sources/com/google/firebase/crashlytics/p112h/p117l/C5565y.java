package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* renamed from: com.google.firebase.crashlytics.h.l.y */
/* loaded from: classes2.dex */
public final class C5565y extends AbstractC5496c0.AbstractC5498b {

    /* renamed from: a */
    private final int f13727a;

    /* renamed from: b */
    private final String f13728b;

    /* renamed from: c */
    private final int f13729c;

    /* renamed from: d */
    private final long f13730d;

    /* renamed from: e */
    private final long f13731e;

    /* renamed from: f */
    private final boolean f13732f;

    /* renamed from: g */
    private final int f13733g;

    /* renamed from: h */
    private final String f13734h;

    /* renamed from: i */
    private final String f13735i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5565y(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f13727a = i;
        if (str != null) {
            this.f13728b = str;
            this.f13729c = i2;
            this.f13730d = j;
            this.f13731e = j2;
            this.f13732f = z;
            this.f13733g = i3;
            if (str2 != null) {
                this.f13734h = str2;
                if (str3 != null) {
                    this.f13735i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: a */
    public int mo24469a() {
        return this.f13727a;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: b */
    public int mo24468b() {
        return this.f13729c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: d */
    public long mo24467d() {
        return this.f13731e;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: e */
    public boolean mo24466e() {
        return this.f13732f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5496c0.AbstractC5498b) {
            AbstractC5496c0.AbstractC5498b abstractC5498b = (AbstractC5496c0.AbstractC5498b) obj;
            return this.f13727a == abstractC5498b.mo24469a() && this.f13728b.equals(abstractC5498b.mo24464g()) && this.f13729c == abstractC5498b.mo24468b() && this.f13730d == abstractC5498b.mo24461j() && this.f13731e == abstractC5498b.mo24467d() && this.f13732f == abstractC5498b.mo24466e() && this.f13733g == abstractC5498b.mo24462i() && this.f13734h.equals(abstractC5498b.mo24465f()) && this.f13735i.equals(abstractC5498b.mo24463h());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: f */
    public String mo24465f() {
        return this.f13734h;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: g */
    public String mo24464g() {
        return this.f13728b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: h */
    public String mo24463h() {
        return this.f13735i;
    }

    public int hashCode() {
        long j = this.f13730d;
        long j2 = this.f13731e;
        return ((((((((((((((((this.f13727a ^ 1000003) * 1000003) ^ this.f13728b.hashCode()) * 1000003) ^ this.f13729c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f13732f ? 1231 : 1237)) * 1000003) ^ this.f13733g) * 1000003) ^ this.f13734h.hashCode()) * 1000003) ^ this.f13735i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: i */
    public int mo24462i() {
        return this.f13733g;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5498b
    /* renamed from: j */
    public long mo24461j() {
        return this.f13730d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f13727a + ", model=" + this.f13728b + ", availableProcessors=" + this.f13729c + ", totalRam=" + this.f13730d + ", diskSpace=" + this.f13731e + ", isEmulator=" + this.f13732f + ", state=" + this.f13733g + ", manufacturer=" + this.f13734h + ", modelClass=" + this.f13735i + "}";
    }
}
