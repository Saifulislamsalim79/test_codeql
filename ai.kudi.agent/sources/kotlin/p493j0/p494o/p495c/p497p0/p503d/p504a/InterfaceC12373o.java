package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.Arrays;
import java.util.Set;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
/* compiled from: JavaClassFinder.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.o */
/* loaded from: classes3.dex */
public interface InterfaceC12373o {
    /* renamed from: a */
    InterfaceC12277g mo4930a(C12374a c12374a);

    /* renamed from: b */
    InterfaceC12292u mo4929b(C12609c c12609c);

    /* renamed from: c */
    Set<String> mo4928c(C12609c c12609c);

    /* compiled from: JavaClassFinder.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.o$a */
    /* loaded from: classes3.dex */
    public static final class C12374a {

        /* renamed from: a */
        private final C12608b f27453a;

        /* renamed from: b */
        private final byte[] f27454b;

        /* renamed from: c */
        private final InterfaceC12277g f27455c;

        public C12374a(C12608b c12608b, byte[] bArr, InterfaceC12277g interfaceC12277g) {
            l.f(c12608b, "classId");
            this.f27453a = c12608b;
            this.f27454b = bArr;
            this.f27455c = interfaceC12277g;
        }

        /* renamed from: a */
        public final C12608b m9104a() {
            return this.f27453a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12374a) {
                C12374a c12374a = (C12374a) obj;
                return l.b(this.f27453a, c12374a.f27453a) && l.b(this.f27454b, c12374a.f27454b) && l.b(this.f27455c, c12374a.f27455c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f27453a.hashCode() * 31;
            byte[] bArr = this.f27454b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC12277g interfaceC12277g = this.f27455c;
            return hashCode2 + (interfaceC12277g != null ? interfaceC12277g.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f27453a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f27454b) + ", outerClass=" + this.f27455c + ')';
        }

        public /* synthetic */ C12374a(C12608b c12608b, byte[] bArr, InterfaceC12277g interfaceC12277g, int i, g gVar) {
            this(c12608b, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? null : interfaceC12277g);
        }
    }
}
