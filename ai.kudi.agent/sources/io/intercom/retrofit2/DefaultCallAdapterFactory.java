package io.intercom.retrofit2;

import io.intercom.retrofit2.CallAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DefaultCallAdapterFactory extends CallAdapter.Factory {
    static final CallAdapter.Factory INSTANCE = new DefaultCallAdapterFactory();

    DefaultCallAdapterFactory() {
    }

    @Override // io.intercom.retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        final Type callResponseType = Utils.getCallResponseType(type);
        return new CallAdapter<Object, Call<?>>() { // from class: io.intercom.retrofit2.DefaultCallAdapterFactory.1
            @Override // io.intercom.retrofit2.CallAdapter
            /* renamed from: adapt */
            public Call<?> adapt2(Call<Object> call) {
                return call;
            }

            @Override // io.intercom.retrofit2.CallAdapter
            public Type responseType() {
                return callResponseType;
            }
        };
    }
}
