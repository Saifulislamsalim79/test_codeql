package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12774f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12787m;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12948i;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
/* compiled from: AbstractClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC13373a extends AbstractC13437t {

    /* renamed from: d */
    private final C12614f f29584d;

    /* renamed from: e */
    protected final InterfaceC12948i<AbstractC13010i0> f29585e;

    /* renamed from: f */
    private final InterfaceC12948i<InterfaceC12777h> f29586f;

    /* renamed from: w */
    private final InterfaceC12948i<InterfaceC13524r0> f29587w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.a$a */
    /* loaded from: classes3.dex */
    public class C13374a implements InterfaceC11756a<AbstractC13010i0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.a$a$a */
        /* loaded from: classes3.dex */
        public class C13375a implements InterfaceC11767l<AbstractC13026h, AbstractC13010i0> {
            C13375a() {
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public AbstractC13010i0 invoke(AbstractC13026h abstractC13026h) {
                InterfaceC13334h mo6101e = abstractC13026h.mo6101e(AbstractC13373a.this);
                if (mo6101e == null) {
                    return AbstractC13373a.this.f29585e.invoke();
                }
                if (mo6101e instanceof InterfaceC13559y0) {
                    return C12969c0.m6316b((InterfaceC13559y0) mo6101e, C12974c1.m6295g(mo6101e.mo4649n().mo5207c()));
                }
                if (mo6101e instanceof AbstractC13437t) {
                    return C12974c1.m6281u(mo6101e.mo4649n().mo5217b(abstractC13026h), ((AbstractC13437t) mo6101e).mo4969R(abstractC13026h), this);
                }
                return mo6101e.mo5010x();
            }
        }

        C13374a() {
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public AbstractC13010i0 invoke() {
            AbstractC13373a abstractC13373a = AbstractC13373a.this;
            return C12974c1.m6282t(abstractC13373a, abstractC13373a.mo5017L0(), new C13375a());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.a$b */
    /* loaded from: classes3.dex */
    class C13376b implements InterfaceC11756a<InterfaceC12777h> {
        C13376b() {
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public InterfaceC12777h invoke() {
            return new C12774f(AbstractC13373a.this.mo5017L0());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.a$c */
    /* loaded from: classes3.dex */
    class C13377c implements InterfaceC11756a<InterfaceC13524r0> {
        C13377c() {
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public InterfaceC13524r0 invoke() {
            return new C13430q(AbstractC13373a.this);
        }
    }

    public AbstractC13373a(InterfaceC12954n interfaceC12954n, C12614f c12614f) {
        if (interfaceC12954n == null) {
            m5284N0(0);
            throw null;
        } else if (c12614f != null) {
            this.f29584d = c12614f;
            this.f29585e = interfaceC12954n.mo6367d(new C13374a());
            this.f29586f = interfaceC12954n.mo6367d(new C13376b());
            this.f29587w = interfaceC12954n.mo6367d(new C13377c());
        } else {
            m5284N0(1);
            throw null;
        }
    }

    /* renamed from: N0 */
    private static /* synthetic */ void m5284N0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 8 || i == 11 || i == 13 || i == 15 || i == 16 || i == 18 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 8 || i == 11 || i == 13 || i == 15 || i == 16 || i == 18 || i == 19) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
            case 12:
                objArr[0] = "typeArguments";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 9:
            case 14:
                objArr[0] = "typeSubstitution";
                break;
            case 17:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 8 || i == 11 || i == 13 || i == 15) {
            objArr[1] = "getMemberScope";
        } else if (i == 16) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 18) {
            objArr[1] = "substitute";
        } else if (i != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
                objArr[2] = "getMemberScope";
                break;
            case 17:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 8 && i != 11 && i != 13 && i != 15 && i != 16 && i != 18 && i != 19) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: I0 */
    public InterfaceC12777h mo5018I0() {
        InterfaceC12777h invoke = this.f29586f.invoke();
        if (invoke != null) {
            return invoke;
        }
        m5284N0(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: L0 */
    public InterfaceC12777h mo5017L0() {
        InterfaceC12777h mo4969R = mo4969R(C12747a.m6859k(C12673d.m7028g(this)));
        if (mo4969R != null) {
            return mo4969R;
        }
        m5284N0(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13437t
    /* renamed from: N */
    public InterfaceC12777h mo5008N(AbstractC13137y0 abstractC13137y0, AbstractC13026h abstractC13026h) {
        if (abstractC13137y0 == null) {
            m5284N0(9);
            throw null;
        } else if (abstractC13026h != null) {
            if (!abstractC13137y0.mo5744f()) {
                return new C12787m(mo4969R(abstractC13026h), C12959a1.m6342g(abstractC13137y0));
            }
            InterfaceC12777h mo4969R = mo4969R(abstractC13026h);
            if (mo4969R != null) {
                return mo4969R;
            }
            m5284N0(11);
            throw null;
        } else {
            m5284N0(10);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return interfaceC13517o.mo4763a(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: T0 */
    public InterfaceC13524r0 mo5015T0() {
        InterfaceC13524r0 invoke = this.f29587w.invoke();
        if (invoke != null) {
            return invoke;
        }
        m5284N0(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0
    /* renamed from: U0 */
    public InterfaceC13312e mo4686e(C12959a1 c12959a1) {
        if (c12959a1 != null) {
            return c12959a1.m6338k() ? this : new C13435s(this, c12959a1);
        }
        m5284N0(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public InterfaceC13312e mo4651a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC13334h mo4651a() {
        mo4651a();
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13310d0
    /* renamed from: b */
    public C12614f mo5012b() {
        C12614f c12614f = this.f29584d;
        if (c12614f != null) {
            return c12614f;
        }
        m5284N0(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e
    /* renamed from: k0 */
    public InterfaceC12777h mo5011k0(AbstractC13137y0 abstractC13137y0) {
        if (abstractC13137y0 != null) {
            InterfaceC12777h mo5008N = mo5008N(abstractC13137y0, C12747a.m6859k(C12673d.m7028g(this)));
            if (mo5008N != null) {
                return mo5008N;
            }
            m5284N0(15);
            throw null;
        }
        m5284N0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: x */
    public AbstractC13010i0 mo5010x() {
        AbstractC13010i0 invoke = this.f29585e.invoke();
        if (invoke != null) {
            return invoke;
        }
        m5284N0(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC13513m mo4651a() {
        mo4651a();
        return this;
    }
}
