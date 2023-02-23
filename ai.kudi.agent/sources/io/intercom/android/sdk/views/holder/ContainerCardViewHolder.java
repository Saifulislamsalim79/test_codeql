package io.intercom.android.sdk.views.holder;

import android.content.ClipboardManager;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.Phrase;
import io.intercom.android.sdk.views.LockableScrollView;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes3.dex */
public class ContainerCardViewHolder extends BlocksPartViewHolder {
    private Provider<AppConfig> appConfigProvider;
    ImageView arrowExpander;
    private final View fade;
    final LockableScrollView lockableScrollView;
    private final C10486i requestManager;
    private final TextView title;
    private final int viewType;

    public ContainerCardViewHolder(View view, int i, ConversationListener conversationListener, ClipboardManager clipboardManager, boolean z, Provider<AppConfig> provider, C10486i c10486i) {
        super(view, conversationListener, clipboardManager);
        this.viewType = i;
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
        this.title = (TextView) view.findViewById(C10110R.C10112id.intercom_container_card_title);
        this.fade = view.findViewById(C10110R.C10112id.intercom_container_fade_view);
        LockableScrollView lockableScrollView = (LockableScrollView) view.findViewById(C10110R.C10112id.cell_content);
        this.lockableScrollView = lockableScrollView;
        lockableScrollView.setScrollingEnabled(false);
        if (i == 3) {
            if (z) {
                this.arrowExpander = (ImageView) view.findViewById(C10110R.C10112id.expand_arrow);
            }
            this.lockableScrollView.setExpanded(!z);
        } else {
            this.lockableScrollView.setExpanded(false);
        }
        final View findViewById = view.findViewById(C10110R.C10112id.cellLayout);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: io.intercom.android.sdk.views.holder.ContainerCardViewHolder.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                ContainerCardViewHolder.this.setupViews();
                return false;
            }
        });
    }

    private boolean contentIsOverflowing() {
        return this.lockableScrollView.getChildAt(0).getMeasuredHeight() > this.lockableScrollView.getMaxHeight();
    }

    private void layoutForCollapsedNoteWithArrow() {
        ImageView imageView = this.arrowExpander;
        if (imageView != null) {
            imageView.setVisibility(contentIsOverflowing() ? 0 : 8);
            this.arrowExpander.setScaleY(1.0f);
        }
        this.fade.setVisibility(contentIsOverflowing() ? 0 : 4);
    }

    private void layoutForExpandedNoteWithArrow() {
        ImageView imageView = this.arrowExpander;
        if (imageView != null) {
            imageView.setVisibility(contentIsOverflowing() ? 0 : 8);
            this.arrowExpander.setScaleY(-1.0f);
        }
        this.fade.setVisibility(4);
    }

    private void layoutForExpandedNoteWithoutArrow() {
        ImageView imageView = this.arrowExpander;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.fade.setVisibility(4);
    }

    private void layoutForPost() {
        ImageView imageView = this.arrowExpander;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.fade.setVisibility(contentIsOverflowing() ? 0 : 4);
    }

    private void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.lockableScrollView.post(runnable);
        }
    }

    @Override // io.intercom.android.sdk.views.holder.ConversationPartViewHolder
    public void bind(Part part, ViewGroup viewGroup) {
        ViewGroup upHolderBlocks = setUpHolderBlocks(part, this.cellLayout, this.bubble, viewGroup);
        showAvatar(part.getParticipant(), this.networkAvatar, this.appConfigProvider.get(), this.requestManager);
        this.title.setText(Phrase.from(this.title.getContext(), C10110R.string.intercom_teammate_from_company).put("name", part.getParticipant().getForename()).put("company", this.appConfigProvider.get().getName()).format());
        checkForEntranceAnimation(this.viewType, part, this.networkAvatar, this.cellLayout, upHolderBlocks);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int adapterPosition = getAdapterPosition();
        if (adapterPosition != -1) {
            this.conversationListener.onContainerCardClicked(adapterPosition, this);
        }
    }

    @Override // io.intercom.android.sdk.views.holder.BlocksPartViewHolder, android.view.View.OnLongClickListener
    public /* bridge */ /* synthetic */ boolean onLongClick(View view) {
        return super.onLongClick(view);
    }

    void setupViews() {
        if (this.viewType == 2) {
            layoutForPost();
        } else if (this.arrowExpander == null) {
            layoutForExpandedNoteWithoutArrow();
        } else if (this.lockableScrollView.isExpanded()) {
            layoutForExpandedNoteWithArrow();
        } else {
            layoutForCollapsedNoteWithArrow();
        }
    }

    public void toggleExpanded() {
        runOnMainThread(new Runnable() { // from class: io.intercom.android.sdk.views.holder.ContainerCardViewHolder.2
            @Override // java.lang.Runnable
            public void run() {
                ImageView imageView = ContainerCardViewHolder.this.arrowExpander;
                if (imageView == null || imageView.getVisibility() != 0) {
                    return;
                }
                ContainerCardViewHolder.this.lockableScrollView.toggleExpanded();
                ContainerCardViewHolder.this.setupViews();
            }
        });
    }
}
