package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: PropertyAccessorDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13382b0 extends AbstractC13409k implements InterfaceC13516n0 {

    /* renamed from: A */
    private final boolean f29596A;

    /* renamed from: B */
    private final InterfaceC13300b.EnumC13301a f29597B;

    /* renamed from: C */
    private AbstractC13544u f29598C;

    /* renamed from: D */
    private InterfaceC13554x f29599D;

    /* renamed from: w */
    private boolean f29600w;

    /* renamed from: x */
    private final boolean f29601x;

    /* renamed from: y */
    private final EnumC13560z f29602y;

    /* renamed from: z */
    private final InterfaceC13518o0 f29603z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13382b0(EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, C12614f c12614f, boolean z, boolean z2, boolean z3, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13518o0.mo4687d(), interfaceC13346g, c12614f, interfaceC13545u0);
        if (enumC13560z == null) {
            m5275N(0);
            throw null;
        } else if (abstractC13544u == null) {
            m5275N(1);
            throw null;
        } else if (interfaceC13518o0 == null) {
            m5275N(2);
            throw null;
        } else if (interfaceC13346g == null) {
            m5275N(3);
            throw null;
        } else if (c12614f == null) {
            m5275N(4);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f29599D = null;
            this.f29602y = enumC13560z;
            this.f29598C = abstractC13544u;
            this.f29603z = interfaceC13518o0;
            this.f29600w = z;
            this.f29601x = z2;
            this.f29596A = z3;
            this.f29597B = enumC13301a;
        } else {
            m5275N(5);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5275N(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0
    /* renamed from: A */
    public InterfaceC13554x.InterfaceC13555a<? extends InterfaceC13554x> mo4694A() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: E */
    public boolean mo4662E() {
        return this.f29601x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: F0 */
    public boolean mo4693F0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: G0 */
    public boolean mo4692G0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: H0 */
    public void mo5092H0(Collection<? extends InterfaceC13300b> collection) {
        if (collection != null) {
            return;
        }
        m5275N(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0
    /* renamed from: J0 */
    public InterfaceC13518o0 mo4765J0() {
        InterfaceC13518o0 interfaceC13518o0 = this.f29603z;
        if (interfaceC13518o0 != null) {
            return interfaceC13518o0;
        }
        m5275N(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: K0 */
    public boolean mo4691K0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: M */
    public boolean mo5091M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: M0 */
    public boolean mo4661M0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: P0 */
    public boolean mo4690P0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: T */
    public boolean mo4660T() {
        return false;
    }

    /* renamed from: U0 */
    public InterfaceC13516n0 m5274U0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13300b.EnumC13301a enumC13301a, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: V0 */
    public abstract InterfaceC13516n0 mo4651a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W0 */
    public Collection<InterfaceC13516n0> m5273W0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC13518o0 interfaceC13518o0 : mo4765J0().mo4685g()) {
            InterfaceC13513m mo4747q = z ? interfaceC13518o0.mo4747q() : interfaceC13518o0.mo4748i0();
            if (mo4747q != null) {
                arrayList.add(mo4747q);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: X */
    public boolean mo4689X() {
        return false;
    }

    /* renamed from: X0 */
    public void m5272X0(boolean z) {
        this.f29600w = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: Y */
    public boolean mo4688Y() {
        return false;
    }

    /* renamed from: Y0 */
    public void m5271Y0(InterfaceC13554x interfaceC13554x) {
        this.f29599D = interfaceC13554x;
    }

    /* renamed from: Z0 */
    public void m5270Z0(AbstractC13544u abstractC13544u) {
        this.f29598C = abstractC13544u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0
    /* renamed from: d0 */
    public boolean mo4764d0() {
        return this.f29600w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0
    /* renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC13293a mo4686e(C12959a1 c12959a1) {
        mo4686e(c12959a1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: i */
    public AbstractC13544u mo4659i() {
        AbstractC13544u abstractC13544u = this.f29598C;
        if (abstractC13544u != null) {
            return abstractC13544u;
        }
        m5275N(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: l */
    public List<InterfaceC13562z0> mo4942l() {
        List<InterfaceC13562z0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m5275N(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: n0 */
    public InterfaceC13554x mo4684n0() {
        return this.f29599D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: o */
    public EnumC13560z mo4658o() {
        EnumC13560z enumC13560z = this.f29602y;
        if (enumC13560z != null) {
            return enumC13560z;
        }
        m5275N(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: p0 */
    public InterfaceC13524r0 mo5066p0() {
        return mo4765J0().mo5066p0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: s0 */
    public <V> V mo5062s0(InterfaceC13293a.InterfaceC13294a<V> interfaceC13294a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: u0 */
    public /* bridge */ /* synthetic */ InterfaceC13300b mo5059u0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13300b.EnumC13301a enumC13301a, boolean z) {
        m5274U0(interfaceC13513m, enumC13560z, abstractC13544u, enumC13301a, z);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: w */
    public InterfaceC13300b.EnumC13301a mo5057w() {
        InterfaceC13300b.EnumC13301a enumC13301a = this.f29597B;
        if (enumC13301a != null) {
            return enumC13301a;
        }
        m5275N(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: w0 */
    public InterfaceC13524r0 mo5056w0() {
        return mo4765J0().mo5056w0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x
    /* renamed from: z */
    public boolean mo4683z() {
        return this.f29596A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public InterfaceC13554x mo4686e(C12959a1 c12959a1) {
        if (c12959a1 == null) {
            m5275N(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }
}
