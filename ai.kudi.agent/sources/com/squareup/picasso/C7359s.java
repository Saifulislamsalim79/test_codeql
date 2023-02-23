package com.squareup.picasso;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14239x;
import p565l.InterfaceC14138e;
/* compiled from: OkHttp3Downloader.java */
/* renamed from: com.squareup.picasso.s */
/* loaded from: classes2.dex */
public final class C7359s implements InterfaceC7345j {

    /* renamed from: a */
    final InterfaceC14138e.InterfaceC14139a f17428a;

    public C7359s(Context context) {
        this(C7332d0.m18952e(context));
    }

    @Override // com.squareup.picasso.InterfaceC7345j
    /* renamed from: a */
    public C14131c0 mo18888a(C14116a0 c14116a0) throws IOException {
        return FirebasePerfOkHttpClient.execute(this.f17428a.mo2460a(c14116a0));
    }

    public C7359s(File file) {
        this(file, C7332d0.m18956a(file));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7359s(java.io.File r3, long r4) {
        /*
            r2 = this;
            l.x$b r0 = new l.x$b
            r0.<init>()
            l.c r1 = new l.c
            r1.<init>(r3, r4)
            r0.m2422c(r1)
            l.x r3 = r0.m2423b()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C7359s.<init>(java.io.File, long):void");
    }

    public C7359s(C14239x c14239x) {
        this.f17428a = c14239x;
        c14239x.m2458c();
    }
}
