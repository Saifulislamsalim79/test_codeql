package io.intercom.okhttp3;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import io.intercom.okhttp3.Headers;
import io.intercom.okhttp3.internal.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.C11152f;
import p425j.p429b.p433b.InterfaceC11150d;
/* loaded from: classes3.dex */
public final class MultipartBody extends RequestBody {
    private final C11152f boundary;
    private long contentLength = -1;
    private final MediaType contentType;
    private final MediaType originalType;
    private final List<Part> parts;
    public static final MediaType MIXED = MediaType.get("multipart/mixed");
    public static final MediaType ALTERNATIVE = MediaType.get("multipart/alternative");
    public static final MediaType DIGEST = MediaType.get("multipart/digest");
    public static final MediaType PARALLEL = MediaType.get("multipart/parallel");
    public static final MediaType FORM = MediaType.get("multipart/form-data");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {PrinterCommands.KING, 10};
    private static final byte[] DASHDASH = {45, 45};

    /* loaded from: classes3.dex */
    public static final class Builder {
        private final C11152f boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(UUID.randomUUID().toString());
        }

        public Builder addFormDataPart(String str, String str2) {
            return addPart(Part.createFormData(str, str2));
        }

        public Builder addPart(RequestBody requestBody) {
            return addPart(Part.create(requestBody));
        }

        public MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, this.parts);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public Builder setType(MediaType mediaType) {
            if (mediaType != null) {
                if (mediaType.type().equals("multipart")) {
                    this.type = mediaType;
                    return this;
                }
                throw new IllegalArgumentException("multipart != " + mediaType);
            }
            throw new NullPointerException("type == null");
        }

        public Builder(String str) {
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
            this.boundary = C11152f.m11539n(str);
        }

        public Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            return addPart(Part.createFormData(str, str2, requestBody));
        }

        public Builder addPart(Headers headers, RequestBody requestBody) {
            return addPart(Part.create(headers, requestBody));
        }

        public Builder addPart(Part part) {
            if (part != null) {
                this.parts.add(part);
                return this;
            }
            throw new NullPointerException("part == null");
        }
    }

    /* loaded from: classes3.dex */
    public static final class Part {
        final RequestBody body;
        final Headers headers;

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static Part create(RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static Part createFormData(String str, String str2) {
            return createFormData(str, null, RequestBody.create((MediaType) null, str2));
        }

        public RequestBody body() {
            return this.body;
        }

        public Headers headers() {
            return this.headers;
        }

        public static Part create(Headers headers, RequestBody requestBody) {
            if (requestBody != null) {
                if (headers != null && headers.get("Content-Type") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if (headers != null && headers.get("Content-Length") != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                return new Part(headers, requestBody);
            }
            throw new NullPointerException("body == null");
        }

        public static Part createFormData(String str, String str2, RequestBody requestBody) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                MultipartBody.appendQuotedString(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    MultipartBody.appendQuotedString(sb, str2);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb.toString()).build(), requestBody);
            }
            throw new NullPointerException("name == null");
        }
    }

    MultipartBody(C11152f c11152f, MediaType mediaType, List<Part> list) {
        this.boundary = c11152f;
        this.originalType = mediaType;
        this.contentType = MediaType.get(mediaType + "; boundary=" + c11152f.mo11466P());
        this.parts = Util.immutableList(list);
    }

    static StringBuilder appendQuotedString(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(InterfaceC11150d interfaceC11150d, boolean z) throws IOException {
        C11146c c11146c;
        if (z) {
            interfaceC11150d = new C11146c();
            c11146c = interfaceC11150d;
        } else {
            c11146c = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers;
            RequestBody requestBody = part.body;
            interfaceC11150d.mo11505x(DASHDASH);
            interfaceC11150d.mo11504y0(this.boundary);
            interfaceC11150d.mo11505x(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    interfaceC11150d.mo11507r(headers.name(i2)).mo11505x(COLONSPACE).mo11507r(headers.value(i2)).mo11505x(CRLF);
                }
            }
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                interfaceC11150d.mo11507r("Content-Type: ").mo11507r(contentType.toString()).mo11505x(CRLF);
            }
            long contentLength = requestBody.contentLength();
            if (contentLength != -1) {
                interfaceC11150d.mo11507r("Content-Length: ").mo11515A(contentLength).mo11505x(CRLF);
            } else if (z) {
                c11146c.m11568c();
                return -1L;
            }
            interfaceC11150d.mo11505x(CRLF);
            if (z) {
                j += contentLength;
            } else {
                requestBody.writeTo(interfaceC11150d);
            }
            interfaceC11150d.mo11505x(CRLF);
        }
        interfaceC11150d.mo11505x(DASHDASH);
        interfaceC11150d.mo11504y0(this.boundary);
        interfaceC11150d.mo11505x(DASHDASH);
        interfaceC11150d.mo11505x(CRLF);
        if (z) {
            long m11579J0 = j + c11146c.m11579J0();
            c11146c.m11568c();
            return m11579J0;
        }
        return j;
    }

    public String boundary() {
        return this.boundary.mo11466P();
    }

    @Override // io.intercom.okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long writeOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = writeOrCountBytes;
        return writeOrCountBytes;
    }

    @Override // io.intercom.okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public Part part(int i) {
        return this.parts.get(i);
    }

    public List<Part> parts() {
        return this.parts;
    }

    public int size() {
        return this.parts.size();
    }

    public MediaType type() {
        return this.originalType;
    }

    @Override // io.intercom.okhttp3.RequestBody
    public void writeTo(InterfaceC11150d interfaceC11150d) throws IOException {
        writeOrCountBytes(interfaceC11150d, false);
    }
}
