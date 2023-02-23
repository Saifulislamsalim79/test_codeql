package io.intercom.android.sdk.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
/* loaded from: classes3.dex */
public class OfficeHoursTextView extends AppCompatTextView {
    public OfficeHoursTextView(Context context) {
        super(context);
    }

    public void setOfficeHoursDrawable(int i) {
        Drawable m36322f = C1335a.m36322f(getContext(), C10110R.C10111drawable.intercom_snooze);
        m36322f.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        setCompoundDrawablesWithIntrinsicBounds(m36322f, (Drawable) null, (Drawable) null, (Drawable) null);
        setCompoundDrawablePadding(getContext().getResources().getDimensionPixelSize(C10110R.dimen.intercom_office_hours_drawable_padding));
    }

    public OfficeHoursTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
