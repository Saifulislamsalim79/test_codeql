package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p201g.p202a.p203k.p204a.C7462a;
import p272h.p286c.p287a.p323c.C9270e;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.p328m.C9278a;
/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes2.dex */
class C4766a extends AbstractC4792e {

    /* renamed from: d */
    private final TextWatcher f12072d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f12073e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC4762f f12074f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC4763g f12075g;

    /* renamed from: h */
    private AnimatorSet f12076h;

    /* renamed from: i */
    private ValueAnimator f12077i;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: classes2.dex */
    class C4767a implements TextWatcher {
        C4767a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C4766a.this.f12121a.getSuffixText() != null) {
                return;
            }
            C4766a.this.m26370i(C4766a.m26367l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: classes2.dex */
    class View$OnFocusChangeListenerC4768b implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC4768b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            C4766a.this.m26370i(((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z) ? false : false);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: classes2.dex */
    class C4769c implements TextInputLayout.InterfaceC4762f {
        C4769c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4762f
        /* renamed from: a */
        public void mo26272a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && C4766a.m26367l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C4766a.this.f12073e);
            editText.removeTextChangedListener(C4766a.this.f12072d);
            editText.addTextChangedListener(C4766a.this.f12072d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: classes2.dex */
    class C4770d implements TextInputLayout.InterfaceC4763g {

        /* compiled from: ClearTextEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: classes2.dex */
        class RunnableC4771a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ EditText f12082c;

            RunnableC4771a(EditText editText) {
                this.f12082c = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f12082c.removeTextChangedListener(C4766a.this.f12072d);
            }
        }

        C4770d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4763g
        /* renamed from: a */
        public void mo26271a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC4771a(editText));
            if (editText.getOnFocusChangeListener() == C4766a.this.f12073e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC4772e implements View.OnClickListener {
        View$OnClickListenerC4772e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C4766a.this.f12121a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C4766a.this.f12121a.m26434V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: classes2.dex */
    public class C4773f extends AnimatorListenerAdapter {
        C4773f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4766a.this.f12121a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: classes2.dex */
    public class C4774g extends AnimatorListenerAdapter {
        C4774g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4766a.this.f12121a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$h */
    /* loaded from: classes2.dex */
    public class C4775h implements ValueAnimator.AnimatorUpdateListener {
        C4775h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4766a.this.f12123c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$i */
    /* loaded from: classes2.dex */
    public class C4776i implements ValueAnimator.AnimatorUpdateListener {
        C4776i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4766a.this.f12123c.setScaleX(floatValue);
            C4766a.this.f12123c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4766a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f12072d = new C4767a();
        this.f12073e = new View$OnFocusChangeListenerC4768b();
        this.f12074f = new C4769c();
        this.f12075g = new C4770d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m26370i(boolean z) {
        boolean z2 = this.f12121a.m26445K() == z;
        if (z && !this.f12076h.isRunning()) {
            this.f12077i.cancel();
            this.f12076h.start();
            if (z2) {
                this.f12076h.end();
            }
        } else if (z) {
        } else {
            this.f12076h.cancel();
            this.f12077i.start();
            if (z2) {
                this.f12077i.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m26369j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C9278a.f21806a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C4775h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m26368k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C9278a.f21809d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C4776i());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m26367l(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: m */
    private void m26366m() {
        ValueAnimator m26368k = m26368k();
        ValueAnimator m26369j = m26369j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12076h = animatorSet;
        animatorSet.playTogether(m26368k, m26369j);
        this.f12076h.addListener(new C4773f());
        ValueAnimator m26369j2 = m26369j(1.0f, 0.0f);
        this.f12077i = m26369j2;
        m26369j2.addListener(new C4774g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC4792e
    /* renamed from: a */
    public void mo26277a() {
        this.f12121a.setEndIconDrawable(C7462a.m18690d(this.f12122b, C9270e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f12121a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C9275j.clear_text_end_icon_content_description));
        this.f12121a.setEndIconOnClickListener(new View$OnClickListenerC4772e());
        this.f12121a.m26421e(this.f12074f);
        this.f12121a.m26419f(this.f12075g);
        m26366m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC4792e
    /* renamed from: c */
    public void mo26325c(boolean z) {
        if (this.f12121a.getSuffixText() == null) {
            return;
        }
        m26370i(z);
    }
}
