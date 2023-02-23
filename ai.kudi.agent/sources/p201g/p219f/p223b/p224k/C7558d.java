package p201g.p219f.p223b.p224k;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p201g.p219f.p223b.C7542c;
import p201g.p219f.p223b.C7552i;
import p201g.p219f.p223b.p224k.p225m.C7583i;
import p201g.p219f.p223b.p224k.p225m.C7591o;
/* compiled from: ConstraintAnchor.java */
/* renamed from: g.f.b.k.d */
/* loaded from: classes2.dex */
public class C7558d {

    /* renamed from: b */
    private int f18066b;

    /* renamed from: c */
    private boolean f18067c;

    /* renamed from: d */
    public final C7561e f18068d;

    /* renamed from: e */
    public final EnumC7560b f18069e;

    /* renamed from: f */
    public C7558d f18070f;

    /* renamed from: i */
    C7552i f18073i;

    /* renamed from: a */
    private HashSet<C7558d> f18065a = null;

    /* renamed from: g */
    public int f18071g = 0;

    /* renamed from: h */
    int f18072h = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAnchor.java */
    /* renamed from: g.f.b.k.d$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C7559a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18074a;

        static {
            int[] iArr = new int[EnumC7560b.values().length];
            f18074a = iArr;
            try {
                iArr[EnumC7560b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18074a[EnumC7560b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18074a[EnumC7560b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18074a[EnumC7560b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18074a[EnumC7560b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18074a[EnumC7560b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18074a[EnumC7560b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18074a[EnumC7560b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18074a[EnumC7560b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: g.f.b.k.d$b */
    /* loaded from: classes2.dex */
    public enum EnumC7560b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C7558d(C7561e c7561e, EnumC7560b enumC7560b) {
        this.f18068d = c7561e;
        this.f18069e = enumC7560b;
    }

    /* renamed from: a */
    public boolean m18323a(C7558d c7558d, int i, int i2, boolean z) {
        if (c7558d == null) {
            m18308p();
            return true;
        } else if (z || m18309o(c7558d)) {
            this.f18070f = c7558d;
            if (c7558d.f18065a == null) {
                c7558d.f18065a = new HashSet<>();
            }
            HashSet<C7558d> hashSet = this.f18070f.f18065a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.f18071g = i;
            } else {
                this.f18071g = 0;
            }
            this.f18072h = i2;
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public void m18322b(int i, ArrayList<C7591o> arrayList, C7591o c7591o) {
        HashSet<C7558d> hashSet = this.f18065a;
        if (hashSet != null) {
            Iterator<C7558d> it = hashSet.iterator();
            while (it.hasNext()) {
                C7583i.m18112a(it.next().f18068d, i, arrayList, c7591o);
            }
        }
    }

    /* renamed from: c */
    public HashSet<C7558d> m18321c() {
        return this.f18065a;
    }

    /* renamed from: d */
    public int m18320d() {
        if (this.f18067c) {
            return this.f18066b;
        }
        return 0;
    }

    /* renamed from: e */
    public int m18319e() {
        C7558d c7558d;
        if (this.f18068d.m18272Q() == 8) {
            return 0;
        }
        if (this.f18072h > -1 && (c7558d = this.f18070f) != null && c7558d.f18068d.m18272Q() == 8) {
            return this.f18072h;
        }
        return this.f18071g;
    }

    /* renamed from: f */
    public final C7558d m18318f() {
        switch (C7559a.f18074a[this.f18069e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f18068d.f18093H;
            case 3:
                return this.f18068d.f18091F;
            case 4:
                return this.f18068d.f18094I;
            case 5:
                return this.f18068d.f18092G;
            default:
                throw new AssertionError(this.f18069e.name());
        }
    }

    /* renamed from: g */
    public C7561e m18317g() {
        return this.f18068d;
    }

    /* renamed from: h */
    public C7552i m18316h() {
        return this.f18073i;
    }

    /* renamed from: i */
    public C7558d m18315i() {
        return this.f18070f;
    }

    /* renamed from: j */
    public EnumC7560b m18314j() {
        return this.f18069e;
    }

    /* renamed from: k */
    public boolean m18313k() {
        HashSet<C7558d> hashSet = this.f18065a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C7558d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m18318f().m18310n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean m18312l() {
        HashSet<C7558d> hashSet = this.f18065a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: m */
    public boolean m18311m() {
        return this.f18067c;
    }

    /* renamed from: n */
    public boolean m18310n() {
        return this.f18070f != null;
    }

    /* renamed from: o */
    public boolean m18309o(C7558d c7558d) {
        boolean z = false;
        if (c7558d == null) {
            return false;
        }
        EnumC7560b m18314j = c7558d.m18314j();
        EnumC7560b enumC7560b = this.f18069e;
        if (m18314j == enumC7560b) {
            return enumC7560b != EnumC7560b.BASELINE || (c7558d.m18317g().m18264U() && m18317g().m18264U());
        }
        switch (C7559a.f18074a[enumC7560b.ordinal()]) {
            case 1:
                return (m18314j == EnumC7560b.BASELINE || m18314j == EnumC7560b.CENTER_X || m18314j == EnumC7560b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = m18314j == EnumC7560b.LEFT || m18314j == EnumC7560b.RIGHT;
                if (c7558d.m18317g() instanceof C7565g) {
                    return (z2 || m18314j == EnumC7560b.CENTER_X) ? true : true;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = m18314j == EnumC7560b.TOP || m18314j == EnumC7560b.BOTTOM;
                if (c7558d.m18317g() instanceof C7565g) {
                    return (z3 || m18314j == EnumC7560b.CENTER_Y) ? true : true;
                }
                return z3;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f18069e.name());
        }
    }

    /* renamed from: p */
    public void m18308p() {
        HashSet<C7558d> hashSet;
        C7558d c7558d = this.f18070f;
        if (c7558d != null && (hashSet = c7558d.f18065a) != null) {
            hashSet.remove(this);
            if (this.f18070f.f18065a.size() == 0) {
                this.f18070f.f18065a = null;
            }
        }
        this.f18065a = null;
        this.f18070f = null;
        this.f18071g = 0;
        this.f18072h = -1;
        this.f18067c = false;
        this.f18066b = 0;
    }

    /* renamed from: q */
    public void m18307q() {
        this.f18067c = false;
        this.f18066b = 0;
    }

    /* renamed from: r */
    public void m18306r(C7542c c7542c) {
        C7552i c7552i = this.f18073i;
        if (c7552i == null) {
            this.f18073i = new C7552i(C7552i.EnumC7553a.UNRESTRICTED, null);
        } else {
            c7552i.m18359d();
        }
    }

    /* renamed from: s */
    public void m18305s(int i) {
        this.f18066b = i;
        this.f18067c = true;
    }

    public String toString() {
        return this.f18068d.m18230r() + ":" + this.f18069e.toString();
    }
}
