package io.intercom.android.sdk.views.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.conversation.attribute.AttributeMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.views.AttributeCollectorCardView;
import io.intercom.android.sdk.views.BaseAttributeView;
import io.intercom.android.sdk.views.BooleanAttributeView;
import io.intercom.android.sdk.views.DateAttributeView;
import io.intercom.android.sdk.views.ListAttributeView;
import io.intercom.android.sdk.views.TextAttributeView;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.List;
import java.util.Locale;
import p201g.p227h.p238l.C7713h;
/* loaded from: classes3.dex */
public class AttributeCollectorViewHolder extends BlocksPartViewHolder implements ConversationPartViewHolder {
    private final Provider<AppConfig> appConfigProvider;
    private final ConversationListener conversationListener;
    private final View.OnFocusChangeListener inputFocusChangeListener;
    private final Locale locale;
    private final C10486i requestManager;

    public AttributeCollectorViewHolder(View view, Provider<AppConfig> provider, ConversationListener conversationListener, C10486i c10486i, Locale locale) {
        super(view, conversationListener);
        this.inputFocusChangeListener = new View.OnFocusChangeListener() { // from class: io.intercom.android.sdk.views.holder.AttributeCollectorViewHolder.1
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view2, boolean z) {
                if (z) {
                    AttributeCollectorViewHolder.this.expandAttributeCard();
                }
            }
        };
        this.conversationListener = conversationListener;
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
        this.locale = locale;
        applyCardBorderStyle(this.cellLayout);
        C7713h.m17728d((FrameLayout.LayoutParams) this.cellLayout.getLayoutParams(), this.cellLayout.getContext().getResources().getDimensionPixelSize(C10110R.dimen.intercom_attribute_part_left_margin));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void addAttributeView(ViewGroup viewGroup, Attribute attribute, AttributeMetadata attributeMetadata, String str) {
        char c;
        Context context = viewGroup.getContext();
        String renderType = attribute.getRenderType();
        switch (renderType.hashCode()) {
            case -1034364087:
                if (renderType.equals(AttributeType.NUMBER)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3076014:
                if (renderType.equals(AttributeType.DATE)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3322014:
                if (renderType.equals(AttributeType.LIST)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3556653:
                if (renderType.equals(AttributeType.TEXT)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 64711720:
                if (renderType.equals(AttributeType.BOOLEAN)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 75849770:
                if (renderType.equals(AttributeType.WEBSITE)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 96619420:
                if (renderType.equals("email")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 97526364:
                if (renderType.equals(AttributeType.FLOAT)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 106642798:
                if (renderType.equals(AttributeType.PHONE)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                TextAttributeView textAttributeView = new TextAttributeView(context);
                textAttributeView.setMetadata(attributeMetadata);
                textAttributeView.updateSubmitButtonColor(this.appConfigProvider.get());
                textAttributeView.setOnSubmitClickListener(str, this.conversationListener);
                textAttributeView.setUpAttribute(attribute, this.locale);
                textAttributeView.setOnFocusChangeListener(this.inputFocusChangeListener);
                viewGroup.addView(textAttributeView);
                return;
            case 6:
                BooleanAttributeView booleanAttributeView = new BooleanAttributeView(context);
                booleanAttributeView.setMetadata(attributeMetadata);
                booleanAttributeView.updateAttributeContent(attribute);
                booleanAttributeView.setOnSubmitClickListener(str, this.conversationListener);
                viewGroup.addView(booleanAttributeView);
                return;
            case 7:
                ListAttributeView listAttributeView = new ListAttributeView(context);
                listAttributeView.setMetadata(attributeMetadata);
                listAttributeView.updateAttributeContent(attribute);
                listAttributeView.setOnClickListener(str, this.conversationListener);
                viewGroup.addView(listAttributeView);
                return;
            case '\b':
                DateAttributeView dateAttributeView = new DateAttributeView(context);
                dateAttributeView.setMetadata(attributeMetadata);
                dateAttributeView.updateAttributeContent(attribute);
                dateAttributeView.setOnClickListener(str, this.conversationListener);
                viewGroup.addView(dateAttributeView);
                return;
            default:
                return;
        }
    }

    private void applyCardBorderStyle(View view) {
        ColorUtils.updateInnerBorderColor(this.appConfigProvider.get(), view);
    }

    @Override // io.intercom.android.sdk.views.holder.ConversationPartViewHolder
    public void bind(Part part, ViewGroup viewGroup) {
        if (this.networkAvatar != null) {
            showAvatar(part.getParticipant(), this.networkAvatar, this.appConfigProvider.get(), this.requestManager);
            updateAvatarMarginForCard(part);
        }
        renderAttributes(viewGroup, part.getForm().getAttributes(), part.getId());
        if (this.cellLayout.getChildCount() > 0) {
            this.cellLayout.removeAllViews();
        }
        if (viewGroup.getParent() != null) {
            ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
        }
        this.cellLayout.addView(viewGroup);
    }

    void expandAttributeCard() {
        ViewGroup viewGroup = this.cellLayout;
        if (viewGroup instanceof AttributeCollectorCardView) {
            ((AttributeCollectorCardView) viewGroup).animateToExpand();
            this.networkAvatar.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // io.intercom.android.sdk.views.holder.BlocksPartViewHolder, android.view.View.OnLongClickListener
    public /* bridge */ /* synthetic */ boolean onLongClick(View view) {
        return super.onLongClick(view);
    }

    void renderAttributes(ViewGroup viewGroup, List<Attribute> list, String str) {
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Attribute attribute = list.get(i);
            addAttributeView(viewGroup, attribute, new AttributeMetadata.Builder().withPosition(i).withTotalCount(size).build(), str);
            if (size > 1 && !attribute.hasValue()) {
                updateMultiAttributesLabel(viewGroup);
                return;
            }
        }
    }

    void updateMultiAttributesLabel(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof BaseAttributeView) {
                ((BaseAttributeView) childAt).showLabel(childCount);
            }
        }
    }
}
