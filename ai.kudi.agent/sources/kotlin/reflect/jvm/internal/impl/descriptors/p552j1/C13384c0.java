package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.AbstractC12712g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.C12795b;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12949j;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13137y0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12959a1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13103o;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13520p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13522q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13547v;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.utils.C13658h;
/* compiled from: PropertyDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.c0 */
/* loaded from: classes3.dex */
public class C13384c0 extends AbstractC13424n0 implements InterfaceC13518o0 {

    /* renamed from: A */
    private AbstractC13544u f29605A;

    /* renamed from: B */
    private Collection<? extends InterfaceC13518o0> f29606B;

    /* renamed from: C */
    private final InterfaceC13518o0 f29607C;

    /* renamed from: D */
    private final InterfaceC13300b.EnumC13301a f29608D;

    /* renamed from: E */
    private final boolean f29609E;

    /* renamed from: F */
    private final boolean f29610F;

    /* renamed from: G */
    private final boolean f29611G;

    /* renamed from: H */
    private final boolean f29612H;

    /* renamed from: I */
    private final boolean f29613I;

    /* renamed from: J */
    private final boolean f29614J;

    /* renamed from: K */
    private InterfaceC13524r0 f29615K;

    /* renamed from: L */
    private InterfaceC13524r0 f29616L;

    /* renamed from: M */
    private List<InterfaceC13562z0> f29617M;

    /* renamed from: N */
    private C13390d0 f29618N;

    /* renamed from: O */
    private InterfaceC13522q0 f29619O;

    /* renamed from: P */
    private boolean f29620P;

    /* renamed from: Q */
    private InterfaceC13547v f29621Q;

    /* renamed from: R */
    private InterfaceC13547v f29622R;

    /* renamed from: z */
    private final EnumC13560z f29623z;

    /* compiled from: PropertyDescriptorImpl.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.c0$a */
    /* loaded from: classes3.dex */
    public class C13385a {

        /* renamed from: a */
        private InterfaceC13513m f29624a;

        /* renamed from: b */
        private EnumC13560z f29625b;

        /* renamed from: c */
        private AbstractC13544u f29626c;

        /* renamed from: f */
        private InterfaceC13300b.EnumC13301a f29629f;

        /* renamed from: i */
        private InterfaceC13524r0 f29632i;

        /* renamed from: k */
        private C12614f f29634k;

        /* renamed from: l */
        private AbstractC12965b0 f29635l;

        /* renamed from: d */
        private InterfaceC13518o0 f29627d = null;

        /* renamed from: e */
        private boolean f29628e = false;

        /* renamed from: g */
        private AbstractC13137y0 f29630g = AbstractC13137y0.f29220a;

        /* renamed from: h */
        private boolean f29631h = true;

        /* renamed from: j */
        private List<InterfaceC13562z0> f29633j = null;

        public C13385a() {
            this.f29624a = C13384c0.this.mo4687d();
            this.f29625b = C13384c0.this.mo4658o();
            this.f29626c = C13384c0.this.mo4659i();
            this.f29629f = C13384c0.this.mo5057w();
            this.f29632i = C13384c0.this.f29615K;
            this.f29634k = C13384c0.this.mo5012b();
            this.f29635l = C13384c0.this.mo5121c();
        }

        /* renamed from: a */
        private static /* synthetic */ void m5249a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: n */
        public InterfaceC13518o0 m5236n() {
            return C13384c0.this.m5261a1(this);
        }

        /* renamed from: o */
        InterfaceC13520p0 m5235o() {
            InterfaceC13518o0 interfaceC13518o0 = this.f29627d;
            if (interfaceC13518o0 == null) {
                return null;
            }
            return interfaceC13518o0.mo4747q();
        }

        /* renamed from: p */
        InterfaceC13522q0 m5234p() {
            InterfaceC13518o0 interfaceC13518o0 = this.f29627d;
            if (interfaceC13518o0 == null) {
                return null;
            }
            return interfaceC13518o0.mo4748i0();
        }

        /* renamed from: q */
        public C13385a m5233q(boolean z) {
            this.f29631h = z;
            return this;
        }

        /* renamed from: r */
        public C13385a m5232r(InterfaceC13300b.EnumC13301a enumC13301a) {
            if (enumC13301a != null) {
                this.f29629f = enumC13301a;
                return this;
            }
            m5249a(10);
            throw null;
        }

        /* renamed from: s */
        public C13385a m5231s(EnumC13560z enumC13560z) {
            if (enumC13560z != null) {
                this.f29625b = enumC13560z;
                return this;
            }
            m5249a(6);
            throw null;
        }

        /* renamed from: t */
        public C13385a m5230t(InterfaceC13300b interfaceC13300b) {
            this.f29627d = (InterfaceC13518o0) interfaceC13300b;
            return this;
        }

        /* renamed from: u */
        public C13385a m5229u(InterfaceC13513m interfaceC13513m) {
            if (interfaceC13513m != null) {
                this.f29624a = interfaceC13513m;
                return this;
            }
            m5249a(0);
            throw null;
        }

        /* renamed from: v */
        public C13385a m5228v(AbstractC13137y0 abstractC13137y0) {
            if (abstractC13137y0 != null) {
                this.f29630g = abstractC13137y0;
                return this;
            }
            m5249a(15);
            throw null;
        }

        /* renamed from: w */
        public C13385a m5227w(AbstractC13544u abstractC13544u) {
            if (abstractC13544u != null) {
                this.f29626c = abstractC13544u;
                return this;
            }
            m5249a(8);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13384c0(InterfaceC13513m interfaceC13513m, InterfaceC13518o0 interfaceC13518o0, InterfaceC13346g interfaceC13346g, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, boolean z, C12614f c12614f, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(interfaceC13513m, interfaceC13346g, c12614f, null, z, interfaceC13545u0);
        if (interfaceC13513m == null) {
            m5267N(0);
            throw null;
        } else if (interfaceC13346g == null) {
            m5267N(1);
            throw null;
        } else if (enumC13560z == null) {
            m5267N(2);
            throw null;
        } else if (abstractC13544u == null) {
            m5267N(3);
            throw null;
        } else if (c12614f == null) {
            m5267N(4);
            throw null;
        } else if (enumC13301a == null) {
            m5267N(5);
            throw null;
        } else if (interfaceC13545u0 != null) {
            this.f29606B = null;
            this.f29623z = enumC13560z;
            this.f29605A = abstractC13544u;
            this.f29607C = interfaceC13518o0 == null ? this : interfaceC13518o0;
            this.f29608D = enumC13301a;
            this.f29609E = z2;
            this.f29610F = z3;
            this.f29611G = z4;
            this.f29612H = z5;
            this.f29613I = z6;
            this.f29614J = z7;
        } else {
            m5267N(6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m5267N(int r11) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13384c0.m5267N(int):void");
    }

    /* renamed from: Y0 */
    public static C13384c0 m5263Y0(InterfaceC13513m interfaceC13513m, InterfaceC13346g interfaceC13346g, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, boolean z, C12614f c12614f, InterfaceC13300b.EnumC13301a enumC13301a, InterfaceC13545u0 interfaceC13545u0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (interfaceC13513m == null) {
            m5267N(7);
            throw null;
        } else if (interfaceC13346g == null) {
            m5267N(8);
            throw null;
        } else if (enumC13560z == null) {
            m5267N(9);
            throw null;
        } else if (abstractC13544u == null) {
            m5267N(10);
            throw null;
        } else if (c12614f == null) {
            m5267N(11);
            throw null;
        } else if (enumC13301a == null) {
            m5267N(12);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C13384c0(interfaceC13513m, null, interfaceC13346g, enumC13560z, abstractC13544u, z, c12614f, enumC13301a, interfaceC13545u0, z2, z3, z4, z5, z6, z7);
        } else {
            m5267N(13);
            throw null;
        }
    }

    /* renamed from: c1 */
    private InterfaceC13545u0 m5259c1(boolean z, InterfaceC13518o0 interfaceC13518o0) {
        InterfaceC13545u0 interfaceC13545u0;
        if (z) {
            if (interfaceC13518o0 == null) {
                interfaceC13518o0 = mo4651a();
            }
            interfaceC13545u0 = interfaceC13518o0.mo4745m();
        } else {
            interfaceC13545u0 = InterfaceC13545u0.f29903a;
        }
        if (interfaceC13545u0 != null) {
            return interfaceC13545u0;
        }
        m5267N(23);
        throw null;
    }

    /* renamed from: d1 */
    private static InterfaceC13554x m5258d1(C12959a1 c12959a1, InterfaceC13516n0 interfaceC13516n0) {
        if (c12959a1 == null) {
            m5267N(25);
            throw null;
        } else if (interfaceC13516n0 != null) {
            if (interfaceC13516n0.mo4684n0() != null) {
                return interfaceC13516n0.mo4684n0().mo4686e(c12959a1);
            }
            return null;
        } else {
            m5267N(26);
            throw null;
        }
    }

    /* renamed from: i1 */
    private static AbstractC13544u m5253i1(AbstractC13544u abstractC13544u, InterfaceC13300b.EnumC13301a enumC13301a) {
        return (enumC13301a == InterfaceC13300b.EnumC13301a.FAKE_OVERRIDE && C13530t.m4728g(abstractC13544u.mo4707f())) ? C13530t.f29895h : abstractC13544u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0
    /* renamed from: A0 */
    public InterfaceC13547v mo4750A0() {
        return this.f29621Q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1
    /* renamed from: B0 */
    public boolean mo5139B0() {
        return this.f29609E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0
    /* renamed from: C */
    public List<InterfaceC13516n0> mo4749C() {
        ArrayList arrayList = new ArrayList(2);
        C13390d0 c13390d0 = this.f29618N;
        if (c13390d0 != null) {
            arrayList.add(c13390d0);
        }
        InterfaceC13522q0 interfaceC13522q0 = this.f29619O;
        if (interfaceC13522q0 != null) {
            arrayList.add(interfaceC13522q0);
        }
        return arrayList;
    }

    /* renamed from: E */
    public boolean mo4662E() {
        return this.f29613I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13311d1
    /* renamed from: G */
    public boolean mo5124G() {
        return this.f29610F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: H0 */
    public void mo5092H0(Collection<? extends InterfaceC13300b> collection) {
        if (collection != 0) {
            this.f29606B = collection;
        } else {
            m5267N(35);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: M0 */
    public boolean mo4661M0() {
        return this.f29612H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return interfaceC13517o.mo4760d(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: T */
    public boolean mo4660T() {
        return this.f29611G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13318e1
    /* renamed from: W */
    public boolean mo5266W() {
        return this.f29614J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: X0 */
    public InterfaceC13518o0 mo5059u0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13300b.EnumC13301a enumC13301a, boolean z) {
        C13385a m5254h1 = m5254h1();
        m5254h1.m5229u(interfaceC13513m);
        m5254h1.m5230t(null);
        m5254h1.m5231s(enumC13560z);
        m5254h1.m5227w(abstractC13544u);
        m5254h1.m5232r(enumC13301a);
        m5254h1.m5233q(z);
        InterfaceC13518o0 m5236n = m5254h1.m5236n();
        if (m5236n != null) {
            return m5236n;
        }
        m5267N(37);
        throw null;
    }

    /* renamed from: Z0 */
    protected C13384c0 mo5262Z0(InterfaceC13513m interfaceC13513m, EnumC13560z enumC13560z, AbstractC13544u abstractC13544u, InterfaceC13518o0 interfaceC13518o0, InterfaceC13300b.EnumC13301a enumC13301a, C12614f c12614f, InterfaceC13545u0 interfaceC13545u0) {
        if (interfaceC13513m == null) {
            m5267N(27);
            throw null;
        } else if (enumC13560z == null) {
            m5267N(28);
            throw null;
        } else if (abstractC13544u == null) {
            m5267N(29);
            throw null;
        } else if (enumC13301a == null) {
            m5267N(30);
            throw null;
        } else if (c12614f == null) {
            m5267N(31);
            throw null;
        } else if (interfaceC13545u0 != null) {
            return new C13384c0(interfaceC13513m, interfaceC13518o0, mo4956y(), enumC13560z, abstractC13544u, mo5093t0(), c12614f, enumC13301a, interfaceC13545u0, mo5139B0(), mo5124G(), mo4660T(), mo4661M0(), mo4662E(), mo5266W());
        } else {
            m5267N(32);
            throw null;
        }
    }

    /* renamed from: a1 */
    protected InterfaceC13518o0 m5261a1(C13385a c13385a) {
        InterfaceC13524r0 interfaceC13524r0;
        C13398f0 c13398f0;
        InterfaceC12949j<AbstractC12712g<?>> interfaceC12949j;
        if (c13385a != null) {
            C13384c0 mo5262Z0 = mo5262Z0(c13385a.f29624a, c13385a.f29625b, c13385a.f29626c, c13385a.f29627d, c13385a.f29629f, c13385a.f29634k, m5259c1(c13385a.f29628e, c13385a.f29627d));
            List<InterfaceC13562z0> mo4942l = c13385a.f29633j == null ? mo4942l() : c13385a.f29633j;
            ArrayList arrayList = new ArrayList(mo4942l.size());
            C12959a1 m5859b = C13103o.m5859b(mo4942l, c13385a.f29630g, mo5262Z0, arrayList);
            AbstractC12965b0 m6333p = m5859b.m6333p(c13385a.f29635l, EnumC13008h1.OUT_VARIANCE);
            if (m6333p == null) {
                return null;
            }
            InterfaceC13524r0 interfaceC13524r02 = c13385a.f29632i;
            if (interfaceC13524r02 != null) {
                interfaceC13524r0 = interfaceC13524r02.mo4686e(m5859b);
                if (interfaceC13524r0 == null) {
                    return null;
                }
            } else {
                interfaceC13524r0 = null;
            }
            InterfaceC13524r0 interfaceC13524r03 = this.f29616L;
            if (interfaceC13524r03 != null) {
                AbstractC12965b0 m6333p2 = m5859b.m6333p(interfaceC13524r03.mo5121c(), EnumC13008h1.IN_VARIANCE);
                if (m6333p2 == null) {
                    return null;
                }
                c13398f0 = new C13398f0(mo5262Z0, new C12795b(mo5262Z0, m6333p2, this.f29616L.getValue()), this.f29616L.mo4956y());
            } else {
                c13398f0 = null;
            }
            mo5262Z0.m5251k1(m6333p, arrayList, interfaceC13524r0, c13398f0);
            C13390d0 c13390d0 = this.f29618N == null ? null : new C13390d0(mo5262Z0, this.f29618N.mo4956y(), c13385a.f29625b, m5253i1(this.f29618N.mo4659i(), c13385a.f29629f), this.f29618N.mo4764d0(), this.f29618N.mo4662E(), this.f29618N.mo4683z(), c13385a.f29629f, c13385a.m5235o(), InterfaceC13545u0.f29903a);
            if (c13390d0 != null) {
                AbstractC12965b0 mo4943j = this.f29618N.mo4943j();
                c13390d0.m5271Y0(m5258d1(m5859b, this.f29618N));
                c13390d0.m5213b1(mo4943j != null ? m5859b.m6333p(mo4943j, EnumC13008h1.OUT_VARIANCE) : null);
            }
            C13396e0 c13396e0 = this.f29619O == null ? null : new C13396e0(mo5262Z0, this.f29619O.mo4956y(), c13385a.f29625b, m5253i1(this.f29619O.mo4659i(), c13385a.f29629f), this.f29619O.mo4764d0(), this.f29619O.mo4662E(), this.f29619O.mo4683z(), c13385a.f29629f, c13385a.m5234p(), InterfaceC13545u0.f29903a);
            if (c13396e0 != null) {
                List<InterfaceC13307c1> m5082a1 = AbstractC13426p.m5082a1(c13396e0, this.f29619O.mo5072k(), m5859b, false, false, null);
                if (m5082a1 == null) {
                    mo5262Z0.m5252j1(true);
                    m5082a1 = Collections.singletonList(C13396e0.m5194a1(c13396e0, C12747a.m6863g(c13385a.f29624a).m9925H(), this.f29619O.mo5072k().get(0).mo4956y()));
                }
                if (m5082a1.size() == 1) {
                    c13396e0.m5271Y0(m5258d1(m5859b, this.f29619O));
                    c13396e0.m5192c1(m5082a1.get(0));
                } else {
                    throw new IllegalStateException();
                }
            }
            InterfaceC13547v interfaceC13547v = this.f29621Q;
            C13425o c13425o = interfaceC13547v == null ? null : new C13425o(interfaceC13547v.mo4956y(), mo5262Z0);
            InterfaceC13547v interfaceC13547v2 = this.f29622R;
            mo5262Z0.m5256f1(c13390d0, c13396e0, c13425o, interfaceC13547v2 != null ? new C13425o(interfaceC13547v2.mo4956y(), mo5262Z0) : null);
            if (c13385a.f29631h) {
                C13658h m4240d = C13658h.m4240d();
                for (InterfaceC13518o0 interfaceC13518o0 : mo4685g()) {
                    m4240d.add(interfaceC13518o0.mo4686e(m5859b));
                }
                mo5262Z0.mo5092H0(m4240d);
            }
            if (mo5124G() && (interfaceC12949j = this.f29712y) != null) {
                mo5262Z0.m5095V0(interfaceC12949j);
            }
            return mo5262Z0;
        }
        m5267N(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0
    /* renamed from: b1 */
    public C13390d0 mo4747q() {
        return this.f29618N;
    }

    /* renamed from: e1 */
    public void m5257e1(C13390d0 c13390d0, InterfaceC13522q0 interfaceC13522q0) {
        m5256f1(c13390d0, interfaceC13522q0, null, null);
    }

    /* renamed from: f1 */
    public void m5256f1(C13390d0 c13390d0, InterfaceC13522q0 interfaceC13522q0, InterfaceC13547v interfaceC13547v, InterfaceC13547v interfaceC13547v2) {
        this.f29618N = c13390d0;
        this.f29619O = interfaceC13522q0;
        this.f29621Q = interfaceC13547v;
        this.f29622R = interfaceC13547v2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: g */
    public Collection<? extends InterfaceC13518o0> mo4685g() {
        Collection<? extends InterfaceC13518o0> collection = this.f29606B;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        m5267N(36);
        throw null;
    }

    /* renamed from: g1 */
    public boolean m5255g1() {
        return this.f29620P;
    }

    /* renamed from: h1 */
    public C13385a m5254h1() {
        return new C13385a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13521q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: i */
    public AbstractC13544u mo4659i() {
        AbstractC13544u abstractC13544u = this.f29605A;
        if (abstractC13544u != null) {
            return abstractC13544u;
        }
        m5267N(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0
    /* renamed from: i0 */
    public InterfaceC13522q0 mo4748i0() {
        return this.f29619O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: j */
    public AbstractC12965b0 mo4943j() {
        AbstractC12965b0 mo5121c = mo5121c();
        if (mo5121c != null) {
            return mo5121c;
        }
        m5267N(18);
        throw null;
    }

    /* renamed from: j1 */
    public void m5252j1(boolean z) {
        this.f29620P = z;
    }

    /* renamed from: k1 */
    public void m5251k1(AbstractC12965b0 abstractC12965b0, List<? extends InterfaceC13562z0> list, InterfaceC13524r0 interfaceC13524r0, InterfaceC13524r0 interfaceC13524r02) {
        if (abstractC12965b0 == null) {
            m5267N(14);
            throw null;
        } else if (list != null) {
            m5122U0(abstractC12965b0);
            this.f29617M = new ArrayList(list);
            this.f29616L = interfaceC13524r02;
            this.f29615K = interfaceC13524r0;
        } else {
            m5267N(15);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: l */
    public List<InterfaceC13562z0> mo4942l() {
        List<InterfaceC13562z0> list = this.f29617M;
        if (list != null) {
            if (list != null) {
                return list;
            }
            m5267N(17);
            throw null;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    /* renamed from: l1 */
    public void m5250l1(AbstractC13544u abstractC13544u) {
        if (abstractC13544u != null) {
            this.f29605A = abstractC13544u;
        } else {
            m5267N(16);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13558y
    /* renamed from: o */
    public EnumC13560z mo4658o() {
        EnumC13560z enumC13560z = this.f29623z;
        if (enumC13560z != null) {
            return enumC13560z;
        }
        m5267N(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: p0 */
    public InterfaceC13524r0 mo5066p0() {
        return this.f29615K;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: s0 */
    public <V> V mo5062s0(InterfaceC13293a.InterfaceC13294a<V> interfaceC13294a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
    /* renamed from: w */
    public InterfaceC13300b.EnumC13301a mo5057w() {
        InterfaceC13300b.EnumC13301a enumC13301a = this.f29608D;
        if (enumC13301a != null) {
            return enumC13301a;
        }
        m5267N(34);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13417m0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a
    /* renamed from: w0 */
    public InterfaceC13524r0 mo5056w0() {
        return this.f29616L;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0
    /* renamed from: x0 */
    public InterfaceC13547v mo4746x0() {
        return this.f29622R;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13553w0
    /* renamed from: e  reason: avoid collision after fix types in other method */
    public InterfaceC13293a mo4686e(C12959a1 c12959a1) {
        if (c12959a1 != null) {
            if (c12959a1.m6338k()) {
                return this;
            }
            C13385a m5254h1 = m5254h1();
            m5254h1.m5228v(c12959a1.m6339j());
            m5254h1.m5230t(mo4651a());
            return m5254h1.m5236n();
        }
        m5267N(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public InterfaceC13518o0 mo4651a() {
        InterfaceC13518o0 interfaceC13518o0 = this.f29607C;
        InterfaceC13518o0 mo4651a = interfaceC13518o0 == this ? this : interfaceC13518o0.mo4651a();
        if (mo4651a != null) {
            return mo4651a;
        }
        m5267N(33);
        throw null;
    }
}
