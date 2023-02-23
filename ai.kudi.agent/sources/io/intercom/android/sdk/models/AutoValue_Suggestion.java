package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_Suggestion extends Suggestion {
    private final String preAction;
    private final String text;
    private final String uuid;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Suggestion(String str, String str2, String str3) {
        if (str != null) {
            this.preAction = str;
            if (str2 != null) {
                this.text = str2;
                if (str3 != null) {
                    this.uuid = str3;
                    return;
                }
                throw new NullPointerException("Null uuid");
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null preAction");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Suggestion) {
            Suggestion suggestion = (Suggestion) obj;
            return this.preAction.equals(suggestion.getPreAction()) && this.text.equals(suggestion.getText()) && this.uuid.equals(suggestion.getUuid());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Suggestion
    public String getPreAction() {
        return this.preAction;
    }

    @Override // io.intercom.android.sdk.models.Suggestion
    public String getText() {
        return this.text;
    }

    @Override // io.intercom.android.sdk.models.Suggestion
    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return ((((this.preAction.hashCode() ^ 1000003) * 1000003) ^ this.text.hashCode()) * 1000003) ^ this.uuid.hashCode();
    }

    public String toString() {
        return "Suggestion{preAction=" + this.preAction + ", text=" + this.text + ", uuid=" + this.uuid + "}";
    }
}
