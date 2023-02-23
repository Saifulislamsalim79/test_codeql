package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.tasks.C5021m;
/* renamed from: com.google.android.play.core.assetpacks.p */
/* loaded from: classes2.dex */
final class BinderC4906p extends BinderC4889l<Void> {

    /* renamed from: c */
    final int f12426c;

    /* renamed from: d */
    final String f12427d;

    /* renamed from: e */
    final int f12428e;

    /* renamed from: f */
    final /* synthetic */ C4910q f12429f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4906p(C4910q c4910q, C5021m<Void> c5021m, int i, String str, int i2) {
        super(c4910q, c5021m);
        this.f12429f = c4910q;
        this.f12426c = i;
        this.f12427d = str;
        this.f12428e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC4889l, com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: a */
    public final void mo25895a(Bundle bundle) {
        C4983l c4983l;
        C4957a c4957a;
        c4983l = this.f12429f.f12464c;
        c4983l.m25938b();
        int i = bundle.getInt("error_code");
        c4957a = C4910q.f12460f;
        c4957a.m25955e("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i));
        int i2 = this.f12428e;
        if (i2 > 0) {
            this.f12429f.m26045h(this.f12426c, this.f12427d, i2 - 1);
        }
    }
}
