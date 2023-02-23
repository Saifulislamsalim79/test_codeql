package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.C2832e;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.c$a;
import com.google.firebase.C5994h;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zi */
/* loaded from: classes2.dex */
public final class CallableC3689zi implements Callable<C3376nh<C3612wj>> {

    /* renamed from: c */
    private final C3612wj f9154c;

    /* renamed from: d */
    private final Context f9155d;

    public CallableC3689zi(C3612wj c3612wj, Context context) {
        this.f9154c = c3612wj;
        this.f9155d = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ C3376nh<C3612wj> call() throws Exception {
        int mo31845h = C2832e.m31864o().mo31845h(this.f9155d, C2838h.f7921a);
        C3029aj.m31416a(mo31845h == 0 || mo31845h == 2);
        Context context = this.f9155d;
        C3612wj clone = this.f9154c.clone();
        clone.f8801c = true;
        C2730a<C3612wj> c2730a = C3638xj.f9093c;
        c$a.C2742a c2742a = new c$a.C2742a();
        c2742a.m32084c(new C5994h());
        return new C3376nh<>(new C3428ph(context, c2730a, clone, c2742a.m32086a()));
    }
}
