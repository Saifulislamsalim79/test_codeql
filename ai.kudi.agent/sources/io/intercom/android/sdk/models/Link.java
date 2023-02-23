package io.intercom.android.sdk.models;

import io.intercom.android.sdk.blocks.models.Author;
import io.intercom.android.sdk.blocks.models.Block;
import io.intercom.android.sdk.commons.utilities.CollectionUtils;
import io.intercom.android.sdk.models.Card;
import io.intercom.android.sdk.models.ReactionReply;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* loaded from: classes3.dex */
public abstract class Link {
    public static final String ARTICLE_TYPE = "educate.article";
    public static final String HELP_CENTER_TYPE = "educate.help_center";
    public static final String SUGGESTION_TYPE = "educate.suggestion";

    /* loaded from: classes3.dex */
    public static final class Builder {
        List<Block.Builder> blocks;
        Card.Builder card;
        long created_at;

        /* renamed from: id */
        String f23910id;
        ReactionReply.Builder reactions_reply;
        long updated_at;

        public Link build() {
            String str = this.f23910id;
            if (str == null) {
                str = UUID.randomUUID().toString();
            }
            String str2 = str;
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.blocks));
            List<Block.Builder> list = this.blocks;
            if (list != null) {
                for (Block.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            ReactionReply.Builder builder2 = this.reactions_reply;
            ReactionReply build = builder2 == null ? ReactionReply.NULL : builder2.build();
            Card.Builder builder3 = this.card;
            if (builder3 == null) {
                builder3 = new Card.Builder();
            }
            return new AutoValue_Link(str2, builder3.build(), arrayList, build, this.created_at, this.updated_at);
        }
    }

    public Author getAuthor() {
        return getCard().getAuthor();
    }

    public abstract List<Block> getBlocks();

    public abstract Card getCard();

    public abstract long getCreatedAt();

    public String getDescription() {
        return getCard().getDescription();
    }

    public abstract String getId();

    public abstract ReactionReply getReactionReply();

    public String getText() {
        return getCard().getText();
    }

    public String getTitle() {
        return getCard().getTitle();
    }

    public String getType() {
        return getCard().getType();
    }

    public abstract long getUpdatedAt();
}
