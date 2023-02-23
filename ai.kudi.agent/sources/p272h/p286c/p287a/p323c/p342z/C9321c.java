package p272h.p286c.p287a.p323c.p342z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C1138r0;
import p201g.p202a.p203k.p204a.C7462a;
/* compiled from: MaterialResources.java */
/* renamed from: h.c.a.c.z.c */
/* loaded from: classes2.dex */
public class C9321c {
    /* renamed from: a */
    public static ColorStateList m15053a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList m18691c;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m18691c = C7462a.m18691c(context, resourceId)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (color = typedArray.getColor(i, -1)) != -1) {
                return ColorStateList.valueOf(color);
            }
            return typedArray.getColorStateList(i);
        }
        return m18691c;
    }

    /* renamed from: b */
    public static ColorStateList m15052b(Context context, C1138r0 c1138r0, int i) {
        int m37046b;
        int m37034n;
        ColorStateList m18691c;
        if (!c1138r0.m37029s(i) || (m37034n = c1138r0.m37034n(i, 0)) == 0 || (m18691c = C7462a.m18691c(context, m37034n)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (m37046b = c1138r0.m37046b(i, -1)) != -1) {
                return ColorStateList.valueOf(m37046b);
            }
            return c1138r0.m37045c(i);
        }
        return m18691c;
    }

    /* renamed from: c */
    public static int m15051c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    /* renamed from: d */
    public static Drawable m15050d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m18690d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m18690d = C7462a.m18690d(context, resourceId)) == null) ? typedArray.getDrawable(i) : m18690d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m15049e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C9322d m15048f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C9322d(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m15047g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m15046h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
