package p425j.p434c.p435a.p442x;

import android.content.Context;
/* compiled from: Dip.java */
/* renamed from: j.c.a.x.b */
/* loaded from: classes3.dex */
public class C11263b {

    /* renamed from: a */
    private final float f25396a;

    public C11263b(float f) {
        this.f25396a = f;
    }

    /* renamed from: a */
    public static C11263b m11271a(Context context) {
        return new C11263b(context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: b */
    public int m11270b(int i) {
        return (int) ((i * this.f25396a) + 0.5f);
    }
}
