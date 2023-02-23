package com.bumptech.glide.load.p074o.p076e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C1335a;
import androidx.core.content.p057e.C1355f;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p202a.p209o.C7488d;
/* compiled from: DrawableDecoderCompat.java */
/* renamed from: com.bumptech.glide.load.o.e.a */
/* loaded from: classes2.dex */
public final class C2254a {

    /* renamed from: a */
    private static volatile boolean f6593a = true;

    /* renamed from: a */
    public static Drawable m33485a(Context context, int i, Resources.Theme theme) {
        return m33483c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m33484b(Context context, Context context2, int i) {
        return m33483c(context, context2, i, null);
    }

    /* renamed from: c */
    private static Drawable m33483c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f6593a) {
                return m33481e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C1335a.m36322f(context2, i);
            }
            throw e;
        } catch (NoClassDefFoundError unused2) {
            f6593a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m33482d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m33482d(Context context, int i, Resources.Theme theme) {
        return C1355f.m36246d(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m33481e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new C7488d(context, theme);
        }
        return C7462a.m18690d(context, i);
    }
}
