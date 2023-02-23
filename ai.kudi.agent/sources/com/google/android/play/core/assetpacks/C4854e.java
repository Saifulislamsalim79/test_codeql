package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC4960b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.internal.InterfaceC4988n0;
import com.google.android.play.core.tasks.C5021m;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.play.core.assetpacks.e */
/* loaded from: classes2.dex */
final class C4854e extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ List f12284d;

    /* renamed from: e */
    final /* synthetic */ C5021m f12285e;

    /* renamed from: f */
    final /* synthetic */ C4910q f12286f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4854e(C4910q c4910q, C5021m c5021m, List list, C5021m c5021m2) {
        super(c5021m);
        this.f12286f = c4910q;
        this.f12284d = list;
        this.f12285e = c5021m2;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    protected final void mo15013a() {
        C4957a c4957a;
        C4983l c4983l;
        String str;
        Bundle m26032v;
        ArrayList m26047f = C4910q.m26047f(this.f12284d);
        try {
            c4983l = this.f12286f.f12464c;
            str = this.f12286f.f12462a;
            m26032v = C4910q.m26032v();
            ((InterfaceC4988n0) c4983l.m25934f()).mo25907a1(str, m26047f, m26032v, new BinderC4889l(this.f12286f, this.f12285e, (byte[]) null));
        } catch (RemoteException e) {
            c4957a = C4910q.f12460f;
            c4957a.m25956d(e, "cancelDownloads(%s)", this.f12284d);
        }
    }
}
