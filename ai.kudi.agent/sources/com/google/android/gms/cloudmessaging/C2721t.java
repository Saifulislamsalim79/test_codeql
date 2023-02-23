package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.t */
/* loaded from: classes2.dex */
final class C2721t extends AbstractC2722u<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2721t(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC2722u
    /* renamed from: a */
    public final void mo32118a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m32119d(null);
        } else {
            m32120c(new zzq(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC2722u
    /* renamed from: b */
    public final boolean mo32117b() {
        return true;
    }
}
