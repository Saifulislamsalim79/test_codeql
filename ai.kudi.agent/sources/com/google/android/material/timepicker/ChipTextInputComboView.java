package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C4694p;
import com.google.android.material.textfield.TextInputLayout;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: c */
    private final Chip f12165c;

    /* renamed from: d */
    private final TextInputLayout f12166d;

    /* renamed from: e */
    private final EditText f12167e;

    /* renamed from: f */
    private TextWatcher f12168f;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    /* loaded from: classes2.dex */
    private class C4806b extends C4694p {
        private C4806b() {
        }

        @Override // com.google.android.material.internal.C4694p, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f12165c.setText(ChipTextInputComboView.this.m26255c("00"));
            } else {
                ChipTextInputComboView.this.f12165c.setText(ChipTextInputComboView.this.m26255c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public String m26255c(CharSequence charSequence) {
        return C4822b.m26215a(getResources(), charSequence);
    }

    /* renamed from: d */
    private void m26254d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f12167e.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f12165c.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m26254d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f12165c.setChecked(z);
        this.f12167e.setVisibility(z ? 0 : 4);
        this.f12165c.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            this.f12167e.requestFocus();
            if (TextUtils.isEmpty(this.f12167e.getText())) {
                return;
            }
            EditText editText = this.f12167e;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12165c.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f12165c.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f12165c.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        this.f12165c = (Chip) from.inflate(C9273h.material_time_chip, (ViewGroup) this, false);
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C9273h.material_time_input, (ViewGroup) this, false);
        this.f12166d = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f12167e = editText;
        editText.setVisibility(4);
        C4806b c4806b = new C4806b();
        this.f12168f = c4806b;
        this.f12167e.addTextChangedListener(c4806b);
        m26254d();
        addView(this.f12165c);
        addView(this.f12166d);
        TextView textView = (TextView) findViewById(C9271f.material_label);
        this.f12167e.setSaveEnabled(false);
    }
}
