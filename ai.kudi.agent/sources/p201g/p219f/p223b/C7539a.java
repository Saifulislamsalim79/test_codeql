package p201g.p219f.p223b;

import java.util.Arrays;
import p201g.p219f.p223b.C7540b;
/* compiled from: ArrayLinkedVariables.java */
/* renamed from: g.f.b.a */
/* loaded from: classes2.dex */
public class C7539a implements C7540b.InterfaceC7541a {

    /* renamed from: l */
    private static float f17921l = 0.001f;

    /* renamed from: b */
    private final C7540b f17923b;

    /* renamed from: c */
    protected final C7542c f17924c;

    /* renamed from: a */
    int f17922a = 0;

    /* renamed from: d */
    private int f17925d = 8;

    /* renamed from: e */
    private C7552i f17926e = null;

    /* renamed from: f */
    private int[] f17927f = new int[8];

    /* renamed from: g */
    private int[] f17928g = new int[8];

    /* renamed from: h */
    private float[] f17929h = new float[8];

    /* renamed from: i */
    private int f17930i = -1;

    /* renamed from: j */
    private int f17931j = -1;

    /* renamed from: k */
    private boolean f17932k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7539a(C7540b c7540b, C7542c c7542c) {
        this.f17923b = c7540b;
        this.f17924c = c7542c;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: a */
    public int mo18355a() {
        return this.f17922a;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: b */
    public C7552i mo18354b(int i) {
        int i2 = this.f17930i;
        for (int i3 = 0; i2 != -1 && i3 < this.f17922a; i3++) {
            if (i3 == i) {
                return this.f17924c.f17942d[this.f17927f[i2]];
            }
            i2 = this.f17928g[i2];
        }
        return null;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: c */
    public void mo18353c() {
        int i = this.f17930i;
        for (int i2 = 0; i != -1 && i2 < this.f17922a; i2++) {
            float[] fArr = this.f17929h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f17928g[i];
        }
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    public final void clear() {
        int i = this.f17930i;
        for (int i2 = 0; i != -1 && i2 < this.f17922a; i2++) {
            C7552i c7552i = this.f17924c.f17942d[this.f17927f[i]];
            if (c7552i != null) {
                c7552i.m18360c(this.f17923b);
            }
            i = this.f17928g[i];
        }
        this.f17930i = -1;
        this.f17931j = -1;
        this.f17932k = false;
        this.f17922a = 0;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: d */
    public float mo18352d(int i) {
        int i2 = this.f17930i;
        for (int i3 = 0; i2 != -1 && i3 < this.f17922a; i3++) {
            if (i3 == i) {
                return this.f17929h[i2];
            }
            i2 = this.f17928g[i2];
        }
        return 0.0f;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: e */
    public void mo18351e(C7552i c7552i, float f, boolean z) {
        float f2 = f17921l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f17930i;
            if (i == -1) {
                this.f17930i = 0;
                this.f17929h[0] = f;
                this.f17927f[0] = c7552i.f18008c;
                this.f17928g[0] = -1;
                c7552i.f18018m++;
                c7552i.m18362a(this.f17923b);
                this.f17922a++;
                if (this.f17932k) {
                    return;
                }
                int i2 = this.f17931j + 1;
                this.f17931j = i2;
                int[] iArr = this.f17927f;
                if (i2 >= iArr.length) {
                    this.f17932k = true;
                    this.f17931j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f17922a; i4++) {
                int[] iArr2 = this.f17927f;
                int i5 = iArr2[i];
                int i6 = c7552i.f18008c;
                if (i5 == i6) {
                    float f3 = this.f17929h[i] + f;
                    float f4 = f17921l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    this.f17929h[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f17930i) {
                            this.f17930i = this.f17928g[i];
                        } else {
                            int[] iArr3 = this.f17928g;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            c7552i.m18360c(this.f17923b);
                        }
                        if (this.f17932k) {
                            this.f17931j = i;
                        }
                        c7552i.f18018m--;
                        this.f17922a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f17928g[i];
            }
            int i7 = this.f17931j;
            int i8 = i7 + 1;
            if (this.f17932k) {
                int[] iArr4 = this.f17927f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f17927f;
            if (i7 >= iArr5.length && this.f17922a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f17927f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f17927f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f17925d * 2;
                this.f17925d = i10;
                this.f17932k = false;
                this.f17931j = i7 - 1;
                this.f17929h = Arrays.copyOf(this.f17929h, i10);
                this.f17927f = Arrays.copyOf(this.f17927f, this.f17925d);
                this.f17928g = Arrays.copyOf(this.f17928g, this.f17925d);
            }
            this.f17927f[i7] = c7552i.f18008c;
            this.f17929h[i7] = f;
            if (i3 != -1) {
                int[] iArr8 = this.f17928g;
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                this.f17928g[i7] = this.f17930i;
                this.f17930i = i7;
            }
            c7552i.f18018m++;
            c7552i.m18362a(this.f17923b);
            this.f17922a++;
            if (!this.f17932k) {
                this.f17931j++;
            }
            int i11 = this.f17931j;
            int[] iArr9 = this.f17927f;
            if (i11 >= iArr9.length) {
                this.f17932k = true;
                this.f17931j = iArr9.length - 1;
            }
        }
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: f */
    public final float mo18350f(C7552i c7552i) {
        int i = this.f17930i;
        for (int i2 = 0; i != -1 && i2 < this.f17922a; i2++) {
            if (this.f17927f[i] == c7552i.f18008c) {
                return this.f17929h[i];
            }
            i = this.f17928g[i];
        }
        return 0.0f;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: g */
    public boolean mo18349g(C7552i c7552i) {
        int i = this.f17930i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f17922a; i2++) {
            if (this.f17927f[i] == c7552i.f18008c) {
                return true;
            }
            i = this.f17928g[i];
        }
        return false;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: h */
    public float mo18348h(C7540b c7540b, boolean z) {
        float mo18350f = mo18350f(c7540b.f17933a);
        mo18346j(c7540b.f17933a, z);
        C7540b.InterfaceC7541a interfaceC7541a = c7540b.f17937e;
        int mo18355a = interfaceC7541a.mo18355a();
        for (int i = 0; i < mo18355a; i++) {
            C7552i mo18354b = interfaceC7541a.mo18354b(i);
            mo18351e(mo18354b, interfaceC7541a.mo18350f(mo18354b) * mo18350f, z);
        }
        return mo18350f;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: i */
    public final void mo18347i(C7552i c7552i, float f) {
        if (f == 0.0f) {
            mo18346j(c7552i, true);
            return;
        }
        int i = this.f17930i;
        if (i == -1) {
            this.f17930i = 0;
            this.f17929h[0] = f;
            this.f17927f[0] = c7552i.f18008c;
            this.f17928g[0] = -1;
            c7552i.f18018m++;
            c7552i.m18362a(this.f17923b);
            this.f17922a++;
            if (this.f17932k) {
                return;
            }
            int i2 = this.f17931j + 1;
            this.f17931j = i2;
            int[] iArr = this.f17927f;
            if (i2 >= iArr.length) {
                this.f17932k = true;
                this.f17931j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f17922a; i4++) {
            int[] iArr2 = this.f17927f;
            int i5 = iArr2[i];
            int i6 = c7552i.f18008c;
            if (i5 == i6) {
                this.f17929h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f17928g[i];
        }
        int i7 = this.f17931j;
        int i8 = i7 + 1;
        if (this.f17932k) {
            int[] iArr3 = this.f17927f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f17927f;
        if (i7 >= iArr4.length && this.f17922a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f17927f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f17927f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f17925d * 2;
            this.f17925d = i10;
            this.f17932k = false;
            this.f17931j = i7 - 1;
            this.f17929h = Arrays.copyOf(this.f17929h, i10);
            this.f17927f = Arrays.copyOf(this.f17927f, this.f17925d);
            this.f17928g = Arrays.copyOf(this.f17928g, this.f17925d);
        }
        this.f17927f[i7] = c7552i.f18008c;
        this.f17929h[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f17928g;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.f17928g[i7] = this.f17930i;
            this.f17930i = i7;
        }
        c7552i.f18018m++;
        c7552i.m18362a(this.f17923b);
        this.f17922a++;
        if (!this.f17932k) {
            this.f17931j++;
        }
        if (this.f17922a >= this.f17927f.length) {
            this.f17932k = true;
        }
        int i11 = this.f17931j;
        int[] iArr8 = this.f17927f;
        if (i11 >= iArr8.length) {
            this.f17932k = true;
            this.f17931j = iArr8.length - 1;
        }
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: j */
    public final float mo18346j(C7552i c7552i, boolean z) {
        if (this.f17926e == c7552i) {
            this.f17926e = null;
        }
        int i = this.f17930i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f17922a) {
            if (this.f17927f[i] == c7552i.f18008c) {
                if (i == this.f17930i) {
                    this.f17930i = this.f17928g[i];
                } else {
                    int[] iArr = this.f17928g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c7552i.m18360c(this.f17923b);
                }
                c7552i.f18018m--;
                this.f17922a--;
                this.f17927f[i] = -1;
                if (this.f17932k) {
                    this.f17931j = i;
                }
                return this.f17929h[i];
            }
            i2++;
            i3 = i;
            i = this.f17928g[i];
        }
        return 0.0f;
    }

    @Override // p201g.p219f.p223b.C7540b.InterfaceC7541a
    /* renamed from: k */
    public void mo18345k(float f) {
        int i = this.f17930i;
        for (int i2 = 0; i != -1 && i2 < this.f17922a; i2++) {
            float[] fArr = this.f17929h;
            fArr[i] = fArr[i] / f;
            i = this.f17928g[i];
        }
    }

    public String toString() {
        int i = this.f17930i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f17922a; i2++) {
            str = ((str + " -> ") + this.f17929h[i] + " : ") + this.f17924c.f17942d[this.f17927f[i]];
            i = this.f17928g[i];
        }
        return str;
    }
}
