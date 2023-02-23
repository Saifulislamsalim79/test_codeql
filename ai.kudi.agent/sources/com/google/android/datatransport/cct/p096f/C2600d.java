package com.google.android.datatransport.cct.p096f;

import java.util.List;
/* compiled from: AutoValue_BatchedLogRequest.java */
/* renamed from: com.google.android.datatransport.cct.f.d */
/* loaded from: classes2.dex */
final class C2600d extends AbstractC2614j {

    /* renamed from: a */
    private final List<AbstractC2620m> f7298a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2600d(List<AbstractC2620m> list) {
        if (list != null) {
            this.f7298a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2614j
    /* renamed from: c */
    public List<AbstractC2620m> mo32532c() {
        return this.f7298a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2614j) {
            return this.f7298a.equals(((AbstractC2614j) obj).mo32532c());
        }
        return false;
    }

    public int hashCode() {
        return this.f7298a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f7298a + "}";
    }
}
