package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import io.intercom.android.sdk.commons.utilities.CollectionUtils;
import io.intercom.android.sdk.utilities.NullSafety;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class Attribute implements Parcelable {
    private static final String BOOLEAN_TYPE = "boolean";
    private static final String DATE_TYPE = "date";
    private static final String FLOAT_TYPE = "float";
    private static final String INTEGER_TYPE = "integer";
    private static final String STRING_TYPE = "string";
    public static final Attribute NULL = create("", "", "", "", "");
    public static final Parcelable.Creator<Attribute> CREATOR = new Parcelable.Creator<Attribute>() { // from class: io.intercom.android.sdk.models.Attribute.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Attribute createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, String.class.getClassLoader());
            return Attribute.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Attribute[] newArray(int i) {
            return new Attribute[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        String custom_bot_control_id;
        String identifier;
        String name;
        List<String> options;
        String type;
        String value;

        public Attribute build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.options));
            List<String> list = this.options;
            if (list != null) {
                for (String str : list) {
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
            }
            return Attribute.create(NullSafety.valueOrEmpty(this.custom_bot_control_id), NullSafety.valueOrEmpty(this.identifier), NullSafety.valueOrEmpty(this.name), NullSafety.valueOrEmpty(this.type), NullSafety.valueOrEmpty(this.value), arrayList);
        }

        public Builder withCustomBotControlId(String str) {
            this.custom_bot_control_id = str;
            return this;
        }

        public Builder withIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withOptions(List<String> list) {
            this.options = list;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withValue(String str) {
            this.value = str;
            return this;
        }
    }

    static Attribute create(String str, String str2, String str3, String str4, String str5) {
        return new AutoValue_Attribute(str, str2, str3, str4, str5, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getCustomBotControlId();

    public abstract String getIdentifier();

    public abstract String getName();

    public abstract List<String> getOptions();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String getRenderType() {
        char c;
        String type = getType();
        switch (type.hashCode()) {
            case -891985903:
                if (type.equals(STRING_TYPE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3076014:
                if (type.equals("date")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 64711720:
                if (type.equals("boolean")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 97526364:
                if (type.equals("float")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1958052158:
                if (type.equals(INTEGER_TYPE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? "unknown" : "date" : "boolean" : "float" : AttributeType.NUMBER : !getOptions().isEmpty() ? AttributeType.LIST : "email".equals(getIdentifier()) ? "email" : AttributeType.PHONE.equals(getIdentifier()) ? AttributeType.PHONE : AttributeType.WEBSITE.equals(getIdentifier()) ? AttributeType.WEBSITE : AttributeType.TEXT;
    }

    public abstract String getType();

    public abstract String getValue();

    public boolean hasValue() {
        return !TextUtils.isEmpty(getValue());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getOptions());
        parcel.writeString(getCustomBotControlId());
        parcel.writeString(getIdentifier());
        parcel.writeString(getName());
        parcel.writeString(getType());
        parcel.writeString(getValue());
    }

    static Attribute create(String str, String str2, String str3, String str4, String str5, List<String> list) {
        return new AutoValue_Attribute(str, str2, str3, str4, str5, list);
    }
}
