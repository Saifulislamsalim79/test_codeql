package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
/* compiled from: ReflectJavaMember.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.a */
/* loaded from: classes3.dex */
final class C13472a {

    /* renamed from: a */
    public static final C13472a f29827a = new C13472a();

    /* renamed from: b */
    private static C13473a f29828b;

    /* compiled from: ReflectJavaMember.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.a$a */
    /* loaded from: classes3.dex */
    public static final class C13473a {

        /* renamed from: a */
        private final Method f29829a;

        /* renamed from: b */
        private final Method f29830b;

        public C13473a(Method method, Method method2) {
            this.f29829a = method;
            this.f29830b = method2;
        }

        /* renamed from: a */
        public final Method m4895a() {
            return this.f29830b;
        }

        /* renamed from: b */
        public final Method m4894b() {
            return this.f29829a;
        }
    }

    private C13472a() {
    }

    /* renamed from: a */
    public final C13473a m4897a(Member member) {
        l.f(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new C13473a(cls.getMethod("getParameters", new Class[0]), C13474b.m4889e(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C13473a(null, null);
        }
    }

    /* renamed from: b */
    public final List<String> m4896b(Member member) {
        Method m4895a;
        l.f(member, "member");
        C13473a c13473a = f29828b;
        if (c13473a == null) {
            c13473a = m4897a(member);
            f29828b = c13473a;
        }
        Method m4894b = c13473a.m4894b();
        if (m4894b == null || (m4895a = c13473a.m4895a()) == null) {
            return null;
        }
        Object invoke = m4894b.invoke(member, new Object[0]);
        if (invoke != null) {
            Object[] objArr = (Object[]) invoke;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object invoke2 = m4895a.invoke(obj, new Object[0]);
                if (invoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                arrayList.add((String) invoke2);
            }
            return arrayList;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<*>");
    }
}
