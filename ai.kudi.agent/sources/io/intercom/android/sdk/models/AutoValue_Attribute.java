package io.intercom.android.sdk.models;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AutoValue_Attribute extends Attribute {
    private final String customBotControlId;
    private final String identifier;
    private final String name;
    private final List<String> options;
    private final String type;
    private final String value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Attribute(String str, String str2, String str3, String str4, String str5, List<String> list) {
        if (str != null) {
            this.customBotControlId = str;
            if (str2 != null) {
                this.identifier = str2;
                if (str3 != null) {
                    this.name = str3;
                    if (str4 != null) {
                        this.type = str4;
                        if (str5 != null) {
                            this.value = str5;
                            if (list != null) {
                                this.options = list;
                                return;
                            }
                            throw new NullPointerException("Null options");
                        }
                        throw new NullPointerException("Null value");
                    }
                    throw new NullPointerException("Null type");
                }
                throw new NullPointerException("Null name");
            }
            throw new NullPointerException("Null identifier");
        }
        throw new NullPointerException("Null customBotControlId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Attribute) {
            Attribute attribute = (Attribute) obj;
            return this.customBotControlId.equals(attribute.getCustomBotControlId()) && this.identifier.equals(attribute.getIdentifier()) && this.name.equals(attribute.getName()) && this.type.equals(attribute.getType()) && this.value.equals(attribute.getValue()) && this.options.equals(attribute.getOptions());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Attribute
    public String getCustomBotControlId() {
        return this.customBotControlId;
    }

    @Override // io.intercom.android.sdk.models.Attribute
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.intercom.android.sdk.models.Attribute
    public String getName() {
        return this.name;
    }

    @Override // io.intercom.android.sdk.models.Attribute
    public List<String> getOptions() {
        return this.options;
    }

    @Override // io.intercom.android.sdk.models.Attribute
    public String getType() {
        return this.type;
    }

    @Override // io.intercom.android.sdk.models.Attribute
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return ((((((((((this.customBotControlId.hashCode() ^ 1000003) * 1000003) ^ this.identifier.hashCode()) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.value.hashCode()) * 1000003) ^ this.options.hashCode();
    }

    public String toString() {
        return "Attribute{customBotControlId=" + this.customBotControlId + ", identifier=" + this.identifier + ", name=" + this.name + ", type=" + this.type + ", value=" + this.value + ", options=" + this.options + "}";
    }
}
