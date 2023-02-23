package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC4960b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.internal.InterfaceC4988n0;
import com.google.android.play.core.tasks.C5021m;
import java.util.Map;
/* renamed from: com.google.android.play.core.assetpacks.f */
/* loaded from: classes2.dex */
final class C4859f extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ Map f12300d;

    /* renamed from: e */
    final /* synthetic */ C5021m f12301e;

    /* renamed from: f */
    final /* synthetic */ C4910q f12302f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4859f(C4910q c4910q, C5021m c5021m, Map map, C5021m c5021m2) {
        super(c5021m);
        this.f12302f = c4910q;
        this.f12300d = map;
        this.f12301e = c5021m2;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    protected final void mo15013a() {
        C4957a c4957a;
        C4983l c4983l;
        String str;
        try {
            c4983l = this.f12302f.f12464c;
            str = this.f12302f.f12462a;
            ((InterfaceC4988n0) c4983l.m25934f()).mo25905k0(str, C4910q.m26041m(this.f12300d), new BinderC4898n(this.f12302f, this.f12301e));
        } catch (RemoteException e) {
            c4957a = C4910q.f12460f;
            c4957a.m25956d(e, "syncPacks", new Object[0]);
            this.f12301e.m25856d(new RuntimeException(e));
        }
    }
}
