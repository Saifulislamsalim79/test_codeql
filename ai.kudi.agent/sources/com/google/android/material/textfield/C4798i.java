package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C4694p;
import com.google.android.material.textfield.TextInputLayout;
import p201g.p202a.p203k.p204a.C7462a;
import p272h.p286c.p287a.p323c.C9270e;
import p272h.p286c.p287a.p323c.C9275j;
/* compiled from: PasswordToggleEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.i */
/* loaded from: classes2.dex */
class C4798i extends AbstractC4792e {

    /* renamed from: d */
    private final TextWatcher f12154d;

    /* renamed from: e */
    private final TextInputLayout.InterfaceC4762f f12155e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC4763g f12156f;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.i$a */
    /* loaded from: classes2.dex */
    class C4799a extends C4694p {
        C4799a() {
        }

        @Override // com.google.android.material.internal.C4694p, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C4798i c4798i = C4798i.this;
            c4798i.f12123c.setChecked(!c4798i.m26274g());
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.i$b */
    /* loaded from: classes2.dex */
    class C4800b implements TextInputLayout.InterfaceC4762f {
        C4800b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4762f
        /* renamed from: a */
        public void mo26272a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C4798i c4798i = C4798i.this;
            c4798i.f12123c.setChecked(!c4798i.m26274g());
            editText.removeTextChangedListener(C4798i.this.f12154d);
            editText.addTextChangedListener(C4798i.this.f12154d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.i$c */
    /* loaded from: classes2.dex */
    class C4801c implements TextInputLayout.InterfaceC4763g {

        /* compiled from: PasswordToggleEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.i$c$a */
        /* loaded from: classes2.dex */
        class RunnableC4802a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ EditText f12160c;

            RunnableC4802a(EditText editText) {
                this.f12160c = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f12160c.removeTextChangedListener(C4798i.this.f12154d);
            }
        }

        C4801c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4763g
        /* renamed from: a */
        public void mo26271a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new RunnableC4802a(editText));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.i$d */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC4803d implements View.OnClickListener {
        View$OnClickListenerC4803d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = C4798i.this.f12121a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (C4798i.this.m26274g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            C4798i.this.f12121a.m26434V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4798i(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f12154d = new C4799a();
        this.f12155e = new C4800b();
        this.f12156f = new C4801c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m26274g() {
        EditText editText = this.f12121a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m26273h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC4792e
    /* renamed from: a */
    public void mo26277a() {
        this.f12121a.setEndIconDrawable(C7462a.m18690d(this.f12122b, C9270e.design_password_eye));
        TextInputLayout textInputLayout = this.f12121a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C9275j.password_toggle_content_description));
        this.f12121a.setEndIconOnClickListener(new View$OnClickListenerC4803d());
        this.f12121a.m26421e(this.f12155e);
        this.f12121a.m26419f(this.f12156f);
        EditText editText = this.f12121a.getEditText();
        if (m26273h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
