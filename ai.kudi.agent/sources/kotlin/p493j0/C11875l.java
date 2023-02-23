package kotlin.p493j0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
/* compiled from: KTypeProjection.kt */
/* renamed from: kotlin.j0.l */
/* loaded from: classes3.dex */
public final class C11875l {

    /* renamed from: a */
    private final EnumC11878n f26552a;

    /* renamed from: b */
    private final InterfaceC11873j f26553b;

    /* renamed from: d */
    public static final C11876a f26551d = new C11876a(null);

    /* renamed from: c */
    public static final C11875l f26550c = new C11875l(null, null);

    /* compiled from: KTypeProjection.kt */
    /* renamed from: kotlin.j0.l$a */
    /* loaded from: classes3.dex */
    public static final class C11876a {
        private C11876a() {
        }

        /* renamed from: a */
        public final C11875l m10224a(InterfaceC11873j interfaceC11873j) {
            l.f(interfaceC11873j, "type");
            return new C11875l(EnumC11878n.IN, interfaceC11873j);
        }

        /* renamed from: b */
        public final C11875l m10223b(InterfaceC11873j interfaceC11873j) {
            l.f(interfaceC11873j, "type");
            return new C11875l(EnumC11878n.OUT, interfaceC11873j);
        }

        /* renamed from: c */
        public final C11875l m10222c() {
            return C11875l.f26550c;
        }

        /* renamed from: d */
        public final C11875l m10221d(InterfaceC11873j interfaceC11873j) {
            l.f(interfaceC11873j, "type");
            return new C11875l(EnumC11878n.INVARIANT, interfaceC11873j);
        }

        public /* synthetic */ C11876a(g gVar) {
            this();
        }
    }

    public C11875l(EnumC11878n enumC11878n, InterfaceC11873j interfaceC11873j) {
        String str;
        this.f26552a = enumC11878n;
        this.f26553b = interfaceC11873j;
        if ((enumC11878n == null) == (this.f26553b == null)) {
            return;
        }
        if (this.f26552a == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + this.f26552a + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11875l) {
                C11875l c11875l = (C11875l) obj;
                return l.b(this.f26552a, c11875l.f26552a) && l.b(this.f26553b, c11875l.f26553b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        EnumC11878n enumC11878n = this.f26552a;
        int hashCode = (enumC11878n != null ? enumC11878n.hashCode() : 0) * 31;
        InterfaceC11873j interfaceC11873j = this.f26553b;
        return hashCode + (interfaceC11873j != null ? interfaceC11873j.hashCode() : 0);
    }

    public String toString() {
        EnumC11878n enumC11878n = this.f26552a;
        if (enumC11878n == null) {
            return "*";
        }
        int i = C11877m.f26554a[enumC11878n.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "in " + this.f26553b;
            } else if (i == 3) {
                return "out " + this.f26553b;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return String.valueOf(this.f26553b);
    }
}
