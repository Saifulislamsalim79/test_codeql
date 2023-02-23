package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6637h;
import java.io.IOException;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14231t;
import p565l.InterfaceC14138e;
import p565l.InterfaceC14141f;
/* compiled from: InstrumentOkHttpEnqueueCallback.java */
/* renamed from: com.google.firebase.perf.network.g */
/* loaded from: classes2.dex */
public class C6708g implements InterfaceC14141f {

    /* renamed from: a */
    private final InterfaceC14141f f16135a;

    /* renamed from: b */
    private final C6695b f16136b;

    /* renamed from: c */
    private final C6637h f16137c;

    /* renamed from: d */
    private final long f16138d;

    public C6708g(InterfaceC14141f interfaceC14141f, C6623k c6623k, C6637h c6637h, long j) {
        this.f16135a = interfaceC14141f;
        this.f16136b = C6695b.m21109c(c6623k);
        this.f16138d = j;
        this.f16137c = c6637h;
    }

    @Override // p565l.InterfaceC14141f
    /* renamed from: a */
    public void mo316a(InterfaceC14138e interfaceC14138e, C14131c0 c14131c0) throws IOException {
        FirebasePerfOkHttpClient.m21051a(c14131c0, this.f16136b, this.f16138d, this.f16137c.m21401b());
        this.f16135a.mo316a(interfaceC14138e, c14131c0);
    }

    @Override // p565l.InterfaceC14141f
    /* renamed from: b */
    public void mo315b(InterfaceC14138e interfaceC14138e, IOException iOException) {
        C14116a0 request = interfaceC14138e.request();
        if (request != null) {
            C14231t m2913i = request.m2913i();
            if (m2913i != null) {
                this.f16136b.m21092t(m2913i.m2529G().toString());
            }
            if (request.m2915g() != null) {
                this.f16136b.m21102j(request.m2915g());
            }
        }
        this.f16136b.m21098n(this.f16138d);
        this.f16136b.m21094r(this.f16137c.m21401b());
        C6709h.m20990d(this.f16136b);
        this.f16135a.mo315b(interfaceC14138e, iOException);
    }
}
