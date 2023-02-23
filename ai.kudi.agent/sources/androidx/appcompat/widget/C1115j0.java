package androidx.appcompat.widget;
/* compiled from: RtlSpacingHelper.java */
/* renamed from: androidx.appcompat.widget.j0 */
/* loaded from: classes2.dex */
class C1115j0 {

    /* renamed from: a */
    private int f3379a = 0;

    /* renamed from: b */
    private int f3380b = 0;

    /* renamed from: c */
    private int f3381c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f3382d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f3383e = 0;

    /* renamed from: f */
    private int f3384f = 0;

    /* renamed from: g */
    private boolean f3385g = false;

    /* renamed from: h */
    private boolean f3386h = false;

    /* renamed from: a */
    public int m37112a() {
        return this.f3385g ? this.f3379a : this.f3380b;
    }

    /* renamed from: b */
    public int m37111b() {
        return this.f3379a;
    }

    /* renamed from: c */
    public int m37110c() {
        return this.f3380b;
    }

    /* renamed from: d */
    public int m37109d() {
        return this.f3385g ? this.f3380b : this.f3379a;
    }

    /* renamed from: e */
    public void m37108e(int i, int i2) {
        this.f3386h = false;
        if (i != Integer.MIN_VALUE) {
            this.f3383e = i;
            this.f3379a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3384f = i2;
            this.f3380b = i2;
        }
    }

    /* renamed from: f */
    public void m37107f(boolean z) {
        if (z == this.f3385g) {
            return;
        }
        this.f3385g = z;
        if (!this.f3386h) {
            this.f3379a = this.f3383e;
            this.f3380b = this.f3384f;
        } else if (z) {
            int i = this.f3382d;
            if (i == Integer.MIN_VALUE) {
                i = this.f3383e;
            }
            this.f3379a = i;
            int i2 = this.f3381c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f3384f;
            }
            this.f3380b = i2;
        } else {
            int i3 = this.f3381c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f3383e;
            }
            this.f3379a = i3;
            int i4 = this.f3382d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f3384f;
            }
            this.f3380b = i4;
        }
    }

    /* renamed from: g */
    public void m37106g(int i, int i2) {
        this.f3381c = i;
        this.f3382d = i2;
        this.f3386h = true;
        if (this.f3385g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3379a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3380b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3379a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3380b = i2;
        }
    }
}
