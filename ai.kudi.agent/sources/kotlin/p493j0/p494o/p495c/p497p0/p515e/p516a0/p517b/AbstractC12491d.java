package kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b;

import ai.kudi.agent.pin.KudiPin;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
/* compiled from: JvmMemberSignature.kt */
/* renamed from: kotlin.j0.o.c.p0.e.a0.b.d */
/* loaded from: classes3.dex */
public abstract class AbstractC12491d {

    /* compiled from: JvmMemberSignature.kt */
    /* renamed from: kotlin.j0.o.c.p0.e.a0.b.d$a */
    /* loaded from: classes3.dex */
    public static final class C12492a extends AbstractC12491d {

        /* renamed from: a */
        private final String f27746a;

        /* renamed from: b */
        private final String f27747b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12492a(String str, String str2) {
            super(null);
            l.f(str, "name");
            l.f(str2, KudiPin.KUDI_PIN_DESC);
            this.f27746a = str;
            this.f27747b = str2;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d
        /* renamed from: a */
        public String mo8645a() {
            return mo8643c() + ':' + mo8644b();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d
        /* renamed from: b */
        public String mo8644b() {
            return this.f27747b;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d
        /* renamed from: c */
        public String mo8643c() {
            return this.f27746a;
        }

        /* renamed from: d */
        public final String m8647d() {
            return mo8643c();
        }

        /* renamed from: e */
        public final String m8646e() {
            return mo8644b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12492a) {
                C12492a c12492a = (C12492a) obj;
                return l.b(mo8643c(), c12492a.mo8643c()) && l.b(mo8644b(), c12492a.mo8644b());
            }
            return false;
        }

        public int hashCode() {
            return (mo8643c().hashCode() * 31) + mo8644b().hashCode();
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    /* renamed from: kotlin.j0.o.c.p0.e.a0.b.d$b */
    /* loaded from: classes3.dex */
    public static final class C12493b extends AbstractC12491d {

        /* renamed from: a */
        private final String f27748a;

        /* renamed from: b */
        private final String f27749b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12493b(String str, String str2) {
            super(null);
            l.f(str, "name");
            l.f(str2, KudiPin.KUDI_PIN_DESC);
            this.f27748a = str;
            this.f27749b = str2;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d
        /* renamed from: a */
        public String mo8645a() {
            return l.m(mo8643c(), mo8644b());
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d
        /* renamed from: b */
        public String mo8644b() {
            return this.f27749b;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d
        /* renamed from: c */
        public String mo8643c() {
            return this.f27748a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12493b) {
                C12493b c12493b = (C12493b) obj;
                return l.b(mo8643c(), c12493b.mo8643c()) && l.b(mo8644b(), c12493b.mo8644b());
            }
            return false;
        }

        public int hashCode() {
            return (mo8643c().hashCode() * 31) + mo8644b().hashCode();
        }
    }

    private AbstractC12491d() {
    }

    public /* synthetic */ AbstractC12491d(g gVar) {
        this();
    }

    /* renamed from: a */
    public abstract String mo8645a();

    /* renamed from: b */
    public abstract String mo8644b();

    /* renamed from: c */
    public abstract String mo8643c();

    public final String toString() {
        return mo8645a();
    }
}
