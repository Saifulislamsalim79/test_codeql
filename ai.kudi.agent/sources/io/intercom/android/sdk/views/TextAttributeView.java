package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.views.holder.AttributeType;
import io.intercom.android.sdk.views.holder.ConversationListener;
import io.intercom.android.sdk.views.holder.SubmitAttributeClickListener;
import java.util.Locale;
/* loaded from: classes3.dex */
public class TextAttributeView extends BaseAttributeView {
    private static final int PHONE_INPUT_INSET_DP = 46;
    private static final String SAMPLE_NUMBER = " 123 456 7890";
    EditText attributeValueInput;
    final TextView flagView;
    final ProgressBar loadingView;
    ImageView submitButton;
    final ImageView verifiedTick;

    public TextAttributeView(Context context) {
        this(context, null);
    }

    private void displayVerifiedState() {
        this.attributeValueInput.setText(getAttribute().getValue());
        this.attributeValueInput.setEnabled(false);
        this.attributeValueInput.setKeyListener(null);
        this.submitButton.setVisibility(8);
        this.verifiedTick.setVisibility(0);
        this.loadingView.setVisibility(8);
        updateTextInputStrokeColor(C10110R.color.intercom_attribute_input_outline);
        hideErrorView();
    }

    private void setUpEmailAttribute() {
        this.attributeValueInput.setInputType(32);
        this.attributeValueInput.setHint("email@domain.com");
    }

    private void setUpFloatAttribute() {
        this.attributeValueInput.setInputType(12290);
    }

    private void setUpNumberAttribute() {
        this.attributeValueInput.setInputType(4098);
    }

    private void setUpPhoneAttribute(Locale locale) {
        this.attributeValueInput.setInputType(3);
        PhoneNumberValidator.loadCountryAreaCodes(getContext());
        CountryAreaCode countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(locale.getCountry());
        if (countryAreaCodeFromLocale.equals(CountryAreaCode.UNKNOWN)) {
            this.attributeValueInput.setHint("+1 123 456 7890");
        } else {
            String str = "+" + countryAreaCodeFromLocale.getDialCode();
            this.attributeValueInput.setHint(str + SAMPLE_NUMBER);
            this.attributeValueInput.setText(str);
        }
        updateFlag(countryAreaCodeFromLocale);
    }

    private void updateAttributeContent() {
        if (getAttribute().hasValue()) {
            displayVerifiedState();
        } else {
            displayEmptyState();
        }
    }

    private void updateFlag(CountryAreaCode countryAreaCode) {
        this.flagView.setVisibility(0);
        this.flagView.setText(countryAreaCode.getEmoji());
        this.attributeValueInput.setPadding(ScreenUtils.dpToPx(46.0f, getContext()), this.attributeValueInput.getPaddingTop(), this.attributeValueInput.getPaddingRight(), this.attributeValueInput.getPaddingBottom());
        this.attributeValueInput.addTextChangedListener(new TextWatcher() { // from class: io.intercom.android.sdk.views.TextAttributeView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextAttributeView.this.flagView.setText(PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(PhoneNumberValidator.normalizeNumber(editable.toString()))).getEmoji());
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    private void updateTextInputStrokeColor(int i) {
        Context context = this.attributeValueInput.getContext();
        ((GradientDrawable) this.attributeValueInput.getBackground()).setStroke(ScreenUtils.dpToPx(1.0f, context), C1335a.m36324d(context, i));
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public void displayEmptyState() {
        updateTextInputStrokeColor(C10110R.color.intercom_attribute_input_outline);
        this.attributeValueInput.setEnabled(true);
        this.submitButton.setImageResource(C10110R.C10111drawable.intercom_attribute_submit_arrow);
        this.submitButton.setVisibility(0);
        this.verifiedTick.setVisibility(8);
        hideErrorView();
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public void displayErrorState(String str) {
        updateTextInputStrokeColor(C10110R.color.intercom_attribute_collector_error);
        setError(str);
        this.submitButton.setImageResource(C10110R.C10111drawable.intercom_attribute_submit_arrow);
        this.loadingView.setVisibility(8);
    }

    public void displayLoadingState() {
        updateTextInputStrokeColor(C10110R.color.intercom_attribute_input_outline);
        this.loadingView.setVisibility(0);
        this.submitButton.setImageDrawable(null);
        hideErrorView();
    }

    public String getInputValue() {
        return this.attributeValueInput.getText().toString().trim();
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public int getLayoutRes() {
        return C10110R.C10113layout.intercom_view_text_attribute;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.attributeValueInput.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setOnSubmitClickListener(String str, ConversationListener conversationListener) {
        this.submitButton.setOnClickListener(new SubmitAttributeClickListener(this, str, conversationListener));
    }

    public void setUpAttribute(Attribute attribute, Locale locale) {
        setAttribute(attribute);
        this.attributeValueInput.setInputType(1);
        this.attributeValueInput.setHint((CharSequence) null);
        this.attributeValueInput.setText("");
        if ("email".equals(attribute.getRenderType())) {
            setUpEmailAttribute();
        } else if (AttributeType.PHONE.equals(attribute.getRenderType())) {
            setUpPhoneAttribute(locale);
        } else if (AttributeType.NUMBER.equals(attribute.getRenderType())) {
            setUpNumberAttribute();
        } else if (AttributeType.FLOAT.equals(attribute.getRenderType())) {
            setUpFloatAttribute();
        }
        updateAttributeContent();
    }

    public void updateSubmitButtonColor(AppConfig appConfig) {
        this.submitButton.getBackground().setColorFilter(appConfig.getPrimaryColor(), PorterDuff.Mode.SRC_IN);
        ColorUtils.setImageSrcColorWhiteOrDark(this.submitButton, appConfig.primaryColorRenderDarkText());
    }

    public TextAttributeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.flagView = (TextView) findViewById(C10110R.C10112id.flag_view);
        this.attributeValueInput = (EditText) findViewById(C10110R.C10112id.attribute_input);
        this.submitButton = (ImageView) findViewById(C10110R.C10112id.attribute_submit);
        this.verifiedTick = (ImageView) findViewById(C10110R.C10112id.attribute_verified_tick);
        this.loadingView = (ProgressBar) findViewById(C10110R.C10112id.loading_view);
    }
}
