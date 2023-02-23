package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_ComposerState extends ComposerState {
    private final boolean visible;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ComposerState(boolean z) {
        this.visible = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ComposerState) && this.visible == ((ComposerState) obj).isVisible();
    }

    public int hashCode() {
        return (this.visible ? 1231 : 1237) ^ 1000003;
    }

    @Override // io.intercom.android.sdk.models.ComposerState
    public boolean isVisible() {
        return this.visible;
    }

    public String toString() {
        return "ComposerState{visible=" + this.visible + "}";
    }
}
