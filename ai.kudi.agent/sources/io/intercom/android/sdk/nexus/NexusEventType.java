package io.intercom.android.sdk.nexus;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public enum NexusEventType {
    NewComment { // from class: io.intercom.android.sdk.nexus.NexusEventType.1
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    },
    ConversationSeen { // from class: io.intercom.android.sdk.nexus.NexusEventType.2
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.FromUser", nexusEvent.getUserId());
            return jsonObject;
        }
    },
    UserIsTyping { // from class: io.intercom.android.sdk.nexus.NexusEventType.3
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.FromUser", nexusEvent.getUserId());
            return jsonObject;
        }
    },
    AdminIsTyping { // from class: io.intercom.android.sdk.nexus.NexusEventType.4
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject optJSONObject = jsonObject.optJSONObject("eventData");
            optJSONObject.put("adminName", nexusEvent.getEventData().optString("adminName"));
            optJSONObject.put("adminId", nexusEvent.getEventData().optString("adminId"));
            optJSONObject.put("adminAvatar", nexusEvent.getEventData().optString("adminAvatar"));
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    },
    AdminIsTypingANote { // from class: io.intercom.android.sdk.nexus.NexusEventType.5
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject optJSONObject = jsonObject.optJSONObject("eventData");
            optJSONObject.put("adminName", nexusEvent.getEventData().optString("adminName"));
            optJSONObject.put("adminId", nexusEvent.getEventData().optString("adminId"));
            optJSONObject.put("adminAvatar", nexusEvent.getEventData().optString("adminAvatar"));
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    },
    NewNote { // from class: io.intercom.android.sdk.nexus.NexusEventType.6
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.optJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    },
    ConversationAssigned { // from class: io.intercom.android.sdk.nexus.NexusEventType.7
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject optJSONObject = jsonObject.optJSONObject("eventData");
            optJSONObject.put("adminId", nexusEvent.getEventData().optString("adminId"));
            optJSONObject.put("assigneeId", nexusEvent.getEventData().optString("assigneeId"));
            return jsonObject;
        }
    },
    ConversationClosed { // from class: io.intercom.android.sdk.nexus.NexusEventType.8
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.optJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    },
    ConversationReopened { // from class: io.intercom.android.sdk.nexus.NexusEventType.9
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.getJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    },
    UserPresence { // from class: io.intercom.android.sdk.nexus.NexusEventType.10
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("eventGuid", UUID.randomUUID().toString());
            jSONObject.put("eventName", "nx." + name());
            jSONObject.put("eventData", jSONObject2);
            return jSONObject;
        }
    },
    UserContentSeenByAdmin { // from class: io.intercom.android.sdk.nexus.NexusEventType.11
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    },
    Subscribe { // from class: io.intercom.android.sdk.nexus.NexusEventType.12
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("eventName", "nx." + name());
            return jsonObject;
        }
    },
    Unsubscribe { // from class: io.intercom.android.sdk.nexus.NexusEventType.13
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("eventName", "nx." + name());
            return jsonObject;
        }
    },
    ThreadAssigned { // from class: io.intercom.android.sdk.nexus.NexusEventType.14
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            JSONObject optJSONObject = jsonObject.optJSONObject("eventData");
            optJSONObject.put("adminId", nexusEvent.getEventData().optString("adminId"));
            optJSONObject.put("assigneeId", nexusEvent.getEventData().optString("assigneeId"));
            return jsonObject;
        }
    },
    ThreadClosed { // from class: io.intercom.android.sdk.nexus.NexusEventType.15
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.optJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    },
    ThreadReopened { // from class: io.intercom.android.sdk.nexus.NexusEventType.16
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.getJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    },
    ThreadUpdated { // from class: io.intercom.android.sdk.nexus.NexusEventType.17
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.getJSONObject("eventData").put("adminId", nexusEvent.getEventData().optString("adminId"));
            return jsonObject;
        }
    },
    ThreadCreated { // from class: io.intercom.android.sdk.nexus.NexusEventType.18
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
            JSONObject jsonObject = super.toJsonObject(nexusEvent);
            jsonObject.put("nx.ToUser", nexusEvent.getUserId());
            return jsonObject;
        }
    },
    UNKNOWN { // from class: io.intercom.android.sdk.nexus.NexusEventType.19
        @Override // io.intercom.android.sdk.nexus.NexusEventType
        protected String toStringEncodedJsonObject(NexusEvent nexusEvent) {
            return "";
        }
    };

    public static NexusEventType safeValueOf(String str) {
        try {
            return valueOf(str);
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    protected JSONObject toJsonObject(NexusEvent nexusEvent) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("conversationId", nexusEvent.getEventData().optString("conversationId"));
        jSONObject.put("eventGuid", nexusEvent.getGuid());
        jSONObject.put("eventName", name());
        jSONObject.put("eventData", jSONObject2);
        List<String> topics = nexusEvent.getTopics();
        if (!topics.isEmpty()) {
            jSONObject.put("nx.Topics", new JSONArray((Collection) topics));
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String toStringEncodedJsonObject(NexusEvent nexusEvent) {
        try {
            return toJsonObject(nexusEvent).toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
