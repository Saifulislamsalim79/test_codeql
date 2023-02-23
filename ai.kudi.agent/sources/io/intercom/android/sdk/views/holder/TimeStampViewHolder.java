package io.intercom.android.sdk.views.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.TimeFormatter;
/* loaded from: classes3.dex */
public class TimeStampViewHolder extends RecyclerView.AbstractC1620e0 implements ConversationPartViewHolder {
    private final TimeFormatter timeFormatter;

    public TimeStampViewHolder(View view, TimeFormatter timeFormatter) {
        super(view);
        this.timeFormatter = timeFormatter;
    }

    @Override // io.intercom.android.sdk.views.holder.ConversationPartViewHolder
    public void bind(Part part, ViewGroup viewGroup) {
        ((TextView) this.itemView).setText(this.timeFormatter.getAbsoluteDate(part.getCreatedAt()));
    }
}
