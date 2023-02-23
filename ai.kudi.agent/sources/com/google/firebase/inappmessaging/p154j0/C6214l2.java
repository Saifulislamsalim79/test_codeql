package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.installations.AbstractC6435k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_InstallationIdResult.java */
/* renamed from: com.google.firebase.inappmessaging.j0.l2 */
/* loaded from: classes2.dex */
public final class C6214l2 extends AbstractC6158b3 {

    /* renamed from: a */
    private final String f15093a;

    /* renamed from: b */
    private final AbstractC6435k f15094b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6214l2(String str, AbstractC6435k abstractC6435k) {
        if (str != null) {
            this.f15093a = str;
            if (abstractC6435k != null) {
                this.f15094b = abstractC6435k;
                return;
            }
            throw new NullPointerException("Null installationTokenResult");
        }
        throw new NullPointerException("Null installationId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.inappmessaging.p154j0.AbstractC6158b3
    /* renamed from: b */
    public String mo22553b() {
        return this.f15093a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.inappmessaging.p154j0.AbstractC6158b3
    /* renamed from: c */
    public AbstractC6435k mo22552c() {
        return this.f15094b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6158b3) {
            AbstractC6158b3 abstractC6158b3 = (AbstractC6158b3) obj;
            return this.f15093a.equals(abstractC6158b3.mo22553b()) && this.f15094b.equals(abstractC6158b3.mo22552c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f15093a.hashCode() ^ 1000003) * 1000003) ^ this.f15094b.hashCode();
    }

    public String toString() {
        return "InstallationIdResult{installationId=" + this.f15093a + ", installationTokenResult=" + this.f15094b + "}";
    }
}
