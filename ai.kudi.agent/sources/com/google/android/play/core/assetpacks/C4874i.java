package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC4960b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.internal.InterfaceC4988n0;
import com.google.android.play.core.tasks.C5021m;
/* renamed from: com.google.android.play.core.assetpacks.i */
/* loaded from: classes2.dex */
final class C4874i extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ int f12348d;

    /* renamed from: e */
    final /* synthetic */ C5021m f12349e;

    /* renamed from: f */
    final /* synthetic */ C4910q f12350f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4874i(C4910q c4910q, C5021m c5021m, int i, C5021m c5021m2) {
        super(c5021m);
        this.f12350f = c4910q;
        this.f12348d = i;
        this.f12349e = c5021m2;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    protected final void mo15013a() {
        C4957a c4957a;
        C4983l c4983l;
        String str;
        Bundle m26038p;
        Bundle m26032v;
        try {
            c4983l = this.f12350f.f12464c;
            str = this.f12350f.f12462a;
            m26038p = C4910q.m26038p(this.f12348d);
            m26032v = C4910q.m26032v();
            ((InterfaceC4988n0) c4983l.m25934f()).mo25910H0(str, m26038p, m26032v, new BinderC4889l(this.f12350f, this.f12349e, (int[]) null));
        } catch (RemoteException e) {
            c4957a = C4910q.f12460f;
            c4957a.m25956d(e, "notifySessionFailed", new Object[0]);
        }
    }
}
