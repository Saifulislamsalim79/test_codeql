package io.intercom.retrofit2;

import io.intercom.okhttp3.Call;
import io.intercom.okhttp3.MediaType;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.ResponseBody;
import java.io.IOException;
import p425j.p429b.p433b.AbstractC11154h;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.C11158l;
import p425j.p429b.p433b.InterfaceC11151e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final Call.Factory callFactory;
    private volatile boolean canceled;
    private Throwable creationFailure;
    private boolean executed;
    private io.intercom.okhttp3.Call rawCall;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, T> responseConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        IOException thrownException;

        ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
        }

        @Override // io.intercom.okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public InterfaceC11151e source() {
            return C11158l.m11526d(new AbstractC11154h(this.delegate.source()) { // from class: io.intercom.retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // p425j.p429b.p433b.AbstractC11154h, p425j.p429b.p433b.InterfaceC11170s
                public long read(C11146c c11146c, long j) throws IOException {
                    try {
                        return super.read(c11146c, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        private final MediaType contentType;

        NoContentResponseBody(MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public InterfaceC11151e source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, Call.Factory factory, Converter<ResponseBody, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = factory;
        this.responseConverter = converter;
    }

    private io.intercom.okhttp3.Call createRawCall() throws IOException {
        io.intercom.okhttp3.Call newCall = this.callFactory.newCall(this.requestFactory.create(this.args));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // io.intercom.retrofit2.Call
    public void cancel() {
        io.intercom.okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // io.intercom.retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        io.intercom.okhttp3.Call call;
        Throwable th;
        Utils.checkNotNull(callback, "callback == null");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                call = this.rawCall;
                th = this.creationFailure;
                if (call == null && th == null) {
                    io.intercom.okhttp3.Call createRawCall = createRawCall();
                    this.rawCall = createRawCall;
                    call = createRawCall;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new io.intercom.okhttp3.Callback() { // from class: io.intercom.retrofit2.OkHttpCall.1
            private void callFailure(Throwable th2) {
                try {
                    callback.onFailure(OkHttpCall.this, th2);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }

            @Override // io.intercom.okhttp3.Callback
            public void onFailure(io.intercom.okhttp3.Call call2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // io.intercom.okhttp3.Callback
            public void onResponse(io.intercom.okhttp3.Call call2, io.intercom.okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(response));
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                } catch (Throwable th3) {
                    Utils.throwIfFatal(th3);
                    callFailure(th3);
                }
            }
        });
    }

    @Override // io.intercom.retrofit2.Call
    public Response<T> execute() throws IOException {
        io.intercom.okhttp3.Call call;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                if (this.creationFailure != null) {
                    if (!(this.creationFailure instanceof IOException)) {
                        if (this.creationFailure instanceof RuntimeException) {
                            throw ((RuntimeException) this.creationFailure);
                        }
                        throw ((Error) this.creationFailure);
                    }
                    throw ((IOException) this.creationFailure);
                }
                call = this.rawCall;
                if (call == null) {
                    try {
                        call = createRawCall();
                        this.rawCall = call;
                    } catch (IOException | Error | RuntimeException e) {
                        Utils.throwIfFatal(e);
                        this.creationFailure = e;
                        throw e;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            call.cancel();
        }
        return parseResponse(call.execute());
    }

    @Override // io.intercom.retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            if (this.rawCall == null || !this.rawCall.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // io.intercom.retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    Response<T> parseResponse(io.intercom.okhttp3.Response response) throws IOException {
        ResponseBody body = response.body();
        io.intercom.okhttp3.Response build = response.newBuilder().body(new NoContentResponseBody(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return Response.error(Utils.buffer(body), build);
            } finally {
                body.close();
            }
        } else if (code != 204 && code != 205) {
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(body);
            try {
                return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), build);
            } catch (RuntimeException e) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw e;
            }
        } else {
            body.close();
            return Response.success((Object) null, build);
        }
    }

    @Override // io.intercom.retrofit2.Call
    public synchronized Request request() {
        io.intercom.okhttp3.Call call = this.rawCall;
        if (call != null) {
            return call.request();
        } else if (this.creationFailure != null) {
            if (!(this.creationFailure instanceof IOException)) {
                if (this.creationFailure instanceof RuntimeException) {
                    throw ((RuntimeException) this.creationFailure);
                }
                throw ((Error) this.creationFailure);
            }
            throw new RuntimeException("Unable to create request.", this.creationFailure);
        } else {
            try {
                io.intercom.okhttp3.Call createRawCall = createRawCall();
                this.rawCall = createRawCall;
                return createRawCall.request();
            } catch (IOException e) {
                this.creationFailure = e;
                throw new RuntimeException("Unable to create request.", e);
            } catch (Error e2) {
                e = e2;
                Utils.throwIfFatal(e);
                this.creationFailure = e;
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                Utils.throwIfFatal(e);
                this.creationFailure = e;
                throw e;
            }
        }
    }

    @Override // io.intercom.retrofit2.Call
    /* renamed from: clone */
    public OkHttpCall<T> m41957clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
