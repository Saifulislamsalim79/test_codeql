package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.l5 */
/* loaded from: classes2.dex */
public final class C3876l5 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3876l5(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C3891m5.f9474e;
        atomicBoolean.set(true);
    }
}
