package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.api.C2741b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.p099l.C2946a;
import java.util.HashMap;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yk */
/* loaded from: classes2.dex */
final class C3665yk extends C3056bj {

    /* renamed from: c */
    private final String f9129c;

    /* renamed from: d */
    final /* synthetic */ C3058bl f9130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3665yk(C3058bl c3058bl, C3056bj c3056bj, String str) {
        super(c3056bj);
        this.f9130d = c3058bl;
        this.f9129c = str;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.C3056bj
    /* renamed from: b */
    public final void mo29941b(String str) {
        C2946a c2946a;
        HashMap hashMap;
        c2946a = C3058bl.f8250d;
        c2946a.m31585a("onCodeSent", new Object[0]);
        hashMap = this.f9130d.f8253c;
        C3031al c3031al = (C3031al) hashMap.get(this.f9129c);
        if (c3031al == null) {
            return;
        }
        for (C3056bj c3056bj : c3031al.f8204b) {
            c3056bj.mo29941b(str);
        }
        c3031al.f8209g = true;
        c3031al.f8206d = str;
        if (c3031al.f8203a <= 0) {
            this.f9130d.m31370h(this.f9129c);
        } else if (!c3031al.f8205c) {
            this.f9130d.m31364n(this.f9129c);
        } else if (!C3516t1.m30219d(c3031al.f8207e)) {
            C3058bl.m31373e(this.f9130d, this.f9129c);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.C3056bj
    /* renamed from: h */
    public final void mo29940h(Status status) {
        C2946a c2946a;
        HashMap hashMap;
        c2946a = C3058bl.f8250d;
        String m32087a = C2741b.m32087a(status.m32097h());
        String m32096k = status.m32096k();
        StringBuilder sb = new StringBuilder(String.valueOf(m32087a).length() + 39 + String.valueOf(m32096k).length());
        sb.append("SMS verification code request failed: ");
        sb.append(m32087a);
        sb.append(" ");
        sb.append(m32096k);
        c2946a.m31583c(sb.toString(), new Object[0]);
        hashMap = this.f9130d.f8253c;
        C3031al c3031al = (C3031al) hashMap.get(this.f9129c);
        if (c3031al == null) {
            return;
        }
        for (C3056bj c3056bj : c3031al.f8204b) {
            c3056bj.mo29940h(status);
        }
        this.f9130d.m31368j(this.f9129c);
    }
}
