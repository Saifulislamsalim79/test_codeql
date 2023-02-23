package io.intercom.android.sdk.views;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.DialogInterfaceC0936d;
import io.intercom.android.sdk.conversation.attribute.AttributeInputListener;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.views.holder.ConversationListener;
import java.util.List;
/* loaded from: classes3.dex */
public class ListAttributeSelectorDialogBuilder extends DialogInterfaceC0936d.C0937a {
    public ListAttributeSelectorDialogBuilder(Context context, String str, Attribute attribute, ConversationListener conversationListener, AttributeInputListener attributeInputListener) {
        super(context);
        setupDialog(attribute, str, conversationListener, attributeInputListener);
    }

    private void setupDialog(final Attribute attribute, final String str, final ConversationListener conversationListener, final AttributeInputListener attributeInputListener) {
        final List<String> options = attribute.getOptions();
        final String identifier = attribute.getIdentifier();
        setSingleChoiceItems((String[]) options.toArray(new String[0]), 0, (DialogInterface.OnClickListener) null);
        setTitle(attribute.getName());
        setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.views.ListAttributeSelectorDialogBuilder.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String str2 = (String) options.get(((DialogInterfaceC0936d) dialogInterface).m37785b().getCheckedItemPosition());
                conversationListener.onSubmitAttribute(str, identifier, str2, attribute.getType());
                attributeInputListener.populateSelectedValue(str2);
            }
        });
        setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        setCancelable(false);
    }
}
