package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GifViewUtils.java */
/* renamed from: pl.droidsonroids.gif.f */
/* loaded from: classes3.dex */
public final class C14750f {

    /* renamed from: a */
    static final List<String> f33010a = Arrays.asList("raw", "drawable", "mipmap");

    /* renamed from: a */
    static void m400a(int i, Drawable drawable) {
        if (drawable instanceof C14741b) {
            ((C14741b) drawable).m411h(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m399b(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.density;
        if (i2 == 0) {
            i2 = 160;
        } else if (i2 == 65535) {
            i2 = 0;
        }
        int i3 = resources.getDisplayMetrics().densityDpi;
        if (i2 <= 0 || i3 <= 0) {
            return 1.0f;
        }
        return i3 / i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C14751a m398c(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null && !imageView.isInEditMode()) {
            C14751a c14751a = new C14751a(imageView, attributeSet, i, i2);
            int i3 = c14751a.f33014b;
            if (i3 >= 0) {
                m400a(i3, imageView.getDrawable());
                m400a(i3, imageView.getBackground());
            }
            return c14751a;
        }
        return new C14751a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m397d(ImageView imageView, Uri uri) {
        if (uri != null) {
            try {
                imageView.setImageDrawable(new C14741b(imageView.getContext().getContentResolver(), uri));
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m396e(ImageView imageView, boolean z, int i) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (f33010a.contains(resources.getResourceTypeName(i))) {
                    C14741b c14741b = new C14741b(resources, i);
                    if (z) {
                        imageView.setImageDrawable(c14741b);
                        return true;
                    }
                    imageView.setBackground(c14741b);
                    return true;
                }
                return false;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }

    /* compiled from: GifViewUtils.java */
    /* renamed from: pl.droidsonroids.gif.f$a */
    /* loaded from: classes3.dex */
    static class C14751a extends C14752b {

        /* renamed from: c */
        final int f33011c;

        /* renamed from: d */
        final int f33012d;

        C14751a(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
            super(imageView, attributeSet, i, i2);
            this.f33011c = m395a(imageView, attributeSet, true);
            this.f33012d = m395a(imageView, attributeSet, false);
        }

        /* renamed from: a */
        private static int m395a(ImageView imageView, AttributeSet attributeSet, boolean z) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (C14750f.f33010a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !C14750f.m396e(imageView, z, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }

        C14751a() {
            this.f33011c = 0;
            this.f33012d = 0;
        }
    }

    /* compiled from: GifViewUtils.java */
    /* renamed from: pl.droidsonroids.gif.f$b */
    /* loaded from: classes3.dex */
    static class C14752b {

        /* renamed from: a */
        boolean f33013a;

        /* renamed from: b */
        final int f33014b;

        C14752b(View view, AttributeSet attributeSet, int i, int i2) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C14755i.GifView, i, i2);
            this.f33013a = obtainStyledAttributes.getBoolean(C14755i.GifView_freezesAnimation, false);
            this.f33014b = obtainStyledAttributes.getInt(C14755i.GifView_loopCount, -1);
            obtainStyledAttributes.recycle();
        }

        C14752b() {
            this.f33013a = false;
            this.f33014b = -1;
        }
    }
}
