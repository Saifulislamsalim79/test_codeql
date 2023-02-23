package com.google.android.gms.cloudmessaging;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.v */
/* loaded from: classes2.dex */
final class C2723v extends AbstractC2722u<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2723v(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC2722u
    /* renamed from: a */
    public final void mo32118a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(TransactionBreakDownItemType.DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m32119d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC2722u
    /* renamed from: b */
    public final boolean mo32117b() {
        return false;
    }
}
