package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.ComposerState;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.OperatorClientCondition;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* loaded from: classes3.dex */
public class Conversation {
    private final ComposerState composerState;
    private final List<Part> conversationParts;
    private final List<Participant> groupConversationParticipants;

    /* renamed from: id */
    private final String f23906id;
    private final String intercomLinkSolution;
    private final LastParticipatingAdmin lastParticipatingAdmin;
    private final List<OperatorClientCondition> operatorClientConditions;
    private final Map<String, Participant> participants;
    private final boolean read;
    private final boolean userParticipated;

    /* loaded from: classes3.dex */
    public static final class Builder {
        ComposerState.Builder composer_state;
        List<Part.Builder> conversation_parts;
        List<String> group_conversation_participant_ids;

        /* renamed from: id */
        String f23907id;
        String intercom_link_solution;
        LastParticipatingAdmin.Builder last_participating_admin;
        List<OperatorClientCondition.Builder> operator_client_conditions;
        List<Participant.Builder> participants;
        boolean read;
        boolean user_participated;

        public Conversation build() {
            return new Conversation(this);
        }

        public Builder withId(String str) {
            this.f23907id = str;
            return this;
        }

        public Builder withParticipants(List<Participant.Builder> list) {
            this.participants = list;
            return this;
        }

        public Builder withParts(List<Part.Builder> list) {
            this.conversation_parts = list;
            return this;
        }
    }

    public Conversation() {
        this(new Builder());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Conversation.class != obj.getClass()) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        if (this.userParticipated == conversation.userParticipated && this.read == conversation.read && this.participants.equals(conversation.participants) && this.conversationParts.equals(conversation.conversationParts) && this.groupConversationParticipants.equals(conversation.groupConversationParticipants) && this.operatorClientConditions.equals(conversation.operatorClientConditions) && this.lastParticipatingAdmin.equals(conversation.lastParticipatingAdmin) && this.composerState.equals(conversation.composerState) && this.intercomLinkSolution.equals(conversation.intercomLinkSolution)) {
            return this.f23906id.equals(conversation.f23906id);
        }
        return false;
    }

    public ComposerState getComposerState() {
        return this.composerState;
    }

    public List<Participant> getGroupConversationParticipants() {
        return this.groupConversationParticipants;
    }

    public String getId() {
        return this.f23906id;
    }

    public String getIntercomLinkSolution() {
        return this.intercomLinkSolution;
    }

    public Participant getLastAdmin() {
        ListIterator listIterator = new ArrayList(this.participants.values()).listIterator(this.participants.values().size());
        while (listIterator.hasPrevious()) {
            Participant participant = (Participant) listIterator.previous();
            if (participant.isAdmin()) {
                return participant;
            }
        }
        return Participant.NULL;
    }

    public Part getLastAdminPart() {
        for (int size = this.conversationParts.size() - 1; size >= 0; size--) {
            Part part = this.conversationParts.get(size);
            if (part.isAdmin()) {
                return part;
            }
        }
        return Part.NULL;
    }

    public Part getLastNonEventPart() {
        for (int size = this.conversationParts.size() - 1; size >= 0; size--) {
            Part part = this.conversationParts.get(size);
            if (!part.isEvent().booleanValue()) {
                return part;
            }
        }
        return Part.NULL;
    }

    public Part getLastPart() {
        if (this.conversationParts.isEmpty()) {
            return Part.NULL;
        }
        List<Part> list = this.conversationParts;
        return list.get(list.size() - 1);
    }

    public LastParticipatingAdmin getLastParticipatingAdmin() {
        return this.lastParticipatingAdmin;
    }

    public List<OperatorClientCondition> getOperatorClientConditions() {
        return this.operatorClientConditions;
    }

    public Participant getParticipant(String str) {
        Participant participant = this.participants.get(str);
        return participant == null ? Participant.NULL : participant;
    }

    public Map<String, Participant> getParticipants() {
        return this.participants;
    }

    public List<Part> getParts() {
        return this.conversationParts;
    }

    public int hashCode() {
        return (((((((((((((((((this.participants.hashCode() * 31) + this.conversationParts.hashCode()) * 31) + this.groupConversationParticipants.hashCode()) * 31) + this.operatorClientConditions.hashCode()) * 31) + this.lastParticipatingAdmin.hashCode()) * 31) + this.composerState.hashCode()) * 31) + this.f23906id.hashCode()) * 31) + (this.userParticipated ? 1 : 0)) * 31) + (this.read ? 1 : 0)) * 31) + this.intercomLinkSolution.hashCode();
    }

    public boolean isAdminReply() {
        return this.participants.size() > 1;
    }

    public boolean isRead() {
        return this.read;
    }

    public boolean isUserParticipated() {
        return this.userParticipated;
    }

    public Conversation withRead(boolean z) {
        return new Conversation(this.participants, this.conversationParts, this.groupConversationParticipants, this.operatorClientConditions, this.lastParticipatingAdmin, this.composerState, this.f23906id, this.userParticipated, z, this.intercomLinkSolution);
    }

    Conversation(Builder builder) {
        this.f23906id = NullSafety.valueOrEmpty(builder.f23907id);
        this.read = builder.read;
        this.userParticipated = builder.user_participated;
        this.participants = new LinkedHashMap();
        this.intercomLinkSolution = NullSafety.valueOrEmpty(builder.intercom_link_solution);
        List<Participant.Builder> list = builder.participants;
        if (list != null) {
            for (Participant.Builder builder2 : list) {
                Participant build = builder2.build();
                this.participants.put(build.getId(), build);
            }
        }
        this.conversationParts = new ArrayList();
        List<Part.Builder> list2 = builder.conversation_parts;
        if (list2 != null) {
            for (Part.Builder builder3 : list2) {
                Part build2 = builder3.build();
                build2.setParticipant(getParticipant(build2.getParticipantId()));
                this.conversationParts.add(build2);
            }
        }
        this.groupConversationParticipants = new ArrayList();
        List<String> list3 = builder.group_conversation_participant_ids;
        if (list3 != null) {
            for (String str : list3) {
                if (str != null) {
                    this.groupConversationParticipants.add(getParticipant(str));
                }
            }
        }
        this.operatorClientConditions = new ArrayList();
        List<OperatorClientCondition.Builder> list4 = builder.operator_client_conditions;
        if (list4 != null) {
            for (OperatorClientCondition.Builder builder4 : list4) {
                if (builder4 != null) {
                    this.operatorClientConditions.add(builder4.build());
                }
            }
        }
        LastParticipatingAdmin.Builder builder5 = builder.last_participating_admin;
        this.lastParticipatingAdmin = builder5 != null ? builder5.build() : LastParticipatingAdmin.NULL;
        ComposerState.Builder builder6 = builder.composer_state;
        this.composerState = builder6 != null ? builder6.build() : ComposerState.NULL;
    }

    private Conversation(Map<String, Participant> map, List<Part> list, List<Participant> list2, List<OperatorClientCondition> list3, LastParticipatingAdmin lastParticipatingAdmin, ComposerState composerState, String str, boolean z, boolean z2, String str2) {
        this.participants = map;
        this.conversationParts = list;
        this.groupConversationParticipants = list2;
        this.operatorClientConditions = list3;
        this.lastParticipatingAdmin = lastParticipatingAdmin;
        this.composerState = composerState;
        this.f23906id = str;
        this.userParticipated = z;
        this.read = z2;
        this.intercomLinkSolution = str2;
    }
}
