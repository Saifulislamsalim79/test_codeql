package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12977d0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13556x0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: TypeParameterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.k0 */
/* loaded from: classes3.dex */
public class C13410k0 extends AbstractC13391e {

    /* renamed from: C */
    private final InterfaceC11767l<AbstractC12965b0, Void> f29686C;

    /* renamed from: D */
    private final List<AbstractC12965b0> f29687D;

    /* renamed from: E */
    private boolean f29688E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C13410k0(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, boolean z, EnumC13008h1 enumC13008h1, C12614f c12614f, int i, InterfaceC13545u0 interfaceC13545u0, InterfaceC11767l<AbstractC12965b0, Void> interfaceC11767l, InterfaceC13556x0 interfaceC13556x0, InterfaceC12954n interfaceC12954n) {
        super(interfaceC12954n, interfaceC13513m, interfaceC13346g, c12614f, enumC13008h1, z, i, interfaceC13545u0, interfaceC13556x0);
        if (interfaceC13513m == null) {
            m5153N(19);
            throw null;
        } else if (interfaceC13346g == null) {
            m5153N(20);
            throw null;
        } else if (enumC13008h1 == null) {
            m5153N(21);
            throw null;
        } else if (c12614f == null) {
            m5153N(22);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m5153N(23);
            throw null;
        } else if (interfaceC13556x0 == null) {
            m5153N(24);
            throw null;
        } else if (interfaceC12954n != null) {
            this.f29687D = new ArrayList(1);
            this.f29688E = false;
            this.f29686C = interfaceC11767l;
        } else {
            m5153N(25);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5153N(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: Y0 */
    private void m5149Y0() {
        if (this.f29688E) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + m5143e1());
    }

    /* renamed from: Z0 */
    private void m5148Z0() {
        if (this.f29688E) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m5143e1());
        }
    }

    /* renamed from: a1 */
    public static C13410k0 m5147a1(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, boolean z, EnumC13008h1 enumC13008h1, C12614f c12614f, int i, InterfaceC13545u0 interfaceC13545u0, InterfaceC11767l<AbstractC12965b0, Void> interfaceC11767l, InterfaceC13556x0 interfaceC13556x0, InterfaceC12954n interfaceC12954n) {
        if (interfaceC13513m == null) {
            m5153N(12);
            throw null;
        } else if (interfaceC13346g == null) {
            m5153N(13);
            throw null;
        } else if (enumC13008h1 == null) {
            m5153N(14);
            throw null;
        } else if (c12614f == null) {
            m5153N(15);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m5153N(16);
            throw null;
        } else if (interfaceC13556x0 == null) {
            m5153N(17);
            throw null;
        } else if (interfaceC12954n != null) {
            return new C13410k0(interfaceC13513m, interfaceC13346g, z, enumC13008h1, c12614f, i, interfaceC13545u0, interfaceC11767l, interfaceC13556x0, interfaceC12954n);
        } else {
            m5153N(18);
            throw null;
        }
    }

    /* renamed from: b1 */
    public static C13410k0 m5146b1(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, boolean z, EnumC13008h1 enumC13008h1, C12614f c12614f, int i, InterfaceC13545u0 interfaceC13545u0, InterfaceC12954n interfaceC12954n) {
        if (interfaceC13513m == null) {
            m5153N(6);
            throw null;
        } else if (interfaceC13346g == null) {
            m5153N(7);
            throw null;
        } else if (enumC13008h1 == null) {
            m5153N(8);
            throw null;
        } else if (c12614f == null) {
            m5153N(9);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m5153N(10);
            throw null;
        } else if (interfaceC12954n != null) {
            return m5147a1(interfaceC13513m, interfaceC13346g, z, enumC13008h1, c12614f, i, interfaceC13545u0, null, InterfaceC13556x0.C13557a.f29907a, interfaceC12954n);
        } else {
            m5153N(11);
            throw null;
        }
    }

    /* renamed from: c1 */
    public static InterfaceC13562z0 m5145c1(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, boolean z, EnumC13008h1 enumC13008h1, C12614f c12614f, int i, InterfaceC12954n interfaceC12954n) {
        if (interfaceC13513m == null) {
            m5153N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5153N(1);
            throw null;
        } else if (enumC13008h1 == null) {
            m5153N(2);
            throw null;
        } else if (c12614f == null) {
            m5153N(3);
            throw null;
        } else if (interfaceC12954n != null) {
            C13410k0 m5146b1 = m5146b1(interfaceC13513m, interfaceC13346g, z, enumC13008h1, c12614f, i, InterfaceC13545u0.f29903a, interfaceC12954n);
            m5146b1.m5150X0(C12747a.m6863g(interfaceC13513m).m9861y());
            m5146b1.m5142f1();
            if (m5146b1 != null) {
                return m5146b1;
            }
            m5153N(5);
            throw null;
        } else {
            m5153N(4);
            throw null;
        }
    }

    /* renamed from: d1 */
    private void m5144d1(AbstractC12965b0 abstractC12965b0) {
        if (C12977d0.m6274a(abstractC12965b0)) {
            return;
        }
        this.f29687D.add(abstractC12965b0);
    }

    /* renamed from: e1 */
    private String m5143e1() {
        return mo5012b() + " declared in " + C12673d.m7022m(mo4687d());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13391e
    /* renamed from: V0 */
    protected void mo5152V0(AbstractC12965b0 abstractC12965b0) {
        if (abstractC12965b0 != null) {
            InterfaceC11767l<AbstractC12965b0, Void> interfaceC11767l = this.f29686C;
            if (interfaceC11767l == null) {
                return;
            }
            interfaceC11767l.invoke(abstractC12965b0);
            return;
        }
        m5153N(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13391e
    /* renamed from: W0 */
    protected List<AbstractC12965b0> mo5151W0() {
        m5149Y0();
        List<AbstractC12965b0> list = this.f29687D;
        if (list != null) {
            return list;
        }
        m5153N(28);
        throw null;
    }

    /* renamed from: X0 */
    public void m5150X0(AbstractC12965b0 abstractC12965b0) {
        if (abstractC12965b0 != null) {
            m5148Z0();
            m5144d1(abstractC12965b0);
            return;
        }
        m5153N(26);
        throw null;
    }

    /* renamed from: f1 */
    public void m5142f1() {
        m5148Z0();
        this.f29688E = true;
    }
}
