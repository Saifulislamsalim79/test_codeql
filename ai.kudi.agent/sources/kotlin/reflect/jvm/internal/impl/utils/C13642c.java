package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.e0.d.l;
/* compiled from: exceptionUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.c */
/* loaded from: classes3.dex */
public final class C13642c {
    /* renamed from: a */
    public static final boolean m4268a(Throwable th) {
        l.f(th, "<this>");
        Class<?> cls = th.getClass();
        while (!l.b(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final RuntimeException m4267b(Throwable th) {
        l.f(th, "e");
        throw th;
    }
}
