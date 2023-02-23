package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.commons.utilities.CollectionUtils;
import io.intercom.android.sdk.models.Prompt;
import io.intercom.android.sdk.models.Suggestion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class ComposerSuggestions implements Parcelable {
    public static final ComposerSuggestions NULL = create("", Collections.emptyList());
    public static final Parcelable.Creator<ComposerSuggestions> CREATOR = new Parcelable.Creator<ComposerSuggestions>() { // from class: io.intercom.android.sdk.models.ComposerSuggestions.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ComposerSuggestions createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Suggestion.class.getClassLoader());
            return ComposerSuggestions.create(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ComposerSuggestions[] newArray(int i) {
            return new ComposerSuggestions[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        List<Prompt.Builder> prompt;
        List<Suggestion.Builder> suggestions;

        public ComposerSuggestions build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.prompt));
            ArrayList arrayList2 = new ArrayList(CollectionUtils.capacityFor(this.suggestions));
            List<Prompt.Builder> list = this.prompt;
            if (list != null) {
                for (Prompt.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            List<Suggestion.Builder> list2 = this.suggestions;
            if (list2 != null) {
                for (Suggestion.Builder builder2 : list2) {
                    if (builder2 != null) {
                        arrayList2.add(builder2.build());
                    }
                }
            }
            return ComposerSuggestions.create(arrayList.isEmpty() ? "" : ((Prompt) arrayList.get(0)).getPromptText(), arrayList2);
        }

        public Builder withPrompts(List<Prompt.Builder> list) {
            this.prompt = list;
            return this;
        }

        public Builder withSuggestions(List<Suggestion.Builder> list) {
            this.suggestions = list;
            return this;
        }
    }

    public static ComposerSuggestions create(String str, List<Suggestion> list) {
        return new AutoValue_ComposerSuggestions(str, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getPrompt();

    public abstract List<Suggestion> getSuggestions();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPrompt());
        parcel.writeList(getSuggestions());
    }
}
