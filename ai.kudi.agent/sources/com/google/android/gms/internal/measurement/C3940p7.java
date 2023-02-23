package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.p7 */
/* loaded from: classes2.dex */
final class C3940p7 extends C3971r7 {

    /* renamed from: b */
    private int f9614b;

    /* renamed from: c */
    private int f9615c;

    /* renamed from: d */
    private int f9616d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3940p7(byte[] bArr, int i, int i2, boolean z, C3925o7 c3925o7) {
        super(null);
        this.f9616d = Integer.MAX_VALUE;
        this.f9614b = 0;
    }

    /* renamed from: c */
    public final int m29103c(int i) throws zzkh {
        int i2 = this.f9616d;
        this.f9616d = 0;
        int i3 = this.f9614b + this.f9615c;
        this.f9614b = i3;
        if (i3 > 0) {
            this.f9615c = i3;
            this.f9614b = 0;
        } else {
            this.f9615c = 0;
        }
        return i2;
    }
}
