package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2757c;
import com.google.android.gms.internal.p104firebaseauthapi.C3140em;
import com.google.firebase.C5988g;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.firebase.auth.internal.w */
/* loaded from: classes2.dex */
public final class C5250w {

    /* renamed from: a */
    private volatile int f13057a;

    /* renamed from: b */
    private final C5233l f13058b;

    /* renamed from: c */
    private volatile boolean f13059c;

    public C5250w(C5988g c5988g) {
        Context m23093i = c5988g.m23093i();
        C5233l c5233l = new C5233l(c5988g);
        this.f13059c = false;
        this.f13057a = 0;
        this.f13058b = c5233l;
        ComponentCallbacks2C2757c.m32047c((Application) m23093i.getApplicationContext());
        ComponentCallbacks2C2757c.m32048b().m32049a(new C5249v(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final boolean m25265g() {
        return this.f13057a > 0 && !this.f13059c;
    }

    /* renamed from: b */
    public final void m25270b() {
        this.f13058b.m25320b();
    }

    /* renamed from: c */
    public final void m25269c(int i) {
        if (i > 0 && this.f13057a == 0) {
            this.f13057a = i;
            if (m25265g()) {
                this.f13058b.m25319c();
            }
        } else if (i == 0 && this.f13057a != 0) {
            this.f13058b.m25320b();
        }
        this.f13057a = i;
    }

    /* renamed from: d */
    public final void m25268d(C3140em c3140em) {
        if (c3140em == null) {
            return;
        }
        long m31176f = c3140em.m31176f();
        if (m31176f <= 0) {
            m31176f = 3600;
        }
        long m31175h = c3140em.m31175h();
        C5233l c5233l = this.f13058b;
        c5233l.f13017b = m31175h + (m31176f * 1000);
        c5233l.f13018c = -1L;
        if (m25265g()) {
            this.f13058b.m25319c();
        }
    }
}
