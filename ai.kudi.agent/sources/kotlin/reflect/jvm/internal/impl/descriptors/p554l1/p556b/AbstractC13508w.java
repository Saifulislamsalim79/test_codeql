package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12295x;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
/* compiled from: ReflectJavaType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.w */
/* loaded from: classes3.dex */
public abstract class AbstractC13508w implements InterfaceC12295x {

    /* renamed from: a */
    public static final C13509a f29866a = new C13509a(null);

    /* compiled from: ReflectJavaType.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.w$a */
    /* loaded from: classes3.dex */
    public static final class C13509a {
        private C13509a() {
        }

        public /* synthetic */ C13509a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13508w m4789a(Type type) {
            AbstractC13508w c13485i;
            l.f(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C13507v(cls);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z || !((Class) type).isArray())) {
                c13485i = type instanceof WildcardType ? new C13512z((WildcardType) type) : new C13496l(type);
            } else {
                c13485i = new C13485i(type);
            }
            return c13485i;
        }
    }

    /* renamed from: Z */
    protected abstract Type mo4774Z();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC13508w) && l.b(mo4774Z(), ((AbstractC13508w) obj).mo4774Z());
    }

    public int hashCode() {
        return mo4774Z().hashCode();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: r */
    public InterfaceC12265a mo4777r(C12609c c12609c) {
        return InterfaceC12295x.C12296a.m9263a(this, c12609c);
    }

    public String toString() {
        return getClass().getName() + ": " + mo4774Z();
    }
}
