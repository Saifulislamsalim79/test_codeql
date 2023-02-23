package io.intercom.android.sdk.views.holder;

import android.content.ClipboardManager;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes3.dex */
public class LinkViewHolder extends BlocksPartViewHolder {
    private final Provider<AppConfig> appConfigProvider;
    private final C10486i requestManager;
    private final int viewType;

    public LinkViewHolder(View view, int i, ConversationListener conversationListener, ClipboardManager clipboardManager, Provider<AppConfig> provider, C10486i c10486i) {
        super(view, conversationListener, clipboardManager);
        this.viewType = i;
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
        if (Build.VERSION.SDK_INT >= 21) {
            this.cellLayout.setTransitionName("link_background");
        }
    }

    @Override // io.intercom.android.sdk.views.holder.ConversationPartViewHolder
    public void bind(Part part, ViewGroup viewGroup) {
        ColorUtils.updateInnerBorderColor(this.appConfigProvider.get(), this.cellLayout);
        ViewGroup upHolderBlocks = setUpHolderBlocks(part, this.cellLayout, this.bubble, viewGroup);
        int dpToPx = ScreenUtils.dpToPx(16.0f, this.itemView.getContext());
        int dpToPx2 = ScreenUtils.dpToPx(24.0f, this.itemView.getContext());
        upHolderBlocks.setPadding(dpToPx, dpToPx2, dpToPx, dpToPx2);
        checkForEntranceAnimation(this.viewType, part, this.networkAvatar, this.cellLayout, upHolderBlocks);
        if (this.networkAvatar != null) {
            showAvatar(part.getParticipant(), this.networkAvatar, this.appConfigProvider.get(), this.requestManager);
            updateAvatarMarginForCard(part);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int adapterPosition = getAdapterPosition();
        if (adapterPosition != -1) {
            this.conversationListener.onLinkClicked(adapterPosition, this.cellLayout);
        }
    }

    @Override // io.intercom.android.sdk.views.holder.BlocksPartViewHolder, android.view.View.OnLongClickListener
    public /* bridge */ /* synthetic */ boolean onLongClick(View view) {
        return super.onLongClick(view);
    }
}
