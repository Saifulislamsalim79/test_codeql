package io.intercom.android.sdk.views.holder;

import android.content.ClipboardManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.views.PartMetadataFormatter;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes3.dex */
public class ComposerSuggestionsViewHolder extends PartViewHolder {
    public ComposerSuggestionsViewHolder(View view, int i, ConversationListener conversationListener, ClipboardManager clipboardManager, PartMetadataFormatter partMetadataFormatter, Provider<AppConfig> provider, C10486i c10486i, MetricTracker metricTracker) {
        super(view, i, conversationListener, clipboardManager, partMetadataFormatter, provider, c10486i, metricTracker);
    }

    @Override // io.intercom.android.sdk.views.holder.PartViewHolder, io.intercom.android.sdk.views.holder.ConversationPartViewHolder
    public void bind(Part part, ViewGroup viewGroup) {
        TextView textView = (TextView) this.itemView.findViewById(C10110R.C10112id.prompt_text);
        textView.setText(part.getComposerSuggestions().getPrompt());
        FlexboxLayout flexboxLayout = (FlexboxLayout) this.itemView.findViewById(C10110R.C10112id.quick_reply_layout);
        if (flexboxLayout == null) {
            return;
        }
        addComposerSuggestions(part, textView, flexboxLayout);
    }
}
