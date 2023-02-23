package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.ComposerSuggestions;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.UsersResponse;
/* loaded from: classes3.dex */
public class UpdateUserResponse extends UsersResponse {
    private final ComposerSuggestions composerSuggestions;
    private final TeamPresence teamPresence;

    UpdateUserResponse(Builder builder) {
        super(builder);
        TeamPresence build;
        ComposerSuggestions build2;
        TeamPresence.Builder builder2 = builder.team_presence;
        if (builder2 == null) {
            build = new TeamPresence.Builder().build();
        } else {
            build = builder2.build();
        }
        this.teamPresence = build;
        ComposerSuggestions.Builder builder3 = builder.composer_suggestions;
        if (builder3 == null) {
            build2 = new ComposerSuggestions.Builder().build();
        } else {
            build2 = builder3.build();
        }
        this.composerSuggestions = build2;
    }

    public ComposerSuggestions getComposerSuggestions() {
        return this.composerSuggestions;
    }

    public TeamPresence getTeamPresence() {
        return this.teamPresence;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends UsersResponse.Builder {
        ComposerSuggestions.Builder composer_suggestions;
        TeamPresence.Builder team_presence;

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public UpdateUserResponse build() {
            return new UpdateUserResponse(this);
        }
    }
}
