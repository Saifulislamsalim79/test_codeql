package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import ai.kudi.agent.pin.KudiPin;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
/* compiled from: MemberSignature.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.r */
/* loaded from: classes3.dex */
public final class C12455r {

    /* renamed from: b */
    public static final C12456a f27632b = new C12456a(null);

    /* renamed from: a */
    private final String f27633a;

    /* compiled from: MemberSignature.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.r$a */
    /* loaded from: classes3.dex */
    public static final class C12456a {
        private C12456a() {
        }

        public /* synthetic */ C12456a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12455r m8865a(String str, String str2) {
            l.f(str, "name");
            l.f(str2, KudiPin.KUDI_PIN_DESC);
            return new C12455r(str + '#' + str2, null);
        }

        /* renamed from: b */
        public final C12455r m8864b(AbstractC12491d abstractC12491d) {
            l.f(abstractC12491d, "signature");
            if (abstractC12491d instanceof AbstractC12491d.C12493b) {
                return m8862d(abstractC12491d.mo8643c(), abstractC12491d.mo8644b());
            }
            if (abstractC12491d instanceof AbstractC12491d.C12492a) {
                return m8865a(abstractC12491d.mo8643c(), abstractC12491d.mo8644b());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: c */
        public final C12455r m8863c(InterfaceC12593c interfaceC12593c, C12470a.C12475c c12475c) {
            l.f(interfaceC12593c, "nameResolver");
            l.f(c12475c, "signature");
            return m8862d(interfaceC12593c.getString(c12475c.m8779y()), interfaceC12593c.getString(c12475c.m8780x()));
        }

        /* renamed from: d */
        public final C12455r m8862d(String str, String str2) {
            l.f(str, "name");
            l.f(str2, KudiPin.KUDI_PIN_DESC);
            return new C12455r(l.m(str, str2), null);
        }

        /* renamed from: e */
        public final C12455r m8861e(C12455r c12455r, int i) {
            l.f(c12455r, "signature");
            return new C12455r(c12455r.m8866a() + '@' + i, null);
        }
    }

    private C12455r(String str) {
        this.f27633a = str;
    }

    public /* synthetic */ C12455r(String str, g gVar) {
        this(str);
    }

    /* renamed from: a */
    public final String m8866a() {
        return this.f27633a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12455r) && l.b(this.f27633a, ((C12455r) obj).f27633a);
    }

    public int hashCode() {
        return this.f27633a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f27633a + ')';
    }
}
