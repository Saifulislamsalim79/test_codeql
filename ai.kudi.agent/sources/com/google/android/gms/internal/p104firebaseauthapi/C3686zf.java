package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.C2965c;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zf */
/* loaded from: classes2.dex */
public final class C3686zf implements InterfaceC3431pk<C3615wm> {

    /* renamed from: a */
    final /* synthetic */ C3589vm f9145a;

    /* renamed from: b */
    final /* synthetic */ C3640xl f9146b;

    /* renamed from: c */
    final /* synthetic */ C3056bj f9147c;

    /* renamed from: d */
    final /* synthetic */ C3140em f9148d;

    /* renamed from: e */
    final /* synthetic */ InterfaceC3405ok f9149e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3686zf(C3350mh c3350mh, C3589vm c3589vm, C3640xl c3640xl, C3056bj c3056bj, C3140em c3140em, InterfaceC3405ok interfaceC3405ok) {
        this.f9145a = c3589vm;
        this.f9146b = c3640xl;
        this.f9147c = c3056bj;
        this.f9148d = c3140em;
        this.f9149e = interfaceC3405ok;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3615wm c3615wm) {
        C3615wm c3615wm2 = c3615wm;
        if (this.f9145a.m30108m("EMAIL")) {
            this.f9146b.m30021E(null);
        } else if (this.f9145a.m30111j() != null) {
            this.f9146b.m30021E(this.f9145a.m30111j());
        }
        if (this.f9145a.m30108m("DISPLAY_NAME")) {
            this.f9146b.m30003u(null);
        } else if (this.f9145a.m30112i() != null) {
            this.f9146b.m30003u(this.f9145a.m30112i());
        }
        if (this.f9145a.m30108m("PHOTO_URL")) {
            this.f9146b.m30016h0(null);
        } else if (this.f9145a.m30109l() != null) {
            this.f9146b.m30016h0(this.f9145a.m30109l());
        }
        if (!TextUtils.isEmpty(this.f9145a.m30110k())) {
            this.f9146b.m30019e0(C2965c.c("redacted".getBytes()));
        }
        List<C3302km> m30074f = c3615wm2.m30074f();
        if (m30074f == null) {
            m30074f = new ArrayList<>();
        }
        this.f9146b.m30015j0(m30074f);
        C3056bj c3056bj = this.f9147c;
        C3140em c3140em = this.f9148d;
        s.j(c3140em);
        s.j(c3615wm2);
        String m30076c = c3615wm2.m30076c();
        String m30075d = c3615wm2.m30075d();
        if (!TextUtils.isEmpty(m30076c) && !TextUtils.isEmpty(m30075d)) {
            c3140em = new C3140em(m30075d, m30076c, Long.valueOf(c3615wm2.m30078a()), c3140em.m31171u());
        }
        c3056bj.m31387i(c3140em, this.f9146b);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f9149e.mo29885e(str);
    }
}
