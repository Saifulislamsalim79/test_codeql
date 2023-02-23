package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
/* compiled from: ClassDescriptorBase.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.g */
/* loaded from: classes3.dex */
public abstract class AbstractC13399g extends AbstractC13373a {

    /* renamed from: x */
    private final InterfaceC13513m f29665x;

    /* renamed from: y */
    private final InterfaceC13545u0 f29666y;

    /* renamed from: z */
    private final boolean f29667z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13399g(InterfaceC12954n interfaceC12954n, InterfaceC13513m interfaceC13513m, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0, boolean z) {
        super(interfaceC12954n, c12614f);
        if (interfaceC12954n == null) {
            m5182N0(0);
            throw null;
        } else if (interfaceC13513m == null) {
            m5182N0(1);
            throw null;
        } else if (c12614f == null) {
            m5182N0(2);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f29665x = interfaceC13513m;
            this.f29666y = interfaceC13545u0;
            this.f29667z = z;
        } else {
            m5182N0(3);
            throw null;
        }
    }

    /* renamed from: N0 */
    private static /* synthetic */ void m5182N0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = TransactionField.TRANSACTION_CHANNEL;
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: E */
    public boolean mo4662E() {
        return this.f29667z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13515n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: d */
    public InterfaceC13513m mo4687d() {
        InterfaceC13513m interfaceC13513m = this.f29665x;
        if (interfaceC13513m != null) {
            return interfaceC13513m;
        }
        m5182N0(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p
    /* renamed from: m */
    public InterfaceC13545u0 mo4745m() {
        InterfaceC13545u0 interfaceC13545u0 = this.f29666y;
        if (interfaceC13545u0 != null) {
            return interfaceC13545u0;
        }
        m5182N0(5);
        throw null;
    }
}
