package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.List;
import kotlin.C13287o;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12671c;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13397f;
/* compiled from: JavaClassConstructorDescriptor.java */
/* renamed from: kotlin.j0.o.c.p0.d.a.c0.b */
/* loaded from: classes3.dex */
public class C12150b extends C13397f implements InterfaceC12149a {

    /* renamed from: X */
    private Boolean f27098X;

    /* renamed from: Y */
    private Boolean f27099Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C12150b(InterfaceC13312e interfaceC13312e, C12150b c12150b, InterfaceC13346g interfaceC13346g, boolean z, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13312e, c12150b, interfaceC13346g, z, enumC13301a, interfaceC13545u0);
        if (interfaceC13312e == null) {
            m9602N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m9602N(1);
            throw null;
        } else if (enumC13301a == null) {
            m9602N(2);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f27098X = null;
            this.f27099Y = null;
        } else {
            m9602N(3);
            throw null;
        }
    }

    /* renamed from: D1 */
    public static C12150b m9605D1(InterfaceC13312e interfaceC13312e, InterfaceC13346g interfaceC13346g, boolean z, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13312e == null) {
            m9602N(4);
            throw null;
        } else if (interfaceC13346g == null) {
            m9602N(5);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C12150b(interfaceC13312e, null, interfaceC13346g, z, InterfaceC13300b.EnumC13301a.DECLARATION, interfaceC13545u0);
        } else {
            m9602N(6);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m9602N(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: C1 */
    protected C12150b m9606C1(InterfaceC13312e interfaceC13312e, C12150b c12150b, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0, InterfaceC13346g interfaceC13346g) {
        if (interfaceC13312e == null) {
            m9602N(12);
            throw null;
        } else if (enumC13301a == null) {
            m9602N(13);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m9602N(14);
            throw null;
        } else if (interfaceC13346g != null) {
            return new C12150b(interfaceC13312e, c12150b, interfaceC13346g, this.f29662V, enumC13301a, interfaceC13545u0);
        } else {
            m9602N(15);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13397f
    /* renamed from: E1 */
    public C12150b mo5185y1(InterfaceC13513m interfaceC13513m, InterfaceC13554x interfaceC13554x, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13346g interfaceC13346g, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13513m == null) {
            m9602N(7);
            throw null;
        } else if (enumC13301a == null) {
            m9602N(8);
            throw null;
        } else if (interfaceC13346g == null) {
            m9602N(9);
            throw null;
        } else if (interfaceC13545u0 != null) {
            if (enumC13301a != InterfaceC13300b.EnumC13301a.DECLARATION && enumC13301a != InterfaceC13300b.EnumC13301a.SYNTHESIZED) {
                throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC13513m + "\nkind: " + enumC13301a);
            }
            C12150b m9606C1 = m9606C1((InterfaceC13312e) interfaceC13513m, (C12150b) interfaceC13554x, enumC13301a, interfaceC13545u0, interfaceC13346g);
            m9606C1.mo5073j1(mo5081b1());
            m9606C1.mo5071k1(mo5091M());
            if (m9606C1 != null) {
                return m9606C1;
            }
            m9602N(11);
            throw null;
        } else {
            m9602N(10);
            throw null;
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.InterfaceC12149a
    /* renamed from: F1 */
    public C12150b mo9594D(AbstractC12965b0 abstractC12965b0, List<C12159i> list, AbstractC12965b0 abstractC12965b02, C13287o<InterfaceC13293a.InterfaceC13294a<?>, ?> c13287o) {
        if (list == null) {
            m9602N(16);
            throw null;
        } else if (abstractC12965b02 != null) {
            C12150b mo5185y1 = mo5185y1(mo4687d(), null, mo5057w(), null, mo4956y(), mo4745m());
            mo5185y1.mo5080c1(abstractC12965b0 == null ? null : C12671c.m7057f(mo5185y1, abstractC12965b0, InterfaceC13346g.f29516s.m5317b()), mo5066p0(), mo4942l(), C12158h.m9591a(list, mo5072k(), mo5185y1), abstractC12965b02, mo4658o(), mo4659i());
            if (c13287o != null) {
                mo5185y1.m5077f1(c13287o.m5364c(), c13287o.m5363d());
            }
            if (mo5185y1 != null) {
                return mo5185y1;
            }
            m9602N(18);
            throw null;
        } else {
            m9602N(17);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: M */
    public boolean mo5091M() {
        return this.f27099Y.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: b1 */
    public boolean mo5081b1() {
        return this.f27098X.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: j1 */
    public void mo5073j1(boolean z) {
        this.f27098X = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: k1 */
    public void mo5071k1(boolean z) {
        this.f27099Y = Boolean.valueOf(z);
    }
}
