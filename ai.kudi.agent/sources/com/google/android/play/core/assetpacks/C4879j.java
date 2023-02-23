package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC4960b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.internal.InterfaceC4988n0;
import com.google.android.play.core.tasks.C5021m;
/* renamed from: com.google.android.play.core.assetpacks.j */
/* loaded from: classes2.dex */
final class C4879j extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ int f12359d;

    /* renamed from: e */
    final /* synthetic */ String f12360e;

    /* renamed from: f */
    final /* synthetic */ String f12361f;

    /* renamed from: w */
    final /* synthetic */ int f12362w;

    /* renamed from: x */
    final /* synthetic */ C5021m f12363x;

    /* renamed from: y */
    final /* synthetic */ C4910q f12364y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4879j(C4910q c4910q, C5021m c5021m, int i, String str, String str2, int i2, C5021m c5021m2) {
        super(c5021m);
        this.f12364y = c4910q;
        this.f12359d = i;
        this.f12360e = str;
        this.f12361f = str2;
        this.f12362w = i2;
        this.f12363x = c5021m2;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    protected final void mo15013a() {
        C4957a c4957a;
        C4983l c4983l;
        String str;
        Bundle m26032v;
        try {
            c4983l = this.f12364y.f12464c;
            str = this.f12364y.f12462a;
            Bundle m26036r = C4910q.m26036r(this.f12359d, this.f12360e, this.f12361f, this.f12362w);
            m26032v = C4910q.m26032v();
            ((InterfaceC4988n0) c4983l.m25934f()).mo25909T0(str, m26036r, m26032v, new BinderC4894m(this.f12364y, this.f12363x));
        } catch (RemoteException e) {
            c4957a = C4910q.f12460f;
            c4957a.m25955e("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f12360e, this.f12361f, Integer.valueOf(this.f12362w), Integer.valueOf(this.f12359d));
            this.f12363x.m25856d(new RuntimeException(e));
        }
    }
}
