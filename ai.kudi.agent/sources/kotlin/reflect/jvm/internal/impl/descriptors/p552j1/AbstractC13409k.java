package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13515n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.k */
/* loaded from: classes3.dex */
public abstract class AbstractC13409k extends AbstractC13405j implements InterfaceC13515n {

    /* renamed from: e */
    private final InterfaceC13513m f29684e;

    /* renamed from: f */
    private final InterfaceC13545u0 f29685f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13409k(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0) {
        super(interfaceC13346g, c12614f);
        if (interfaceC13513m == null) {
            m5154N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5154N(1);
            throw null;
        } else if (c12614f == null) {
            m5154N(2);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f29684e = interfaceC13513m;
            this.f29685f = interfaceC13545u0;
        } else {
            m5154N(3);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5154N(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: N0 */
    public InterfaceC13519p mo4651a() {
        super.mo4651a();
        return this;
    }

    /* renamed from: d */
    public InterfaceC13513m mo4687d() {
        InterfaceC13513m interfaceC13513m = this.f29684e;
        if (interfaceC13513m != null) {
            return interfaceC13513m;
        }
        m5154N(5);
        throw null;
    }

    /* renamed from: m */
    public InterfaceC13545u0 mo4745m() {
        InterfaceC13545u0 interfaceC13545u0 = this.f29685f;
        if (interfaceC13545u0 != null) {
            return interfaceC13545u0;
        }
        m5154N(6);
        throw null;
    }
}
