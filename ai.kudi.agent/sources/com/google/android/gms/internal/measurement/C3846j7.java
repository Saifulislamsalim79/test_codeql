package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.j7 */
/* loaded from: classes2.dex */
public final class C3846j7 extends C3893m7 {

    /* renamed from: f */
    private final int f9433f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3846j7(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC3909n7.m29334u(0, i2, bArr.length);
        this.f9433f = i2;
    }

    @Override // com.google.android.gms.internal.measurement.C3893m7
    /* renamed from: O */
    protected final int mo29396O() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.C3893m7, com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: d */
    public final byte mo29342d(int i) {
        int i2 = this.f9433f;
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
        return this.f9493e[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C3893m7, com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: e */
    public final byte mo29341e(int i) {
        return this.f9493e[i];
    }

    @Override // com.google.android.gms.internal.measurement.C3893m7, com.google.android.gms.internal.measurement.AbstractC3909n7
    /* renamed from: f */
    public final int mo29340f() {
        return this.f9433f;
    }
}
