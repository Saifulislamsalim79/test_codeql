package io.intercom.okhttp3.internal.connection;

import io.intercom.okhttp3.Interceptor;
import io.intercom.okhttp3.OkHttpClient;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.Response;
import io.intercom.okhttp3.internal.http.RealInterceptorChain;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: client  reason: collision with root package name */
    public final OkHttpClient f33386client;

    public ConnectInterceptor(OkHttpClient okHttpClient) {
        this.f33386client = okHttpClient;
    }

    @Override // io.intercom.okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request();
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
        return realInterceptorChain.proceed(request, streamAllocation, streamAllocation.newStream(this.f33386client, chain, !request.method().equals("GET")), streamAllocation.connection());
    }
}
