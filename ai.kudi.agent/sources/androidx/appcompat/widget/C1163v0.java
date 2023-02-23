package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p201g.p202a.C7455d;
import p201g.p202a.C7457f;
import p201g.p202a.C7458g;
import p201g.p202a.C7460i;
/* compiled from: TooltipPopup.java */
/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: classes2.dex */
class C1163v0 {

    /* renamed from: a */
    private final Context f3553a;

    /* renamed from: b */
    private final View f3554b;

    /* renamed from: c */
    private final TextView f3555c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f3556d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f3557e = new Rect();

    /* renamed from: f */
    private final int[] f3558f = new int[2];

    /* renamed from: g */
    private final int[] f3559g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1163v0(Context context) {
        this.f3553a = context;
        View inflate = LayoutInflater.from(context).inflate(C7458g.abc_tooltip, (ViewGroup) null);
        this.f3554b = inflate;
        this.f3555c = (TextView) inflate.findViewById(C7457f.message);
        this.f3556d.setTitle(C1163v0.class.getSimpleName());
        this.f3556d.packageName = this.f3553a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f3556d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C7460i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m36946a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f3553a.getResources().getDimensionPixelOffset(C7455d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3553a.getResources().getDimensionPixelOffset(C7455d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f3553a.getResources().getDimensionPixelOffset(z ? C7455d.tooltip_y_offset_touch : C7455d.tooltip_y_offset_non_touch);
        View m36945b = m36945b(view);
        if (m36945b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m36945b.getWindowVisibleDisplayFrame(this.f3557e);
        Rect rect = this.f3557e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f3553a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f3557e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m36945b.getLocationOnScreen(this.f3559g);
        view.getLocationOnScreen(this.f3558f);
        int[] iArr = this.f3558f;
        int i4 = iArr[0];
        int[] iArr2 = this.f3559g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (m36945b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3554b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f3554b.getMeasuredHeight();
        int[] iArr3 = this.f3558f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (z) {
            if (i5 >= 0) {
                layoutParams.y = i5;
            } else {
                layoutParams.y = i6;
            }
        } else if (measuredHeight + i6 <= this.f3557e.height()) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i5;
        }
    }

    /* renamed from: b */
    private static View m36945b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m36944c() {
        if (m36943d()) {
            ((WindowManager) this.f3553a.getSystemService("window")).removeView(this.f3554b);
        }
    }

    /* renamed from: d */
    boolean m36943d() {
        return this.f3554b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36942e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m36943d()) {
            m36944c();
        }
        this.f3555c.setText(charSequence);
        m36946a(view, i, i2, z, this.f3556d);
        ((WindowManager) this.f3553a.getSystemService("window")).addView(this.f3554b, this.f3556d);
    }
}
