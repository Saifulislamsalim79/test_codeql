package io.intercom.okhttp3.internal.http2;

import io.intercom.okhttp3.Headers;
import io.intercom.okhttp3.internal.Util;
import p425j.p429b.p433b.C11152f;
/* loaded from: classes3.dex */
public final class Header {
    final int hpackSize;
    public final C11152f name;
    public final C11152f value;
    public static final C11152f PSEUDO_PREFIX = C11152f.m11539n(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C11152f RESPONSE_STATUS = C11152f.m11539n(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C11152f TARGET_METHOD = C11152f.m11539n(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C11152f TARGET_PATH = C11152f.m11539n(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final C11152f TARGET_SCHEME = C11152f.m11539n(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C11152f TARGET_AUTHORITY = C11152f.m11539n(TARGET_AUTHORITY_UTF8);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface Listener {
        void onHeaders(Headers headers);
    }

    public Header(String str, String str2) {
        this(C11152f.m11539n(str), C11152f.m11539n(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Header) {
            Header header = (Header) obj;
            return this.name.equals(header.name) && this.value.equals(header.value);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return Util.format("%s: %s", this.name.mo11466P(), this.value.mo11466P());
    }

    public Header(C11152f c11152f, String str) {
        this(c11152f, C11152f.m11539n(str));
    }

    public Header(C11152f c11152f, C11152f c11152f2) {
        this.name = c11152f;
        this.value = c11152f2;
        this.hpackSize = c11152f.mo11470F() + 32 + c11152f2.mo11470F();
    }
}
