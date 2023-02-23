package io.intercom.retrofit2.converter.gson;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.okhttp3.MediaType;
import io.intercom.okhttp3.RequestBody;
import io.intercom.retrofit2.Converter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p425j.p429b.p433b.C11146c;
/* loaded from: classes3.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final AbstractC10936q<T> adapter;
    private final C10916e gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonRequestBodyConverter(C10916e c10916e, AbstractC10936q<T> abstractC10936q) {
        this.gson = c10916e;
        this.adapter = abstractC10936q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.intercom.retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.intercom.retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        C11146c c11146c = new C11146c();
        C10942c m11954q = this.gson.m11954q(new OutputStreamWriter(c11146c.m11559i0(), UTF_8));
        this.adapter.mo11674d(m11954q, t);
        m11954q.close();
        return RequestBody.create(MEDIA_TYPE, c11146c.m11550z0());
    }
}
