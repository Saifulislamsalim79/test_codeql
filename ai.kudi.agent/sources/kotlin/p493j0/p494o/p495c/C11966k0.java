package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Method;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13715n;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: RuntimeTypeMapper.kt */
/* renamed from: kotlin.j0.o.c.k0 */
/* loaded from: classes3.dex */
public final class C11966k0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.k0$a */
    /* loaded from: classes3.dex */
    public static final class C11967a extends AbstractC11802m implements InterfaceC11767l<Class<?>, CharSequence> {

        /* renamed from: c */
        public static final C11967a f26673c = new C11967a();

        C11967a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(Class<?> cls) {
            l.e(cls, "it");
            return C13474b.m4892b(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m10049b(Method method) {
        String m4044G;
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        l.e(parameterTypes, "parameterTypes");
        m4044G = C13715n.m4044G(parameterTypes, "", "(", ")", 0, null, C11967a.f26673c, 24, null);
        sb.append(m4044G);
        Class<?> returnType = method.getReturnType();
        l.e(returnType, "returnType");
        sb.append(C13474b.m4892b(returnType));
        return sb.toString();
    }
}
