package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.tasks.C5021m;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.android.play.core.assetpacks.o */
/* loaded from: classes2.dex */
final class BinderC4902o extends BinderC4889l<Void> {

    /* renamed from: c */
    final /* synthetic */ C4910q f12416c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4902o(C4910q c4910q, C5021m<Void> c5021m) {
        super(c4910q, c5021m);
        this.f12416c = c4910q;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC4889l, com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: k */
    public final void mo25890k(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        C4957a c4957a;
        super.mo25890k(bundle, bundle2);
        atomicBoolean = this.f12416c.f12466e;
        if (!atomicBoolean.compareAndSet(true, false)) {
            c4957a = C4910q.f12460f;
            c4957a.m25953g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f12416c.mo26018a();
        }
    }
}
