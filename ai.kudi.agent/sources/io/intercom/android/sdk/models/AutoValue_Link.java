package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.models.Block;
import java.util.List;
/* loaded from: classes3.dex */
final class AutoValue_Link extends Link {
    private final List<Block> blocks;
    private final Card card;
    private final long createdAt;

    /* renamed from: id */
    private final String f23903id;
    private final ReactionReply reactionReply;
    private final long updatedAt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Link(String str, Card card, List<Block> list, ReactionReply reactionReply, long j, long j2) {
        if (str != null) {
            this.f23903id = str;
            if (card != null) {
                this.card = card;
                if (list != null) {
                    this.blocks = list;
                    if (reactionReply != null) {
                        this.reactionReply = reactionReply;
                        this.createdAt = j;
                        this.updatedAt = j2;
                        return;
                    }
                    throw new NullPointerException("Null reactionReply");
                }
                throw new NullPointerException("Null blocks");
            }
            throw new NullPointerException("Null card");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Link) {
            Link link = (Link) obj;
            return this.f23903id.equals(link.getId()) && this.card.equals(link.getCard()) && this.blocks.equals(link.getBlocks()) && this.reactionReply.equals(link.getReactionReply()) && this.createdAt == link.getCreatedAt() && this.updatedAt == link.getUpdatedAt();
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Link
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override // io.intercom.android.sdk.models.Link
    public Card getCard() {
        return this.card;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.intercom.android.sdk.models.Link
    public String getId() {
        return this.f23903id;
    }

    @Override // io.intercom.android.sdk.models.Link
    public ReactionReply getReactionReply() {
        return this.reactionReply;
    }

    @Override // io.intercom.android.sdk.models.Link
    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        long j = this.createdAt;
        long j2 = this.updatedAt;
        return ((((((((((this.f23903id.hashCode() ^ 1000003) * 1000003) ^ this.card.hashCode()) * 1000003) ^ this.blocks.hashCode()) * 1000003) ^ this.reactionReply.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Link{id=" + this.f23903id + ", card=" + this.card + ", blocks=" + this.blocks + ", reactionReply=" + this.reactionReply + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + "}";
    }
}
