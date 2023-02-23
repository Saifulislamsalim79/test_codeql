package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13520p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: PropertyGetterDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.d0 */
/* loaded from: classes3.dex */
public class C13390d0 extends AbstractC13382b0 implements InterfaceC13520p0 {

    /* renamed from: E */
    private AbstractC12965b0 f29643E;

    /* renamed from: F */
    private final InterfaceC13520p0 f29644F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13390d0(InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, boolean z, boolean z2, boolean z3, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13520p0 interfaceC13520p0, InterfaceC13545u0 interfaceC13545u0) {
        super(enumC13560z, abstractC13544u, interfaceC13518o0, interfaceC13346g, C12614f.m7346n("<get-" + interfaceC13518o0.mo5012b() + ">"), z, z2, z3, enumC13301a, interfaceC13545u0);
        C13390d0 c13390d0;
        C13390d0 c13390d02;
        if (interfaceC13518o0 == null) {
            m5215N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5215N(1);
            throw null;
        } else if (enumC13560z == null) {
            m5215N(2);
            throw null;
        } else if (abstractC13544u == null) {
            m5215N(3);
            throw null;
        } else if (enumC13301a == null) {
            m5215N(4);
            throw null;
        } else if (interfaceC13545u0 != null) {
            if (interfaceC13520p0 != 0) {
                c13390d02 = this;
                c13390d0 = interfaceC13520p0;
            } else {
                c13390d0 = this;
                c13390d02 = c13390d0;
            }
            c13390d02.f29644F = c13390d0;
        } else {
            m5215N(5);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5215N(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return interfaceC13517o.mo4762b(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13382b0, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a1 */
    public InterfaceC13520p0 mo4651a() {
        InterfaceC13520p0 interfaceC13520p0 = this.f29644F;
        if (interfaceC13520p0 != null) {
            return interfaceC13520p0;
        }
        m5215N(8);
        throw null;
    }

    /* renamed from: b1 */
    public void m5213b1(AbstractC12965b0 abstractC12965b0) {
        if (abstractC12965b0 == null) {
            abstractC12965b0 = mo4765J0().mo5121c();
        }
        this.f29643E = abstractC12965b0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: g */
    public Collection<? extends InterfaceC13520p0> mo4685g() {
        Collection<InterfaceC13516n0> m5273W0 = super.m5273W0(true);
        if (m5273W0 != null) {
            return m5273W0;
        }
        m5215N(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: j */
    public AbstractC12965b0 mo4943j() {
        return this.f29643E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: k */
    public List<InterfaceC13307c1> mo5072k() {
        List<InterfaceC13307c1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m5215N(7);
        throw null;
    }
}
