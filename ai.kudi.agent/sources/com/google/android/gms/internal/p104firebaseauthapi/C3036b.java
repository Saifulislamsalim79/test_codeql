package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b */
/* loaded from: classes2.dex */
final class C3036b extends AbstractC3671z0 {

    /* renamed from: x */
    final /* synthetic */ C3109di f8214x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3036b(C3670z c3670z, C3490s1 c3490s1, CharSequence charSequence, C3109di c3109di) {
        super(c3490s1, charSequence);
        this.f8214x = c3109di;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3671z0
    /* renamed from: c */
    public final int mo29914c(int i) {
        return ((C3637xi) this.f8214x).f9090a.end();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3671z0
    /* renamed from: d */
    public final int mo29913d(int i) {
        if (((C3637xi) this.f8214x).f9090a.find(i)) {
            return ((C3637xi) this.f8214x).f9090a.start();
        }
        return -1;
    }
}
