package okhttp3.internal.connection;

import java.io.IOException;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.C14239x;
import p565l.InterfaceC14233u;
import p565l.p566g0.p568f.C14174g;
/* compiled from: ConnectInterceptor.java */
/* renamed from: okhttp3.internal.connection.a */
/* loaded from: classes3.dex */
public final class C14473a implements InterfaceC14233u {

    /* renamed from: a */
    public final C14239x f31845a;

    public C14473a(C14239x c14239x) {
        this.f31845a = c14239x;
    }

    @Override // p565l.InterfaceC14233u
    public C14131c0 intercept(InterfaceC14233u.InterfaceC14234a interfaceC14234a) throws IOException {
        C14174g c14174g = (C14174g) interfaceC14234a;
        C14116a0 request = c14174g.request();
        C14479f m2705f = c14174g.m2705f();
        return c14174g.m2706e(request, m2705f, m2705f.m1570i(this.f31845a, interfaceC14234a, !request.m2915g().equals("GET")), m2705f.m1575d());
    }
}
