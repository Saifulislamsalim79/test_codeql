package com.google.android.gms.common;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.y */
/* loaded from: classes2.dex */
final class BinderC2985y extends AbstractBinderC2984x {

    /* renamed from: b */
    private final byte[] f8156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2985y(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f8156b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC2984x
    /* renamed from: p1 */
    public final byte[] mo31498p1() {
        return this.f8156b;
    }
}
