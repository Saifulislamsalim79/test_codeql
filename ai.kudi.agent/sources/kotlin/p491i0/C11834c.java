package kotlin.p491i0;

import kotlin.e0.d.g;
import kotlin.p480d0.C11750c;
import kotlin.p483e0.p485d.p486e0.InterfaceC11791a;
import kotlin.p557z.AbstractC13711l0;
/* compiled from: Progressions.kt */
/* renamed from: kotlin.i0.c */
/* loaded from: classes3.dex */
public class C11834c implements Iterable<Integer>, InterfaceC11791a {

    /* renamed from: f */
    public static final C11835a f26513f = new C11835a(null);

    /* renamed from: c */
    private final int f26514c;

    /* renamed from: d */
    private final int f26515d;

    /* renamed from: e */
    private final int f26516e;

    /* compiled from: Progressions.kt */
    /* renamed from: kotlin.i0.c$a */
    /* loaded from: classes3.dex */
    public static final class C11835a {
        private C11835a() {
        }

        /* renamed from: a */
        public final C11834c m10288a(int i, int i2, int i3) {
            return new C11834c(i, i2, i3);
        }

        public /* synthetic */ C11835a(g gVar) {
            this();
        }
    }

    public C11834c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f26514c = i;
            this.f26515d = C11750c.m10369b(i, i2, i3);
            this.f26516e = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11834c) {
            if (!isEmpty() || !((C11834c) obj).isEmpty()) {
                C11834c c11834c = (C11834c) obj;
                if (this.f26514c != c11834c.f26514c || this.f26515d != c11834c.f26515d || this.f26516e != c11834c.f26516e) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f26514c * 31) + this.f26515d) * 31) + this.f26516e;
    }

    public boolean isEmpty() {
        if (this.f26516e > 0) {
            if (this.f26514c > this.f26515d) {
                return true;
            }
        } else if (this.f26514c < this.f26515d) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final int m10292l() {
        return this.f26514c;
    }

    /* renamed from: m */
    public final int m10291m() {
        return this.f26515d;
    }

    /* renamed from: s */
    public final int m10290s() {
        return this.f26516e;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f26516e > 0) {
            sb = new StringBuilder();
            sb.append(this.f26514c);
            sb.append("..");
            sb.append(this.f26515d);
            sb.append(" step ");
            i = this.f26516e;
        } else {
            sb = new StringBuilder();
            sb.append(this.f26514c);
            sb.append(" downTo ");
            sb.append(this.f26515d);
            sb.append(" step ");
            i = -this.f26516e;
        }
        sb.append(i);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    /* renamed from: u */
    public AbstractC13711l0 iterator() {
        return new C11836d(this.f26514c, this.f26515d, this.f26516e);
    }
}
