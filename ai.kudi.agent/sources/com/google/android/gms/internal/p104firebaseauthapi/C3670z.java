package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z */
/* loaded from: classes2.dex */
public final class C3670z implements InterfaceC3464r1 {

    /* renamed from: a */
    final /* synthetic */ AbstractC3351mi f9135a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3670z(AbstractC3351mi abstractC3351mi) {
        this.f9135a = abstractC3351mi;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3464r1
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Iterator mo29916a(C3490s1 c3490s1, CharSequence charSequence) {
        return new C3036b(this, c3490s1, charSequence, this.f9135a.mo30424a(charSequence));
    }
}
