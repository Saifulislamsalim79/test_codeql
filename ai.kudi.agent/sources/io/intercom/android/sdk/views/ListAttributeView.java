package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.conversation.attribute.AttributeInputListener;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.views.holder.ConversationListener;
/* loaded from: classes3.dex */
public class ListAttributeView extends BaseAttributeView implements AttributeInputListener {
    TextView attributeLabel;

    public ListAttributeView(Context context) {
        this(context, null);
    }

    @Override // io.intercom.android.sdk.views.BaseAttributeView
    public void displayEmptyState() {
        this.attributeLabel.setText("");
        this.attributeLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, C10110R.C10111drawable.intercom_list_arrow_down, 0);
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
            this.attributeLabel.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.views.ListAttributeView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    conversationListener.onListAttributeClicked(str, ListAttributeView.this.getAttribute(), ListAttributeView.this);
                }
            });
        }
    }

    public void updateAttributeContent(Attribute attribute) {
        setAttribute(attribute);
        if (attribute.hasValue()) {
            this.attributeLabel.setText(attribute.getValue());
            this.attributeLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, C10110R.C10111drawable.intercom_attribute_verified_tick, 0);
            return;
        }
        displayEmptyState();
    }

    public ListAttributeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.attributeLabel = (TextView) findViewById(C10110R.C10112id.attribute_input);
    }
}
