package com.google.android.gms.common;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.z */
/* loaded from: classes2.dex */
abstract class AbstractBinderC2986z extends AbstractBinderC2984x {

    /* renamed from: c */
    private static final WeakReference<byte[]> f8157c = new WeakReference<>(null);

    /* renamed from: b */
    private WeakReference<byte[]> f8158b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC2986z(byte[] bArr) {
        super(bArr);
        this.f8158b = f8157c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC2984x
    /* renamed from: p1 */
    public final byte[] mo31498p1() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f8158b.get();
            if (bArr == null) {
                bArr = mo31497q1();
                this.f8158b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: q1 */
    protected abstract byte[] mo31497q1();
}
