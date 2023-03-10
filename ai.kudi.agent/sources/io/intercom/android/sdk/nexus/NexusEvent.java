package io.intercom.android.sdk.nexus;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class NexusEvent {
    static final String ADMIN_AVATAR = "adminAvatar";
    static final String ADMIN_ID = "adminId";
    static final String ADMIN_NAME = "adminName";
    static final String ADMIN_TIMESTAMP = "adminTimestamp";
    static final String ASSIGNEE_ID = "assigneeId";
    static final String CONVERSATION_ID = "conversationId";
    static final String EVENT_DATA = "eventData";
    static final String EVENT_GUID = "eventGuid";
    static final String EVENT_NAME = "eventName";
    static final String NX_FROM_USER = "nx.FromUser";
    static final String NX_TOPICS = "nx.Topics";
    static final String NX_TO_USER = "nx.ToUser";
    static final String TOPIC_PREFIX_CONVERSATION = "conversation/";
    private final EventData eventData;
    private final NexusEventType eventType;
    private final String guid;
    private final List<String> topics;
    private final String userId;

    /* loaded from: classes3.dex */
    static class Builder {
        EventData eventData;
        final NexusEventType eventName;
        List<String> topics;
        String userId;

        Builder(NexusEventType nexusEventType) {
            this.eventName = nexusEventType;
        }

        public NexusEvent build() {
            return new NexusEvent(this);
        }

        public Builder withEventData(EventData eventData) {
            this.eventData = eventData;
            return this;
        }

        public Builder withTopics(List<String> list) {
            this.topics = list;
            return this;
        }

        public Builder withUserId(String str) {
            this.userId = str;
            return this;
        }
    }

    public NexusEvent(Builder builder) {
        this.eventType = builder.eventName;
        this.eventData = new EventData();
        EventData eventData = builder.eventData;
        if (eventData != null) {
            for (String str : eventData.keySet()) {
                Object obj = builder.eventData.get(str);
                if (obj != null) {
                    this.eventData.put(str, obj);
                }
            }
        }
        this.topics = new ArrayList();
        List<String> list = builder.topics;
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    this.topics.add(str2);
                }
            }
        }
        this.guid = UUID.randomUUID().toString();
        String str3 = builder.userId;
        this.userId = str3 == null ? "" : str3;
    }

    private static List<String> conversationTopics(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "new";
        }
        return Collections.singletonList(TOPIC_PREFIX_CONVERSATION + str);
    }

    public static NexusEvent getAdminIsTypingEvent(String str, String str2, String str3, String str4, String str5) {
        EventData eventData = new EventData(4);
        eventData.put(CONVERSATION_ID, str);
        eventData.put(ADMIN_ID, str2);
        eventData.put(ADMIN_NAME, str3);
        eventData.put(ADMIN_AVATAR, str4);
        return new Builder(NexusEventType.AdminIsTyping).withEventData(eventData).withUserId(str5).withTopics(conversationTopics(str)).build();
    }

    public static NexusEvent getAdminIsTypingNoteEvent(String str, String str2, String str3, String str4, String str5) {
        EventData eventData = new EventData(4);
        eventData.put(ADMIN_ID, str2);
        eventData.put(CONVERSATION_ID, str);
        eventData.put(ADMIN_NAME, str3);
        eventData.put(ADMIN_AVATAR, str4);
        return new Builder(NexusEventType.AdminIsTypingANote).withEventData(eventData).withTopics(conversationTopics(str)).withUserId(str5).build();
    }

    public static NexusEvent getConversationAssignedEvent(String str, String str2, String str3) {
        EventData eventData = new EventData(3);
        eventData.put(ADMIN_ID, str2);
        eventData.put(CONVERSATION_ID, str);
        eventData.put(ASSIGNEE_ID, str3);
        return new Builder(NexusEventType.ConversationAssigned).withEventData(eventData).build();
    }

    public static NexusEvent getConversationClosedEvent(String str, String str2) {
        EventData eventData = new EventData(2);
        eventData.put(ADMIN_ID, str2);
        eventData.put(CONVERSATION_ID, str);
        return new Builder(NexusEventType.ConversationClosed).withEventData(eventData).build();
    }

    public static NexusEvent getConversationReopenedEvent(String str, String str2) {
        EventData eventData = new EventData(2);
        eventData.put(ADMIN_ID, str2);
        eventData.put(CONVERSATION_ID, str);
        return new Builder(NexusEventType.ConversationReopened).withEventData(eventData).build();
    }

    public static NexusEvent getConversationSeenAdminEvent(String str, String str2) {
        EventData eventData = new EventData(1);
        eventData.put(CONVERSATION_ID, str);
        return new Builder(NexusEventType.UserContentSeenByAdmin).withEventData(eventData).withTopics(conversationTopics(str)).withUserId(str2).build();
    }

    public static NexusEvent getConversationSeenEvent(String str, String str2) {
        EventData eventData = new EventData(1);
        eventData.put(CONVERSATION_ID, str);
        return new Builder(NexusEventType.ConversationSeen).withEventData(eventData).withTopics(conversationTopics(str)).withUserId(str2).build();
    }

    public static NexusEvent getNewCommentEvent(String str, String str2) {
        EventData eventData = new EventData(1);
        eventData.put(CONVERSATION_ID, str);
        return new Builder(NexusEventType.NewComment).withEventData(eventData).withTopics(conversationTopics(str)).withUserId(str2).build();
    }

    public static NexusEvent getNewNoteEvent(String str, String str2) {
        EventData eventData = new EventData(2);
        eventData.put(ADMIN_ID, str2);
        eventData.put(CONVERSATION_ID, str);
        return new Builder(NexusEventType.NewNote).withEventData(eventData).build();
    }

    public static NexusEvent getSubscribeEvent(List<String> list) {
        return new Builder(NexusEventType.Subscribe).withTopics(list).build();
    }

    public static NexusEvent getUnsubscribeEvent(List<String> list) {
        return new Builder(NexusEventType.Unsubscribe).withTopics(list).build();
    }

    public static NexusEvent getUserIsTypingEvent(String str, String str2) {
        EventData eventData = new EventData(1);
        eventData.put(CONVERSATION_ID, str);
        return new Builder(NexusEventType.UserIsTyping).withEventData(eventData).withTopics(conversationTopics(str)).withUserId(str2).build();
    }

    public static NexusEvent getUserPresenceEvent() {
        return new Builder(NexusEventType.UserPresence).build();
    }

    public EventData getEventData() {
        return this.eventData;
    }

    public NexusEventType getEventType() {
        return this.eventType;
    }

    public String getGuid() {
        return this.guid;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    public String getUserId() {
        return this.userId;
    }

    public String toStringEncodedJsonObject() {
        return this.eventType.toStringEncodedJsonObject(this);
    }

    public NexusEvent(JSONObject jSONObject) {
        this.eventType = NexusEventType.safeValueOf(jSONObject.optString(EVENT_NAME));
        JSONObject optJSONObject = jSONObject.optJSONObject(EVENT_DATA);
        if (optJSONObject != null && optJSONObject.length() > 0) {
            this.eventData = new EventData(optJSONObject.length());
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject.opt(next);
                if (opt != null) {
                    this.eventData.put(next, opt);
                }
            }
        } else {
            this.eventData = new EventData();
        }
        this.topics = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(NX_TOPICS);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.topics.add(optString);
                }
            }
        }
        this.guid = jSONObject.optString(EVENT_GUID);
        if (jSONObject.has(NX_TO_USER)) {
            this.userId = jSONObject.optString(NX_TO_USER);
        } else {
            this.userId = jSONObject.optString(NX_FROM_USER);
        }
    }
}
