package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Collection;
import java.util.Collections;
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
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: ClassDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.h */
/* loaded from: classes3.dex */
public class C13401h extends AbstractC13399g {

    /* renamed from: A */
    private final EnumC13560z f29668A;

    /* renamed from: B */
    private final EnumC13319f f29669B;

    /* renamed from: C */
    private final InterfaceC13125t0 f29670C;

    /* renamed from: D */
    private InterfaceC12777h f29671D;

    /* renamed from: E */
    private Set<InterfaceC13309d> f29672E;

    /* renamed from: F */
    private InterfaceC13309d f29673F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13401h(InterfaceC13513m interfaceC13513m, C12614f c12614f, EnumC13560z enumC13560z, EnumC13319f enumC13319f, Collection<AbstractC12965b0> collection, InterfaceC13545u0 interfaceC13545u0, boolean z, InterfaceC12954n interfaceC12954n) {
        super(interfaceC12954n, interfaceC13513m, c12614f, interfaceC13545u0, z);
        if (interfaceC13513m == null) {
            m5175N0(0);
            throw null;
        } else if (c12614f == null) {
            m5175N0(1);
            throw null;
        } else if (enumC13560z == null) {
            m5175N0(2);
            throw null;
        } else if (enumC13319f == null) {
            m5175N0(3);
            throw null;
        } else if (collection == null) {
            m5175N0(4);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m5175N0(5);
            throw null;
        } else if (interfaceC12954n != null) {
            this.f29668A = enumC13560z;
            this.f29669B = enumC13319f;
            this.f29670C = new C13009i(this, Collections.emptyList(), collection, interfaceC12954n);
        } else {
            m5175N0(6);
            throw null;
        }
    }

    /* renamed from: N0 */
    private static /* synthetic */ void m5175N0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = TransactionField.TRANSACTION_CHANNEL;
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i
    /* renamed from: B */
    public List<InterfaceC13562z0> mo4975B() {
        List<InterfaceC13562z0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m5175N0(18);
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
        m5175N0(19);
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
            InterfaceC12777h interfaceC12777h = this.f29671D;
            if (interfaceC12777h != null) {
                return interfaceC12777h;
            }
            m5175N0(13);
            throw null;
        }
        m5175N0(12);
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
        return false;
    }

    /* renamed from: V0 */
    public final void m5174V0(InterfaceC12777h interfaceC12777h, Set<InterfaceC13309d> set, InterfaceC13309d interfaceC13309d) {
        if (interfaceC12777h == null) {
            m5175N0(7);
            throw null;
        } else if (set != null) {
            this.f29671D = interfaceC12777h;
            this.f29672E = set;
            this.f29673F = interfaceC13309d;
        } else {
            m5175N0(8);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: Z */
    public InterfaceC13309d mo4962Z() {
        return this.f29673F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: a0 */
    public InterfaceC12777h mo4960a0() {
        InterfaceC12777h.C12780b c12780b = InterfaceC12777h.C12780b.f28671b;
        if (c12780b != null) {
            return c12780b;
        }
        m5175N0(14);
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
        AbstractC13544u abstractC13544u = C13530t.f29892e;
        if (abstractC13544u != null) {
            return abstractC13544u;
        }
        m5175N0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: n */
    public InterfaceC13125t0 mo4649n() {
        InterfaceC13125t0 interfaceC13125t0 = this.f29670C;
        if (interfaceC13125t0 != null) {
            return interfaceC13125t0;
        }
        m5175N0(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: o */
    public EnumC13560z mo4658o() {
        EnumC13560z enumC13560z = this.f29668A;
        if (enumC13560z != null) {
            return enumC13560z;
        }
        m5175N0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: p */
    public Collection<InterfaceC13309d> mo4958p() {
        Set<InterfaceC13309d> set = this.f29672E;
        if (set != null) {
            return set;
        }
        m5175N0(11);
        throw null;
    }

    public String toString() {
        return "class " + mo5012b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: w */
    public EnumC13319f mo4957w() {
        EnumC13319f enumC13319f = this.f29669B;
        if (enumC13319f != null) {
            return enumC13319f;
        }
        m5175N0(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        InterfaceC13346g m5317b = InterfaceC13346g.f29516s.m5317b();
        if (m5317b != null) {
            return m5317b;
        }
        m5175N0(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: z */
    public boolean mo4955z() {
        return false;
    }
}
