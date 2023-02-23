package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p565l.AbstractC14120b0;
import p565l.AbstractC14135d0;
/* compiled from: Converter.java */
/* renamed from: retrofit2.e */
/* loaded from: classes3.dex */
public interface InterfaceC14805e<F, T> {

    /* compiled from: Converter.java */
    /* renamed from: retrofit2.e$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14806a {
        /* renamed from: a */
        public InterfaceC14805e<?, AbstractC14120b0> mo222a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C14841m c14841m) {
            return null;
        }

        /* renamed from: b */
        public InterfaceC14805e<AbstractC14135d0, ?> mo221b(Type type, Annotation[] annotationArr, C14841m c14841m) {
            return null;
        }

        /* renamed from: c */
        public InterfaceC14805e<?, String> m327c(Type type, Annotation[] annotationArr, C14841m c14841m) {
            return null;
        }
    }

    T convert(F f) throws IOException;
}
