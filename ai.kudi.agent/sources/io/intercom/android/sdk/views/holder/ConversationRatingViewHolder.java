package io.intercom.android.sdk.views.holder;

import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Part;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes3.dex */
public class ConversationRatingViewHolder extends BlocksPartViewHolder {
    private final Provider<AppConfig> appConfigProvider;
    private final C10486i requestManager;

    public ConversationRatingViewHolder(View view, ConversationListener conversationListener, Provider<AppConfig> provider, C10486i c10486i) {
        super(view, conversationListener, null);
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
    }

    @Override // io.intercom.android.sdk.views.holder.ConversationPartViewHolder
    public void bind(Part part, ViewGroup viewGroup) {
        setUpHolderBlocks(part, this.cellLayout, this.bubble, viewGroup);
        if (this.networkAvatar != null) {
            showAvatar(part.getParticipant(), this.networkAvatar, this.appConfigProvider.get(), this.requestManager);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // io.intercom.android.sdk.views.holder.BlocksPartViewHolder, android.view.View.OnLongClickListener
    public /* bridge */ /* synthetic */ boolean onLongClick(View view) {
        return super.onLongClick(view);
    }
}
