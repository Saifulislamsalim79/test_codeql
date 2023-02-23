package p201g.p259r;

import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p549l0.C13267l;
/* compiled from: ViewportHint.kt */
/* renamed from: g.r.n1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7982n1 {

    /* renamed from: a */
    private final int f19230a;

    /* renamed from: b */
    private final int f19231b;

    /* renamed from: c */
    private final int f19232c;

    /* renamed from: d */
    private final int f19233d;

    /* compiled from: ViewportHint.kt */
    /* renamed from: g.r.n1$a */
    /* loaded from: classes2.dex */
    public static final class C7983a extends AbstractC7982n1 {

        /* renamed from: e */
        private final int f19234e;

        /* renamed from: f */
        private final int f19235f;

        public C7983a(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i3, i4, i5, i6, null);
            this.f19234e = i;
            this.f19235f = i2;
        }

        @Override // p201g.p259r.AbstractC7982n1
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7983a) {
                C7983a c7983a = (C7983a) obj;
                return this.f19234e == c7983a.f19234e && this.f19235f == c7983a.f19235f && m16945d() == c7983a.m16945d() && m16946c() == c7983a.m16946c() && m16948a() == c7983a.m16948a() && m16947b() == c7983a.m16947b();
            }
            return false;
        }

        /* renamed from: f */
        public final int m16943f() {
            return this.f19235f;
        }

        /* renamed from: g */
        public final int m16942g() {
            return this.f19234e;
        }

        @Override // p201g.p259r.AbstractC7982n1
        public int hashCode() {
            return super.hashCode() + this.f19234e + this.f19235f;
        }

        public String toString() {
            String m5458h;
            m5458h = C13267l.m5458h("ViewportHint.Access(\n            |    pageOffset=" + this.f19234e + ",\n            |    indexInPage=" + this.f19235f + ",\n            |    presentedItemsBefore=" + m16945d() + ",\n            |    presentedItemsAfter=" + m16946c() + ",\n            |    originalPageOffsetFirst=" + m16948a() + ",\n            |    originalPageOffsetLast=" + m16947b() + ",\n            |)", null, 1, null);
            return m5458h;
        }
    }

    /* compiled from: ViewportHint.kt */
    /* renamed from: g.r.n1$b */
    /* loaded from: classes2.dex */
    public static final class C7984b extends AbstractC7982n1 {
        public C7984b(int i, int i2, int i3, int i4) {
            super(i, i2, i3, i4, null);
        }

        public String toString() {
            String m5458h;
            m5458h = C13267l.m5458h("ViewportHint.Initial(\n            |    presentedItemsBefore=" + m16945d() + ",\n            |    presentedItemsAfter=" + m16946c() + ",\n            |    originalPageOffsetFirst=" + m16948a() + ",\n            |    originalPageOffsetLast=" + m16947b() + ",\n            |)", null, 1, null);
            return m5458h;
        }
    }

    /* compiled from: ViewportHint.kt */
    /* renamed from: g.r.n1$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7985c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19236a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.REFRESH.ordinal()] = 1;
            iArr[EnumC7830b0.PREPEND.ordinal()] = 2;
            iArr[EnumC7830b0.APPEND.ordinal()] = 3;
            f19236a = iArr;
        }
    }

    private AbstractC7982n1(int i, int i2, int i3, int i4) {
        this.f19230a = i;
        this.f19231b = i2;
        this.f19232c = i3;
        this.f19233d = i4;
    }

    public /* synthetic */ AbstractC7982n1(int i, int i2, int i3, int i4, g gVar) {
        this(i, i2, i3, i4);
    }

    /* renamed from: a */
    public final int m16948a() {
        return this.f19232c;
    }

    /* renamed from: b */
    public final int m16947b() {
        return this.f19233d;
    }

    /* renamed from: c */
    public final int m16946c() {
        return this.f19231b;
    }

    /* renamed from: d */
    public final int m16945d() {
        return this.f19230a;
    }

    /* renamed from: e */
    public final int m16944e(EnumC7830b0 enumC7830b0) {
        l.f(enumC7830b0, "loadType");
        int i = C7985c.f19236a[enumC7830b0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.f19231b;
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.f19230a;
        }
        throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC7982n1) {
            AbstractC7982n1 abstractC7982n1 = (AbstractC7982n1) obj;
            return this.f19230a == abstractC7982n1.f19230a && this.f19231b == abstractC7982n1.f19231b && this.f19232c == abstractC7982n1.f19232c && this.f19233d == abstractC7982n1.f19233d;
        }
        return false;
    }

    public int hashCode() {
        return this.f19230a + this.f19231b + this.f19232c + this.f19233d;
    }
}
