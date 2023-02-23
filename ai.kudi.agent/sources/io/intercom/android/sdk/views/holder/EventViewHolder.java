package io.intercom.android.sdk.views.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.EventData;
import io.intercom.android.sdk.models.EventParticipant;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.AvatarUtils;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes3.dex */
public class EventViewHolder extends RecyclerView.AbstractC1620e0 implements ConversationPartViewHolder {
    private final Provider<AppConfig> appConfigProvider;
    private final ImageView avatar;
    private final TextView eventTitle;
    private final C10486i requestManager;

    public EventViewHolder(View view, Provider<AppConfig> provider, C10486i c10486i) {
        super(view);
        this.appConfigProvider = provider;
        this.requestManager = c10486i;
        this.eventTitle = (TextView) view.findViewById(C10110R.C10112id.event_name);
        this.avatar = (ImageView) view.findViewById(C10110R.C10112id.avatar);
    }

    @Override // io.intercom.android.sdk.views.holder.ConversationPartViewHolder
    public void bind(Part part, ViewGroup viewGroup) {
        EventData eventData = part.getEventData();
        EventParticipant participant = eventData.getParticipant();
        this.eventTitle.setText(eventData.getEventAsPlainText());
        AvatarUtils.loadAvatarIntoView(Avatar.create(participant.getAvatar().getImageUrl(), participant.getInitial()), this.avatar, this.appConfigProvider.get(), this.requestManager);
    }
}
