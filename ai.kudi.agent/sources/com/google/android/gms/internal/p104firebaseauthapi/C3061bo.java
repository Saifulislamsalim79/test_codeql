package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.NoSuchElementException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bo */
/* loaded from: classes2.dex */
final class C3061bo extends AbstractC3088co {

    /* renamed from: c */
    private int f8268c = 0;

    /* renamed from: d */
    private final int f8269d;

    /* renamed from: e */
    final /* synthetic */ AbstractC3223ho f8270e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3061bo(AbstractC3223ho abstractC3223ho) {
        this.f8270e = abstractC3223ho;
        this.f8269d = this.f8270e.mo31014f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8268c < this.f8269d;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3142eo
    public final byte zza() {
        int i = this.f8268c;
        if (i < this.f8269d) {
            this.f8268c = i + 1;
            return this.f8270e.mo31015e(i);
        }
        throw new NoSuchElementException();
    }
}
