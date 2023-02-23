package p201g.p259r;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import java.util.Arrays;
import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p557z.C13726r;
/* compiled from: TransformablePage.kt */
/* renamed from: g.r.k1 */
/* loaded from: classes2.dex */
public final class C7936k1<T> {

    /* renamed from: e */
    public static final C7937a f19052e = new C7937a(null);

    /* renamed from: f */
    private static final C7936k1<Object> f19053f;

    /* renamed from: a */
    private final int[] f19054a;

    /* renamed from: b */
    private final List<T> f19055b;

    /* renamed from: c */
    private final int f19056c;

    /* renamed from: d */
    private final List<Integer> f19057d;

    /* compiled from: TransformablePage.kt */
    /* renamed from: g.r.k1$a */
    /* loaded from: classes2.dex */
    public static final class C7937a {
        private C7937a() {
        }

        public /* synthetic */ C7937a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C7936k1<Object> m17023a() {
            return C7936k1.f19053f;
        }
    }

    static {
        List m3891e;
        m3891e = C13726r.m3891e();
        f19053f = new C7936k1<>(0, m3891e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7936k1(int[] iArr, List<? extends T> list, int i, List<Integer> list2) {
        l.f(iArr, "originalPageOffsets");
        l.f(list, TransactionBreakDownItemType.DATA);
        this.f19054a = iArr;
        this.f19055b = list;
        this.f19056c = i;
        this.f19057d = list2;
        boolean z = false;
        if (!(iArr.length == 0)) {
            List<Integer> list3 = this.f19057d;
            if ((list3 == null || list3.size() == this.f19055b.size()) ? true : true) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("If originalIndices (size = ");
            List<Integer> m17027c = m17027c();
            l.d(m17027c);
            sb.append(m17027c.size());
            sb.append(") is provided, it must be same length as data (size = ");
            sb.append(m17028b().size());
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
    }

    /* renamed from: b */
    public final List<T> m17028b() {
        return this.f19055b;
    }

    /* renamed from: c */
    public final List<Integer> m17027c() {
        return this.f19057d;
    }

    /* renamed from: d */
    public final int m17026d() {
        return this.f19056c;
    }

    /* renamed from: e */
    public final int[] m17025e() {
        return this.f19054a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (l.b(C7936k1.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                C7936k1 c7936k1 = (C7936k1) obj;
                return Arrays.equals(this.f19054a, c7936k1.f19054a) && l.b(this.f19055b, c7936k1.f19055b) && this.f19056c == c7936k1.f19056c && l.b(this.f19057d, c7936k1.f19057d);
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        r0 = kotlin.p557z.C13726r.m3890f(r0);
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p201g.p259r.AbstractC7982n1.C7983a m17024f(int r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            g.r.n1$a r7 = new g.r.n1$a
            int r1 = r8.f19056c
            java.util.List<java.lang.Integer> r0 = r8.f19057d
            r2 = 1
            r3 = 0
            if (r0 != 0) goto Lc
        La:
            r2 = 0
            goto L19
        Lc:
            kotlin.i0.e r0 = kotlin.p557z.C13722p.m3939f(r0)
            if (r0 != 0) goto L13
            goto La
        L13:
            boolean r0 = r0.m10286F(r9)
            if (r0 != r2) goto La
        L19:
            if (r2 == 0) goto L27
            java.util.List<java.lang.Integer> r0 = r8.f19057d
            java.lang.Object r9 = r0.get(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        L27:
            r2 = r9
            r0 = r7
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.C7936k1.m17024f(int, int, int, int, int):g.r.n1$a");
    }

    public int hashCode() {
        int hashCode = ((((Arrays.hashCode(this.f19054a) * 31) + this.f19055b.hashCode()) * 31) + this.f19056c) * 31;
        List<Integer> list = this.f19057d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f19054a) + ", data=" + this.f19055b + ", hintOriginalPageOffset=" + this.f19056c + ", hintOriginalIndices=" + this.f19057d + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7936k1(int i, List<? extends T> list) {
        this(new int[]{i}, list, i, null);
        l.f(list, TransactionBreakDownItemType.DATA);
    }
}
