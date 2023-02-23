package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13522q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: PropertySetterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.e0 */
/* loaded from: classes3.dex */
public class C13396e0 extends AbstractC13382b0 implements InterfaceC13522q0 {

    /* renamed from: E */
    private InterfaceC13307c1 f29659E;

    /* renamed from: F */
    private final InterfaceC13522q0 f29660F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13396e0(InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, boolean z, boolean z2, boolean z3, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13522q0 interfaceC13522q0, InterfaceC13545u0 interfaceC13545u0) {
        super(enumC13560z, abstractC13544u, interfaceC13518o0, interfaceC13346g, C12614f.m7346n("<set-" + interfaceC13518o0.mo5012b() + ">"), z, z2, z3, enumC13301a, interfaceC13545u0);
        C13396e0 c13396e0;
        C13396e0 c13396e02;
        if (interfaceC13518o0 == null) {
            m5196N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5196N(1);
            throw null;
        } else if (enumC13560z == null) {
            m5196N(2);
            throw null;
        } else if (abstractC13544u == null) {
            m5196N(3);
            throw null;
        } else if (enumC13301a == null) {
            m5196N(4);
            throw null;
        } else if (interfaceC13545u0 != null) {
            if (interfaceC13522q0 != 0) {
                c13396e02 = this;
                c13396e0 = interfaceC13522q0;
            } else {
                c13396e0 = this;
                c13396e02 = c13396e0;
            }
            c13396e02.f29660F = c13396e0;
        } else {
            m5196N(5);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5196N(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: a1 */
    public static C13412l0 m5194a1(InterfaceC13522q0 interfaceC13522q0, AbstractC12965b0 abstractC12965b0, InterfaceC13346g interfaceC13346g) {
        if (interfaceC13522q0 == null) {
            m5196N(7);
            throw null;
        } else if (abstractC12965b0 == null) {
            m5196N(8);
            throw null;
        } else if (interfaceC13346g != null) {
            return new C13412l0(interfaceC13522q0, null, 0, interfaceC13346g, C12614f.m7346n("<set-?>"), abstractC12965b0, false, false, false, null, InterfaceC13545u0.f29903a);
        } else {
            m5196N(9);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return interfaceC13517o.mo4755i(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13382b0, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: b1 */
    public InterfaceC13522q0 mo4651a() {
        InterfaceC13522q0 interfaceC13522q0 = this.f29660F;
        if (interfaceC13522q0 != null) {
            return interfaceC13522q0;
        }
        m5196N(13);
        throw null;
    }

    /* renamed from: c1 */
    public void m5192c1(InterfaceC13307c1 interfaceC13307c1) {
        if (interfaceC13307c1 != null) {
            this.f29659E = interfaceC13307c1;
        } else {
            m5196N(6);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: g */
    public Collection<? extends InterfaceC13522q0> mo4685g() {
        Collection<InterfaceC13516n0> m5273W0 = super.m5273W0(false);
        if (m5273W0 != null) {
            return m5273W0;
        }
        m5196N(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: j */
    public AbstractC12965b0 mo4943j() {
        AbstractC13010i0 m9909Y = C12747a.m6863g(this).m9909Y();
        if (m9909Y != null) {
            return m9909Y;
        }
        m5196N(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: k */
    public List<InterfaceC13307c1> mo5072k() {
        InterfaceC13307c1 interfaceC13307c1 = this.f29659E;
        if (interfaceC13307c1 != null) {
            List<InterfaceC13307c1> singletonList = Collections.singletonList(interfaceC13307c1);
            if (singletonList != null) {
                return singletonList;
            }
            m5196N(11);
            throw null;
        }
        throw new IllegalStateException();
    }
}
