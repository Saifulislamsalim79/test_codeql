package com.google.firebase.inappmessaging.p154j0;

import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.C5170a;
import com.google.firebase.abt.C5171b;
import com.google.firebase.inappmessaging.C6404p;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: AbtIntegrationHelper.java */
/* renamed from: com.google.firebase.inappmessaging.j0.i2 */
/* loaded from: classes2.dex */
public class C6195i2 {

    /* renamed from: a */
    private final C5171b f15060a;

    /* renamed from: b */
    Executor f15061b = Executors.newSingleThreadExecutor();

    public C6195i2(C5171b c5171b) {
        this.f15060a = c5171b;
    }

    /* renamed from: a */
    public /* synthetic */ void m22591a(C6404p c6404p) {
        try {
            C6163c3.m22621a("Updating active experiment: " + c6404p.toString());
            this.f15060a.m25455m(new C5170a(c6404p.m22107T(), c6404p.m22102Y(), c6404p.m22104W(), new Date(c6404p.m22106U()), c6404p.m22103X(), c6404p.m22105V()));
        } catch (AbtException e) {
            C6163c3.m22620b("Unable to set experiment as active with ABT, missing analytics?\n" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m22590b(final C6404p c6404p) {
        this.f15061b.execute(new Runnable() { // from class: com.google.firebase.inappmessaging.j0.a
            @Override // java.lang.Runnable
            public final void run() {
                C6195i2.this.m22591a(c6404p);
            }
        });
    }
}
