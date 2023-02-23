package com.google.android.datatransport.cct.p096f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_LogResponse.java */
/* renamed from: com.google.android.datatransport.cct.f.h */
/* loaded from: classes2.dex */
public final class C2610h extends AbstractC2622n {

    /* renamed from: a */
    private final long f7331a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2610h(long j) {
        this.f7331a = j;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2622n
    /* renamed from: c */
    public long mo32487c() {
        return this.f7331a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC2622n) && this.f7331a == ((AbstractC2622n) obj).mo32487c();
    }

    public int hashCode() {
        long j = this.f7331a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f7331a + "}";
    }
}
