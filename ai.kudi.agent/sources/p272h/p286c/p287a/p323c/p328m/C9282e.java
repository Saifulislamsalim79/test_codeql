package p272h.p286c.p287a.p323c.p328m;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;
/* compiled from: DrawableAlphaProperty.java */
/* renamed from: h.c.a.c.m.e */
/* loaded from: classes2.dex */
public class C9282e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f21813b = new C9282e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f21814a;

    private C9282e() {
        super(Integer.class, "drawableAlphaCompat");
        this.f21814a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f21814a.containsKey(drawable)) {
            return this.f21814a.get(drawable);
        }
        return 255;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f21814a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
