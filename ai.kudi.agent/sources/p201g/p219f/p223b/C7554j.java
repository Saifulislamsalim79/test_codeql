package p201g.p219f.p223b;

import java.util.Arrays;
import p201g.p219f.p223b.C7540b;
/* compiled from: SolverVariableValues.java */
/* renamed from: g.f.b.j */
/* loaded from: classes2.dex */
public class C7554j implements C7540b.InterfaceC7541a {

    /* renamed from: m */
    private static float f18028m = 0.001f;

    /* renamed from: a */
    private int f18029a = 16;

    /* renamed from: b */
    private int f18030b = 16;

    /* renamed from: c */
    int[] f18031c = new int[16];

    /* renamed from: d */
    int[] f18032d = new int[16];

    /* renamed from: e */
    int[] f18033e = new int[16];

    /* renamed from: f */
    float[] f18034f = new float[16];

    /* renamed from: g */
    int[] f18035g = new int[16];

    /* renamed from: h */
    int[] f18036h = new int[16];

    /* renamed from: i */
    int f18037i = 0;

    /* renamed from: j */
    int f18038j = -1;

    /* renamed from: k */
    private final C7540b f18039k;

    /* renamed from: l */
    protected final C7542c f18040l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7554j(C7540b c7540b, C7542c c7542c) {
        this.f18039k = c7540b;
        this.f18040l = c7542c;
        clear();
    }

    /* renamed from: l */
    private void m18344l(C7552i c7552i, int i) {
        int[] iArr;
        int i2 = c7552i.f18008c % this.f18030b;
        int[] iArr2 = this.f18031c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f18032d;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f18032d[i] = -1;
    }

    /* renamed from: m */
    private void m18343m(int i, C7552i c7552i, float f) {
        this.f18033e[i] = c7552i.f18008c;
        this.f18034f[i] = f;
        this.f18035g[i] = -1;
        this.f18036h[i] = -1;
        c7552i.m18362a(this.f18039k);
        c7552i.f18018m++;
        this.f18037i++;
    }

    /* renamed from: n */
    private int m18342n() {
        for (int i = 0; i < this.f18029a; i++) {
            if (this.f18033e[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m18341o() {
        int i = this.f18029a * 2;
        this.f18033e = Arrays.copyOf(this.f18033e, i);
        this.f18034f = Arrays.copyOf(this.f18034f, i);
        this.f18035g = Arrays.copyOf(this.f18035g, i);
        this.f18036h = Arrays.copyOf(this.f18036h, i);
        this.f18032d = Arrays.copyOf(this.f18032d, i);
        for (int i2 = this.f18029a; i2 < i; i2++) {
            this.f18033e[i2] = -1;
            this.f18032d[i2] = -1;
        }
        this.f18029a = i;
    }

    /* renamed from: q */
    private void m18339q(int i, C7552i c7552i, float f) {
        int m18342n = m18342n();
        m18343m(m18342n, c7552i, f);
        if (i != -1) {
            this.f18035g[m18342n] = i;
            int[] iArr = this.f18036h;
            iArr[m18342n] = iArr[i];
            iArr[i] = m18342n;
        } else {
            this.f18035g[m18342n] = -1;
            if (this.f18037i > 0) {
                this.f18036h[m18342n] = this.f18038j;
                this.f18038j = m18342n;
            } else {
                this.f18036h[m18342n] = -1;
            }
        }
        int[] iArr2 = this.f18036h;
        if (iArr2[m18342n] != -1) {
            this.f18035g[iArr2[m18342n]] = m18342n;
        }
        m18344l(c7552i, m18342n);
    }

    /* renamed from: r */
    private void m18338r(C7552i c7552i) {
        int i = c7552i.f18008c;
        int i2 = i % this.f18030b;
        int[] iArr = this.f18031c;
        int i3 = iArr[i2];
        if (i3 == -1) {
            return;
        }
        if (this.f18033e[i3] == i) {
            int[] iArr2 = this.f18032d;
            iArr[i2] = iArr2[i3];
            iArr2[i3] = -1;
            return;
        }
        while (true) {
            int[] iArr3 = this.f18032d;
            if (iArr3[i3] == -1 || this.f18033e[iArr3[i3]] == i) {
                break;
            }
            i3 = iArr3[i3];
        }
        int[] iArr4 = this.f18032d;
        int i4 = iArr4[i3];
        if (i4 == -1 || this.f18033e[i4] != i) {
            return;
        }
        iArr4[i3] = iArr4[i4];
        iArr4[i4] = -1;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: a */
    public int mo18355a() {
        return this.f18037i;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: b */
    public C7552i mo18354b(int i) {
        int i2 = this.f18037i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f18038j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f18040l.f17942d[this.f18033e[i3]];
            }
            i3 = this.f18036h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: c */
    public void mo18353c() {
        int i = this.f18037i;
        int i2 = this.f18038j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f18034f;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f18036h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    public void clear() {
        int i = this.f18037i;
        for (int i2 = 0; i2 < i; i2++) {
            C7552i mo18354b = mo18354b(i2);
            if (mo18354b != null) {
                mo18354b.m18360c(this.f18039k);
            }
        }
        for (int i3 = 0; i3 < this.f18029a; i3++) {
            this.f18033e[i3] = -1;
            this.f18032d[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f18030b; i4++) {
            this.f18031c[i4] = -1;
        }
        this.f18037i = 0;
        this.f18038j = -1;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: d */
    public float mo18352d(int i) {
        int i2 = this.f18037i;
        int i3 = this.f18038j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f18034f[i3];
            }
            i3 = this.f18036h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: e */
    public void mo18351e(C7552i c7552i, float f, boolean z) {
        float f2 = f18028m;
        if (f <= (-f2) || f >= f2) {
            int m18340p = m18340p(c7552i);
            if (m18340p == -1) {
                mo18347i(c7552i, f);
                return;
            }
            float[] fArr = this.f18034f;
            fArr[m18340p] = fArr[m18340p] + f;
            float f3 = fArr[m18340p];
            float f4 = f18028m;
            if (f3 <= (-f4) || fArr[m18340p] >= f4) {
                return;
            }
            fArr[m18340p] = 0.0f;
            mo18346j(c7552i, z);
        }
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: f */
    public float mo18350f(C7552i c7552i) {
        int m18340p = m18340p(c7552i);
        if (m18340p != -1) {
            return this.f18034f[m18340p];
        }
        return 0.0f;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: g */
    public boolean mo18349g(C7552i c7552i) {
        return m18340p(c7552i) != -1;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: h */
    public float mo18348h(C7540b c7540b, boolean z) {
        float mo18350f = mo18350f(c7540b.f17933a);
        mo18346j(c7540b.f17933a, z);
        C7554j c7554j = (C7554j) c7540b.f17937e;
        int mo18355a = c7554j.mo18355a();
        int i = c7554j.f18038j;
        int i2 = 0;
        int i3 = 0;
        while (i2 < mo18355a) {
            int[] iArr = c7554j.f18033e;
            if (iArr[i3] != -1) {
                mo18351e(this.f18040l.f17942d[iArr[i3]], c7554j.f18034f[i3] * mo18350f, z);
                i2++;
            }
            i3++;
        }
        return mo18350f;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: i */
    public void mo18347i(C7552i c7552i, float f) {
        float f2 = f18028m;
        if (f > (-f2) && f < f2) {
            mo18346j(c7552i, true);
            return;
        }
        if (this.f18037i == 0) {
            m18343m(0, c7552i, f);
            m18344l(c7552i, 0);
            this.f18038j = 0;
            return;
        }
        int m18340p = m18340p(c7552i);
        if (m18340p != -1) {
            this.f18034f[m18340p] = f;
            return;
        }
        if (this.f18037i + 1 >= this.f18029a) {
            m18341o();
        }
        int i = this.f18037i;
        int i2 = this.f18038j;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.f18033e;
            int i5 = iArr[i2];
            int i6 = c7552i.f18008c;
            if (i5 == i6) {
                this.f18034f[i2] = f;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.f18036h[i2];
            if (i2 == -1) {
                break;
            }
        }
        m18339q(i3, c7552i, f);
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: j */
    public float mo18346j(C7552i c7552i, boolean z) {
        int m18340p = m18340p(c7552i);
        if (m18340p == -1) {
            return 0.0f;
        }
        m18338r(c7552i);
        float f = this.f18034f[m18340p];
        if (this.f18038j == m18340p) {
            this.f18038j = this.f18036h[m18340p];
        }
        this.f18033e[m18340p] = -1;
        int[] iArr = this.f18035g;
        if (iArr[m18340p] != -1) {
            int[] iArr2 = this.f18036h;
            iArr2[iArr[m18340p]] = iArr2[m18340p];
        }
        int[] iArr3 = this.f18036h;
        if (iArr3[m18340p] != -1) {
            int[] iArr4 = this.f18035g;
            iArr4[iArr3[m18340p]] = iArr4[m18340p];
        }
        this.f18037i--;
        c7552i.f18018m--;
        if (z) {
            c7552i.m18360c(this.f18039k);
        }
        return f;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: k */
    public void mo18345k(float f) {
        int i = this.f18037i;
        int i2 = this.f18038j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f18034f;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f18036h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    /* renamed from: p */
    public int m18340p(C7552i c7552i) {
        if (this.f18037i != 0 && c7552i != null) {
            int i = c7552i.f18008c;
            int i2 = this.f18031c[i % this.f18030b];
            if (i2 == -1) {
                return -1;
            }
            if (this.f18033e[i2] == i) {
                return i2;
            }
            while (true) {
                int[] iArr = this.f18032d;
                if (iArr[i2] == -1 || this.f18033e[iArr[i2]] == i) {
                    break;
                }
                i2 = iArr[i2];
            }
            int[] iArr2 = this.f18032d;
            if (iArr2[i2] != -1 && this.f18033e[iArr2[i2]] == i) {
                return iArr2[i2];
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.f18037i;
        for (int i2 = 0; i2 < i; i2++) {
            C7552i mo18354b = mo18354b(i2);
            if (mo18354b != null) {
                String str2 = str + mo18354b + " = " + mo18352d(i2) + " ";
                int m18340p = m18340p(mo18354b);
                String str3 = str2 + "[p: ";
                String str4 = (this.f18035g[m18340p] != -1 ? str3 + this.f18040l.f17942d[this.f18033e[this.f18035g[m18340p]]] : str3 + "none") + ", n: ";
                str = (this.f18036h[m18340p] != -1 ? str4 + this.f18040l.f17942d[this.f18033e[this.f18036h[m18340p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
