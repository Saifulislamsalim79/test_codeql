package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p178j.C6637h;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
/* compiled from: InstrumentApacheHttpResponseHandler.java */
/* renamed from: com.google.firebase.perf.network.f */
/* loaded from: classes2.dex */
public class C6707f<T> implements ResponseHandler<T> {

    /* renamed from: a */
    private final ResponseHandler<? extends T> f16132a;

    /* renamed from: b */
    private final C6637h f16133b;

    /* renamed from: c */
    private final C6695b f16134c;

    public C6707f(ResponseHandler<? extends T> responseHandler, C6637h c6637h, C6695b c6695b) {
        this.f16132a = responseHandler;
        this.f16133b = c6637h;
        this.f16134c = c6695b;
    }

    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f16134c.m21094r(this.f16133b.m21401b());
        this.f16134c.m21101k(httpResponse.getStatusLine().getStatusCode());
        Long m20993a = C6709h.m20993a(httpResponse);
        if (m20993a != null) {
            this.f16134c.m21096p(m20993a.longValue());
        }
        String m20992b = C6709h.m20992b(httpResponse);
        if (m20992b != null) {
            this.f16134c.m21097o(m20992b);
        }
        this.f16134c.m21110b();
        return (T) this.f16132a.handleResponse(httpResponse);
    }
}
