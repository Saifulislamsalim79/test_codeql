package io.intercom.okhttp3;

import io.intercom.okhttp3.internal.NamedRunnable;
import io.intercom.okhttp3.internal.Util;
import io.intercom.okhttp3.internal.cache.CacheInterceptor;
import io.intercom.okhttp3.internal.connection.ConnectInterceptor;
import io.intercom.okhttp3.internal.connection.StreamAllocation;
import io.intercom.okhttp3.internal.http.BridgeInterceptor;
import io.intercom.okhttp3.internal.http.CallServerInterceptor;
import io.intercom.okhttp3.internal.http.RealInterceptorChain;
import io.intercom.okhttp3.internal.http.RetryAndFollowUpInterceptor;
import io.intercom.okhttp3.internal.platform.Platform;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p425j.p429b.p433b.C11141a;
import p425j.p429b.p433b.C11171t;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RealCall implements Call {

    /* renamed from: client  reason: collision with root package name */
    final OkHttpClient f33385client;
    private EventListener eventListener;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    final C11141a timeout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class AsyncCall extends NamedRunnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Callback responseCallback;

        AsyncCall(Callback callback) {
            super("OkHttp %s", RealCall.this.redactedUrl());
            this.responseCallback = callback;
        }

        @Override // io.intercom.okhttp3.internal.NamedRunnable
        protected void execute() {
            IOException e;
            boolean z;
            RealCall.this.timeout.enter();
            try {
                try {
                    z = true;
                } finally {
                    RealCall.this.f33385client.dispatcher().finished(this);
                }
            } catch (IOException e2) {
                e = e2;
                z = false;
            }
            try {
                this.responseCallback.onResponse(RealCall.this, RealCall.this.getResponseWithInterceptorChain());
            } catch (IOException e3) {
                e = e3;
                IOException timeoutExit = RealCall.this.timeoutExit(e);
                if (!z) {
                    RealCall.this.eventListener.callFailed(RealCall.this, timeoutExit);
                    this.responseCallback.onFailure(RealCall.this, timeoutExit);
                } else {
                    Platform platform = Platform.get();
                    platform.log(4, "Callback failure for " + RealCall.this.toLoggableString(), timeoutExit);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void executeOn(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    RealCall.this.eventListener.callFailed(RealCall.this, interruptedIOException);
                    this.responseCallback.onFailure(RealCall.this, interruptedIOException);
                    RealCall.this.f33385client.dispatcher().finished(this);
                }
            } catch (Throwable th) {
                RealCall.this.f33385client.dispatcher().finished(this);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RealCall get() {
            return RealCall.this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String host() {
            return RealCall.this.originalRequest.url().host();
        }

        Request request() {
            return RealCall.this.originalRequest;
        }
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.f33385client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z);
        C11141a c11141a = new C11141a() { // from class: io.intercom.okhttp3.RealCall.1
            @Override // p425j.p429b.p433b.C11141a
            protected void timedOut() {
                RealCall.this.cancel();
            }
        };
        this.timeout = c11141a;
        c11141a.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        RealCall realCall = new RealCall(okHttpClient, request, z);
        realCall.eventListener = okHttpClient.eventListenerFactory().create(realCall);
        return realCall;
    }

    @Override // io.intercom.okhttp3.Call
    public void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    @Override // io.intercom.okhttp3.Call
    public void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        captureCallStackTrace();
        this.eventListener.callStart(this);
        this.f33385client.dispatcher().enqueue(new AsyncCall(callback));
    }

    @Override // io.intercom.okhttp3.Call
    public Response execute() throws IOException {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        captureCallStackTrace();
        this.timeout.enter();
        this.eventListener.callStart(this);
        try {
            try {
                this.f33385client.dispatcher().executed(this);
                Response responseWithInterceptorChain = getResponseWithInterceptorChain();
                if (responseWithInterceptorChain != null) {
                    return responseWithInterceptorChain;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException timeoutExit = timeoutExit(e);
                this.eventListener.callFailed(this, timeoutExit);
                throw timeoutExit;
            }
        } finally {
            this.f33385client.dispatcher().finished(this);
        }
    }

    Response getResponseWithInterceptorChain() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f33385client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.f33385client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.f33385client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.f33385client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.f33385client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        Response proceed = new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.f33385client.connectTimeoutMillis(), this.f33385client.readTimeoutMillis(), this.f33385client.writeTimeoutMillis()).proceed(this.originalRequest);
        if (this.retryAndFollowUpInterceptor.isCanceled()) {
            Util.closeQuietly(proceed);
            throw new IOException("Canceled");
        }
        return proceed;
    }

    @Override // io.intercom.okhttp3.Call
    public boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    @Override // io.intercom.okhttp3.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    @Override // io.intercom.okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    @Override // io.intercom.okhttp3.Call
    public C11171t timeout() {
        return this.timeout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IOException timeoutExit(IOException iOException) {
        if (this.timeout.exit()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
            return interruptedIOException;
        }
        return iOException;
    }

    String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl());
        return sb.toString();
    }

    @Override // io.intercom.okhttp3.Call
    /* renamed from: clone */
    public RealCall m41955clone() {
        return newRealCall(this.f33385client, this.originalRequest, this.forWebSocket);
    }
}
