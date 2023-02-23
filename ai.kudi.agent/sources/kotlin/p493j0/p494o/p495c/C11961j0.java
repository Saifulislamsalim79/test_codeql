package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Method;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.AbstractC11890d;
import kotlin.p493j0.p494o.p495c.AbstractC11900e;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.EnumC12052i;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12076a;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12080c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12385u;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12389y;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.C12150b;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.C12153e;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.C12156f;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p510e0.InterfaceC12260a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12282l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12458t;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12513d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12531i;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12497g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12596e;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12671c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12677f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.C12872j;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12823b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13520p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13522q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13486j;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13497m;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13500p;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13503s;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC13601o;
/* compiled from: RuntimeTypeMapper.kt */
/* renamed from: kotlin.j0.o.c.j0 */
/* loaded from: classes3.dex */
public final class C11961j0 {

    /* renamed from: a */
    private static final C12608b f26661a;

    /* renamed from: b */
    public static final C11961j0 f26662b = new C11961j0();

    static {
        C12608b m7384m = C12608b.m7384m(new C12609c("java.lang.Void"));
        l.e(m7384m, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        f26661a = m7384m;
    }

    private C11961j0() {
    }

    /* renamed from: a */
    private final EnumC12052i m10071a(Class<?> cls) {
        if (cls.isPrimitive()) {
            EnumC12757e m6828b = EnumC12757e.m6828b(cls.getSimpleName());
            l.e(m6828b, "JvmPrimitiveType.get(simpleName)");
            return m6828b.m6824i();
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m10070b(InterfaceC13554x interfaceC13554x) {
        if (C12671c.m7050m(interfaceC13554x) || C12671c.m7049n(interfaceC13554x)) {
            return true;
        }
        return l.b(interfaceC13554x.mo5012b(), C12076a.f26921e.m9784a()) && interfaceC13554x.mo5072k().isEmpty();
    }

    /* renamed from: d */
    private final AbstractC11890d.C11898e m10068d(InterfaceC13554x interfaceC13554x) {
        return new AbstractC11890d.C11898e(new AbstractC12491d.C12493b(m10067e(interfaceC13554x), C12458t.m8857c(interfaceC13554x, false, false, 1, null)));
    }

    /* renamed from: e */
    private final String m10067e(InterfaceC13300b interfaceC13300b) {
        String m9055b = C12389y.m9055b(interfaceC13300b);
        if (m9055b != null) {
            return m9055b;
        }
        if (interfaceC13300b instanceof InterfaceC13520p0) {
            String m7353b = C12747a.m6855o(interfaceC13300b).mo5012b().m7353b();
            l.e(m7353b, "descriptor.propertyIfAccessor.name.asString()");
            return C12385u.m9080a(m7353b);
        } else if (interfaceC13300b instanceof InterfaceC13522q0) {
            String m7353b2 = C12747a.m6855o(interfaceC13300b).mo5012b().m7353b();
            l.e(m7353b2, "descriptor.propertyIfAccessor.name.asString()");
            return C12385u.m9077d(m7353b2);
        } else {
            String m7353b3 = interfaceC13300b.mo5012b().m7353b();
            l.e(m7353b3, "descriptor.name.asString()");
            return m7353b3;
        }
    }

    /* renamed from: c */
    public final C12608b m10069c(Class<?> cls) {
        l.f(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            l.e(componentType, "klass.componentType");
            EnumC12052i m10071a = m10071a(componentType);
            if (m10071a != null) {
                return new C12608b(C12059k.f26808k, m10071a.m9850e());
            }
            C12608b m7384m = C12608b.m7384m(C12059k.C12060a.f26853h.m7361l());
            l.e(m7384m, "ClassId.topLevel(Standar…s.FqNames.array.toSafe())");
            return m7384m;
        } else if (l.b(cls, Void.TYPE)) {
            return f26661a;
        } else {
            EnumC12052i m10071a2 = m10071a(cls);
            if (m10071a2 != null) {
                return new C12608b(C12059k.f26808k, m10071a2.m9848h());
            }
            C12608b m4893a = C13474b.m4893a(cls);
            if (!m4893a.m7386k()) {
                C12080c c12080c = C12080c.f26925a;
                C12609c m7395b = m4893a.m7395b();
                l.e(m7395b, "classId.asSingleFqName()");
                C12608b m9767n = c12080c.m9767n(m7395b);
                if (m9767n != null) {
                    return m9767n;
                }
            }
            return m4893a;
        }
    }

    /* renamed from: f */
    public final AbstractC11900e m10066f(InterfaceC13518o0 interfaceC13518o0) {
        l.f(interfaceC13518o0, "possiblyOverriddenProperty");
        InterfaceC13300b m7036L = C12673d.m7036L(interfaceC13518o0);
        l.e(m7036L, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
        InterfaceC13518o0 mo4651a = ((InterfaceC13518o0) m7036L).mo4651a();
        l.e(mo4651a, "DescriptorUtils.unwrapFa…rriddenProperty).original");
        if (mo4651a instanceof C12872j) {
            C12872j c12872j = (C12872j) mo4651a;
            C12542n mo6548K = c12872j.mo6548K();
            AbstractC13580h.C13587f<C12542n, C12470a.C12478d> c13587f = C12470a.f27655d;
            l.e(c13587f, "JvmProtoBuf.propertySignature");
            C12470a.C12478d c12478d = (C12470a.C12478d) C12596e.m7430a(mo6548K, c13587f);
            if (c12478d != null) {
                return new AbstractC11900e.C11903c(mo4651a, mo6548K, c12478d, c12872j.mo6540j0(), c12872j.mo6544b0());
            }
        } else if (mo4651a instanceof C12156f) {
            InterfaceC13545u0 mo4745m = ((C12156f) mo4651a).mo4745m();
            if (!(mo4745m instanceof InterfaceC12260a)) {
                mo4745m = null;
            }
            InterfaceC12260a interfaceC12260a = (InterfaceC12260a) mo4745m;
            InterfaceC12282l mo4902b = interfaceC12260a != null ? interfaceC12260a.mo4902b() : null;
            if (mo4902b instanceof C13500p) {
                return new AbstractC11900e.C11901a(((C13500p) mo4902b).mo4807c0());
            }
            if (mo4902b instanceof C13503s) {
                Method mo4807c0 = ((C13503s) mo4902b).mo4807c0();
                InterfaceC13522q0 mo4748i0 = mo4651a.mo4748i0();
                InterfaceC13545u0 mo4745m2 = mo4748i0 != null ? mo4748i0.mo4745m() : null;
                if (!(mo4745m2 instanceof InterfaceC12260a)) {
                    mo4745m2 = null;
                }
                InterfaceC12260a interfaceC12260a2 = (InterfaceC12260a) mo4745m2;
                InterfaceC12282l mo4902b2 = interfaceC12260a2 != null ? interfaceC12260a2.mo4902b() : null;
                if (!(mo4902b2 instanceof C13503s)) {
                    mo4902b2 = null;
                }
                C13503s c13503s = (C13503s) mo4902b2;
                return new AbstractC11900e.C11902b(mo4807c0, c13503s != null ? c13503s.mo4807c0() : null);
            }
            throw new C11899d0("Incorrect resolution sequence for Java field " + mo4651a + " (source = " + mo4902b + ')');
        }
        InterfaceC13520p0 mo4747q = mo4651a.mo4747q();
        l.d(mo4747q);
        AbstractC11890d.C11898e m10068d = m10068d(mo4747q);
        InterfaceC13522q0 mo4748i02 = mo4651a.mo4748i0();
        return new AbstractC11900e.C11904d(m10068d, mo4748i02 != null ? m10068d(mo4748i02) : null);
    }

    /* renamed from: g */
    public final AbstractC11890d m10065g(InterfaceC13554x interfaceC13554x) {
        Method mo4807c0;
        AbstractC12491d.C12493b m8639b;
        AbstractC12491d.C12493b m8636e;
        l.f(interfaceC13554x, "possiblySubstitutedFunction");
        InterfaceC13300b m7036L = C12673d.m7036L(interfaceC13554x);
        l.e(m7036L, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
        InterfaceC13554x mo4651a = ((InterfaceC13554x) m7036L).mo4651a();
        l.e(mo4651a, "DescriptorUtils.unwrapFa…titutedFunction).original");
        if (mo4651a instanceof InterfaceC12823b) {
            InterfaceC12823b interfaceC12823b = (InterfaceC12823b) mo4651a;
            InterfaceC13601o mo6548K = interfaceC12823b.mo6548K();
            if ((mo6548K instanceof C12531i) && (m8636e = C12497g.f27759a.m8636e((C12531i) mo6548K, interfaceC12823b.mo6540j0(), interfaceC12823b.mo6544b0())) != null) {
                return new AbstractC11890d.C11898e(m8636e);
            }
            if ((mo6548K instanceof C12513d) && (m8639b = C12497g.f27759a.m8639b((C12513d) mo6548K, interfaceC12823b.mo6540j0(), interfaceC12823b.mo6544b0())) != null) {
                InterfaceC13513m mo4687d = interfaceC13554x.mo4687d();
                l.e(mo4687d, "possiblySubstitutedFunction.containingDeclaration");
                if (C12677f.m7005b(mo4687d)) {
                    return new AbstractC11890d.C11898e(m8639b);
                }
                return new AbstractC11890d.C11897d(m8639b);
            }
            return m10068d(mo4651a);
        }
        if (mo4651a instanceof C12153e) {
            InterfaceC13545u0 mo4745m = ((C12153e) mo4651a).mo4745m();
            if (!(mo4745m instanceof InterfaceC12260a)) {
                mo4745m = null;
            }
            InterfaceC12260a interfaceC12260a = (InterfaceC12260a) mo4745m;
            InterfaceC12282l mo4902b = interfaceC12260a != null ? interfaceC12260a.mo4902b() : null;
            C13503s c13503s = (C13503s) (mo4902b instanceof C13503s ? mo4902b : null);
            if (c13503s != null && (mo4807c0 = c13503s.mo4807c0()) != null) {
                return new AbstractC11890d.C11896c(mo4807c0);
            }
            throw new C11899d0("Incorrect resolution sequence for Java method " + mo4651a);
        } else if (mo4651a instanceof C12150b) {
            InterfaceC13545u0 mo4745m2 = ((C12150b) mo4651a).mo4745m();
            if (!(mo4745m2 instanceof InterfaceC12260a)) {
                mo4745m2 = null;
            }
            InterfaceC12260a interfaceC12260a2 = (InterfaceC12260a) mo4745m2;
            InterfaceC12282l mo4902b2 = interfaceC12260a2 != null ? interfaceC12260a2.mo4902b() : null;
            if (mo4902b2 instanceof C13497m) {
                return new AbstractC11890d.C11894b(((C13497m) mo4902b2).mo4807c0());
            }
            if (mo4902b2 instanceof C13486j) {
                C13486j c13486j = (C13486j) mo4902b2;
                if (c13486j.mo4842w()) {
                    return new AbstractC11890d.C11891a(c13486j.mo4788C());
                }
            }
            throw new C11899d0("Incorrect resolution sequence for Java constructor " + mo4651a + " (" + mo4902b2 + ')');
        } else if (m10070b(mo4651a)) {
            return m10068d(mo4651a);
        } else {
            throw new C11899d0("Unknown origin of " + mo4651a + " (" + mo4651a.getClass() + ')');
        }
    }
}
