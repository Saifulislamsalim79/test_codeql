package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.List;
import java.util.Map;
import kotlin.C13287o;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12671c;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.C13159i;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13400g0;
/* compiled from: JavaMethodDescriptor.java */
/* renamed from: kotlin.j0.o.c.p0.d.a.c0.e */
/* loaded from: classes3.dex */
public class C12153e extends C13400g0 implements InterfaceC12149a {

    /* renamed from: X */
    public static final InterfaceC13293a.InterfaceC13294a<InterfaceC13307c1> f27100X = new C12154a();

    /* renamed from: V */
    private EnumC12155b f27101V;

    /* renamed from: W */
    private final boolean f27102W;

    /* compiled from: JavaMethodDescriptor.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.c0.e$a */
    /* loaded from: classes3.dex */
    static class C12154a implements InterfaceC13293a.InterfaceC13294a<InterfaceC13307c1> {
        C12154a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JavaMethodDescriptor.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.c0.e$b */
    /* loaded from: classes3.dex */
    public enum EnumC12155b {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: c */
        public final boolean f27108c;

        /* renamed from: d */
        public final boolean f27109d;

        EnumC12155b(boolean z, boolean z2) {
            this.f27108c = z;
            this.f27109d = z2;
        }

        /* renamed from: a */
        private static /* synthetic */ void m9596a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        /* renamed from: b */
        public static EnumC12155b m9595b(boolean z, boolean z2) {
            EnumC12155b enumC12155b;
            if (z) {
                enumC12155b = z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                enumC12155b = z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (enumC12155b != null) {
                return enumC12155b;
            }
            m9596a(0);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C12153e(InterfaceC13513m interfaceC13513m, InterfaceC13543t0 interfaceC13543t0, InterfaceC13346g interfaceC13346g, C12614f c12614f, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0, boolean z) {
        super(interfaceC13513m, interfaceC13543t0, interfaceC13346g, c12614f, enumC13301a, interfaceC13545u0);
        if (interfaceC13513m == null) {
            m9597N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m9597N(1);
            throw null;
        } else if (c12614f == null) {
            m9597N(2);
            throw null;
        } else if (enumC13301a == null) {
            m9597N(3);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f27101V = null;
            this.f27102W = z;
        } else {
            m9597N(4);
            throw null;
        }
    }

    /* renamed from: A1 */
    public static C12153e m9601A1(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0, boolean z) {
        if (interfaceC13513m == null) {
            m9597N(5);
            throw null;
        } else if (interfaceC13346g == null) {
            m9597N(6);
            throw null;
        } else if (c12614f == null) {
            m9597N(7);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C12153e(interfaceC13513m, null, interfaceC13346g, c12614f, InterfaceC13300b.EnumC13301a.DECLARATION, interfaceC13545u0, z);
        } else {
            m9597N(8);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m9597N(int i) {
        String str = (i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 17 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 12) {
            objArr[1] = "initialize";
        } else if (i == 17) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = "initialize";
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 12 && i != 17 && i != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13400g0, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: B1 */
    public C12153e mo5086W0(InterfaceC13513m interfaceC13513m, InterfaceC13554x interfaceC13554x, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13346g interfaceC13346g, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13513m == null) {
            m9597N(13);
            throw null;
        } else if (enumC13301a == null) {
            m9597N(14);
            throw null;
        } else if (interfaceC13346g == null) {
            m9597N(15);
            throw null;
        } else if (interfaceC13545u0 != null) {
            InterfaceC13543t0 interfaceC13543t0 = (InterfaceC13543t0) interfaceC13554x;
            if (c12614f == null) {
                c12614f = mo5012b();
            }
            C12153e c12153e = new C12153e(interfaceC13513m, interfaceC13543t0, interfaceC13346g, c12614f, enumC13301a, interfaceC13545u0, this.f27102W);
            c12153e.m9598D1(mo5081b1(), mo5091M());
            return c12153e;
        } else {
            m9597N(16);
            throw null;
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.InterfaceC12149a
    /* renamed from: C1 */
    public C12153e mo9594D(AbstractC12965b0 abstractC12965b0, List<C12159i> list, AbstractC12965b0 abstractC12965b02, C13287o<InterfaceC13293a.InterfaceC13294a<?>, ?> c13287o) {
        if (list == null) {
            m9597N(18);
            throw null;
        } else if (abstractC12965b02 != null) {
            C12153e c12153e = (C12153e) mo4694A().mo4681b(C12158h.m9591a(list, mo5072k(), this)).mo4677f(abstractC12965b02).mo4673j(abstractC12965b0 == null ? null : C12671c.m7057f(this, abstractC12965b0, InterfaceC13346g.f29516s.m5317b())).mo4682a().mo4678e().build();
            if (c13287o != null) {
                c12153e.m5077f1(c13287o.m5364c(), c13287o.m5363d());
            }
            if (c12153e != null) {
                return c12153e;
            }
            m9597N(20);
            throw null;
        } else {
            m9597N(19);
            throw null;
        }
    }

    /* renamed from: D1 */
    public void m9598D1(boolean z, boolean z2) {
        this.f27101V = EnumC12155b.m9595b(z, z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: M */
    public boolean mo5091M() {
        return this.f27101V.f27109d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: b1 */
    public boolean mo5081b1() {
        return this.f27101V.f27108c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13400g0
    /* renamed from: z1 */
    public C13400g0 mo5176z1(InterfaceC13524r0 interfaceC13524r0, InterfaceC13524r0 interfaceC13524r02, List<? extends InterfaceC13562z0> list, List<InterfaceC13307c1> list2, AbstractC12965b0 abstractC12965b0, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, Map<? extends InterfaceC13293a.InterfaceC13294a<?>, ?> map) {
        if (list == null) {
            m9597N(9);
            throw null;
        } else if (list2 == null) {
            m9597N(10);
            throw null;
        } else if (abstractC13544u != null) {
            super.mo5176z1(interfaceC13524r0, interfaceC13524r02, list, list2, abstractC12965b0, enumC13560z, abstractC13544u, map);
            m5064q1(C13159i.f29243a.m5735a(this).m5733a());
            return this;
        } else {
            m9597N(11);
            throw null;
        }
    }
}
