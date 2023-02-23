package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12064o;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12616h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13022f;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13522q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13548v0;
/* compiled from: DescriptorUtils.java */
/* renamed from: kotlin.j0.o.c.p0.i.d */
/* loaded from: classes3.dex */
public class C12673d {
    static {
        new C12609c("kotlin.jvm.JvmName");
    }

    /* renamed from: A */
    public static boolean m7047A(InterfaceC13513m interfaceC13513m) {
        return m7044D(interfaceC13513m, EnumC13319f.ENUM_CLASS);
    }

    /* renamed from: B */
    public static boolean m7046B(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            return m7044D(interfaceC13513m, EnumC13319f.ENUM_ENTRY);
        }
        m7034a(36);
        throw null;
    }

    /* renamed from: C */
    public static boolean m7045C(InterfaceC13513m interfaceC13513m) {
        return m7044D(interfaceC13513m, EnumC13319f.INTERFACE);
    }

    /* renamed from: D */
    private static boolean m7044D(InterfaceC13513m interfaceC13513m, EnumC13319f enumC13319f) {
        if (enumC13319f != null) {
            return (interfaceC13513m instanceof InterfaceC13312e) && ((InterfaceC13312e) interfaceC13513m).mo4957w() == enumC13319f;
        }
        m7034a(37);
        throw null;
    }

    /* renamed from: E */
    public static boolean m7043E(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m == null) {
            m7034a(1);
            throw null;
        }
        while (interfaceC13513m != null) {
            if (m7014u(interfaceC13513m) || m7010y(interfaceC13513m)) {
                return true;
            }
            interfaceC13513m = interfaceC13513m.mo4687d();
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m7042F(AbstractC12965b0 abstractC12965b0, InterfaceC13513m interfaceC13513m) {
        if (abstractC12965b0 == null) {
            m7034a(30);
            throw null;
        } else if (interfaceC13513m != null) {
            InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
            if (mo5206d != null) {
                InterfaceC13513m mo4651a = mo5206d.mo4651a();
                return (mo4651a instanceof InterfaceC13334h) && (interfaceC13513m instanceof InterfaceC13334h) && ((InterfaceC13334h) interfaceC13513m).mo4649n().equals(((InterfaceC13334h) mo4651a).mo4649n());
            }
            return false;
        } else {
            m7034a(31);
            throw null;
        }
    }

    /* renamed from: G */
    public static boolean m7041G(InterfaceC13513m interfaceC13513m) {
        return (m7044D(interfaceC13513m, EnumC13319f.CLASS) || m7044D(interfaceC13513m, EnumC13319f.INTERFACE)) && ((InterfaceC13312e) interfaceC13513m).mo4658o() == EnumC13560z.SEALED;
    }

    /* renamed from: H */
    public static boolean m7040H(InterfaceC13312e interfaceC13312e, InterfaceC13312e interfaceC13312e2) {
        if (interfaceC13312e == null) {
            m7034a(28);
            throw null;
        } else if (interfaceC13312e2 != null) {
            return m7039I(interfaceC13312e.mo5010x(), interfaceC13312e2.mo4651a());
        } else {
            m7034a(29);
            throw null;
        }
    }

    /* renamed from: I */
    public static boolean m7039I(AbstractC12965b0 abstractC12965b0, InterfaceC13513m interfaceC13513m) {
        if (abstractC12965b0 == null) {
            m7034a(32);
            throw null;
        } else if (interfaceC13513m != null) {
            if (m7042F(abstractC12965b0, interfaceC13513m)) {
                return true;
            }
            for (AbstractC12965b0 abstractC12965b02 : abstractC12965b0.mo5779W0().mo5218a()) {
                if (m7039I(abstractC12965b02, interfaceC13513m)) {
                    return true;
                }
            }
            return false;
        } else {
            m7034a(33);
            throw null;
        }
    }

    /* renamed from: J */
    public static boolean m7038J(InterfaceC13513m interfaceC13513m) {
        return interfaceC13513m != null && (interfaceC13513m.mo4687d() instanceof InterfaceC13320f0);
    }

    /* renamed from: K */
    public static boolean m7037K(InterfaceC13311d1 interfaceC13311d1, AbstractC12965b0 abstractC12965b0) {
        if (interfaceC13311d1 == null) {
            m7034a(63);
            throw null;
        } else if (abstractC12965b0 != null) {
            if (interfaceC13311d1.mo5093t0() || C12977d0.m6274a(abstractC12965b0)) {
                return false;
            }
            if (C12974c1.m6300b(abstractC12965b0)) {
                return true;
            }
            AbstractC12046h m6863g = C12747a.m6863g(interfaceC13311d1);
            if (!AbstractC12046h.m9877p0(abstractC12965b0) && !InterfaceC13022f.f29107a.mo6073b(m6863g.m9912V(), abstractC12965b0) && !InterfaceC13022f.f29107a.mo6073b(m6863g.m9922K().mo5010x(), abstractC12965b0) && !InterfaceC13022f.f29107a.mo6073b(m6863g.m9892i(), abstractC12965b0)) {
                C12064o c12064o = C12064o.f26891a;
                if (!C12064o.m9816d(abstractC12965b0)) {
                    return false;
                }
            }
            return true;
        } else {
            m7034a(64);
            throw null;
        }
    }

    /* renamed from: L */
    public static <D extends InterfaceC13300b> D m7036L(D d) {
        if (d != null) {
            while (d.mo5057w() == InterfaceC13300b.EnumC13301a.FAKE_OVERRIDE) {
                Collection<? extends InterfaceC13300b> mo4685g = d.mo4685g();
                if (!mo4685g.isEmpty()) {
                    d = (D) mo4685g.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
                }
            }
            if (d != null) {
                return d;
            }
            m7034a(60);
            throw null;
        }
        m7034a(59);
        throw null;
    }

    /* renamed from: M */
    public static <D extends InterfaceC13521q> D m7035M(D d) {
        if (d != null) {
            if (d instanceof InterfaceC13300b) {
                return m7036L((InterfaceC13300b) d);
            }
            if (d != null) {
                return d;
            }
            m7034a(62);
            throw null;
        }
        m7034a(61);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m7034a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: b */
    public static boolean m7033b(InterfaceC13513m interfaceC13513m, InterfaceC13513m interfaceC13513m2) {
        if (interfaceC13513m == null) {
            m7034a(16);
            throw null;
        } else if (interfaceC13513m2 != null) {
            return m7028g(interfaceC13513m).equals(m7028g(interfaceC13513m2));
        } else {
            m7034a(17);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private static <D extends InterfaceC13293a> void m7032c(D d, Set<D> set) {
        if (d == null) {
            m7034a(70);
            throw null;
        } else if (set != 0) {
            if (set.contains(d)) {
                return;
            }
            for (InterfaceC13293a interfaceC13293a : d.mo4651a().mo4685g()) {
                InterfaceC13293a mo4651a = interfaceC13293a.mo4651a();
                m7032c(mo4651a, set);
                set.add(mo4651a);
            }
        } else {
            m7034a(71);
            throw null;
        }
    }

    /* renamed from: d */
    public static <D extends InterfaceC13293a> Set<D> m7031d(D d) {
        if (d != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m7032c(d.mo4651a(), linkedHashSet);
            return linkedHashSet;
        }
        m7034a(68);
        throw null;
    }

    /* renamed from: e */
    public static InterfaceC13312e m7030e(AbstractC12965b0 abstractC12965b0) {
        if (abstractC12965b0 != null) {
            return m7029f(abstractC12965b0.mo5779W0());
        }
        m7034a(45);
        throw null;
    }

    /* renamed from: f */
    public static InterfaceC13312e m7029f(InterfaceC13125t0 interfaceC13125t0) {
        if (interfaceC13125t0 != null) {
            InterfaceC13312e interfaceC13312e = (InterfaceC13312e) interfaceC13125t0.mo5206d();
            if (interfaceC13312e != null) {
                return interfaceC13312e;
            }
            m7034a(47);
            throw null;
        }
        m7034a(46);
        throw null;
    }

    /* renamed from: g */
    public static InterfaceC13305c0 m7028g(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            InterfaceC13305c0 m7027h = m7027h(interfaceC13513m);
            if (m7027h != null) {
                return m7027h;
            }
            m7034a(22);
            throw null;
        }
        m7034a(21);
        throw null;
    }

    /* renamed from: h */
    public static InterfaceC13305c0 m7027h(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m == null) {
            m7034a(23);
            throw null;
        }
        while (interfaceC13513m != null) {
            if (interfaceC13513m instanceof InterfaceC13305c0) {
                return (InterfaceC13305c0) interfaceC13513m;
            }
            if (interfaceC13513m instanceof InterfaceC13448k0) {
                return ((InterfaceC13448k0) interfaceC13513m).mo4952E0();
            }
            interfaceC13513m = interfaceC13513m.mo4687d();
        }
        return null;
    }

    /* renamed from: i */
    public static InterfaceC13305c0 m7026i(AbstractC12965b0 abstractC12965b0) {
        if (abstractC12965b0 != null) {
            InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
            if (mo5206d == null) {
                return null;
            }
            return m7027h(mo5206d);
        }
        m7034a(20);
        throw null;
    }

    /* renamed from: j */
    public static InterfaceC13548v0 m7025j(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            if (interfaceC13513m instanceof InterfaceC13522q0) {
                interfaceC13513m = ((InterfaceC13522q0) interfaceC13513m).mo4765J0();
            }
            if (interfaceC13513m instanceof InterfaceC13519p) {
                InterfaceC13548v0 mo4706a = ((InterfaceC13519p) interfaceC13513m).mo4745m().mo4706a();
                if (mo4706a != null) {
                    return mo4706a;
                }
                m7034a(80);
                throw null;
            }
            InterfaceC13548v0 interfaceC13548v0 = InterfaceC13548v0.f29904a;
            if (interfaceC13548v0 != null) {
                return interfaceC13548v0;
            }
            m7034a(81);
            throw null;
        }
        m7034a(79);
        throw null;
    }

    /* renamed from: k */
    public static AbstractC13544u m7024k(InterfaceC13312e interfaceC13312e, boolean z) {
        if (interfaceC13312e != null) {
            EnumC13319f mo4957w = interfaceC13312e.mo4957w();
            if (mo4957w != EnumC13319f.ENUM_CLASS && !mo4957w.m5332a()) {
                if (m7041G(interfaceC13312e)) {
                    if (z) {
                        AbstractC13544u abstractC13544u = C13530t.f29890c;
                        if (abstractC13544u != null) {
                            return abstractC13544u;
                        }
                        m7034a(50);
                        throw null;
                    }
                    AbstractC13544u abstractC13544u2 = C13530t.f29888a;
                    if (abstractC13544u2 != null) {
                        return abstractC13544u2;
                    }
                    m7034a(51);
                    throw null;
                } else if (m7014u(interfaceC13312e)) {
                    AbstractC13544u abstractC13544u3 = C13530t.f29897j;
                    if (abstractC13544u3 != null) {
                        return abstractC13544u3;
                    }
                    m7034a(52);
                    throw null;
                } else {
                    AbstractC13544u abstractC13544u4 = C13530t.f29892e;
                    if (abstractC13544u4 != null) {
                        return abstractC13544u4;
                    }
                    m7034a(53);
                    throw null;
                }
            }
            AbstractC13544u abstractC13544u5 = C13530t.f29888a;
            if (abstractC13544u5 != null) {
                return abstractC13544u5;
            }
            m7034a(49);
            throw null;
        }
        m7034a(48);
        throw null;
    }

    /* renamed from: l */
    public static InterfaceC13524r0 m7023l(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            if (interfaceC13513m instanceof InterfaceC13312e) {
                return ((InterfaceC13312e) interfaceC13513m).mo5015T0();
            }
            return null;
        }
        m7034a(0);
        throw null;
    }

    /* renamed from: m */
    public static C12610d m7022m(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            C12609c m7020o = m7020o(interfaceC13513m);
            return m7020o != null ? m7020o.m7374j() : m7019p(interfaceC13513m);
        }
        m7034a(2);
        throw null;
    }

    /* renamed from: n */
    public static C12609c m7021n(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            C12609c m7020o = m7020o(interfaceC13513m);
            if (m7020o == null) {
                m7020o = m7019p(interfaceC13513m).m7361l();
            }
            if (m7020o != null) {
                return m7020o;
            }
            m7034a(4);
            throw null;
        }
        m7034a(3);
        throw null;
    }

    /* renamed from: o */
    private static C12609c m7020o(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            if (!(interfaceC13513m instanceof InterfaceC13305c0) && !C13118t.m5803r(interfaceC13513m)) {
                if (interfaceC13513m instanceof InterfaceC13448k0) {
                    return ((InterfaceC13448k0) interfaceC13513m).mo4950f();
                }
                if (interfaceC13513m instanceof InterfaceC13320f0) {
                    return ((InterfaceC13320f0) interfaceC13513m).mo4954f();
                }
                return null;
            }
            return C12609c.f28373c;
        }
        m7034a(5);
        throw null;
    }

    /* renamed from: p */
    private static C12610d m7019p(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            C12610d m7370c = m7022m(interfaceC13513m.mo4687d()).m7370c(interfaceC13513m.mo5012b());
            if (m7370c != null) {
                return m7370c;
            }
            m7034a(7);
            throw null;
        }
        m7034a(6);
        throw null;
    }

    /* renamed from: q */
    public static <D extends InterfaceC13513m> D m7018q(InterfaceC13513m interfaceC13513m, Class<D> cls) {
        if (cls != null) {
            return (D) m7017r(interfaceC13513m, cls, true);
        }
        m7034a(18);
        throw null;
    }

    /* renamed from: r */
    public static <D extends InterfaceC13513m> D m7017r(InterfaceC13513m interfaceC13513m, Class<D> cls, boolean z) {
        if (cls == null) {
            m7034a(19);
            throw null;
        } else if (interfaceC13513m == null) {
            return null;
        } else {
            if (z) {
                interfaceC13513m = (D) interfaceC13513m.mo4687d();
            }
            while (interfaceC13513m != null) {
                if (cls.isInstance(interfaceC13513m)) {
                    return (D) interfaceC13513m;
                }
                interfaceC13513m = (D) interfaceC13513m.mo4687d();
            }
            return null;
        }
    }

    /* renamed from: s */
    public static InterfaceC13312e m7016s(InterfaceC13312e interfaceC13312e) {
        if (interfaceC13312e != null) {
            for (AbstractC12965b0 abstractC12965b0 : interfaceC13312e.mo4649n().mo5218a()) {
                InterfaceC13312e m7030e = m7030e(abstractC12965b0);
                if (m7030e.mo4957w() != EnumC13319f.INTERFACE) {
                    return m7030e;
                }
            }
            return null;
        }
        m7034a(44);
        throw null;
    }

    /* renamed from: t */
    public static boolean m7015t(InterfaceC13513m interfaceC13513m) {
        return m7044D(interfaceC13513m, EnumC13319f.ANNOTATION_CLASS);
    }

    /* renamed from: u */
    public static boolean m7014u(InterfaceC13513m interfaceC13513m) {
        if (interfaceC13513m != null) {
            return m7013v(interfaceC13513m) && interfaceC13513m.mo5012b().equals(C12616h.f28387a);
        }
        m7034a(34);
        throw null;
    }

    /* renamed from: v */
    public static boolean m7013v(InterfaceC13513m interfaceC13513m) {
        return m7044D(interfaceC13513m, EnumC13319f.CLASS);
    }

    /* renamed from: w */
    public static boolean m7012w(InterfaceC13513m interfaceC13513m) {
        return m7013v(interfaceC13513m) || m7047A(interfaceC13513m);
    }

    /* renamed from: x */
    public static boolean m7011x(InterfaceC13513m interfaceC13513m) {
        return m7044D(interfaceC13513m, EnumC13319f.OBJECT) && ((InterfaceC13312e) interfaceC13513m).mo4974F();
    }

    /* renamed from: y */
    public static boolean m7010y(InterfaceC13513m interfaceC13513m) {
        return (interfaceC13513m instanceof InterfaceC13521q) && ((InterfaceC13521q) interfaceC13513m).mo4659i() == C13530t.f29893f;
    }

    /* renamed from: z */
    public static boolean m7009z(InterfaceC13312e interfaceC13312e, InterfaceC13312e interfaceC13312e2) {
        if (interfaceC13312e == null) {
            m7034a(26);
            throw null;
        } else if (interfaceC13312e2 != null) {
            for (AbstractC12965b0 abstractC12965b0 : interfaceC13312e.mo4649n().mo5218a()) {
                if (m7042F(abstractC12965b0, interfaceC13312e2.mo4651a())) {
                    return true;
                }
            }
            return false;
        } else {
            m7034a(27);
            throw null;
        }
    }
}
