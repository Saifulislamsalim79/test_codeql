package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_Prompt extends Prompt {
    private final String promptText;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Prompt(String str) {
        if (str != null) {
            this.promptText = str;
            return;
        }
        throw new NullPointerException("Null promptText");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Prompt) {
            return this.promptText.equals(((Prompt) obj).getPromptText());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Prompt
    public String getPromptText() {
        return this.promptText;
    }

    public int hashCode() {
        return this.promptText.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Prompt{promptText=" + this.promptText + "}";
    }
}
