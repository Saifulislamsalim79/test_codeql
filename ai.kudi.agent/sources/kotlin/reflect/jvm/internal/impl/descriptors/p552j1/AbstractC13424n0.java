package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12949j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: VariableDescriptorWithInitializerImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.n0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13424n0 extends AbstractC13417m0 {

    /* renamed from: x */
    private final boolean f29711x;

    /* renamed from: y */
    protected InterfaceC12949j<AbstractC12712g<?>> f29712y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13424n0(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, C12614f c12614f, AbstractC12965b0 abstractC12965b0, boolean z, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13513m, interfaceC13346g, c12614f, abstractC12965b0, interfaceC13545u0);
        if (interfaceC13513m == null) {
            m5096N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5096N(1);
            throw null;
        } else if (c12614f == null) {
            m5096N(2);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f29711x = z;
        } else {
            m5096N(3);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5096N(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = TransactionField.TRANSACTION_CHANNEL;
        } else if (i != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: V0 */
    public void m5095V0(InterfaceC12949j<AbstractC12712g<?>> interfaceC12949j) {
        if (interfaceC12949j != null) {
            this.f29712y = interfaceC12949j;
        } else {
            m5096N(4);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1
    /* renamed from: f0 */
    public AbstractC12712g<?> mo5094f0() {
        InterfaceC12949j<AbstractC12712g<?>> interfaceC12949j = this.f29712y;
        if (interfaceC12949j != null) {
            return interfaceC12949j.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1
    /* renamed from: t0 */
    public boolean mo5093t0() {
        return this.f29711x;
    }
}
