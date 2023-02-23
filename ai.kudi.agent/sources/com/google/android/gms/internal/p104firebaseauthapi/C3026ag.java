package com.google.android.gms.internal.p104firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.C5206g0;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ag */
/* loaded from: classes2.dex */
public final class C3026ag implements InterfaceC3431pk<C3588vl> {

    /* renamed from: a */
    final /* synthetic */ InterfaceC3405ok f8193a;

    /* renamed from: b */
    final /* synthetic */ String f8194b;

    /* renamed from: c */
    final /* synthetic */ String f8195c;

    /* renamed from: d */
    final /* synthetic */ Boolean f8196d;

    /* renamed from: e */
    final /* synthetic */ C5206g0 f8197e;

    /* renamed from: f */
    final /* synthetic */ C3056bj f8198f;

    /* renamed from: g */
    final /* synthetic */ C3140em f8199g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3026ag(C3350mh c3350mh, InterfaceC3405ok interfaceC3405ok, String str, String str2, Boolean bool, C5206g0 c5206g0, C3056bj c3056bj, C3140em c3140em) {
        this.f8193a = interfaceC3405ok;
        this.f8194b = str;
        this.f8195c = str2;
        this.f8196d = bool;
        this.f8197e = c5206g0;
        this.f8198f = c3056bj;
        this.f8199g = c3140em;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3431pk
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29886b(C3588vl c3588vl) {
        List<C3640xl> m30121f = c3588vl.m30121f();
        if (m30121f != null && !m30121f.isEmpty()) {
            int i = 0;
            C3640xl c3640xl = m30121f.get(0);
            C3355mm m30012l0 = c3640xl.m30012l0();
            List<C3302km> m30655k = m30012l0 != null ? m30012l0.m30655k() : null;
            if (m30655k != null && !m30655k.isEmpty()) {
                if (TextUtils.isEmpty(this.f8194b)) {
                    m30655k.get(0).m30836d0(this.f8195c);
                } else {
                    while (true) {
                        if (i >= m30655k.size()) {
                            break;
                        } else if (m30655k.get(i).m30830u().equals(this.f8194b)) {
                            m30655k.get(i).m30836d0(this.f8195c);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c3640xl.m30020d0(this.f8196d.booleanValue());
            c3640xl.m30006s(this.f8197e);
            this.f8198f.m31387i(this.f8199g, c3640xl);
            return;
        }
        this.f8193a.mo29885e("No users.");
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3405ok
    /* renamed from: e */
    public final void mo29885e(String str) {
        this.f8193a.mo29885e(str);
    }
}
