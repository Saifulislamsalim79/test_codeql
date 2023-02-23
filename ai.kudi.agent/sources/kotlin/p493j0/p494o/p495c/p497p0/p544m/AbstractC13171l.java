package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.l */
/* loaded from: classes3.dex */
public abstract class AbstractC13171l implements InterfaceC13142b {

    /* renamed from: a */
    private final String f29291a;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.l$a */
    /* loaded from: classes3.dex */
    public static final class C13172a extends AbstractC13171l {

        /* renamed from: b */
        private final int f29292b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C13172a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L18
                java.lang.String r1 = "s"
                goto L1a
            L18:
                java.lang.String r1 = ""
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f29292b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p544m.AbstractC13171l.C13172a.<init>(int):void");
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
        /* renamed from: c */
        public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "functionDescriptor");
            return interfaceC13554x.mo5072k().size() >= this.f29292b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.l$b */
    /* loaded from: classes3.dex */
    public static final class C13173b extends AbstractC13171l {

        /* renamed from: b */
        private final int f29293b;

        public C13173b(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.f29293b = i;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
        /* renamed from: c */
        public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "functionDescriptor");
            return interfaceC13554x.mo5072k().size() == this.f29293b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.l$c */
    /* loaded from: classes3.dex */
    public static final class C13174c extends AbstractC13171l {

        /* renamed from: b */
        public static final C13174c f29294b = new C13174c();

        private C13174c() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
        /* renamed from: c */
        public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "functionDescriptor");
            return interfaceC13554x.mo5072k().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.l$d */
    /* loaded from: classes3.dex */
    public static final class C13175d extends AbstractC13171l {

        /* renamed from: b */
        public static final C13175d f29295b = new C13175d();

        private C13175d() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
        /* renamed from: c */
        public boolean mo5716c(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "functionDescriptor");
            return interfaceC13554x.mo5072k().size() == 1;
        }
    }

    private AbstractC13171l(String str) {
        this.f29291a = str;
    }

    public /* synthetic */ AbstractC13171l(String str, g gVar) {
        this(str);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: a */
    public String mo5718a() {
        return this.f29291a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.InterfaceC13142b
    /* renamed from: b */
    public String mo5717b(InterfaceC13554x interfaceC13554x) {
        return InterfaceC13142b.C13143a.m5734a(this, interfaceC13554x);
    }
}
