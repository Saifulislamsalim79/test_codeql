package p272h.p286c.p287a.p323c.p337u;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: DrawableUtils.java */
/* renamed from: h.c.a.c.u.a */
/* loaded from: classes2.dex */
public final class C9312a {
    /* renamed from: a */
    public static PorterDuffColorFilter m15077a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
