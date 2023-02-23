package ai.kudi.dip.library.p046j;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1335a;
import kotlin.e0.d.l;
/* compiled from: DrawableExt.kt */
/* renamed from: ai.kudi.dip.library.j.a */
/* loaded from: classes2.dex */
public final class C0828a {
    /* renamed from: a */
    public static final Drawable m37918a(Drawable drawable, Context context, int i) {
        l.f(drawable, "<this>");
        l.f(context, "context");
        drawable.mutate();
        drawable.setColorFilter(new PorterDuffColorFilter(C1335a.m36324d(context, i), PorterDuff.Mode.SRC_IN));
        return drawable;
    }
}
