package p201g.p219f.p223b;

import java.util.Arrays;
/* compiled from: SolverVariable.java */
/* renamed from: g.f.b.i */
/* loaded from: classes2.dex */
public class C7552i {

    /* renamed from: q */
    private static int f18005q = 1;

    /* renamed from: a */
    public boolean f18006a;

    /* renamed from: b */
    private String f18007b;

    /* renamed from: f */
    public float f18011f;

    /* renamed from: j */
    EnumC7553a f18015j;

    /* renamed from: c */
    public int f18008c = -1;

    /* renamed from: d */
    int f18009d = -1;

    /* renamed from: e */
    public int f18010e = 0;

    /* renamed from: g */
    public boolean f18012g = false;

    /* renamed from: h */
    float[] f18013h = new float[9];

    /* renamed from: i */
    float[] f18014i = new float[9];

    /* renamed from: k */
    C7540b[] f18016k = new C7540b[16];

    /* renamed from: l */
    int f18017l = 0;

    /* renamed from: m */
    public int f18018m = 0;

    /* renamed from: n */
    boolean f18019n = false;

    /* renamed from: o */
    int f18020o = -1;

    /* renamed from: p */
    float f18021p = 0.0f;

    /* compiled from: SolverVariable.java */
    /* renamed from: g.f.b.i$a */
    /* loaded from: classes2.dex */
    public enum EnumC7553a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C7552i(EnumC7553a enumC7553a, String str) {
        this.f18015j = enumC7553a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m18361b() {
        f18005q++;
    }

    /* renamed from: a */
    public final void m18362a(C7540b c7540b) {
        int i = 0;
        while (true) {
            int i2 = this.f18017l;
            if (i < i2) {
                if (this.f18016k[i] == c7540b) {
                    return;
                }
                i++;
            } else {
                C7540b[] c7540bArr = this.f18016k;
                if (i2 >= c7540bArr.length) {
                    this.f18016k = (C7540b[]) Arrays.copyOf(c7540bArr, c7540bArr.length * 2);
                }
                C7540b[] c7540bArr2 = this.f18016k;
                int i3 = this.f18017l;
                c7540bArr2[i3] = c7540b;
                this.f18017l = i3 + 1;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m18360c(C7540b c7540b) {
        int i = this.f18017l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f18016k[i2] == c7540b) {
                while (i2 < i - 1) {
                    C7540b[] c7540bArr = this.f18016k;
                    int i3 = i2 + 1;
                    c7540bArr[i2] = c7540bArr[i3];
                    i2 = i3;
                }
                this.f18017l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void m18359d() {
        this.f18007b = null;
        this.f18015j = EnumC7553a.UNKNOWN;
        this.f18010e = 0;
        this.f18008c = -1;
        this.f18009d = -1;
        this.f18011f = 0.0f;
        this.f18012g = false;
        this.f18019n = false;
        this.f18020o = -1;
        this.f18021p = 0.0f;
        int i = this.f18017l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f18016k[i2] = null;
        }
        this.f18017l = 0;
        this.f18018m = 0;
        this.f18006a = false;
        Arrays.fill(this.f18014i, 0.0f);
    }

    /* renamed from: e */
    public void m18358e(C7543d c7543d, float f) {
        this.f18011f = f;
        this.f18012g = true;
        this.f18019n = false;
        this.f18020o = -1;
        this.f18021p = 0.0f;
        int i = this.f18017l;
        this.f18009d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f18016k[i2].m18435A(c7543d, this, false);
        }
        this.f18017l = 0;
    }

    /* renamed from: f */
    public void m18357f(EnumC7553a enumC7553a, String str) {
        this.f18015j = enumC7553a;
    }

    /* renamed from: g */
    public final void m18356g(C7543d c7543d, C7540b c7540b) {
        int i = this.f18017l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f18016k[i2].mo18374B(c7543d, c7540b, false);
        }
        this.f18017l = 0;
    }

    public String toString() {
        if (this.f18007b != null) {
            return "" + this.f18007b;
        }
        return "" + this.f18008c;
    }
}
