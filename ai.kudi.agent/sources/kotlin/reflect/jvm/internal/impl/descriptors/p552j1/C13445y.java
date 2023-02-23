package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13009i;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: MutableClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.y */
/* loaded from: classes3.dex */
public class C13445y extends AbstractC13399g {

    /* renamed from: A */
    private final EnumC13319f f29796A;

    /* renamed from: B */
    private final boolean f29797B;

    /* renamed from: C */
    private EnumC13560z f29798C;

    /* renamed from: D */
    private AbstractC13544u f29799D;

    /* renamed from: E */
    private InterfaceC13125t0 f29800E;

    /* renamed from: F */
    private List<InterfaceC13562z0> f29801F;

    /* renamed from: G */
    private final Collection<AbstractC12965b0> f29802G;

    /* renamed from: H */
    private final InterfaceC12954n f29803H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13445y(InterfaceC13513m interfaceC13513m, EnumC13319f enumC13319f, boolean z, boolean z2, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0, InterfaceC12954n interfaceC12954n) {
        super(interfaceC12954n, interfaceC13513m, c12614f, interfaceC13545u0, z2);
        if (interfaceC13513m == null) {
            m4972N0(0);
            throw null;
        } else if (enumC13319f == null) {
            m4972N0(1);
            throw null;
        } else if (c12614f == null) {
            m4972N0(2);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m4972N0(3);
            throw null;
        } else if (interfaceC12954n != null) {
            this.f29802G = new ArrayList();
            this.f29803H = interfaceC12954n;
            this.f29796A = enumC13319f;
            this.f29797B = z;
        } else {
            m4972N0(4);
            throw null;
        }
    }

    /* renamed from: N0 */
    private static /* synthetic */ void m4972N0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i
    /* renamed from: B */
    public List<InterfaceC13562z0> mo4975B() {
        List<InterfaceC13562z0> list = this.f29801F;
        if (list != null) {
            return list;
        }
        m4972N0(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: F */
    public boolean mo4974F() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: J */
    public boolean mo4973J() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: M0 */
    public boolean mo4661M0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: P */
    public Collection<InterfaceC13312e> mo4971P() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m4972N0(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: Q */
    public boolean mo4970Q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13437t
    /* renamed from: R */
    public InterfaceC12777h mo4969R(AbstractC13026h abstractC13026h) {
        if (abstractC13026h != null) {
            InterfaceC12777h.C12780b c12780b = InterfaceC12777h.C12780b.f28671b;
            if (c12780b != null) {
                return c12780b;
            }
            m4972N0(17);
            throw null;
        }
        m4972N0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: R0 */
    public boolean mo4968R0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: T */
    public boolean mo4660T() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i
    /* renamed from: U */
    public boolean mo4967U() {
        return this.f29797B;
    }

    /* renamed from: V0 */
    public void m4966V0() {
        this.f29800E = new C13009i(this, this.f29801F, this.f29802G, this.f29803H);
        Iterator<InterfaceC13309d> it = mo4958p().iterator();
        while (it.hasNext()) {
            ((C13397f) it.next()).m5063r1(mo5010x());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: W0 */
    public Set<InterfaceC13309d> mo4958p() {
        Set<InterfaceC13309d> emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m4972N0(13);
        throw null;
    }

    /* renamed from: X0 */
    public void m4964X0(EnumC13560z enumC13560z) {
        if (enumC13560z != null) {
            this.f29798C = enumC13560z;
        } else {
            m4972N0(6);
            throw null;
        }
    }

    /* renamed from: Y0 */
    public void m4963Y0(List<InterfaceC13562z0> list) {
        if (list != null) {
            if (this.f29801F == null) {
                this.f29801F = new ArrayList(list);
                return;
            }
            throw new IllegalStateException("Type parameters are already set for " + mo5012b());
        }
        m4972N0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: Z */
    public InterfaceC13309d mo4962Z() {
        return null;
    }

    /* renamed from: Z0 */
    public void m4961Z0(AbstractC13544u abstractC13544u) {
        if (abstractC13544u != null) {
            this.f29799D = abstractC13544u;
        } else {
            m4972N0(9);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: a0 */
    public InterfaceC12777h mo4960a0() {
        InterfaceC12777h.C12780b c12780b = InterfaceC12777h.C12780b.f28671b;
        if (c12780b != null) {
            return c12780b;
        }
        m4972N0(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: c0 */
    public InterfaceC13312e mo4959c0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: i */
    public AbstractC13544u mo4659i() {
        AbstractC13544u abstractC13544u = this.f29799D;
        if (abstractC13544u != null) {
            return abstractC13544u;
        }
        m4972N0(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: n */
    public InterfaceC13125t0 mo4649n() {
        InterfaceC13125t0 interfaceC13125t0 = this.f29800E;
        if (interfaceC13125t0 != null) {
            return interfaceC13125t0;
        }
        m4972N0(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: o */
    public EnumC13560z mo4658o() {
        EnumC13560z enumC13560z = this.f29798C;
        if (enumC13560z != null) {
            return enumC13560z;
        }
        m4972N0(7);
        throw null;
    }

    public String toString() {
        return AbstractC13405j.m5167R(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: w */
    public EnumC13319f mo4957w() {
        EnumC13319f enumC13319f = this.f29796A;
        if (enumC13319f != null) {
            return enumC13319f;
        }
        m4972N0(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        InterfaceC13346g m5317b = InterfaceC13346g.f29516s.m5317b();
        if (m5317b != null) {
            return m5317b;
        }
        m4972N0(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: z */
    public boolean mo4955z() {
        return false;
    }
}
