package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.C4694p;
import com.google.android.material.textfield.TextInputLayout;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9270e;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import p272h.p286c.p287a.p323c.p335s.C9310a;
/* compiled from: DropdownMenuEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes2.dex */
class C4779d extends AbstractC4792e {

    /* renamed from: q */
    private static final boolean f12092q;

    /* renamed from: d */
    private final TextWatcher f12093d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f12094e;

    /* renamed from: f */
    private final TextInputLayout.C4761e f12095f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC4762f f12096g;

    /* renamed from: h */
    private final TextInputLayout.InterfaceC4763g f12097h;

    /* renamed from: i */
    private boolean f12098i;

    /* renamed from: j */
    private boolean f12099j;

    /* renamed from: k */
    private long f12100k;

    /* renamed from: l */
    private StateListDrawable f12101l;

    /* renamed from: m */
    private C9243g f12102m;

    /* renamed from: n */
    private AccessibilityManager f12103n;

    /* renamed from: o */
    private ValueAnimator f12104o;

    /* renamed from: p */
    private ValueAnimator f12105p;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$a */
    /* loaded from: classes2.dex */
    class C4780a extends C4694p {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a */
        /* loaded from: classes2.dex */
        class RunnableC4781a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ AutoCompleteTextView f12107c;

            RunnableC4781a(AutoCompleteTextView autoCompleteTextView) {
                this.f12107c = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f12107c.isPopupShowing();
                C4779d.this.m26352E(isPopupShowing);
                C4779d.this.f12098i = isPopupShowing;
            }
        }

        C4780a() {
        }

        @Override // com.google.android.material.internal.C4694p, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView m26328y = C4779d.m26328y(C4779d.this.f12121a.getEditText());
            if (C4779d.this.f12103n.isTouchExplorationEnabled() && C4779d.m26353D(m26328y) && !C4779d.this.f12123c.hasFocus()) {
                m26328y.dismissDropDown();
            }
            m26328y.post(new RunnableC4781a(m26328y));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$b */
    /* loaded from: classes2.dex */
    public class C4782b implements ValueAnimator.AnimatorUpdateListener {
        C4782b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4779d.this.f12123c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$c */
    /* loaded from: classes2.dex */
    class View$OnFocusChangeListenerC4783c implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC4783c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C4779d.this.f12121a.setEndIconActivated(z);
            if (z) {
                return;
            }
            C4779d.this.m26352E(false);
            C4779d.this.f12098i = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d */
    /* loaded from: classes2.dex */
    class C4784d extends TextInputLayout.C4761e {
        C4784d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C4761e, p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            if (!C4779d.m26353D(C4779d.this.f12121a.getEditText())) {
                c7716c.m17693a0(Spinner.class.getName());
            }
            if (c7716c.m17709L()) {
                c7716c.m17671l0(null);
            }
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: h */
        public void mo17860h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo17860h(view, accessibilityEvent);
            AutoCompleteTextView m26328y = C4779d.m26328y(C4779d.this.f12121a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C4779d.this.f12103n.isTouchExplorationEnabled() && !C4779d.m26353D(C4779d.this.f12121a.getEditText())) {
                C4779d.this.m26349H(m26328y);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$e */
    /* loaded from: classes2.dex */
    class C4785e implements TextInputLayout.InterfaceC4762f {
        C4785e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4762f
        /* renamed from: a */
        public void mo26272a(TextInputLayout textInputLayout) {
            AutoCompleteTextView m26328y = C4779d.m26328y(textInputLayout.getEditText());
            C4779d.this.m26351F(m26328y);
            C4779d.this.m26331v(m26328y);
            C4779d.this.m26350G(m26328y);
            m26328y.setThreshold(0);
            m26328y.removeTextChangedListener(C4779d.this.f12093d);
            m26328y.addTextChangedListener(C4779d.this.f12093d);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C4779d.m26353D(m26328y)) {
                C7759x.m17478z0(C4779d.this.f12123c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C4779d.this.f12095f);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$f */
    /* loaded from: classes2.dex */
    class C4786f implements TextInputLayout.InterfaceC4763g {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$f$a */
        /* loaded from: classes2.dex */
        class RunnableC4787a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ AutoCompleteTextView f12114c;

            RunnableC4787a(AutoCompleteTextView autoCompleteTextView) {
                this.f12114c = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f12114c.removeTextChangedListener(C4779d.this.f12093d);
            }
        }

        C4786f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4763g
        /* renamed from: a */
        public void mo26271a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new RunnableC4787a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == C4779d.this.f12094e) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (C4779d.f12092q) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$g */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC4788g implements View.OnClickListener {
        View$OnClickListenerC4788g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4779d.this.m26349H((AutoCompleteTextView) C4779d.this.f12121a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$h */
    /* loaded from: classes2.dex */
    public class View$OnTouchListenerC4789h implements View.OnTouchListener {

        /* renamed from: c */
        final /* synthetic */ AutoCompleteTextView f12117c;

        View$OnTouchListenerC4789h(AutoCompleteTextView autoCompleteTextView) {
            this.f12117c = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C4779d.this.m26354C()) {
                    C4779d.this.f12098i = false;
                }
                C4779d.this.m26349H(this.f12117c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$i */
    /* loaded from: classes2.dex */
    public class C4790i implements AutoCompleteTextView.OnDismissListener {
        C4790i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C4779d.this.f12098i = true;
            C4779d.this.f12100k = System.currentTimeMillis();
            C4779d.this.m26352E(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$j */
    /* loaded from: classes2.dex */
    public class C4791j extends AnimatorListenerAdapter {
        C4791j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4779d c4779d = C4779d.this;
            c4779d.f12123c.setChecked(c4779d.f12099j);
            C4779d.this.f12105p.start();
        }
    }

    static {
        f12092q = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4779d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f12093d = new C4780a();
        this.f12094e = new View$OnFocusChangeListenerC4783c();
        this.f12095f = new C4784d(this.f12121a);
        this.f12096g = new C4785e();
        this.f12097h = new C4786f();
        this.f12098i = false;
        this.f12099j = false;
        this.f12100k = Long.MAX_VALUE;
    }

    /* renamed from: A */
    private C9243g m26356A(float f, float f2, float f3, int i) {
        C9250k.C9252b m15363a = C9250k.m15363a();
        m15363a.m15338A(f);
        m15363a.m15334E(f);
        m15363a.m15314s(f2);
        m15363a.m15310w(f2);
        C9250k m15320m = m15363a.m15320m();
        C9243g m15385m = C9243g.m15385m(this.f12122b, f3);
        m15385m.setShapeAppearanceModel(m15320m);
        m15385m.m15407Z(0, i, 0, i);
        return m15385m;
    }

    /* renamed from: B */
    private void m26355B() {
        this.f12105p = m26327z(67, 0.0f, 1.0f);
        ValueAnimator m26327z = m26327z(50, 1.0f, 0.0f);
        this.f12104o = m26327z;
        m26327z.addListener(new C4791j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public boolean m26354C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f12100k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static boolean m26353D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m26352E(boolean z) {
        if (this.f12099j != z) {
            this.f12099j = z;
            this.f12105p.cancel();
            this.f12104o.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m26351F(AutoCompleteTextView autoCompleteTextView) {
        if (f12092q) {
            int boxBackgroundMode = this.f12121a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f12102m);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f12101l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m26350G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View$OnTouchListenerC4789h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f12094e);
        if (f12092q) {
            autoCompleteTextView.setOnDismissListener(new C4790i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public void m26349H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m26354C()) {
            this.f12098i = false;
        }
        if (!this.f12098i) {
            if (f12092q) {
                m26352E(!this.f12099j);
            } else {
                this.f12099j = !this.f12099j;
                this.f12123c.toggle();
            }
            if (this.f12099j) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.f12098i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m26331v(AutoCompleteTextView autoCompleteTextView) {
        if (m26353D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f12121a.getBoxBackgroundMode();
        C9243g boxBackground = this.f12121a.getBoxBackground();
        int m15082c = C9310a.m15082c(autoCompleteTextView, C9233b.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            m26329x(autoCompleteTextView, m15082c, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m26330w(autoCompleteTextView, m15082c, iArr, boxBackground);
        }
    }

    /* renamed from: w */
    private void m26330w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C9243g c9243g) {
        int boxBackgroundColor = this.f12121a.getBoxBackgroundColor();
        int[] iArr2 = {C9310a.m15079f(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f12092q) {
            C7759x.m17492s0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c9243g, c9243g));
            return;
        }
        C9243g c9243g2 = new C9243g(c9243g.m15430C());
        c9243g2.m15409X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c9243g, c9243g2});
        int m17551I = C7759x.m17551I(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m17553H = C7759x.m17553H(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C7759x.m17492s0(autoCompleteTextView, layerDrawable);
        C7759x.m17560D0(autoCompleteTextView, m17551I, paddingTop, m17553H, paddingBottom);
    }

    /* renamed from: x */
    private void m26329x(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C9243g c9243g) {
        LayerDrawable layerDrawable;
        int m15082c = C9310a.m15082c(autoCompleteTextView, C9233b.colorSurface);
        C9243g c9243g2 = new C9243g(c9243g.m15430C());
        int m15079f = C9310a.m15079f(i, m15082c, 0.1f);
        c9243g2.m15409X(new ColorStateList(iArr, new int[]{m15079f, 0}));
        if (f12092q) {
            c9243g2.setTint(m15082c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m15079f, m15082c});
            C9243g c9243g3 = new C9243g(c9243g.m15430C());
            c9243g3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c9243g2, c9243g3), c9243g});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c9243g2, c9243g});
        }
        C7759x.m17492s0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static AutoCompleteTextView m26328y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: z */
    private ValueAnimator m26327z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C9278a.f21806a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new C4782b());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC4792e
    /* renamed from: a */
    public void mo26277a() {
        float dimensionPixelOffset = this.f12122b.getResources().getDimensionPixelOffset(C9267d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f12122b.getResources().getDimensionPixelOffset(C9267d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f12122b.getResources().getDimensionPixelOffset(C9267d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C9243g m26356A = m26356A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C9243g m26356A2 = m26356A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f12102m = m26356A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f12101l = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, m26356A);
        this.f12101l.addState(new int[0], m26356A2);
        this.f12121a.setEndIconDrawable(C7462a.m18690d(this.f12122b, f12092q ? C9270e.mtrl_dropdown_arrow : C9270e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f12121a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C9275j.exposed_dropdown_menu_content_description));
        this.f12121a.setEndIconOnClickListener(new View$OnClickListenerC4788g());
        this.f12121a.m26421e(this.f12096g);
        this.f12121a.m26419f(this.f12097h);
        m26355B();
        this.f12103n = (AccessibilityManager) this.f12122b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC4792e
    /* renamed from: b */
    public boolean mo26326b(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC4792e
    /* renamed from: d */
    public boolean mo26324d() {
        return true;
    }
}
