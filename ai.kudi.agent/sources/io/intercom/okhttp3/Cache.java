package io.intercom.okhttp3;

import io.intercom.okhttp3.Headers;
import io.intercom.okhttp3.Request;
import io.intercom.okhttp3.Response;
import io.intercom.okhttp3.internal.Util;
import io.intercom.okhttp3.internal.cache.CacheRequest;
import io.intercom.okhttp3.internal.cache.CacheStrategy;
import io.intercom.okhttp3.internal.cache.DiskLruCache;
import io.intercom.okhttp3.internal.cache.InternalCache;
import io.intercom.okhttp3.internal.http.HttpHeaders;
import io.intercom.okhttp3.internal.http.HttpMethod;
import io.intercom.okhttp3.internal.http.StatusLine;
import io.intercom.okhttp3.internal.p423io.FileSystem;
import io.intercom.okhttp3.internal.platform.Platform;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p425j.p429b.p433b.AbstractC11153g;
import p425j.p429b.p433b.AbstractC11154h;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.C11152f;
import p425j.p429b.p433b.C11158l;
import p425j.p429b.p433b.InterfaceC11150d;
import p425j.p429b.p433b.InterfaceC11151e;
import p425j.p429b.p433b.InterfaceC11169r;
import p425j.p429b.p433b.InterfaceC11170s;
/* loaded from: classes3.dex */
public final class Cache implements Closeable, Flushable {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class CacheRequestImpl implements CacheRequest {
        private InterfaceC11169r body;
        private InterfaceC11169r cacheOut;
        boolean done;
        private final DiskLruCache.Editor editor;

        CacheRequestImpl(final DiskLruCache.Editor editor) {
            this.editor = editor;
            InterfaceC11169r newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new AbstractC11153g(newSink) { // from class: io.intercom.okhttp3.Cache.CacheRequestImpl.1
                @Override // p425j.p429b.p433b.AbstractC11153g, p425j.p429b.p433b.InterfaceC11169r, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    synchronized (Cache.this) {
                        if (CacheRequestImpl.this.done) {
                            return;
                        }
                        CacheRequestImpl.this.done = true;
                        Cache.this.writeSuccessCount++;
                        super.close();
                        editor.commit();
                    }
                }
            };
        }

        @Override // io.intercom.okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (Cache.this) {
                if (this.done) {
                    return;
                }
                this.done = true;
                Cache.this.writeAbortCount++;
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // io.intercom.okhttp3.internal.cache.CacheRequest
        public InterfaceC11169r body() {
            return this.body;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class CacheResponseBody extends ResponseBody {
        private final InterfaceC11151e bodySource;
        private final String contentLength;
        private final String contentType;
        final DiskLruCache.Snapshot snapshot;

        CacheResponseBody(final DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = C11158l.m11526d(new AbstractC11154h(snapshot.getSource(1)) { // from class: io.intercom.okhttp3.Cache.CacheResponseBody.1
                @Override // p425j.p429b.p433b.AbstractC11154h, p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    snapshot.close();
                    super.close();
                }
            });
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public long contentLength() {
            try {
                if (this.contentLength != null) {
                    return Long.parseLong(this.contentLength);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.parse(str);
            }
            return null;
        }

        @Override // io.intercom.okhttp3.ResponseBody
        public InterfaceC11151e source() {
            return this.bodySource;
        }
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    private void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static String key(HttpUrl httpUrl) {
        return C11152f.m11539n(httpUrl.toString()).mo11458v().mo11460q();
    }

    static int readInt(InterfaceC11151e interfaceC11151e) throws IOException {
        try {
            long mo11489p = interfaceC11151e.mo11489p();
            String mo11486u = interfaceC11151e.mo11486u();
            if (mo11489p < 0 || mo11489p > 2147483647L || !mo11486u.isEmpty()) {
                throw new IOException("expected an int but was \"" + mo11489p + mo11486u + "\"");
            }
            return (int) mo11489p;
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public void delete() throws IOException {
        this.cache.delete();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public void initialize() throws IOException {
        this.cache.initialize();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = this.cache.edit(key(response.request().url()));
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new CacheRequestImpl(editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
            }
        }
    }

    void remove(Request request) throws IOException {
        this.cache.remove(key(request.url()));
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    public long size() throws IOException {
        return this.cache.size();
    }

    synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor != null) {
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                    abortQuietly(editor);
                }
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    public Iterator<String> urls() throws IOException {
        return new Iterator<String>() { // from class: io.intercom.okhttp3.Cache.2
            boolean canRemove;
            final Iterator<DiskLruCache.Snapshot> delegate;
            String nextUrl;

            {
                this.delegate = Cache.this.cache.snapshots();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = C11158l.m11526d(next.getSource(0)).mo11486u();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        next.close();
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.canRemove) {
                    this.delegate.remove();
                    return;
                }
                throw new IllegalStateException("remove() before next()");
            }

            @Override // java.util.Iterator
            public String next() {
                if (hasNext()) {
                    String str = this.nextUrl;
                    this.nextUrl = null;
                    this.canRemove = true;
                    return str;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() { // from class: io.intercom.okhttp3.Cache.1
            @Override // io.intercom.okhttp3.internal.cache.InternalCache
            public Response get(Request request) throws IOException {
                return Cache.this.get(request);
            }

            @Override // io.intercom.okhttp3.internal.cache.InternalCache
            public CacheRequest put(Response response) throws IOException {
                return Cache.this.put(response);
            }

            @Override // io.intercom.okhttp3.internal.cache.InternalCache
            public void remove(Request request) throws IOException {
                Cache.this.remove(request);
            }

            @Override // io.intercom.okhttp3.internal.cache.InternalCache
            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            @Override // io.intercom.okhttp3.internal.cache.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }

            @Override // io.intercom.okhttp3.internal.cache.InternalCache
            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class Entry {
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;
        private static final String SENT_MILLIS = Platform.get().getPrefix() + "-Sent-Millis";
        private static final String RECEIVED_MILLIS = Platform.get().getPrefix() + "-Received-Millis";

        Entry(InterfaceC11170s interfaceC11170s) throws IOException {
            TlsVersion tlsVersion;
            try {
                InterfaceC11151e m11526d = C11158l.m11526d(interfaceC11170s);
                this.url = m11526d.mo11486u();
                this.requestMethod = m11526d.mo11486u();
                Headers.Builder builder = new Headers.Builder();
                int readInt = Cache.readInt(m11526d);
                for (int i = 0; i < readInt; i++) {
                    builder.addLenient(m11526d.mo11486u());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(m11526d.mo11486u());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt2 = Cache.readInt(m11526d);
                for (int i2 = 0; i2 < readInt2; i2++) {
                    builder2.addLenient(m11526d.mo11486u());
                }
                String str = builder2.get(SENT_MILLIS);
                String str2 = builder2.get(RECEIVED_MILLIS);
                builder2.removeAll(SENT_MILLIS);
                builder2.removeAll(RECEIVED_MILLIS);
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0L;
                this.receivedResponseMillis = str2 != null ? Long.parseLong(str2) : 0L;
                this.responseHeaders = builder2.build();
                if (isHttps()) {
                    String mo11486u = m11526d.mo11486u();
                    if (mo11486u.length() <= 0) {
                        CipherSuite forJavaName = CipherSuite.forJavaName(m11526d.mo11486u());
                        List<Certificate> readCertificateList = readCertificateList(m11526d);
                        List<Certificate> readCertificateList2 = readCertificateList(m11526d);
                        if (!m11526d.mo11491l()) {
                            tlsVersion = TlsVersion.forJavaName(m11526d.mo11486u());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        this.handshake = Handshake.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                    } else {
                        throw new IOException("expected \"\" but was \"" + mo11486u + "\"");
                    }
                } else {
                    this.handshake = null;
                }
            } finally {
                interfaceC11170s.close();
            }
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        private List<Certificate> readCertificateList(InterfaceC11151e interfaceC11151e) throws IOException {
            int readInt = Cache.readInt(interfaceC11151e);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    String mo11486u = interfaceC11151e.mo11486u();
                    C11146c c11146c = new C11146c();
                    c11146c.m11572X0(C11152f.m11544g(mo11486u));
                    arrayList.add(certificateFactory.generateCertificate(c11146c.mo11501D()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void writeCertList(InterfaceC11150d interfaceC11150d, List<Certificate> list) throws IOException {
            try {
                interfaceC11150d.mo11515A(list.size()).mo11509n(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    interfaceC11150d.mo11507r(C11152f.m11538w(list.get(i).getEncoded()).mo11462a()).mo11509n(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            return this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request);
        }

        public Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public void writeTo(DiskLruCache.Editor editor) throws IOException {
            InterfaceC11150d m11527c = C11158l.m11527c(editor.newSink(0));
            m11527c.mo11507r(this.url).mo11509n(10);
            m11527c.mo11507r(this.requestMethod).mo11509n(10);
            m11527c.mo11515A(this.varyHeaders.size()).mo11509n(10);
            int size = this.varyHeaders.size();
            for (int i = 0; i < size; i++) {
                m11527c.mo11507r(this.varyHeaders.name(i)).mo11507r(": ").mo11507r(this.varyHeaders.value(i)).mo11509n(10);
            }
            m11527c.mo11507r(new StatusLine(this.protocol, this.code, this.message).toString()).mo11509n(10);
            m11527c.mo11515A(this.responseHeaders.size() + 2).mo11509n(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                m11527c.mo11507r(this.responseHeaders.name(i2)).mo11507r(": ").mo11507r(this.responseHeaders.value(i2)).mo11509n(10);
            }
            m11527c.mo11507r(SENT_MILLIS).mo11507r(": ").mo11515A(this.sentRequestMillis).mo11509n(10);
            m11527c.mo11507r(RECEIVED_MILLIS).mo11507r(": ").mo11515A(this.receivedResponseMillis).mo11509n(10);
            if (isHttps()) {
                m11527c.mo11509n(10);
                m11527c.mo11507r(this.handshake.cipherSuite().javaName()).mo11509n(10);
                writeCertList(m11527c, this.handshake.peerCertificates());
                writeCertList(m11527c, this.handshake.localCertificates());
                m11527c.mo11507r(this.handshake.tlsVersion().javaName()).mo11509n(10);
            }
            m11527c.close();
        }

        Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
