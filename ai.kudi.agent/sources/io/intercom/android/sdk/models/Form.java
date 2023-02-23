package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.commons.utilities.CollectionUtils;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class Form implements Parcelable {
    public static final Form NULL = create(new ArrayList(), "");
    public static final Parcelable.Creator<Form> CREATOR = new Parcelable.Creator<Form>() { // from class: io.intercom.android.sdk.models.Form.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Form createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Attribute.class.getClassLoader());
            return Form.create(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Form[] newArray(int i) {
            return new Form[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        List<Attribute.Builder> attributes;
        String type;

        public Form build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.attributes));
            List<Attribute.Builder> list = this.attributes;
            if (list != null) {
                for (Attribute.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            return Form.create(arrayList, NullSafety.valueOrEmpty(this.type));
        }

        public Builder withAttributes(List<Attribute.Builder> list) {
            this.attributes = list;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }
    }

    static Form create(List<Attribute> list, String str) {
        return new AutoValue_Form(list, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract List<Attribute> getAttributes();

    public abstract String getType();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getAttributes());
        parcel.writeString(getType());
    }
}
