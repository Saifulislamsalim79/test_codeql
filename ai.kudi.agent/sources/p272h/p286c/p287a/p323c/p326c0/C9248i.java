package p272h.p286c.p287a.p323c.p326c0;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: RelativeCornerSize.java */
/* renamed from: h.c.a.c.c0.i */
/* loaded from: classes2.dex */
public final class C9248i implements InterfaceC9239c {

    /* renamed from: a */
    private final float f21714a;

    public C9248i(float f) {
        this.f21714a = f;
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9239c
    /* renamed from: a */
    public float mo15365a(RectF rectF) {
        return this.f21714a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9248i) && this.f21714a == ((C9248i) obj).f21714a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21714a)});
    }
}
