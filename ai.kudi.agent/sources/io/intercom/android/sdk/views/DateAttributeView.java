package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.conversation.attribute.AttributeInputListener;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.views.holder.ConversationListener;
/* loaded from: classes3.dex */
public class DateAttributeView extends BaseAttributeView implements AttributeInputListener {
    TextView attributeLabel;

    public DateAttributeView(Context context) {
        this(context, null);
    }

    private long convertTimestampToLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public void displayEmptyState() {
        this.attributeLabel.setText("");
        this.attributeLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, C10110R.C10111drawable.intercom_attribute_date, 0);
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public void displayErrorState(String str) {
        setError(str);
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public int getLayoutRes() {
        return C10110R.C10113layout.intercom_view_list_attribute;
    }

    @Override // io.intercom.android.sdk.conversation.attribute.AttributeInputListener
    public void populateSelectedValue(String str) {
        this.attributeLabel.setText(str);
    }

    public void setOnClickListener(final String str, final ConversationListener conversationListener) {
        if (getAttribute().getValue().isEmpty()) {
            this.attributeLabel.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.views.DateAttributeView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Attribute attribute = DateAttributeView.this.getAttribute();
                    conversationListener.onDateAttributeClicked(str, attribute.getIdentifier(), attribute.getType(), DateAttributeView.this);
                }
            });
        }
    }

    public void updateAttributeContent(Attribute attribute) {
        setAttribute(attribute);
        this.attributeLabel.setHint(C10110R.string.intercom_choose_the_date);
        if (attribute.hasValue()) {
            long convertTimestampToLong = convertTimestampToLong(attribute.getValue());
            if (convertTimestampToLong > 0) {
                this.attributeLabel.setText(TimeFormatter.formatTimeInMillisAsDate(convertTimestampToLong * 1000));
            } else {
                this.attributeLabel.setText(attribute.getValue());
            }
            this.attributeLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, C10110R.C10111drawable.intercom_attribute_verified_tick, 0);
            return;
        }
        displayEmptyState();
    }

    public DateAttributeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.attributeLabel = (TextView) findViewById(C10110R.C10112id.attribute_input);
    }
}
