package p201g.p219f.p223b.p224k.p225m;

import java.util.ArrayList;
import p201g.p219f.p223b.p224k.C7561e;
import p201g.p219f.p223b.p224k.C7565g;
import p201g.p219f.p223b.p224k.C7568i;
/* compiled from: Grouping.java */
/* renamed from: g.f.b.k.m.i */
/* loaded from: classes2.dex */
public class C7583i {
    /* renamed from: a */
    public static C7591o m18112a(C7561e c7561e, int i, ArrayList<C7591o> arrayList, C7591o c7591o) {
        int i2;
        int m18161b1;
        if (i == 0) {
            i2 = c7561e.f18137m0;
        } else {
            i2 = c7561e.f18139n0;
        }
        if (i2 != -1 && (c7591o == null || i2 != c7591o.f18251b)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                C7591o c7591o2 = arrayList.get(i3);
                if (c7591o2.m18097c() == i2) {
                    if (c7591o != null) {
                        c7591o.m18093g(i, c7591o2);
                        arrayList.remove(c7591o);
                    }
                    c7591o = c7591o2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return c7591o;
        }
        if (c7591o == null) {
            if ((c7561e instanceof C7568i) && (m18161b1 = ((C7568i) c7561e).m18161b1(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    C7591o c7591o3 = arrayList.get(i4);
                    if (c7591o3.m18097c() == m18161b1) {
                        c7591o = c7591o3;
                        break;
                    }
                    i4++;
                }
            }
            if (c7591o == null) {
                c7591o = new C7591o(i);
            }
            arrayList.add(c7591o);
        }
        if (c7591o.m18099a(c7561e)) {
            if (c7561e instanceof C7565g) {
                C7565g c7565g = (C7565g) c7561e;
                c7565g.m18179a1().m18322b(c7565g.m18178b1() == 0 ? 1 : 0, arrayList, c7591o);
            }
            if (i == 0) {
                c7561e.f18137m0 = c7591o.m18097c();
                c7561e.f18091F.m18322b(i, arrayList, c7591o);
                c7561e.f18093H.m18322b(i, arrayList, c7591o);
            } else {
                c7561e.f18139n0 = c7591o.m18097c();
                c7561e.f18092G.m18322b(i, arrayList, c7591o);
                c7561e.f18095J.m18322b(i, arrayList, c7591o);
                c7561e.f18094I.m18322b(i, arrayList, c7591o);
            }
            c7561e.f18098M.m18322b(i, arrayList, c7591o);
        }
        return c7591o;
    }

    /* renamed from: b */
    private static C7591o m18111b(ArrayList<C7591o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7591o c7591o = arrayList.get(i2);
            if (i == c7591o.f18251b) {
                return c7591o;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038a A[ADDED_TO_REGION] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m18110c(p201g.p219f.p223b.p224k.C7564f r16, p201g.p219f.p223b.p224k.p225m.C7573b.InterfaceC7575b r17) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p219f.p223b.p224k.p225m.C7583i.m18110c(g.f.b.k.f, g.f.b.k.m.b$b):boolean");
    }

    /* renamed from: d */
    public static boolean m18109d(C7561e.EnumC7563b enumC7563b, C7561e.EnumC7563b enumC7563b2, C7561e.EnumC7563b enumC7563b3, C7561e.EnumC7563b enumC7563b4) {
        return (enumC7563b3 == C7561e.EnumC7563b.FIXED || enumC7563b3 == C7561e.EnumC7563b.WRAP_CONTENT || (enumC7563b3 == C7561e.EnumC7563b.MATCH_PARENT && enumC7563b != C7561e.EnumC7563b.WRAP_CONTENT)) || (enumC7563b4 == C7561e.EnumC7563b.FIXED || enumC7563b4 == C7561e.EnumC7563b.WRAP_CONTENT || (enumC7563b4 == C7561e.EnumC7563b.MATCH_PARENT && enumC7563b2 != C7561e.EnumC7563b.WRAP_CONTENT));
    }
}
