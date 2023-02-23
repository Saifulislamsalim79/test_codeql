package kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z;

import java.util.LinkedList;
import java.util.List;
import kotlin.C13663t;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12545o;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12552p;
import kotlin.p557z.C13742z;
/* compiled from: NameResolverImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.e.z.d */
/* loaded from: classes3.dex */
public final class C12594d implements InterfaceC12593c {

    /* renamed from: a */
    private final C12552p f28346a;

    /* renamed from: b */
    private final C12545o f28347b;

    /* compiled from: NameResolverImpl.kt */
    /* renamed from: kotlin.j0.o.c.p0.e.z.d$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12595a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28348a;

        static {
            int[] iArr = new int[C12545o.C12548c.EnumC12551c.values().length];
            iArr[C12545o.C12548c.EnumC12551c.CLASS.ordinal()] = 1;
            iArr[C12545o.C12548c.EnumC12551c.PACKAGE.ordinal()] = 2;
            iArr[C12545o.C12548c.EnumC12551c.LOCAL.ordinal()] = 3;
            f28348a = iArr;
        }
    }

    public C12594d(C12552p c12552p, C12545o c12545o) {
        l.f(c12552p, "strings");
        l.f(c12545o, "qualifiedNames");
        this.f28346a = c12552p;
        this.f28347b = c12545o;
    }

    /* renamed from: c */
    private final C13663t<List<String>, List<String>, Boolean> m7431c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C12545o.C12548c m7915w = this.f28347b.m7915w(i);
            String m7857w = this.f28346a.m7857w(m7915w.m7898A());
            C12545o.C12548c.EnumC12551c m7882y = m7915w.m7882y();
            l.d(m7882y);
            int i2 = C12595a.f28348a[m7882y.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(m7857w);
            } else if (i2 == 2) {
                linkedList.addFirst(m7857w);
            } else if (i2 == 3) {
                linkedList2.addFirst(m7857w);
                z = true;
            }
            i = m7915w.m7881z();
        }
        return new C13663t<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c
    /* renamed from: a */
    public String mo7433a(int i) {
        String m3797a0;
        String m3797a02;
        C13663t<List<String>, List<String>, Boolean> m7431c = m7431c(i);
        List<String> m4232a = m7431c.m4232a();
        m3797a0 = C13742z.m3797a0(m7431c.m4231b(), ".", null, null, 0, null, null, 62, null);
        if (m4232a.isEmpty()) {
            return m3797a0;
        }
        StringBuilder sb = new StringBuilder();
        m3797a02 = C13742z.m3797a0(m4232a, "/", null, null, 0, null, null, 62, null);
        sb.append(m3797a02);
        sb.append('/');
        sb.append(m3797a0);
        return sb.toString();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c
    /* renamed from: b */
    public boolean mo7432b(int i) {
        return m7431c(i).m4228e().booleanValue();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c
    public String getString(int i) {
        String m7857w = this.f28346a.m7857w(i);
        l.e(m7857w, "strings.getString(index)");
        return m7857w;
    }
}
