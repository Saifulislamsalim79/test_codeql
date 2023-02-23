package io.intercom.android.sdk.models;

import io.intercom.android.sdk.utilities.NullSafety;
/* loaded from: classes3.dex */
public abstract class Prompt {

    /* loaded from: classes3.dex */
    public static final class Builder {
        String text;

        public Prompt build() {
            return Prompt.create(NullSafety.valueOrEmpty(this.text));
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }
    }

    public static Prompt create(String str) {
        return new AutoValue_Prompt(str);
    }

    public abstract String getPromptText();
}
