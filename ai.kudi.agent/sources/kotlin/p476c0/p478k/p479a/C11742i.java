package kotlin.p476c0.p478k.p479a;

import java.lang.reflect.Method;
import kotlin.e0.d.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugMetadata.kt */
/* renamed from: kotlin.c0.k.a.i */
/* loaded from: classes3.dex */
public final class C11742i {

    /* renamed from: b */
    private static C11743a f26465b;

    /* renamed from: c */
    public static final C11742i f26466c = new C11742i();

    /* renamed from: a */
    private static final C11743a f26464a = new C11743a(null, null, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugMetadata.kt */
    /* renamed from: kotlin.c0.k.a.i$a */
    /* loaded from: classes3.dex */
    public static final class C11743a {

        /* renamed from: a */
        public final Method f26467a;

        /* renamed from: b */
        public final Method f26468b;

        /* renamed from: c */
        public final Method f26469c;

        public C11743a(Method method, Method method2, Method method3) {
            this.f26467a = method;
            this.f26468b = method2;
            this.f26469c = method3;
        }
    }

    private C11742i() {
    }

    /* renamed from: a */
    private final C11743a m10373a(AbstractC11735a abstractC11735a) {
        try {
            C11743a c11743a = new C11743a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC11735a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC11735a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f26465b = c11743a;
            return c11743a;
        } catch (Exception unused) {
            C11743a c11743a2 = f26464a;
            f26465b = c11743a2;
            return c11743a2;
        }
    }

    /* renamed from: b */
    public final String m10372b(AbstractC11735a abstractC11735a) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        l.f(abstractC11735a, "continuation");
        C11743a c11743a = f26465b;
        if (c11743a == null) {
            c11743a = m10373a(abstractC11735a);
        }
        if (c11743a == f26464a || (method = c11743a.f26467a) == null || (invoke = method.invoke(abstractC11735a.getClass(), new Object[0])) == null || (method2 = c11743a.f26468b) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = c11743a.f26469c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        return invoke3 instanceof String ? invoke3 : null;
    }
}
