package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Link;
/* loaded from: classes3.dex */
public class LinkResponse extends BaseResponse {
    private final Link link;

    /* loaded from: classes3.dex */
    public static final class Builder extends BaseResponse.Builder {
        Link.Builder article;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public LinkResponse build() {
            return new LinkResponse(this);
        }
    }

    LinkResponse(Builder builder) {
        super(builder);
        Link build;
        Link.Builder builder2 = builder.article;
        if (builder2 == null) {
            build = new Link.Builder().build();
        } else {
            build = builder2.build();
        }
        this.link = build;
    }

    public Link getLink() {
        return this.link;
    }
}
