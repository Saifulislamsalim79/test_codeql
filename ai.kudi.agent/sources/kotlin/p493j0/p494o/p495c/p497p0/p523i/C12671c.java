package kotlin.p493j0.p494o.p495c.p497p0.p523i;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Collections;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.C12795b;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13390d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13396e0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13397f;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13398f0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13400g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13412l0;
/* compiled from: DescriptorFactory.java */
/* renamed from: kotlin.j0.o.c.p0.i.c */
/* loaded from: classes3.dex */
public class C12671c {

    /* compiled from: DescriptorFactory.java */
    /* renamed from: kotlin.j0.o.c.p0.i.c$a */
    /* loaded from: classes3.dex */
    private static class C12672a extends C13397f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12672a(InterfaceC13312e interfaceC13312e, InterfaceC13545u0 interfaceC13545u0, boolean z) {
            super(interfaceC13312e, null, InterfaceC13346g.f29516s.m5317b(), true, InterfaceC13300b.EnumC13301a.DECLARATION, interfaceC13545u0);
            if (interfaceC13312e == null) {
                m7048N(0);
                throw null;
            } else if (interfaceC13545u0 != null) {
                m5191A1(Collections.emptyList(), C12673d.m7024k(interfaceC13312e, z));
            } else {
                m7048N(1);
                throw null;
            }
        }

        /* renamed from: N */
        private static /* synthetic */ void m7048N(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m7062a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    public static C13390d0 m7061b(InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g) {
        if (interfaceC13518o0 == null) {
            m7062a(13);
            throw null;
        } else if (interfaceC13346g != null) {
            return m7056g(interfaceC13518o0, interfaceC13346g, true, false, false);
        } else {
            m7062a(14);
            throw null;
        }
    }

    /* renamed from: c */
    public static C13396e0 m7060c(InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, InterfaceC13346g interfaceC13346g2) {
        if (interfaceC13518o0 == null) {
            m7062a(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m7062a(1);
            throw null;
        } else if (interfaceC13346g2 != null) {
            return m7052k(interfaceC13518o0, interfaceC13346g, interfaceC13346g2, true, false, false, interfaceC13518o0.mo4745m());
        } else {
            m7062a(2);
            throw null;
        }
    }

    /* renamed from: d */
    public static InterfaceC13543t0 m7059d(InterfaceC13312e interfaceC13312e) {
        if (interfaceC13312e != null) {
            C13400g0 m5179w1 = C13400g0.m5179w1(interfaceC13312e, InterfaceC13346g.f29516s.m5317b(), C12059k.f26800c, InterfaceC13300b.EnumC13301a.SYNTHESIZED, interfaceC13312e.mo4745m());
            C13400g0 mo5080c1 = m5179w1.mo5080c1(null, null, Collections.emptyList(), Collections.singletonList(new C13412l0(m5179w1, null, 0, InterfaceC13346g.f29516s.m5317b(), C12614f.m7349i("value"), C12747a.m6863g(interfaceC13312e).m9912V(), false, false, false, null, interfaceC13312e.mo4745m())), interfaceC13312e.mo5010x(), EnumC13560z.FINAL, C13530t.f29892e);
            if (mo5080c1 != null) {
                return mo5080c1;
            }
            m7062a(25);
            throw null;
        }
        m7062a(24);
        throw null;
    }

    /* renamed from: e */
    public static InterfaceC13543t0 m7058e(InterfaceC13312e interfaceC13312e) {
        if (interfaceC13312e != null) {
            C13400g0 mo5080c1 = C13400g0.m5179w1(interfaceC13312e, InterfaceC13346g.f29516s.m5317b(), C12059k.f26799b, InterfaceC13300b.EnumC13301a.SYNTHESIZED, interfaceC13312e.mo4745m()).mo5080c1(null, null, Collections.emptyList(), Collections.emptyList(), C12747a.m6863g(interfaceC13312e).m9886l(EnumC13008h1.INVARIANT, interfaceC13312e.mo5010x()), EnumC13560z.FINAL, C13530t.f29892e);
            if (mo5080c1 != null) {
                return mo5080c1;
            }
            m7062a(23);
            throw null;
        }
        m7062a(22);
        throw null;
    }

    /* renamed from: f */
    public static InterfaceC13524r0 m7057f(InterfaceC13293a interfaceC13293a, AbstractC12965b0 abstractC12965b0, InterfaceC13346g interfaceC13346g) {
        if (interfaceC13293a == null) {
            m7062a(29);
            throw null;
        } else if (interfaceC13346g == null) {
            m7062a(30);
            throw null;
        } else if (abstractC12965b0 == null) {
            return null;
        } else {
            return new C13398f0(interfaceC13293a, new C12795b(interfaceC13293a, abstractC12965b0, null), interfaceC13346g);
        }
    }

    /* renamed from: g */
    public static C13390d0 m7056g(InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, boolean z, boolean z2, boolean z3) {
        if (interfaceC13518o0 == null) {
            m7062a(15);
            throw null;
        } else if (interfaceC13346g != null) {
            return m7055h(interfaceC13518o0, interfaceC13346g, z, z2, z3, interfaceC13518o0.mo4745m());
        } else {
            m7062a(16);
            throw null;
        }
    }

    /* renamed from: h */
    public static C13390d0 m7055h(InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, boolean z, boolean z2, boolean z3, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13518o0 == null) {
            m7062a(17);
            throw null;
        } else if (interfaceC13346g == null) {
            m7062a(18);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C13390d0(interfaceC13518o0, interfaceC13346g, interfaceC13518o0.mo4658o(), interfaceC13518o0.mo4659i(), z, z2, z3, InterfaceC13300b.EnumC13301a.DECLARATION, null, interfaceC13545u0);
        } else {
            m7062a(19);
            throw null;
        }
    }

    /* renamed from: i */
    public static C13397f m7054i(InterfaceC13312e interfaceC13312e, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13312e == null) {
            m7062a(20);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C12672a(interfaceC13312e, interfaceC13545u0, false);
        } else {
            m7062a(21);
            throw null;
        }
    }

    /* renamed from: j */
    public static C13396e0 m7053j(InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, InterfaceC13346g interfaceC13346g2, boolean z, boolean z2, boolean z3, AbstractC13544u abstractC13544u, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13518o0 == null) {
            m7062a(7);
            throw null;
        } else if (interfaceC13346g == null) {
            m7062a(8);
            throw null;
        } else if (interfaceC13346g2 == null) {
            m7062a(9);
            throw null;
        } else if (abstractC13544u == null) {
            m7062a(10);
            throw null;
        } else if (interfaceC13545u0 != null) {
            C13396e0 c13396e0 = new C13396e0(interfaceC13518o0, interfaceC13346g, interfaceC13518o0.mo4658o(), abstractC13544u, z, z2, z3, InterfaceC13300b.EnumC13301a.DECLARATION, null, interfaceC13545u0);
            c13396e0.m5192c1(C13396e0.m5194a1(c13396e0, interfaceC13518o0.mo5121c(), interfaceC13346g2));
            return c13396e0;
        } else {
            m7062a(11);
            throw null;
        }
    }

    /* renamed from: k */
    public static C13396e0 m7052k(InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, InterfaceC13346g interfaceC13346g2, boolean z, boolean z2, boolean z3, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13518o0 == null) {
            m7062a(3);
            throw null;
        } else if (interfaceC13346g == null) {
            m7062a(4);
            throw null;
        } else if (interfaceC13346g2 == null) {
            m7062a(5);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return m7053j(interfaceC13518o0, interfaceC13346g, interfaceC13346g2, z, z2, z3, interfaceC13518o0.mo4659i(), interfaceC13545u0);
        } else {
            m7062a(6);
            throw null;
        }
    }

    /* renamed from: l */
    private static boolean m7051l(InterfaceC13554x interfaceC13554x) {
        if (interfaceC13554x != null) {
            return interfaceC13554x.mo5057w() == InterfaceC13300b.EnumC13301a.SYNTHESIZED && C12673d.m7047A(interfaceC13554x.mo4687d());
        }
        m7062a(28);
        throw null;
    }

    /* renamed from: m */
    public static boolean m7050m(InterfaceC13554x interfaceC13554x) {
        if (interfaceC13554x != null) {
            return interfaceC13554x.mo5012b().equals(C12059k.f26800c) && m7051l(interfaceC13554x);
        }
        m7062a(27);
        throw null;
    }

    /* renamed from: n */
    public static boolean m7049n(InterfaceC13554x interfaceC13554x) {
        if (interfaceC13554x != null) {
            return interfaceC13554x.mo5012b().equals(C12059k.f26799b) && m7051l(interfaceC13554x);
        }
        m7062a(26);
        throw null;
    }
}
