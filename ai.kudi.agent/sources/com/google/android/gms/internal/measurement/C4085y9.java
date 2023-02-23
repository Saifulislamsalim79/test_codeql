package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.y9 */
/* loaded from: classes2.dex */
final class C4085y9 implements InterfaceC3864k9 {

    /* renamed from: a */
    private final InterfaceC3927o9 f9861a;

    /* renamed from: b */
    private final String f9862b;

    /* renamed from: c */
    private final Object[] f9863c;

    /* renamed from: d */
    private final int f9864d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4085y9(InterfaceC3927o9 interfaceC3927o9, String str, Object[] objArr) {
        this.f9861a = interfaceC3927o9;
        this.f9862b = str;
        this.f9863c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9864d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f9864d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m28599a() {
        return this.f9862b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object[] m28598b() {
        return this.f9863c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3864k9
    /* renamed from: c */
    public final int mo28597c() {
        return (this.f9864d & 1) == 1 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3864k9
    public final InterfaceC3927o9 zza() {
        return this.f9861a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3864k9
    public final boolean zzb() {
        return (this.f9864d & 2) == 2;
    }
}
