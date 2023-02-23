package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.InterfaceC5005y;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.u0 */
/* loaded from: classes2.dex */
public final class C4927u0 {

    /* renamed from: j */
    private static final C4957a f12518j = new C4957a("ExtractorLooper");

    /* renamed from: a */
    private final C4891l1 f12519a;

    /* renamed from: b */
    private final C4915r0 f12520b;

    /* renamed from: c */
    private final C4909p2 f12521c;

    /* renamed from: d */
    private final C4948z1 f12522d;

    /* renamed from: e */
    private final C4852d2 f12523e;

    /* renamed from: f */
    private final C4877i2 f12524f;

    /* renamed from: g */
    private final InterfaceC5005y<InterfaceC4883j3> f12525g;

    /* renamed from: h */
    private final C4904o1 f12526h;

    /* renamed from: i */
    private final AtomicBoolean f12527i = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4927u0(C4891l1 c4891l1, InterfaceC5005y<InterfaceC4883j3> interfaceC5005y, C4915r0 c4915r0, C4909p2 c4909p2, C4948z1 c4948z1, C4852d2 c4852d2, C4877i2 c4877i2, C4904o1 c4904o1) {
        this.f12519a = c4891l1;
        this.f12525g = interfaceC5005y;
        this.f12520b = c4915r0;
        this.f12521c = c4909p2;
        this.f12522d = c4948z1;
        this.f12523e = c4852d2;
        this.f12524f = c4877i2;
        this.f12526h = c4904o1;
    }

    /* renamed from: b */
    private final void m26003b(int i, Exception exc) {
        try {
            this.f12519a.m26079p(i);
            this.f12519a.m26092c(i);
        } catch (C4923t0 unused) {
            f12518j.m25955e("Error during error handling: %s", exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m26004a() {
        f12518j.m25957c("Run extractor loop", new Object[0]);
        if (!this.f12527i.compareAndSet(false, true)) {
            f12518j.m25953g("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            C4900n1 c4900n1 = null;
            try {
                c4900n1 = this.f12526h.m26054a();
            } catch (C4923t0 e) {
                f12518j.m25955e("Error while getting next extraction task: %s", e.getMessage());
                if (e.f12507c >= 0) {
                    this.f12525g.m25876a().mo26007j(e.f12507c);
                    m26003b(e.f12507c, e);
                }
            }
            if (c4900n1 == null) {
                this.f12527i.set(false);
                return;
            }
            try {
                if (c4900n1 instanceof C4911q0) {
                    this.f12520b.m26029a((C4911q0) c4900n1);
                } else if (c4900n1 instanceof C4905o2) {
                    this.f12521c.m26050a((C4905o2) c4900n1);
                } else if (c4900n1 instanceof C4944y1) {
                    this.f12522d.m25975a((C4944y1) c4900n1);
                } else if (c4900n1 instanceof C4842b2) {
                    this.f12523e.m26127a((C4842b2) c4900n1);
                } else if (c4900n1 instanceof C4872h2) {
                    this.f12524f.m26109a((C4872h2) c4900n1);
                } else {
                    f12518j.m25955e("Unknown task type: %s", c4900n1.getClass().getName());
                }
            } catch (Exception e2) {
                f12518j.m25955e("Error during extraction task: %s", e2.getMessage());
                this.f12525g.m25876a().mo26007j(c4900n1.f12413a);
                m26003b(c4900n1.f12413a, e2);
            }
        }
    }
}
