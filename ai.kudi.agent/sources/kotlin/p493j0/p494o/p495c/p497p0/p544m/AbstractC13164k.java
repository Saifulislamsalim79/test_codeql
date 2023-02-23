package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.k */
/* loaded from: classes3.dex */
public abstract class AbstractC13164k implements InterfaceC13142b {

    /* renamed from: a */
    private final String f29282a;

    /* renamed from: b */
    private final InterfaceC11767l<AbstractC12046h, AbstractC12965b0> f29283b;

    /* renamed from: c */
    private final String f29284c;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.k$a */
    /* loaded from: classes3.dex */
    public static final class C13165a extends AbstractC13164k {

        /* renamed from: d */
        public static final C13165a f29285d = new C13165a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.j0.o.c.p0.m.k$a$a */
        /* loaded from: classes3.dex */
        static final class C13166a extends AbstractC11802m implements InterfaceC11767l<AbstractC12046h, AbstractC12965b0> {

            /* renamed from: c */
            public static final C13166a f29286c = new C13166a();

            C13166a() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final AbstractC12965b0 invoke(AbstractC12046h abstractC12046h) {
                l.f(abstractC12046h, "$this$null");
                AbstractC13010i0 m9882n = abstractC12046h.m9882n();
                l.e(m9882n, "booleanType");
                return m9882n;
            }
        }

        private C13165a() {
            super("Boolean", C13166a.f29286c, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.k$b */
    /* loaded from: classes3.dex */
    public static final class C13167b extends AbstractC13164k {

        /* renamed from: d */
        public static final C13167b f29287d = new C13167b();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.j0.o.c.p0.m.k$b$a */
        /* loaded from: classes3.dex */
        static final class C13168a extends AbstractC11802m implements InterfaceC11767l<AbstractC12046h, AbstractC12965b0> {

            /* renamed from: c */
            public static final C13168a f29288c = new C13168a();

            C13168a() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final AbstractC12965b0 invoke(AbstractC12046h abstractC12046h) {
                l.f(abstractC12046h, "$this$null");
                AbstractC13010i0 m9929D = abstractC12046h.m9929D();
                l.e(m9929D, "intType");
                return m9929D;
            }
        }

        private C13167b() {
            super("Int", C13168a.f29288c, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.k$c */
    /* loaded from: classes3.dex */
    public static final class C13169c extends AbstractC13164k {

        /* renamed from: d */
        public static final C13169c f29289d = new C13169c();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.j0.o.c.p0.m.k$c$a */
        /* loaded from: classes3.dex */
        static final class C13170a extends AbstractC11802m implements InterfaceC11767l<AbstractC12046h, AbstractC12965b0> {

            /* renamed from: c */
            public static final C13170a f29290c = new C13170a();

            C13170a() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final AbstractC12965b0 invoke(AbstractC12046h abstractC12046h) {
                l.f(abstractC12046h, "$this$null");
                AbstractC13010i0 m9909Y = abstractC12046h.m9909Y();
                l.e(m9909Y, "unitType");
                return m9909Y;
            }
        }

        private C13169c() {
            super("Unit", C13170a.f29290c, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC13164k(String str, InterfaceC11767l<? super AbstractC12046h, ? extends AbstractC12965b0> interfaceC11767l) {
        this.f29282a = str;
        this.f29283b = interfaceC11767l;
        this.f29284c = l.m("must return ", str);
    }

    public /* synthetic */ AbstractC13164k(String str, InterfaceC11767l interfaceC11767l, g gVar) {
        this(str, interfaceC11767l);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: a */
    public String mo5718a() {
        return this.f29284c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: b */
    public String mo5717b(InterfaceC13554x interfaceC13554x) {
        return InterfaceC13142b.C13143a.m5734a(this, interfaceC13554x);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: c */
    public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
        l.f(interfaceC13554x, "functionDescriptor");
        return l.b(interfaceC13554x.mo4943j(), this.f29283b.invoke(C12747a.m6863g(interfaceC13554x)));
    }
}
