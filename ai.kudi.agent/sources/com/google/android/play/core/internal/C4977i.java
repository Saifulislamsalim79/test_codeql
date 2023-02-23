package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;
/* renamed from: com.google.android.play.core.internal.i */
/* loaded from: classes2.dex */
final class C4977i extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ IBinder f12630d;

    /* renamed from: e */
    final /* synthetic */ ServiceConnectionC4981k f12631e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4977i(ServiceConnectionC4981k serviceConnectionC4981k, IBinder iBinder) {
        this.f12631e = serviceConnectionC4981k;
        this.f12630d = iBinder;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    public final void mo15013a() {
        InterfaceC4975h interfaceC4975h;
        List<Runnable> list;
        List list2;
        C4983l c4983l = this.f12631e.f12633a;
        interfaceC4975h = c4983l.f12641g;
        c4983l.f12645k = (IInterface) interfaceC4975h.mo15014a(this.f12630d);
        C4983l.m25926n(this.f12631e.f12633a);
        this.f12631e.f12633a.f12639e = false;
        list = this.f12631e.f12633a.f12638d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f12631e.f12633a.f12638d;
        list2.clear();
    }
}
