package p198f.p199a.p200b;
/* compiled from: FrameMetaData.kt */
/* renamed from: f.a.b.g */
/* loaded from: classes2.dex */
public final class C7442g {

    /* renamed from: a */
    private final int f17641a;

    /* renamed from: b */
    private final int f17642b;

    /* renamed from: c */
    private final int f17643c;

    public C7442g(int i, int i2, int i3) {
        this.f17641a = i;
        this.f17642b = i2;
        this.f17643c = i3;
    }

    /* renamed from: a */
    public final int m18716a() {
        return this.f17642b;
    }

    /* renamed from: b */
    public final int m18715b() {
        return this.f17643c;
    }

    /* renamed from: c */
    public final int m18714c() {
        return this.f17641a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7442g) {
            C7442g c7442g = (C7442g) obj;
            return this.f17641a == c7442g.f17641a && this.f17642b == c7442g.f17642b && this.f17643c == c7442g.f17643c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f17641a * 31) + this.f17642b) * 31) + this.f17643c;
    }

    public String toString() {
        return "FrameMetaData(width=" + this.f17641a + ", height=" + this.f17642b + ", rotation=" + this.f17643c + ')';
    }
}
