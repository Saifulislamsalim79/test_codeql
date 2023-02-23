package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AbstractC2637g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_BackendResponse.java */
/* renamed from: com.google.android.datatransport.runtime.backends.b */
/* loaded from: classes2.dex */
public final class C2631b extends AbstractC2637g {

    /* renamed from: a */
    private final AbstractC2637g.EnumC2638a f7397a;

    /* renamed from: b */
    private final long f7398b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2631b(AbstractC2637g.EnumC2638a enumC2638a, long j) {
        if (enumC2638a != null) {
            this.f7397a = enumC2638a;
            this.f7398b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2637g
    /* renamed from: b */
    public long mo32469b() {
        return this.f7398b;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2637g
    /* renamed from: c */
    public AbstractC2637g.EnumC2638a mo32468c() {
        return this.f7397a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2637g) {
            AbstractC2637g abstractC2637g = (AbstractC2637g) obj;
            return this.f7397a.equals(abstractC2637g.mo32468c()) && this.f7398b == abstractC2637g.mo32469b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7398b;
        return ((this.f7397a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f7397a + ", nextRequestWaitMillis=" + this.f7398b + "}";
    }
}
