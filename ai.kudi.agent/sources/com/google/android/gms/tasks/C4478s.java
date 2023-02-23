package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.s */
/* loaded from: classes2.dex */
public final class C4478s implements InterfaceC4477r {

    /* renamed from: a */
    private final Object f10905a = new Object();

    /* renamed from: b */
    private final int f10906b;

    /* renamed from: c */
    private final C4472n0<Void> f10907c;

    /* renamed from: d */
    private int f10908d;

    /* renamed from: e */
    private int f10909e;

    /* renamed from: f */
    private int f10910f;

    /* renamed from: g */
    private Exception f10911g;

    /* renamed from: h */
    private boolean f10912h;

    public C4478s(int i, C4472n0<Void> c4472n0) {
        this.f10906b = i;
        this.f10907c = c4472n0;
    }

    /* renamed from: d */
    private final void m27729d() {
        if (this.f10908d + this.f10909e + this.f10910f == this.f10906b) {
            if (this.f10911g == null) {
                if (this.f10912h) {
                    this.f10907c.m27737u();
                    return;
                } else {
                    this.f10907c.m27738t(null);
                    return;
                }
            }
            C4472n0<Void> c4472n0 = this.f10907c;
            int i = this.f10909e;
            int i2 = this.f10906b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            c4472n0.m27739s(new ExecutionException(sb.toString(), this.f10911g));
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC4452d
    /* renamed from: a */
    public final void mo20881a() {
        synchronized (this.f10905a) {
            this.f10910f++;
            this.f10912h = true;
            m27729d();
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC4456f
    /* renamed from: b */
    public final void mo15657b(Exception exc) {
        synchronized (this.f10905a) {
            this.f10909e++;
            this.f10911g = exc;
            m27729d();
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC4458g
    /* renamed from: c */
    public final void mo18742c(Object obj) {
        synchronized (this.f10905a) {
            this.f10908d++;
            m27729d();
        }
    }
}
