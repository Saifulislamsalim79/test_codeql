package io.intercom.android.sdk.utilities;

import android.content.Context;
import io.intercom.android.sdk.C10110R;
/* loaded from: classes3.dex */
public class GroupConversationTextFormatter {
    public static CharSequence groupConversationTitle(String str, int i, Context context) {
        if (i == 1) {
            return Phrase.from(context, C10110R.string.intercom_name_and_1_other).put("name", str).format();
        }
        return i > 1 ? Phrase.from(context, C10110R.string.intercom_name_and_x_others).put("name", str).put("count", i).format() : str;
    }
}
