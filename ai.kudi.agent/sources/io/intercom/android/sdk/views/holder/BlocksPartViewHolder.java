package io.intercom.android.sdk.views.holder;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.blocks.BlockType;
import io.intercom.android.sdk.blocks.models.Block;
import io.intercom.android.sdk.commons.utilities.HtmlCompat;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.twig.Twig;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.android.sdk.views.AdminIsTypingView;
import io.intercom.android.sdk.views.ExpandableLayout;
import io.intercom.com.bumptech.glide.C10486i;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class BlocksPartViewHolder extends RecyclerView.AbstractC1620e0 implements View.OnClickListener, View.OnLongClickListener, ConversationPartViewHolder {
    final ExpandableLayout bubble;
    protected final ViewGroup cellLayout;
    private final ClipboardManager clipboardManager;
    private final String clipboardMessage;
    final ConversationListener conversationListener;
    final ImageView networkAvatar;
    private final Twig twig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.views.holder.BlocksPartViewHolder$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104701 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$blocks$BlockType;

        static {
            int[] iArr = new int[BlockType.values().length];
            $SwitchMap$io$intercom$android$blocks$BlockType = iArr;
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$blocks$BlockType[BlockType.HEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$blocks$BlockType[BlockType.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$blocks$BlockType[BlockType.PARAGRAPH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$blocks$BlockType[BlockType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$blocks$BlockType[BlockType.UNORDEREDLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$intercom$android$blocks$BlockType[BlockType.ORDEREDLIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BlocksPartViewHolder(View view, ConversationListener conversationListener) {
        this(view, conversationListener, null);
    }

    private static void appendLine(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(charSequence);
    }

    static String getPartText(Part part) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (Block block : part.getBlocks()) {
            switch (C104701.$SwitchMap$io$intercom$android$blocks$BlockType[block.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    appendLine(spannableStringBuilder, HtmlCompat.fromHtml(block.getText()));
                    break;
                case 5:
                    appendLine(spannableStringBuilder, block.getUrl());
                    break;
                case 6:
                case 7:
                    for (String str : block.getItems()) {
                        appendLine(spannableStringBuilder, str);
                    }
                    break;
            }
        }
        return spannableStringBuilder.length() == 0 ? part.getSummary() : spannableStringBuilder.toString();
    }

    private void setUpRowFocusRules(View view, Part part, ExpandableLayout expandableLayout) {
        if (expandableLayout == null) {
            return;
        }
        expandableLayout.setAlpha(1.0f);
        if (Part.MessageState.FAILED == part.getMessageState() || Part.MessageState.UPLOAD_FAILED == part.getMessageState()) {
            ((ViewGroup) view).setDescendantFocusability(393216);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void checkForEntranceAnimation(int i, Part part, ImageView imageView, View view, ViewGroup viewGroup) {
        if (part.hasEntranceAnimation()) {
            if (i == 5) {
                part.setEntranceAnimation(false);
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setStartDelay(100L).start();
                view.setAlpha(0.0f);
                view.setScaleX(0.5f);
                view.setScaleY(0.5f);
                view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setStartDelay(150L).start();
                ((AdminIsTypingView) viewGroup.getChildAt(0)).beginAnimation();
            } else if (Part.MessageState.SENDING == part.getMessageState()) {
                part.setEntranceAnimation(false);
                view.setAlpha(0.0f);
                view.setTranslationY(view.getTranslationY() + 100.0f);
                view.animate().setStartDelay(100L).alpha(1.0f).translationYBy(-100.0f).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isSingleCardPart(Part part) {
        List<Block> blocks = part.getBlocks();
        if (blocks.size() != 1) {
            return false;
        }
        Block block = blocks.get(0);
        return block.getType() == BlockType.MESSENGERCARD && !TextUtils.isEmpty(block.getFallbackUrl());
    }

    public boolean onLongClick(View view) {
        int adapterPosition;
        if (this.clipboardManager == null || (adapterPosition = getAdapterPosition()) == -1) {
            return false;
        }
        try {
            this.clipboardManager.setPrimaryClip(ClipData.newPlainText(MetricTracker.Object.MESSAGE, getPartText(this.conversationListener.getPart(adapterPosition))));
            Toast.makeText(this.itemView.getContext(), this.clipboardMessage, 0).show();
            return true;
        } catch (Exception e) {
            this.twig.internal(e.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewGroup setUpHolderBlocks(Part part, ViewGroup viewGroup, ExpandableLayout expandableLayout, ViewGroup viewGroup2) {
        viewGroup.setVisibility(0);
        if (viewGroup2.getParent() != null) {
            ((ViewGroup) viewGroup2.getParent()).removeView(viewGroup2);
        }
        if (viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        viewGroup.addView(viewGroup2, 0);
        setUpRowFocusRules(this.itemView, part, expandableLayout);
        return viewGroup2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showAvatar(Participant participant, ImageView imageView, AppConfig appConfig, C10486i c10486i) {
        imageView.setVisibility(0);
        AvatarUtils.loadAvatarIntoView(participant.getAvatar(), imageView, appConfig, c10486i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateAvatarMarginForCard(Part part) {
        Resources resources = this.networkAvatar.getContext().getResources();
        boolean z = part.isLinkCard() || part.isLinkList() || isSingleCardPart(part);
        int dimension = z ? (int) resources.getDimension(C10110R.dimen.intercom_card_shadow_bottom_margin) : 0;
        int dimension2 = z ? 0 : (int) resources.getDimension(C10110R.dimen.intercom_conversation_row_icon_spacer);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.networkAvatar.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, dimension2, dimension);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BlocksPartViewHolder(View view, ConversationListener conversationListener, ClipboardManager clipboardManager) {
        super(view);
        this.twig = LumberMill.getLogger();
        this.conversationListener = conversationListener;
        this.clipboardManager = clipboardManager;
        this.clipboardMessage = view.getContext().getString(C10110R.string.intercom_copied_to_clipboard);
        this.networkAvatar = (ImageView) view.findViewById(C10110R.C10112id.avatarView);
        this.cellLayout = (ViewGroup) view.findViewById(C10110R.C10112id.cellLayout);
        this.bubble = (ExpandableLayout) view.findViewById(C10110R.C10112id.intercom_bubble);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }
}
