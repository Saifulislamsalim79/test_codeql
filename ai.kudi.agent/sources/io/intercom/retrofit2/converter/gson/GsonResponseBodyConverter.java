package io.intercom.retrofit2.converter.gson;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.JsonIOException;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.EnumC10941b;
import io.intercom.okhttp3.ResponseBody;
import io.intercom.retrofit2.Converter;
import java.io.IOException;
/* loaded from: classes3.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final AbstractC10936q<T> adapter;
    private final C10916e gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonResponseBodyConverter(C10916e c10916e, AbstractC10936q<T> abstractC10936q) {
        this.gson = c10916e;
        this.adapter = abstractC10936q;
    }

    @Override // io.intercom.retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        C10939a m11955p = this.gson.m11955p(responseBody.charStream());
        try {
            T mo11675b = this.adapter.mo11675b(m11955p);
            if (m11955p.mo11789C0() == EnumC10941b.END_DOCUMENT) {
                return mo11675b;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
