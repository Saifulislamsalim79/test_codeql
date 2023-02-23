package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC4960b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.internal.InterfaceC4988n0;
import com.google.android.play.core.tasks.C5021m;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.h */
/* loaded from: classes2.dex */
public final class C4869h extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ int f12327d;

    /* renamed from: e */
    final /* synthetic */ String f12328e;

    /* renamed from: f */
    final /* synthetic */ C5021m f12329f;

    /* renamed from: w */
    final /* synthetic */ int f12330w;

    /* renamed from: x */
    final /* synthetic */ C4910q f12331x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4869h(C4910q c4910q, C5021m c5021m, int i, String str, C5021m c5021m2, int i2) {
        super(c5021m);
        this.f12331x = c4910q;
        this.f12327d = i;
        this.f12328e = str;
        this.f12329f = c5021m2;
        this.f12330w = i2;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    protected final void mo15013a() {
        C4957a c4957a;
        C4983l c4983l;
        String str;
        Bundle m26037q;
        Bundle m26032v;
        try {
            c4983l = this.f12331x.f12464c;
            str = this.f12331x.f12462a;
            m26037q = C4910q.m26037q(this.f12327d, this.f12328e);
            m26032v = C4910q.m26032v();
            ((InterfaceC4988n0) c4983l.m25934f()).mo25904m0(str, m26037q, m26032v, new BinderC4906p(this.f12331x, this.f12329f, this.f12327d, this.f12328e, this.f12330w));
        } catch (RemoteException e) {
            c4957a = C4910q.f12460f;
            c4957a.m25956d(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
