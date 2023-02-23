package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
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
/* compiled from: SimpleFunctionDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.g0 */
/* loaded from: classes3.dex */
public class C13400g0 extends AbstractC13426p implements InterfaceC13543t0 {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13400g0(InterfaceC13513m interfaceC13513m, InterfaceC13543t0 interfaceC13543t0, InterfaceC13346g interfaceC13346g, C12614f c12614f, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13513m, interfaceC13543t0, interfaceC13346g, c12614f, enumC13301a, interfaceC13545u0);
        if (interfaceC13513m == null) {
            m5181N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5181N(1);
            throw null;
        } else if (c12614f == null) {
            m5181N(2);
            throw null;
        } else if (enumC13301a == null) {
            m5181N(3);
            throw null;
        } else if (interfaceC13545u0 != null) {
        } else {
            m5181N(4);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5181N(int i) {
        String str = (i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 21:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 20:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 22:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "visibility";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 19:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 17) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "getOriginal";
        } else if (i == 23) {
            objArr[1] = "copy";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 13 && i != 17 && i != 18 && i != 23 && i != 24) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: w1 */
    public static C13400g0 m5179w1(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, C12614f c12614f, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13513m == null) {
            m5181N(5);
            throw null;
        } else if (interfaceC13346g == null) {
            m5181N(6);
            throw null;
        } else if (c12614f == null) {
            m5181N(7);
            throw null;
        } else if (enumC13301a == null) {
            m5181N(8);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C13400g0(interfaceC13513m, null, interfaceC13346g, c12614f, enumC13301a, interfaceC13545u0);
        } else {
            m5181N(9);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0
    /* renamed from: A */
    public InterfaceC13554x.InterfaceC13555a<? extends InterfaceC13543t0> mo4694A() {
        InterfaceC13554x.InterfaceC13555a mo4694A = super.mo4694A();
        if (mo4694A != null) {
            return mo4694A;
        }
        m5181N(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: W0 */
    protected AbstractC13426p mo5086W0(InterfaceC13513m interfaceC13513m, InterfaceC13554x interfaceC13554x, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13346g interfaceC13346g, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13513m == null) {
            m5181N(19);
            throw null;
        } else if (enumC13301a == null) {
            m5181N(20);
            throw null;
        } else if (interfaceC13346g == null) {
            m5181N(21);
            throw null;
        } else if (interfaceC13545u0 != null) {
            InterfaceC13543t0 interfaceC13543t0 = (InterfaceC13543t0) interfaceC13554x;
            if (c12614f == null) {
                c12614f = mo5012b();
            }
            return new C13400g0(interfaceC13513m, interfaceC13543t0, interfaceC13346g, c12614f, enumC13301a, interfaceC13545u0);
        } else {
            m5181N(22);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: v1 */
    public InterfaceC13543t0 mo5059u0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13300b.EnumC13301a enumC13301a, boolean z) {
        InterfaceC13543t0 interfaceC13543t0 = (InterfaceC13543t0) super.mo5059u0(interfaceC13513m, enumC13560z, abstractC13544u, enumC13301a, z);
        if (interfaceC13543t0 != null) {
            return interfaceC13543t0;
        }
        m5181N(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: x1 */
    public InterfaceC13543t0 mo4651a() {
        InterfaceC13543t0 interfaceC13543t0 = (InterfaceC13543t0) super.mo4651a();
        if (interfaceC13543t0 != null) {
            return interfaceC13543t0;
        }
        m5181N(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13426p
    /* renamed from: y1 */
    public C13400g0 mo5080c1(InterfaceC13524r0 interfaceC13524r0, InterfaceC13524r0 interfaceC13524r02, List<? extends InterfaceC13562z0> list, List<InterfaceC13307c1> list2, AbstractC12965b0 abstractC12965b0, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u) {
        if (list == null) {
            m5181N(10);
            throw null;
        } else if (list2 == null) {
            m5181N(11);
            throw null;
        } else if (abstractC13544u != null) {
            C13400g0 mo5176z1 = mo5176z1(interfaceC13524r0, interfaceC13524r02, list, list2, abstractC12965b0, enumC13560z, abstractC13544u, null);
            if (mo5176z1 != null) {
                return mo5176z1;
            }
            m5181N(13);
            throw null;
        } else {
            m5181N(12);
            throw null;
        }
    }

    /* renamed from: z1 */
    public C13400g0 mo5176z1(InterfaceC13524r0 interfaceC13524r0, InterfaceC13524r0 interfaceC13524r02, List<? extends InterfaceC13562z0> list, List<InterfaceC13307c1> list2, AbstractC12965b0 abstractC12965b0, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, Map<? extends InterfaceC13293a.InterfaceC13294a<?>, ?> map) {
        if (list == null) {
            m5181N(14);
            throw null;
        } else if (list2 == null) {
            m5181N(15);
            throw null;
        } else if (abstractC13544u != null) {
            super.mo5080c1(interfaceC13524r0, interfaceC13524r02, list, list2, abstractC12965b0, enumC13560z, abstractC13544u);
            if (map != null && !map.isEmpty()) {
                this.f29733U = new LinkedHashMap(map);
            }
            return this;
        } else {
            m5181N(16);
            throw null;
        }
    }
}
