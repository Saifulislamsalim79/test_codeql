package io.intercom.android.sdk.models;

import java.util.List;
/* loaded from: classes3.dex */
final class AutoValue_ComposerSuggestions extends ComposerSuggestions {
    private final String prompt;
    private final List<Suggestion> suggestions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ComposerSuggestions(String str, List<Suggestion> list) {
        if (str != null) {
            this.prompt = str;
            if (list != null) {
                this.suggestions = list;
                return;
            }
            throw new NullPointerException("Null suggestions");
        }
        throw new NullPointerException("Null prompt");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComposerSuggestions) {
            ComposerSuggestions composerSuggestions = (ComposerSuggestions) obj;
            return this.prompt.equals(composerSuggestions.getPrompt()) && this.suggestions.equals(composerSuggestions.getSuggestions());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.ComposerSuggestions
    public String getPrompt() {
        return this.prompt;
    }

    @Override // io.intercom.android.sdk.models.ComposerSuggestions
    public List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        return ((this.prompt.hashCode() ^ 1000003) * 1000003) ^ this.suggestions.hashCode();
    }

    public String toString() {
        return "ComposerSuggestions{prompt=" + this.prompt + ", suggestions=" + this.suggestions + "}";
    }
}
