package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C5021m;
import java.util.List;
/* renamed from: com.google.android.play.core.assetpacks.n */
/* loaded from: classes2.dex */
final class BinderC4898n extends BinderC4889l<List<String>> {

    /* renamed from: c */
    final /* synthetic */ C4910q f12412c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC4898n(C4910q c4910q, C5021m<List<String>> c5021m) {
        super(c4910q, c5021m);
        this.f12412c = c4910q;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC4889l, com.google.android.play.core.internal.InterfaceC4992p0
    /* renamed from: a */
    public final void mo25894a(List<Bundle> list) {
        super.mo25894a(list);
        this.f12388a.m25855e(C4910q.m26046g(this.f12412c, list));
    }
}
