package p201g.p227h.p228e;

import android.graphics.Insets;
import android.graphics.Rect;
/* compiled from: Insets.java */
/* renamed from: g.h.e.b */
/* loaded from: classes2.dex */
public final class C7604b {

    /* renamed from: e */
    public static final C7604b f18272e = new C7604b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f18273a;

    /* renamed from: b */
    public final int f18274b;

    /* renamed from: c */
    public final int f18275c;

    /* renamed from: d */
    public final int f18276d;

    private C7604b(int i, int i2, int i3, int i4) {
        this.f18273a = i;
        this.f18274b = i2;
        this.f18275c = i3;
        this.f18276d = i4;
    }

    /* renamed from: a */
    public static C7604b m18065a(C7604b c7604b, C7604b c7604b2) {
        return m18064b(Math.max(c7604b.f18273a, c7604b2.f18273a), Math.max(c7604b.f18274b, c7604b2.f18274b), Math.max(c7604b.f18275c, c7604b2.f18275c), Math.max(c7604b.f18276d, c7604b2.f18276d));
    }

    /* renamed from: b */
    public static C7604b m18064b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f18272e;
        }
        return new C7604b(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C7604b m18063c(Rect rect) {
        return m18064b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C7604b m18062d(Insets insets) {
        return m18064b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets m18061e() {
        return Insets.of(this.f18273a, this.f18274b, this.f18275c, this.f18276d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7604b.class != obj.getClass()) {
            return false;
        }
        C7604b c7604b = (C7604b) obj;
        return this.f18276d == c7604b.f18276d && this.f18273a == c7604b.f18273a && this.f18275c == c7604b.f18275c && this.f18274b == c7604b.f18274b;
    }

    public int hashCode() {
        return (((((this.f18273a * 31) + this.f18274b) * 31) + this.f18275c) * 31) + this.f18276d;
    }

    public String toString() {
        return "Insets{left=" + this.f18273a + ", top=" + this.f18274b + ", right=" + this.f18275c + ", bottom=" + this.f18276d + '}';
    }
}
