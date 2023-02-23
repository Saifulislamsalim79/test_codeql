package p272h.p286c.p287a.p323c.p326c0;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: AbsoluteCornerSize.java */
/* renamed from: h.c.a.c.c0.a */
/* loaded from: classes2.dex */
public final class C9237a implements InterfaceC9239c {

    /* renamed from: a */
    private final float f21662a;

    public C9237a(float f) {
        this.f21662a = f;
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9239c
    /* renamed from: a */
    public float mo15365a(RectF rectF) {
        return this.f21662a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9237a) && this.f21662a == ((C9237a) obj).f21662a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21662a)});
    }
}
