package p272h.p286c.p287a.p323c.p326c0;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: AdjustedCornerSize.java */
/* renamed from: h.c.a.c.c0.b */
/* loaded from: classes2.dex */
public final class C9238b implements InterfaceC9239c {

    /* renamed from: a */
    private final InterfaceC9239c f21663a;

    /* renamed from: b */
    private final float f21664b;

    public C9238b(float f, InterfaceC9239c interfaceC9239c) {
        while (interfaceC9239c instanceof C9238b) {
            interfaceC9239c = ((C9238b) interfaceC9239c).f21663a;
            f += ((C9238b) interfaceC9239c).f21664b;
        }
        this.f21663a = interfaceC9239c;
        this.f21664b = f;
    }

    @Override // p272h.p286c.p287a.p323c.p326c0.InterfaceC9239c
    /* renamed from: a */
    public float mo15365a(RectF rectF) {
        return Math.max(0.0f, this.f21663a.mo15365a(rectF) + this.f21664b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9238b) {
            C9238b c9238b = (C9238b) obj;
            return this.f21663a.equals(c9238b.f21663a) && this.f21664b == c9238b.f21664b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21663a, Float.valueOf(this.f21664b)});
    }
}
