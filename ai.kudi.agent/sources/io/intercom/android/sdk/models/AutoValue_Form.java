package io.intercom.android.sdk.models;

import java.util.List;
/* loaded from: classes3.dex */
final class AutoValue_Form extends Form {
    private final List<Attribute> attributes;
    private final String type;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Form(List<Attribute> list, String str) {
        if (list != null) {
            this.attributes = list;
            if (str != null) {
                this.type = str;
                return;
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null attributes");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Form) {
            Form form = (Form) obj;
            return this.attributes.equals(form.getAttributes()) && this.type.equals(form.getType());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Form
    public List<Attribute> getAttributes() {
        return this.attributes;
    }

    @Override // io.intercom.android.sdk.models.Form
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((this.attributes.hashCode() ^ 1000003) * 1000003) ^ this.type.hashCode();
    }

    public String toString() {
        return "Form{attributes=" + this.attributes + ", type=" + this.type + "}";
    }
}
