package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.List;
import kotlin.C13287o;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.C12361t;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12671c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12949j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13371j;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13522q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13390d0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13396e0;
/* compiled from: JavaPropertyDescriptor.java */
/* renamed from: kotlin.j0.o.c.p0.d.a.c0.f */
/* loaded from: classes3.dex */
public class C12156f extends C13384c0 implements InterfaceC12149a {

    /* renamed from: S */
    private final boolean f27110S;

    /* renamed from: T */
    private final C13287o<InterfaceC13293a.InterfaceC13294a<?>, ?> f27111T;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12156f(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, boolean z, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0, InterfaceC13518o0 interfaceC13518o0, InterfaceC13300b.EnumC13301a enumC13301a, boolean z2, C13287o<InterfaceC13293a.InterfaceC13294a<?>, ?> c13287o) {
        super(interfaceC13513m, interfaceC13518o0, interfaceC13346g, enumC13560z, abstractC13544u, z, c12614f, enumC13301a, interfaceC13545u0, false, false, false, false, false, false);
        if (interfaceC13513m == null) {
            m9593N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m9593N(1);
            throw null;
        } else if (enumC13560z == null) {
            m9593N(2);
            throw null;
        } else if (abstractC13544u == null) {
            m9593N(3);
            throw null;
        } else if (c12614f == null) {
            m9593N(4);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m9593N(5);
            throw null;
        } else if (enumC13301a != null) {
            this.f27110S = z2;
            this.f27111T = c13287o;
        } else {
            m9593N(6);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m9593N(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: m1 */
    public static C12156f m9592m1(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, boolean z, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0, boolean z2) {
        if (interfaceC13513m == null) {
            m9593N(7);
            throw null;
        } else if (interfaceC13346g == null) {
            m9593N(8);
            throw null;
        } else if (enumC13560z == null) {
            m9593N(9);
            throw null;
        } else if (abstractC13544u == null) {
            m9593N(10);
            throw null;
        } else if (c12614f == null) {
            m9593N(11);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C12156f(interfaceC13513m, interfaceC13346g, enumC13560z, abstractC13544u, z, c12614f, interfaceC13545u0, null, InterfaceC13300b.EnumC13301a.DECLARATION, z2, null);
        } else {
            m9593N(12);
            throw null;
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.InterfaceC12149a
    /* renamed from: D */
    public InterfaceC12149a mo9594D(AbstractC12965b0 abstractC12965b0, List<C12159i> list, AbstractC12965b0 abstractC12965b02, C13287o<InterfaceC13293a.InterfaceC13294a<?>, ?> c13287o) {
        C13390d0 c13390d0;
        C13396e0 c13396e0;
        if (list == null) {
            m9593N(19);
            throw null;
        } else if (abstractC12965b02 != null) {
            InterfaceC13518o0 mo4651a = mo4651a() == this ? null : mo4651a();
            C12156f c12156f = new C12156f(mo4687d(), mo4956y(), mo4658o(), mo4659i(), mo5093t0(), mo5012b(), mo4745m(), mo4651a, mo5057w(), this.f27110S, c13287o);
            C13390d0 mo4747q = mo4747q();
            if (mo4747q != null) {
                c13390d0 = r15;
                C13390d0 c13390d02 = new C13390d0(c12156f, mo4747q.mo4956y(), mo4747q.mo4658o(), mo4747q.mo4659i(), mo4747q.mo4764d0(), mo4747q.mo4662E(), mo4747q.mo4683z(), mo5057w(), mo4651a == null ? null : mo4651a.mo4747q(), mo4747q.mo4745m());
                c13390d0.m5271Y0(mo4747q.mo4684n0());
                c13390d0.m5213b1(abstractC12965b02);
            } else {
                c13390d0 = null;
            }
            InterfaceC13522q0 mo4748i0 = mo4748i0();
            if (mo4748i0 != null) {
                C13396e0 c13396e02 = new C13396e0(c12156f, mo4748i0.mo4956y(), mo4748i0.mo4658o(), mo4748i0.mo4659i(), mo4748i0.mo4764d0(), mo4748i0.mo4662E(), mo4748i0.mo4683z(), mo5057w(), mo4651a == null ? null : mo4651a.mo4748i0(), mo4748i0.mo4745m());
                c13396e02.m5271Y0(c13396e02.mo4684n0());
                c13396e02.m5192c1(mo4748i0.mo5072k().get(0));
                c13396e0 = c13396e02;
            } else {
                c13396e0 = null;
            }
            c12156f.m5256f1(c13390d0, c13396e0, mo4750A0(), mo4746x0());
            c12156f.m5252j1(m5255g1());
            InterfaceC12949j<AbstractC12712g<?>> interfaceC12949j = this.f29712y;
            if (interfaceC12949j != null) {
                c12156f.m5095V0(interfaceC12949j);
            }
            c12156f.mo5092H0(mo4685g());
            c12156f.m5251k1(abstractC12965b02, mo4942l(), mo5066p0(), abstractC12965b0 == null ? null : C12671c.m7057f(this, abstractC12965b0, InterfaceC13346g.f29516s.m5317b()));
            return c12156f;
        } else {
            m9593N(20);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1
    /* renamed from: G */
    public boolean mo5124G() {
        AbstractC12965b0 mo5121c = mo5121c();
        return this.f27110S && C13371j.m5285a(mo5121c) && (!C12361t.m9123i(mo5121c) || AbstractC12046h.m9871s0(mo5121c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: M */
    public boolean mo5091M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0
    /* renamed from: Z0 */
    protected C13384c0 mo5262Z0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13518o0 interfaceC13518o0, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13513m == null) {
            m9593N(13);
            throw null;
        } else if (enumC13560z == null) {
            m9593N(14);
            throw null;
        } else if (abstractC13544u == null) {
            m9593N(15);
            throw null;
        } else if (enumC13301a == null) {
            m9593N(16);
            throw null;
        } else if (c12614f == null) {
            m9593N(17);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C12156f(interfaceC13513m, mo4956y(), enumC13560z, abstractC13544u, mo5093t0(), c12614f, interfaceC13545u0, interfaceC13518o0, enumC13301a, this.f27110S, this.f27111T);
        } else {
            m9593N(18);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: s0 */
    public <V> V mo5062s0(InterfaceC13293a.InterfaceC13294a<V> interfaceC13294a) {
        C13287o<InterfaceC13293a.InterfaceC13294a<?>, ?> c13287o = this.f27111T;
        if (c13287o == null || !c13287o.m5364c().equals(interfaceC13294a)) {
            return null;
        }
        return (V) this.f27111T.m5363d();
    }
}
