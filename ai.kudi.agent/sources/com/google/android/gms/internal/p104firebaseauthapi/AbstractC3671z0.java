package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z0 */
/* loaded from: classes2.dex */
abstract class AbstractC3671z0 extends AbstractC3473ra<String> {

    /* renamed from: e */
    final CharSequence f9136e;

    /* renamed from: f */
    int f9137f = 0;

    /* renamed from: w */
    int f9138w;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3671z0(C3490s1 c3490s1, CharSequence charSequence) {
        C3505sg unused;
        unused = c3490s1.f8932a;
        this.f9138w = Integer.MAX_VALUE;
        this.f9136e = charSequence;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3473ra
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ String mo29915a() {
        int mo29914c;
        int i = this.f9137f;
        while (true) {
            int i2 = this.f9137f;
            if (i2 != -1) {
                int mo29913d = mo29913d(i2);
                if (mo29913d == -1) {
                    mo29913d = this.f9136e.length();
                    this.f9137f = -1;
                    mo29914c = -1;
                } else {
                    mo29914c = mo29914c(mo29913d);
                    this.f9137f = mo29914c;
                }
                if (mo29914c == i) {
                    int i3 = mo29914c + 1;
                    this.f9137f = i3;
                    if (i3 > this.f9136e.length()) {
                        this.f9137f = -1;
                    }
                } else {
                    if (i < mo29913d) {
                        this.f9136e.charAt(i);
                    }
                    if (i < mo29913d) {
                        this.f9136e.charAt(mo29913d - 1);
                    }
                    int i4 = this.f9138w;
                    if (i4 == 1) {
                        mo29913d = this.f9136e.length();
                        this.f9137f = -1;
                        if (mo29913d > i) {
                            this.f9136e.charAt(mo29913d - 1);
                        }
                    } else {
                        this.f9138w = i4 - 1;
                    }
                    return this.f9136e.subSequence(i, mo29913d).toString();
                }
            } else {
                m30381b();
                return null;
            }
        }
    }

    /* renamed from: c */
    abstract int mo29914c(int i);

    /* renamed from: d */
    abstract int mo29913d(int i);
}
