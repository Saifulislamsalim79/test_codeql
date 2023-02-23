package io.intercom.android.sdk.conversation.attribute;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import io.intercom.android.sdk.utilities.TimeFormatter;
import io.intercom.android.sdk.views.holder.ConversationListener;
import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
public class OnDateAttributeSetListener implements DatePickerDialog.OnDateSetListener {
    private final AttributeInputListener attributeInputListener;
    private final ConversationListener conversationListener;
    private final String formType;
    private final String identifier;
    private final String partId;

    public OnDateAttributeSetListener(String str, String str2, String str3, ConversationListener conversationListener, AttributeInputListener attributeInputListener) {
        this.partId = str;
        this.identifier = str2;
        this.formType = str3;
        this.conversationListener = conversationListener;
        this.attributeInputListener = attributeInputListener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        TimeZone $r4 = TimeZone.getTimeZone("UTC");
        Calendar $r5 = Calendar.getInstance($r4);
        $r5.clear();
        $r5.set(1, i);
        $r5.set(2, i2);
        $r5.set(5, i3);
        long $l3 = $r5.getTimeInMillis();
        long $l4 = $l3 / 1000;
        ConversationListener $r6 = this.conversationListener;
        String $r1 = this.partId;
        String $r2 = this.identifier;
        Long $r7 = Long.valueOf($l4);
        String $r8 = this.formType;
        $r6.onSubmitAttribute($r1, $r2, $r7, $r8);
        String $r12 = TimeFormatter.formatTimeInMillisAsDate($l3);
        AttributeInputListener $r9 = this.attributeInputListener;
        $r9.populateSelectedValue($r12);
    }
}
