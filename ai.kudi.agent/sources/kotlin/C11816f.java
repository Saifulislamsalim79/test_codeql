package kotlin;
/* compiled from: KotlinVersion.kt */
/* renamed from: kotlin.f */
/* loaded from: classes3.dex */
public final class C11816f implements Comparable<C11816f> {

    /* renamed from: w */
    public static final C11816f f26502w = C11820g.m10301a();

    /* renamed from: c */
    private final int f26503c;

    /* renamed from: d */
    private final int f26504d;

    /* renamed from: e */
    private final int f26505e;

    /* renamed from: f */
    private final int f26506f;

    public C11816f(int i, int i2, int i3) {
        this.f26504d = i;
        this.f26505e = i2;
        this.f26506f = i3;
        this.f26503c = m10304b(i, i2, i3);
    }

    /* renamed from: b */
    private final int m10304b(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C11816f c11816f) {
        kotlin.e0.d.l.f(c11816f, "other");
        return this.f26503c - c11816f.f26503c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11816f)) {
            obj = null;
        }
        C11816f c11816f = (C11816f) obj;
        return c11816f != null && this.f26503c == c11816f.f26503c;
    }

    public int hashCode() {
        return this.f26503c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26504d);
        sb.append('.');
        sb.append(this.f26505e);
        sb.append('.');
        sb.append(this.f26506f);
        return sb.toString();
    }
}
