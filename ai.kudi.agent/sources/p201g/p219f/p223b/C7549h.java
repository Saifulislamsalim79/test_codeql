package p201g.p219f.p223b;

import java.util.Arrays;
import java.util.Comparator;
import p201g.p219f.p223b.C7540b;
/* compiled from: PriorityGoalRow.java */
/* renamed from: g.f.b.h */
/* loaded from: classes2.dex */
public class C7549h extends C7540b {

    /* renamed from: g */
    private int f17998g;

    /* renamed from: h */
    private C7552i[] f17999h;

    /* renamed from: i */
    private C7552i[] f18000i;

    /* renamed from: j */
    private int f18001j;

    /* renamed from: k */
    C7551b f18002k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PriorityGoalRow.java */
    /* renamed from: g.f.b.h$a */
    /* loaded from: classes2.dex */
    public class C7550a implements Comparator<C7552i> {
        C7550a(C7549h c7549h) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C7552i c7552i, C7552i c7552i2) {
            return c7552i.f18008c - c7552i2.f18008c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* renamed from: g.f.b.h$b */
    /* loaded from: classes2.dex */
    class C7551b implements Comparable {

        /* renamed from: c */
        C7552i f18003c;

        public C7551b(C7549h c7549h) {
        }

        /* renamed from: a */
        public boolean m18367a(C7552i c7552i, float f) {
            boolean z = true;
            if (!this.f18003c.f18006a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = c7552i.f18014i[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.f18003c.f18014i[i] = f3;
                    } else {
                        this.f18003c.f18014i[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f18003c.f18014i;
                fArr[i2] = fArr[i2] + (c7552i.f18014i[i2] * f);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.f18003c.f18014i[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                C7549h.this.m18371G(this.f18003c);
            }
            return false;
        }

        /* renamed from: b */
        public void m18366b(C7552i c7552i) {
            this.f18003c = c7552i;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f18003c.f18008c - ((C7552i) obj).f18008c;
        }

        /* renamed from: e */
        public final boolean m18365e() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f18003c.f18014i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m18364g(C7552i c7552i) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = c7552i.f18014i[i];
                float f2 = this.f18003c.f18014i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public void m18363h() {
            Arrays.fill(this.f18003c.f18014i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f18003c != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f18003c.f18014i[i] + " ";
                }
            }
            return str + "] " + this.f18003c;
        }
    }

    public C7549h(C7542c c7542c) {
        super(c7542c);
        this.f17998g = 128;
        this.f17999h = new C7552i[128];
        this.f18000i = new C7552i[128];
        this.f18001j = 0;
        this.f18002k = new C7551b(this);
    }

    /* renamed from: F */
    private final void m18372F(C7552i c7552i) {
        int i;
        int i2 = this.f18001j + 1;
        C7552i[] c7552iArr = this.f17999h;
        if (i2 > c7552iArr.length) {
            C7552i[] c7552iArr2 = (C7552i[]) Arrays.copyOf(c7552iArr, c7552iArr.length * 2);
            this.f17999h = c7552iArr2;
            this.f18000i = (C7552i[]) Arrays.copyOf(c7552iArr2, c7552iArr2.length * 2);
        }
        C7552i[] c7552iArr3 = this.f17999h;
        int i3 = this.f18001j;
        c7552iArr3[i3] = c7552i;
        int i4 = i3 + 1;
        this.f18001j = i4;
        if (i4 > 1 && c7552iArr3[i4 - 1].f18008c > c7552i.f18008c) {
            int i5 = 0;
            while (true) {
                i = this.f18001j;
                if (i5 >= i) {
                    break;
                }
                this.f18000i[i5] = this.f17999h[i5];
                i5++;
            }
            Arrays.sort(this.f18000i, 0, i, new C7550a(this));
            for (int i6 = 0; i6 < this.f18001j; i6++) {
                this.f17999h[i6] = this.f18000i[i6];
            }
        }
        c7552i.f18006a = true;
        c7552i.m18362a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m18371G(C7552i c7552i) {
        int i = 0;
        while (i < this.f18001j) {
            if (this.f17999h[i] == c7552i) {
                while (true) {
                    int i2 = this.f18001j;
                    if (i < i2 - 1) {
                        C7552i[] c7552iArr = this.f17999h;
                        int i3 = i + 1;
                        c7552iArr[i] = c7552iArr[i3];
                        i = i3;
                    } else {
                        this.f18001j = i2 - 1;
                        c7552i.f18006a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p201g.p219f.p223b.C7540b
    /* renamed from: B */
    public void mo18374B(C7543d c7543d, C7540b c7540b, boolean z) {
        C7552i c7552i = c7540b.f17933a;
        if (c7552i == null) {
            return;
        }
        C7540b.InterfaceC7541a interfaceC7541a = c7540b.f17937e;
        int mo18355a = interfaceC7541a.mo18355a();
        for (int i = 0; i < mo18355a; i++) {
            C7552i mo18354b = interfaceC7541a.mo18354b(i);
            float mo18352d = interfaceC7541a.mo18352d(i);
            this.f18002k.m18366b(mo18354b);
            if (this.f18002k.m18367a(c7552i, mo18352d)) {
                m18372F(mo18354b);
            }
            this.f17934b += c7540b.f17934b * mo18352d;
        }
        m18371G(c7552i);
    }

    @Override // p201g.p219f.p223b.C7540b, p201g.p219f.p223b.C7543d.InterfaceC7544a
    /* renamed from: a */
    public void mo18370a(C7552i c7552i) {
        this.f18002k.m18366b(c7552i);
        this.f18002k.m18363h();
        c7552i.f18014i[c7552i.f18010e] = 1.0f;
        m18372F(c7552i);
    }

    @Override // p201g.p219f.p223b.C7540b, p201g.p219f.p223b.C7543d.InterfaceC7544a
    /* renamed from: b */
    public C7552i mo18369b(C7543d c7543d, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f18001j; i2++) {
            C7552i c7552i = this.f17999h[i2];
            if (!zArr[c7552i.f18008c]) {
                this.f18002k.m18366b(c7552i);
                if (i == -1) {
                    if (!this.f18002k.m18365e()) {
                    }
                    i = i2;
                } else {
                    if (!this.f18002k.m18364g(this.f17999h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f17999h[i];
    }

    @Override // p201g.p219f.p223b.C7540b, p201g.p219f.p223b.C7543d.InterfaceC7544a
    public void clear() {
        this.f18001j = 0;
        this.f17934b = 0.0f;
    }

    @Override // p201g.p219f.p223b.C7540b, p201g.p219f.p223b.C7543d.InterfaceC7544a
    public boolean isEmpty() {
        return this.f18001j == 0;
    }

    @Override // p201g.p219f.p223b.C7540b
    public String toString() {
        String str = " goal -> (" + this.f17934b + ") : ";
        for (int i = 0; i < this.f18001j; i++) {
            this.f18002k.m18366b(this.f17999h[i]);
            str = str + this.f18002k + " ";
        }
        return str;
    }
}
