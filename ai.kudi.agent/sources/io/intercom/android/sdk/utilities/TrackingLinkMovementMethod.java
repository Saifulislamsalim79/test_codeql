package io.intercom.android.sdk.utilities;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
/* loaded from: classes3.dex */
public class TrackingLinkMovementMethod extends LinkMovementMethod {
    private boolean longClickActive = false;
    private boolean longClickPerformed = false;
    private long startClickTime;

    private int getPosition(MotionEvent motionEvent, TextView textView) {
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = x + textView.getScrollX();
        Layout layout = textView.getLayout();
        return layout.getOffsetForHorizontal(layout.getLineForVertical(y + textView.getScrollY()), scrollX);
    }

    private void performClick(ViewGroup viewGroup) {
        while (!viewGroup.performClick() && (viewGroup.getParent() instanceof ViewGroup)) {
            viewGroup = (ViewGroup) viewGroup.getParent();
        }
    }

    private void performLongClick(ViewGroup viewGroup) {
        while (!viewGroup.performLongClick() && (viewGroup.getParent() instanceof ViewGroup)) {
            viewGroup = (ViewGroup) viewGroup.getParent();
        }
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int position = getPosition(motionEvent, textView);
        Object[] objArr = (URLSpan[]) spannable.getSpans(position, position, URLSpan.class);
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            this.startClickTime = TimeProvider.SYSTEM.currentTimeMillis();
            if (!this.longClickActive) {
                this.longClickActive = true;
            }
            if (objArr.length != 0) {
                Selection.setSelection(spannable, spannable.getSpanStart(objArr[0]), spannable.getSpanEnd(objArr[0]));
                return false;
            }
            return false;
        }
        if (action != 1) {
            if (action != 2 || !this.longClickActive) {
                return false;
            }
            if (TimeProvider.SYSTEM.currentTimeMillis() - this.startClickTime >= ViewConfiguration.getLongPressTimeout()) {
                this.longClickActive = false;
                performLongClick((ViewGroup) textView.getParent());
                this.longClickPerformed = true;
            } else {
                z = false;
            }
        } else {
            this.longClickActive = false;
            if (this.longClickPerformed) {
                z = false;
            } else if (objArr.length != 0) {
                LinkOpener.handleUrl(objArr[0].getURL(), textView.getContext(), Injector.get().getApi());
            } else {
                Selection.removeSelection(spannable);
                performClick((ViewGroup) textView.getParent());
            }
            this.longClickPerformed = false;
        }
        return z;
    }
}
