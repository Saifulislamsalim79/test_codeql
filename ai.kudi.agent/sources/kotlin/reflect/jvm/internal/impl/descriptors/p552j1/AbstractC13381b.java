package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13556x0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.b */
/* loaded from: classes3.dex */
public abstract class AbstractC13381b extends AbstractC13391e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13381b(InterfaceC12954n interfaceC12954n, InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, C12614f c12614f, EnumC13008h1 enumC13008h1, boolean z, int i, InterfaceC13545u0 interfaceC13545u0, InterfaceC13556x0 interfaceC13556x0) {
        super(interfaceC12954n, interfaceC13513m, interfaceC13346g, c12614f, enumC13008h1, z, i, interfaceC13545u0, interfaceC13556x0);
        if (interfaceC12954n == null) {
            m5276N(0);
            throw null;
        } else if (interfaceC13513m == null) {
            m5276N(1);
            throw null;
        } else if (interfaceC13346g == null) {
            m5276N(2);
            throw null;
        } else if (c12614f == null) {
            m5276N(3);
            throw null;
        } else if (enumC13008h1 == null) {
            m5276N(4);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m5276N(5);
            throw null;
        } else if (interfaceC13556x0 != null) {
        } else {
            m5276N(6);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5276N(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j
    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = mo4652L() ? "reified " : "";
        if (mo4648r() != EnumC13008h1.INVARIANT) {
            str = mo4648r() + " ";
        }
        objArr[1] = str;
        objArr[2] = mo5012b();
        return String.format("%s%s%s", objArr);
    }
}
