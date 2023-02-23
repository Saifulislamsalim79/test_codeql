package p272h.p286c.p287a.p343d.p344a.p345a;

import android.os.RemoteException;
import com.google.android.play.core.internal.AbstractRunnableC4960b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.tasks.C5021m;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h.c.a.d.a.a.n */
/* loaded from: classes2.dex */
public final class C9341n extends AbstractRunnableC4960b {

    /* renamed from: d */
    final /* synthetic */ String f21937d;

    /* renamed from: e */
    final /* synthetic */ C5021m f21938e;

    /* renamed from: f */
    final /* synthetic */ C9344q f21939f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9341n(C9344q c9344q, C5021m c5021m, String str, C5021m c5021m2) {
        super(c5021m);
        this.f21939f = c9344q;
        this.f21937d = str;
        this.f21938e = c5021m2;
    }

    @Override // com.google.android.play.core.internal.AbstractRunnableC4960b
    /* renamed from: a */
    protected final void mo15013a() {
        C4957a c4957a;
        String str;
        try {
            str = this.f21939f.f21948b;
            this.f21939f.f21947a.m25934f().mo25940D0(str, C9344q.m15009b(this.f21939f, this.f21937d), new BinderC9343p(this.f21939f, this.f21938e, this.f21937d));
        } catch (RemoteException e) {
            c4957a = C9344q.f21945e;
            c4957a.m25956d(e, "requestUpdateInfo(%s)", this.f21937d);
            this.f21938e.m25856d(new RuntimeException(e));
        }
    }
}
