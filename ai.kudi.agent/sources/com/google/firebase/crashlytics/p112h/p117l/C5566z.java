package com.google.firebase.crashlytics.p112h.p117l;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* renamed from: com.google.firebase.crashlytics.h.l.z */
/* loaded from: classes2.dex */
public final class C5566z extends AbstractC5496c0.AbstractC5499c {

    /* renamed from: a */
    private final String f13736a;

    /* renamed from: b */
    private final String f13737b;

    /* renamed from: c */
    private final boolean f13738c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5566z(String str, String str2, boolean z) {
        if (str != null) {
            this.f13736a = str;
            if (str2 != null) {
                this.f13737b = str2;
                this.f13738c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5499c
    /* renamed from: b */
    public boolean mo24460b() {
        return this.f13738c;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5499c
    /* renamed from: c */
    public String mo24459c() {
        return this.f13737b;
    }

    @Override // com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0.AbstractC5499c
    /* renamed from: d */
    public String mo24458d() {
        return this.f13736a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5496c0.AbstractC5499c) {
            AbstractC5496c0.AbstractC5499c abstractC5499c = (AbstractC5496c0.AbstractC5499c) obj;
            return this.f13736a.equals(abstractC5499c.mo24458d()) && this.f13737b.equals(abstractC5499c.mo24459c()) && this.f13738c == abstractC5499c.mo24460b();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13736a.hashCode() ^ 1000003) * 1000003) ^ this.f13737b.hashCode()) * 1000003) ^ (this.f13738c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f13736a + ", osCodeName=" + this.f13737b + ", isRooted=" + this.f13738c + "}";
    }
}
