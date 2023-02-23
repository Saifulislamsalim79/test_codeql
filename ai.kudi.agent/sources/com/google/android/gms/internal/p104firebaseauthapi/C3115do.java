package com.google.android.gms.internal.p104firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.do */
/* loaded from: classes2.dex */
public final class C3115do extends C3196go {

    /* renamed from: f */
    private final int f8408f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3115do(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC3223ho.m31024F(0, i2, bArr.length);
        this.f8408f = i2;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.C3196go
    /* renamed from: b0 */
    protected final int mo31090b0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.C3196go, com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: d */
    public final byte mo31016d(int i) {
        int i2 = this.f8408f;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.f8520e[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.C3196go, com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: e */
    public final byte mo31015e(int i) {
        return this.f8520e[i];
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.C3196go, com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: f */
    public final int mo31014f() {
        return this.f8408f;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.C3196go, com.google.android.gms.internal.p104firebaseauthapi.AbstractC3223ho
    /* renamed from: h */
    protected final void mo31013h(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f8520e, 0, bArr, 0, i3);
    }
}
