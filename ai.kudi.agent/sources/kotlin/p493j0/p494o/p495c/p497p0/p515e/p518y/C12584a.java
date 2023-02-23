package kotlin.p493j0.p494o.p495c.p497p0.p515e.p518y;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.AbstractC12587a;
import kotlin.p557z.AbstractC13711l0;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
/* compiled from: BuiltInsBinaryVersion.kt */
/* renamed from: kotlin.j0.o.c.p0.e.y.a */
/* loaded from: classes3.dex */
public final class C12584a extends AbstractC12587a {

    /* renamed from: f */
    public static final C12585a f28284f = new C12585a(null);

    /* renamed from: g */
    public static final C12584a f28285g = new C12584a(1, 0, 7);

    /* compiled from: BuiltInsBinaryVersion.kt */
    /* renamed from: kotlin.j0.o.c.p0.e.y.a$a */
    /* loaded from: classes3.dex */
    public static final class C12585a {
        private C12585a() {
        }

        public /* synthetic */ C12585a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12584a m7456a(InputStream inputStream) {
            int m3867o;
            int[] m3826A0;
            l.f(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C11837e c11837e = new C11837e(1, dataInputStream.readInt());
            m3867o = C13728s.m3867o(c11837e, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            Iterator<Integer> it = c11837e.iterator();
            while (it.hasNext()) {
                ((AbstractC13711l0) it).mo4069b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            m3826A0 = C13742z.m3826A0(arrayList);
            int[] iArr = new int[m3826A0.length];
            System.arraycopy(m3826A0, 0, iArr, 0, m3826A0.length);
            return new C12584a(iArr);
        }
    }

    static {
        new C12584a(new int[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12584a(int... r4) {
        /*
            r3 = this;
            java.lang.String r0 = "numbers"
            kotlin.e0.d.l.f(r4, r0)
            int r0 = r4.length
            int[] r0 = new int[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p515e.p518y.C12584a.<init>(int[]):void");
    }

    /* renamed from: h */
    public boolean m7457h() {
        return m7449f(f28285g);
    }
}
