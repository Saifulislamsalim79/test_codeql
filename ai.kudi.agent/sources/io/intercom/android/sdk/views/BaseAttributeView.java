package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.conversation.attribute.AttributeMetadata;
import io.intercom.android.sdk.models.Attribute;
/* loaded from: classes3.dex */
public abstract class BaseAttributeView extends LinearLayout {
    private Attribute attribute;
    protected final TextView attributeErrorView;
    protected final TextView attributeNameView;
    public final TextView attributePositionLabel;
    private AttributeMetadata metadata;

    public BaseAttributeView(Context context) {
        this(context, null);
    }

    public abstract void displayEmptyState();

    public abstract void displayErrorState(String str);

    public Attribute getAttribute() {
        return this.attribute;
    }

    public abstract int getLayoutRes();

    public AttributeMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void hideErrorView() {
        this.attributeErrorView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
        String name = attribute.getName();
        int position = this.metadata.getPosition() + 1;
        if (this.metadata.getTotalCount() > 1) {
            TextView textView = this.attributeNameView;
            textView.setText(position + ". " + name);
            return;
        }
        this.attributeNameView.setText(name);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setError(String str) {
        this.attributeErrorView.setText(str);
        this.attributeErrorView.setVisibility(0);
    }

    public void setMetadata(AttributeMetadata attributeMetadata) {
        this.metadata = attributeMetadata;
    }

    public void showLabel(int i) {
        this.attributePositionLabel.setVisibility(0);
        TextView textView = this.attributePositionLabel;
        textView.setText("(" + i + " / " + this.metadata.getTotalCount() + ")");
    }

    public BaseAttributeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.attribute = Attribute.NULL;
        this.metadata = AttributeMetadata.SINGLE_ATTRIBUTE_METADATA;
        LinearLayout.inflate(getContext(), getLayoutRes(), this);
        this.attributeNameView = (TextView) findViewById(C10110R.C10112id.attribute_name);
        this.attributeErrorView = (TextView) findViewById(C10110R.C10112id.error_text);
        this.attributePositionLabel = (TextView) findViewById(C10110R.C10112id.multi_attribute_label);
    }
}
