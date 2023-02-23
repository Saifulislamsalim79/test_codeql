package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC4960b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.internal.InterfaceC4988n0;
import com.google.android.play.core.tasks.C5021m;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.k */
/* loaded from: classes2.dex */
public final class C4884k extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ C5021m f12375d;

    /* renamed from: e */
    final /* synthetic */ C4910q f12376e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4884k(C4910q c4910q, C5021m c5021m, C5021m c5021m2) {
        super(c5021m);
        this.f12376e = c4910q;
        this.f12375d = c5021m2;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    protected final void mo15013a() {
        C4957a c4957a;
        C4983l c4983l;
        String str;
        Bundle m26032v;
        try {
            c4983l = this.f12376e.f12465d;
            str = this.f12376e.f12462a;
            m26032v = C4910q.m26032v();
            ((InterfaceC4988n0) c4983l.m25934f()).mo25908V(str, m26032v, new BinderC4902o(this.f12376e, this.f12375d));
        } catch (RemoteException e) {
            c4957a = C4910q.f12460f;
            c4957a.m25956d(e, "keepAlive", new Object[0]);
        }
    }
}
