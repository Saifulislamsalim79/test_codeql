package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12666b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12775g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12789n;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13118t;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13556x0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: AbstractTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.e */
/* loaded from: classes3.dex */
public abstract class AbstractC13391e extends AbstractC13409k implements InterfaceC13562z0 {

    /* renamed from: A */
    private final InterfaceC12948i<AbstractC13010i0> f29645A;

    /* renamed from: B */
    private final InterfaceC12954n f29646B;

    /* renamed from: w */
    private final EnumC13008h1 f29647w;

    /* renamed from: x */
    private final boolean f29648x;

    /* renamed from: y */
    private final int f29649y;

    /* renamed from: z */
    private final InterfaceC12948i<InterfaceC13125t0> f29650z;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.e$a */
    /* loaded from: classes3.dex */
    class C13392a implements InterfaceC11756a<InterfaceC13125t0> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC12954n f29651c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13556x0 f29652d;

        C13392a(InterfaceC12954n interfaceC12954n, InterfaceC13556x0 interfaceC13556x0) {
            this.f29651c = interfaceC12954n;
            this.f29652d = interfaceC13556x0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public InterfaceC13125t0 invoke() {
            return new C13395c(AbstractC13391e.this, this.f29651c, this.f29652d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.e$b */
    /* loaded from: classes3.dex */
    public class C13393b implements InterfaceC11756a<AbstractC13010i0> {

        /* renamed from: c */
        final /* synthetic */ C12614f f29654c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractTypeParameterDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.e$b$a */
        /* loaded from: classes3.dex */
        public class C13394a implements InterfaceC11756a<InterfaceC12777h> {
            C13394a() {
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public InterfaceC12777h invoke() {
                return C12789n.m6760j("Scope for type parameter " + C13393b.this.f29654c.m7353b(), AbstractC13391e.this.getUpperBounds());
            }
        }

        C13393b(C12614f c12614f) {
            this.f29654c = c12614f;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public AbstractC13010i0 invoke() {
            return C12969c0.m6308j(InterfaceC13346g.f29516s.m5317b(), AbstractC13391e.this.mo4649n(), Collections.emptyList(), false, new C12775g(new C13394a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.e$c */
    /* loaded from: classes3.dex */
    public class C13395c extends AbstractC12993g {

        /* renamed from: d */
        private final InterfaceC13556x0 f29657d;

        /* renamed from: e */
        final /* synthetic */ AbstractC13391e f29658e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13395c(AbstractC13391e abstractC13391e, InterfaceC12954n interfaceC12954n, InterfaceC13556x0 interfaceC13556x0) {
            super(interfaceC12954n);
            if (interfaceC12954n != null) {
                this.f29658e = abstractC13391e;
                this.f29657d = interfaceC13556x0;
                return;
            }
            m5197v(0);
            throw null;
        }

        /* renamed from: v */
        private static /* synthetic */ void m5197v(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: c */
        public List<InterfaceC13562z0> mo5207c() {
            List<InterfaceC13562z0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            m5197v(2);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g, kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: d */
        public InterfaceC13334h mo5206d() {
            AbstractC13391e abstractC13391e = this.f29658e;
            if (abstractC13391e != null) {
                return abstractC13391e;
            }
            m5197v(3);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: e */
        public boolean mo5205e() {
            return true;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
        /* renamed from: j */
        protected Collection<AbstractC12965b0> mo5204j() {
            List<AbstractC12965b0> mo5151W0 = this.f29658e.mo5151W0();
            if (mo5151W0 != null) {
                return mo5151W0;
            }
            m5197v(1);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
        /* renamed from: k */
        protected AbstractC12965b0 mo5203k() {
            return C13118t.m5811j("Cyclic upper bounds");
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
        /* renamed from: n */
        protected InterfaceC13556x0 mo5202n() {
            InterfaceC13556x0 interfaceC13556x0 = this.f29657d;
            if (interfaceC13556x0 != null) {
                return interfaceC13556x0;
            }
            m5197v(5);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
        /* renamed from: q */
        protected boolean mo5201q(InterfaceC13334h interfaceC13334h) {
            if (interfaceC13334h != null) {
                return (interfaceC13334h instanceof InterfaceC13562z0) && C12666b.f28520a.m7070f(this.f29658e, (InterfaceC13562z0) interfaceC13334h, true);
            }
            m5197v(9);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
        /* renamed from: r */
        protected List<AbstractC12965b0> mo5200r(List<AbstractC12965b0> list) {
            if (list != null) {
                List<AbstractC12965b0> mo5211U0 = this.f29658e.mo5211U0(list);
                if (mo5211U0 != null) {
                    return mo5211U0;
                }
                m5197v(8);
                throw null;
            }
            m5197v(7);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0
        /* renamed from: s */
        public AbstractC12046h mo5199s() {
            AbstractC12046h m6863g = C12747a.m6863g(this.f29658e);
            if (m6863g != null) {
                return m6863g;
            }
            m5197v(4);
            throw null;
        }

        public String toString() {
            return this.f29658e.mo5012b().toString();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12993g
        /* renamed from: u */
        protected void mo5198u(AbstractC12965b0 abstractC12965b0) {
            if (abstractC12965b0 != null) {
                this.f29658e.mo5152V0(abstractC12965b0);
            } else {
                m5197v(6);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13391e(InterfaceC12954n interfaceC12954n, InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, C12614f c12614f, EnumC13008h1 enumC13008h1, boolean z, int i, InterfaceC13545u0 interfaceC13545u0, InterfaceC13556x0 interfaceC13556x0) {
        super(interfaceC13513m, interfaceC13346g, c12614f, interfaceC13545u0);
        if (interfaceC12954n == null) {
            m5212N(0);
            throw null;
        } else if (interfaceC13513m == null) {
            m5212N(1);
            throw null;
        } else if (interfaceC13346g == null) {
            m5212N(2);
            throw null;
        } else if (c12614f == null) {
            m5212N(3);
            throw null;
        } else if (enumC13008h1 == null) {
            m5212N(4);
            throw null;
        } else if (interfaceC13545u0 == null) {
            m5212N(5);
            throw null;
        } else if (interfaceC13556x0 != null) {
            this.f29647w = enumC13008h1;
            this.f29648x = z;
            this.f29649y = i;
            this.f29650z = interfaceC12954n.mo6367d(new C13392a(interfaceC12954n, interfaceC13556x0));
            this.f29645A = interfaceC12954n.mo6367d(new C13393b(c12614f));
            this.f29646B = interfaceC12954n;
        } else {
            m5212N(6);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5212N(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: L */
    public boolean mo4652L() {
        return this.f29648x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return interfaceC13517o.mo4751m(this, d);
    }

    /* renamed from: U0 */
    protected List<AbstractC12965b0> mo5211U0(List<AbstractC12965b0> list) {
        if (list == null) {
            m5212N(12);
            throw null;
        } else if (list != null) {
            return list;
        } else {
            m5212N(13);
            throw null;
        }
    }

    /* renamed from: V0 */
    protected abstract void mo5152V0(AbstractC12965b0 abstractC12965b0);

    /* renamed from: W0 */
    protected abstract List<AbstractC12965b0> mo5151W0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    public List<AbstractC12965b0> getUpperBounds() {
        List<AbstractC12965b0> mo5218a = ((C13395c) mo4649n()).mo5218a();
        if (mo5218a != null) {
            return mo5218a;
        }
        m5212N(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: h */
    public int mo4650h() {
        return this.f29649y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: n */
    public final InterfaceC13125t0 mo4649n() {
        InterfaceC13125t0 invoke = this.f29650z.invoke();
        if (invoke != null) {
            return invoke;
        }
        m5212N(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: r */
    public EnumC13008h1 mo4648r() {
        EnumC13008h1 enumC13008h1 = this.f29647w;
        if (enumC13008h1 != null) {
            return enumC13008h1;
        }
        m5212N(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: r0 */
    public InterfaceC12954n mo4647r0() {
        InterfaceC12954n interfaceC12954n = this.f29646B;
        if (interfaceC12954n != null) {
            return interfaceC12954n;
        }
        m5212N(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: x */
    public AbstractC13010i0 mo5010x() {
        AbstractC13010i0 invoke = this.f29645A.invoke();
        if (invoke != null) {
            return invoke;
        }
        m5212N(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: y0 */
    public boolean mo4646y0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public InterfaceC13562z0 mo4651a() {
        InterfaceC13562z0 interfaceC13562z0 = (InterfaceC13562z0) super.mo4651a();
        if (interfaceC13562z0 != null) {
            return interfaceC13562z0;
        }
        m5212N(11);
        throw null;
    }
}
