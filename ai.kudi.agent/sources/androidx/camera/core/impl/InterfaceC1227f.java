package androidx.camera.core.impl;

import java.util.Set;
/* compiled from: Config.java */
/* renamed from: androidx.camera.core.impl.f */
/* loaded from: classes2.dex */
public interface InterfaceC1227f {

    /* compiled from: Config.java */
    /* renamed from: androidx.camera.core.impl.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1228a<T> {
        /* renamed from: a */
        public static <T> AbstractC1228a<T> m36725a(String str, Class<?> cls) {
            return m36724b(str, cls, null);
        }

        /* renamed from: b */
        public static <T> AbstractC1228a<T> m36724b(String str, Class<?> cls, Object obj) {
            return new C1223b(str, cls, obj);
        }

        /* renamed from: c */
        public abstract String mo36723c();

        /* renamed from: d */
        public abstract Object mo36722d();

        /* renamed from: e */
        public abstract Class<T> mo36721e();
    }

    /* compiled from: Config.java */
    /* renamed from: androidx.camera.core.impl.f$b */
    /* loaded from: classes2.dex */
    public enum EnumC1229b {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: b */
    <ValueT> ValueT mo36717b(AbstractC1228a<ValueT> abstractC1228a, EnumC1229b enumC1229b);

    /* renamed from: c */
    Set<AbstractC1228a<?>> mo36716c();

    /* renamed from: e */
    <ValueT> ValueT mo36715e(AbstractC1228a<ValueT> abstractC1228a, ValueT valuet);

    /* renamed from: f */
    Set<EnumC1229b> mo36714f(AbstractC1228a<?> abstractC1228a);
}
