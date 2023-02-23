package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.n */
/* loaded from: classes3.dex */
final class C13471n {

    /* renamed from: a */
    public static final C13471n f29826a = new C13471n();

    private C13471n() {
    }

    /* renamed from: a */
    public final String m4900a(Constructor<?> constructor) {
        l.f(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        l.e(parameterTypes, "constructor.parameterTypes");
        int length = parameterTypes.length;
        int i = 0;
        while (i < length) {
            Class<?> cls = parameterTypes[i];
            i++;
            l.e(cls, "parameterType");
            sb.append(C13474b.m4892b(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        l.e(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: b */
    public final String m4899b(Field field) {
        l.f(field, "field");
        Class<?> type = field.getType();
        l.e(type, "field.type");
        return C13474b.m4892b(type);
    }

    /* renamed from: c */
    public final String m4898c(Method method) {
        l.f(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        l.e(parameterTypes, "method.parameterTypes");
        int length = parameterTypes.length;
        int i = 0;
        while (i < length) {
            Class<?> cls = parameterTypes[i];
            i++;
            l.e(cls, "parameterType");
            sb.append(C13474b.m4892b(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        l.e(returnType, "method.returnType");
        sb.append(C13474b.m4892b(returnType));
        String sb2 = sb.toString();
        l.e(sb2, "sb.toString()");
        return sb2;
    }
}
