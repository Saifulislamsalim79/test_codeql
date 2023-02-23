package okhttp3.internal.http2;

import java.io.IOException;
/* loaded from: classes3.dex */
public final class StreamResetException extends IOException {

    /* renamed from: c */
    public final EnumC14481a f31890c;

    public StreamResetException(EnumC14481a enumC14481a) {
        super("stream was reset: " + enumC14481a);
        this.f31890c = enumC14481a;
    }
}
