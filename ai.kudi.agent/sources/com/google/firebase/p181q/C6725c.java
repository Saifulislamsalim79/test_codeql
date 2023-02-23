package com.google.firebase.p181q;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_LibraryVersion.java */
/* renamed from: com.google.firebase.q.c */
/* loaded from: classes2.dex */
public final class C6725c extends AbstractC6729g {

    /* renamed from: a */
    private final String f16183a;

    /* renamed from: b */
    private final String f16184b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6725c(String str, String str2) {
        if (str != null) {
            this.f16183a = str;
            if (str2 != null) {
                this.f16184b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // com.google.firebase.p181q.AbstractC6729g
    /* renamed from: b */
    public String mo20937b() {
        return this.f16183a;
    }

    @Override // com.google.firebase.p181q.AbstractC6729g
    /* renamed from: c */
    public String mo20936c() {
        return this.f16184b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6729g) {
            AbstractC6729g abstractC6729g = (AbstractC6729g) obj;
            return this.f16183a.equals(abstractC6729g.mo20937b()) && this.f16184b.equals(abstractC6729g.mo20936c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16183a.hashCode() ^ 1000003) * 1000003) ^ this.f16184b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f16183a + ", version=" + this.f16184b + "}";
    }
}
