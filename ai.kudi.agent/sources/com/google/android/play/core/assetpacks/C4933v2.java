package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.InterfaceC5005y;
import com.google.android.play.core.splitinstall.C5007a;
import com.google.android.play.core.tasks.AbstractC5011c;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.v2 */
/* loaded from: classes2.dex */
public final class C4933v2 {

    /* renamed from: e */
    private static final C4957a f12553e = new C4957a("AssetPackManager");

    /* renamed from: a */
    private final C4840b0 f12554a;

    /* renamed from: b */
    private final InterfaceC5005y<InterfaceC4883j3> f12555b;

    /* renamed from: c */
    private final C4930v f12556c;

    /* renamed from: d */
    private final InterfaceC5005y<Executor> f12557d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4933v2(C4840b0 c4840b0, InterfaceC5005y<InterfaceC4883j3> interfaceC5005y, C4930v c4930v, C5007a c5007a, C4891l1 c4891l1, C4939x0 c4939x0, C4890l0 c4890l0, InterfaceC5005y<Executor> interfaceC5005y2) {
        new Handler(Looper.getMainLooper());
        this.f12554a = c4840b0;
        this.f12555b = interfaceC5005y;
        this.f12556c = c4930v;
        this.f12557d = interfaceC5005y2;
    }

    /* renamed from: d */
    private final void m25988d() {
        this.f12557d.m25876a().execute(new Runnable(this) { // from class: com.google.android.play.core.assetpacks.s2

            /* renamed from: c */
            private final C4933v2 f12503c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12503c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12503c.m25989c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m25990b(boolean z) {
        boolean m14972d = this.f12556c.m14972d();
        this.f12556c.m14973c(z);
        if (!z || m14972d) {
            return;
        }
        m25988d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m25989c() {
        AbstractC5011c<List<String>> mo26016a = this.f12555b.m25876a().mo26016a(this.f12554a.m26149l());
        C4840b0 c4840b0 = this.f12554a;
        c4840b0.getClass();
        mo26016a.mo25852c(this.f12557d.m25876a(), C4925t2.m26005a(c4840b0));
        mo26016a.mo25854a(this.f12557d.m25876a(), C4929u2.f12534a);
    }
}
