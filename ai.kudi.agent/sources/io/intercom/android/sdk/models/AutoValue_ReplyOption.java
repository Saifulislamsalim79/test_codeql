package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_ReplyOption extends ReplyOption {
    private final String text;
    private final String uuid;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ReplyOption(String str, String str2) {
        if (str != null) {
            this.text = str;
            if (str2 != null) {
                this.uuid = str2;
                return;
            }
            throw new NullPointerException("Null uuid");
        }
        throw new NullPointerException("Null text");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReplyOption) {
            ReplyOption replyOption = (ReplyOption) obj;
            return this.text.equals(replyOption.text()) && this.uuid.equals(replyOption.uuid());
        }
        return false;
    }

    public int hashCode() {
        return ((this.text.hashCode() ^ 1000003) * 1000003) ^ this.uuid.hashCode();
    }

    @Override // io.intercom.android.sdk.models.ReplyOption
    public String text() {
        return this.text;
    }

    public String toString() {
        return "ReplyOption{text=" + this.text + ", uuid=" + this.uuid + "}";
    }

    @Override // io.intercom.android.sdk.models.ReplyOption
    public String uuid() {
        return this.uuid;
    }
}
