package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;
/* compiled from: ActionBarDrawerToggleHoneycomb.java */
/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes2.dex */
class C0934c {

    /* renamed from: a */
    private static final int[] f2554a = {16843531};

    /* compiled from: ActionBarDrawerToggleHoneycomb.java */
    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes2.dex */
    static class C0935a {

        /* renamed from: a */
        public Method f2555a;

        /* renamed from: b */
        public Method f2556b;

        /* renamed from: c */
        public ImageView f2557c;

        C0935a(Activity activity) {
            try {
                this.f2555a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f2556b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f2557c = (ImageView) childAt;
                }
            }
        }
    }

    /* renamed from: a */
    public static Drawable m37789a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f2554a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: b */
    public static C0935a m37788b(C0935a c0935a, Activity activity, int i) {
        if (c0935a == null) {
            c0935a = new C0935a(activity);
        }
        if (c0935a.f2555a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                c0935a.f2556b.invoke(actionBar, Integer.valueOf(i));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return c0935a;
    }

    /* renamed from: c */
    public static C0935a m37787c(Activity activity, Drawable drawable, int i) {
        C0935a c0935a = new C0935a(activity);
        if (c0935a.f2555a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                c0935a.f2555a.invoke(actionBar, drawable);
                c0935a.f2556b.invoke(actionBar, Integer.valueOf(i));
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else {
            ImageView imageView = c0935a.f2557c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
            }
        }
        return c0935a;
    }
}
