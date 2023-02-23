package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.C6695b;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6637h;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
/* loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    /* renamed from: a */
    static <T> T m21059a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, C6637h c6637h, C6623k c6623k) throws IOException {
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            m21109c.m21092t(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            m21109c.m21102j(httpRequest.getRequestLine().getMethod());
            Long m20993a = C6709h.m20993a(httpRequest);
            if (m20993a != null) {
                m21109c.m21099m(m20993a.longValue());
            }
            c6637h.m21398e();
            m21109c.m21098n(c6637h.m21399d());
            return (T) httpClient.execute(httpHost, httpRequest, new C6707f(responseHandler, c6637h, m21109c));
        } catch (IOException e) {
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    /* renamed from: b */
    static <T> T m21058b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, C6637h c6637h, C6623k c6623k) throws IOException {
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            m21109c.m21092t(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            m21109c.m21102j(httpRequest.getRequestLine().getMethod());
            Long m20993a = C6709h.m20993a(httpRequest);
            if (m20993a != null) {
                m21109c.m21099m(m20993a.longValue());
            }
            c6637h.m21398e();
            m21109c.m21098n(c6637h.m21399d());
            return (T) httpClient.execute(httpHost, httpRequest, new C6707f(responseHandler, c6637h, m21109c), httpContext);
        } catch (IOException e) {
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    /* renamed from: c */
    static <T> T m21057c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, C6637h c6637h, C6623k c6623k) throws IOException {
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            m21109c.m21092t(httpUriRequest.getURI().toString());
            m21109c.m21102j(httpUriRequest.getMethod());
            Long m20993a = C6709h.m20993a(httpUriRequest);
            if (m20993a != null) {
                m21109c.m21099m(m20993a.longValue());
            }
            c6637h.m21398e();
            m21109c.m21098n(c6637h.m21399d());
            return (T) httpClient.execute(httpUriRequest, new C6707f(responseHandler, c6637h, m21109c));
        } catch (IOException e) {
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    /* renamed from: d */
    static <T> T m21056d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, C6637h c6637h, C6623k c6623k) throws IOException {
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            m21109c.m21092t(httpUriRequest.getURI().toString());
            m21109c.m21102j(httpUriRequest.getMethod());
            Long m20993a = C6709h.m20993a(httpUriRequest);
            if (m20993a != null) {
                m21109c.m21099m(m20993a.longValue());
            }
            c6637h.m21398e();
            m21109c.m21098n(c6637h.m21399d());
            return (T) httpClient.execute(httpUriRequest, new C6707f(responseHandler, c6637h, m21109c), httpContext);
        } catch (IOException e) {
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    /* renamed from: e */
    static HttpResponse m21055e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, C6637h c6637h, C6623k c6623k) throws IOException {
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            m21109c.m21092t(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            m21109c.m21102j(httpRequest.getRequestLine().getMethod());
            Long m20993a = C6709h.m20993a(httpRequest);
            if (m20993a != null) {
                m21109c.m21099m(m20993a.longValue());
            }
            c6637h.m21398e();
            m21109c.m21098n(c6637h.m21399d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            m21109c.m21094r(c6637h.m21401b());
            m21109c.m21101k(execute.getStatusLine().getStatusCode());
            Long m20993a2 = C6709h.m20993a(execute);
            if (m20993a2 != null) {
                m21109c.m21096p(m20993a2.longValue());
            }
            String m20992b = C6709h.m20992b(execute);
            if (m20992b != null) {
                m21109c.m21097o(m20992b);
            }
            m21109c.m21110b();
            return execute;
        } catch (IOException e) {
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return m21053g(httpClient, httpUriRequest, new C6637h(), C6623k.m21437e());
    }

    /* renamed from: f */
    static HttpResponse m21054f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, C6637h c6637h, C6623k c6623k) throws IOException {
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            m21109c.m21092t(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            m21109c.m21102j(httpRequest.getRequestLine().getMethod());
            Long m20993a = C6709h.m20993a(httpRequest);
            if (m20993a != null) {
                m21109c.m21099m(m20993a.longValue());
            }
            c6637h.m21398e();
            m21109c.m21098n(c6637h.m21399d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            m21109c.m21094r(c6637h.m21401b());
            m21109c.m21101k(execute.getStatusLine().getStatusCode());
            Long m20993a2 = C6709h.m20993a(execute);
            if (m20993a2 != null) {
                m21109c.m21096p(m20993a2.longValue());
            }
            String m20992b = C6709h.m20992b(execute);
            if (m20992b != null) {
                m21109c.m21097o(m20992b);
            }
            m21109c.m21110b();
            return execute;
        } catch (IOException e) {
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    /* renamed from: g */
    static HttpResponse m21053g(HttpClient httpClient, HttpUriRequest httpUriRequest, C6637h c6637h, C6623k c6623k) throws IOException {
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            m21109c.m21092t(httpUriRequest.getURI().toString());
            m21109c.m21102j(httpUriRequest.getMethod());
            Long m20993a = C6709h.m20993a(httpUriRequest);
            if (m20993a != null) {
                m21109c.m21099m(m20993a.longValue());
            }
            c6637h.m21398e();
            m21109c.m21098n(c6637h.m21399d());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            m21109c.m21094r(c6637h.m21401b());
            m21109c.m21101k(execute.getStatusLine().getStatusCode());
            Long m20993a2 = C6709h.m20993a(execute);
            if (m20993a2 != null) {
                m21109c.m21096p(m20993a2.longValue());
            }
            String m20992b = C6709h.m20992b(execute);
            if (m20992b != null) {
                m21109c.m21097o(m20992b);
            }
            m21109c.m21110b();
            return execute;
        } catch (IOException e) {
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    /* renamed from: h */
    static HttpResponse m21052h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, C6637h c6637h, C6623k c6623k) throws IOException {
        C6695b m21109c = C6695b.m21109c(c6623k);
        try {
            m21109c.m21092t(httpUriRequest.getURI().toString());
            m21109c.m21102j(httpUriRequest.getMethod());
            Long m20993a = C6709h.m20993a(httpUriRequest);
            if (m20993a != null) {
                m21109c.m21099m(m20993a.longValue());
            }
            c6637h.m21398e();
            m21109c.m21098n(c6637h.m21399d());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            m21109c.m21094r(c6637h.m21401b());
            m21109c.m21101k(execute.getStatusLine().getStatusCode());
            Long m20993a2 = C6709h.m20993a(execute);
            if (m20993a2 != null) {
                m21109c.m21096p(m20993a2.longValue());
            }
            String m20992b = C6709h.m20992b(execute);
            if (m20992b != null) {
                m21109c.m21097o(m20992b);
            }
            m21109c.m21110b();
            return execute;
        } catch (IOException e) {
            m21109c.m21094r(c6637h.m21401b());
            C6709h.m20990d(m21109c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return m21052h(httpClient, httpUriRequest, httpContext, new C6637h(), C6623k.m21437e());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) m21057c(httpClient, httpUriRequest, responseHandler, new C6637h(), C6623k.m21437e());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) m21056d(httpClient, httpUriRequest, responseHandler, httpContext, new C6637h(), C6623k.m21437e());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return m21055e(httpClient, httpHost, httpRequest, new C6637h(), C6623k.m21437e());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return m21054f(httpClient, httpHost, httpRequest, httpContext, new C6637h(), C6623k.m21437e());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) m21059a(httpClient, httpHost, httpRequest, responseHandler, new C6637h(), C6623k.m21437e());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) m21058b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new C6637h(), C6623k.m21437e());
    }
}
