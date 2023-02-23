package p272h.p286c.p287a.p343d.p344a.p345a;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.tasks.C5021m;
/* renamed from: h.c.a.d.a.a.p */
/* loaded from: classes2.dex */
final class BinderC9343p extends BinderC9342o<AbstractC9327a> {

    /* renamed from: d */
    private final String f21943d;

    /* renamed from: e */
    final /* synthetic */ C9344q f21944e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC9343p(C9344q c9344q, C5021m<AbstractC9327a> c5021m, String str) {
        super(c9344q, new C4957a("OnRequestInstallCallback"), c5021m);
        this.f21944e = c9344q;
        this.f21943d = str;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.BinderC9342o, com.google.android.play.core.internal.InterfaceC4982k0
    /* renamed from: a */
    public final void mo15011a(Bundle bundle) throws RemoteException {
        int i;
        AbstractC9327a m15027c;
        int i2;
        super.mo15011a(bundle);
        i = bundle.getInt("error.code", -2);
        if (i != 0) {
            C5021m<T> c5021m = this.f21941b;
            i2 = bundle.getInt("error.code", -2);
            c5021m.m25856d(new InstallException(i2));
            return;
        }
        C5021m<T> c5021m2 = this.f21941b;
        m15027c = AbstractC9327a.m15027c(this.f21943d, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), r22.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness")), bundle.getInt("in.app.update.priority", 0), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), bundle.getLong("additional.size.required"), this.f21944e.f21950d.m15002a(), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent"));
        c5021m2.m25855e(m15027c);
    }
}
