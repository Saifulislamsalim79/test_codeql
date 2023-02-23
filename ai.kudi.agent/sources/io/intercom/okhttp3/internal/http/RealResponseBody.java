package io.intercom.okhttp3.internal.http;

import io.intercom.okhttp3.MediaType;
import io.intercom.okhttp3.ResponseBody;
import p425j.p429b.p433b.InterfaceC11151e;
/* loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final InterfaceC11151e source;

    public RealResponseBody(String str, long j, InterfaceC11151e interfaceC11151e) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = interfaceC11151e;
    }

    @Override // io.intercom.okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // io.intercom.okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.parse(str);
        }
        return null;
    }

    @Override // io.intercom.okhttp3.ResponseBody
    public InterfaceC11151e source() {
        return this.source;
    }
}
