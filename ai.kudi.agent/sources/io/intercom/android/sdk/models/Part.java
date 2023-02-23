package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.intercom.input.gallery.GalleryImage;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.blocks.BlockType;
import io.intercom.android.sdk.blocks.models.Block;
import io.intercom.android.sdk.models.Attachments;
import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.EventData;
import io.intercom.android.sdk.models.Form;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class Part implements Parcelable {
    public static final String ADMIN_IS_TYPING_STYLE = "admin_is_typing_style";
    public static final String ATTRIBUTE_COLLECTOR_STYLE = "attribute_collector";
    public static final String CHAT_MESSAGE_STYLE = "chat";
    public static final String COMPOSER_SUGGESTIONS_STYLE = "composer_suggestions_style";
    public static final String DAY_DIVIDER_STYLE = "day_divider_style";
    public static final String LEGACY_ANNOUNCEMENT_STYLE = "announcement";
    public static final String LEGACY_SMALL_ANNOUNCEMENT_STYLE = "small-announcement";
    public static final String LOADING_LAYOUT = "loading_layout_style";
    public static final String NOTE_MESSAGE_STYLE = "note";
    public static final String POST_MESSAGE_STYLE = "post";
    public static final String QUICK_REPLY_STYLE = "quick_reply";
    private final List<Attachments> attachments;
    private final List<Block> blocks;
    private String clientAssignedUuid;
    private ComposerSuggestions composerSuggestions;
    private final long createdAt;
    private final DeliveryOption deliveryOption;
    private boolean displayDelivered;
    private boolean entranceAnimation;
    private final EventData eventData;
    private final Form form;

    /* renamed from: id */
    private final String f23912id;
    private final boolean isInitialMessage;
    private MessageState messageState;
    private final String messageStyle;
    private Participant participant;
    private String participantId;
    private final boolean participantIsAdmin;
    private final ReactionReply reactionReply;
    private final List<ReplyOption> replyOptions;
    private String seenByAdmin;
    private final String summary;
    private GalleryImage uploadImage;
    public static final Part NULL = new Part(new Builder());
    public static final Parcelable.Creator<Part> CREATOR = new Parcelable.Creator<Part>() { // from class: io.intercom.android.sdk.models.Part.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Part createFromParcel(Parcel parcel) {
            return new Part(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Part[] newArray(int i) {
            return new Part[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        List<Attachments.Builder> attachments;
        List<Block.Builder> body;
        String client_assigned_uuid;
        ComposerSuggestions.Builder composer_suggestions;
        long created_at;
        String delivery_option;
        EventData.Builder event_data;
        Form.Builder form;

        /* renamed from: id */
        String f23913id;
        boolean is_initial_message;
        String message_style;
        String participant_id;
        boolean participant_is_admin;
        ReactionReply.Builder reactions_reply;
        List<ReplyOption.Builder> reply_options;
        String seen_by_admin;
        String summary;

        public Part build() {
            return new Part(this);
        }

        public Builder withBlocks(List<Block.Builder> list) {
            this.body = list;
            return this;
        }

        public Builder withClientAssignedUuid(String str) {
            this.client_assigned_uuid = str;
            return this;
        }

        public Builder withComposerSuggestions(ComposerSuggestions.Builder builder) {
            this.composer_suggestions = builder;
            return this;
        }

        public Builder withCreatedAt(long j) {
            this.created_at = j;
            return this;
        }

        public Builder withForm(Form.Builder builder) {
            this.form = builder;
            return this;
        }

        public Builder withId(String str) {
            this.f23913id = str;
            return this;
        }

        public Builder withParticipantIsAdmin(boolean z) {
            this.participant_is_admin = z;
            return this;
        }

        public Builder withReplyOptions(List<ReplyOption.Builder> list) {
            this.reply_options = list;
            return this;
        }

        public Builder withStyle(String str) {
            this.message_style = str;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum DeliveryOption {
        FULL,
        SUMMARY,
        BADGE
    }

    /* loaded from: classes3.dex */
    public enum MessageState {
        SENDING,
        FAILED,
        UPLOAD_FAILED,
        NORMAL
    }

    private static DeliveryOption convertDeliveryOption(String str) {
        if (str == null) {
            return DeliveryOption.SUMMARY;
        }
        try {
            return DeliveryOption.valueOf(str.toUpperCase());
        } catch (IllegalArgumentException unused) {
            return DeliveryOption.SUMMARY;
        }
    }

    static String convertLegacyMessageStyle(String str) {
        return LEGACY_ANNOUNCEMENT_STYLE.equals(str) ? POST_MESSAGE_STYLE : LEGACY_SMALL_ANNOUNCEMENT_STYLE.equals(str) ? NOTE_MESSAGE_STYLE : ADMIN_IS_TYPING_STYLE.equals(str) ? ADMIN_IS_TYPING_STYLE : DAY_DIVIDER_STYLE.equals(str) ? DAY_DIVIDER_STYLE : LOADING_LAYOUT.equals(str) ? LOADING_LAYOUT : "quick_reply".equals(str) ? "quick_reply" : ATTRIBUTE_COLLECTOR_STYLE.equals(str) ? ATTRIBUTE_COLLECTOR_STYLE : COMPOSER_SUGGESTIONS_STYLE.equals(str) ? COMPOSER_SUGGESTIONS_STYLE : CHAT_MESSAGE_STYLE;
    }

    private static boolean nextPartFromSameParticipant(Part part, Part part2) {
        return part.getParticipantId().equals(part2.getParticipantId());
    }

    public static boolean shouldConcatenate(Part part, Part part2) {
        return (DAY_DIVIDER_STYLE.equals(part.getMessageStyle()) || part.isLinkCard() || part.isEvent().booleanValue() || part2.isEvent().booleanValue() || part2.isQuickReplyOnly().booleanValue() || Math.abs(part2.getCreatedAt() - part.getCreatedAt()) >= TimeUnit.MINUTES.toSeconds(3L) || !nextPartFromSameParticipant(part, part2) || part2.getCreatedAt() == 0) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Part) {
            return this.f23912id.equals(((Part) obj).f23912id);
        }
        return false;
    }

    public List<Attachments> getAttachments() {
        return this.attachments;
    }

    public List<Block> getBlocks() {
        return this.blocks;
    }

    public ComposerSuggestions getComposerSuggestions() {
        return this.composerSuggestions;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public DeliveryOption getDeliveryOption() {
        return this.deliveryOption;
    }

    public EventData getEventData() {
        return this.eventData;
    }

    public Form getForm() {
        return this.form;
    }

    public String getId() {
        return this.f23912id;
    }

    public Block getLinkBlock() {
        return this.blocks.get(0);
    }

    public MessageState getMessageState() {
        return this.messageState;
    }

    public String getMessageStyle() {
        return this.messageStyle;
    }

    public Participant getParticipant() {
        return this.participant;
    }

    public String getParticipantId() {
        return this.participantId;
    }

    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    public List<ReplyOption> getReplyOptions() {
        return this.replyOptions;
    }

    public String getSeenByAdmin() {
        return this.participantIsAdmin ? SeenState.HIDE : this.seenByAdmin;
    }

    public String getSummary() {
        return this.summary;
    }

    public GalleryImage getUpload() {
        return this.uploadImage;
    }

    public String getUuid() {
        return this.clientAssignedUuid;
    }

    public boolean hasAttachments() {
        return !this.attachments.isEmpty();
    }

    public boolean hasEntranceAnimation() {
        return this.entranceAnimation;
    }

    public int hashCode() {
        return this.f23912id.hashCode();
    }

    public boolean isAdmin() {
        return this.participantIsAdmin;
    }

    public boolean isDisplayDelivered() {
        return this.displayDelivered;
    }

    public Boolean isEvent() {
        return Boolean.valueOf(!this.eventData.getEventAsPlainText().isEmpty());
    }

    public boolean isGifOnlyPart() {
        return this.blocks.size() == 1 && !TextUtils.isEmpty(this.blocks.get(0).getAttribution());
    }

    public boolean isInitialMessage() {
        return this.isInitialMessage;
    }

    public boolean isLinkCard() {
        return isSingleBlockPartOfType(BlockType.LINK) && CHAT_MESSAGE_STYLE.equals(this.messageStyle);
    }

    public boolean isLinkList() {
        return isSingleBlockPartOfType(BlockType.LINKLIST) && CHAT_MESSAGE_STYLE.equals(this.messageStyle);
    }

    public boolean isMessagePart() {
        return POST_MESSAGE_STYLE.equals(this.messageStyle) || NOTE_MESSAGE_STYLE.equals(this.messageStyle) || CHAT_MESSAGE_STYLE.equals(this.messageStyle);
    }

    Boolean isQuickReplyOnly() {
        return Boolean.valueOf(this.replyOptions.size() > 0 && this.blocks.size() == 0);
    }

    public boolean isReply() {
        return !this.isInitialMessage;
    }

    public boolean isSendingPart() {
        return getMessageState().equals(MessageState.SENDING);
    }

    public boolean isSingleBlockPartOfType(BlockType blockType) {
        return this.blocks.size() == 1 && this.blocks.get(0).getType() == blockType;
    }

    public boolean isUser() {
        return !isAdmin();
    }

    public void setComposerSuggestions(ComposerSuggestions composerSuggestions) {
        this.composerSuggestions = composerSuggestions;
    }

    public void setDisplayDelivered(boolean z) {
        this.displayDelivered = z;
    }

    public void setEntranceAnimation(boolean z) {
        this.entranceAnimation = z;
    }

    public void setMessageState(MessageState messageState) {
        this.messageState = messageState;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
        this.participantId = participant.getId();
    }

    public void setSeenByAdmin(String str) {
        this.seenByAdmin = str;
    }

    public void setUpload(GalleryImage galleryImage) {
        this.uploadImage = galleryImage;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23912id);
        parcel.writeString(this.participantId);
        parcel.writeByte(this.participantIsAdmin ? (byte) 1 : (byte) 0);
        parcel.writeList(this.blocks);
        parcel.writeList(this.attachments);
        parcel.writeList(this.replyOptions);
        parcel.writeString(this.messageStyle);
        parcel.writeLong(this.createdAt);
        parcel.writeString(this.summary);
        if (ReactionReply.isNull(this.reactionReply)) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeValue(this.reactionReply);
        }
        parcel.writeString(this.seenByAdmin);
        parcel.writeValue(this.participant);
        parcel.writeValue(this.eventData);
        parcel.writeByte(this.isInitialMessage ? (byte) 1 : (byte) 0);
        parcel.writeString(this.deliveryOption.name());
        parcel.writeValue(this.form);
        parcel.writeValue(this.composerSuggestions);
    }

    public Part() {
        this(new Builder());
    }

    private Part(Builder builder) {
        String str = builder.f23913id;
        this.f23912id = str == null ? UUID.randomUUID().toString() : str;
        this.participantId = NullSafety.valueOrEmpty(builder.participant_id);
        this.participantIsAdmin = builder.participant_is_admin;
        this.summary = NullSafety.valueOrEmpty(builder.summary);
        this.createdAt = builder.created_at;
        this.messageStyle = convertLegacyMessageStyle(builder.message_style);
        this.deliveryOption = convertDeliveryOption(builder.delivery_option);
        this.blocks = new ArrayList();
        List<Block.Builder> list = builder.body;
        if (list != null) {
            for (Block.Builder builder2 : list) {
                this.blocks.add(builder2.build());
            }
        }
        ReactionReply.Builder builder3 = builder.reactions_reply;
        this.reactionReply = builder3 == null ? ReactionReply.NULL : builder3.build();
        String str2 = builder.seen_by_admin;
        this.seenByAdmin = str2 == null ? SeenState.HIDE : str2;
        this.attachments = new ArrayList();
        List<Attachments.Builder> list2 = builder.attachments;
        if (list2 != null) {
            for (Attachments.Builder builder4 : list2) {
                this.attachments.add(builder4.build());
            }
        }
        EventData.Builder builder5 = builder.event_data;
        this.eventData = builder5 == null ? EventData.NULL : builder5.build();
        this.participant = Participant.NULL;
        this.displayDelivered = false;
        this.entranceAnimation = false;
        this.isInitialMessage = builder.is_initial_message;
        this.messageState = MessageState.NORMAL;
        this.replyOptions = new ArrayList();
        List<ReplyOption.Builder> list3 = builder.reply_options;
        if (list3 != null) {
            for (ReplyOption.Builder builder6 : list3) {
                this.replyOptions.add(builder6.build());
            }
        }
        Form.Builder builder7 = builder.form;
        this.form = builder7 == null ? Form.NULL : builder7.build();
        ComposerSuggestions.Builder builder8 = builder.composer_suggestions;
        this.composerSuggestions = builder8 == null ? ComposerSuggestions.NULL : builder8.build();
        this.clientAssignedUuid = NullSafety.valueOrEmpty(builder.client_assigned_uuid);
    }

    private Part(Parcel parcel) {
        this.f23912id = parcel.readString();
        this.participantId = parcel.readString();
        this.participantIsAdmin = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        this.blocks = arrayList;
        parcel.readList(arrayList, Block.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.attachments = arrayList2;
        parcel.readList(arrayList2, Attachments.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.replyOptions = arrayList3;
        parcel.readList(arrayList3, ReplyOption.class.getClassLoader());
        this.messageStyle = parcel.readString();
        this.createdAt = parcel.readLong();
        this.summary = parcel.readString();
        if (parcel.readByte() == 0) {
            this.reactionReply = ReactionReply.NULL;
        } else {
            this.reactionReply = (ReactionReply) parcel.readValue(ReactionReply.class.getClassLoader());
        }
        this.seenByAdmin = parcel.readString();
        this.participant = (Participant) parcel.readValue(Participant.class.getClassLoader());
        this.eventData = (EventData) parcel.readValue(EventData.class.getClassLoader());
        this.isInitialMessage = parcel.readByte() != 0;
        this.deliveryOption = convertDeliveryOption(parcel.readString());
        this.form = (Form) parcel.readValue(Form.class.getClassLoader());
        this.composerSuggestions = (ComposerSuggestions) parcel.readValue(ComposerSuggestions.class.getClassLoader());
    }
}
