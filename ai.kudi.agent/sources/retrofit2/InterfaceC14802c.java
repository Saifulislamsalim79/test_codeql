package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: CallAdapter.java */
/* renamed from: retrofit2.c */
/* loaded from: classes3.dex */
public interface InterfaceC14802c<R, T> {

    /* compiled from: CallAdapter.java */
    /* renamed from: retrofit2.c$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14803a {
        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: b */
        public static Type m329b(int i, ParameterizedType parameterizedType) {
            return C14846o.m233h(i, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: c */
        public static Class<?> m328c(Type type) {
            return C14846o.m232i(type);
        }

        /* renamed from: a */
        public abstract InterfaceC14802c<?, ?> mo325a(Type type, Annotation[] annotationArr, C14841m c14841m);
    }

    /* renamed from: a */
    T mo324a(InterfaceC14801b<R> interfaceC14801b);

    Type responseType();
}
