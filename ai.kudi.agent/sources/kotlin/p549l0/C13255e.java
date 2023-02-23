package kotlin.p549l0;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C13287o;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
import kotlin.p491i0.C11837e;
import kotlin.p491i0.C11841h;
import kotlin.p548k0.InterfaceC13230h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
/* renamed from: kotlin.l0.e */
/* loaded from: classes3.dex */
public final class C13255e implements InterfaceC13230h<C11837e> {

    /* renamed from: a */
    private final CharSequence f29414a;

    /* renamed from: b */
    private final int f29415b;

    /* renamed from: c */
    private final int f29416c;

    /* renamed from: d */
    private final InterfaceC11771p<CharSequence, Integer, C13287o<Integer, Integer>> f29417d;

    /* compiled from: Strings.kt */
    /* renamed from: kotlin.l0.e$a */
    /* loaded from: classes3.dex */
    public static final class C13256a implements Iterator<C11837e>, InterfaceC11791a {

        /* renamed from: c */
        private int f29418c = -1;

        /* renamed from: d */
        private int f29419d;

        /* renamed from: e */
        private int f29420e;

        /* renamed from: f */
        private C11837e f29421f;

        /* renamed from: w */
        private int f29422w;

        C13256a() {
            int m10266f;
            m10266f = C11841h.m10266f(C13255e.this.f29415b, 0, C13255e.this.f29414a.length());
            this.f29419d = m10266f;
            this.f29420e = m10266f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f29423x.f29416c) goto L13;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m5538a() {
            /*
                r6 = this;
                int r0 = r6.f29420e
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f29418c = r1
                r0 = 0
                r6.f29421f = r0
                goto L9e
            Lc:
                kotlin.l0.e r0 = kotlin.p549l0.C13255e.this
                int r0 = kotlin.p549l0.C13255e.m5540d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f29422w
                int r0 = r0 + r3
                r6.f29422w = r0
                kotlin.l0.e r4 = kotlin.p549l0.C13255e.this
                int r4 = kotlin.p549l0.C13255e.m5540d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f29420e
                kotlin.l0.e r4 = kotlin.p549l0.C13255e.this
                java.lang.CharSequence r4 = kotlin.p549l0.C13255e.m5541c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                int r0 = r6.f29419d
                kotlin.i0.e r1 = new kotlin.i0.e
                kotlin.l0.e r4 = kotlin.p549l0.C13255e.this
                java.lang.CharSequence r4 = kotlin.p549l0.C13255e.m5541c(r4)
                int r4 = kotlin.p549l0.C13265j.m5491Q(r4)
                r1.<init>(r0, r4)
                r6.f29421f = r1
                r6.f29420e = r2
                goto L9c
            L47:
                kotlin.l0.e r0 = kotlin.p549l0.C13255e.this
                kotlin.e0.c.p r0 = kotlin.p549l0.C13255e.m5542b(r0)
                kotlin.l0.e r4 = kotlin.p549l0.C13255e.this
                java.lang.CharSequence r4 = kotlin.p549l0.C13255e.m5541c(r4)
                int r5 = r6.f29420e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.o r0 = (kotlin.C13287o) r0
                if (r0 != 0) goto L77
                int r0 = r6.f29419d
                kotlin.i0.e r1 = new kotlin.i0.e
                kotlin.l0.e r4 = kotlin.p549l0.C13255e.this
                java.lang.CharSequence r4 = kotlin.p549l0.C13255e.m5541c(r4)
                int r4 = kotlin.p549l0.C13265j.m5491Q(r4)
                r1.<init>(r0, r4)
                r6.f29421f = r1
                r6.f29420e = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m5366a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m5365b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f29419d
                kotlin.i0.e r4 = kotlin.p491i0.C11839f.m10272j(r4, r2)
                r6.f29421f = r4
                int r2 = r2 + r0
                r6.f29419d = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f29420e = r2
            L9c:
                r6.f29418c = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p549l0.C13255e.C13256a.m5538a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public C11837e next() {
            if (this.f29418c == -1) {
                m5538a();
            }
            if (this.f29418c != 0) {
                C11837e c11837e = this.f29421f;
                if (c11837e != null) {
                    this.f29421f = null;
                    this.f29418c = -1;
                    return c11837e;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29418c == -1) {
                m5538a();
            }
            return this.f29418c == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13255e(CharSequence charSequence, int i, int i2, InterfaceC11771p<? super CharSequence, ? super Integer, C13287o<Integer, Integer>> interfaceC11771p) {
        l.f(charSequence, MetricTracker.Object.INPUT);
        l.f(interfaceC11771p, "getNextMatch");
        this.f29414a = charSequence;
        this.f29415b = i;
        this.f29416c = i2;
        this.f29417d = interfaceC11771p;
    }

    @Override // kotlin.p548k0.InterfaceC13230h
    public Iterator<C11837e> iterator() {
        return new C13256a();
    }
}
