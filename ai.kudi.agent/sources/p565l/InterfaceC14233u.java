package p565l;

import java.io.IOException;
/* compiled from: Interceptor.java */
/* renamed from: l.u */
/* loaded from: classes3.dex */
public interface InterfaceC14233u {

    /* compiled from: Interceptor.java */
    /* renamed from: l.u$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14234a {
        /* renamed from: a */
        C14131c0 mo2478a(C14116a0 c14116a0) throws IOException;

        int connectTimeoutMillis();

        InterfaceC14211i connection();

        int readTimeoutMillis();

        C14116a0 request();

        int writeTimeoutMillis();
    }

    C14131c0 intercept(InterfaceC14234a interfaceC14234a) throws IOException;
}
