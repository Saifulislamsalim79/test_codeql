package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.com.bumptech.glide.C10486i;
/* loaded from: classes3.dex */
public class InboxRowLayout extends RelativeLayout {
    private final AuthorAvatarView authorAvatar;
    private final TextView authorName;
    private final FrameLayout frameLayout;
    private final TextView summary;
    private final TextView timeStamp;
    private final ImageView unreadDot;

    public InboxRowLayout(Context context) {
        this(context, null);
    }

    private void setRowParticipantDetails(Conversation conversation, String str, C10486i c10486i, TeamPresence teamPresence, AppConfig appConfig) {
        LastParticipatingAdmin lastParticipatingAdmin = conversation.getLastParticipatingAdmin();
        if (!TextUtils.isEmpty(lastParticipatingAdmin.getFirstName())) {
            this.authorAvatar.loadAvatarWithActiveState(lastParticipatingAdmin.getAvatar(), lastParticipatingAdmin.isActive(), appConfig, c10486i);
            this.authorName.setText(GroupConversationTextFormatter.groupConversationTitle(lastParticipatingAdmin.getFirstName(), conversation.getGroupConversationParticipants().size(), this.authorName.getContext()));
        } else if (teamPresence.isEmpty()) {
            this.authorAvatar.loadAvatar(lastParticipatingAdmin.getAvatar(), appConfig, c10486i);
            this.authorName.setText(str);
        } else {
            this.authorAvatar.loadAvatars(teamPresence.getActiveAdmins(), appConfig, c10486i);
            this.authorName.setText(str);
        }
    }

    public void updateConversation(Conversation conversation, UserIdentity userIdentity, AppConfig appConfig, TeamPresence teamPresence, C10486i c10486i, TimeFormatter timeFormatter) {
        Part lastNonEventPart = conversation.getLastNonEventPart();
        Part lastPart = conversation.getLastPart();
        Context context = getContext();
        if (lastNonEventPart.getParticipant().isUserWithId(userIdentity.getIntercomId())) {
            TextView textView = this.summary;
            textView.setText(context.getString(C10110R.string.intercom_you) + ": " + lastNonEventPart.getSummary());
        } else {
            this.summary.setText(lastNonEventPart.getSummary());
        }
        this.timeStamp.setText(timeFormatter.getFormattedTime(lastPart.getCreatedAt()));
        setRowParticipantDetails(conversation, appConfig.getName(), c10486i, teamPresence, appConfig);
        if (!conversation.isRead()) {
            this.authorName.setTypeface(Typeface.SANS_SERIF, 1);
            this.summary.setTypeface(Typeface.SANS_SERIF, 1);
            this.authorName.setTextColor(C1335a.m36324d(context, C10110R.color.intercom_black));
            this.unreadDot.setVisibility(0);
            return;
        }
        this.authorName.setTypeface(Typeface.SANS_SERIF, 0);
        this.summary.setTypeface(Typeface.SANS_SERIF, 0);
        this.authorName.setTextColor(C1335a.m36324d(context, C10110R.color.intercom_text_grey));
        this.unreadDot.setVisibility(8);
    }

    public void updateVerticalPadding(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        FrameLayout frameLayout = this.frameLayout;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), dimensionPixelSize, this.frameLayout.getPaddingRight(), dimensionPixelSize);
    }

    public InboxRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RelativeLayout.inflate(getContext(), C10110R.C10113layout.intercom_row_inbox, this);
        this.authorAvatar = (AuthorAvatarView) findViewById(C10110R.C10112id.intercom_author_avatar);
        this.authorName = (TextView) findViewById(C10110R.C10112id.intercom_user_name);
        this.timeStamp = (TextView) findViewById(C10110R.C10112id.intercom_time_stamp);
        this.summary = (TextView) findViewById(C10110R.C10112id.intercom_message_summary);
        this.unreadDot = (ImageView) findViewById(C10110R.C10112id.intercom_unread_dot);
        this.frameLayout = (FrameLayout) findViewById(C10110R.C10112id.intercom_inbox_row_layout);
    }
}
