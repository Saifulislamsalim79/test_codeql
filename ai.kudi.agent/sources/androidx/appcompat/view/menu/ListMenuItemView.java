package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1016n;
import androidx.appcompat.widget.C1138r0;
import p201g.p202a.C7452a;
import p201g.p202a.C7457f;
import p201g.p202a.C7458g;
import p201g.p202a.C7461j;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1016n.InterfaceC1017a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    private LinearLayout f2759A;

    /* renamed from: B */
    private Drawable f2760B;

    /* renamed from: C */
    private int f2761C;

    /* renamed from: D */
    private Context f2762D;

    /* renamed from: E */
    private boolean f2763E;

    /* renamed from: F */
    private Drawable f2764F;

    /* renamed from: G */
    private boolean f2765G;

    /* renamed from: H */
    private LayoutInflater f2766H;

    /* renamed from: I */
    private boolean f2767I;

    /* renamed from: c */
    private C1003i f2768c;

    /* renamed from: d */
    private ImageView f2769d;

    /* renamed from: e */
    private RadioButton f2770e;

    /* renamed from: f */
    private TextView f2771f;

    /* renamed from: w */
    private CheckBox f2772w;

    /* renamed from: x */
    private TextView f2773x;

    /* renamed from: y */
    private ImageView f2774y;

    /* renamed from: z */
    private ImageView f2775z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7452a.listMenuViewStyle);
    }

    /* renamed from: a */
    private void m37592a(View view) {
        m37591b(view, -1);
    }

    /* renamed from: b */
    private void m37591b(View view, int i) {
        LinearLayout linearLayout = this.f2759A;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m37590c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C7458g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f2772w = checkBox;
        m37592a(checkBox);
    }

    /* renamed from: f */
    private void m37589f() {
        ImageView imageView = (ImageView) getInflater().inflate(C7458g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f2769d = imageView;
        m37591b(imageView, 0);
    }

    /* renamed from: g */
    private void m37588g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C7458g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f2770e = radioButton;
        m37592a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f2766H == null) {
            this.f2766H = LayoutInflater.from(getContext());
        }
        return this.f2766H;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f2774y;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2775z;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2775z.getLayoutParams();
        rect.top += this.f2775z.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    /* renamed from: d */
    public boolean mo26854d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    /* renamed from: e */
    public void mo26853e(C1003i c1003i, int i) {
        this.f2768c = c1003i;
        setVisibility(c1003i.isVisible() ? 0 : 8);
        setTitle(c1003i.m37496i(this));
        setCheckable(c1003i.isCheckable());
        m37587h(c1003i.m37504A(), c1003i.m37498g());
        setIcon(c1003i.getIcon());
        setEnabled(c1003i.isEnabled());
        setSubMenuArrowVisible(c1003i.hasSubMenu());
        setContentDescription(c1003i.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1016n.InterfaceC1017a
    public C1003i getItemData() {
        return this.f2768c;
    }

    /* renamed from: h */
    public void m37587h(boolean z, char c) {
        int i = (z && this.f2768c.m37504A()) ? 0 : 8;
        if (i == 0) {
            this.f2773x.setText(this.f2768c.m37497h());
        }
        if (this.f2773x.getVisibility() != i) {
            this.f2773x.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C7759x.m17492s0(this, this.f2760B);
        TextView textView = (TextView) findViewById(C7457f.title);
        this.f2771f = textView;
        int i = this.f2761C;
        if (i != -1) {
            textView.setTextAppearance(this.f2762D, i);
        }
        this.f2773x = (TextView) findViewById(C7457f.shortcut);
        ImageView imageView = (ImageView) findViewById(C7457f.submenuarrow);
        this.f2774y = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2764F);
        }
        this.f2775z = (ImageView) findViewById(C7457f.group_divider);
        this.f2759A = (LinearLayout) findViewById(C7457f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f2769d != null && this.f2763E) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2769d.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f2770e == null && this.f2772w == null) {
            return;
        }
        if (this.f2768c.m37492m()) {
            if (this.f2770e == null) {
                m37588g();
            }
            compoundButton = this.f2770e;
            compoundButton2 = this.f2772w;
        } else {
            if (this.f2772w == null) {
                m37590c();
            }
            compoundButton = this.f2772w;
            compoundButton2 = this.f2770e;
        }
        if (z) {
            compoundButton.setChecked(this.f2768c.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f2772w;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f2770e;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2768c.m37492m()) {
            if (this.f2770e == null) {
                m37588g();
            }
            compoundButton = this.f2770e;
        } else {
            if (this.f2772w == null) {
                m37590c();
            }
            compoundButton = this.f2772w;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2767I = z;
        this.f2763E = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f2775z;
        if (imageView != null) {
            imageView.setVisibility((this.f2765G || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f2768c.m37479z() || this.f2767I;
        if (z || this.f2763E) {
            if (this.f2769d == null && drawable == null && !this.f2763E) {
                return;
            }
            if (this.f2769d == null) {
                m37589f();
            }
            if (drawable == null && !this.f2763E) {
                this.f2769d.setVisibility(8);
                return;
            }
            ImageView imageView = this.f2769d;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.f2769d.getVisibility() != 0) {
                this.f2769d.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f2771f.setText(charSequence);
            if (this.f2771f.getVisibility() != 0) {
                this.f2771f.setVisibility(0);
            }
        } else if (this.f2771f.getVisibility() != 8) {
            this.f2771f.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C1138r0 m37026v = C1138r0.m37026v(getContext(), attributeSet, C7461j.MenuView, i, 0);
        this.f2760B = m37026v.m37041g(C7461j.MenuView_android_itemBackground);
        this.f2761C = m37026v.m37034n(C7461j.MenuView_android_itemTextAppearance, -1);
        this.f2763E = m37026v.m37047a(C7461j.MenuView_preserveIconSpacing, false);
        this.f2762D = context;
        this.f2764F = m37026v.m37041g(C7461j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C7452a.dropDownListViewStyle, 0);
        this.f2765G = obtainStyledAttributes.hasValue(0);
        m37026v.m37025w();
        obtainStyledAttributes.recycle();
    }
}
