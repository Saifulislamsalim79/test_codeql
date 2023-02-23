package p201g.p259r;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p491i0.C11837e;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13736w;
import p201g.p259r.AbstractC7905j0;
import p201g.p259r.AbstractC8061y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Separators.kt */
/* renamed from: g.r.c1 */
/* loaded from: classes2.dex */
public final class C7837c1<R, T extends R> {

    /* renamed from: a */
    private final EnumC7911j1 f18717a;

    /* renamed from: b */
    private final InterfaceC11772q<T, T, InterfaceC11714d<? super R>, Object> f18718b;

    /* renamed from: c */
    private final List<C7936k1<T>> f18719c;

    /* renamed from: d */
    private boolean f18720d;

    /* renamed from: e */
    private boolean f18721e;

    /* renamed from: f */
    private final C7865e0 f18722f;

    /* renamed from: g */
    private C7825a0 f18723g;

    /* renamed from: h */
    private int f18724h;

    /* renamed from: i */
    private int f18725i;

    /* renamed from: j */
    private boolean f18726j;

    /* renamed from: k */
    private boolean f18727k;

    /* compiled from: Separators.kt */
    /* renamed from: g.r.c1$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7838a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18728a;

        static {
            int[] iArr = new int[EnumC7911j1.values().length];
            iArr[EnumC7911j1.FULLY_COMPLETE.ordinal()] = 1;
            iArr[EnumC7911j1.SOURCE_COMPLETE.ordinal()] = 2;
            f18728a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Separators.kt */
    /* renamed from: g.r.c1$b */
    /* loaded from: classes2.dex */
    public static final class C7839b extends AbstractC11802m implements InterfaceC11767l<C7936k1<T>, Boolean> {

        /* renamed from: c */
        final /* synthetic */ C11837e f18729c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7839b(C11837e c11837e) {
            super(1);
            this.f18729c = c11837e;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Boolean invoke(C7936k1<T> c7936k1) {
            l.f(c7936k1, "stash");
            int[] m17025e = c7936k1.m17025e();
            C11837e c11837e = this.f18729c;
            int length = m17025e.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (c11837e.m10286F(m17025e[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Separators.kt */
    @f(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {213, 215}, m = "onEvent")
    /* renamed from: g.r.c1$c */
    /* loaded from: classes2.dex */
    public static final class C7840c extends AbstractC11738d {

        /* renamed from: c */
        Object f18730c;

        /* renamed from: d */
        /* synthetic */ Object f18731d;

        /* renamed from: e */
        final /* synthetic */ C7837c1<R, T> f18732e;

        /* renamed from: f */
        int f18733f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7840c(C7837c1<R, T> c7837c1, InterfaceC11714d<? super C7840c> interfaceC11714d) {
            super(interfaceC11714d);
            this.f18732e = c7837c1;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f18731d = obj;
            this.f18733f |= Integer.MIN_VALUE;
            return this.f18732e.m17188n(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Separators.kt */
    @f(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {305, 368, 380, 386, 398, 407, 429, 438, 451, 462}, m = "onInsert")
    /* renamed from: g.r.c1$d */
    /* loaded from: classes2.dex */
    public static final class C7841d extends AbstractC11738d {

        /* renamed from: A */
        Object f18734A;

        /* renamed from: B */
        Object f18735B;

        /* renamed from: C */
        boolean f18736C;

        /* renamed from: D */
        int f18737D;

        /* renamed from: E */
        int f18738E;

        /* renamed from: F */
        int f18739F;

        /* renamed from: G */
        int f18740G;

        /* renamed from: H */
        /* synthetic */ Object f18741H;

        /* renamed from: I */
        final /* synthetic */ C7837c1<R, T> f18742I;

        /* renamed from: J */
        int f18743J;

        /* renamed from: c */
        Object f18744c;

        /* renamed from: d */
        Object f18745d;

        /* renamed from: e */
        Object f18746e;

        /* renamed from: f */
        Object f18747f;

        /* renamed from: w */
        Object f18748w;

        /* renamed from: x */
        Object f18749x;

        /* renamed from: y */
        Object f18750y;

        /* renamed from: z */
        Object f18751z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7841d(C7837c1<R, T> c7837c1, InterfaceC11714d<? super C7841d> interfaceC11714d) {
            super(interfaceC11714d);
            this.f18742I = c7837c1;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f18741H = obj;
            this.f18743J |= Integer.MIN_VALUE;
            return this.f18742I.m17187o(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7837c1(EnumC7911j1 enumC7911j1, InterfaceC11772q<? super T, ? super T, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11772q) {
        l.f(enumC7911j1, "terminalSeparatorType");
        l.f(interfaceC11772q, "generator");
        this.f18717a = enumC7911j1;
        this.f18718b = interfaceC11772q;
        this.f18719c = new ArrayList();
        this.f18722f = new C7865e0();
    }

    /* renamed from: z */
    private final <T> C7936k1<T> m17176z(C7936k1<T> c7936k1) {
        List m3888h;
        Integer num;
        List m3888h2;
        int[] m17025e = c7936k1.m17025e();
        m3888h = C13726r.m3888h(C13722p.m3954R(c7936k1.m17028b()), C13722p.m3943c0(c7936k1.m17028b()));
        int m17026d = c7936k1.m17026d();
        Integer[] numArr = new Integer[2];
        List<Integer> m17027c = c7936k1.m17027c();
        numArr[0] = Integer.valueOf((m17027c == null || (num = (Integer) C13722p.m3954R(m17027c)) == null) ? 0 : num.intValue());
        List<Integer> m17027c2 = c7936k1.m17027c();
        Integer num2 = m17027c2 == null ? null : (Integer) C13722p.m3943c0(m17027c2);
        numArr[1] = Integer.valueOf(num2 == null ? C13726r.m3889g(c7936k1.m17028b()) : num2.intValue());
        m3888h2 = C13726r.m3888h(numArr);
        return new C7936k1<>(m17025e, m3888h, m17026d, m3888h2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final AbstractC7905j0.C7907b<R> m17201a(AbstractC7905j0.C7907b<T> c7907b) {
        l.f(c7907b, "<this>");
        return c7907b;
    }

    /* renamed from: b */
    public final boolean m17200b() {
        return this.f18720d;
    }

    /* renamed from: c */
    public final boolean m17199c() {
        return this.f18726j;
    }

    /* renamed from: d */
    public final InterfaceC11772q<T, T, InterfaceC11714d<? super R>, Object> m17198d() {
        return this.f18718b;
    }

    /* renamed from: e */
    public final boolean m17197e() {
        return this.f18727k;
    }

    /* renamed from: f */
    public final C7825a0 m17196f() {
        return this.f18723g;
    }

    /* renamed from: g */
    public final List<C7936k1<T>> m17195g() {
        return this.f18719c;
    }

    /* renamed from: h */
    public final int m17194h() {
        return this.f18725i;
    }

    /* renamed from: i */
    public final int m17193i() {
        return this.f18724h;
    }

    /* renamed from: j */
    public final C7865e0 m17192j() {
        return this.f18722f;
    }

    /* renamed from: k */
    public final boolean m17191k() {
        return this.f18721e;
    }

    /* renamed from: l */
    public final EnumC7911j1 m17190l() {
        return this.f18717a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public final AbstractC7905j0.C7906a<R> m17189m(AbstractC7905j0.C7906a<T> c7906a) {
        l.f(c7906a, "event");
        this.f18722f.m17125c(c7906a.m17079c(), AbstractC8061y.C8064c.f19411b.m16800b());
        if (c7906a.m17079c() == EnumC7830b0.PREPEND) {
            this.f18724h = c7906a.m17075g();
            this.f18727k = false;
        } else if (c7906a.m17079c() == EnumC7830b0.APPEND) {
            this.f18725i = c7906a.m17075g();
            this.f18726j = false;
        }
        if (this.f18719c.isEmpty()) {
            if (c7906a.m17079c() == EnumC7830b0.PREPEND) {
                this.f18721e = false;
            } else {
                this.f18720d = false;
            }
        }
        C13736w.m3846z(this.f18719c, new C7839b(new C11837e(c7906a.m17077e(), c7906a.m17078d())));
        return c7906a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m17188n(p201g.p259r.AbstractC7905j0<T> r6, kotlin.p476c0.InterfaceC11714d<? super p201g.p259r.AbstractC7905j0<R>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p201g.p259r.C7837c1.C7840c
            if (r0 == 0) goto L13
            r0 = r7
            g.r.c1$c r0 = (p201g.p259r.C7837c1.C7840c) r0
            int r1 = r0.f18733f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18733f = r1
            goto L18
        L13:
            g.r.c1$c r0 = new g.r.c1$c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18731d
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f18733f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f18730c
            g.r.c1 r6 = (p201g.p259r.C7837c1) r6
            kotlin.C13291q.m5357b(r7)
            goto L76
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f18730c
            g.r.c1 r6 = (p201g.p259r.C7837c1) r6
            kotlin.C13291q.m5357b(r7)
            goto L55
        L40:
            kotlin.C13291q.m5357b(r7)
            boolean r7 = r6 instanceof p201g.p259r.AbstractC7905j0.C7907b
            if (r7 == 0) goto L58
            g.r.j0$b r6 = (p201g.p259r.AbstractC7905j0.C7907b) r6
            r0.f18730c = r5
            r0.f18733f = r4
            java.lang.Object r7 = r5.m17187o(r6, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r6 = r5
        L55:
            g.r.j0 r7 = (p201g.p259r.AbstractC7905j0) r7
            goto L78
        L58:
            boolean r7 = r6 instanceof p201g.p259r.AbstractC7905j0.C7906a
            if (r7 == 0) goto L64
            r7 = r6
            g.r.j0$a r7 = (p201g.p259r.AbstractC7905j0.C7906a) r7
            r5.m17189m(r7)
            r6 = r5
            goto L78
        L64:
            boolean r7 = r6 instanceof p201g.p259r.AbstractC7905j0.C7910c
            if (r7 == 0) goto Lb3
            g.r.j0$c r6 = (p201g.p259r.AbstractC7905j0.C7910c) r6
            r0.f18730c = r5
            r0.f18733f = r3
            java.lang.Object r7 = r5.m17186p(r6, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            r6 = r5
        L76:
            g.r.j0 r7 = (p201g.p259r.AbstractC7905j0) r7
        L78:
            boolean r0 = r6.m17200b()
            if (r0 == 0) goto L95
            java.util.List r0 = r6.m17195g()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L89
            goto L95
        L89:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "deferred endTerm, page stash should be empty"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L95:
            boolean r0 = r6.m17191k()
            if (r0 == 0) goto Lb2
            java.util.List r6 = r6.m17195g()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto La6
            goto Lb2
        La6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "deferred startTerm, page stash should be empty"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        Lb2:
            return r7
        Lb3:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7837c1.m17188n(g.r.j0, kotlin.c0.d):java.lang.Object");
    }

    /* JADX WARN: Incorrect condition in loop: B:101:0x036f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x059c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302  */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x04a3 -> B:140:0x04ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x06d9 -> B:207:0x06dc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:235:0x07e0 -> B:236:0x07e1). Please submit an issue!!! */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m17187o(p201g.p259r.AbstractC7905j0.C7907b<T> r32, kotlin.p476c0.InterfaceC11714d<? super p201g.p259r.AbstractC7905j0.C7907b<R>> r33) {
        /*
            Method dump skipped, instructions count: 2296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7837c1.m17187o(g.r.j0$b, kotlin.c0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final Object m17186p(AbstractC7905j0.C7910c<T> c7910c, InterfaceC11714d<? super AbstractC7905j0<R>> interfaceC11714d) {
        List m3891e;
        List m3891e2;
        C7825a0 m17196f = m17196f();
        if (l.b(m17192j().m17124d(), c7910c.m17058d()) && l.b(m17196f, c7910c.m17059c())) {
            return c7910c;
        }
        m17192j().m17126b(c7910c.m17058d());
        m17182t(c7910c.m17059c());
        if (c7910c.m17059c() != null && c7910c.m17059c().m17217f().m16805a()) {
            if (!l.b(m17196f == null ? null : m17196f.m17217f(), c7910c.m17059c().m17217f())) {
                AbstractC7905j0.C7907b.C7908a c7908a = AbstractC7905j0.C7907b.f18953g;
                m3891e2 = C13726r.m3891e();
                return m17187o(c7908a.m17063b(m3891e2, m17193i(), c7910c.m17058d(), c7910c.m17059c()), interfaceC11714d);
            }
        }
        if (c7910c.m17059c() == null || !c7910c.m17059c().m17218e().m16805a()) {
            return c7910c;
        }
        if (l.b(m17196f != null ? m17196f.m17218e() : null, c7910c.m17059c().m17218e())) {
            return c7910c;
        }
        AbstractC7905j0.C7907b.C7908a c7908a2 = AbstractC7905j0.C7907b.f18953g;
        m3891e = C13726r.m3891e();
        return m17187o(c7908a2.m17064a(m3891e, m17194h(), c7910c.m17058d(), c7910c.m17059c()), interfaceC11714d);
    }

    /* renamed from: q */
    public final void m17185q(boolean z) {
        this.f18720d = z;
    }

    /* renamed from: r */
    public final void m17184r(boolean z) {
        this.f18726j = z;
    }

    /* renamed from: s */
    public final void m17183s(boolean z) {
        this.f18727k = z;
    }

    /* renamed from: t */
    public final void m17182t(C7825a0 c7825a0) {
        this.f18723g = c7825a0;
    }

    /* renamed from: u */
    public final void m17181u(int i) {
        this.f18725i = i;
    }

    /* renamed from: v */
    public final void m17180v(int i) {
        this.f18724h = i;
    }

    /* renamed from: w */
    public final void m17179w(boolean z) {
        this.f18721e = z;
    }

    /* renamed from: x */
    public final <T> boolean m17178x(AbstractC7905j0.C7907b<T> c7907b, EnumC7911j1 enumC7911j1) {
        AbstractC8061y m17218e;
        l.f(c7907b, "<this>");
        l.f(enumC7911j1, "terminalSeparatorType");
        if (c7907b.m17070f() == EnumC7830b0.PREPEND) {
            return this.f18720d;
        }
        int i = C7838a.f18728a[enumC7911j1.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c7907b.m17065k().m17218e().m16805a();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (c7907b.m17065k().m17218e().m16805a()) {
            C7825a0 m17069g = c7907b.m17069g();
            if (!((m17069g == null || (m17218e = m17069g.m17218e()) == null || m17218e.m16805a()) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public final <T> boolean m17177y(AbstractC7905j0.C7907b<T> c7907b, EnumC7911j1 enumC7911j1) {
        AbstractC8061y m17217f;
        l.f(c7907b, "<this>");
        l.f(enumC7911j1, "terminalSeparatorType");
        if (c7907b.m17070f() == EnumC7830b0.APPEND) {
            return this.f18721e;
        }
        int i = C7838a.f18728a[enumC7911j1.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c7907b.m17065k().m17217f().m16805a();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (c7907b.m17065k().m17217f().m16805a()) {
            C7825a0 m17069g = c7907b.m17069g();
            if (!((m17069g == null || (m17217f = m17069g.m17217f()) == null || m17217f.m16805a()) ? false : true)) {
                return true;
            }
        }
        return false;
    }
}
