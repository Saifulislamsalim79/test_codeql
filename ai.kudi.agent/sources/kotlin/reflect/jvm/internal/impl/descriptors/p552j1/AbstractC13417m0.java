package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: VariableDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.m0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13417m0 extends AbstractC13409k implements InterfaceC13311d1 {

    /* renamed from: w */
    protected AbstractC12965b0 f29698w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13417m0(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, C12614f c12614f, AbstractC12965b0 abstractC12965b0, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13513m, interfaceC13346g, c12614f, interfaceC13545u0);
        if (interfaceC13513m == null) {
            m5123N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5123N(1);
            throw null;
        } else if (c12614f == null) {
            m5123N(2);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f29698w = abstractC12965b0;
        } else {
            m5123N(3);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5123N(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: G */
    public boolean mo5124G() {
        return false;
    }

    /* renamed from: M */
    public boolean mo5091M() {
        return false;
    }

    /* renamed from: U0 */
    public void m5122U0(AbstractC12965b0 abstractC12965b0) {
        this.f29698w = abstractC12965b0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13303b1
    /* renamed from: c */
    public AbstractC12965b0 mo5121c() {
        AbstractC12965b0 abstractC12965b0 = this.f29698w;
        if (abstractC12965b0 != null) {
            return abstractC12965b0;
        }
        m5123N(4);
        throw null;
    }

    /* renamed from: j */
    public AbstractC12965b0 mo4943j() {
        AbstractC12965b0 mo5121c = mo5121c();
        if (mo5121c != null) {
            return mo5121c;
        }
        m5123N(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: k */
    public List<InterfaceC13307c1> mo5072k() {
        List<InterfaceC13307c1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m5123N(6);
        throw null;
    }

    /* renamed from: l */
    public List<InterfaceC13562z0> mo4942l() {
        List<InterfaceC13562z0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m5123N(8);
        throw null;
    }

    /* renamed from: p0 */
    public InterfaceC13524r0 mo5066p0() {
        return null;
    }

    /* renamed from: s0 */
    public <V> V mo5062s0(InterfaceC13293a.InterfaceC13294a<V> interfaceC13294a) {
        return null;
    }

    /* renamed from: w0 */
    public InterfaceC13524r0 mo5056w0() {
        return null;
    }
}
