package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.InterfaceC5005y;
import java.io.File;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.d2 */
/* loaded from: classes2.dex */
public final class C4852d2 {

    /* renamed from: a */
    private final C4840b0 f12277a;

    /* renamed from: b */
    private final InterfaceC5005y<InterfaceC4883j3> f12278b;

    /* renamed from: c */
    private final C4891l1 f12279c;

    /* renamed from: d */
    private final InterfaceC5005y<Executor> f12280d;

    /* renamed from: e */
    private final C4939x0 f12281e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4852d2(C4840b0 c4840b0, InterfaceC5005y<InterfaceC4883j3> interfaceC5005y, C4891l1 c4891l1, InterfaceC5005y<Executor> interfaceC5005y2, C4939x0 c4939x0) {
        this.f12277a = c4840b0;
        this.f12278b = interfaceC5005y;
        this.f12279c = c4891l1;
        this.f12280d = interfaceC5005y2;
        this.f12281e = c4939x0;
    }

    /* renamed from: a */
    public final void m26127a(C4842b2 c4842b2) {
        File m26148m = this.f12277a.m26148m(c4842b2.f12414b, c4842b2.f12263c, c4842b2.f12264d);
        File m26139v = this.f12277a.m26139v(c4842b2.f12414b, c4842b2.f12263c, c4842b2.f12264d);
        if (!m26148m.exists() || !m26139v.exists()) {
            throw new C4923t0(String.format("Cannot find pack files to move for pack %s.", c4842b2.f12414b), c4842b2.f12413a);
        }
        File m26159b = this.f12277a.m26159b(c4842b2.f12414b, c4842b2.f12263c, c4842b2.f12264d);
        m26159b.mkdirs();
        if (!m26148m.renameTo(m26159b)) {
            throw new C4923t0("Cannot move merged pack files to final location.", c4842b2.f12413a);
        }
        new File(this.f12277a.m26159b(c4842b2.f12414b, c4842b2.f12263c, c4842b2.f12264d), "merge.tmp").delete();
        File m26151j = this.f12277a.m26151j(c4842b2.f12414b, c4842b2.f12263c, c4842b2.f12264d);
        m26151j.mkdirs();
        if (!m26139v.renameTo(m26151j)) {
            throw new C4923t0("Cannot move metadata files to final location.", c4842b2.f12413a);
        }
        C4840b0 c4840b0 = this.f12277a;
        c4840b0.getClass();
        this.f12280d.m25876a().execute(RunnableC4847c2.m26129a(c4840b0));
        this.f12279c.m26091d(c4842b2.f12414b, c4842b2.f12263c, c4842b2.f12264d);
        this.f12281e.m25985b(c4842b2.f12414b);
        this.f12278b.m25876a().mo26015b(c4842b2.f12413a, c4842b2.f12414b);
    }
}
