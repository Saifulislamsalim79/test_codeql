package p201g.p219f.p223b.p224k;

import p201g.p219f.p223b.C7543d;
import p201g.p219f.p223b.p224k.C7561e;
/* compiled from: Optimizer.java */
/* renamed from: g.f.b.k.j */
/* loaded from: classes2.dex */
public class C7569j {

    /* renamed from: a */
    static boolean[] f18188a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18160a(C7564f c7564f, C7543d c7543d, C7561e c7561e) {
        c7561e.f18134l = -1;
        c7561e.f18136m = -1;
        if (c7564f.f18102Q[0] != C7561e.EnumC7563b.WRAP_CONTENT && c7561e.f18102Q[0] == C7561e.EnumC7563b.MATCH_PARENT) {
            int i = c7561e.f18091F.f18071g;
            int m18270R = c7564f.m18270R() - c7561e.f18093H.f18071g;
            C7558d c7558d = c7561e.f18091F;
            c7558d.f18073i = c7543d.m18388q(c7558d);
            C7558d c7558d2 = c7561e.f18093H;
            c7558d2.f18073i = c7543d.m18388q(c7558d2);
            c7543d.m18399f(c7561e.f18091F.f18073i, i);
            c7543d.m18399f(c7561e.f18093H.f18073i, m18270R);
            c7561e.f18134l = 2;
            c7561e.m18215y0(i, m18270R);
        }
        if (c7564f.f18102Q[1] == C7561e.EnumC7563b.WRAP_CONTENT || c7561e.f18102Q[1] != C7561e.EnumC7563b.MATCH_PARENT) {
            return;
        }
        int i2 = c7561e.f18092G.f18071g;
        int m18222v = c7564f.m18222v() - c7561e.f18094I.f18071g;
        C7558d c7558d3 = c7561e.f18092G;
        c7558d3.f18073i = c7543d.m18388q(c7558d3);
        C7558d c7558d4 = c7561e.f18094I;
        c7558d4.f18073i = c7543d.m18388q(c7558d4);
        c7543d.m18399f(c7561e.f18092G.f18073i, i2);
        c7543d.m18399f(c7561e.f18094I.f18073i, m18222v);
        if (c7561e.f18110Y > 0 || c7561e.m18272Q() == 8) {
            C7558d c7558d5 = c7561e.f18095J;
            c7558d5.f18073i = c7543d.m18388q(c7558d5);
            c7543d.m18399f(c7561e.f18095J.f18073i, c7561e.f18110Y + i2);
        }
        c7561e.f18136m = 2;
        c7561e.m18273P0(i2, m18222v);
    }

    /* renamed from: b */
    public static final boolean m18159b(int i, int i2) {
        return (i & i2) == i2;
    }
}
