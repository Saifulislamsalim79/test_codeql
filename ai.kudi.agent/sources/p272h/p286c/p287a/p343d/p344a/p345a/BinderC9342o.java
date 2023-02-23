package p272h.p286c.p287a.p343d.p344a.p345a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractBinderC4980j0;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.tasks.C5021m;
/* renamed from: h.c.a.d.a.a.o */
/* loaded from: classes2.dex */
class BinderC9342o<T> extends AbstractBinderC4980j0 {

    /* renamed from: a */
    final C4957a f21940a;

    /* renamed from: b */
    final C5021m<T> f21941b;

    /* renamed from: c */
    final /* synthetic */ C9344q f21942c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC9342o(C9344q c9344q, C4957a c4957a, C5021m<T> c5021m) {
        this.f21942c = c9344q;
        this.f21940a = c4957a;
        this.f21941b = c5021m;
    }

    @Override // com.google.android.play.core.internal.InterfaceC4982k0
    /* renamed from: a */
    public void mo15011a(Bundle bundle) throws RemoteException {
        this.f21942c.f21947a.m25938b();
        this.f21940a.m25954f("onRequestInfo", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4982k0
    /* renamed from: b */
    public void mo15012b(Bundle bundle) throws RemoteException {
        this.f21942c.f21947a.m25938b();
        this.f21940a.m25954f("onCompleteUpdate", new Object[0]);
    }
}
