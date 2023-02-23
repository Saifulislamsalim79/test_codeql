package io.intercom.android.sdk.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.views.holder.ConversationListener;
/* loaded from: classes3.dex */
public class BooleanAttributeView extends BaseAttributeView {

    /* renamed from: no */
    final TextView f23918no;
    final TextView yes;

    public BooleanAttributeView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSelectedState(boolean z) {
        ColorStateList m36323e = C1335a.m36323e(getContext(), C10110R.color.intercom_boolean_attribute_selected_text_selector);
        ColorStateList m36323e2 = C1335a.m36323e(getContext(), C10110R.color.intercom_boolean_attribute_nonselected_text_selector);
        int m36324d = C1335a.m36324d(getContext(), C10110R.color.intercom_attribute_selected_background);
        int m36324d2 = C1335a.m36324d(getContext(), C10110R.color.intercom_white);
        int m36324d3 = C1335a.m36324d(getContext(), C10110R.color.intercom_attribute_input_outline);
        this.yes.setTextColor(z ? m36323e : m36323e2);
        TextView textView = this.f23918no;
        if (z) {
            m36323e = m36323e2;
        }
        textView.setTextColor(m36323e);
        this.yes.setAlpha(z ? 1.0f : 0.5f);
        this.f23918no.setAlpha(z ? 0.5f : 1.0f);
        BackgroundUtils.setRippleButtonBackgroundColor(this.yes.getBackground(), C10110R.C10112id.background, z ? m36324d : m36324d2);
        Drawable background = this.f23918no.getBackground();
        int i = C10110R.C10112id.background;
        if (z) {
            m36324d = m36324d2;
        }
        BackgroundUtils.setRippleButtonBackgroundColor(background, i, m36324d);
        BackgroundUtils.setRippleButtonStroke(getContext(), this.yes.getBackground(), C10110R.C10112id.background, m36324d3);
        BackgroundUtils.setRippleButtonStroke(getContext(), this.f23918no.getBackground(), C10110R.C10112id.background, m36324d3);
        this.yes.setEnabled(false);
        this.f23918no.setEnabled(false);
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public void displayEmptyState() {
        ColorStateList m36323e = C1335a.m36323e(getContext(), C10110R.color.intercom_boolean_attribute_selected_text_selector);
        this.yes.setTextColor(m36323e);
        this.f23918no.setTextColor(m36323e);
        int m36324d = C1335a.m36324d(getContext(), C10110R.color.intercom_white);
        int m36324d2 = C1335a.m36324d(getContext(), C10110R.color.intercom_attribute_input_outline);
        BackgroundUtils.setRippleButtonBackgroundColor(this.yes.getBackground(), C10110R.C10112id.background, m36324d);
        BackgroundUtils.setRippleButtonBackgroundColor(this.f23918no.getBackground(), C10110R.C10112id.background, m36324d);
        BackgroundUtils.setRippleButtonStroke(getContext(), this.yes.getBackground(), C10110R.C10112id.background, m36324d2);
        BackgroundUtils.setRippleButtonStroke(getContext(), this.f23918no.getBackground(), C10110R.C10112id.background, m36324d2);
        this.yes.setAlpha(1.0f);
        this.f23918no.setAlpha(1.0f);
        this.yes.setEnabled(true);
        this.f23918no.setEnabled(true);
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public void displayErrorState(String str) {
        setError(str);
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public int getLayoutRes() {
        return C10110R.C10113layout.intercom_view_boolean_attribute;
    }

    public void setOnSubmitClickListener(final String str, final ConversationListener conversationListener) {
        this.yes.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.views.BooleanAttributeView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BooleanAttributeView.this.showSelectedState(true);
                Attribute attribute = BooleanAttributeView.this.getAttribute();
                conversationListener.onSubmitAttribute(str, attribute.getIdentifier(), Boolean.TRUE, attribute.getType());
            }
        });
        this.f23918no.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.views.BooleanAttributeView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BooleanAttributeView.this.showSelectedState(false);
                Attribute attribute = BooleanAttributeView.this.getAttribute();
                conversationListener.onSubmitAttribute(str, attribute.getIdentifier(), Boolean.FALSE, attribute.getType());
            }
        });
    }

    public void updateAttributeContent(Attribute attribute) {
        setAttribute(attribute);
        if (attribute.hasValue()) {
            showSelectedState(attribute.getValue().equals(Boolean.TRUE.toString()));
        } else {
            displayEmptyState();
        }
    }

    public BooleanAttributeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.yes = (TextView) findViewById(C10110R.C10112id.yes);
        this.f23918no = (TextView) findViewById(C10110R.C10112id.f23879no);
    }
}
