package io.intercom.android.sdk.views.holder;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import com.google.android.flexbox.FlexboxLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.BlockType;
import io.intercom.android.sdk.blocks.models.Block;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Suggestion;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.views.ExpandableLayout;
import io.intercom.android.sdk.views.PartMetadataFormatter;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class PartViewHolder extends BlocksPartViewHolder {
    private static final long TIMESTAMP_UPDATE_PERIOD = TimeUnit.MINUTES.toMillis(1);
    private final Provider<AppConfig> appConfigProvider;
    private final TextView attribution;
    private ViewGroup blocks;
    final TextView metaData;
    private final MetricTracker metricTracker;
    private final PartMetadataFormatter partMetadataFormatter;
    private final C10486i requestManager;
    private final int viewType;

    public PartViewHolder(View view, int i, ConversationListener conversationListener, ClipboardManager clipboardManager, PartMetadataFormatter partMetadataFormatter, Provider<AppConfig> provider, C10486i c10486i, MetricTracker metricTracker) {
        super(view, conversationListener, clipboardManager);
        this.viewType = i;
        this.partMetadataFormatter = partMetadataFormatter;
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
        this.metricTracker = metricTracker;
        this.metaData = (TextView) view.findViewById(C10110R.C10112id.metadata);
        this.attribution = (TextView) view.findViewById(C10110R.C10112id.attribution);
    }

    private Drawable getBackgroundDrawable(Context context, int i, boolean z, int i2, Part part) {
        boolean hasPreviousConcatPart = hasPreviousConcatPart(part, i2);
        if (z) {
            return C1335a.m36322f(context, hasPreviousConcatPart ? getMiddleDrawable(i) : getTopDrawable(i));
        }
        return C1335a.m36322f(context, hasPreviousConcatPart ? getBottomDrawable(i) : C10110R.C10111drawable.intercom_bubble_background);
    }

    private int getBottomDrawable(int i) {
        return i == 0 ? C10110R.C10111drawable.intercom_bubble_background_user_bottom : C10110R.C10111drawable.intercom_bubble_background_admin_bottom;
    }

    private int getMiddleDrawable(int i) {
        return i == 0 ? C10110R.C10111drawable.intercom_bubble_background_user_middle : C10110R.C10111drawable.intercom_bubble_background_admin_middle;
    }

    private int getTopDrawable(int i) {
        return i == 0 ? C10110R.C10111drawable.intercom_bubble_background_user_top : C10110R.C10111drawable.intercom_bubble_background_admin_top;
    }

    private boolean hasPreviousConcatPart(Part part, int i) {
        if (i > 0) {
            return Part.shouldConcatenate(part, this.conversationListener.getPart(i - 1));
        }
        return false;
    }

    private boolean isSingleImagePart(Part part) {
        List<Block> blocks = part.getBlocks();
        if (blocks.size() != 1) {
            return false;
        }
        BlockType type = blocks.get(0).getType();
        return type == BlockType.LOCALIMAGE || type == BlockType.IMAGE;
    }

    private void setAdminEndMargin(Part part) {
        float dimension;
        Context context = this.cellLayout.getContext();
        if (isSingleCardPart(part)) {
            dimension = context.getResources().getDimension(C10110R.dimen.intercom_conversation_row_card_margin);
        } else {
            dimension = context.getResources().getDimension(C10110R.dimen.intercom_conversation_row_margin);
        }
        int i = (int) dimension;
        if (this.cellLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.cellLayout.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, i, marginLayoutParams.bottomMargin);
        }
    }

    private void setBubbleBackground(Part part, View view, int i, boolean z, int i2) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        if (!isSingleImagePart(part) && !isSingleCardPart(part)) {
            Context context = this.cellLayout.getContext();
            int dimension = (int) context.getResources().getDimension(C10110R.dimen.intercom_cell_horizontal_padding);
            this.cellLayout.setPadding(dimension, 0, dimension, 0);
            Drawable backgroundDrawable = getBackgroundDrawable(context, i, z, i2, part);
            if (!part.isAdmin() && i != 4) {
                backgroundDrawable.setColorFilter(this.appConfigProvider.get().getPrimaryColor(), PorterDuff.Mode.SRC_IN);
            }
            BackgroundUtils.setBackground(this.cellLayout, backgroundDrawable);
        } else {
            this.cellLayout.setBackgroundColor(0);
            this.cellLayout.setPadding(0, 0, 0, 0);
            paddingTop = 0;
            paddingBottom = 0;
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    private void setupAttribution(Part part) {
        if (this.attribution == null) {
            return;
        }
        if (shouldShowAttribution(part)) {
            CharSequence format = Phrase.from(this.metaData.getContext(), C10110R.string.intercom_gif_attribution).put("providername", part.getBlocks().get(0).getAttribution()).format();
            this.attribution.setVisibility(0);
            this.attribution.setText(format);
            return;
        }
        this.attribution.setVisibility(8);
    }

    private void setupHolderBackground(int i, Part part, boolean z, C10486i c10486i, int i2) {
        setBubbleBackground(part, this.blocks, i, z, i2);
        ImageView imageView = this.networkAvatar;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(4);
            } else if (i == 1 || i == 5 || i == 4) {
                showAvatar(part.getParticipant(), this.networkAvatar, this.appConfigProvider.get(), c10486i);
            }
        }
    }

    private boolean shouldConcatenate(Part part, int i) {
        int i2;
        if (i != -1 && (i2 = i + 1) < this.conversationListener.getCount()) {
            return Part.shouldConcatenate(part, this.conversationListener.getPart(i2));
        }
        return false;
    }

    private boolean shouldExpand(Part part) {
        return isSelectedPart(part) || isLastPart(part) || isNextPartTyping(getAdapterPosition());
    }

    private boolean shouldShowAttribution(Part part) {
        return isSingleImagePart(part) && !TextUtils.isEmpty(part.getBlocks().get(0).getAttribution()) && part.getMessageState().equals(Part.MessageState.NORMAL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addComposerSuggestions(final Part part, final TextView textView, final FlexboxLayout flexboxLayout) {
        if (isLastPart(part)) {
            flexboxLayout.setVisibility(0);
        } else {
            flexboxLayout.setVisibility(8);
            textView.setVisibility(8);
        }
        flexboxLayout.removeAllViews();
        Context context = flexboxLayout.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        List<Suggestion> suggestions = part.getComposerSuggestions().getSuggestions();
        for (int i = 0; i < suggestions.size(); i++) {
            final Suggestion suggestion = suggestions.get(i);
            TextView textView2 = (TextView) from.inflate(C10110R.C10113layout.intercom_quick_reply_button, (ViewGroup) null);
            textView2.setText(suggestion.getText());
            AppConfig appConfig = this.appConfigProvider.get();
            textView2.setTextColor(ColorUtils.primaryOrDarkColor(context, appConfig));
            BackgroundUtils.setRippleButtonStroke(context, textView2.getBackground(), C10110R.C10112id.background, appConfig.getPrimaryColor());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.views.holder.PartViewHolder.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    flexboxLayout.setVisibility(8);
                    textView.setVisibility(8);
                    PartViewHolder.this.conversationListener.onComposerSuggestionClicked(part, suggestion);
                }
            });
            flexboxLayout.addView(textView2);
            this.metricTracker.receivedComposerSuggestions(suggestion.getUuid(), this.conversationListener.getConversationId(), part.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addReplyOptions(final Part part, final FlexboxLayout flexboxLayout) {
        if (isLastPart(part)) {
            flexboxLayout.setVisibility(0);
        } else {
            flexboxLayout.setVisibility(8);
        }
        flexboxLayout.removeAllViews();
        Context context = flexboxLayout.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        List<ReplyOption> replyOptions = part.getReplyOptions();
        for (int i = 0; i < replyOptions.size(); i++) {
            final ReplyOption replyOption = replyOptions.get(i);
            TextView textView = (TextView) from.inflate(C10110R.C10113layout.intercom_quick_reply_button, (ViewGroup) null);
            textView.setText(replyOption.text());
            AppConfig appConfig = this.appConfigProvider.get();
            textView.setTextColor(ColorUtils.primaryOrDarkColor(context, appConfig));
            BackgroundUtils.setRippleButtonStroke(context, textView.getBackground(), C10110R.C10112id.background, appConfig.getPrimaryColor());
            textView.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.views.holder.PartViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    flexboxLayout.setVisibility(8);
                    PartViewHolder.this.conversationListener.onQuickReplyClicked(part.getParticipant(), part, replyOption);
                }
            });
            flexboxLayout.addView(textView);
            this.metricTracker.receivedQuickReply(replyOption.uuid(), this.conversationListener.getConversationId(), part.getId());
        }
    }

    public void bind(Part part, ViewGroup viewGroup) {
        int adapterPosition = getAdapterPosition();
        boolean shouldConcatenate = shouldConcatenate(part, adapterPosition);
        this.blocks = setUpHolderBlocks(part, this.cellLayout, this.bubble, viewGroup);
        setupHolderBackground(this.viewType, part, shouldConcatenate, this.requestManager, adapterPosition);
        if (part.isAdmin()) {
            setAdminEndMargin(part);
            updateAvatarMarginForCard(part);
        }
        setupMetaData(this.viewType, part);
        setupAttribution(part);
        checkForEntranceAnimation(this.viewType, part, this.networkAvatar, this.cellLayout, this.blocks);
        ExpandableLayout expandableLayout = this.bubble;
        if (expandableLayout != null) {
            expandableLayout.setExpanded(shouldExpand(part), false);
        }
        if (!isLastPart(part) || part.getReplyOptions().size() <= 0) {
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.itemView.getContext());
        LinearLayout linearLayout = (LinearLayout) this.itemView.getRootView();
        FlexboxLayout flexboxLayout = (FlexboxLayout) linearLayout.findViewById(C10110R.C10112id.intercom_reply_options);
        if (flexboxLayout == null) {
            flexboxLayout = (FlexboxLayout) from.inflate(C10110R.C10113layout.intercom_quick_reply_layout, (ViewGroup) null);
            flexboxLayout.setId(C10110R.C10112id.intercom_reply_options);
            linearLayout.addView(flexboxLayout);
        }
        addReplyOptions(part, flexboxLayout);
    }

    boolean isLastPart(Part part) {
        ConversationListener conversationListener = this.conversationListener;
        return part == conversationListener.getPart(conversationListener.getCount() - 1) && !Part.ADMIN_IS_TYPING_STYLE.equals(part.getMessageStyle());
    }

    boolean isNextPartTyping(int i) {
        int i2;
        return i != -1 && (i2 = i + 1) <= this.conversationListener.getCount() - 1 && Part.ADMIN_IS_TYPING_STYLE.equals(this.conversationListener.getPart(i2).getMessageStyle());
    }

    boolean isSelectedPart(Part part) {
        return part == this.conversationListener.getSelectedPart();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int adapterPosition = getAdapterPosition();
        if (adapterPosition != -1) {
            this.conversationListener.onPartClicked(adapterPosition, this);
        }
    }

    @Override // io.intercom.android.sdk.views.holder.BlocksPartViewHolder, android.view.View.OnLongClickListener
    public /* bridge */ /* synthetic */ boolean onLongClick(View view) {
        return super.onLongClick(view);
    }

    public void setExpanded(boolean z) {
        ExpandableLayout expandableLayout = this.bubble;
        if (expandableLayout != null) {
            expandableLayout.setExpanded(z, true);
        }
    }

    void setupMetaData(int i, final Part part) {
        if (this.metaData == null) {
            return;
        }
        if (i != 2 && i != 3) {
            ConversationListener conversationListener = this.conversationListener;
            boolean z = part == conversationListener.getPart(conversationListener.getCount() - 1);
            final Resources resources = this.metaData.getResources();
            this.metaData.setText(this.partMetadataFormatter.getMetadataString(part, z, resources));
            if (z) {
                this.metaData.postDelayed(new Runnable() { // from class: io.intercom.android.sdk.views.holder.PartViewHolder.3
                    @Override // java.lang.Runnable
                    public void run() {
                        PartViewHolder partViewHolder = PartViewHolder.this;
                        partViewHolder.metaData.setText(partViewHolder.partMetadataFormatter.getMetadataString(part, true, resources));
                        PartViewHolder.this.metaData.postDelayed(this, PartViewHolder.TIMESTAMP_UPDATE_PERIOD);
                    }
                }, TIMESTAMP_UPDATE_PERIOD);
            }
            if (Part.MessageState.UPLOAD_FAILED == part.getMessageState()) {
                this.metaData.setCompoundDrawablesWithIntrinsicBounds(C10110R.C10111drawable.intercom_message_error, 0, 0, 0);
                return;
            } else {
                this.metaData.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
        }
        this.metaData.setVisibility(4);
        TextView textView = this.metaData;
        textView.setHeight(ScreenUtils.dpToPx(10.0f, textView.getContext()));
    }
}
