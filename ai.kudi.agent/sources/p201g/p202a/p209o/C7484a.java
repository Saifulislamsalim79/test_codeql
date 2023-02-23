package p201g.p202a.p209o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p201g.p202a.C7452a;
import p201g.p202a.C7453b;
import p201g.p202a.C7455d;
import p201g.p202a.C7461j;
/* compiled from: ActionBarPolicy.java */
/* renamed from: g.a.o.a */
/* loaded from: classes2.dex */
public class C7484a {

    /* renamed from: a */
    private Context f17759a;

    private C7484a(Context context) {
        this.f17759a = context;
    }

    /* renamed from: b */
    public static C7484a m18609b(Context context) {
        return new C7484a(context);
    }

    /* renamed from: a */
    public boolean m18610a() {
        return this.f17759a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m18608c() {
        return this.f17759a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m18607d() {
        Configuration configuration = this.f17759a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public int m18606e() {
        return this.f17759a.getResources().getDimensionPixelSize(C7455d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int m18605f() {
        TypedArray obtainStyledAttributes = this.f17759a.obtainStyledAttributes(null, C7461j.ActionBar, C7452a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C7461j.ActionBar_height, 0);
        Resources resources = this.f17759a.getResources();
        if (!m18604g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C7455d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m18604g() {
        return this.f17759a.getResources().getBoolean(C7453b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean m18603h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f17759a).hasPermanentMenuKey();
    }
}
