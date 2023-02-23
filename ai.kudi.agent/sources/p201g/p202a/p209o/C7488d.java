package p201g.p202a.p209o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p201g.p202a.C7460i;
/* compiled from: ContextThemeWrapper.java */
/* renamed from: g.a.o.d */
/* loaded from: classes2.dex */
public class C7488d extends ContextWrapper {

    /* renamed from: a */
    private int f17762a;

    /* renamed from: b */
    private Resources.Theme f17763b;

    /* renamed from: c */
    private LayoutInflater f17764c;

    /* renamed from: d */
    private Configuration f17765d;

    /* renamed from: e */
    private Resources f17766e;

    public C7488d() {
        super(null);
    }

    /* renamed from: b */
    private Resources m18596b() {
        if (this.f17766e == null) {
            Configuration configuration = this.f17765d;
            if (configuration == null) {
                this.f17766e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f17766e = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources = super.getResources();
                Configuration configuration2 = new Configuration(resources.getConfiguration());
                configuration2.updateFrom(this.f17765d);
                this.f17766e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
            }
        }
        return this.f17766e;
    }

    /* renamed from: d */
    private void m18594d() {
        boolean z = this.f17763b == null;
        if (z) {
            this.f17763b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f17763b.setTo(theme);
            }
        }
        m18593e(this.f17763b, this.f17762a, z);
    }

    /* renamed from: a */
    public void m18597a(Configuration configuration) {
        if (this.f17766e == null) {
            if (this.f17765d == null) {
                this.f17765d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int m18595c() {
        return this.f17762a;
    }

    /* renamed from: e */
    protected void m18593e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m18596b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f17764c == null) {
                this.f17764c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f17764c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f17763b;
        if (theme != null) {
            return theme;
        }
        if (this.f17762a == 0) {
            this.f17762a = C7460i.Theme_AppCompat_Light;
        }
        m18594d();
        return this.f17763b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f17762a != i) {
            this.f17762a = i;
            m18594d();
        }
    }

    public C7488d(Context context, int i) {
        super(context);
        this.f17762a = i;
    }

    public C7488d(Context context, Resources.Theme theme) {
        super(context);
        this.f17763b = theme;
    }
}
