package p201g.p259r;

import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlinx.coroutines.p564v2.C14102d;
import kotlinx.coroutines.p564v2.InterfaceC14094b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CachedPageEventFlow.kt */
/* renamed from: g.r.p */
/* loaded from: classes2.dex */
public final class C7995p<T> {

    /* renamed from: a */
    private final C8001q<T> f19248a = new C8001q<>();

    /* renamed from: b */
    private final InterfaceC14094b f19249b = C14102d.m2968b(false, 1, null);

    /* renamed from: c */
    private int f19250c = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPageEventFlow.kt */
    @f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {252}, m = "getStateAsEvents")
    /* renamed from: g.r.p$a */
    /* loaded from: classes2.dex */
    public static final class C7996a extends AbstractC11738d {

        /* renamed from: c */
        Object f19251c;

        /* renamed from: d */
        Object f19252d;

        /* renamed from: e */
        /* synthetic */ Object f19253e;

        /* renamed from: f */
        final /* synthetic */ C7995p<T> f19254f;

        /* renamed from: w */
        int f19255w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7996a(C7995p<T> c7995p, InterfaceC11714d<? super C7996a> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19254f = c7995p;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19253e = obj;
            this.f19255w |= Integer.MIN_VALUE;
            return this.f19254f.m16915a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPageEventFlow.kt */
    @f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {252}, m = "record")
    /* renamed from: g.r.p$b */
    /* loaded from: classes2.dex */
    public static final class C7997b extends AbstractC11738d {

        /* renamed from: c */
        Object f19256c;

        /* renamed from: d */
        Object f19257d;

        /* renamed from: e */
        Object f19258e;

        /* renamed from: f */
        /* synthetic */ Object f19259f;

        /* renamed from: w */
        final /* synthetic */ C7995p<T> f19260w;

        /* renamed from: x */
        int f19261x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7997b(C7995p<T> c7995p, InterfaceC11714d<? super C7997b> interfaceC11714d) {
            super(interfaceC11714d);
            this.f19260w = c7995p;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            this.f19259f = obj;
            this.f19261x |= Integer.MIN_VALUE;
            return this.f19260w.m16914b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:18:0x004e, B:19:0x006c, B:21:0x0072, B:23:0x007a, B:24:0x0087), top: B:32:0x004e }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16915a(kotlin.p476c0.InterfaceC11714d<? super java.util.List<? extends kotlin.p557z.C13705i0<? extends p201g.p259r.AbstractC7905j0<T>>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p201g.p259r.C7995p.C7996a
            if (r0 == 0) goto L13
            r0 = r9
            g.r.p$a r0 = (p201g.p259r.C7995p.C7996a) r0
            int r1 = r0.f19255w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19255w = r1
            goto L18
        L13:
            g.r.p$a r0 = new g.r.p$a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f19253e
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f19255w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r1 = r0.f19252d
            kotlinx.coroutines.v2.b r1 = (kotlinx.coroutines.p564v2.InterfaceC14094b) r1
            java.lang.Object r0 = r0.f19251c
            g.r.p r0 = (p201g.p259r.C7995p) r0
            kotlin.C13291q.m5357b(r9)
            goto L4e
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            kotlin.C13291q.m5357b(r9)
            kotlinx.coroutines.v2.b r9 = r8.f19249b
            r0.f19251c = r8
            r0.f19252d = r9
            r0.f19255w = r4
            java.lang.Object r0 = r9.mo2980a(r3, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r8
            r1 = r9
        L4e:
            g.r.q<T> r9 = r0.f19248a     // Catch: java.lang.Throwable -> L8f
            java.util.List r9 = r9.m16909b()     // Catch: java.lang.Throwable -> L8f
            int r0 = r0.f19250c     // Catch: java.lang.Throwable -> L8f
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L8f
            int r0 = r0 - r2
            int r0 = r0 + r4
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f
            r4 = 10
            int r4 = kotlin.p557z.C13722p.m3921o(r9, r4)     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L8f
            r4 = 0
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L8f
        L6c:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L8f
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L8f
            int r6 = r4 + 1
            if (r4 < 0) goto L87
            g.r.j0 r5 = (p201g.p259r.AbstractC7905j0) r5     // Catch: java.lang.Throwable -> L8f
            kotlin.z.i0 r7 = new kotlin.z.i0     // Catch: java.lang.Throwable -> L8f
            int r4 = r4 + r0
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L8f
            r2.add(r7)     // Catch: java.lang.Throwable -> L8f
            r4 = r6
            goto L6c
        L87:
            kotlin.p557z.C13722p.m3923n()     // Catch: java.lang.Throwable -> L8f
            throw r3
        L8b:
            r1.mo2979b(r3)
            return r2
        L8f:
            r9 = move-exception
            r1.mo2979b(r3)
            goto L95
        L94:
            throw r9
        L95:
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7995p.m16915a(kotlin.c0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16914b(kotlin.p557z.C13705i0<? extends p201g.p259r.AbstractC7905j0<T>> r6, kotlin.p476c0.InterfaceC11714d<? super kotlin.C13666w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p201g.p259r.C7995p.C7997b
            if (r0 == 0) goto L13
            r0 = r7
            g.r.p$b r0 = (p201g.p259r.C7995p.C7997b) r0
            int r1 = r0.f19261x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19261x = r1
            goto L18
        L13:
            g.r.p$b r0 = new g.r.p$b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f19259f
            java.lang.Object r1 = kotlin.p476c0.p477j.C11728b.m10391d()
            int r2 = r0.f19261x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r6 = r0.f19258e
            kotlinx.coroutines.v2.b r6 = (kotlinx.coroutines.p564v2.InterfaceC14094b) r6
            java.lang.Object r1 = r0.f19257d
            kotlin.z.i0 r1 = (kotlin.p557z.C13705i0) r1
            java.lang.Object r0 = r0.f19256c
            g.r.p r0 = (p201g.p259r.C7995p) r0
            kotlin.C13291q.m5357b(r7)
            r7 = r6
            r6 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.C13291q.m5357b(r7)
            kotlinx.coroutines.v2.b r7 = r5.f19249b
            r0.f19256c = r5
            r0.f19257d = r6
            r0.f19258e = r7
            r0.f19261x = r4
            java.lang.Object r0 = r7.mo2980a(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            int r1 = r6.m4117c()     // Catch: java.lang.Throwable -> L6e
            r0.f19250c = r1     // Catch: java.lang.Throwable -> L6e
            g.r.q<T> r0 = r0.f19248a     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r6.m4116d()     // Catch: java.lang.Throwable -> L6e
            g.r.j0 r6 = (p201g.p259r.AbstractC7905j0) r6     // Catch: java.lang.Throwable -> L6e
            r0.m16910a(r6)     // Catch: java.lang.Throwable -> L6e
            kotlin.w r6 = kotlin.C13666w.f30112a     // Catch: java.lang.Throwable -> L6e
            r7.mo2979b(r3)
            kotlin.w r6 = kotlin.C13666w.f30112a
            return r6
        L6e:
            r6 = move-exception
            r7.mo2979b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7995p.m16914b(kotlin.z.i0, kotlin.c0.d):java.lang.Object");
    }
}
