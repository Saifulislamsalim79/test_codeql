package io.intercom.com.bumptech.glide.load.p402o.p405e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.p057e.C1355f;
import p201g.p202a.p203k.p204a.C7462a;
/* compiled from: DrawableDecoderCompat.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.e.a */
/* loaded from: classes3.dex */
public final class C10781a {

    /* renamed from: a */
    private static volatile boolean f24629a = true;

    /* renamed from: a */
    public static Drawable m12351a(Context context, int i) {
        return m12350b(context, i, null);
    }

    /* renamed from: b */
    public static Drawable m12350b(Context context, int i, Resources.Theme theme) {
        try {
            if (f24629a) {
                return m12348d(context, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (NoClassDefFoundError unused2) {
            f24629a = false;
        }
        if (theme == null) {
            theme = context.getTheme();
        }
        return m12349c(context, i, theme);
    }

    /* renamed from: c */
    private static Drawable m12349c(Context context, int i, Resources.Theme theme) {
        return C1355f.m36246d(context.getResources(), i, theme);
    }

    /* renamed from: d */
    private static Drawable m12348d(Context context, int i) {
        return C7462a.m18690d(context, i);
    }
}
