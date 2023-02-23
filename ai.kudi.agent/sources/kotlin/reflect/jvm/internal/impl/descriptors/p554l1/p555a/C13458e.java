package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import kotlin.e0.d.l;
/* compiled from: ReflectJavaClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.e */
/* loaded from: classes3.dex */
public final class C13458e {
    /* renamed from: a */
    public static final Class<?> m4927a(ClassLoader classLoader, String str) {
        l.f(classLoader, "<this>");
        l.f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
