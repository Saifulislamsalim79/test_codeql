package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.Modifier;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13321f1;
import kotlin.reflect.jvm.internal.impl.descriptors.p553k1.C13449a;
import kotlin.reflect.jvm.internal.impl.descriptors.p553k1.C13450b;
import kotlin.reflect.jvm.internal.impl.descriptors.p553k1.C13451c;
/* compiled from: ReflectJavaModifierListOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.t */
/* loaded from: classes3.dex */
public interface InterfaceC13504t extends InterfaceC12290s {

    /* compiled from: ReflectJavaModifierListOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.t$a */
    /* loaded from: classes3.dex */
    public static final class C13505a {
        /* renamed from: a */
        public static AbstractC13333g1 m4799a(InterfaceC13504t interfaceC13504t) {
            l.f(interfaceC13504t, "this");
            int mo4800K = interfaceC13504t.mo4800K();
            if (Modifier.isPublic(mo4800K)) {
                return C13321f1.C13329h.f29488c;
            }
            if (Modifier.isPrivate(mo4800K)) {
                return C13321f1.C13326e.f29485c;
            }
            if (Modifier.isProtected(mo4800K)) {
                return Modifier.isStatic(mo4800K) ? C13451c.f29807c : C13450b.f29806c;
            }
            return C13449a.f29805c;
        }

        /* renamed from: b */
        public static boolean m4798b(InterfaceC13504t interfaceC13504t) {
            l.f(interfaceC13504t, "this");
            return Modifier.isAbstract(interfaceC13504t.mo4800K());
        }

        /* renamed from: c */
        public static boolean m4797c(InterfaceC13504t interfaceC13504t) {
            l.f(interfaceC13504t, "this");
            return Modifier.isFinal(interfaceC13504t.mo4800K());
        }

        /* renamed from: d */
        public static boolean m4796d(InterfaceC13504t interfaceC13504t) {
            l.f(interfaceC13504t, "this");
            return Modifier.isStatic(interfaceC13504t.mo4800K());
        }
    }

    /* renamed from: K */
    int mo4800K();
}
