package io.intercom.android.sdk.views;

import android.content.res.Resources;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.TimeFormatter;
/* loaded from: classes3.dex */
public class PartMetadataFormatter {
    private final TimeFormatter timeFormatter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.views.PartMetadataFormatter$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104631 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$models$Part$MessageState;

        static {
            int[] iArr = new int[Part.MessageState.values().length];
            $SwitchMap$io$intercom$android$sdk$models$Part$MessageState = iArr;
            try {
                iArr[Part.MessageState.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$models$Part$MessageState[Part.MessageState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$models$Part$MessageState[Part.MessageState.UPLOAD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$models$Part$MessageState[Part.MessageState.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PartMetadataFormatter(TimeFormatter timeFormatter) {
        this.timeFormatter = timeFormatter;
    }

    private String formatLastPart(Part part, Resources resources) {
        StringBuilder sb = new StringBuilder();
        if (part.isDisplayDelivered()) {
            sb.append(resources.getString(C10110R.string.intercom_delivered));
        } else {
            sb.append(this.timeFormatter.getFormattedTime(part.getCreatedAt()));
        }
        if (SeenState.SEEN.equalsIgnoreCase(part.getSeenByAdmin())) {
            sb.append(". ");
            sb.append(resources.getString(C10110R.string.intercom_message_seen));
        } else if (SeenState.UNSEEN.equalsIgnoreCase(part.getSeenByAdmin())) {
            sb.append(". ");
            sb.append(resources.getString(C10110R.string.intercom_message_unseen));
        }
        return sb.toString();
    }

    private String formatPart(Part part) {
        return part.isDisplayDelivered() ? "" : this.timeFormatter.getAbsoluteTime(part.getCreatedAt());
    }

    public String getMetadataString(Part part, boolean z, Resources resources) {
        int i = C104631.$SwitchMap$io$intercom$android$sdk$models$Part$MessageState[part.getMessageState().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return resources.getString(C10110R.string.intercom_message_failed_try_again);
            }
            if (z) {
                return formatLastPart(part, resources);
            }
            return formatPart(part);
        }
        return resources.getString(C10110R.string.intercom_message_state_sending);
    }
}
