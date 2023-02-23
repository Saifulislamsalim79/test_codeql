package io.intercom.retrofit2.converter.gson;

import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.okhttp3.RequestBody;
import io.intercom.okhttp3.ResponseBody;
import io.intercom.retrofit2.Converter;
import io.intercom.retrofit2.Retrofit;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* loaded from: classes3.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final C10916e gson;

    private GsonConverterFactory(C10916e c10916e) {
        this.gson = c10916e;
    }

    public static GsonConverterFactory create() {
        return create(new C10916e());
    }

    @Override // io.intercom.retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.m11959l(C11058a.m11660b(type)));
    }

    @Override // io.intercom.retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.m11959l(C11058a.m11660b(type)));
    }

    public static GsonConverterFactory create(C10916e c10916e) {
        if (c10916e != null) {
            return new GsonConverterFactory(c10916e);
        }
        throw new NullPointerException("gson == null");
    }
}
